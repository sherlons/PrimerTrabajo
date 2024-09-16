import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);
        double nota = 0;
        double mediaDeEvaluacion = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("describe que nota le daras a la pelicula Matrix");
            nota = teclado.nextDouble();
            mediaDeEvaluacion = mediaDeEvaluacion + nota;
        }
        System.out.println("la media de evaluacion para Matrix es: " + mediaDeEvaluacion / 3);
    }
}
