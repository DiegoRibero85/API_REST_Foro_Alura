package com.alura.foro.api.Modelos.Usuarios;

public record ModelosUsuario(String Nombre, String Categoria, String Email, String Password) {

    public ModelosUsuario(String Nombre, String Categoria, String Email, String Password) {this.Nombre=Nombre;this.Categoria=Categoria; this.Email= Email; this.Password= Password;}
}
