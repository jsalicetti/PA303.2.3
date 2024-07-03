public class BinaryShift {
    public static void main(String[] args) {

// pt1

        int x = 2;
        System.out.println(Integer.toBinaryString(x));
        x = x << 1;
        // predicted 4
        System.out.println(x);

        System.out.println(Integer.toBinaryString(x));

        int a = 9;
        int b = 17;
        int c = 88;

        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));
        System.out.println(Integer.toBinaryString(c));

        a = a << 1;
        b = b << 1;
        c = c << 1;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));
        System.out.println(Integer.toBinaryString(c));
    }
}


