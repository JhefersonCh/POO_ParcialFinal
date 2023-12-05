import java.awt.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Output {
    public void listaAeorpuertos (ListaAeropuerto listaAeropuerto) {
        String nombreArchivo = "ListaAeorpuertos.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {

            writer.write("Listado de aeropuertos: ");
            writer.newLine();
            writer.newLine();
            writer.newLine();
            writer.write(String.format("%-9s %-25s %-15s %-15s %s",
                    "Codigo", "Nombre", "Poblacion", "Pais", "GTM"));
            writer.newLine();
            writer.write("-------------------------------------------------------------------------");
            writer.newLine();
            writer.newLine();
            for (Aeropuerto aeropuerto : listaAeropuerto.getAeropuertoList()){
                writer.write(String.format("%-9s %-25s %-15s %-15s %s",
                        aeropuerto.getCode(),
                        aeropuerto.getName(),
                        aeropuerto.getPopulation(),
                        aeropuerto.getCountry(),
                        aeropuerto.getGMT()));
                writer.newLine();
                writer.newLine();
            }
            writer.write("-------------------------------------------------------------------------");
            writer.newLine();
            writer.write("Aeropuertos: " + listaAeropuerto.getLength());
            File file = new File(nombreArchivo);
            Desktop.getDesktop().open(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void listaSalidas (ListaVuelos listaVuelos, ListaAeropuerto listaAeropuerto) {
        String nombreArchivo = "ListaSalidas.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            writer.write("Listado de salidas: ");
            writer.newLine();
            writer.newLine();
            writer.newLine();
            writer.write("--------------------------------------------------------------------------------------------------------------");
            for(Aeropuerto aeropuerto : listaAeropuerto.getAeropuertoList()){
                writer.newLine();
                writer.newLine();
                writer.newLine();
                writer.write("Aeropuerto: " + aeropuerto.getName());
                writer.newLine();
                writer.newLine();
                writer.write(String.format("%-25s %-15s %-15s %-10s %-7s %s",
                        "Destino - Aeropuerto", "Duracion", "Compañia", "Avion", "Plazas", "Cronograma"));
                writer.newLine();
                writer.write("--------------------------------------------------------------------------------------------------------------");
                writer.newLine();
                for (Vuelo vuelo: listaVuelos.getVueloList()){
                    if(vuelo.getDepartureAirport().equals(aeropuerto.getCode())){

                        writer.write(String.format("%-25s %-15s %-15s %-10s %-7s %s",
                                listaAeropuerto.getNameByCode(vuelo.getArrivalAirport()),
                                vuelo.getDuration(),
                                vuelo.getCompany(),
                                vuelo.getTypePlane(),
                                vuelo.getSeats(),
                                vuelo.getSchedule()));
                        writer.newLine();
                    }
                }
                writer.write("--------------------------------------------------------------------------------------------------------------");
            }
            File file = new File(nombreArchivo);
            Desktop.getDesktop().open(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void listaEntradas (ListaVuelos listaVuelos, ListaAeropuerto listaAeropuerto) {
        String nombreArchivo = "ListaEntradas.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            writer.write("Listado de entradas: ");
            writer.newLine();
            writer.newLine();
            writer.newLine();
            writer.write("--------------------------------------------------------------------------------------------------------------");
            for(Aeropuerto aeropuerto : listaAeropuerto.getAeropuertoList()){
                writer.newLine();
                writer.newLine();
                writer.newLine();
                writer.write("Aeropuerto: " + aeropuerto.getName());
                writer.newLine();
                writer.newLine();
                writer.write(String.format("%-25s %-15s %-15s %-10s %-7s %s",
                        "Origen - Aeropuerto", "Duracion", "Compañia", "Avion", "Plazas", "Cronograma"));
                writer.newLine();
                writer.write("--------------------------------------------------------------------------------------------------------------");
                writer.newLine();
                for (Vuelo vuelo: listaVuelos.getVueloList()){
                    if(vuelo.getArrivalAirport().equals(aeropuerto.getCode())){

                        writer.write(String.format("%-25s %-15s %-15s %-10s %-7s %s",
                                listaAeropuerto.getNameByCode(vuelo.getDepartureAirport()),
                                vuelo.getDuration(),
                                vuelo.getCompany(),
                                vuelo.getTypePlane(),
                                vuelo.getSeats(),
                                vuelo.getSchedule()));
                        writer.newLine();
                    }
                }
                writer.write("--------------------------------------------------------------------------------------------------------------");
            }
            File file = new File(nombreArchivo);
            Desktop.getDesktop().open(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}