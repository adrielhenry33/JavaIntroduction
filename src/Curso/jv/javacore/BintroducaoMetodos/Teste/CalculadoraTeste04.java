package Curso.jv.javacore.BintroducaoMetodos.Teste;

import Curso.jv.javacore.BintroducaoMetodos.Dominio.Calculadora;

public class CalculadoraTeste04 {
    public static void main(String[] args) {
        Calculadora calc04 = new Calculadora();

        int num1 = 0;
        int num2 = 0  ;
        calc04.aleraDoisNumeros(num1, num2);
        System.out.println("Dentro da calculadora teste 04");
        System.out.println("Num1:" + num1);
        System.out.println("Num2:" + num2);

    }
}
