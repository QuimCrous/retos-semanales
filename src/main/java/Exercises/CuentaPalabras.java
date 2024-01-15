package Exercises;

/*
 * Reto #7
 * CONTANDO PALABRAS
 * Fecha publicación enunciado: 14/02/22
 * Fecha publicación resolución: 21/02/22
 * Dificultad: MEDIA
 *
 * Enunciado: Crea un programa que cuente cuantas veces se repite cada palabra y que muestre el recuento final de todas ellas.
 * - Los signos de puntuación no forman parte de la palabra.
 * - Una palabra es la misma aunque aparezca en mayúsculas y minúsculas.
 * - No se pueden utilizar funciones propias del lenguaje que lo resuelvan automáticamente.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la acomunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */

import java.util.HashMap;
import java.util.Map;

public class CuentaPalabras {

    public static void cuentaPalabras(String a){
        String b = a.toLowerCase();
        Map<String, Integer> mapeo = new HashMap<>();
        char[] bArray = b.toCharArray();
        for (int i = 0; i < bArray.length; i++) {
            if (Character.toString(bArray[i]).matches("[a-zA-Z]")){
                if (mapeo.containsKey(String.valueOf(bArray[i]))){
                    Integer value = mapeo.get(String.valueOf(bArray[i]));
                    mapeo.put(String.valueOf(bArray[i]), value+1);
                } else {
                    mapeo.put(String.valueOf(bArray[i]), 1);
                }
            }
        }
        for (String clave : mapeo.keySet()) {
            int valor = mapeo.get(clave);
            System.out.println("Clave: " + clave + ", Valor: " + valor);
        }
    }
}
