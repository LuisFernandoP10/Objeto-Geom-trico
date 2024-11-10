package br.com.geometria;

public class Circulo implements FormaGeometrica {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;  // Fórmula da área do círculo
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;  // Fórmula do perímetro do círculo
    }
}
