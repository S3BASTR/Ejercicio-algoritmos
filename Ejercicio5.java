public class Ejercicio5 {
    public static void main(String[] args) {
         float E1, E2, E3,P1,P2,P3, Suma_Promedio,Promedio_Ex,Promedio_Proyec;
         System.out.println("Escriba Sus nota del examen 1");
         E1=Integer.parseInt(System.console().readLine());
         System.out.println("Escriba Sus nota del examen 2");
         E2=Integer.parseInt(System.console().readLine());
         System.out.println("Escriba Sus nota del examen 3");
         E3=Integer.parseInt(System.console().readLine());
         System.out.println("Escriba Su nota del parcial final:");
         P2=Integer.parseInt(System.console().readLine());
         System.out.println("Escriba Su nota de proyecto final");
         P3=Integer.parseInt(System.console().readLine());

         P1= (((E1+E2+E3)/3)*55)/100;
         Promedio_Ex= (P2*30)/100;
         Promedio_Proyec = (P3*15)/100;
         Suma_Promedio= P1+Promedio_Ex + Promedio_Proyec;
         System.out.println("Su promedio final es de:"+ Suma_Promedio);
         
         




       
    }
}
