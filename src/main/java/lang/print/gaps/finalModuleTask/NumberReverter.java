package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        System.out.println(100*(number % 10) + 10*((number % 100) / 10) + number/100);
    }
}
