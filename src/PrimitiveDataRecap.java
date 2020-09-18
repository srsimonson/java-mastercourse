public class PrimitiveDataRecap {
    public static void main(String[] args) {
        // byte
        // short 
        // int ++
        // long
        // float
        // double ++
        // char
        // boolean ++
        // String is a class, not a primitive data type.
        String myString = "This is a string...";
        System.out.println("myString = " + myString);
        myString = myString + " and this is more.";
        System.out.println(myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);

        String nextString = "10";
        int myInt = 50;
        nextString = nextString + myInt;
        System.out.println("next string: " + nextString);
        double doubleNumber = 120.47d;
        nextString = nextString + doubleNumber;
        System.out.println("next string: " + nextString);
    }
}
