package examen2;

import java.util.ArrayList;
import java.util.List;

public class Prueba {
    public static void main(String[] args) {
        Motocicleta moto1 = new Motocicleta("Honda", "2", 1200, "XMC");
        Motocicleta moto2 = new Motocicleta("Susuki", "3", 700, "H2");
        Turismo turismo1 = new Turismo("Isuzu", "4", 4, 200);
        Turismo turismo2 = new Turismo("Toyota", "4", 2, 180);
        Turismo turismo3 = new Turismo("Ferrari", "4", 4, 300);

        Conductor conduc1 = new Conductor("Carlos", "023492394");
        conduct1.asigVeiculo(moto1);

        Conductor conduc2 = new Conductor("Daniel", "3253253");
        conduc2.asigVeiculo(turismo1);

        System.out.println("Marca motos");
        // Imprimir la marca de las motocicletas
        System.out.println("Marca de la motocicleta 1: " + moto1.getMarca());
        System.out.println("Marca de la motocicleta 2: " + moto2.getMarca());
        System.out.println("");

        // Imprimir la cantidad de ruedas de las motocicletas
        System.out.println("Cantidad de ruedas motos");
        System.out.println("Ruedas de la motocicleta 1: " + moto1.getRuedas());
        System.out.println("Ruedas de la motocicleta 2: " + moto2.getRuedas());
        System.out.println("");
        
        // Imprimir la marca de los Turismos
        System.out.println("Marca Turismos");
        System.out.println("Marca del turismo 1: " + turismo1.getMarca());
        System.out.println("Marca del turismo 2: " + turismo2.getMarca());
        System.out.println("Marca del turismo 3: " + turismo3.getMarca());
        System.out.println("");

        // Imprimir la cantidad de ruedas de los Turismos
        System.out.println("Cantidad de ruedas turismos");
        System.out.println("Ruedas del turismo 1: " + turismo1.getRuedas());
        System.out.println("Ruedas del turismo 2: " + turismo2.getRuedas());
        System.out.println("Ruedas del turismo 3: " + turismo3.getRuedas());
        System.out.println("");

        // Imprimir la lista de motocicletas y turismos
        List<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(moto1);
        vehiculos.add(moto2);
        vehiculos.add(turismo1);
        vehiculos.add(turismo2);
        vehiculos.add(turismo3);

        System.out.println("Lista de vehículos:");
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo);
        }
    }
}
