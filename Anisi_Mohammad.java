package assignment2;

public class Anisi_Mohammad {

    public static void main(String[] args){

        //initializes the array and does the simulation of 1000 rolls
        int []arr = simulation();

        //prints the result for every combination
        for(int i=1;i<arr.length;i++){
            System.out.println("Number of "+(i+1)+"s are "+arr[i]);
        }
        System.out.println("Graph");


        int GraphY=175;

        for(int i=0; i < 8;i++){

            //printf allows formatting better for graph
            System.out.printf("%3d|",GraphY);

            for(int j=1; j<arr.length;j++){
                if(arr[j]>GraphY){
                    System.out.print("*  ");
                }else
                    System.out.print("   ");
            }
            GraphY=GraphY-25;
            System.out.println();
        }

        for(int i=0;i<arr.length*3;i++) {
            System.out.print("_");
        }

        System.out.println();

        //spacing needed to line numbers up with stars
        System.out.print("    ");

        //printing numbers on x-axis
        for(int i=1;i<arr.length;i++){
            if(i+2<=10) {
                System.out.print((i + 1) + "  ");
            }
            // when numbers were double-digit they'd be spaced out of the graph
            else
                System.out.print((i + 1) + " ");
        }

    }
    public static int []simulation (){

        int []arr = new int[12];
        Dice dice = new Dice();

        //initializes everything to 0 first
        for(int i = 0; i < arr.length; i++){
            arr[i]=0;
        }

        //for loop to roll the dice 1000 times
        for(int i =1;i<1000;i++){

            dice.roll();

            /*-1 because when faceValues return 12 there will be an error
            so it'll do [12-1] to fill [11], each sum is in -1 array position */
            arr[dice.faceValues()-1]++;

        }
        return arr;
    }
}
