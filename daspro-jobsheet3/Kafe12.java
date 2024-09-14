import java.util.Scanner;
public class Kafe12 {
    public static void main(String[] args) {
        Scanner Kafe12 = new Scanner(System.in);
        boolean keanggotaan;
        int jmlKopi, jmlTeh, jmlRoti;
        double hargaKopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 20000.0, totalHarga, nominalBayar;
        float diskon = 10 / 100f;


        System.out.print("Masukan keanggotaan (true/false): ");
        keanggotaan = Kafe12.nextBoolean();
        System.out.print("Masukan jumlah pembeliaan kopi: ");
        jmlKopi = Kafe12.nextInt();
        System.out.print("Masukan jumlah pembelian teh: ");
        jmlTeh = Kafe12.nextInt();
        System.out.print("Masukan jumlah pembelian roti: ");
        jmlRoti = Kafe12.nextInt();

        totalHarga = (jmlKopi * hargaKopi) + (jmlTeh * hargaTeh) + (jmlRoti * hargaRoti);

        nominalBayar = totalHarga - (diskon * totalHarga);

        System.out.println("Keanggotaan pelangan " + keanggotaan);
        System.out.println("Item pembelian " + jmlKopi + " kopi, " + jmlTeh + " teh, " + jmlRoti + " roti");
        System.out.println("Nominal bayar Rp " + nominalBayar);

    }
}
