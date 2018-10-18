import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Task1 {

    public static void main(String[] args) throws IOException{
        BufferedReader dataIn = new BufferedReader (new
        InputStreamReader(System.in));

        String nama="", kode="", jumlah="";
        
        i=0;
        do{
            System.out.println("Transaksi" + (i=1));
            System.out.print("Masukkan Nama Barang : ");
                nama = dataIn.readLine();
            System.out.print("Masukkan Kode : ");
                kode = dataIn.readLine();
            System.out.print("Masukkan Jumlah :");
                jumlah = dataIn.readLine();
        }
        System.out.println("");
        System.out.println("-----------------------");
        System.out.println("-----------------------");

        System.out.println("Masih Harapan ");
        System.out.println("Nama : " + nama);
        System.out.println("Kode : " + kode);
        System.out.println("Jumlah : " + jumlah);
    }
}