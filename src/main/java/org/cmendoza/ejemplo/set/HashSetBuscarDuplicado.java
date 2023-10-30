package org.cmendoza.ejemplo.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetBuscarDuplicado {
    public static void main(String[] args) {
        String[] carros = {"Mazda","Sedan","Lotus","ferrari","Honda","Sedan"};
        Set<String> unicos = new HashSet<>();
        for (String carro: carros) {
            if (!unicos.add(carro)){//verifica cuál elemento del arreglo está duplicado
                System.out.println("elemento duplicado " + carro);
            }// fin del if

        }// fin del for

        System.out.println(unicos.size() + " elementos no duplicados: " + unicos);




    }
}
