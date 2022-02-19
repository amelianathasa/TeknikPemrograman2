package gajiagent;
import java.util.Scanner;   //Agar dapat menggunakan Scanner
/*
1. Agent menerima gaji pokok sebersar Rp. 500.000,00
2. Mendapat bonus 25% jika total item yang dijual minimal 40 item
3. Mendapat bonus 35% jika total item yang dijual diatas 80 item 
4. Jika menjual dibawah 15 mendapat denda pemotongan gaji 15% dari total minus penjualan 
   ke 15 item. 
5. Agen hanya meerima bonus 10% setiap itemnya 
6. Harga setiap item adalah Rp. 50.000,00

Format Input 
Satu baris berupa jumlah penjualan bulan ini 

Format Output 
Satu baris berisi sebuah bilangan gajih yang diterima 
*/
/**
 * @author Amelia Nathasa
 * @version 1.0
 * @since 2022-02-19
 */
public class GajiAgent {

    public static void main(String[] args) {
        //Kamus Data & inisialisasi nilai 
        int gaji = 500000;  //Gaji Bersih 
        int harga_item = 50000;     //Harga per item 
        int jml_item, total_harga, bonus, total_gaji = 0, denda; 
 
       //Scanner digunakan untuk melakukan masukan dari keyboard setelah program dijalankan 
        Scanner masukan = new Scanner(System.in);
        jml_item = masukan.nextInt();   //Membaca jumlah item yang dijual 
        total_harga = jml_item * harga_item;    //Total harga item yang dijual 
        bonus = total_harga*10/100;     //Harga bonus per item 
        denda = ((15 * harga_item) - total_harga) * 15/100; //Denda jika < 15 penjualan
        
        //Percabangan untuk mengetahui total gaji berdasarkan jumlah item yang dijual 
        if(jml_item < 15){
            total_gaji = gaji - denda;
        }
        if(jml_item >= 40){
            total_gaji = gaji + (total_harga * 25/100);
        }
        if(jml_item >= 80){
            total_gaji = gaji + (total_harga * 35/100);
        }
        if(jml_item >= 15 && jml_item < 40){
            total_gaji = gaji + bonus;
        }
        System.out.println(total_gaji);
     
    }
    
}
