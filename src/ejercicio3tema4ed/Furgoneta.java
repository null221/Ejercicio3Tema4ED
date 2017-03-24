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
public class Furgoneta extends VehiculoCarga
{
    
    /**
     * constructor por defecto
     */
    public Furgoneta()
    {
        super();
    }

    /**
     * constructor por parametros de la clase furgoneta heredando las variables de la clase padre vehiculo de carga
     * @param Tara peso del vehiculo
     * @param matricula matricula del vehiculo
     * @param duracion_alquiler duracion del alquiler en dias
     */
    public Furgoneta(int Tara, String matricula, int duracion_alquiler) {
        super(Tara, matricula, duracion_alquiler);
    }
    
    
    /**
     * metodo importe del alquiler para calcular el importe total del alquiler
     * @return 
     */
    @Override
    public double ImporteAlquiler() 
    {
        double importe;
        importe = 50*super.getDuracion_alquiler()+20*super.getTara();
        return importe;
    }
    
    @Override
    public void Recibo()
    {
        System.out.println("------------------\n"+
                "FURGONETA\n"+
                "------------------\n"+
                "información"); 
        System.out.println("Matricula: "+super.getMatricula()+"\n"+
        "Duración: "+super.getDuracion_alquiler()+"\n"+
                "Plazas: "+super.getTara()+"\n"+
                "Importe: "+this.ImporteAlquiler());
    }
}
