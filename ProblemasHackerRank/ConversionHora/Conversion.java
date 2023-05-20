package ProblemasHackerRank.ConversionHora;

public class Conversion {
    public static void main(String[] args) {
        String s = "02:15:00AM";
        int hora = 12 + Integer.parseInt(s.substring(0, 2));
        //String t = Integer.toString(hora) + s.substring(2, 8);
        String t = "";


        char ampm = s.charAt(8);
        //System.out.println(ampm);
        //System.out.println(hora);
        //System.out.println(t);

        if (ampm == 'A' && s.charAt(0)=='1' && s.charAt(1)=='2' ) {
            t = "00" + s.substring(2, 8);
    
        }else if (ampm == 'A') {
            t = s.substring(0, 8);
            
        }else if (ampm == 'P' && s.charAt(0)=='1' && s.charAt(1)=='2') {
            t = s.substring(0, 8);

        }else if (ampm == 'P') {
            t = Integer.toString(hora) + s.substring(2, 8);

        }
        System.out.println(t);
    }
}
