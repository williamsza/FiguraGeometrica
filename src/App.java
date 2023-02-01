import classes.Circulo;
import classes.Quadrado;

public class App {
    public static void main(String[] args) throws Exception {

        Circulo circulo = new Circulo(2);
        System.out.println("A área do ciculo é: " + circulo.calcularArea());

        Quadrado quadrado = new Quadrado(5);
        System.out.println("A área do qudrado é: " + quadrado.calcularArea());
    }
}
