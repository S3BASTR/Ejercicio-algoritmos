public class Ejercicio22 {
    public static void main(String[] args) {
        System.out.println("Defina el precio de contado: ");
        float precio = Float.parseFloat(System.console().readLine());
        float doceCuotas = 12;
        System.out.println("Defina el precio por cuota:");
        float preciocuota = Float.parseFloat(System.console().readLine());
        float totalcoutas = preciocuota * doceCuotas;
        float recargo = totalcoutas - precio;
        float porcentajeRecargo = (recargo * 100) / precio;
        System.out.println("El porcentaje de recargo es de: " + porcentajeRecargo + " %");
    }
}