package model;

import java.time.LocalDate;


public class Persona {
    private String nombre;
    private String apellidos;
    private String DNI;
    private LocalDate fechaNacimiento;
    private char genero;
    private String email;
    private String telefono;
    private String ciudad;
    private String pais;

    public Persona(String nombre, String apellidos, String DNI, LocalDate fechaNacimiento, char genero, String email, String telefono, String ciudad, String pais) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.email = email;
        this.telefono = telefono;
        this.ciudad = ciudad;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("nombre=").append(nombre);
        sb.append(", apellidos=").append(apellidos);
        sb.append(", DNI=").append(DNI);
        sb.append(", fechaNacimiento=").append(fechaNacimiento);
        sb.append(", genero=").append(genero);
        sb.append(", email=").append(email);
        sb.append(", telefono=").append(telefono);
        sb.append(", ciudad=").append(ciudad);
        sb.append(", pais=").append(pais);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
