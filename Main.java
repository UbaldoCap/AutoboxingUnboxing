public class Main {
    public static void main(String[] args) {
        sommaInt(5, 6);
        stampaChar('v');
        sommaInteger(5, 6 );
        stampaCharacter('v');
        Integer numero = 3;
        System.out.println(numero);
        int valore = numero;
        System.out.println(valore);
    }
    public static void sommaInt (int a, int b) {
        System.out.println(a + b);
    }
    public static void stampaChar (char a) {
        System.out.println(a);
    }
    public static void sommaInteger (Integer a, Integer b) {
        System.out.println(a + b);
    }
    public static void stampaCharacter (Character a) {
        System.out.println(a);
    }
}
