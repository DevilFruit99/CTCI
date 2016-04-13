package main.Tree;

/**
 * Created by susha on 4/2/2016.
 */
public class BinaryTree {
    public Node root;
    public BinaryTree(){

    };
    public BinaryTree(int i){
        root = new Node(i);
    }
    public BinaryTree add(int value){
        if(root == null){
            root = new Node(value);
            return this;
        }
        Node ptr = root;

        ptr = traverse(ptr,value);
        if(ptr.value > value){
            ptr.left = new Node(value);
        }else {
            ptr.right = new Node(value);
        }

        return this;

    }
    Node traverse(Node start, int value){

        if(start.value > value && start.left!=null){
            return traverse(start.left,value);
        }else if(start.value <= value && start.right != null){
            return traverse(start.right,value);
        }

        return start;

    }





    public  class Node{
        public int value;
        public Node left;
        public Node right;

        public Node(int value){
            this.value = value;
        }

        public void dfsPrint(){

        }
        public String toString(){
            String str = ""+value;
            if(left!=null)
                str.concat(" l:"+left.value);
            else
                str.concat(" l:null");

            if(right!=null)
                str.concat(" r:"+left.value);
            else
                str.concat(" r:null");

            return str;
        }

        public boolean hasChild() {
            return this.left!=null || this.right!=null;
        }
    }
}
