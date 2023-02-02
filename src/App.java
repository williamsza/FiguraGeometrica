import java.io.IOException;

import classes.Circulo;
import classes.Quadrado;

public class App {

    public static void limparTela() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

    }

    public static void main(String[] args) throws Exception {
        limparTela();

        Circulo circulo = new Circulo(10);
        System.out.println("A área do ciculo é: " + circulo.calcularArea());

        Quadrado quadrado = new Quadrado(5);
        System.out.println("A área do qudrado é: " + quadrado.calcularArea());
    }
}
