import java.util.Scanner;
public class zad3 {

    public static void main(String[] args) {
    	Scanner read = new Scanner(System.in);

    	int a=read.nextInt();
    	int b=1;
    	do {
    		System.out.println(b);
    		b*=2;
    	}while (b<=a);
    }

}
