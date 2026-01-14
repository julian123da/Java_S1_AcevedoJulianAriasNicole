package Vistas;

import Controladores.Gestion;
import Controladores.Validaciones;

public class Main {

    public void iniciar() {
        Gestion g = new Gestion();
        Validaciones v = new Validaciones();
        int op;

        do {
            op = v.validacion_entero(
                "=== FUNDACIÓN ===\n1. Registrar persona\n2. Ver personas\n3. Salir", 1, 3);
            switch (op) {
                case 1 -> g.registrarPersona();
                case 2 -> g.verPersonas();
            }
        } while (op != 3);
    }

    public static void main(String[] args) {
        new Main().iniciar();
    }
}
