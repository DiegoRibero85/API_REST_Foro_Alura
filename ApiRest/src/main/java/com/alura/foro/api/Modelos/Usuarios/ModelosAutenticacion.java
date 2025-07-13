package com.alura.foro.api.Modelos.Usuarios;

import org.jetbrains.annotations.NotNull;

public record ModelosAutenticacion(@NotNull String Nombre, @NotNull String Categoria, @NotNull String Email, @NotNull String Password) {

    public ModelosAutenticacion(String Nombre, String Categoria, String Email, String Password) {this.Nombre=Nombre;this.Categoria=Categoria; this.Email= Email; this.Password= Password;}
}
