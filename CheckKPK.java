import java.util.InputMismatchException;
import java.util.Scanner;

class Function3 {
    //function untuk mencari nilai KPK
    public static int checkKPK(int n, int m) {
        //mencari KPK dengan cara n dibagi FPB dari n dan m
        //Kemudian kalikan dengan m
        return ((n / checkFPB(n, m)) * m);
    }

    //function untuk mencari nilai FPB
    public static int checkFPB(int n, int m) {
        //mencari FPB dengan cara  menukar n dan m
        // memoduluskan m dengan n hingga n bernilai 0
        if (n == 0) return m;
        return checkFPB(m % n, n);
    }
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Masukan angka pertama: ");
            int a = sc.nextInt();
            System.out.print("Masukan angka kedua: ");
            int b = sc.nextInt();

            int hasilKPK = checkKPK(a, b); //hasilKPK adalah KPK dari n dan m

            System.out.println("KPK dari " + a + " dan " + b +" adalah: " +hasilKPK);

        } catch (InputMismatchException error) {
            System.out.println(error);
            System.out.println("Inputan harus integer");
        }
    }
}
