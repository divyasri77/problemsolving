
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class permutation {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        String s = obj.next();
        ArrayList<String> lst = new ArrayList<>();
        permutate(lst,s,0,s.length()-1);
        Collections.sort(lst);
        System.out.println(lst);
        
    }
    public static void permutate(ArrayList<String> lst,String s,int l,int r){
        if(l==r){
            lst.add(s);
            return;
        }
        for (int i = l; i <= r; i++) {
            s = swap(s,l,i);
            permutate(lst,s,l+1,r);
            s= swap(s,l,i);
        }
        
    }
    public static String swap(String s,int l,int i)
    {
        char[] ch = s.toCharArray();
        char t = ch[l];
        ch[l] = ch[i];
        ch[i] = t;
        return String.valueOf(ch);
    }
    
}
