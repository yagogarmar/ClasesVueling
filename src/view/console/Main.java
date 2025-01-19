package view.console;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;
import model.Aeropuerto;
import model.Avion;
import model.Billete;
import model.BilleteEjecutivo;
import model.BilletePrimeraClase;
import model.BilleteTurista;
import model.Persona;
import model.Ruta;
import model.Vuelo;
import model.data.EnumCiudades;
import model.data.EnumModelos;
import model.data.EnumStatus;
import model.data.EnumTipoAvion;


//IMPORTS PDF

import com.itextpdf.kernel.pdf.*;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.*;
import com.itextpdf.layout.property.TextAlignment;
import com.itextpdf.barcodes.Barcode128;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.canvas.PdfCanvas;
import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.layout.property.HorizontalAlignment;

import java.io.File;


public class Main {

    static Scanner scan = new Scanner(System.in);
    public static ArrayList<Avion> aviones = new ArrayList<Avion>();
    public static ArrayList<Aeropuerto> aeropuertos = new ArrayList<Aeropuerto>();    
    public static ArrayList<Billete> billetes = new ArrayList<Billete>();
    public static ArrayList<Vuelo> vuelos = new ArrayList<Vuelo>();
    public static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static void main(String[] args) {

        // Lista de los avioness
        aviones.add(new Avion(EnumTipoAvion.RUTAS_CORTAS, EnumModelos.AIRBUS_A320, 2000, "651AS"));
        aviones.add(new Avion(EnumTipoAvion.RUTAS_CORTAS, EnumModelos.BOEING_737, 2000, "8FD5E"));
        aviones.add(new Avion(EnumTipoAvion.RUTAS_CORTAS, EnumModelos.AIRBUS_A320, 2000, "S5DF4"));
        aviones.add(new Avion(EnumTipoAvion.RUTAS_CORTAS, EnumModelos.BOEING_737, 2000, "HYH85"));
        aviones.add(new Avion(EnumTipoAvion.RUTAS_CORTAS, EnumModelos.AIRBUS_A320, 2000, "S5D4D"));

        aviones.add(new Avion(EnumTipoAvion.RUTAS_CORTAS, EnumModelos.BOEING_737, 2000, "8FD5E"));
        aviones.add(new Avion(EnumTipoAvion.RUTAS_MEDIAS, EnumModelos.AIRBUS_A330, 2000, "GF65F"));
        aviones.add(new Avion(EnumTipoAvion.RUTAS_MEDIAS, EnumModelos.BOEING_757, 2000, "ASD45"));
        aviones.add(new Avion(EnumTipoAvion.RUTAS_LARGAS, EnumModelos.BOEING_747, 2000, "ASD45"));
        aviones.add(new Avion(EnumTipoAvion.RUTAS_LARGAS, EnumModelos.AIRBUS_A380, 2000, "ASD45"));

        
        
        // Aeropuertos
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

        String opcion;
        do {
            cls();
            System.out.println("");
            System.out.println("1.- Buscar vuelos");
            System.out.println("2.- Ver billetes anteriores");
            System.out.println("0- Salir");
            System.out.print("Opcion: ");
            opcion = scan.next();
            cls();

            switch (opcion) {
                case "1":
                    nuevoVuelo();
                    break;
                case "2":
                    mostrarBilletes();
                    break;
                case "3":
                    test();
                    break;
                default:
                    System.out.println("Seleccione una opcion valida");
                    break;

            }

        } while (!opcion.equals("0"));
    }
    
    public static void mostrarBilletes(){
        for (Billete billete : billetes) {
            billete.toString();
             
        }
    }
    
    public static void test() {
        Ruta rutaSeleccionada = new Ruta(aeropuertos.get(0), aeropuertos.get(1));
        Vuelo testVuelo = new Vuelo(aviones, rutaSeleccionada, LocalDateTime.now(), EnumStatus.EN_HORA, true);

        
        System.out.println("Selecciona el asiento (1A)");
        testVuelo.mostrarAsientos();
        System.out.print(">> ");
        String asientioSelec = scan.next();
        System.out.println(testVuelo.ocuparAsiento(asientioSelec));
        
        testVuelo.mostrarAsientos();

        
    }

    private static void recorrerCiudades() {
        int i = 1;
        for (Aeropuerto aeropuerto : aeropuertos) {
            System.out.println(i + "- " + aeropuerto.getCiudad().getNombre());
            i++;
        }
    }

    private static void cls(){
        for (int i = 0; i < 100; i++) {
            System.out.println("");
        }
    }
    public static void nuevoVuelo() {

        //Seleccion de la primera ciudad
        boolean val = true;
        String posCiudadSalida = "";
        while (val) {
            System.out.println("");
            System.out.println("Seleccione la ciudad de salida ");
            recorrerCiudades();
            System.out.print(">> ");
            posCiudadSalida = scan.next();
            cls();
            if (Integer.parseInt(posCiudadSalida) > 0 && Integer.parseInt(posCiudadSalida) <= aeropuertos.size()) {
                val = false;
            } else {
                System.out.println("Ciudad no valida");
            }
        }

        val = true;
        String posCiudadDestino = "";
        while (val) {
            System.out.println("");
            System.out.println("Seleccione la ciudad de destino ");
            recorrerCiudades();
            System.out.print(">> ");
            posCiudadDestino = scan.next();
            cls();
            if (Integer.parseInt(posCiudadDestino) > 0 && Integer.parseInt(posCiudadDestino) <= aeropuertos.size()) {
                if (posCiudadDestino.equals(posCiudadSalida)) {
                    System.out.println("\nNo puedes seleccionar la misma ciudad");
                } else {
                    val = false;
                }
            } else {
                System.out.println("Ciudad no valida");
            }
        }

        Ruta rutaSeleccionada = new Ruta(aeropuertos.get(Integer.parseInt(posCiudadDestino) - 1), aeropuertos.get(Integer.parseInt(posCiudadSalida) - 1));

        val = true;
        LocalDate fecha = null;
        while (val) {
            System.out.print("\nIntroduce la fecha deseada (dd/MM/yyyy)\n>>");
            String stringFecha = scan.next();
            try {

                String fechaTexto = scan.nextLine().trim();
                fecha = LocalDate.parse(stringFecha, formatter);
                if (fecha.isBefore(LocalDate.now())) {
                    System.out.println("\nERROR Introduce una fecha valida\n");
                } else {
                    val = false;

                }
            } catch (DateTimeParseException e) {
                System.out.println("Formato de fecha invalido. Usa el formato(dd/MM/yyyy).");
            }
        }

        val = true;
        LocalDateTime fechaHora = null;
        while (val) {
            System.out.print("\n Selecciona una hora\n1- 9:00\n2- 17:00\n3- 21:00\n>> ");
            String opc = scan.next();
            if (opc.equals("1")) {

                fechaHora = fecha.atStartOfDay().plusHours(9);
                val = false;
            } else if (opc.equals("2")) {

                fechaHora = fecha.atStartOfDay().plusHours(17);
                val = false;
            } else if (opc.equals("3")) {

                fechaHora = fecha.atStartOfDay().plusHours(21);
                val = false;
            } else {
                System.out.println("Seleccione una opcion valida");
            }

        }
        Vuelo vuelo = null;
        boolean vueloEncontrado = false;
        for (Vuelo vueloR : vuelos) {
        if (vueloR.getRuta().equals(rutaSeleccionada) &&
            vueloR.getHoraSalida().isEqual(fechaHora)) {
            vueloEncontrado = true;
            vuelo = vueloR;
        }
        }
        
        if (!vueloEncontrado) {
            vuelo = new Vuelo(aviones, rutaSeleccionada, fechaHora, EnumStatus.EN_HORA, true);
        }
        
        String asientioSelec = "";
        val = true;
        while(val){
            System.out.println("Selecciona el asiento (1A)");
            vuelo.mostrarAsientos();
            System.out.print(">> ");
            asientioSelec = scan.next();
            boolean res = vuelo.ocuparAsiento(asientioSelec);
            if (res) {
                val = false;
            }else{
                System.out.println("\nIntentelo de nuevo:");
            }

        }
       
        scan.next();
        if (vueloEncontrado) {
            System.out.println( vuelos.contains(vuelo));
          
        }else{
            vuelos.add(vuelo);

        }
        
        //Creacion del billete
        val = true;
        int opc = 0;
        while(val){
            cls();
            System.out.println("Selecciona la clase: ");
            System.out.println("1- Primera clase");
            System.out.println("2- Ejecutivo");
            System.out.print("3- Turista\n>> ");
            opc = Integer.parseInt(scan.next()) ;
         
            if (opc <= 3 && opc > 0) {
                val = false;
            }else{
                System.out.println("\nSelecciona una opcion valida\n");
                
                
            }
        }
        
        // No valido todos los datos para evitar la decadencia de mi salud mental 
        System.out.println("Introduce tus datos:");
        
        System.out.print("\nNombre: ");
        String nombre = scan.next();
        
        System.out.print("\nApellidos: ");
        String apellidos = scan.next();
        
        System.out.print("\nDNI: ");
        String DNI = scan.next();
        
        System.out.print("\nFehca de nacimeinto: ");
        String fechaNacimiento = scan.next();
        
        System.out.print("\nEmail: ");
        String email = scan.next();
        
        System.out.print("\nNombre: ");
        String telefono = scan.next();
        
        System.out.print("\nPais de residencia: ");
        String pais = scan.next();
        cls();
        Persona persona = new Persona(nombre, apellidos, DNI, fechaNacimiento, email,telefono, pais);

        
        
        
        if (opc == 1) {
            
            BilletePrimeraClase primerCalse = new BilletePrimeraClase(true, "si", true, vuelo, persona, asientioSelec, 1, 300);
            billetes.add(primerCalse);
        }else if (opc == 2){
           BilleteEjecutivo ejecutivo = new BilleteEjecutivo(true, true, 29,  vuelo,  persona,  asientioSelec, 1, 100);
           billetes.add(ejecutivo);
        }else{
            BilleteTurista tursita = new BilleteTurista(false, 0,  vuelo,  persona,  asientioSelec, 2,  0);
            billetes.add(tursita);
        }
       
        
        // MOSTRAR EL BILLETE / GENERARLO 
        // POR HACER
        String destinoArchivo = "Informacion_Billete.pdf";

        try {
            PdfWriter writer = new PdfWriter(destinoArchivo);
            PdfDocument pdfDoc = new PdfDocument(writer);
            Document document = new Document(pdfDoc, PageSize.A4);

            // Título
            document.add(new Paragraph("BILLETE")
                    .setBold()
                    .setTextAlignment(TextAlignment.CENTER)
                    .setFontSize(18));

            // Datos del pasajero
            document.add(new Paragraph("Nombre del pasajero: " + persona.getNombre() + " " + persona.getApellidos()));
            document.add(new Paragraph("Salida desde: " + rutaSeleccionada.getAeropuertoOrigen()));
            document.add(new Paragraph("Destino: " + rutaSeleccionada.getAeropuertoDestino()));
            document.add(new Paragraph("Aerolínea: ClasesVueling"));
            document.add(new Paragraph("Fecha: " + vuelo.getHoraSalida()));
            document.add(new Paragraph("Asiento: " + asientioSelec));

            // Generar código de barras y colocarlo en la misma página
            Barcode128 barcode = new Barcode128(pdfDoc);
            barcode.setCode("1234563434242285789"); // Código de ejemplo
            barcode.setFont(null);

            // Convertir el código de barras en una imagen
            Image image = new Image(barcode.createFormXObject(pdfDoc));

            // Centrar el código de barras y añadirlo al documento
            image.setHorizontalAlignment(HorizontalAlignment.CENTER);
            document.add(image);


            document.close();
            System.out.println("PDF generado exitosamente.");

        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
        
        
        System.out.println("Tu reserva se ha completado con exito");        
        System.out.println("Pulsa  e + ENETR para volver al menu");
        scan.next();
        cls();
        
        
       
                
                
           
        //System.out.println(vuelo.getAvion().toString());

        //System.out.println("");
        //System.out.println("\n\n\n\nRESULTADOS: ");
        //System.out.println("Hora de salida: " + vuelo.getHoraSalida().toString());  
        //System.out.println("Hora de llegada: " + vuelo.getHoraLlegada().toString());
        //System.out.println("Tiempo de vuelo: " + vuelo.getRuta().getTiempoDeVuelo());
        //System.out.println("Ciudad 1; " + vuelo.getRuta().getAeropuertoDestino().toString() );        
        //System.out.println("Ciudad 2; " + vuelo.getRuta().getAeropuertoOrigen().toString() );
    }

}
