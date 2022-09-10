package lang.print.gaps.finalModuleTask;

public class NumbersPrinter {
    public void printIsPositive(int number) {
        String s = Integer.toBinaryString(number);
        System.out.println(number > 0);
    }
}
