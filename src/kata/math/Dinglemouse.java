package kata.math;

public class Dinglemouse {
    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        // Your code here!
        int catYear = 15;
        int dogYear = 15;

        for(int i = 1; i <= humanYears; i++){
            if(i==2){
                catYear+=9;
                dogYear+=9;
            } if(i>=3){
                catYear+=4;
                dogYear+=5;
            }
        }
        return new int[]{humanYears, catYear, dogYear};
    }
}