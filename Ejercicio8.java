public class Ejercicio8 {
    public static void main(String[] args) {
        double a,b,c,p,AT;
        System.out.println("Digite longitud de area 1");
        a= Integer.parseInt(System.console().readLine());
        System.out.println("Digite longitud de area 2");
        b= Integer.parseInt(System.console().readLine());
        System.out.println("Digite longitud de area 3");
        c= Integer.parseInt(System.console().readLine());

        p= (a+b+c)/2;
        AT= Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("El area del triangulo es de:"+ AT);
         
    }
    
}
