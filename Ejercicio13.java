public class Ejercicio13 {
    public static void main(String[] args) {
        System.out.println("Cuantos billetes de 50000 tiene el banco: ");
        int N1 = Integer.parseInt(System.console().readLine());
        System.out.println("Cuantos billetes de 20000 tiene el banco: ");
        int N2 = Integer.parseInt(System.console().readLine());
        System.out.println("Cuantos billetes de 10000 tiene el banco: ");
        int N3 = Integer.parseInt(System.console().readLine());
        System.out.println("Cuantos billetes de 5000 tiene el banco: ");
        int N4 = Integer.parseInt(System.console().readLine());
        System.out.println("Cuantos billetes de 2000 tiene el banco: ");
        int N5 = Integer.parseInt(System.console().readLine());
        System.out.println("Cuantos billetes de 1000 tiene el banco: ");
        int N6 = Integer.parseInt(System.console().readLine());
        System.out.println("Cuantos billetes de 500 tiene el banco: ");
        int N7 = Integer.parseInt(System.console().readLine());
        System.out.println("Cuantos billetes de 100 tiene el banco: ");
        int N8 = Integer.parseInt(System.console().readLine());
        int total = (N1*50000)+(N2*20000)+(N3*10000)+(N4*5000)+(N5*2000)+(N6*1000)+(N7*500)+(N8*100);
        System.out.println("El total de dinero que tiene el banco es: " + total + " pesos");
    }
}
