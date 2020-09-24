public class OperatorsOperandsExpressions {
    public static void main(String[] args) {
        int result = 1 + 2; // 1+2=3
        System.out.println("1+2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + result);
        result = result - 1;
        System.out.println("new result: " + result);
        result = result + result;
        System.out.println("rrr" + result);
        result = result * 10;
        System.out.println("r*: " + result);
        result = result / 10;
        System.out.println("r/ :" + result);
        // remainder AKA modulus operand
        result = result % 3;
        System.out.println("%"+result);

    }
}
