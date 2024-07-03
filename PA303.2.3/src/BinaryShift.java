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

// pt2

        // declares a variable x and assigns 150 to it
        int x2 = 150;

        // prints out the binary string version of the number
        System.out.println(Integer.toBinaryString(x2));
        // use shift operator to shift by 2 and assign the result to x
        x2 = x2 >> 1;

        System.out.println(x2);
        System.out.println(Integer.toBinaryString(x2));

        // second part

        int d = 225;
        int e = 1555;
        int f = 32456;

        System.out.println(Integer.toBinaryString(d));
        System.out.println(Integer.toBinaryString(e));
        System.out.println(Integer.toBinaryString(f));

        d = d >> 1;
        e = e >> 1;
        f = f >> 1;

        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

        System.out.println(Integer.toBinaryString(d));
        System.out.println(Integer.toBinaryString(e));
        System.out.println(Integer.toBinaryString(f));

        // pt3

        int x1 = 7;
        int y = 17;

        int z = x1 & y;

        System.out.println(Integer.toBinaryString(x1));
        System.out.println(Integer.toBinaryString(y));
        System.out.println(Integer.toBinaryString(z));

    }
}