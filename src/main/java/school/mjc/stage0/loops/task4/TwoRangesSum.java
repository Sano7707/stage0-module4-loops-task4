package school.mjc.stage0.loops.task4;

public class TwoRangesSum {


    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        int firstSum = 0;
        int secondSum = 0;

        if(lastInRow < numberToSkip)
            System.out.println("number to skip is bugger then the last");
        else if (lastInRow < 0)
            System.out.println("last number in row is negative");

        else if( numberToSkip == lastInRow){

            for (int i = 0; i <= lastInRow ; i++) {
                secondSum+=i;
            }
            System.out.println("skipped sum is " + secondSum);
            System.out.println("counted sum is " + firstSum);        }
        else
        {
            int j = 0;
            for (int i = 1; i <= lastInRow; i++) {
                if(j == numberToSkip - 1) {
                    secondSum += i;
                    j = 0;
                    continue;
                }
                else {
                    firstSum += i;
                    j++;
                }
            }
            System.out.println("skipped sum is " + secondSum);
            System.out.println("counted sum is " + firstSum);
        }

    }
}
