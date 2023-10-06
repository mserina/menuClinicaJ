package edu.menuClinica.controladores;

import java.util.Scanner;

import edu.menuClinica.servicios.MenuImplementacion;
import edu.menuClinica.servicios.MenuInterfaz;

/*
 * Clase por la que se accede a la aplicacion
 * 29092
 * @author msm
 */
public class Inicio {
	
	/*
	 * Es el metodo principal de nuestra aplicacion
	 * Define el procedimiento, es donde toda accion sale 
	 * y a donde toda accion llega cuando acaba
	 * 29092
	 * @author msm
	 * @param args
	 */
	public static void main (String[] args) {
		
		int seleccionUsuario;
		boolean cerrarMenu = false;
		Scanner comunicacionKey = new Scanner(System.in);
		MenuInterfaz mi = new MenuImplementacion();
		
		
		while(!cerrarMenu) {
			//control de caso con el switch
			
			seleccionUsuario = mi.mostrarMenuYSeleccion(comunicacionKey);
			
			switch(seleccionUsuario) {
			
			case 0:
				System.out.println("[INFO] - Se ejecuta caso 0");
				cerrarMenu = true;
				break;
			case 1:
				System.out.println("[INFO] - Se ejecuta caso 1");
				break;
			case 2:
				System.out.println("[INFO] - Se ejecuta caso 2");
				break;
			case 3:
				System.out.println("[INFO] - Se ejecuta caso 3");
				break;
			case 4:
				System.out.println("[INFO] - Se ejecuta caso 4");
				break;
			case 5:
				System.out.println("[INFO] - Se ejecuta caso 5");
				break;
			default:
				System.out.println("[INFO] - No existe esta opcion");
				break;
			}
		}
		
	}
}
