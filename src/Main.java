import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b,c,s, cevre;
        double alan;
        Scanner input = new Scanner(System.in);
        System.out.println("Üçgen Alan Hesaplayıcı\nLütfen kenar uzunluklarını giriniz..");
        System.out.print("1. Kenar: ");
        a = input.nextInt();
        System.out.print("2. Kenar: ");
        b = input.nextInt();
        System.out.print("3. Kenar: ");
        c = input.nextInt();
        cevre = (a+b+c);
        s= cevre/2;
        alan = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Alan: " + alan);
    }
}