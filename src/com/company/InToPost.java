package com.company;

public class InToPost {
    private StackX theStack;
    private String input;
    private String output = "";

    public InToPost(String in) {
        input = in;
        int stackSize = input.length();
        theStack = new StackX(stackSize);
       // System.out.println("size: " + input.length());
    }

    public String doTrans()     //Преобразование в постфиксную форму
    {
        for (int j = 0; j < input.length(); j++)
        {
            char ch = input.charAt(j);
            theStack.displayStack("For " + ch + " ");  //*диагностика*
            switch (ch)
            {
                case '+':
                case '-':
                    gorOper(ch,1);
                    break;
                case '*':
                case '/':
                    gorOper(ch,2);
                    break;
                case '(':
                    theStack.push(ch);
                    break;
                case ')':
                    gotParen(ch);
                    break;
                default:
                    output = output + ch;
                    break;
            }
        }
        while (!theStack.isEmpty())
        {
            theStack.displayStack("While ");
            output = output + theStack.pop();
        }
        theStack.displayStack("End ");
        return output;
    }


    public void gorOper (char opThis, int prec1)  //Чтение оператора из входной строки
    {
        while (!theStack.isEmpty())
        {
            char opTop = theStack.pop();   //извлекаем элемент из стека
            if (opTop == '(')              //Если это '(', то возвращаем его обратно
            {
                theStack.push(opTop);
                break;
            }
            else
            {
                //сравниваем приоритеты операторов
                int prec2;
                if(opTop == '+' || opTop == '-')          //определяем приоритет оператора
                    prec2 = 1;
                else
                    prec2 = 2;
                if (prec2 < prec1)
                {
                    theStack.push(opTop);             //если приоритет нового оператора ниже предыдущего,
                    break;                            //то сохраняем старый оператор в стек, иначе
                }                                     //извлекаем из стека и доавляем к постфиксной строке
                else
                    output = output+opTop;
            }
        }
        theStack.push(opThis);                          //занесение нового оператора в стек
    }


    public void gotParen(char ch)
    {
        while (!theStack.isEmpty())
        {
            char chx = theStack.pop();     //Если извлечён элемент '('
            if ( chx == '(')               //прервать выполнение, если извлечён
                break;                     //оператор, вывести в постфиксную строку
            else
                output = output + chx;
        }
    }


}
