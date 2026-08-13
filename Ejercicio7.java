public class Ejercicio7 {
    public static void main(String[] args) {
       double metros,pulgadas,pies,Cpies,Cpulga;
       System.out.println("Digite metros");
       metros= Integer.parseInt(System.console().readLine());
       pulgadas= 39.27;
       pies=12;

       Cpulga= metros*pulgadas;
       Cpies = Cpulga/pies;
       System.out.println("Convertido a pulgadas es:" + Cpulga);
       System.out.println("Convertido a pies es:" + Cpies);


    }
}
