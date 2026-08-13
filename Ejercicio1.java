public class Ejercicio1 {
    public static void main(String[] args) {
        int edad1, edad2, edad3;
        float promedio;
         System.out.println("Digite edad 1");
        edad1 = Integer.parseInt(System.console().readLine());
        System.out.println("Digite edad 2");
        edad2 = Integer.parseInt(System.console().readLine());
        System.out.println("Digite edad 3");
        edad3 = Integer.parseInt(System.console().readLine());

         promedio = (edad1+edad2+edad3)/3;
        
        System.out.println("El promedio es:" + promedio);




     
    }
    
}
