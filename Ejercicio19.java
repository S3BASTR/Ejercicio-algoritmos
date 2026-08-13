public class Ejercicio19 {

    public static void main(String[] args){
        float Presupuesto_Total;
        float Ginecologia = 40f;
        float Traumas = 30f;
        float Pediatria =30f;
        Float Resultado1;
        Float Resultado2;
        Float Resultado3;

        System.out.println("Ingrese el presupuesto para el hospital:");
        Presupuesto_Total= Integer.parseInt(System.console().readLine());

        Resultado1= (Presupuesto_Total*Ginecologia)/100;
        Resultado2= (Presupuesto_Total*Traumas)/100;
        Resultado3= (Presupuesto_Total*Pediatria)/100;

        System.out.println("El dinero destinado para el area de Ginecolocia es de:" + Resultado1);
        System.out.println("El dinero destinado para el area de Traumas es de:" + Resultado2);
        System.out.println("El dinero destinado para el area de Pediatria es de:" + Resultado3);









    } 
}