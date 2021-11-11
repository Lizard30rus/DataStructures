package com.company;

public class Reverser {

    private String input;
    private String output;

    public Reverser(String input) {
        this.input = input;
        output = "";
    }

    public String getInput() {
        return input;
    }

    public String getOutput() {
        //this.reverse();
        return output;
    }

    public void reverse()
    {
        int size = input.length();
        StackX stackX = new StackX(size);
        for (int i = 0; i < size; i++)
        {
            char inputChar = input.charAt(i);
            stackX.peek(inputChar);
        }
        while (!stackX.isEmpty())
        {
            char outputChar = stackX.pop();
            output += outputChar;
        }
    }
}
