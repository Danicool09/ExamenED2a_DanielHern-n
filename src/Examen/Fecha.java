package Examen;
/*Author Daniel Hern�n
 * Version 1.0 
 */


/*Este m�todo realida una validaci�n de la fecha mediante un rango de valores
 * 
 */
public class Fecha {
	public static boolean validarFecha(int anio, int mes, int dia) {
		boolean fechaValida = false;
		if ((dia > 0) && (mes > 0) && (anio > 0)) {
			if ((mes <= 12) && (dia <= 31)) {
				if (mes == 2) {
					fechaValida = dia <= 28;
				} else if (mes % 2 == 0) {
					fechaValida = dia <= 30;
				} else {
					fechaValida = dia <= 31;
				}
			}
		}
		return fechaValida;
	}
}