
package model;

import java.util.ArrayList;


public abstract class  Billete {
    private Vuelo vuelo;
    private ArrayList<Persona> personas;
    private String asiento;
    private int grupo;
    private float precioAñadido;
    private String puerta;

    public Billete(Vuelo vuelo, ArrayList<Persona> personas, String asiento, int grupo, float precioAñadido) {
        this.vuelo = vuelo;
        this.personas = personas;
        this.asiento = asiento;
        this.grupo = grupo;
        this.precioAñadido = precioAñadido;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    public int getGrupo() {
        return grupo;
    }

    public void setGrupo(int grupo) {
        this.grupo = grupo;
    }

    public float getPrecioAñadido() {
        return precioAñadido;
    }

    public void setPrecioAñadido(float precioAñadido) {
        this.precioAñadido = precioAñadido;
    }

    @Override
    public String toString() {
        return "Billete{" + "vuelo=" + vuelo + ", personas=" + personas + ", asiento=" + asiento + ", grupo=" + grupo + ", precioA\u00f1adido=" + precioAñadido + '}';
    }
    
    
    
    
    
    
    
    
}
