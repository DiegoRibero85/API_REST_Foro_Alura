package com.alura.foro.api.Modelos.Respuestas;



import org.jetbrains.annotations.NotNull;

public record ModelosListaRespuesta(Long id, String mensaje, String idTopico, String Autor) {

    public ModelosListaRespuesta(Respuesta respuesta){
        this( respuesta.getId(), respuesta.getMensaje(), respuesta.getTopico().getTitulo(), respuesta.getAutor().getNombre());
    }
}
