package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int ones = number % 10;
        int tens = number / 10 % 10;
        int hundreds = number / 10 / 10 % 10;

        System.out.println(ones * 100 + tens * 10 + hundreds);
    }
}
