package school.mjc.stage0.loops.task4;

public class SkippingThird {

    public void printUntilButThird(int lastPrinted) {
        if(lastPrinted < 0)
            System.out.print("");
        if(lastPrinted == 1)
            System.out.println(1);
        else {
            for (int i = 1; i <= lastPrinted; i++) {
                if (i % 3 == 0)
                    continue;
                else
                    System.out.println(i);
            }
        }
    }
}
