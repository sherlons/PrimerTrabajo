import java.util.Arrays;
import java.util.Scanner;
public class Lectura {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Esacribe el nombre de tu pelicula favorita");
        String pelicula = teclado.nextLine();
        System.out.println("Ahora es cribe la fecha de lazamiento");
        int fechaDeLanzamiento = teclado.nextInt();
        System.out.println("por ultimo dinos que nota le das a esta pelicula");
        double nota = teclado.nextDouble();

        System.out.println(pelicula);
        System.out.println(fechaDeLanzamiento);
        System.out.println(nota);
    }
}
