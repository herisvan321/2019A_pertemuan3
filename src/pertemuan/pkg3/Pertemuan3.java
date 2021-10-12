/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan.pkg3;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Pertemuan3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String kondisi;
        kondisi = JOptionPane.showInputDialog(null, "Silahkan Pilih Kondisi : [biodata, kalkulator]");
        Pertemuan3 per = new Pertemuan3();
        if (kondisi.equals("biodata")) {
            per.biodata();
        } else if (kondisi.equals("kalkulator")) {
            per.kalkulator();
        }
    }

    void biodata() {
        String nama_depan, nama_belakang, tempat, tgl_lahir, alamat, matkul;
        int nilai, noHp;

        nama_depan = JOptionPane.showInputDialog(null, "Masukan Nama Depan Anda : ");
        nama_belakang = JOptionPane.showInputDialog(null, "Masukan Nama Belakang Anda : ");
        tempat = JOptionPane.showInputDialog(null, "Masukan Tempat lahir Anda : ");
        tgl_lahir = JOptionPane.showInputDialog(null, "Masukan tanggal lahir Anda : ");
        alamat = JOptionPane.showInputDialog(null, "Masukan alamat anda Anda : ");
        matkul = JOptionPane.showInputDialog(null, "Masukan Nama Matkul anda Hari ini : ");
        nilai = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukan Nilai Anda : "));
        noHp = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukan No Hp Anda : "));

        JOptionPane.showMessageDialog(null, "=====Biodata=====\n"
                + "Nama : " + nama_depan + " " + nama_belakang + "\n"
                + "Tempat/Tgl Lahir : " + tempat + "/" + tgl_lahir + "\n"
                + "No Hp : " + noHp + "\n"
                + "Nama Matkul Saat Ini : " + matkul + "\n"
                + "Nilai Angka : " + nilai + "\n"
                + "Nilai Huruf : ?\n"
                + "Alamat : " + alamat
        );
    }

    void kalkulator() {
        System.out.println("ini kalkulator");
    }
}
