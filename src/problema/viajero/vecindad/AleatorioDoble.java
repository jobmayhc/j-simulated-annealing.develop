/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.viajero.vecindad;

import problema.viajero.EsquemaViajero;
import problema.viajero.SolucionViajero;
import simulacion.Util;
import simulacion.simulatedAnnealing.EsquemaVecindad;
import simulacion.simulatedAnnealing.Solucion;

/**
 * Se escoge aleatoriamente un punto y se intercambia con la siguiente en la
 * solucion actual
 * @author John Arevalo
 */
public class AleatorioDoble implements EsquemaVecindad {

    private EsquemaViajero esquemaViajero;

    public AleatorioDoble(EsquemaViajero esquemaViajero) {
        this.esquemaViajero = esquemaViajero;
    }

    public Solucion getVecino(Solucion solucionActual) {

        //Se realiza una copia de la solucionActual
        SolucionViajero nuevaSolucion = new SolucionViajero((SolucionViajero) solucionActual);
        // Obtener una posicion aleatoria en la solucion
        int aleatorio = Util.generarAleatorio(esquemaViajero.getPuntos().size() - 1);
        int aleatorio2 = Util.generarAleatorio(esquemaViajero.getPuntos().size() - 1);
        while (aleatorio == aleatorio2) {
            aleatorio2 = Util.generarAleatorio(esquemaViajero.getPuntos().size() - 1);
        }
        nuevaSolucion.intercambiar(aleatorio, aleatorio2);
        return nuevaSolucion;
    }

    public String getDescripcion() {
        return "Escoge dos puntos aleatoriamente en la solución actual y los intercambia entre si";
    }
}
