package domotica.dispositivos;
/**
 *
 * @author DEVOSC
 * @since 2022-04-01
 */
public interface Activable {

    
    /**
     * Metodos abstractos de la clase Activable 
     * @return 
     */
    public abstract boolean getEstado();
    /**
     * Metodos abstractos de la clase Activable 
     * @throws IllegalStateException Recoge la posible excepción lanzada por el constructor de Dispositivo
     */
    public abstract void on() throws IllegalStateException;
    /**
     * Metodos abstractos de la clase Activable 
     * @throws IllegalStateException Recoge la posible excepción lanzada por el constructor de Dispositivo
     */
    public abstract void off() throws IllegalStateException;

}
