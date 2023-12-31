package br.com.carsoft.dao;

import br.com.carsoft.model.Car;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarDao {

    public void createCar(Car car){
        String SQL = "INSERT INTO CAR (NAME) VALUES (?)";

        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setString(1, car.getName());
            preparedStatement.execute();

            connection.close();

            System.out.println("sucess in connection");

        } catch (Exception e) {
            System.out.println("fail in connection");
        }
    }

    public List<Car> findAllCars(){
        String SQL = "SELECT * FROM CAR";

        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");

            System.out.println("success in database connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            ResultSet resultSet = preparedStatement.executeQuery();

            List<Car> cars = new ArrayList<>();

            while (resultSet.next()) {
                String carId = resultSet.getString("id");
                String carName = resultSet.getString("name");

                Car car = new Car(carId, carName);

                cars.add(car);
            }


            System.out.println("sucess in select * car");

            connection.close();

            return cars;
        } catch (Exception e){
            System.out.println("fail in databese connection");

            return Collections.emptyList();
        }
    }

    public void deleteCarById(String carId) {

        String SQL = "DELETE CAR WHERE ID = ?";

        try {

            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");

            System.out.println("success in database connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1, carId);
            preparedStatement.execute();

            System.out.println("success on delete car with id: " + carId);

            connection.close();

        } catch (Exception e) {

            System.out.println("fail in database connection");

        }
    }

}

