package org.example.com.aluracursos.screenmatch.excepciones;

public class ErrorEnConversionDuracionException extends RuntimeException {
    private String mensaje;

    public ErrorEnConversionDuracionException(String s) {
        this.mensaje = s;
    }

    @Override
    public String getMessage(){
        return  this.mensaje;
    }
}
