package trian;

import static org.junit.Assert.*;

import org.junit.Test;
//daniel quiros donoso

public class primeraprueva {

	@Test
	public void provarmetosdossimples() {
		Triangulo a=new Triangulo(new int[] {100,0,400},new int[] {200,300,400});
		double s = a.CalculaArea();
		double p =a.Perimetro();
		System.out.println(s);
		System.out.println(p);
		
		Triangulo b=new Triangulo(new int[] {300,100,500},new int[] {100,200,200});
		double s2 = b.CalculaArea();
		double p2 =b.Perimetro();
		System.out.println(s2);
		System.out.println(p2);
	}

}
