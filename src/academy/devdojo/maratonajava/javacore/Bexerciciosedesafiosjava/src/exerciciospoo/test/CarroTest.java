package exerciciospoo.test;


import exerciciospoo.dominio.Carro;

public class CarroTest {

    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.setMarca("Gol");
        System.out.println("Marca =  "+carro.getMarca());
        carro.setModelo("Nissan");
        System.out.println("Modelo = "+carro.getModelo());
        carro.setAno("1998");
        System.out.println("ANo = "+carro.getAno());
    }
}