package P1;

public enum Compactadores implements Compactador{
    
    ZipCompactador{
        @Override
        public void Compactador(String arq){
            System.out.println("Arquivo compactado em Zip.");
        }
    },

    RarCompactador{
        @Override
        public void Compactador(String arq){
            System.out.println("Arquivo compactado em Zip.");
        }
    };
}
