package trian;
//daniel quiros donoso
import static org.junit.Assert.*;

import org.junit.Test;

public class segundaprueva {

	@Test
	public void test() {
		Triangulo a=new Triangulo(new int[] {100,0,400},new int[] {200,300,400});
		assertEquals(25000.0,a.CalculaArea(),0.1);
		Triangulo b=new Triangulo(new int[] {300,100,500},new int[] {100,200,200});
		assertEquals(20000.0,b.CalculaArea(),0.1);
		Triangulo c=new Triangulo(new int[] {100,200,300},new int[] {200,200,300});
		assertEquals(5000.0,c.CalculaArea(),0.1);
		Triangulo d=new Triangulo(new int[] {0,0,300},new int[] {0,200,300});
		assertEquals(30000.0,d.CalculaArea(),0.1);
		Triangulo e=new Triangulo(new int[] {0,50,90},new int[] {50,80,100});
		assertEquals(100.0,e.CalculaArea(),0.1);
	}

}
