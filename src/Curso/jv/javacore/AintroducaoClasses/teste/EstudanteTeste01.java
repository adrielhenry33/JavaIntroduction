package Curso.jv.javacore.AintroducaoClasses.teste;

import Curso.jv.javacore.AintroducaoClasses.dominio.Estudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();

        estudante.idade = 24;
        estudante.nome = "Adriel Henry Dias Barbosa ";
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);


    }
}
