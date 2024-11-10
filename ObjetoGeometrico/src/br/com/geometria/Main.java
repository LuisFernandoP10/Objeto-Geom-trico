package br.com.geometria;

public class Main {
    public static void main(String[] args) {
        // Criando os objetos das formas geométricas
        FormaGeometrica circulo = new Circulo(5);  // Raio = 5
        FormaGeometrica retangulo = new Retangulo(4, 6);  // Largura = 4, Altura = 6
        FormaGeometrica quadrado = new Quadrado(3);  // Lado = 3

        // Testando as operações para o Círculo
        System.out.println("Círculo:");
        System.out.println("Área: " + circulo.calcularArea());
        System.out.println("Perímetro: " + circulo.calcularPerimetro());

        // Testando as operações para o Retângulo
        System.out.println("\nRetângulo:");
        System.out.println("Área: " + retangulo.calcularArea());
        System.out.println("Perímetro: " + retangulo.calcularPerimetro());

        // Testando as operações para o Quadrado
        System.out.println("\nQuadrado:");
        System.out.println("Área: " + quadrado.calcularArea());
        System.out.println("Perímetro: " + quadrado.calcularPerimetro());
    }
}
