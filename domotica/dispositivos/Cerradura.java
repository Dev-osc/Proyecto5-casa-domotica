package domotica.dispositivos;
/**
 *
@author DEVOSC * @since 2022-04-01
 */
public final class Cerradura extends Dispositivo implements Activable {

    //atributos
    private boolean estado;

    
    /**
     * Contructor con tres parámetros
     * @param descripcion Breve descripción de Dispositivo
     * @param ubicacion Ubicación del dispositivo (número de estancia o habitación). Número entero
     * @param estado Atributo para definir el estado del Dispositivo
     * @throws IllegalArgumentException Recoge la posible excepción lanzada por el constructor de Dispositivo
     */
    public Cerradura(String descripcion, int ubicacion, boolean estado) throws IllegalArgumentException {
        super(descripcion, ubicacion);

        this.estado = estado;
    }

    
    /**
     * Contructor con dos parámetros
     * @param descripcion Breve descripción de Dispositivo este Dispositivo por defecto en estado: false
     * @param ubicacion Ubicación del dispositivo (número de estancia o habitación). Número entero
     * @throws IllegalArgumentException Recoge la posible excepción lanzada por el constructor de Dispositivo
     */
    public Cerradura(String descripcion, int ubicacion) throws IllegalArgumentException {
        super(descripcion, ubicacion);
        estado = false;
    }

    //
    /**
     * Métodos implementados de la clase Activable
     * @return Devuelve el estado 
     */
    @Override
    public boolean getEstado() {
        return estado;
    }
    /**
     * Métodos implementados de la clase Activable
     * @throws IllegalStateException Recoge la posible excepción si la cerradura ya está activa (cerrada)
     */
    @Override
    public void on() throws IllegalStateException {
        if (estado) {
            throw new IllegalStateException(" Cerradura ya activada (cerrada) ");
        } 
        estado = true;
    }
    /**
     * Métodos implementados de la clase Activable
     * @throws IllegalStateException Recoge la posible excepción si la cerradura ya está desactivada (abierta)
     */
    @Override
    public void off() throws IllegalStateException {
        if (!estado) {
            throw new IllegalStateException(" Cerradura ya desactivada (abierta) ");
        }
        estado = false;
    }
    /**
     * Información de la clase Cerradura
     * @return Información de Cerradura
     */
    @Override
    public String toString() {
        return super.toString() + " estado: " + (estado ? "cerrada" : "abierta");
    }

}
