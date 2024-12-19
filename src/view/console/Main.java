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
        Aeropuerto barcelona = new Aeropuerto("El Prat", "LEBL", EnumCiudades.BARCELONA);
        Aeropuerto madrid = new Aeropuerto("Adolfo Suárez Madrid-Barajas", "LEMD", EnumCiudades.MADRID);
        Aeropuerto sevilla = new Aeropuerto("Sevilla", "LEZL", EnumCiudades.SEVILLA);
        Aeropuerto paris = new Aeropuerto("Charles de Gaulle", "LFPG", EnumCiudades.PARIS);
        Aeropuerto roma = new Aeropuerto("Fiumicino", "LIRF", EnumCiudades.ROMA);
        Aeropuerto berlin = new Aeropuerto("Berlin Brandenburg", "EDDB", EnumCiudades.BERLIN);
        Aeropuerto colonia = new Aeropuerto("Colonia/Bonn", "EDDK", EnumCiudades.COLONIA);
        Aeropuerto londres = new Aeropuerto("Heathrow", "EGLL", EnumCiudades.LONDRES);
        Aeropuerto lisboa = new Aeropuerto("Humberto Delgado", "LPPT", EnumCiudades.LISBOA);
        Aeropuerto viena = new Aeropuerto("Vienna International", "LOWW", EnumCiudades.VIENA);
        Aeropuerto bruselas = new Aeropuerto("Brussels Airport", "EBBR", EnumCiudades.BRUSELAS);
        Aeropuerto atenas = new Aeropuerto("Eleftherios Venizelos", "LGAV", EnumCiudades.ATENAS);
        Aeropuerto estocolmo = new Aeropuerto("Arlanda", "ESSA", EnumCiudades.ESTOCOLMO);
        Aeropuerto nuevaYork = new Aeropuerto("John F. Kennedy", "KJFK", EnumCiudades.NUEVA_YORK);
        Aeropuerto toronto = new Aeropuerto("Toronto Pearson", "CYYZ", EnumCiudades.TORONTO);
        Aeropuerto monterrey = new Aeropuerto("General Mariano Escobedo", "MMMY", EnumCiudades.MONTERREY);
        Aeropuerto buenosAires = new Aeropuerto("Ministro Pistarini", "SAEZ", EnumCiudades.BUENOS_AIRES);
        Aeropuerto lima = new Aeropuerto("Jorge Chávez", "SPJC", EnumCiudades.LIMA);
        Aeropuerto tokio = new Aeropuerto("Haneda", "RJTT", EnumCiudades.TOKIO);
        Aeropuerto osaka = new Aeropuerto("Kansai", "RJBB", EnumCiudades.OSAKA);
        Aeropuerto hongKong = new Aeropuerto("Hong Kong International", "VHHH", EnumCiudades.HONG_KONG);
        Aeropuerto singapur = new Aeropuerto("Changi", "WSSS", EnumCiudades.SINGAPUR);
        Aeropuerto estambul = new Aeropuerto("Istanbul", "LTFM", EnumCiudades.ESTAMBUL);

        
        Ruta rutaTest = new Ruta(barcelona,madrid);
        System.out.println(rutaTest.getDistancia());
        System.out.println(rutaTest.getTiempoDeVuelo());
        

        
        Vuelo testVuelo = new Vuelo(aviones,rutaTest,LocalDate.now(), EnumStatus.EN_HORA, true);
        System.out.println(testVuelo.getAvion());

        
        
        

        

        
    }
}
