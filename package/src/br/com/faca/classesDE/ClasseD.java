package br.com.faca.classesDE;

import br.com.faca.classesABC.ClasseB;

public class ClasseD {
    String nome = "ClasseD";

    ClasseB classeB = new ClasseB(); //Automaticamente ele importa a classe do outro pacote
}
