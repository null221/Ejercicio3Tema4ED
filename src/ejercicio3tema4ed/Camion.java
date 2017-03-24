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
public class Camion extends VehiculoCarga
{
    /**
     * constructor por defecto de camion
     */
    public Camion()
    {
        super();
    }

    /**
     * constructor por parametros de la clase camion
     * @param Tara el peso en toneladas del vehiculo
     * @param matricula matricula del vehiculo
     * @param duracion_alquiler duracion del alquiler en dias
     */
    public Camion(int Tara, String matricula, int duracion_alquiler) {
        super(Tara, matricula, duracion_alquiler);
    }
    
    
    
    /**
     * sobreescribimos el metodo importeAlquiler con los valores del camion
     * @return 
     */
    @Override
    public double ImporteAlquiler() 
    {
        double importe;
        importe = 50*super.getDuracion_alquiler()+20*super.getTara()+40;
        return importe;
    }
    
    @Override
    public void Recibo()
    {
        System.out.println("------------------\n"+
                "CAMION\n"+
                "------------------\n"+
                "información"); 
        System.out.println("Matricula: "+super.getMatricula()+"\n"+
        "Duración: "+super.getDuracion_alquiler()+"\n"+
                "Plazas: "+super.getTara()+"\n"+
                "Importe: "+this.ImporteAlquiler());
    
    }
    
}
