public class Ejercicio12 {
    public static void main(String[] args) {
        System.out.println("Digite su resultado en el examen de matematicas: ");
        int exammath = Integer.parseInt(System.console().readLine());
        System.out.println("Digite su primer trabajo de matematicas: ");
        int tm1 = Integer.parseInt(System.console().readLine());
        System.out.println("Digite su segundo trabajo de matematicas: ");
        int tm2 = Integer.parseInt(System.console().readLine());
        System.out.println("Digite su tercer trabajo de matematicas: ");
        int tm3 = Integer.parseInt(System.console().readLine());
        int promediotrabajos = (tm1 + tm2 + tm3) / 3;
        double promediofinal = (exammath*0.90) + (promediotrabajos*0.10);
        System.out.println("Su promedio final es de matematicas: " + promediofinal);

        System.out.println("Digite su resultado en el examen de fisica: ");
        int examfis = Integer.parseInt(System.console().readLine());
        System.out.println("Digite su primer trabajo de fisica: ");
        int tf1 = Integer.parseInt(System.console().readLine());
        System.out.println("Digite su segundo trabajo de fisica: ");
        int tf2 = Integer.parseInt(System.console().readLine());
        int promediotrabajos2 = (tf1 + tf2) / 2;
        double promediofinal2 = (examfis*0.80) + (promediotrabajos2*0.20);
        System.out.println("Su promedio final es de fisica: " + promediofinal2);

        System.out.println("Digite su resultado en el examen de quimica: ");
        int exammquim = Integer.parseInt(System.console().readLine());
        System.out.println("Digite su primer trabajo de quimica: ");
        int tq1 = Integer.parseInt(System.console().readLine());
        System.out.println("Digite su segundo trabajo de quimica: ");
        int tq2 = Integer.parseInt(System.console().readLine());
        System.out.println("Digite su tercer trabajo de quimica: ");
        int tq3 = Integer.parseInt(System.console().readLine());
        int promediotrabajos3 = (tq1 + tq2 + tq3) / 3;
        double promediofinal3 = (exammquim*0.85) + (promediotrabajos3*0.15);
        System.out.println("Su promedio final es de quimica: " + promediofinal3);

        double promediofinaltotal = (promediofinal + promediofinal2 + promediofinal3) / 3;
        System.out.println("Su promedio final total es: " + promediofinaltotal);
    }
}