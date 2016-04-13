package main.java;

import main.Tree.BinaryTree;

/**
 * Created by susha on 4/2/2016.
 */
public class Check_Balanced_4_4 {
    public static void main(String[] args){
        BinaryTree bt = new BinaryTree(),bt2 = new BinaryTree();
        bt.add(5).add(4).add(10).add(9).add(12);
        bt2.add(5).add(4).add(2).add(3).add(10).add(9).add(12).add(11).add(13);


        System.out.println("bt is balanced:"+checkBalanced(bt.root));
        System.out.println("bt is balanced:"+checkBalanced(bt.root));


    }
    public static boolean checkBalanced(BinaryTree.Node node){
        if(!node.hasChild()){
            return true;
        }
        if(node.left==null ){
            return !node.right.hasChild();
        }else if(node.right==null){
            return !node.left.hasChild();
        }
        boolean islbal = checkBalanced(node.left);
        boolean isrbal = checkBalanced(node.right);
        return islbal && isrbal;
    }
}
