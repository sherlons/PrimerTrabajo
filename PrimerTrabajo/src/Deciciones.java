public class Deciciones {
    public static void main(String[] args) {
        int fechaDeLanzamiento = 1999 ;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;
        String tipoDePlan = "plus";

        if (fechaDeLanzamiento >= 2022){
            System.out.println("peliculas mas populares");
        }else {
            System.out.println("pelicula retro, que vale la pena ver");
        }
        if (incluidoEnElPlan  && tipoDePlan.equals("plus")){
            System.out.println("disfruta de tu pelicula");
        }else {
            System.out.println("pelicula no disponible para su plan actual");
        }
    }
}
