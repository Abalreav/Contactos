package com.example.alumnos.contactos;

public class Contacto {
    private String nombrecontacto;
    private String telefono;
    private String Correo;

    public Contacto(String nombrecontacto, String telefono, String correo) {
        this.setNombrecontacto(nombrecontacto);
        this.setTelefono(telefono);
        setCorreo(correo);
    }

    public String getNombrecontacto() {
        return nombrecontacto;
    }

    public void setNombrecontacto(String nombrecontacto) {
        this.nombrecontacto = nombrecontacto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }
}
