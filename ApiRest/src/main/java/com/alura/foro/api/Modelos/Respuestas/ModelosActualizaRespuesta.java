package com.alura.foro.api.Modelos.Respuestas;



import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.NonBlocking;

public record ModelosActualizaRespuesta(@org.jetbrains.annotations.NotNull Long id, @Notblank String mensaje, @NotNull long IdTopico, @Notblank Long RId, @NotNull Boolean Solution) {

}
