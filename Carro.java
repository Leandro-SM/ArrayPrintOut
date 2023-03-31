public class Carro {
    public String fabricante;
    public String Modelo;
    public String Preco;
    public Boolean Ligado;

    Carro(String fabricante, String Modelo, String Preco, Boolean Ligado) {
        this.fabricante = fabricante;
        this.Modelo = Modelo;
        this.Preco = Preco;
        this.Ligado = Ligado;
    }

    public String getFabricante(){
        return fabricante;
}
    public String getModelo(){
        return Modelo;
    }
    public String getPreco(){
        return Preco;
    }

    public boolean getLigado(){
        return Ligado;
    }


    public void ligar(){

        if (Ligado == true){
            System.out.println("O carro está ligado");
        }
        else {
            System.out.println("O carro está desligado");
        }
}
    public void desligar() {
        System.out.println("O carro está desligado");
        //Ligado == False aqui
    }
    public void acelerar() {
        System.out.println("O carro está acelerando");
        //Carro(modelo) acelerando aqui
    }
    public void freiar() {
        System.out.println("O carro está freiando");
    }

}
