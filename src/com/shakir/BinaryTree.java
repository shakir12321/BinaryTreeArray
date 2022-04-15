package com.shakir;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    String[] arr;
    int lastUsedIndex;

    public BinaryTree(int size){
        arr = new String[size+1];
        this.lastUsedIndex = 0;
        System.out.println("Blank tree created of Size "+size);
    }

    public boolean isFull(){
        if (lastUsedIndex == arr.length-1) return true;
        else return false;

    }

//insert
    public void insert(String value){
        if(!isFull()) {
            arr[lastUsedIndex + 1] = value;
            lastUsedIndex++;
            System.out.println("Value inserted " + value + " at : " + (lastUsedIndex));
        }
        else {
            System.out.println("Array is full");
        }
    }

    //preorder traversal
    public void preOrder(int index){
        if(index > lastUsedIndex){

            return;
        }
        System.out.print(arr[index]+" ");
        preOrder(2*index);
        preOrder(2*index+1);
    }
    //preorder traversal
    public void inOrder(int index){
        if(index > lastUsedIndex){

            return;
        }
        inOrder(2*index);
        System.out.print(arr[index]+" ");

        inOrder(2*index+1);
    }

    //post order
    //preorder traversal
    public void postOrder(int index){
        if(index > lastUsedIndex){

            return;
        }
        postOrder(2*index);


        postOrder(2*index+1);
        System.out.print(arr[index]+" ");
    }

    //level order traversal
    public void levelOrder(int index){
        if(index > lastUsedIndex){
             return;
        }
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(index);
        while (!queue.isEmpty()) {
          Integer ind = queue.remove();
            System.out.print(arr[ind]+"-> ");
            if(ind*2 <= lastUsedIndex) queue.add(ind*2);
            if(ind*2 +1 <= lastUsedIndex)  queue.add(ind*2 + 1);
        }
    }

    //level order traversal
    public void levelOrderArr(int index) {
        if (index > lastUsedIndex) {
            return;
        }
        for (String in : arr) {

            System.out.print(in + " ");
        }
    }


}
