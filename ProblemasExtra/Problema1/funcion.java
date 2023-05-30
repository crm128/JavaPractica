package ProblemasExtra.Problema1;

public class funcion {
    public static int horas(int minutos){
        int horas = minutos/60;
        return horas;
    }
    public static int dias(int horas){
        int dias = horas/24;
        return dias;
    }
    public static int HorasRestantes(int dias,int horas){
        int HorasRestantes = horas-dias*24;
        return HorasRestantes;
    }
}
