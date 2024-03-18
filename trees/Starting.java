package trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Starting {
    
     static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data =data;
        }
     
    }
   static class Tree{
        static int idx=-1;
        public Node buildtree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;   
            }
            Node newnode=new Node(nodes[idx]);
            newnode.left=buildtree(nodes);
            newnode.right=buildtree(nodes);
           
           return newnode; 
         }
 }
            public static void preorder(Node root){
                if(root!=null)
{                preorder(root.left);
                System.out.println(root.data);
                preorder(root.right);}
            }
            public static void printlevelwise(Node root){
                if(root==null){
                    System.out.println("null");
                }

               Queue<Node> q=new LinkedList<>();
               q.add(root);
               q.add(null);
               while(!q.isEmpty()){
                    Node temp= q.remove();
                    if(temp==null){
               System.out.println();
    
                     if(q.isEmpty()){
                        break;

                    }
                    else{
                        q.add(null);
                    }
                }
                    else{
                    System.out.print(temp.data+" ");
                    if(temp.left!=null){
                        q.add(temp.left);}
                    if(temp.right!=null){
                        q.add(temp.right);
                        
                    }
                }
               }
            }

        public static void preorderiterative(Node root){
            if(root==null){
                System.out.println("null");
            }
            Stack<Node> st=new Stack<>();
            st.push(root);
            while(!st.empty()){
               Node temp= st.pop();
                  System.out.print(temp.data+" ");
                 if(temp.right!=null){
                        st.push(temp.right);    
                    }
                    if(temp.left!=null){
                        st.push(temp.left);    
                    }
            }
        }
        public static void printiterativeinorder(Node root){
            if(root==null){
                System.out.println("null");
            }
            Stack<Node> st=new Stack<>();
            Node temp=root;
            while(true){
                      if(temp!=null){
                        st.push(temp);
                        temp=temp.left;
                      }
                      else{
                        if(st.isEmpty()){
                            break;
                        }
                          temp=st.pop();
                         System.out.println(temp.data);
                          temp=temp.right;
                      }
                
            }
        }

    public static void printiterativepostorder(Node root){
        if(root==null){
            System.out.println("null");
        }
        Stack<Node> st=new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            Node temp=root;
        if(temp.left!=null){
            st.push(temp.left);
            temp=temp.left;

        }
        if(temp.right!=null){
            st.push(temp.right);
            temp=temp.right;
        }
        
        }
        while (!st.isEmpty()) {
            System.out.println(st.pop());
        }
    }
    public static int sumofnodes(Node root){
        if(root==null){
            return 0;
        }
        int lh=sumofnodes(root.left);
        int rh=sumofnodes(root.right);
        return(1+lh+rh);
    }
    public static void main(String[] args) {
        int[] nodes={1,2,-1,-1,3,-1,-1};
         Tree trees=new Tree();
         Node root=trees.buildtree(nodes);
         //System.out.println(root.data);
        System.out.println(sumofnodes(root)+1);
    }
   
}
