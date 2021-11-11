package com.company;

public class Stack {

    private int[] stackArray;
    private int maxSize;
    private int lastElm;

    public Stack(int value) {
        maxSize = value;
        stackArray = new int[maxSize];
        lastElm = -1;
    }

    public void peek(int value) throws ArrayIndexOutOfBoundsException
    {
        try {
            stackArray[++lastElm] = value;
        } catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("mistake with peek");
        }

    }

    public int pop () throws ArrayIndexOutOfBoundsException
    {
        try {
            return stackArray[lastElm--];
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("mistake with pop");
            return -1;
        }
    }

    public int check() throws ArrayIndexOutOfBoundsException
    {
        return stackArray[lastElm];
    }

    public boolean isEmpty()
    {
        return (lastElm == -1);
    }

    public boolean isFull()
    {
        return (lastElm == maxSize-1);
    }
}
