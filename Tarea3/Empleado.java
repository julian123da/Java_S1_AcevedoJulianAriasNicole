package Modelo;

public class Empleado extends Persona {
    private double salario;
    private String cargo;
    private String horario;

    public Empleado(String documento, String nombre, String apellido, int edad, String direccion,
                    double salario, String cargo, String horario) {
        super(documento, nombre, apellido, edad, direccion);
        this.salario = salario;
        this.cargo = cargo;
        this.horario = horario;
    }

    @Override
    public void presentarse() {
        System.out.println("Empleado: " + nombre + " " + apellido);
        System.out.println("Cargo: " + cargo);
        System.out.println("Horario: " + horario);
        System.out.println("Salario: $" + salario);
    }
}
