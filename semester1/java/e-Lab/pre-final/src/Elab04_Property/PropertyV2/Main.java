package Elab04_Property.PropertyV2;

//elab-source:Main.java
//elab-mainClass:Main

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        CalculateAllArea calculateAllArea = new CalculateAllArea();
        double sumOfArea = 0;
        for(int i=0;i<n+1;i++){
            String[] result = input.nextLine().split(" ");
            if(result[0].equals("House")){
                sumOfArea += calculateAllArea.getSumArea(new HouseArea(Double.valueOf(result[1])));
            }
            else if(result[0].equals("Pond")){
                sumOfArea += calculateAllArea.getSumArea(new PondArea(Double.valueOf(result[1])));
            }else if(result[0].equals("Building")){
                sumOfArea +=calculateAllArea.getSumArea(new BuildingArea(Integer.parseInt(result[1]),Integer.parseInt(result[2]),Integer.parseInt(result[3])));
            }
        }
        System.out.format("%.2f\n", sumOfArea);
    }
}
