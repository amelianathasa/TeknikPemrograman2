package bignumber;
import java.math.BigInteger;  //BigInteger digunakan untuk mewakili anka besar yang tidak menentu 
import java.util.Scanner;

/*
Input Format
There willbe two lines containing two numbers, a and b 

Contrains 
a and b are non-negative integers and can have maximum 200 digits

Output Format 
Output two lines. The first line should contain a + b, and the second line 
should contain a x b. Don't print any leading zeros. 
*/

/**
 * @author Amelia Nathasa
 * @version 1.0
 * @since 2022-02-19
 */
public class BigNumber {

    public static void main(String[] args) {
        //Scanner digunakan untuk melakukan masukan dari keyboard setelah program dijalankan
        Scanner masukan = new Scanner(System.in);
        String a, b;
        a = masukan.nextLine(); //Membaca masukan berupa string 
        b = masukan.nextLine();
        masukan.close();    //Untuk menutup proses input 
        
        //Melakukan proses perhitungan 
        System.out.println(new BigInteger(a).add(new BigInteger(b)));   //Untuk melakukan pertambahan
        System.out.println(new BigInteger(a).multiply(new BigInteger(b)));      //Untuk melakukan perkalian
      
    }
    
}




