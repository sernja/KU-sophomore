//elab-source:MasterMind.java

public class MasterMind {
    private int[] arrFirst = new int[4];
    private int[] arrSecond = new int[4];
    private int digits = 0;
    private int positions = 0;
    public void setArrayFirst(int num1) {
        for(int i = 0; i < 4; i++){
            this.arrFirst[i] = num1 % 10;
            num1 /= 10;
        }
    }

    public void setArraySecond(int num2) {
        for(int i = 0; i < 4; i++){
            this.arrSecond[i] = num2 % 10;
            num2 /= 10;
        }
    }

    public void findDigitsAndPositions() {
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                if(arrFirst[i] == arrSecond[j]){
                    if(i == j) positions += 1;
                    digits += 1;
                }
            }
        }
    }

    public int getDigits() {
        return digits;
    }

    public int getPositions() {
        return positions;
    }

    public String toString() {
        if(getDigits() == getPositions()) return "Congratulations, you just mastered my mind!!";
        else return getDigits() + " " + getPositions();
    }
}
