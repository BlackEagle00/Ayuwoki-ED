package tingoTango;

import java.util.LinkedList;
import javax.swing.JOptionPane;

public class Acciones {

	/**
	 * 
	 * @param jugadores
	 * @param numJ
	 */
	public void agregarJ (LinkedList <String>jugadores, int numJ) {
		for (int i = 0; i < numJ; i++) {
			jugadores.add(JOptionPane.showInputDialog("Ingrese el nombre del jugador: " + (i + 1)));
		}
	}
	
	/**
	 * 
	 * @param jugadores
	 * @param listaElm
	 * @param tingo
	 * @param sentido
	 */
	public void tingo (LinkedList <String> jugadores, LinkedList <String> listaElm , int tingo, int sentido, int inicio) {
		int indice = inicio + tingo;
	
		if (sentido % 2 == 0) {
			if(tingo == 0) {
			}else {
				if(indice > jugadores.size()) {
					String jElm = jugadores.remove((indice % jugadores.size()));
					listaElm.add(jElm);
				}else {
					String jElm = jugadores.remove(tingo);
					listaElm.add(jElm);
				}
			}
		}else {
			jugadores.descendingIterator();
			if(tingo == 0) {
				
			}else {
				if(jugadores.size() <= tingo) {
					String jElm = jugadores.remove((indice % jugadores.size()));
					listaElm.add(jElm);
				}else {
					String jElm = jugadores.remove(tingo);
					listaElm.add(jElm);
				}
			}
		}
	}
	
	/**
	 * 
	 * @param jugadores
	 * @param nombre
	 */
	public int buscarNombre(LinkedList <String> jugadores, String nombre) {
		int index = 0;
		for (int i = 0; i < jugadores.size(); i++) {
			if(jugadores.get(i).equalsIgnoreCase(nombre)){
				index = i;
				break;
			}else {
				index = -1;
			}
		}
		return index;
	}
}





















