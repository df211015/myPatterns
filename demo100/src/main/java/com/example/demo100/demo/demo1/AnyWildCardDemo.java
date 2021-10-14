package com.example.demo100.demo.demo1;

/**
 *
 */
public class AnyWildCardDemo {
    public static void main(String[] args) {
        GenericStack<Integer> integerGenericStack = new GenericStack<>();
        integerGenericStack.push(1);
        integerGenericStack.push(2);
        integerGenericStack.push(-2);

        print(integerGenericStack);
    }

    public static void print(GenericStack<? extends Object> stack) {
        while (!stack.isEmpty()) {
            System.out.println(stack.pop() + " ");
        }
    }
}
