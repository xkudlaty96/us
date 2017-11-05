
import java.util.Scanner;
import java.util.Random;
public class zad6 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		Random los=new Random();
		int a=1+los.nextInt(100);
		System.out.print("za duzo za malo\npodaj liczbe od 1 do 100:");
		int b=reader.nextInt();
		do{
			b = reader.nextInt();
			if(b<a){
				System.out.println("za mala");
			}
			else if (b>a) {
				System.out.println("za duza");
			}
		}while(b!=a);
			System.out.println("trafione");
	}
}
