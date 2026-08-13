public class Ejericio21 {
    public static void main(String[] args) {
    
       int Naranjas = 48000;
       int Costo_Doce = 6;
       int Ganancia = 42000;

       int  Inversion =(Naranjas/12)*Costo_Doce;
       int GananciaM = + Ganancia-Inversion;
       int Calculo_final_ganancia = (GananciaM*100)/Inversion;
       System.out.println("Tu ganancia es del :" +Calculo_final_ganancia + "%");


    }
    
}
