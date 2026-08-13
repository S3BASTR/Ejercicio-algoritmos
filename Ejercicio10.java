public class Ejercicio10 {
    public static void main(String[] args) {

        double aust=956871;
        double grieg=88607;
        double ff=20110;
        double usd=122499;
        double ital=9289;
        System.out.println("Ingrese la cantidad de chelines a convertir a pesetas: ");
        double convaust=Double.parseDouble(System.console().readLine());
        System.out.println("Ingrese la cantidad de dracmas a convertir a francos franceses: ");
        double convgrieg=Double.parseDouble(System.console().readLine());
        System.out.println("Ingrese la cantidad de pesetas a convertir a dolares: ");
        double convusd=Double.parseDouble(System.console().readLine());
        System.out.println("Ingrese la cantidad de pesetas a convertir a liras: ");
        double convital=Double.parseDouble(System.console().readLine());
        double austpes=(convaust*aust)/100;
        double griegpes=(convgrieg*grieg)/100;
        double pesff=(griegpes)/ff;
        double usdpes=(convusd)/usd;
        double italpes=convital*100/ital;
        System.out.println("La cantidad de pesetas es: " + austpes);
        System.out.println("La cantidad de francos franceses es: " + pesff);
        System.out.println("La cantidad de dolares es: " + usdpes);
        System.out.println("La cantidad de liras es: " + italpes);
    }
}