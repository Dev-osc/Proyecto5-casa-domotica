package domotica.dispositivos;

/**
 *
 *
@author DEVOSC * @since 2022-04-01
 */
public final class Bombilla extends Dispositivo implements Activable, Regulable {

    //atributos
    public static final int MAX_INTENSIDAD = 10;
    public static final int MIN_INTENSIDAD = 0;
    private int intensidad;
    private int numVecesManipulada;

    /**
     * Contructor con dos parámetros de entrada
     *
     * @param descripcion Breve descripción de Bombilla
     * @param ubicacion Punto de encuentro en el que se encuentra la bombilla
     * @throws IllegalArgumentException Posible excepción por la clase
     * Dispositivo y el atributo MAX_UBICACION MIN_UBICACION
     */
    public Bombilla(String descripcion, int ubicacion) throws IllegalArgumentException {
        super(descripcion, ubicacion);
        intensidad = MIN_INTENSIDAD;
    }

    /**
     * Metodo de la clase Bombilla
     *
     * @return Número de veces que se ha manipulado la clase
     */

    public int getNumVecesManipulada() {
        return numVecesManipulada;
    }

    /**
     * Metodo de la interfaz avtivable Nos dice el estado actual de la clase
     * Bombilla
     *
     * @return Si intensidad es mayor a la min_intensidad es true, si no lo es
     * false
     */
    @Override
    public boolean getEstado() { //Nos dice si la bombilla esta encendida o apagada
        return intensidad > MIN_INTENSIDAD; // si intensidad es mayor a la min_intensidad es true, si no lo es false             

    }

    /**
     * Método de la clase Activable
     *
     * @throws IllegalStateException Recoge la posible excepción lanzada por el
     * constructor de Dispositivo
     */
    @Override
    public void on() throws IllegalStateException {
        numVecesManipulada++;
        if (this.getEstado()) {
            throw new IllegalStateException("Bombilla ya encendida");
        }
        this.intensidad = MAX_INTENSIDAD;
    }

    /**
     * Método de la clase Activable
     *
     * @throws IllegalStateException Recoge la posible excepción lanzada por el
     * constructor de Dispositivo
     */
    @Override
    public void off() throws IllegalStateException {

        if (!this.getEstado()) {
            throw new IllegalStateException("Bombilla ya apagada");
        }
        this.intensidad = MIN_INTENSIDAD;
    }

    //
    /**
     * Métodos de la inteface regulable
     *
     * @return La intensidad de Bombilla
     */
    @Override
    public int getIntensidad() {
        return intensidad;
    }

    /**
     * Método de la interface Regulable
     *
     * @return Incremento de intensidad
     */
    @Override
    public int up() {
        numVecesManipulada++;
        if (intensidad < MAX_INTENSIDAD) {
            intensidad++;
        }
        return intensidad;
    }

    /**
     * Método de la interface Regulable
     *
     * @return Decremento de la intensidad
     */
    @Override
    public int down() {
        numVecesManipulada++;
        if (intensidad > MIN_INTENSIDAD) {
            intensidad--;
        }
        return intensidad;
    }

    /**
     * Información de la Bombilla
     *
     * @return Información de Bombilla
     */
    @Override
    public String toString() {
        return super.toString() + " estado: " + (getEstado() ? "encendida" : "apagada") + " int:" + intensidad + " NVM:" + numVecesManipulada;
    }

}
