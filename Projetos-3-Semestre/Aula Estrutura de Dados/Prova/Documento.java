package Prova;

public class Documento {

    private String titulo;
    private boolean assinado;

    Documento() {
        
    }

    Documento(String titulo) {
        this.titulo = titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setAssinado (boolean assinado){
        this.assinado = assinado;
    }

    public boolean getAssinado (){
        return assinado;
    }

}