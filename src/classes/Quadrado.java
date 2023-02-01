package classes;

public class Quadrado implements FiguraGeometrica {
    private int lado;

    public Quadrado(int lado) {
        this.lado = lado;

    }

    // lado ao quadrado
    public double calcularArea() {
        return Math.pow(lado, 2);

    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

}
