public class Ejercicio18 {
    public static void main(String[] args) {

    float galon_litro = 3.785f;
    float Precioxlitro = 100;
    System.out.println("Ingrese la cantidad de galones a surtir: ");
    float surtgal = Float.parseFloat(System.console().readLine());
    float litros = surtgal * galon_litro;
    float total = litros * Precioxlitro;
    System.out.println("El total a pagar es de: " + total + " bs");
    }
}
