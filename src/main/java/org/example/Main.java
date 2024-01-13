package org.example;

import Exercises.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        FizzBuzz.fizzBuzz();

        System.out.println(Anagrama.esAnagrama("amor","roma"));
        System.out.println(Anagrama.esAnagrama("yoquese","lalilolai"));
        System.out.println(Anagrama.esAnagrama("unabomber","berunabom"));

        Fibonacci.fibonacci();

        Primos.esPrimo(11L);
        Primos.esPrimo(10L);
        Primos.cienNumerosPrimos();

        Poligono.calcularArea("t",2.,8.);
        Poligono.calcularArea("s",2.,2.);
        Poligono.calcularArea("s",2.,8.);
        Poligono.calcularArea("r",4.,8.);
        Poligono.calcularArea("ppppp",2.,8.);

        CadenaInvertida.invertirCadena("Hola Mundo!");
    }
}