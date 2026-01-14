package Modelo;

public class Beneficiario extends Persona {
    private int ayudasMes;

    public Beneficiario(String documento, String nombre, String apellido, int edad, String direccion,
                        int ayudasMes) {
        super(documento, nombre, apellido, edad, direccion);
        this.ayudasMes = ayudasMes;
    }

    @Override
    public void presentarse() {
        System.out.println("Beneficiario: " + nombre + " " + apellido);
        System.out.println("Ayudas mensuales: " + ayudasMes);
    }
}
