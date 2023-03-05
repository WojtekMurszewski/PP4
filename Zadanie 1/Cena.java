public class Cena{
    public static double obliczCeneNetto(double cenaBrutto, double podatek){
        return cenaBrutto - (cenaBrutto*(podatek/100));
    }

    public static void main(String[] args) {
        System.out.println(obliczCeneNetto(100,23));
    }
}