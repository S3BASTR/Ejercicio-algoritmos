public class Ejercicio16 {
    public static void main(String[] args) {
        float largo, ancho, consumo;
        largo = 4;
        ancho = 1.5f;
        consumo = 0.5f;
        float area = largo * ancho;
        float totalpiezas = area / consumo;
        System.out.println("El total de piezas necesarias es: " + totalpiezas);
        float desperdicio = (0.5f * totalpiezas)- area;
        System.out.println("El total de desperdicio es igual a: " + desperdicio);
    }
}