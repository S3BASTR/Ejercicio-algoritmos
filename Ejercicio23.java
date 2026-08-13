public class Ejercicio23 {
    public static void main(String[] args) {

        double M = 452;
        double N = 197;
        double B1 = 132;
        double B2 = 180;
        double B3 = 7.50;
        double B4 = 14.50;

        double bultos;
        double sobranteHarina;
        double cajas;
        double sobranteAceite;
        double ingresoTotal;

        bultos = 452 / 24;
        sobranteHarina = 452 - (18 * 24);

        cajas = 197 / 15;
        sobranteAceite = 197 - (13 * 15);

        ingresoTotal = (18 * B1) + (sobranteHarina * B3)
                     + (13 * B2) + (sobranteAceite * B4);

        System.out.println("El ingreso total es: Bs. " + ingresoTotal);
    }
}