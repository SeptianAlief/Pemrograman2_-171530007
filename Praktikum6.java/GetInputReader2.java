import java.io.*;

public class GetInputReader2 {

    public static void main(String[] args) throws IOException{
        BufferedReader dataIn = new BufferedReader (new
        InputStreamReader(System.in));

        String nim="", nama="", tempat="", tgllahir="";
        System.out.print("Masukkan Nama Anda : ");
            nama = dataIn.readLine();
        System.out.print("Masukkan Nim Anda : ");
            nim = dataIn.readLine();
        System.out.print("Masukkan Tempat Lahir :");
            tempat = dataIn.readLine();
        System.out.print("Masukkan Tanggal Lahir Anda :");
            tgllahir = dataIn.readLine();

        System.out.println("");
        System.out.println("-----------------------");
        System.out.println("-----------------------");

        System.out.println("Selamat Datang" + nama);
        System.out.println("Nim : " + nim);
        System.out.println("Tempat Lahir : " + tempat);
        System.out.println("Tanggal Lahir : " + tgllahir);
    }
}