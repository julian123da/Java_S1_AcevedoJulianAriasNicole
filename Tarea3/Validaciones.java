package Controladores;

import java.util.Scanner;

public class Validaciones {

    public int validacion_entero(String mensaje, int min, int max) {
        Scanner sc = new Scanner(System.in);
        int valor;
        while (true) {
            try {
                System.out.println(mensaje);
                valor = sc.nextInt();
                sc.nextLine();
                if (valor >= min && valor <= max) {
                    return valor;
                }
                System.out.println("Fuera de rango");
            } catch (Exception e) {
                System.out.println("Solo números");
                sc.nextLine();
            }
        }
    }
}
