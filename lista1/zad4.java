import java.util.Scanner;
public class Zadanie4 {
  public static void main(String[] args){
    Scanner reader = new Scanner(System.in);
    System.out.print("Dochod: ");
    double d = reader.nextDouble(),p=0;

    if(d<85528){
      p=d*0.18-556.02;
      if(p<0)p=0;
    }else{
      p=14839.02+(d-85528)*0.32;
    }
    System.out.print("\nPodatek: "+p+" PLN");
  }
}
