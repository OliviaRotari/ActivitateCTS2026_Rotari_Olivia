package ro.ase.cts.program;

import ro.ase.cts.clase.ISubscription;
import ro.ase.cts.fabrici.FabricaAbonamente;
import ro.ase.cts.fabrici.TipAbonament;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestareFabricaAbonamente {
    public static void main(String[] args) {
        FabricaAbonamente factoryAbonamente = new FabricaAbonamente();
        List<ISubscription> listaAbonamente = new ArrayList<ISubscription>();

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduceti numarul de abonamente: ");
            int numarAbonamente = scanner.nextInt();
            for (int i = 0; i < numarAbonamente; i++) {
                System.out.println("Introduceti detaliile corespunzatoare ABONAMENTULUI " + (i + 1) + ":");
                System.out.println("\t-> Tip abonament ( MOBILITY_X, MOBILITY_Y, MOBILITY_Z): ");
                TipAbonament tip = TipAbonament.valueOf(scanner.next().toUpperCase());
                System.out.println("\t-> Pretul pe luna: ");
                double pretPeLuna = scanner.nextDouble();
                listaAbonamente.add(factoryAbonamente.creeazaAbonament(tip, pretPeLuna));
            }

            System.out.println("Introduceti numarul de luni contractuale pentru a primi ofertele abonamentelor: ");
            int numarLuniContractuale = scanner.nextInt();

            System.out.println("LISTA ABONAMENTE:\n");
            for (int i = 0; i < listaAbonamente.size(); i++) {
                System.out.println("ABONAMENTUL " + (i + 1) + ":");
                listaAbonamente.get(i).detaliiAbonament();
                System.out.println("Costul abonamentului pentru o perioada de " + numarLuniContractuale + " luni: "
                        + Math.round(listaAbonamente.get(i).CalculeazaCostulAbonamentului(numarLuniContractuale)) + " RON");
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
