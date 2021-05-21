package tresEnRaya;
/** 
 * Clase para jugar al tres en raya
 * @author Daniel
 * @version 1.0
 * @since 1.0
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TresEnRayaa {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	char tablero[][];
	char turno;
	static int tom=4;
	static int contador=0;
	public TresEnRayaa(int tam) {
		tablero=new char[tam][tam];
		for(int i=0;i<tablero.length;i++){
			for(int j=0;j<tablero[i].length;j++) { 
				tablero[i][j]=' ';
			}
		}
		turno='x';
		
		
	}
	public void pintar() {
		for(int i=0;i<tablero.length;i++){
			System.out.print(" | ");
			for(int j=0;j<tablero[i].length;j++) { 
				System.out.print(tablero[i][j] + " | ");
			}
			System.out.println();
			System.out.println("--------------");
		}
	}
	public void jugar() throws NumberFormatException, IOException {
		System.out.println("le toca al jugador "+ turno);
		boolean rep= false;
		do {
			int count=1;
			System.out.println("inserte un numero");
			int x= Integer.parseInt (br.readLine());
			if(x==101010) {
				for(int i=0;i<tablero.length;i++){
					for(int j=0;j<tablero[i].length;j++) { 
						tablero[i][j]='$';
					}
				}
				pintar();
				System.out.println("==================easter egg========================");
				System.out.println("Programado por: Daniel Quiros Donoso");
				System.out.println("           1ª DAM - 2021          ");
				System.out.println("===================================================");
				System.out.println("Juego terminado");
				System.exit(0);
				
			}
				for(int i=0;i<tablero.length;i++){
					for(int j=0;j<tablero[i].length;j++) { 
						if (count==x && tablero[i][j]==' ') {
							tablero[i][j]=turno;
							rep=true;
						}
						
						count++;
					}
				}
				
		} while (rep==false);
		
		
		
	}
	
	public boolean comprobartres() {
		boolean estado=false;
		int i=0;
		int j=0;
		for(i=0;i<tablero.length;i++){
			
			if (tablero[i][j]==tablero[i][j+1] && tablero[i][j+1]==tablero[i][j+2]
							&& tablero[i][j]!=' ') {
				System.out.println("el jugador " + turno + " gana");
				estado=true;
				return estado;
			}
			
		}
		i=0;
		for(j=0;j<tablero.length;j++){
			
			if (tablero[i][j]==tablero[i+1][j] && tablero[i+1][j]==tablero[i+2][j]
							&& tablero[i][j]!=' ') {
				System.out.println("el jugador " + turno + " gana");
				estado=true;
				return estado;
			}
			
		}
		//diagonales
		
		for(i=0;i<tablero.length-2;i++){
			for(j=0;j<tablero[i].length-2;j++) { 
				if (tablero[i][j]==tablero[i+1][j+1] && tablero[i+1][j+1]==tablero[i+2][j+2]
						&& tablero[i][j]!=' ') {
			System.out.println("el jugador " + turno + " gana");
			estado=true;
			return estado;
			}
		}}
		
		for(i=0;i<tablero.length-2;i++){
			for(j=tom-1;j>=2;j--) { 
				if (tablero[i][j]==tablero[i+1][j-1] && tablero[i+1][j-1]==tablero[i+2][j-2]
						&& tablero[i][j]!=' ') {
			System.out.println("el jugador " + turno + " gana");
			estado=true;
			return estado;
			}
		}}
			
		
		if (turno=='x') turno='o';
		else turno='x';
		
		
		return estado;
		
		}
		
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		TresEnRayaa t=new TresEnRayaa(tom);
		t.pintar();
		do {
		t.jugar();
		t.pintar();
		contador++;
		if (contador==tom*tom) System.out.println("juego en tablas");
		}while (!t.comprobartres() & contador<tom*tom);
	}
	

}
