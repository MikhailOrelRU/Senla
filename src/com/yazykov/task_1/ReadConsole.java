package com.yazykov.task_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadConsole {

    //read from console until then not enter integer number or "exit"
    public static Integer numberReadWhyle() throws ExitException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter integer number or \"exit\" for exit: ");
        boolean exit = false;
        int number = 0;
        while (!exit) {
            try {
                String s = reader.readLine();
                if (s.equals("exit")) {
                    throw new ExitException("Input close");
                } else {
                    number =  Integer.parseInt(s);
                    exit = true;
                }
            } catch (NumberFormatException ex) {
                System.out.println("Input error, try again or enter \"exit\" for exit: ");
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
