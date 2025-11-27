public abstract class Figura {
    // Metodo abstracto que obliga a las subclases a implementar el cálculo del área
    public abstract double calcularArea();
    // Metodo abstracto que obliga a las subclases a implementar el cálculo del perímetro
    public abstract double calcularPerimetro();
    // Metodo común para mostrar área y perímetro con formato
    public void mostrarResumen() {
        System.out.printf("Área: %.2f | Perímetro: %.2f\n", calcularArea(), calcularPerimetro());
    }
}
