import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner tagihan = new Scanner(System.in);
        int jmlDigunakan, tarifListrik = 1500, totalTagihan, batasPenggunaan = 500;

        System.out.print("Masukan jumlah digunakan");
        jmlDigunakan = tagihan.nextInt();

        totalTagihan = jmlDigunakan * tarifListrik;

        System.out.println("Jumlah digunakan: " + jmlDigunakan);
        System.out.println("Tarif listrik: " + totalTagihan);
        if (jmlDigunakan > batasPenggunaan) {
                System.out.println("Penggunaan listrik melebihi 500 kwh.");
        } else if (jmlDigunakan < batasPenggunaan) {
                System.out.println("Penggunaan listrik tidak melebihi 500 kwh.");
            } else {
                System.out.println("Penggunaan listrik tepat 500 kwh.");
            }
        }
    

    }

