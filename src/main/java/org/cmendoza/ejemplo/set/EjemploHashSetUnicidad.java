package org.cmendoza.ejemplo.set;

import org.cmendoza.ejemplo.modelo.Alumno;

import java.util.*;

public class EjemploHashSetUnicidad {
    public static void main(String[] args) {
            //con el método equal y hasCode comparamos los objetos agregados al HashSet
            // esto hará que no se puedan agregar objetos duplicados
        Set<Alumno> alumno = new HashSet<>();
        //List<Alumno> alumno = new ArrayList<>();
        //List<Alumno> alumno = new LinkedList<>();// lista enlazada
        alumno.add(new Alumno("Carlos",8));
        alumno.add(new Alumno("jazmin",9));
        alumno.add(new Alumno("Adriana",7));
        alumno.add(new Alumno("Jessy",6));
        alumno.add(new Alumno("Daniela",3));
        alumno.add(new Alumno("Bell",7));
        alumno.add(new Alumno("Bell",7));

       // System.out.println("alumno = " + alumno);


        //tres formas de iterar un HashSet para cualquier tipo collection

        System.out.println("Usando foreach");
        for (Alumno a: alumno) {//también solo se puede imprimir el nombre o notas
            System.out.println(a);
        }

        System.out.println("usando While y el iterator");
       Iterator<Alumno> it = alumno.iterator();
        while (it.hasNext()){
            Alumno a = it.next();//nos movemos a la siguiente posición y la obtenemos en "a"
            System.out.println(a);
        }

        System.out.println("Expresiones Lambda");
       alumno.forEach(System.out::println);

        System.out.println("Iterando con for clasico solo para List<> y LinkedList<> ");
        /*for (int i = 0; i < alumno.size(); i++) {
            System.out.println(alumno.get(i));
        }*/
       // esta forma no se puede usar con un TreeSet y HashSet, ya que no tiene el get











    }
}
