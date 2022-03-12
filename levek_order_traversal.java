/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binary_tree;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
class Node{
    int data;
    Node left = null;
    Node right = null;
    Node rightnext = null;
    Node(int data){
        this.data = data;
        left = null;
        right = null;
        rightnext = null;
    }
}
class another{
    public static void samelevel(Node root){
        Queue<Node> q = new LinkedList<Node>();
        int n =q.size();
        q.add(root);
        while(!q.isEmpty()){
            for (int i = 0; i < n; i++) {
                Node temp = q.poll();
            System.out.println(temp.data);
            if(temp.left!=null){
                q.add(temp.left);
            }
            if(temp.right!=null){
                q.add(temp.right);
            }
            if(i == (n-1)){
                temp.rightnext = null;
                break;
            }
               temp.rightnext = q.peek();
            }
            
        }
    }

}
public class levek_order_traversal {
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
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        Node root = null;
        int n =obj.nextInt();
        for (int i = 0; i < n; i++) {
            int data = obj.nextInt();
            root = insert(root,data);
            
        }
        for (int i = 0; i < n; i++) {
            System.out.println(root.data);
        }
        another.samelevel(root);
    }
    
}
