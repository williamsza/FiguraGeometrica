package classes;

public class Quadrado {
    private int lado;

    public Quadrado(int lado) {
        this.lado = lado;

    }

    // lado ao quadrado
    public double gerarAreaQuadrado() {
        return Math.pow(lado, 2);

    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

}
