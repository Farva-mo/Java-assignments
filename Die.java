package assignment2;

import java.util.Random;

public class Die {

    private int faceValue = 1;

    public int getFaceValue() {
        return faceValue;
    }

    private void setFaceValue(int x) {
        faceValue = x;
    }
    public void roll(){
        Random rand = new Random();
        int roll = rand.nextInt(6) + 1;
        setFaceValue(roll);
    }

}
