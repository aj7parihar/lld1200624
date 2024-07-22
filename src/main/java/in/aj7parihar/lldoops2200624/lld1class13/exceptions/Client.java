package in.aj7parihar.lldoops2200624.lld1class13.exceptions;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
//        try {
//            demoFileException();
//        }
//        catch (FileNotFoundException e) {
//            System.out.println("FNFE " + e.getMessage());
//        }
//        catch (IOException e) {
//            System.out.println("IOE " + e.getMessage());
//        }
        // demoArithmeticException(new Scanner(System.in));

        demoTryCatch();
    }

    // The below method demonstrates why we need multiple 'catch' blocks
    // We need multiple blocks to catch the different exception that we can.
    private static void demoTryCatch() {
        try {
            File file = new File("abc.txt");
            FileReader fileReader = new FileReader(file);
            fileReader.read();

            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(a/b);
        }
        catch(FileNotFoundException e) {
            System.out.println("FNFE " + e.getMessage());
        }
        catch(IOException e) {
            System.out.println("IOE " + e.getMessage());
        }
        catch(ArithmeticException e){
            System.out.println("AE " + e.getMessage());
        }
        catch(InputMismatchException e){
            System.out.println("IMME " + e.getMessage());
        }
        catch(NullPointerException e){
            System.out.println("NPE " + e.getMessage());
        }
        // using the parent class exceptions explicitly if we are not able to catch the exception in any of the
        // above run or compile time exception.
        // The order of the exceptions/catch block matters, if we put the Parent Exceptions (parent class Exception)
        // at the top then all the catch blocks below it will become redundant and won't execute.
        catch(Exception e){
            System.out.println("Exception " + e.getMessage());
        }
        finally {
            System.out.println("Finally block");
        }

        System.out.println("After Try, Catch & Finally");
    }


    public static void demoFileException() throws FileNotFoundException, IOException {
        File file = new File("abc.txt");
//        if (!file.exists()) {
//            throw new FileNotFoundException();
//        }
        FileReader fileReader = new FileReader(file);
        fileReader.read();
        // Here we are seeing the exception before running it as compared to exceptions in
        // demoArithmeticException method, this is because some exceptions occurs at run time
        // and some at compile time.
    }

    public static void demoArithmeticException(Scanner sc) {
        // If we make sc as null we will get NullPointerException
        // sc = null;
        /*
        Exception in thread "main" java.lang.NullPointerException:
        Cannot invoke "java.util.Scanner.nextInt()" because "sc" is null
        */

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a/b);
        /* a = 10
        b = 0
        Exception in thread "main" java.lang.ArithmeticException: / by zero
        */

        /*
        a = 10
        b = Scaler
        Exception in thread "main" java.util.InputMismatchException
        */
    }
}
