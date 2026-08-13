public class Ejercicio15 {
    public static void main(String[] args) {
           
        int Kilovatio ;
        int Fmespasado;
        int Fmesactual;

        System.out.println("Ingrese El costo del Kilovatio");
        Kilovatio=Integer.parseInt(System.console().readLine());
        System.out.println("Ingrese El costo de consumo del mes pasado");
        Fmespasado=Integer.parseInt(System.console().readLine());
        System.out.println("Ingrese El costo de consumo de lo que lleva del mes");
        Fmesactual=Integer.parseInt(System.console().readLine());

        int Consumo = Fmesactual-Fmespasado;
        int PrecioFacturatotal= Kilovatio*Consumo;

        System.out.println("El costo de tu factura actual es de: " + PrecioFacturatotal);

    }

}