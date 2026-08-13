public class Ejercicio9 {
    public static void main(String[] args) {
        System.out.println("Ingrese la cantidad de horas trabajadas: ");
        int noht = Integer.parseInt(System.console().readLine());
        System.out.println("Ingrese cuanto gana por hora: ");
        int pagohora = Integer.parseInt(System.console().readLine());
        int salariobruto = noht * pagohora;
        double imp = 20;
        double salarioneto = salariobruto - ((salariobruto * imp)/100);
        System.out.println("Su salario neto por trabajar " + noht + " horas es de " + salarioneto);
    }
}