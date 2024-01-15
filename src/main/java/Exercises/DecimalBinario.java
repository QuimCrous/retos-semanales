package Exercises;

/*
 * Reto #8
 * DECIMAL A BINARIO
 * Fecha publicación enunciado: 18/02/22
 * Fecha publicación resolución: 02/03/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea un programa se encargue de transformar un número decimal a binario sin utilizar funciones propias del lenguaje que lo hagan directamente.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la acomunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */

public class DecimalBinario {

    public static String convertirDecimalABinario(double numeroDecimal) {
        if (numeroDecimal == 0) {
            return "0";
        }

        // Parte entera y decimal
        long parteEntera = (long) numeroDecimal;
        double parteDecimal = numeroDecimal - parteEntera;

        StringBuilder binario = new StringBuilder();

        // Convertir la parte entera a binario
        binario.append(convertirParteEnteraABinario(parteEntera));

        // Convertir la parte decimal a binario (hasta cierto número de decimales)
        if (parteDecimal > 0) {
            binario.append(".");
            binario.append(convertirParteDecimalABinario(parteDecimal));
        }

        return binario.toString();
    }

    // Función para convertir la parte entera a binario
    private static String convertirParteEnteraABinario(long parteEntera) {
        StringBuilder binario = new StringBuilder();

        while (parteEntera > 0) {
            long residuo = parteEntera % 2;
            binario.insert(0, residuo); // Insertar el residuo al inicio de la cadena
            parteEntera /= 2;
        }

        return binario.toString();
    }

    // Función para convertir la parte decimal a binario
    private static String convertirParteDecimalABinario(double parteDecimal) {
        StringBuilder binario = new StringBuilder();

        int limiteDecimales = 10; // Puedes ajustar este valor según tus necesidades

        while (parteDecimal > 0 && binario.length() < limiteDecimales) {
            parteDecimal *= 2;
            int bit = (int) parteDecimal;
            binario.append(bit);
            parteDecimal -= bit;
        }

        return binario.toString();
    }
}
