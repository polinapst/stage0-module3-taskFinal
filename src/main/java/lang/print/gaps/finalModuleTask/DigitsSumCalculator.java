package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int ones = number % 10;
        int tens = number / 10 % 10;
        int hundreds = number / 10 / 10 % 10;
        int thousands = number / 10 / 10 / 10 % 10;

        System.out.println(ones + tens + hundreds + thousands);
    }
}
