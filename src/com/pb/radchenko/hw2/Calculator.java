package com.pb.radchenko.hw2;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        int operand1;
        int operand2;
        int res;
        String sign;

        Scanner input = new Scanner(System.in);
        System.out.println("Choose an operator: Введите значение");
        operand1 = input.nextInt();
        input.nextLine();
        System.out.println("Choose an operator: +, -, *, or /");
        sign = input.nextLine();
        System.out.println("Choose an operator: Введите значение");
        operand2 = input.nextInt();
        //sign = input.next().charAt(0);
        //input.close();
        switch (sign) {
            case "+":
                res=operand1+operand2;
                System.out.println("Результат операции:" + res);
                break;
             case "-":
                 res=operand1-operand2;
                 System.out.println("Результат операции:" + res);
                 break;
                 case "/":
                     if(operand2==0)
                 {
                     System.out.println("Выполнение деления на 0 невозможно");
                     break;
                 }
                     res=operand1/operand2;
                     System.out.println("Результат операции:" + res);
                     break;
                  case "*":
                   res=operand1*operand2;
                    System.out.println("Результат операции:" + res);
                    break;









        }


    }
}
