// La clase Triangulo hereda de Figura e implementa la interfaz Dibujable
public class Triangulo extends Figura implements Dibujable {
    // Atributos privados que cumple con el principio de encapsulamiento
    private double base;
    private double altura;
    private double lado1;
    private double lado2;
    // Constructor que recibe los 4 valores necesarios y los valida usando setters
    public Triangulo(double base, double altura, double lado1, double lado2) {
        setBase(base);
        setAltura(altura);
        setLado1(lado1);
        setLado2(lado2);
    }

    // Setter de base con validación
    public void setBase(double base) {
        if (base <= 0)
            throw new IllegalArgumentException("La base debe ser mayor que 0");
        this.base = base;
    }
    // Setter de altura con validación
    public void setAltura(double altura) {
        if (altura <= 0)
            throw new IllegalArgumentException("La altura debe ser mayor que 0");
        this.altura = altura;
    }
    // Setter del primer lado con validación
    public void setLado1(double lado1) {
        if (lado1 <= 0)
            throw new IllegalArgumentException("El lado 1 debe ser mayor que 0");
        this.lado1 = lado1;
    }
    // Setter del segundo lado con validación
    public void setLado2(double lado2) {
        if (lado2 <= 0)
            throw new IllegalArgumentException("El lado 2 debe ser mayor que 0");
        this.lado2 = lado2;
    }

    // Implementación del metodo abstracto calcularArea() de Figura
    @Override
    public double calcularArea() {
        // Fórmula del área del triángulo: base × altura / 2
        return (base * altura) / 2;
    }
    // Implementación del cálculo del perímetro
    @Override
    public double calcularPerimetro() {
        // Sumamos los tres lados
        return base + lado1 + lado2;
    }
    // Implementación del metodo dibujar() de Dibujable
    @Override
    public void dibujar() {
        // Representación del triángulo
        System.out.println("   /\\   ");
        System.out.println("  /  \\  ");
        System.out.println(" /____\\ ");
    }
}
