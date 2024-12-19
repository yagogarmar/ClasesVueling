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
        Aeropuerto barcelona = new Aeropuerto("El prat","LEBL",EnumCiudades.BARCELONA);
        Aeropuerto madrid = new Aeropuerto("Barajas","TEST",EnumCiudades.ROMA);
        
        Ruta rutaTest = new Ruta(barcelona,madrid);
        System.out.println(rutaTest.getDistancia());
        System.out.println(rutaTest.getTiempoDeVuelo());
        
         ArrayList<Avion> aviones = new ArrayList<Avion>();
         aviones.add(new Avion(EnumTipoAvion.RUTAS_CORTAS, EnumModelos.AIRBUS_A320, 2000, "651AS"));
         aviones.add(new Avion(EnumTipoAvion.RUTAS_CORTAS, EnumModelos.AIRBUS_A320, 2000, "651AS"));
         aviones.add(new Avion(EnumTipoAvion.RUTAS_CORTAS, EnumModelos.AIRBUS_A320, 2000, "651AS"));
         aviones.add(new Avion(EnumTipoAvion.RUTAS_CORTAS, EnumModelos.AIRBUS_A320, 2000, "651AS"));
         aviones.add(new Avion(EnumTipoAvion.RUTAS_CORTAS, EnumModelos.AIRBUS_A320, 2000, "651AS"));
         aviones.add(new Avion(EnumTipoAvion.RUTAS_CORTAS, EnumModelos.AIRBUS_A320, 2000, "651AS"));
        
        Vuelo testVuelo = new Vuelo(aviones,rutaTest,LocalDate.now(), EnumStatus.EN_HORA, true);

        
        
        

        

        
    }
}
