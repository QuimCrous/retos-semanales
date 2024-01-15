package Exercises;

public class MorseString {

    public static String convertMorseString(String input){
        if (isText(input)){
            String morseCode = textToMorse(input);
            return morseCode;
        } else if (isMorse(input)) {
            String text = morseToText(input);
            return text;
        } else {
            return "Entrada no válida. Por favor, ingrese texto o código Morse.";
        }
    }

    private static boolean isText(String input) {
        // Verificar si la entrada contiene solo caracteres alfabéticos y espacios
        return input.matches("^[a-zA-Z\\s]+$");
    }

    private static boolean isMorse(String input) {
        // Verificar si la entrada contiene solo caracteres válidos de Morse
        return input.matches("^[.\\-\\s]+$");
    }

    private static String textToMorse(String text) {
        // Mapeo de caracteres al alfabeto Morse
        String[] morseAlphabet = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---",
                "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-",
                "..-", "...-", ".--", "-..-", "-.--", "--.."};

        StringBuilder morseCode = new StringBuilder();

        // Convertir cada caracter del texto a Morse
        for (char c : text.toUpperCase().toCharArray()) {
            if (Character.isLetter(c)) {
                morseCode.append(morseAlphabet[c - 'A']).append(" ");
            } else if (Character.isWhitespace(c)) {
                morseCode.append(" ");
            }
        }

        return morseCode.toString().trim();
    }

    private static String morseToText(String morseCode) {
        // Invertir el mapeo de Morse al alfabeto
        String[] morseAlphabet = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---",
                "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-",
                "..-", "...-", ".--", "-..-", "-.--", "--.."};

        StringBuilder text = new StringBuilder();

        // Dividir la entrada de Morse por espacios
        String[] morseWords = morseCode.split("\\s{2}");

        for (String morseWord : morseWords) {
            // Dividir cada palabra Morse en caracteres
            String[] morseChars = morseWord.split("\\s");

            for (String morseChar : morseChars) {
                for (int i = 0; i < morseAlphabet.length; i++) {
                    if (morseChar.equals(morseAlphabet[i])) {
                        text.append((char) ('A' + i));
                        break;
                    }
                }
            }

            text.append(" ");
        }

        return text.toString().trim();
    }
}
