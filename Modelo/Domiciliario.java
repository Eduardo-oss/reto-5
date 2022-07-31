package Modelo;

public class Domiciliario extends Empleado {

  private String tipoTransporte;

  public Domiciliario(String tipoTransporte, String puestoTrabajo, float salario, String nombre, String documento, String correo) {
    super(puestoTrabajo, salario, nombre, documento, correo);
    this.tipoTransporte = tipoTransporte;
  }

  public String getTipoTransporte() {
    return tipoTransporte;
  }

  public void setTipoTransporte(String tipoTransporte) {
    this.tipoTransporte = tipoTransporte;
  }

  @Override
  public String toString() {
    return "Persona{" + "nombre=" + nombre + ", documento=" + documento + ", correo=" + correo + "puestoTrabajo=" + puestoTrabajo + ", salario=" + salario + "tipoTransporte=" + tipoTransporte + '}';
  }
  

}
