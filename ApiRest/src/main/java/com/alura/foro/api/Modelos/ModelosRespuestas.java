package com.alura.foro.api.Modelos;

public record ModelosRespuestas(String Nombre, String Categoria) {

    public  ModelosRespuestas(String Nombre, String Categoria) {this.Nombre=Nombre;this.Categoria=Categoria;}
}
