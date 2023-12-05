import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaAeropuerto listaAeropuerto = new ListaAeropuerto();
        listaAeropuerto.readInfo();
        ListaVuelos listaVuelos = new ListaVuelos();
        listaVuelos.readInfo();
        Menu.menu(listaAeropuerto, listaVuelos);
    }
}