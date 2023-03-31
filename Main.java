// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.printf("\n");

        Carro[] carros = new Carro[5];

        carros[0] = new Carro("Volkswagem", "Golf", "50.000", true);
        System.out.printf("Carro 1\n");
        System.out.println("Fabricante: "+ carros[0].getFabricante());
        System.out.println("Modelo: "+ carros[0].getModelo());
        System.out.println("Preco: "+ carros[0].getPreco());
        System.out.println("Ligado: "+ carros[0].getLigado());
        carros[0].ligar();
        System.out.println("\n");

        carros[1] = new Carro("Fiat", "Argo", "75.000", Boolean.TRUE);
        System.out.printf("Carro 2\n");
        System.out.println("Fabricante: "+ carros[1].getFabricante());
        System.out.println("Modelo: "+ carros[1].getModelo());
        System.out.println("Preco: "+ carros[1].getPreco());
        System.out.println("Ligado: "+ carros[1].getLigado());
        carros[1].ligar();
        System.out.println("\n");

        carros[2] = new Carro("Ford", "Fiesta", "42.000", Boolean.FALSE);
        System.out.printf("Carro 3\n");
        System.out.println("Fabricante: "+ carros[2].getFabricante());
        System.out.println("Modelo: "+ carros[2].getModelo());
        System.out.println("Preco: "+ carros[2].getPreco());
        System.out.println("Ligado: "+ carros[2].getLigado());
        carros[2].ligar();
        System.out.println("\n");

        carros[3] = new Carro("Chevrolet", "Cruze", "125.000", Boolean.TRUE);
        System.out.printf("Carro 4\n");
        System.out.println("Fabricante: "+ carros[3].getFabricante());
        System.out.println("Modelo: "+ carros[3].getModelo());
        System.out.println("Preco: "+ carros[3].getPreco());
        System.out.println("Ligado: "+ carros[3].getLigado());
        carros[3].ligar();
        System.out.println("\n");

        carros[4] = new Carro("Renault", "Kwid", "60.000", Boolean.TRUE);
        System.out.printf("Carro 5\n");
        System.out.println("Fabricante: "+ carros[4].getFabricante());
        System.out.println("Modelo: "+ carros[4].getModelo());
        System.out.println("Preco: "+ carros[4].getPreco());
        System.out.println("Ligado: "+ carros[4].getLigado());
        carros[4].ligar();
    }
}

