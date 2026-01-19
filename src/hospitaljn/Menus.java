package hospitaljn;

import java.util.Scanner;

public class Menus {

    static int validacion(int valorMinimo, int valorMaximo, String mensaje) {
        boolean validar = false;
        int opc = 0;
        do {
            try {
                System.out.println(mensaje);
                opc = new Scanner(System.in).nextInt();
                while (opc < valorMinimo || opc > valorMaximo) {
                    System.out.println("Opcion no valida, Ingresa Nuevamente ");
                    opc = new Scanner(System.in).nextInt();
                }
                validar = true;
            } catch (Exception e) {
                System.out.println("ERROR, SOLO INGRESAR NUMEROS");
            }
        } while (validar == false);
        return opc;
    }

    
    
    static void verPaciente(Pacientes p) {
    if (p != null) {
        System.out.println("-------------------------");
        System.out.println("Nombre: " + p.getNombre());
        System.out.println("Documento: " + p.getNumero_documento());
        System.out.println("Edad: " + p.getEdad());
        System.out.println("Motivo: " + p.getMotivo());
        System.out.println("Teléfono: " + p.getTelefono());
        System.out.println("Estado: " + p.getEstado());
    }
}

    

        public void iniciar() {
        Pacientes p1 = null;
        Pacientes p2 = null;
        Pacientes p3 = null;
        Pacientes p4 = null;
        int op = 0;
        do {
            op = validacion(1, 4, """
                                  --Bienvenidos al Hospital--
                                  1- Registro de paciente
                                  2- Visualizar pacientes registrados
                                  3- Atender pacientes
                                  4. Salir
                                  """);
            switch (op) {
                case 1:
                    System.out.println("Ingrese el nombre del paciente ");
                    String nombre = new Scanner(System.in).nextLine();
                    System.out.println("Ingrese El Numero de documento del paciente ");
                    String numeroDocumento = new Scanner(System.in).nextLine();
                    int edad = validacion(0, 200, "Ingrese la edad del paciente ");
                    System.out.println("Ingrese el motivo ");
                    String motivo = new Scanner(System.in).nextLine();
                    System.out.println("Ingrese el telefono del paciente ");
                    String telefono = new Scanner(System.in).nextLine();

                    if (p1 == null) {
                        p1 = new Pacientes(nombre, numeroDocumento, edad, motivo, telefono, "", "registrado");
                    } else {
                        if (p2 == null) {
                            p2 = new Pacientes(nombre, numeroDocumento, edad, motivo, telefono, "", "registrado");
                        } else {
                            if (p3 == null) {
                                p3 = new Pacientes(nombre, numeroDocumento, edad, motivo, telefono, "", "registrado");
                            } else {
                                if (p4 == null) {
                                    p4 = new Pacientes(nombre, numeroDocumento, edad, motivo, telefono, "", "registrado");
                                } else {
                                    System.out.println("Ya no hay mas cupos Disponibles");
                                }
                            }

                        }

                    }
                    break;
                case 2:
                    verPaciente(p1);
                    verPaciente(p2);
                    verPaciente(p3);
                    verPaciente(p4);
                    break;
                case 3:
                    
                    break;
                    

            }
        } while (op != 4 );           
        
    }
}