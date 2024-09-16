import java.util.Scanner;

public class Evaluaciones {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double mediaDeEvaluacion = 0 ;
        double totalEvaluacion = 0;

        while (nota != -1){
            System.out.println("describe que nota le daras a la pelicula Matrix");
            nota = teclado.nextDouble();

            if (nota != -1){
                mediaDeEvaluacion += nota;
                totalEvaluacion++;
            }
        }
       System.out.println("la media de evaluacion para Matrix es: " + mediaDeEvaluacion / totalEvaluacion);
        }
}

