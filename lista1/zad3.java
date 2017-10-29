import java.util.Scanner;
public class Zadanie3 {
  public static void main(String[] args){
    Scanner reader = new Scanner(System.in);
    System.out.print("Waga: ");
    float wa = reader.nextFloat();
    System.out.print("Wzrost: ");
    float wz = reader.nextFloat();
    float bmi=wa/(wz*wz);
    if(bmi<18.5f){
      System.out.print("niedowaga");
    }else{
      if(bmi>24.9){
        System.out.print("nadwaga");
      }else{
        System.out.print("waga prawidlowa");
      }
    }
  }
}
