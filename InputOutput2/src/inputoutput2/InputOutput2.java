package inputoutput2;
import java.util.Scanner;   //Agar dapat menggunakan fungsi Scanner 

/*
Input Format 
Every line of input will contain a String followed by an integer 
Each String will have a maximum of 10 alphabetic characters, and each integer 
will be in the inclusive from 0 to 999

Output Format 
In each line of output there should be two columns : 
- First column contains the String and is left justified using exactly 15 characters
- The second column contain the integer, expressed in exactly 3 digits; if the 
original input has less than three digits, you must pad your output's leading 
with zeroes 
*/
/**
 * @author Amelia Nathasa
 * @version 1.0
 * @since 2022-02-18
 */
public class InputOutput2 {

    public static void main(String[] args) {
        //Scanner digunakan untuk melakukan masukan dari keyboard setelah program dijalankan
        Scanner masukan = new Scanner(System.in);
        System.out.println("========================");
        //Lakukan perulangan untuk memasukkan nilai pada variabel kata dan angka 
        for(int i = 0; i<3; i++){
            String kata = masukan.next();   //next digunakan untuk membaca String namun hanya satu kata (sampai menemukan spasi)
            int angka = masukan.nextInt();  //nextInt digunakan untuk membaca data tipe Integer 
            System.out.printf("%-15s%03d%n", kata, angka);  
             /*
            %-15s artinya hanya dapat menampilkan 15 karakter (huruf) 
            %03d artinya menampilkan 3 buah bilangan integer diawali dengan nilai 0 jika kurang dari 3 bilangan
            */
        }
        System.out.println("=========================");
    }
    
}
