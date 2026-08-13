public class Ejercicio17 {
    public static void main(String[] args){
        double PvP;
        double Total_compra;
        double Descuento;
        double Porcentaje;

        System.out.println("Ingrese el Total del compra sin descuento:");
        PvP=Integer.parseInt(System.console().readLine());
        System.out.println("Ingrese el Total del compra con descuento");
        Total_compra= Integer.parseInt(System.console().readLine());

        Descuento = PvP - Total_compra;
        Porcentaje = (Descuento/PvP)*100;

        System.out.println("Pagaste el :"+ Porcentaje +"%"+ "de tu compra" );
    

        
    }
    
}


