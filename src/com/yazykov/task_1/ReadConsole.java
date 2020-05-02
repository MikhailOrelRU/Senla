package com.yazykov.task_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadConsole {

    //читает с консоли до тех пор, пока не получит целое число или "exit"
    public static Integer numberReadWhyle() throws ExitException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите целое число или  \"exit\" для выхода: ");
        boolean exit = false;
        int number = 0;
        while (!exit) {
            try {
                String s = reader.readLine();
                if (s.equals("exit")) {
                    throw new ExitException("Ввод закрыт");
                } else {
                    number =  Integer.parseInt(s);
                    exit = true;
                }
            } catch (NumberFormatException ex) {
                System.out.println("Вы ввели не целое число, попробуйте еще раз или введите \"exit\" для выхода: ");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        try {
            reader.close();
        } catch (IOException ex){
            ex.printStackTrace();
        }
        return number;
    }
}
