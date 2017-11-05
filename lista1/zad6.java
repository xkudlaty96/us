import java.util.Scanner;
public class zad6 {

    public static void main(String[] args) {
    	Scanner read = new Scanner(System.in);
    	System.out.print("Jestem kalkulatorem\nPierwsza liczba:");
    	double a=read.nextDouble();
    	System.out.print("Znak operacji(+,-,*,/):");
    	String b=read.next();
    	System.out.print("Druga liczba:");
    	double c=read.nextDouble();
    	if(b=="/"&&c==0) {
    		System.out.print("Nie dziel przez 0");
    		return;
    	}
    	if(b=="/"||b=="+"||b=="-"||b=="*") {
    		System.out.print("\nWynik: ");
    		if(b=="/") {
    			System.out.print(a/c);
    		}else if(b=="*") {
    			System.out.print(a*c);
    		}else if(b=="+") {
    			System.out.print(a+c);
    		}else {
    			System.out.print(a-c);
    		}
    	}else System.out.print("bledny znak operacji");
    }

}
