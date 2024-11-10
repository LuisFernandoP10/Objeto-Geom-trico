package br.com.geometria;

public class Retangulo implements FormaGeometrica {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return largura * altura;  // Fórmula da área do retângulo
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (largura + altura);  // Fórmula do perímetro do retângulo
    }
}
