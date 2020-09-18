public class ByteShortLong {
    public static void main(String[] args) {
        
        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Bustem Max value = " + (myMaxIntValue + 1));

        int myMaxIntTest = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("byte Min = " + myMinByteValue);
        System.out.println("byte Max = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Min = " + myMinShortValue);
        System.out.println("Short Max = " + myMaxShortValue);

        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Min = " + myMaxLongValue);
        System.out.println("Long Max = " + myMaxLongValue);
        
        long bigLongLiteralValue = 2_147_483_647L;
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;

        int myTotal = (myMinIntValue / 2);

        byte myNewByteValue = (byte)(myMinByteValue / 2);

        short myNewShortValue = (short)(myMinShortValue / 2);

        System.out.println("__________________________________");


        byte challengeByte = 7;
        short challengeShort = 39;
        int challengeInt = 91;
        long challengeLong = 50000 + (10 * (challengeByte + challengeShort + challengeInt));
        System.out.println(challengeLong);
    }
}