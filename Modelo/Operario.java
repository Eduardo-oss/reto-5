
package Modelo;


public class Operario extends Empleado{
  private boolean manejoMaquinariaP;

  public Operario(boolean manejoMaquinariaP, String puestoTrabajo, float salario, String nombre, String documento, String correo) {
    super(puestoTrabajo, salario, nombre, documento, correo);
    this.manejoMaquinariaP = manejoMaquinariaP;
  }

  public boolean isManejoMaquinariaP() {
    return manejoMaquinariaP;
  }

  public void setManejoMaquinariaP(boolean manejoMaquinariaP) {
    this.manejoMaquinariaP = manejoMaquinariaP;
  }

  @Override
  public String toString() {
    return "Persona{" + "nombre=" + nombre + ", documento=" + documento + ", correo=" + correo + "puestoTrabajo=" + puestoTrabajo + "manejoMaquinariaP=" + manejoMaquinariaP + '}';
  }
  
}
