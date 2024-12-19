package model;

import java.time.LocalDate;
import java.util.ArrayList;
import model.data.EnumStatus;
import model.data.EnumTipoAvion;
import java.util.Random;

/**
 *
 * @author erickpaugar
 */
public class Vuelo {
    private Ruta ruta;
    private Avion avion;
    private LocalDate horaLlegada;
    private LocalDate horaSalida;
    private EnumStatus status;
    private boolean wifiGratis;
    private ArrayList<ArrayList<Integer>> matriz;

    public Vuelo(ArrayList<Avion> listaAviones, Ruta ruta, LocalDate horaSalida, EnumStatus status, boolean wifiGratis) {
        this.ruta = ruta;
        this.horaSalida = horaSalida;
        this.status = status;
        this.wifiGratis = wifiGratis;
        
        // OBTENER EL AVION 
        ArrayList<Avion> avionesTipOK = null;
        
        if (ruta.distancia < 1300) {
            for (Avion elemento : listaAviones) {
                if (elemento.getTipoAvion() == EnumTipoAvion.RUTAS_CORTAS) {
                    if (elemento.isStatus()) {
                       avionesTipOK.add(elemento); 
                    }
                }
            }
        } else if (ruta.distancia < 3400) {
            for (Avion elemento : listaAviones) {
                if (elemento.getTipoAvion() == EnumTipoAvion.RUTAS_MEDIAS) {
                    if (elemento.isStatus()) {
                       avionesTipOK.add(elemento); 
                    }
                }
            }
        } else {       
            for (Avion elemento : listaAviones) {
                if (elemento.getTipoAvion() == EnumTipoAvion.RUTAS_LARGAS) {
                    if (elemento.isStatus()) {
                       avionesTipOK.add(elemento); 
                    }
                }
            }
        }
        
        Random random = new Random();
        int num = random.nextInt(avionesTipOK.size());
        this.avion = avionesTipOK.get(num);
        this.avion.setStatus(false);
         
         
         
         // GENERAR EL ARRAYLIST BIDIMENSIONAL
        ArrayList<ArrayList<Integer>> matriz = new ArrayList<>();
        
        for (int i = 0; i < this.avion.getModeloAvion().getRows(); i++) {
            ArrayList<Integer> fila = new ArrayList<>();
            for (int j = 0; j < this.avion.getModeloAvion().getColumns(); j++) {
                fila.add(1); 
            }
            matriz.add(fila);
        }
        this.matriz = matriz;

        
        
    }

    public Ruta getRuta() {
        return ruta;
    }

    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public LocalDate getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(LocalDate horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public LocalDate getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(LocalDate horaSalida) {
        this.horaSalida = horaSalida;
    }

    public EnumStatus getStatus() {
        return status;
    }

    public void setStatus(EnumStatus status) {
        this.status = status;
    }

    public boolean isWifiGratis() {
        return wifiGratis;
    }

    public void setWifiGratis(boolean wifiGratis) {
        this.wifiGratis = wifiGratis;
    }
    
}