import javax.swing.*;


public class JOptionPane {
    public static void main(String[] args) {
        String Nama, nim, tampat, tgllahir;

        nama = JOptionPane.showInputDialog("Masukkan Nama : ");
        nim = JOptionPane.showInputDialog("Masukkan Nim : ");
        tempat = JOptionPane.showInputDialog("Masukkan Tempat : ");
        tgllahir = JOptionPane.showInputDialog("Tanggal Lahir : ");
        String msg = "Hello " + nama + "!";
        JOptionPane.showInputDialog(null, msg);
    }
}