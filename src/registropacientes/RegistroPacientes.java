package registropacientes;

import java.util.Scanner;

public class RegistroPacientes {
    
    static int validacion (int minvalor, int maxvalor, String mensaje) {
    boolean validar = false;
    int op = 0;
    do {
        try {
            op = new Scanner (System.in).nextInt();
            while (op < minvalor || op > maxvalor) {
                System.out.println("Opcion no");}
            System.out.println("Opcion invalida, intente una vez más");
        }
        validar = true;
        
    } while (validar == false); 
    }

    /*public static void main(String[] args) {
        do {
            System.out.println("""
                               **************************
                               * BIENVENIDO AL REGISTRO *
                               *       DE PACIENTES     *
                               **************************
                               *                        *
                               *Escriba el número de la *
                               *     opción deseada     *
                               *                        *
                               *  1) Registrar paciente *
                               *  2) Mostrar Pacientes  *
                               *  3) Atender paciente   *
                               *        4) Salir        *
                               **************************
                               """);

            int op = new Scanner (System.in).nextInt();
            
            while (op<1 || op>4){
                System.out.println("""
                                   No es posible validar la opción ingresada.
                                   Por favor, Escribe el número de la opción
                                   1, 2, 3 o 4""");
                
            }
            
        } while (op != 4);
        System.out.println("""
                                   No es posible validar la opción ingresada.
                                   Por favor, Escribe el número de la opción
                                   1, 2, 3 o 4""");
    }*/
        
    
}
