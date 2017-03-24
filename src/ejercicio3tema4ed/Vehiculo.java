/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3tema4ed;

/**
 * de esta clase heredarán los vehiculos de transporte y los vehiculos de carga
 * @author Antonio
 */
public abstract class Vehiculo 
{
    //atributos de la clase vehiculo que heredaran todas las clases
    private String matricula;
    private int duracion_alquiler;
    
    /**
     * contructor por defecto
     */
    public Vehiculo()
    {
        matricula = "";
        duracion_alquiler = 0;
    }
    /**
     * constructor por parametros
     * @param matricula matricula del vehiculo
     * @param duracion_alquiler duracion del alquiler en dias
     */
    public Vehiculo(String matricula, int duracion_alquiler) {
        this.matricula = matricula;
        this.duracion_alquiler = duracion_alquiler;
    }
    //metodos get y set de la clase vehiculo
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getDuracion_alquiler() {
        return duracion_alquiler;
    }

    public void setDuracion_alquiler(int duracion_alquiler) {
        this.duracion_alquiler = duracion_alquiler;
    }
    /**
     * metodo importe alquiler que devuelve un double
     * el resultado dependera del tipo de vehiculo 
     * @return 
     */
    public abstract double ImporteAlquiler();
    
    /**
     * este metodo solo nos muestra los datos del vehiculo
     */
    public abstract void Recibo();
    
    
    
    
    
}
