Proyecto: Sistema de Casa Domótica
Este proyecto es una implementación de un sistema de domótica que permite gestionar diversos dispositivos dentro de una casa inteligente. Los dispositivos incluyen bombillas, cerraduras y otros componentes que pueden ser controlados y monitoreados. El sistema permite realizar tareas como encender/apagar dispositivos, ajustar la intensidad de las bombillas, y gestionar cerraduras de forma programática.

-Características del Proyecto
Gestión de Dispositivos: Maneja un conjunto de dispositivos domóticos, tales como bombillas y cerraduras, mediante clases especializadas.
Interfaz Regulable: Para los dispositivos cuya funcionalidad incluye ajustar la intensidad, como las bombillas, se utiliza la interfaz Regulable, que define métodos para aumentar o disminuir la intensidad.
Activación y Control: Implementa métodos para activar y desactivar dispositivos como bombillas y cerraduras a través de la clase CasaDomotica.
Generación de Informes: Proporciona una vista detallada del estado de la casa domótica, mostrando los dispositivos activados y su ubicación dentro de la casa.
Clases Principales

1-CasaDomotica.java:

Clase principal que representa una casa domótica con múltiples dispositivos.
Permite agregar dispositivos y proporciona métodos para consultar el número de bombillas, cerraduras y otros dispositivos en la casa.
Incluye métodos para cerrar cerraduras, activar dispositivos y generar un reporte detallado de los mismos.

2-Dispositivo.java:

Clase abstracta que representa un dispositivo general dentro de la casa, con atributos como descripción, ubicación e identificación.
Métodos de control y visualización (toString) para obtener información detallada de cada dispositivo.

3-Bombilla.java y Cerradura.java:

Subclases de Dispositivo que implementan el comportamiento específico de bombillas y cerraduras.
La clase Bombilla puede implementar la interfaz Regulable para ajustar su intensidad.

4-Regulable.java:

Interfaz que define métodos para ajustar la intensidad de dispositivos como bombillas (up() y down()).

5-Activable.java:

Interfaz que proporciona métodos para activar o desactivar dispositivos.
