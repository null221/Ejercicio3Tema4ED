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
public abstract class VehiculoCarga extends Vehiculo
{
    private int Tara;
    
    public VehiculoCarga()
    {
        Tara = 0;
    }
    
    /**
     * constructor por parámetros de vehiculoCarga que hereda de vehiculo
     * @param Tara el peso en toneladas del vehiculo
     * @param matricula la matricula del vehiculo
     * @param duracion_alquiler duracion del alquiler en días
     */
    public VehiculoCarga(int Tara, String matricula, int duracion_alquiler) {
        super(matricula, duracion_alquiler);
        this.Tara = Tara;
    }
    
    //métodos get y set de la clase vehiculoTransporte
    public int getTara() {
        return Tara;
    }

    public void setTara(int Tara) {
        this.Tara = Tara;
    }
    
    /**
     * metodo abstracto alquiler
     * el resultado dependerá si es una furgoneta o un camión
     * @return 
     */
    public abstract double ImporteAlquiler();
    
    @Override
    public void Recibo()
    {
        System.out.println("Matricula: "+super.getMatricula()+"\n"+
        "Duración: "+super.getDuracion_alquiler()+"\n"+
                "Tara: "+this.Tara+"\n"+
                "Importe: "+this.ImporteAlquiler());
    }
    
}
