// La clase Rectangulo hereda de Figura e implementa la interfaz Dibujable
public class Rectangulo extends Figura implements Dibujable {
    // Atributos privados para cumplir con el encapsulamiento
    private double base;
    private double altura;
    // Constructor que inicializa base y altura usando los setters (con validación)
    public Rectangulo(double base, double altura) {
        setBase(base);
        setAltura(altura);
    }

    // Getter para obtener el valor de la base
    public double getBase() {
        return base;
    }
    // Setter de la base con validación para evitar valores negativos o cero
    public void setBase(double base) {
        if (base <= 0)
            throw new IllegalArgumentException("La base debe ser mayor que 0");
        this.base = base;
    }
    // Getter para obtener el valor de la altura
    public double getAltura() {
        return altura;
    }
    // Setter de la altura con validación
    public void setAltura(double altura) {
        if (altura <= 0)
            throw new IllegalArgumentException("La altura debe ser mayor que 0");
        this.altura = altura;
    }

    // Implementación del metodo abstracto calcularArea() de la clase Figura
    @Override
    public double calcularArea() {
        return base * altura; // Fórmula: base × altura
    }
    // Implementación de calcularPerimetro() de Figura
    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura); // Fórmula del perímetro del rectángulo
    }
    // Implementación del metodo dibujar() de la interfaz Dibujable
    @Override
    public void dibujar() {
        // Dibujo ASCII sencillo que representa un rectángulo
        System.out.println("***********");
        System.out.println("*         *");
        System.out.println("***********");
    }
}

