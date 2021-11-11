package com.company;

public class StackX {
    private char[] stackArray;
    private int maxSize;
    private int top;

    public StackX(int value) {
        maxSize = value;
        stackArray = new char[maxSize];
        top = -1;
    }

    public void push(char j)//размещение элемента на вершине стека
    {
        try
        {
            stackArray[++top] = j;
        } catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Ошибка при добавлении элемента в стек!");
            System.out.println("Mistake while peek!");
        }
    }

    public char peek(char inputChar) //Чтение элемента из вершины стека
    {
        try {
            return stackArray[top];
        } catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Ошибка при чтении элемента стека");
            System.out.println("mistake with peek");
            return '0';
        }

    }

    public char pop ()  //Извлечение элемента из стека
    {
        try {
            return stackArray[top--];
        } catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Ошибка при извлечении элемента из стека");
            System.out.println("mistake with pop");
            return '0';
        }
    }

    public char peekN(int n)  //Чтение элемента с индексом N
    {
        return stackArray[n];
    }

    public void displayStack(String s)
    {
        System.out.print(s);
        System.out.print("Stack (bottom --> top): ");
        for (int j = 0; j < stackArray.length; j++)
        {
            System.out.print(peekN(j));
            System.out.print(' ');
        }
        System.out.println("");
    }

    public boolean isEmpty()    //Стек пуст
    {
        return (top == -1);
    }

    public boolean isFull()    //Стек полон
    {
        return (top == maxSize-1);
    }

}
