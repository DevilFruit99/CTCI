package main.java;

/**
 * Created by susha on 3/21/2016.
 */
public class MinimalTree_4_2 {
    static int[] sorted = {1, 2, 3, 4, 5, 6};
    static int balanced[];

    public void main(String args[]){
        int bal_len =(int)Math.pow(Math.ceil(Math.log((double)sorted.length)/Math.log(2.0)),2.0);
        balanced = new int[bal_len];
        transform(0,sorted.length,0);
        for (int i:balanced
             ) {
            System.out.print(i+",");
        }
    }
    static void transform(int si,int ei,int sn){
        if(ei==si){
            int mid = ei-si/2;
            balanced[sn]=sorted[mid];
            //left
            if(si>mid-1)
            transform(si,mid-1,2*sn+1);
            //right
            if(ei<mid+1)
            transform(mid+1,ei,2*sn+2);
        }else{
            balanced[sn] = sorted[ei];
        }

    }
}
