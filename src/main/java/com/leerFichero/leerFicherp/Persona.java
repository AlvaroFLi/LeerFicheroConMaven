package com.leerFichero.leerFicherp;

import java.util.Optional;

public class Persona {
    Optional<String> nombre;
    Optional<String> poblacion;
    Optional <Integer> edad;

    @Override
    public String toString() {
        return "Nombre:'" + nombre  +
                ", poblacion=" + poblacion +
                ", edad=" + edad;
    }

    public Optional<String> getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = Optional.ofNullable(nombre);
    }

    public Optional<String> getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = Optional.ofNullable(poblacion);
    }

    public Optional<Integer> getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = Optional.ofNullable(edad);
    }
}
