import java.util.Scanner;
public class Hauptprogramm {
    public static void main(String[] args){
        Geldwechselautomat automat = new Geldwechselautomat();
        Scanner scanner = new Scanner(System.in);
        boolean waehrung_right = false;
        while(automat.geldwechseln()){
            String waehrung = "";
            while(!waehrung_right){
                System.out.println("Bitte waehlen Sie eine Waehrung aus: ");
                waehrung = scanner.next();
                waehrung_right = true;
            }
            System.out.println("Bitte geben Sie das Geld ein: ");
            float value = scanner.nextFloat();
            System.out.println(value);
            automat.addValue(value);
            System.out.println(automat.toString(waehrung));
        }
    }
}
