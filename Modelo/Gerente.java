
package Modelo;


public class Gerente extends Empleado{
  private int cantSubordinados;

  public Gerente(int cantSubordinados, String puestoTrabajo, float salario, String nombre, String documento, String correo) {
    super(puestoTrabajo, salario, nombre, documento, correo);
    this.cantSubordinados = cantSubordinados;
  }

  public int getCantSubordinados() {
    return cantSubordinados;
  }

  public void setCantSubordinados(int cantSubordinados) {
    this.cantSubordinados = cantSubordinados;
  }

  @Override
  public String toString() {
    return "Persona{" + "nombre=" + nombre + ", documento=" + documento + ", correo=" + correo + "puestoTrabajo=" + puestoTrabajo + ", salario=" + salario + "cantSubordinados=" + cantSubordinados + '}';
    
  }

  
  
  
}
