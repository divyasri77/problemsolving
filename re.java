
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class re {
    public static void main(String[] args){
        String sentence = "i! love: zoho";
        System.out.println(sentence);
        char[] sen = sentence.toCharArray();
       
        int i=0;
        
        int j=sentence.length()-1;
        while(i < sentence.length()-1){
           
          
           if(Character.isAlphabetic(sen[i]) && Character.isAlphabetic(sen[j])){
               char t = sen[i];
               sen[i] = sen[j];
               sen[j] =t;
               
               i++;
               j--;
              // System.out.println("ist if "+lst);
           }
           else if(!Character.isAlphabetic(i)){
               i++;
           }
           else if(!Character.isAlphabetic(j)){
               j--;
           }
           
        }
        System.out.println(sen);
    }
    
}
