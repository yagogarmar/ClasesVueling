package view.console;

import java.time.LocalDate;
import java.util.ArrayList;
import model.Aeropuerto;
import model.Avion;
import model.Ruta;
import model.Vuelo;
import model.data.EnumCiudades;
import model.data.EnumModelos;
import model.data.EnumStatus;
import model.data.EnumTipoAvion;


public class Main {
    public static void main(String[] args) {
        
        
        // Lista de los avioness
        ArrayList<Avion> aviones = new ArrayList<Avion>();
        aviones.add(new Avion(EnumTipoAvion.RUTAS_CORTAS, EnumModelos.AIRBUS_A320, 2000, "651AS"));
        aviones.add(new Avion(EnumTipoAvion.RUTAS_CORTAS, EnumModelos.BOEING_737, 2000, "8FD5E"));
        aviones.add(new Avion(EnumTipoAvion.RUTAS_CORTAS, EnumModelos.AIRBUS_A320, 2000, "S5DF4"));
        aviones.add(new Avion(EnumTipoAvion.RUTAS_CORTAS, EnumModelos.BOEING_737, 2000, "HYH85"));
        aviones.add(new Avion(EnumTipoAvion.RUTAS_CORTAS, EnumModelos.AIRBUS_A320, 2000, "S5D4D"));
        
        aviones.add(new Avion(EnumTipoAvion.RUTAS_CORTAS, EnumModelos.BOEING_737, 2000, "8FD5E"));
        aviones.add(new Avion(EnumTipoAvion.RUTAS_MEDIAS, EnumModelos.AIRBUS_A330, 2000, "GF65F"));
        aviones.add(new Avion(EnumTipoAvion.RUTAS_MEDIAS, EnumModelos.BOEING_757, 2000, "ASD45"));
        
        
        // Aeropuertos
        ArrayList<Aeropuerto> aeropuertos = new ArrayList<Aeropuerto>();

        aeropuertos.add(new Aeropuerto("El Prat", "LEBL", EnumCiudades.BARCELONA));
        aeropuertos.add(new Aeropuerto("Adolfo Suárez Madrid-Barajas", "LEMD", EnumCiudades.MADRID));
        aeropuertos.add(new Aeropuerto("Sevilla", "LEZL", EnumCiudades.SEVILLA));
        aeropuertos.add(new Aeropuerto("Charles de Gaulle", "LFPG", EnumCiudades.PARIS));
        aeropuertos.add(new Aeropuerto("Fiumicino", "LIRF", EnumCiudades.ROMA));
        aeropuertos.add(new Aeropuerto("Berlin Brandenburg", "EDDB", EnumCiudades.BERLIN));
        aeropuertos.add(new Aeropuerto("Colonia/Bonn", "EDDK", EnumCiudades.COLONIA));
        aeropuertos.add(new Aeropuerto("Heathrow", "EGLL", EnumCiudades.LONDRES));
        aeropuertos.add(new Aeropuerto("Humberto Delgado", "LPPT", EnumCiudades.LISBOA));
        aeropuertos.add(new Aeropuerto("Vienna International", "LOWW", EnumCiudades.VIENA));
        aeropuertos.add(new Aeropuerto("Brussels Airport", "EBBR", EnumCiudades.BRUSELAS));
        aeropuertos.add(new Aeropuerto("Eleftherios Venizelos", "LGAV", EnumCiudades.ATENAS));
        aeropuertos.add(new Aeropuerto("Arlanda", "ESSA", EnumCiudades.ESTOCOLMO));
        aeropuertos.add(new Aeropuerto("John F. Kennedy", "KJFK", EnumCiudades.NUEVA_YORK));
        aeropuertos.add(new Aeropuerto("Toronto Pearson", "CYYZ", EnumCiudades.TORONTO));
        aeropuertos.add(new Aeropuerto("General Mariano Escobedo", "MMMY", EnumCiudades.MONTERREY));
        aeropuertos.add(new Aeropuerto("Ministro Pistarini", "SAEZ", EnumCiudades.BUENOS_AIRES));
        aeropuertos.add(new Aeropuerto("Jorge Chávez", "SPJC", EnumCiudades.LIMA));
        aeropuertos.add(new Aeropuerto("Haneda", "RJTT", EnumCiudades.TOKIO));
        aeropuertos.add(new Aeropuerto("Kansai", "RJBB", EnumCiudades.OSAKA));
        aeropuertos.add(new Aeropuerto("Hong Kong International", "VHHH", EnumCiudades.HONG_KONG));
        aeropuertos.add(new Aeropuerto("Changi", "WSSS", EnumCiudades.SINGAPUR));
        aeropuertos.add(new Aeropuerto("Istanbul", "LTFM", EnumCiudades.ESTAMBUL));
        
        Ruta rutaTest = new Ruta(aeropuertos.get(0),aeropuertos.get(1));
        
        System.out.println(rutaTest.getDistancia());
        System.out.println(rutaTest.getTiempoDeVuelo());
        

        
        Vuelo testVuelo = new Vuelo(aviones,rutaTest,LocalDate.now(), EnumStatus.EN_HORA, true);
        System.out.println(testVuelo.getAvion());

        
        
        

        

        
    }
}
