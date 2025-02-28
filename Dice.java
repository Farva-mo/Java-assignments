package assignment2;

public class Dice {

    private Die die1 = new Die();
    private Die die2 = new Die();

    public int faceValues(){
        int sum =die1.getFaceValue() + die2.getFaceValue();
        return sum;
    }


    public void roll(){
        die1.roll();
        die2.roll();
    }
}
