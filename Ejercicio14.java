public class Ejercicio14 {
    public static void main(String[] args) {
        int a, b, c, d, e, f;

        System.out.println("Ingrese el valor de a: ");
        a = Integer.parseInt(System.console().readLine());
        System.out.println("Ingrese el valor de b: ");
        b = Integer.parseInt(System.console().readLine());
        System.out.println("Ingrese el valor de c: ");
        c = Integer.parseInt(System.console().readLine());
        System.out.println("Ingrese el valor de d: ");
        d = Integer.parseInt(System.console().readLine());
        System.out.println("Ingrese el valor de e: ");
        e = Integer.parseInt(System.console().readLine());
        System.out.println("Ingrese el valor de f: ");
        f = Integer.parseInt(System.console().readLine());

        float x = ((c*e)-(b*f))/((a*e)-(b*d));
        float y = ((a*f)-(c*d))/((a*e)-(b*d));
        System.out.println("El valor de x es: " + x);
        System.out.println("El valor de y es: " + y);
    }
}