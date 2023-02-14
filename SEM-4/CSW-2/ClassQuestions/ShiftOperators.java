public class ShiftOperators {
    public static void main(String[] args) {
        int n = 12;
        int leftShift = n << 2; // This is the left shift operator
        int rightShift = n >> 2;    // This is the right shift operator
        int rightShiftUnsigned = n >>> 2; // This is right shift unsigned operators
        int rightShiftUnsigned2 = -12 >>> 2; // This is right shift unsigned operators

        System.out.println(leftShift);  // 48
        System.out.println(rightShift); // 3
        System.out.println(rightShiftUnsigned); // 3
        System.out.println(rightShiftUnsigned2);    // some large value

        /*
         * The difference between >> and >>> or right shift signed and right shift unsigned is
         * in the case of >> , the vacant left most digits are filled with 1 in case of negative and 0 in -ve case
         * in case of >>>, vacant place is filled with 0 in all cases
         */
    }
}
