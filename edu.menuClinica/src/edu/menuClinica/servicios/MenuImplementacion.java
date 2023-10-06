package edu.menuClinica.servicios;

import java.util.Scanner;



/*
 * Implementacion que enumera los metodos del menu
 * 06/10/23 - msm
 */
public class MenuImplementacion implements MenuInterfaz {

	@Override
	public int mostrarMenuYSeleccion(Scanner comunicacionTecladoM) {
		
		int opcionSeleccionada;
		
		System.out.println("######################################");
		System.out.println("0. Cerrar la aplicacion");
		System.out.println("1. Cerrar la aplicacion");
		System.out.println("2. Ingreso de paciente");
		System.out.println("3. Alta de paciente");
		System.out.println("4. Resumen de ingresos y altas");
		System.out.println("5.Historial de pacientes");
		System.out.println("######################################");
		System.out.println("Seleccione opcion");
		
		
		//Se encaga de guardar y convertir nuestra respuesta en int (nextInt)
		opcionSeleccionada = comunicacionTecladoM.nextInt();
		
		return opcionSeleccionada;
		
		
	}

}
