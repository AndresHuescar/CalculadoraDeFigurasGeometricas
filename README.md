Desarrolla una aplicación en Java por consola que permita al usuario calcular el área y el perímetro de diferentes figuras geométricas (círculo, rectángulo y triángulo). El programa debe estar estructurado utilizando los principios de la Programación Orientada a Objetos (POO) y debe aplicar los fundamentos de programación vistos en clase.

-Crea una clase abstracta Figura con métodos abstractos calcularArea() y calcularPerimetro().

-Implementa al menos tres subclases: Circulo, Rectangulo y Triangulo, que hereden de Figura y sobrescriban los métodos para calcular el área y el perímetro.

-Utiliza encapsulamiento para proteger los atributos de cada figura y proporciona getters y setters.

-Implementa un menú en consola que permita al usuario:

  ▪Elegir la figura.
  
  ▪Introducir los datos necesarios (radio, lados, base, altura, etc.) usando la clase Scanner.
  
  ▪Mostrar el área y el perímetro calculados usando System.out.printf.
  
-Maneja posibles errores de entrada (por ejemplo, valores negativos o no numéricos) usando excepciones.

-Utiliza arrays para almacenar las figuras creadas y mostrar un resumen al final.

-Añade una interfaz Dibujable con un método dibujar() que muestre en consola una representación simple de la figura.
