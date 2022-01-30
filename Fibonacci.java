package methods;

public class Fibonacci {
    public static void main(String[] args) {
        int ilkSayi = 0;
        int ikinciSayi = 1;
        System.out.println(ilkSayi);
        System.out.println(ikinciSayi);

        //0 1 1 2 3 5 8 13 21 34
        while (ikinciSayi > 0) {
            int sonuc = ilkSayi + ikinciSayi;
            System.out.println(sonuc);
            ilkSayi = ikinciSayi;
            ikinciSayi = sonuc;
        }
    }
}
