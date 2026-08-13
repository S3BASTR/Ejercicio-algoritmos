public class Ejercicio20 {
    public static void main(String[] args) {
        System.out.println("Ingrese el capital prestado: ");
        float capital = Float.parseFloat(System.console().readLine());
        System.out.println("Ingrese los intereses pagados: ");
        float interes = Float.parseFloat(System.console().readLine());
        System.out.println("Ingrese el número de años: ");
        int años = Integer.parseInt(System.console().readLine());
        float razon = (interes * 100) / (capital * años);
        System.out.println("La razón de interés es de: " + razon + " %");
    }
}