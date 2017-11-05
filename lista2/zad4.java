import java.util.Scanner;
public class zad4 {

    public static void main(String[] args) {
    	Scanner read = new Scanner(System.in);


    	int b=0,a;
    	do {
    		a=read.nextInt();

    		b+=a;
    	}while (a!=0);
    	System.out.println(b);
    }

}
