import java.util.Scanner;
public class zad1 {
  public static void main(String[] args){
    Scanner reader = new Scanner(System.in);
    float stopnie = reader.nextFloat();
    stopnie=(stopnie*1.8f)+32.0f;
    System.out.print(stopnie);
  }
}
