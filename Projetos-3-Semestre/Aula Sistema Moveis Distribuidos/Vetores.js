let days = ["Sun", "Mon", "Tue", "Wed","Thu", "Fri", "Sat"];

console.log(days[0]);
console.log(days[2]);
console.log(days[5]);

days[0] = "Sunday";
console.log(days[0]);

let emptyArray = [];
console.log(emptyArray[0]);

console.log("1" == 1);
console.log("1" === 1);

let valor = 1;
console.log(valor == 1);
console.log(valor === 1);

let aux = "1";
console.log(aux == 1);
console.log(aux === 1);

valor = "2";
console.log(aux != 1);
console.log(aux !== 1);


let test = {
    nr: 10,
    b: false,
    str: "uno dos tres",
    arr: [10, 20, 30],
    obj: {
        x: 10,
        y: 20
    },
    fn: function(arg){
        console.log(arg)
    }
};

test.fn(123);
console.log(test.obj.x);
test.obj.y = 40;

let point = {
    x: 0,
    y: 0,
    moveHorizontally: function(distance){
        this.x = this.x + distance;
    },
    moveVertically: function(distance){
        this.y = this.y + distance;
    }
}

console.log(point.x);
point.moveHorizontally(30);
console.log(point.x);
point.moveVertically(40);
console.log(point.y);