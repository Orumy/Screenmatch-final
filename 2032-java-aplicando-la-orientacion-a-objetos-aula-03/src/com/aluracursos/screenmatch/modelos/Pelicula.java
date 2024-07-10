package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screenmatch.calculos.Clasificacion;

public class Pelicula extends Titulo implements Clasificacion { //Extends hereda las propiedades de titulo en este caso
        private  String director;

    public String getDirector() { //getter
        return director;
    }

    public void setDirector(String director) {//setter
        this.director = director;
    }

    @Override
    public int getClasificacion() {
        return (int) (calculaMedia() / 2);
    }
}
 // Hrenci , UN clase es igual OTRA