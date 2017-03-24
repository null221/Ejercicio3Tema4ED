/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3tema4ed;

/**
 * esta clase es un tipo de vehiculo dedicado al alquiler de personas
 * @author Antonio
 */
public abstract class VehiculoTransporte extends Vehiculo
{
    int numero_plazas;
    
    /**
     * constructor por defecto de la clase vehiculoTransporte
     */
    public VehiculoTransporte()
    {
        numero_plazas = 0;
    }

    public VehiculoTransporte(int numero_plazas) {
        this.numero_plazas = numero_plazas;
    }

    public VehiculoTransporte(int numero_plazas, String matricula, int duracion_alquiler) {
        super(matricula, duracion_alquiler);
        this.numero_plazas = numero_plazas;
    }

    public int getNumero_plazas() {
        return numero_plazas;
    }

    public void setNumero_plazas(int numero_plazas) {
        this.numero_plazas = numero_plazas;
    }

    
    
    
    
    /**
     * metodo importeAlquiler que será abstracto
     * @return 
     */
    @Override
    public abstract double ImporteAlquiler();
    
    /**
     * este metodo muestra por pantalla toda la informacion del alquiler del vehiculo
     */
    @Override
    public void Recibo()
    {
        System.out.println("Matricula: "+super.getMatricula()+"\n"+
        "Duración: "+super.getDuracion_alquiler()+"\n"+
                "Plazas: "+this.numero_plazas+"\n"+
                "Importe: "+this.ImporteAlquiler());
    }
    
    
}
