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
    Node left = null;
    Node right = null;
    int data;
    
    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

public class Binary_tree {

    /**
     * @param args the command line arguments
     */
    public static int height(Node root){
        int l =0;
        int r =0;
        if(root.left != null){
            l +=height(root.left);
        }
        if(root.right != null){
            r += height(root.right);
        }
        return Math.max(l, r);
    }
    public static Node insert(Node root,int data){
          if(root == null){
              return new Node(data);
          }
          else{
              Node cur;
              if(data < root.data){
                  cur = insert(root.left, data);
                  root.left = cur; 
              }
              else{
                  cur = insert(root.right,data);
                  root.right = cur;
              }
          }
          return root;
}
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        Node root = null;
        for (int i = 0; i < n; i++) {
            int data = obj.nextInt();
            root = insert(root,data);
        }
        System.out.println(height(root));
        
    }
    
}
