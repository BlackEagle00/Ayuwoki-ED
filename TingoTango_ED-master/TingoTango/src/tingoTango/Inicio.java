package tingoTango;

import javax.swing.JOptionPane;
import java.util.LinkedList;

public class Inicio {
	
	public static void main (String [] args) {
		
		Acciones acc = new Acciones ();
		int sentido = 0;
		int numRondas = 1;
		int inicio = 0;
		LinkedList <String> jugadores = new LinkedList <String>();
		LinkedList <String> listaElm = new LinkedList <String> ();
		int numJ = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de jugadores:"));	
		acc.agregarJ(jugadores, numJ);
		
		do {
			
			if(numJ == 0) {
				JOptionPane.showMessageDialog(null, "No hay jugadores suficientes para jugar.\n0 rondas jugadas.");
				break;
			}else {
				if(numJ <= 1) {
					JOptionPane.showMessageDialog(null, "El jugador ganador es: " + jugadores + ".\n" + "Numero de rondas jugadas: " + numRondas + ".");
					break;
				}else {
									
					int tingo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de veces que se movera la pelota:"));
					acc.tingo(jugadores, listaElm, tingo, sentido, inicio);
					JOptionPane.showMessageDialog(null, "Perdedor de la ronda " + numRondas + ": " + "[" +listaElm.getLast() + "]");
					if(jugadores.size() == 1) {
						JOptionPane.showMessageDialog(null, "El ganador es " + jugadores + "\nNumero de rondas jugadas: " + numRondas + "\nJugadores Eliminados: " + listaElm);
						break;
					}else {
						String nombre = JOptionPane.showInputDialog("Orden del circulo para la siguiente ronda: " + jugadores + "\nIngrese el nombre de la persona que iniciara la ronda");
						inicio = acc.buscarNombre(jugadores, nombre);
						while(inicio == -1) {
							nombre = JOptionPane.showInputDialog("El nombre ingresado no existe, intentelo nuevamente\nOrden del circulo para la siguiente ronda: " + jugadores + "\nIngrese el nombre de la persona que iniciara la ronda");
							inicio = acc.buscarNombre(jugadores, nombre);
						}
						
					}
					numRondas += 1;
					sentido += 1;
					System.out.println(jugadores + "\n" + listaElm);
				}
			}
			
			
		}while (jugadores.size() > 0);
		
	}

}
