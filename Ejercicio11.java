public class Ejercicio11 {
    public static void main(String[] args) {
        int porcentajehoraextra, parof, polhab, caja, actaacd, hijos, prima;

        porcentajehoraextra = 25;
        parof = 5;
        polhab = 2;
        caja = 7;
        actaacd = 25000;
        hijos = 17300;
        prima = 18000;

        System.out.println("Ingrese la cantidad de horas trabajadas: ");
        int horanormal = Integer.parseInt(System.console().readLine());
        System.out.println("Ingrese cuanto gana por hora: ");
        int gananciahoranormal = Integer.parseInt(System.console().readLine());
        int salario = horanormal * gananciahoranormal;
        double valorhoraextras = (salario * porcentajehoraextra)/100;
        System.out.println("Ingrese la cantidad de horas extras trabajadas: ");
        int horasextra = Integer.parseInt(System.console().readLine());
        double gananciahoraextra = valorhoraextras * horasextra;

        double Salariobase = salario + gananciahoraextra;

        System.out.println("Cuantos hijos tiene: ");
        int cantidadhijos = Integer.parseInt(System.console().readLine());
        double bonohijos = cantidadhijos * hijos;
        double Asign = bonohijos + actaacd + prima;
        System.out.println("El total que se le asigna es de: " + Asign);

        double totaldeduccion = (Salariobase * parof)/100 + (Salariobase * polhab)/100 + (Salariobase * caja)/100;
        System.out.println("El total de deducciones es de: " + totaldeduccion);

        double SueldoTotal = Salariobase + Asign - totaldeduccion;
        System.out.println("Su sueldo neto es de: " + SueldoTotal + " pesos");
    }
}
