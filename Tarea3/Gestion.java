package Controladores;

import Modelo.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Gestion extends Funciones {

    ArrayList<Persona> personas = new ArrayList<>();
    Validaciones v = new Validaciones();
    Scanner sc = new Scanner(System.in);

    @Override
    public void registrarPersona() {
        int tipo = v.validacion_entero(
                "1. Empleado\n2. Colaborador\n3. Beneficiario", 1, 3);

        System.out.print("Documento: ");
        String doc = sc.nextLine();
        System.out.print("Nombre: ");
        String nom = sc.nextLine();
        System.out.print("Apellido: ");
        String ape = sc.nextLine();
        int edad = v.validacion_entero("Edad:", 1, 120);
        System.out.print("Dirección: ");
        String dir = sc.nextLine();

        switch (tipo) {
            case 1 -> {
                System.out.print("Cargo: ");
                String cargo = sc.nextLine();
                System.out.print("Horario (8-5 / 2-11): ");
                String horario = sc.nextLine();
                System.out.print("Salario: ");
                double salario = sc.nextDouble();
                sc.nextLine();
                personas.add(new Empleado(doc, nom, ape, edad, dir, salario, cargo, horario));
            }
            case 2 -> {
                int horas = v.validacion_entero("Horas al mes (max 25):", 1, 25);
                System.out.print("Meta voluntaria: ");
                String meta = sc.nextLine();
                personas.add(new Colaborador(doc, nom, ape, edad, dir, horas, meta));
            }
            case 3 -> {
                int ayudas = v.validacion_entero("Ayudas al mes (max 5):", 1, 5);
                personas.add(new Beneficiario(doc, nom, ape, edad, dir, ayudas));
            }
        }
        System.out.println("✅ Persona registrada correctamente");
    }

    @Override
    public void verPersonas() {
        if (personas.isEmpty()) {
            System.out.println("No hay personas registradas");
            return;
        }
        for (Persona p : personas) {
            System.out.println("-------------------------");
            p.presentarse();
        }
    }
}
