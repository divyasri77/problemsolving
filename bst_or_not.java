/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binary_tree;


import java.util.Scanner;

/**
 *
 * @author ASUS
 */
class Node{
    int data;
    Node left = null;
    Node right = null;
    
    Node(int data){
        this.data =data;
        left = null;
        right = null;
    }
}
public class bst_or_not {
    public static boolean bsd(Node root,int min, int max){
        if(root == null){
            return true;
        }
        if(root.data < min || root.data>max){
            return false;
        }
        boolean left = bsd(root.left,min,root.data);
        boolean right = bsd(root.right,root.data,max);
        return left && right;
    }
    public static Node insert(Node root,int a){
        Node curr;
        if(root == null){
            return new Node(a);
        }
        if(a > root.data){
            curr = insert(root.right,a);
            root.right =curr;
        }
        else{
            curr = insert(root.left,a);
            root.left = curr;
        }
        return root;
    }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int n =obj.nextInt();
        Node root =null;
        for (int i = 0; i < n; i++) {
            int a = obj.nextInt();
            root = insert(root,a);
        }
        boolean ans = bsd(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
        System.out.println(ans);
    }
    
}
