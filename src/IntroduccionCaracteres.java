import java.util.Scanner;

public class IntroduccionCaracteres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Como te llamas");
        String nombre = scanner.nextLine();
        System.out.println( "Hola "+ nombre +" Bienvenido");
    }
}
