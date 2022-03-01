import java.util.Scanner;
public class Geldwechselautomat {
    private static String[] feld = {"2.00 ", "1.00 ", "0.50 ", "0.20 ", "0.10 ", "0.05 ", "0.02 ", "0.01 "};
    private int[] muenzen;
    private int[] nenner = {200,100,50,20,10,5,2,1};
    public Geldwechselautomat(){
        muenzen = new int[8];
    }
    public boolean geldwechseln(){
        System.out.println("Bitte geben Sie 0(kein Geld wechseln) oder x(Geld wechseln) ein: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        return number == 0 ? false:true;
    }
    public void addValue(float value){//314.46€
        int geld = Math.round(value * 100);
        for(int i = 0; i < 8; i++){
            muenzen[i] = geld / nenner[i];
            geld %= nenner[i];
        }
    }
    public String toString(String waehrung){
        String ausgabe = "Die Ausgabe: \n";
        for(int i = 0; i < 8; i++){
            if(muenzen[i] != 0)
            ausgabe += muenzen[i] + "x " + feld[i] + waehrung + "\n";
        }
        return ausgabe;
    }
}
