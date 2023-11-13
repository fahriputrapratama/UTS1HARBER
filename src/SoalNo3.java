import java.util.Scanner;
public class SoalNo3 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Konversi SuhuCelcius ");

        double celc, fahren, reamur;

        System.out.print("Input Suhu Celsius: ");
        celc = input.nextDouble();

        fahren = (9.0/5.0 * celc) + 32;
        reamur = celc * (4.0/5.0) ;

        System.out.println(celc+" Celcius = "+fahren+" Fahrenheit");
        System.out.println(celc+" Celcius = "+reamur+" Reamur");

    }
}