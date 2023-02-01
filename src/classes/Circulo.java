package classes;

public class Circulo implements FiguraGeometrica{
    private int raio;

    public Circulo(int raio) {
        this.raio = raio;

    }

    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);

    }

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

}
