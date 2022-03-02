/**
 * 
 */
package LAB1;
import java.lang.Math;

/**
 * @author ACER
 *
 */
public class bai1_test {
	//static int x,y;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double x,y;
		// TODO Auto-generated method stub
		x = 291.51;
		y = 20;
		double z = x+y;
		System.out.println("x = " +x++);
		System.out.println("y = " +y);
		System.out.println("z = " +z);
		System.out.println("so nho nhat la: " + Math.min(y,x));
		System.out.println("So lon nhat la: "+Math.max(x,y));
		char c=80;
		System.out.println("ky tu c la: " +c);
		System.out.println(Math.round(x));
		System.out.println(Math.ceil(x));
	}

}
