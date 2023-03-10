package bonus00;

public class bonus {

    public static void main(String[] args) {
        int a = 1;
        INT A = new INT(1);

/*        System.out.println(a);
        System.out.println(A);

        System.out.println(++a);
        System.out.println(A.prevIncrease());

        System.out.println(a++);
        System.out.println(A.postIncrease());

        System.out.println(a);
        System.out.println(A);*/

        a = a++;
        A.value = A.postIncrease();
        System.out.println(a);
        System.out.println(A);

        System.out.println("=================");

        a = a++ + a;
        A.value = A.postIncrease() + A.value;
        System.out.println(a);
        System.out.println(A);

        System.out.println("=================");

        a = 1;
        A.value = 1;

        a = a + a++;
        A.value = A.value + A.postIncrease();
        System.out.println(a);
        System.out.println(A);

    }
}
