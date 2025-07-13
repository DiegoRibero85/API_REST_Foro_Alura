package com.alura.foro.api.Modelos.Usuarios;

public record ModelosListaUsuarios(String Nombre, String Categoria, String Email, String Password) {

    public ModelosListaUsuarios(String Nombre, String Categoria, String Email, String Password) {this.Nombre=Nombre;this.Categoria=Categoria; this.Email= Email; this.Password= Password;}
}
