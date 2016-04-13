package main.java;

import main.Tree.BinaryTree;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by susha on 4/2/2016.
 */
public class List_of_depths_4_3 {

    public static void main(String [] args){
        BinaryTree bt = new BinaryTree();
        bt.add(5).add(4).add(2).add(3).add(10).add(9).add(12).add(11).add(13);

         List<LinkedList<Integer>> listByLevels = new LinkedList<LinkedList<Integer>>();
        listify(listByLevels,0,bt.root);
        System.out.println("done");
    }
    public static void listify(List<LinkedList<Integer>> listByLevels, int level, BinaryTree.Node node){
        if(listByLevels.size()-1<level)
            listByLevels.add(level,new LinkedList<Integer>());
        listByLevels.get(level).add(node.value);
        if(node.left!=null){
            listify(listByLevels,level+1,node.left);
        }
        if(node.right!=null){
            listify(listByLevels,level+1,node.right);
        }

    }


}
