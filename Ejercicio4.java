public class Ejercicio4 {
    public static void main(String[] args) {
        int Vt, Descuento;
        double Vd,Pt;
         System.out.println("Digite El total de su compra:");
        Vt = Integer.parseInt(System.console().readLine());
        Descuento = 10;
        Vd=(Vt*Descuento)/100;
        Pt=Vt-Vd;
        System.out.print("El valor total a pagar es: " + Pt);
    }
}
