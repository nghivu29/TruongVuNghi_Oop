package lab3.bai4;

public class Main {
    public static void main(String[] args) {
        VietnamTranslator a = new VietnamTranslator();
        System.out.println(a.getNumber("sáu triệu ba trăm hai"));
        System.out.println(a.getNumber("sáu trăm triệu hai chục"));

        System.out.println(a.getString(1400510));

        EnglishTranslator b = new EnglishTranslator();
        System.out.println(b.getString(823456719));
        System.out.println(b.getNumber("eight hundred twenty three million four hundred fifty six thousand seven hundred nineteen"));
    }
}
