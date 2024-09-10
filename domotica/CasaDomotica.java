package domotica;

/**
 *
 * @author DEVOSC
 * @since 2022-04-01
 */
import domotica.dispositivos.Activable;
import domotica.dispositivos.Bombilla;
import domotica.dispositivos.Cerradura;
import domotica.dispositivos.Dispositivo;

public class CasaDomotica {

    //atributos
    private String propietario;
    private String descripcion;
    private Dispositivo[] dispositivos;

    /**
     * Constructor de la clase CasaDomotica con tres parámetros
     *
     * @param propietario Nombre del propietario de la casaDomotica
     * @param descripcion Breve descripción de la casaDomotica
     * @param dispositivos Conjunto de los dispositivos que tiene esta casa
     *
     */
    public CasaDomotica(String propietario, String descripcion, Dispositivo... dispositivos) {
        this.propietario = propietario;
        this.descripcion = descripcion;
        this.dispositivos = dispositivos;
    }

    /**
     *
     * @return Número de dispositivos de esta casa
     */
    public int getNumDispositivos() {

        return dispositivos.length;

    }

    /**
     *
     * @return Número de Bombillas de esta casa
     */
    public int getNumBombillas() {

        int numBombillas = 0;
        for (Dispositivo d : dispositivos) {
            if (d instanceof Bombilla) {
                numBombillas++;

            }

        }
        return numBombillas;

    }

    /**
     *
     * @return Número de Cerraduras de esta casa
     */
    public int getNumCerraduras() {
        int numCerraduras = 0;
        for (Dispositivo d : dispositivos) {
            if (d instanceof Cerradura) {
                numCerraduras++;

            }

        }
        return numCerraduras;

    }

    /**
     * Buscamos la clase Cerradura en dispositivos y aplicamos el metodo .on()
     *
     * @return Número de cerraduras que se han cerrado de forma efectiva
     */
    public int cerrarCerraduras() {
        int cerradurasCerradas = 0;
        for (Dispositivo d : dispositivos) {
            if (d instanceof Cerradura) {
                try {
                    ((Cerradura) d).on();
                    cerradurasCerradas++;// Ha esta linea solo se llega cuando el metodo .on() no lanza la expcepcion IllegalStateException.
                } catch (IllegalStateException illegalStateException) {
                }
            }
        }
        return cerradurasCerradas;
    }

    /**
     * Buscamos la clase Activable en Dispositivos y aplicamos .on()
     *
     * @return Número de dispositivos que estan activables
     */
    public int activarDispositivosActivables() {
        int dispositivosActivados = 0;
        for (Dispositivo d : dispositivos) {
            if (d instanceof Activable) { //En este caso usamos instanceoff para saber si el dispositivo implementa la clase activable
                try {
                    ((Activable) d).on();
                    dispositivosActivados++;// Ha esta linea solo se llega cuando el metodo .on() no lanza la expcepcion IllegalStateException.
                } catch (IllegalStateException illegalStateException) {
                }
            }
        }
        return dispositivosActivados;

    }

    /**
     *
     * @return Información de la casa domotica
     *
     */
    @Override
    public String toString() {
        String s = "+--------------------------------------------------------------------------------------------------------------------------------------------+\n";
        s += String.format("|%-140s|\n", "CASA DOMOTICA");
        s += String.format("|%-140s|\n", "Propietario: " + propietario);
        s += String.format("|%-140s|\n", "Descripción: " + descripcion);

        for (int i = 1; i <= Domotica.MAX_UBICACION; i++) {
            s += "+--------------------------------------------------------------------------------------------------------------------------------------------+\n";
            s += String.format("|%-140s|\n", "Estancia: " + i);
            s += String.format("|%-140s|\n", "");

            for (Dispositivo d : dispositivos) {

                if (d.getUbicacion() == i) {
                    s += String.format("|%-140s|\n", d.toString());
                }

            }

        }
        s += "+--------------------------------------------------------------------------------------------------------------------------------------------+\n";
        return s;

    }
}
