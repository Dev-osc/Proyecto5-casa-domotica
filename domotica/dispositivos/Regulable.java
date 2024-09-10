package domotica.dispositivos;
/**
 *
@author DEVOSC * @since 2022-04-01
 */
public interface Regulable {
    /**
     * Método de la clase Regulable
     * @return 
     */
    public abstract int getIntensidad();
    /**
     * Método de la clase Regulable
     * @return 
     */
    public abstract int up();  
    /**
     * Método de la clase Regulable
     * @return 
     */
    public abstract int down();
    
    
}
