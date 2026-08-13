public class Ejercicio6 {
    public static void main(String[] args) {
        int Hombres, Mujeres, Thm; 
        double Ph, Pm;
        System.out.print("Cuantos hombres hay: ");
        Hombres=Integer.parseInt(System.console().readLine());
        System.out.print("Cuantas mujeres hay: ");
        Mujeres=Integer.parseInt(System.console().readLine());
        Thm=Hombres+Mujeres;
        Ph=(Hombres*100)/Thm;
        System.out.println("El porcentaje total de hombres es: " + Ph +"%");
        Pm=100-Ph;
        System.out.println("El porcentaje total de mujeres es: " + Pm+ "%");
    }
}
