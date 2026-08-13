public class Ejercicio3 {
    public static void main(String[] args) {
        int Comision_por_Venta, V1, V2, V3, SB;
        double GPV, Total_ganado;
         System.out.println("Digite Su salario base");
        SB = Integer.parseInt(System.console().readLine());
         System.out.println("Digite venta 1");
        V1 = Integer.parseInt(System.console().readLine());
        System.out.println("Digite venta 2");
        V2 = Integer.parseInt(System.console().readLine());
        System.out.println("Digite venta 3");
        V3 = Integer.parseInt(System.console().readLine());
        
        Comision_por_Venta = 10;

        GPV = ((V1+V2+V3)*Comision_por_Venta)/100;

        Total_ganado = GPV+SB;

       System.out.println("Tu ganancia por venta es:"+ GPV );
       System.out.println("Tu ganancia por venta es:"+ Total_ganado);
       

    


        
    }
     
}
