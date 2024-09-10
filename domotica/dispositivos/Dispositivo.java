package domotica.dispositivos;
/**
 *
@author DEVOSC * @since 2022-04-01
 */
import domotica.Domotica;

public abstract class Dispositivo {
    
    //Atributos
    
    private int id; //identificador del dispositivo. Número entero, incremental, desde 1
    private static int contadorDispositivos;  //Nos permite calcular el ID de cada dispositivo
    private String descripcion;  //descripción del dispositivo (texto)
    private int ubicacion;       //ubicación del dispositivo (número de estancia o habitación). Número entero
    
    

    
    /**
     * Constructor con dos parametros
     * El contador se incrementa en 1 antes de ser asignado al id de cada nuevo dispositivo
     * @param descripcion 
     * @param ubicacion
     * @throws IllegalArgumentException Recoge la posible excepción cuando la ubicación es mayor que MAX_UBICACION y menor que MIN_UBICACION
     */
    public Dispositivo(String descripcion, int ubicacion) throws IllegalArgumentException {
        if(ubicacion > Domotica.MAX_UBICACION || ubicacion < Domotica.MIN_UBICACION ){
            throw new IllegalArgumentException("Ubicación no válida: " + ubicacion);
        }
        this.descripcion = descripcion;
        this.ubicacion = ubicacion;
        this.id = ++contadorDispositivos; // el contador se incrementa en 1 antes de ser asignado al id de cada nuevo dispositivo, en cambio si el ++ estuviera detras, lo incrementaria despues de la operacion                 

    }

//Getters & setter

     
    
    /**
     * Método de la clase Dispositivo
     * @return Número de Dispositivo
     */
    public int getId() {
        return id;
    }
    /**
     * Método de la clase Dispositivo que recibe parámetro id (int)
     * @param id Número de Dispositivo
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * Método de la clase Dispositivo
     * @return Breve resumen del Dispositivo
     */
    public String getDescripcion() {
        return descripcion;
    }
    /**
     * Método de la clase Dispositivo que recibe parámetro de descripcion
     * @param descripcion Breve resumen del Dispositivo
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    /**
     * Método de la clase Dispositivo
     * @return Ubicación del Dispositivo
     */
    public int getUbicacion() {
        return ubicacion;
    }
    /**
     * Método de la clase Dispositivo que recibe parámetro ubicacion y lo reescribe
     * @param ubicacion Ubicación del dispositivo
     */
    public void setUbicacion(int ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    
    /**
     * Método toString
     * @return Información de Dispositivo
     */
    @Override
    public String toString() {
        return "tipo: " + this.getClass() + " id: " + id + ", descripcion: \"" + descripcion + "\", ubicacion: " + ubicacion ;
    }
    
}


