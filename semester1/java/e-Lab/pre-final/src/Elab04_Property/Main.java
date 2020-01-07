package Elab04_Property;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double allArea = 0;
        for(int i=0;i<n+1;i++){
            String[] comSplit = input.nextLine().split(" ");
            if(comSplit[0].equals("House")) {
                allArea += CalculateArea.calculateArea(new HouseGetArea(Double.parseDouble(comSplit[1])));
            }
            else if(comSplit[0].equals("Pond")) {
                allArea += CalculateArea.calculateArea(new PondGetArea(Double.parseDouble(comSplit[1])));
            }
            else if(comSplit[0].equals("Building")){
                allArea += CalculateArea.calculateArea(new BuidingGetArea(Double.parseDouble(comSplit[1]),Double.parseDouble(comSplit[2]),Integer.parseInt(comSplit[3])));
            }
        }

        System.out.format("%.2f\n", allArea);


    }
}
