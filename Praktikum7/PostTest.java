import java.io.*;
public class PostTest_1{
    public static void main(String[] args) throws IOExeception{
        BufferedReader dataInput = new BufferedReader(
            new InputStreamReader(System.in)
        );

        int menu;
        String KodeBarang[] = new String[50];
        String namabarang[] = new String[50];
        float hargabarang[] = new float[50];
        int jumlah[] = new int[50];
        String pilih= "";
        boolean status1 = false;
        boolean status2 = false;
        int x =0;

        do{
            System.out.println(".:Menu App:.");
            System.out.println("(1) Input Data Barang ");
            System.out.println("(2) Cetak Data Barang ");

            System.out.println("Pilih Menu : ");
            menu = Integer.parseInt(dataInput.readLine());

            if(menu == 1){
                do{
                    System.out.println("Masukkan Kode Barang : ");
                        kodebarang[x] = dataInput.readLine();
                    System.out.println("Masukkan Nama Barang : ");
                        namabarang[x] = dataInput.readLine();
                    System.out.println("Masukkan Harga : ");
                        harga[x] = Float.perseFloat(dataInput.readLine());
                    System.out.println("Masukkan Jumlah : ");
                        jumlah[x] = Integer.perseInt(dataInput.readLine());
                    
                    System.out.println("Apakah akan melakukan input lagi? Y/N");
                        pilih = dataInput.readLine();
                    if(pilih.equals("Y")){
                        Status1 = true;
                        x++;
                    }else{
                        status1 = false;
                        status2 = true;
                    }
                }while(status1);
            }else if(menu == 2){
                for(int i=0 ; i<kodebarang.length : i++){
                    if(kodebarang[i]).equals("")){
                        Sstem.out.println("Kode Barang : " + kodebarang[i]);
                        System.out.println("Nama Barang : " + namabarang[i]);
                        System.out.println("Harga : " + harga[i]);
                        System.out.println("Jumlah : " + jumlah[i]);
                        System.out.println("\n");
                    }else{
                        break;
                    }
                }
            }
        }while(status2);

    }
}