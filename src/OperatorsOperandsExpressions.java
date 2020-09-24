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
        System.out.println("% "+result);
        result ++;
        System.out.println(result);
        result --;
        System.out.println(result);
        System.out.println(result += 3);
        System.out.println(result *= 10);
        System.out.println(result ++); // this doesn't work for some reason
        System.out.println(result /= 2);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }
        System.out.println("___________");

        int firstScore = 81;
        int secondScore = 60;
        if (firstScore > secondScore && firstScore < 100) {
            System.out.println("You got the top score!");
        }
        // & and | are also logical operators in Java. They are bitwise, wirking at the bit level... TBD!

        if ( (firstScore > 90) || (secondScore <= 90)) {
            System.out.println("Either or both conditions are true!");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is not an error");
        }

        // Ternary Operators
        boolean isCar = false;
        if (isCar) {
            System.out.println("This is not supposed to happen.");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }

    }
}
