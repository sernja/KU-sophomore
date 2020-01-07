package Elab05_Exception;
//elab-source: YourMainClass.java
//elab-mainclass: YourMainClass
import java.io.FileNotFoundException;

public class YourMainClass {

    public static void main(String[] args) {
        FinalExam finalExam = new FinalExam();

        try {
            finalExam.methodA(110);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

        try {
            finalExam.methodB("abcdefghijklmnop");
        }catch (StringIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }

        try {
            finalExam.methodC("bookingData/csv");
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }

        try {
            Object object = null;
            finalExam.methodD(object);
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }

        try {
            finalExam.methodE(10);
        }catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }






    }

}
