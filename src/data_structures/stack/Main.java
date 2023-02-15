package data_structures.stack;

import java.util.Objects;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        OurStack newStack = new OurStack(3);

        newStack.push("kadir");
        newStack.push("baran");
        newStack.push("aksoy");




        Stack<String> stack = new Stack<String>();

        stack.push("kadir");
        stack.push("aksoy");
        System.out.println(stack.get(1));



    }
}
