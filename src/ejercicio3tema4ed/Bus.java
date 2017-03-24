/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3tema4ed;

/**
 *
 * @author Antonio
 */
public class Bus extends VehiculoTransporte
{
    /**
     * Constructor por defecto de la clase bus
     */
    public Bus() 
    {
        super();
    }

    /**
     * constructor por parametros de la clase bus que hereda de vehiculoTransporte y a su vez de vehiculo
     * @param numero_plazas numero de plazas del bus
     * @param matricula numero de matricula del bus
     * @param duracion_alquiler duracion del alquiler en dias del bus
     */
    public Bus(int numero_plazas, String matricula, int duracion_alquiler) {
        super(numero_plazas, matricula, duracion_alquiler);
    }
    
/**
 * metodo alquiler de la clase bus 
 * igual que el alquiler del coche pero con un plus de 2 por plaza
 * @return 
 */
    @Override
    public double ImporteAlquiler() 
    {
        double importe;
        importe = 50*super.numero_plazas+(1.5 * super.getDuracion_alquiler()+super.numero_plazas*1.5)+2*super.numero_plazas;
        return importe;
    }
    
    /**
     * Implementamos la informacion al RECIBO
     */
    @Override
    public void Recibo()
    {
        System.out.println("------------------\n"+
                "BUS\n"+
                "------------------\n"+
                "información"); 
        System.out.println("Matricula: "+super.getMatricula()+"\n"+
        "Duración: "+super.getDuracion_alquiler()+"\n"+
                "Plazas: "+super.numero_plazas+"\n"+
                "Importe: "+this.ImporteAlquiler());
        
    }
    
}
