package trian;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

import javax.swing.JFrame;
import javax.swing.JPanel;
/*********************************    */
/*   GENERADOR DE TRIANGULOS   *****  */
/*   Entornos de Desarrollo 2021-2022 */
/*   Versión. 1.0                     */
/**************************************/
public class Triangulo extends JPanel {
	Polygon poly; //atributo para almacenar el polígono
	int xPoly[]; //vector de coordenadas Xeriughetuiogheiuobghithuitheuigtfbeirug
    int yPoly[]; //vector de coordenadas Y uyfgyufi
    Color Fondo; //Color de fondo del polígonohguyfgtyfuyf
    Color Linea; //Color de línea
    
    //Constructor por parámetro para construir un triángulo dadas
    //las 3 coordenadas X y las 3 coordenadas Y
    public Triangulo(int x[], int y[]) {
		xPoly=new int[3];
		yPoly=new int[3];
		xPoly=x;
		yPoly=y;
		Fondo=Color.cyan;
		Linea=Color.black;//Establece colores por defecto
		poly = new Polygon(xPoly, yPoly, xPoly.length);
	}
	//Constructor por parámetro para construir un triángulo dadas
    //las 3 coordenadas X y las 3 coordenadas Y y con colores específicos
    public Triangulo(int x[], int y[],Color F, Color L) {
		xPoly=new int[3];
		yPoly=new int[3];
		xPoly=x;
		yPoly=y;
		Fondo=F;
		Linea=L;
		poly = new Polygon(xPoly, yPoly, xPoly.length);
	}
	//Método para pintar el componente
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Linea);
		g.drawPolygon(poly);
		g.setColor(Fondo);
		g.fillPolygon(xPoly,yPoly,3);
	}
	//Método al que hay que llamar para el que Triángulo sea dibujado en un JFrame (Ventana)
	public void Dibujar() {
			JFrame miForm = new JFrame();
			miForm.setSize(1280,720);
			miForm.setResizable(false);
	        miForm.setVisible(true);
	        miForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            miForm.add(this);
	        
	}
	//método para calcular el área
	public double CalculaArea() {
		
	    double r1=Math.sqrt(Math.pow(xPoly[1]-xPoly[2],2) + Math.pow(yPoly[1]-yPoly[2],2));
	    double r2=Math.sqrt(Math.pow(xPoly[1]-xPoly[0],2) + Math.pow(yPoly[1]-yPoly[0],2));
	    double r3=Math.sqrt(Math.pow(xPoly[2]-xPoly[0],2) + Math.pow(yPoly[2]-yPoly[0],2));
	    double rj=(r1+r2+r3)/2;
	    double r=Math.sqrt(rj*(rj-r1)*(rj-r2)*(rj-r3));
	    /*System.out.println(r);
	    System.out.println(r1);
	    System.out.println(r2);
	    System.out.println(r3);*/
	    //r=Math.round(r*100.0)/100.0;
	    return r;
	    
	    
	}
	//metodo para obtener el perímetro
	public double Perimetro(){
		double r1=Math.sqrt(Math.pow(xPoly[1]-xPoly[2],2) + Math.pow(yPoly[1]-yPoly[2],2));
	    double r2=Math.sqrt(Math.pow(xPoly[1]-xPoly[0],2) + Math.pow(yPoly[1]-yPoly[0],2));
	    double r3=Math.sqrt(Math.pow(xPoly[2]-xPoly[0],2) + Math.pow(yPoly[2]-yPoly[0],2));
	    double r=r1+r2+r3;
	    //System.out.println(r);
		return r;
	}
	//Método main
	public static void main(String args[]) {
		Triangulo a=new Triangulo(new int[] {100,0,400}, new int[] {200,400,400});
		a.Dibujar();
		//a.CalculaArea();
		//a.Perimetro();
	}
}
