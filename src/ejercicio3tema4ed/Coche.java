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
public class Coche extends VehiculoTransporte
{
    /**
     * constructor por defecto de la clase coche
     */
    public Coche() 
    {
        super();
    }
    
    /**
     * constructor por parametros de coche que hereda de vehiculo de transporte que a su vez hereda de vehiculo
     * @param numero_plazas numero de plazas del vehiculo 
     * @param matricula matricula del coche
     * @param duracion_alquiler duración en dias del alquiler
     */
    public Coche(int numero_plazas, String matricula, int duracion_alquiler) {
        super(numero_plazas, matricula, duracion_alquiler);
    }
    
    
   /**
    * sobreescribimos el metodo abstracto de la clase padre vehiculoTransporte
    * @return 
    */
    @Override
    public double ImporteAlquiler() 
    {
      double importe;
      importe = 50*super.numero_plazas+(1.5 * super.getDuracion_alquiler()+super.numero_plazas*1.5);
      return importe;
    }
    
    /**
     * 
     */
    @Override
    public void Recibo()
    {
        System.out.println("------------------\n"+
                "COCHE\n"+
                "------------------\n"+
                "información"); 
        System.out.println("Matricula: "+super.getMatricula()+"\n"+
        "Duración: "+super.getDuracion_alquiler()+"\n"+
                "Plazas: "+super.numero_plazas+"\n"+
                "Importe: "+this.ImporteAlquiler());
        
    }
}
