package com.alura.foro.api.Seguridad;

import com.alura.foro.api.Modelos.Usuarios.ModelosListaUsuarios;

@Service
public class ServicioAutenticacion implements  DetalleServicioUsuario{

    private RepositorioUsuario repositorioUsuario;

    ServicioAutenticacion(RepositorioUsuario repositorioUsuario)
    {
        this.repositorioUsuario=repositorioUsuario;
    }
}
