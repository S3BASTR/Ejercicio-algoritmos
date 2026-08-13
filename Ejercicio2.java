public class Ejercicio2 {
    public static void main(String[] args) {
        int Cp, Inv, tiem;
        float  Gt;
         System.out.println("Digite capital invertido");
        Cp = Integer.parseInt(System.console().readLine());
        Inv = 2;
        tiem =1 ;
        Gt = ((Cp * Inv)/ 100)*tiem;
         System.out.println("Tu ganancia es:" + Gt);
    }
    
}
