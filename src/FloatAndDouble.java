public class FloatAndDouble {

    public static void main (String[] args) {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float min value = " + myMinFloatValue);
        System.out.println("Float max value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double min value = " + myMinDoubleValue);
        System.out.println("Double max value = " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f  / 3f;
        double myDoubleValue = 5d  / 3d;
        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("MyDoubleValue = " + myDoubleValue);

        System.out.println("_______CHALLENGE__________");
        double pounds = 7.34d;
        double kg = pounds * 0.45359237d;
        System.out.println(kg);
    }
}