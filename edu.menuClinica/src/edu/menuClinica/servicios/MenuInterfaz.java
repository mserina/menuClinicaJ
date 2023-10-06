package edu.menuClinica.servicios;

import java.util.Scanner;

/*
 * Interfaz que enumera los metodos de la funcionalidad del menu
 */

public interface MenuInterfaz {
	/*
	 * Mostrar el menu y que recoga la opcion seleccionada
	 * author msm
	 * @return el numero de la accion que devuelve el usuario
	 */
	public int mostrarMenuYSeleccion(Scanner comunicacionTecladoM);

}
