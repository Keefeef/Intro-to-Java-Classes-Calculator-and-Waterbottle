public class Calculator {
    private int number;


    public Calculator(int number) {
        this.number = number;
    }

    public int addNumber(int num) {
        return this.number + num;
    }

    public int subtractNumber(int num) {
        return this.number - num;
    }

    public int multiplyNumber(int num) {
        return this.number * num;
    }

    public int divideNumber(int num) {
        return this.number / num;
    }

}
