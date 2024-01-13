package Exercises;

/*
 * Reto #4
 * ÁREA DE UN POLÍGONO
 * Fecha publicación enunciado: 24/01/22
 * Fecha publicación resolución: 31/01/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea UNA ÚNICA FUNCIÓN (importante que sólo sea una) que sea capaz de calcular y retornar el área de un polígono.
 * - La función recibirá por parámetro sólo UN polígono a la vez.
 * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
 * - Imprime el cálculo del área de un polígono de cada tipo.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la acomunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */

public class Poligono {

    public static void calcularArea(String a, Double b, Double c){
        if (a.toLowerCase() == "t"){
            System.out.println("El área de este triangulo es: "  + (b*c)/2);
        } else if (a.toLowerCase() == "s") {
            if (b.equals(c)){
                System.out.println("El área de este cuadrado es: " + b*b);
            } else {
                System.out.println("El área del cuadrado que se ha introducido no se puede colocar ya que se han introducido dos variables distintas para los lados.");
            }
        } else if (a.toLowerCase() == "r") {
            System.out.println("El área de este rectangulo es: " + b*c);
        } else {
            System.out.println("Ha habido un error al introducir los datos para usar la funcion.");
        }
    }
}
