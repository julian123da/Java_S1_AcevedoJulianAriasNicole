package Modelo;

public class Colaborador extends Persona {
    private int horasMes;
    private String meta;
    private double bonificacion;

    public Colaborador(String documento, String nombre, String apellido, int edad, String direccion,
                       int horasMes, String meta) {
        super(documento, nombre, apellido, edad, direccion);
        this.horasMes = horasMes;
        this.meta = meta;
        this.bonificacion = horasMes * 55000;
    }

    @Override
    public void presentarse() {
        System.out.println("Colaborador: " + nombre + " " + apellido);
        System.out.println("Horas al mes: " + horasMes);
        System.out.println("Meta: " + meta);
        System.out.println("Bonificación: $" + bonificacion);
    }
}
