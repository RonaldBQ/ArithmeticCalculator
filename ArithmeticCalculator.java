package SimpleProjects.ArithmeticCalculator;

import java.util.Scanner;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class ArithmeticCalculator {
    public static void main(String[] args) {
        
        printBanner();

        System.out.print("Enter your operation: ");
        Scanner input = new Scanner(System.in);
       
        System.out.println("= "+calculateOperation(input.nextLine()));
        input.close();
    }

    public static void clearScreen(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static Object calculateOperation(String operation){
        ScriptEngineManager myExpression = new ScriptEngineManager();
        ScriptEngine engine = myExpression.getEngineByName("JavaScript");
        try {
            return engine.eval(operation).toString();
        } catch (ScriptException e) {
            return "Error, the operation isn't valid!";
        }
    }

    public static void printBanner(){
        clearScreen();
        System.out.println("____________________________________________________________________________________________________");
        System.out.println("     _         _ _   _                    _   _         ____      _            _       _             \r\n" + //
                            "    / \\   _ __(_) |_| |__  _ __ ___   ___| |_(_) ___   / ___|__ _| | ___ _   _| | __ _| |_ ___  _ __ \r\n" + //
                            "   / _ \\ | '__| | __| '_ \\| '_ ` _ \\ / _ \\ __| |/ __| | |   / _` | |/ __| | | | |/ _` | __/ _ \\| '__|\r\n" + //
                            "  / ___ \\| |  | | |_| | | | | | | | |  __/ |_| | (__  | |__| (_| | | (__| |_| | | (_| | || (_) | |   \r\n" + //
                            " /_/   \\_\\_|  |_|\\__|_| |_|_| |_| |_|\\___|\\__|_|\\___|  \\____\\__,_|_|\\___|\\__,_|_|\\__,_|\\__\\___/|_|   \r\n" + //
                            "                                                                                                     ");
        System.out.println("                                           By: RonaldBQ                                           ");
        System.out.println("____________________________________________________________________________________________________\n");
    }
}