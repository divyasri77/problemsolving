/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package new_language;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class New_language {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj = new Scanner(System.in);
        String language = obj.next();
        char[] a = language.toCharArray();
        String word = obj.next();
        int count =0; int c=0;
        ArrayList<String> reitm = new ArrayList<>();
        String[] lan = language.split("");
        ArrayList<String> lst = new ArrayList<>();
        Collections.addAll(lst,lan);
        HashSet<Character> hash = new HashSet<>();
        for (int i = 0; i < language.length(); i++) {
            if(hash.contains(a[i])){
                System.out.println("New Language Error");
                
            }
                hash.add(a[i]);
                
        }
        
        String[] wor = word.split("");
        ArrayList<String> lst1 = new ArrayList<>();
        Collections.addAll(lst1,wor);
        
        lst.retainAll(lst1);
        System.out.println(lst.toString().replace(",", "").replace("[","").replace("]","").trim());
        
        
        /*HashMap<Character,Integer> hash1 = new HashMap<>();
        HashMap<Character,Integer> hash2 = new HashMap<>();
        for (int i = 0; i < language.length(); i++) {
            if(hash1.containsKey(language.charAt(i)));
               count = hash1.get(language.charAt(i));
               count++;
               hash1.put(language.charAt(i), count);
        }
        for (int i = 0; i < word.length(); i++) {
            if(hash2.containsKey(word.charAt(i)));
               c = hash2.get(word.charAt(i));
               c++;
               hash2.put(word.charAt(i), c);
        }*/
      
       
           
        
        
    }
    
}
