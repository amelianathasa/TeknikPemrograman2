package berhitung;
import java.util.Scanner;   //Agar dapat menggunakan Scanner 
/*
Input Format 
Satu baris berisi A, operator, dan B. Masing-masing dipisahkan oleh spasi
yang menyatakan terdapat operasi "A operasi B"

Output Format 
Satu baris berisi sebuah bilangan bulat, hasil "A operator B"
*/

/**
 * @author Amelia Nathasa
 * @version 1.0
 * @since 2022-02-19
 */
public class Berhitung {

    public static void main(String[] args) {
        //Kamus Data 
        int hasil = 0;
        int a;
        int b;
        char operator;
        
        //Scanner digunakan untuk melakukan masukan dari keyboard setelah program dijalankan 
        Scanner masukan = new Scanner(System.in);
        a = masukan.nextInt();  //nextInt() untu membaca data bertipe integer 
        operator = masukan.next().charAt(0);    //Untuk membaca data bertipe char 
        b = masukan.nextInt();
        
        //Menggunakan percabangan untuk mengecek operasi yang digunakan untuk perhitungan
        if(operator == '+'){
            hasil = a + b;
        }else if(operator == '-'){
            hasil = a - b;
        }else if(operator == '*'){
            hasil = a * b;
        }else if(operator == '/'){
            hasil = a / b;
        }else if(operator == '%'){
            hasil = a % b;
        }
        
        //Print hasil perhitungan 
        System.out.println(hasil);
    }
        
    
}
    

