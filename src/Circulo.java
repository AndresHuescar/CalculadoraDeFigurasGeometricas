// La clase Circulo hereda de Figura e implementa la interfaz Dibujable
public class Circulo extends Figura implements Dibujable {
    // Atributo privado que cumple el principio de encapsulamiento
    private double radio;
    // Constructor de la clase Circulo
    public Circulo(double radio) {
        setRadio(radio); // Uso el setter para validar el valor
    }
    // Getter que devuelve el valor del radio
    public double getRadio() {
        return radio;
    }
    // Setter que valida que el radio sea mayor que 0
    public void setRadio(double radio) {
        if (radio <= 0)
            throw new IllegalArgumentException("El radio debe ser mayor que 0");
        this.radio = radio;
    }

    // Implementación del metodo abstracto calcularArea() de la clase Figura
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio; // Fórmula del área de un círculo
    }
    // Implementación del metodo abstracto calcularPerimetro() de Figura
    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio; // Fórmula del perímetro (circunferencia)
    }
    // Implementación del metodo dibujar() de la interfaz Dibujable
    @Override
    public void dibujar() {
        // Representación
        System.out.println("   ***   ");
        System.out.println(" *     * ");
        System.out.println(" *     * ");
        System.out.println("   ***   ");
    }
}
