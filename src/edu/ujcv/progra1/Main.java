package edu.ujcv.progra1;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Stack<Integer> ejemploStack = new Stack<>();


        ejemploStack.push(32);
        ejemploStack.push(22);


        System.out.println("ver pero no tocar!!");

        System.out.println(ejemploStack.peek());


        while (!ejemploStack.empty()){

            System.out.println("remover");
            System.out.println(ejemploStack.pop());
        }



    }
}
