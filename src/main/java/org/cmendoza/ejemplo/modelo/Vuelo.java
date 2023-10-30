package org.cmendoza.ejemplo.modelo;

import java.util.Date;
import java.util.Objects;

public class Vuelo {
    private String nombre;
    private String origen;
    private String destino;
    private Date fechaLlegada;
    private Integer numeroPasajeros;

//////////// CONSTRUCTOR ////////////
    public Vuelo(){}
public Vuelo(String nombre, String origen,String destino, Date fechaLlegada, Integer numeroPasajeros){
    this.nombre = nombre;
    this.origen = origen;
    this.destino = destino;
    this.fechaLlegada= fechaLlegada;
    this.numeroPasajeros = numeroPasajeros;
}
/////////// GETTER ANS SETTER //////
    public String getNombre(){
    return this.nombre;
    }
    public void setNombre(String nombre){
    this.nombre = nombre;
    }
    public String getOrigen(){
    return this.origen;
    }
    public void setOrigen(String origen){
    this.origen = origen;
    }
    public String getDestino(){
    return this.destino;
    }
    public void setDestino(String destino){
    this.destino = destino;
    }
    public Date getFechaLlegada(){
    return this.fechaLlegada;
    }
    public void setFechaLlegada(Date fechaLlegada){
    this.fechaLlegada = fechaLlegada;
    }
    public Integer getNumeroPasajeros(){
        return this.numeroPasajeros;
    }
    public void setNumeroPasajeros(Integer numeroPasajeros){
        this.numeroPasajeros = numeroPasajeros;
    }
////////// MÉTODOS ////////////////


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vuelo vuelo = (Vuelo) o;
        return numeroPasajeros == vuelo.numeroPasajeros && Objects.equals(nombre, vuelo.nombre) && Objects.equals(origen, vuelo.origen) && Objects.equals(destino, vuelo.destino) && Objects.equals(fechaLlegada, vuelo.fechaLlegada);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, origen, destino, fechaLlegada, numeroPasajeros);
    }

    @Override
    public String toString() {
        return "nombre='" + nombre  +
                ", origen='" + origen +
                ", destino='" + destino  +
                ", fechaLlegada=" + fechaLlegada +
                ", numeroPasajeros=" + numeroPasajeros;
    }
}
