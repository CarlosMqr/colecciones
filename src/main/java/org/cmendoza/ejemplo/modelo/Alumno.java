package org.cmendoza.ejemplo.modelo;

import java.util.Objects;

public class Alumno implements Comparable<Alumno> {//para que haga el cast al tipo alumno
    private String nombre;
    private  Integer notas;
//////////// CONSTRUCTOR ////////////
    public Alumno(){

    }
    public Alumno(String nombre, Integer notas){
        this.nombre = nombre;
        this.notas = notas;
    }
/////////// GETTER ANS SETTER //////
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public Integer getNotas(){
        return this.notas;
    }
    public void setNotas(Integer notas){
        this.notas = notas;
    }
////////// MÉTODOS ////////////////


    @Override
    public int compareTo(Alumno o) {//método que usa el TresSet para ordenar; esta ordenando por notas
        if (this.notas == null){
            return 0;
        }
        return this.notas.compareTo(o.notas);
    }

    @Override
    public boolean equals(Object o) {//método para comparar objetos y si se repite alguno no lo inserta en el TreeSet
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return Objects.equals(nombre, alumno.nombre) && Objects.equals(notas, alumno.notas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, notas);
    }

    @Override
    public String toString() {
        return nombre + " " + "notas: " + notas;
    }
}
