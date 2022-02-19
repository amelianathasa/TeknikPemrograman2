package bukatutupjalan;
import java.util.Scanner; //Agar dapat menggunakan Scanner 
import java.util.StringTokenizer; 

/*
Rules : 
- Setiap empat mobil yang lewat digabung angkanya. 
- Jika jumlah gabungan angka dari empat mobil itu dikurangi 999999 dibagi 5 
  adalah 0 maka 4 mobi tersebut harus berhenti 

Input Format 
Satu baris berupa plat number untuk 4 mobil 

Output Format 
Berupa tulisan "Jalan" atau "Berhenti" 
*/
/**
 * @author Amelia Nathasa
 * @version 1.0 
 * @since 2022 - 02 - 19 
 */
public class BukaTutupJalan {

    public static void main(String[] args) {
        //Scanner digunakan untuk melakukan masukan dari keyboard setelah program dijalankan 
        Scanner masukan = new Scanner(System.in);
        String plat = masukan.nextLine();  //Membaca masukkan berupa String 
        
        StringTokenizer strTokens; 
        strTokens = new StringTokenizer(plat);
        String angka = "";
        Long bilangan;
        Long hitung; 
        
        while(strTokens.hasMoreTokens()){
             angka = angka + strTokens.nextToken();
        }
        
        //Perhitungan untuk menentukan status keadaan mobil
        bilangan = Long.parseLong(angka);
        hitung = (bilangan - 999999) % 5;
        
        if(hitung == 0){
            System.out.println("jalan");
        }else{
              System.out.println("berhenti");
        }
    }
}

