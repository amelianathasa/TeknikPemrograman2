package inputoutput;

import java.util.Scanner;   //Agar dapat menggunakan fungsi scanner 

/* Given a string s, matching the regular expression [A-Za-z !,?._'@]+, split
the string into tokens. We define a token to be one or more consecutive English 
alphabetic letters. Then, print the number of tokens, followed by each token
on a new line. 

Input Format 
A single string s 

Constrains
- 1 <= length of s <= 4.10^5
- s is composed of any of the following : English alphabetic letters, blank 
spaces, exclamation points (!), commas (,), question marks (?), periods (.), 
underscores (_), apostrophes (') and symbols (@). 

Output Format 
On the first line, print an integer, n, denotong the number of tokens in string 
s (they do not need to be unique). Next, print each of the n tokens on a new 
line in the same order as they appear in input string s. 
*/
/**
 * @author Amelia Nathasa
 * @version 1.0
 * @since 2022-02-17
 */

public class InputOutput {

    public static void main(String[] args) {
        //Scanner digunakan untuk melakukan masukan dari keyboard setelah program dijalankan
        Scanner masukan = new Scanner(System.in);   
        //Perintah untuk memasukkan string kedalam variabel s 
        String s = masukan.nextLine();  //nextLine digunakan untuk String  
        masukan.close();    //Untuk mengakhiri proses input 
        
        s = s.trim();   //Trim digunakan untuk memotong karakter-karakter spasi pada suatu kalimat 
        
        if(s.length() == 0){    //Jika panjang kalimat pada variabel s adalah 0 
            System.out.println(0);  //Maka akan diprint 0 
            return;
        }
        /*Split digunakan untuk mengambil suatu nilai yang terdapat didalam variable String, 
        nilai tersebut dapat kita ambil dengan menggunakan Regex lalu setelah itu akan 
        mengembalikan nilainya dengan nilai char array.*/
        String [] words = s.split("[^a-zA-Z]+");  
        
        System.out.println(words.length);  //Cetak jumlah kata 
        for(String word : words){
            System.out.println(word);
        }
       
     
    }
    
}
