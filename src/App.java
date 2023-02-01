import classes.Circulo;
import classes.Quadrado;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Circulo circulo = new Circulo(2);
        
        System.out.println(circulo.calcularArea());

        Quadrado quadrado = new Quadrado(5);
        System.out.println(quadrado.gerarAreaQuadrado());
    }
}
