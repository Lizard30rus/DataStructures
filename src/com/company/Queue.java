package com.company;

import java.util.regex.Pattern;

public class Queue {
    private int maxSize;
    private int[] queArray;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int size) {
        maxSize = size;
        nItems = 0;
        front = -1;
        rear = 0;
        queArray = new int[maxSize];
    }

    public boolean isEmpty()
    {
        return (nItems == 0);
    }

    public boolean isFull()
    {
        return (nItems == maxSize);
    }

    public void insert (int value) throws ArrayIndexOutOfBoundsException //вставка элемета
    {
        try {
            if (rear == maxSize - 1)
            {
                rear = -1;
            }
            queArray[++rear] = value;
            nItems++;
        } catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("mistake while insert!");
        }
    }

    public int remove() throws ArrayIndexOutOfBoundsException   //извлечение элемента из начала очереди
    {
        try {
            int temp = queArray[front++];
            if (front == maxSize)
            {
                front = 0;
            }
            nItems--;
            return temp;
        } catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("mistake while remove!");
            return -1;
        }
    }

    public int peekFront()        //чтение элемента из начало очереди
    {
        if (!isEmpty())
            return queArray[front];
        else  return -1;
    }

    public int getSize()
    {
        return nItems;
    }
}
