/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3tema4ed;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Antonio
 */
public final class Alquiler implements InterfazDatos
{
    Scanner teclado = new Scanner (System.in);
    private ArrayList<Vehiculo>pedido = new ArrayList<>();
    
    private Coche C;
    private Bus B;
    private Furgoneta F;
    private Camion T;
    
    private String tipo;
    private String matricula;
    private int duracion;
    private int plazas;
    private int tara;
    
    /**
     * Constructor por parametros que pide la informacion del vehiculo
     * @param numero_vehiculos que se han encargado 
     */
    public Alquiler(int numero_vehiculos) 
    {   
        
        for (int i = 0; i < numero_vehiculos-1; i++) 
        {
            System.out.println("¿Que tipo de vehiculo es? (C-coche, B-bus, F-furgoneta, T-camion)");
            tipo = teclado.nextLine();
            
            switch (tipo)
            {
                case "C":
                    System.out.println("Introduce la matricula: ");
                    matricula = teclado.nextLine();
                    C.setMatricula(matricula);
                    System.out.println("Introduce la duración:");
                    duracion = teclado.nextInt();
                    C.setDuracion_alquiler(duracion);
                    System.out.println("Introduce el numero de plazas:");
                    plazas = teclado.nextInt();
                    C.setNumero_plazas(plazas);
                    pedido.add(C);
                    break;
                case "B":
                    System.out.println("Introduce la matricula: ");
                    matricula = teclado.nextLine();
                    B.setMatricula(matricula);
                    System.out.println("Introduce la duración:");
                    duracion = teclado.nextInt();
                    B.setDuracion_alquiler(duracion);
                    System.out.println("Introduce el numero de plazas:");
                    plazas = teclado.nextInt();
                    B.setNumero_plazas(plazas);
                    pedido.add(B);
                    break;
                case "F":
                    System.out.println("Introduce la matricula: ");
                    matricula = teclado.nextLine();
                    F.setMatricula(matricula);
                    System.out.println("Introduce la duración:");
                    duracion = teclado.nextInt();
                    F.setDuracion_alquiler(duracion);
                    System.out.println("Introduce la tara del vehiculo:");
                    tara = teclado.nextInt();
                    F.setTara(tara);
                    pedido.add(F);
                    break;
                case "T":
                    System.out.println("Introduce la matricula: ");
                    matricula = teclado.nextLine();
                    T.setMatricula(matricula);
                    System.out.println("Introduce la duración:");
                    duracion = teclado.nextInt();
                    T.setDuracion_alquiler(duracion);
                    System.out.println("Introduce la tara del vehiculo:");
                    tara = teclado.nextInt();
                    T.setTara(tara);
                    pedido.add(T);
                    break;
            }
        }
    }
    
    /**
     * este metodo suma el total de los importes de los vehiculos encargados
     * @return devuelve el total del importe obtenido
     */
    public double importeTotal ()
    {
        double importe = 0;
        for (int i = 0; i < pedido.size(); i++) 
        {
            importe += pedido.get(i).ImporteAlquiler();
        }
        return importe;
    }
    /**
     * clase que devuelve el importe del vehiculo indicado
     * @param pos indicamos la posicion del array vehiculo que queremos ver el importe
     * @return 
     */
    public double importe(int pos)
    {
        double importe1;
        importe1 = pedido.get(pos).ImporteAlquiler();
        return importe1;
    }
    
    /**
     * mostramos los datos de todos los vehiculos alquilados
     */
    @Override
    public void mostrarDatos() 
    {
        System.out.println("Total alquiler: "+this.importeTotal()+"€");
        System.out.println("***************");
        System.out.println("DETALLE");
        System.out.println("***************");
        for (int i = 0; i < pedido.size(); i++) 
        {
            System.out.println("Vehiculo "+pedido.get(i));
            System.out.println("Información del vehículo");
            pedido.get(i).Recibo();
            
        }
    }
    
}
