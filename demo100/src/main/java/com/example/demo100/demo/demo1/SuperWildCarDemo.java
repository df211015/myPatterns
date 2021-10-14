package com.example.demo100.demo.demo1;

public class SuperWildCarDemo {
    public static void main(String[] args) {
        GenericStack<String> stack1 = new GenericStack<>();
        GenericStack<Object> stack2 = new GenericStack<>();
        stack2.push("java");
        stack2.push(2);
        stack2.push("Sun");
        add(stack1,stack2);
        AnyWildCardDemo.print(stack2);
    }

    public static <T> void add(GenericStack<T> stack1, GenericStack<? super T> stack2) {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
    }
}
