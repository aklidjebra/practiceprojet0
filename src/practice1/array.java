package practice1;

public class array {
    public static void main(String[] args) {
        int[] array = new int[5];

        array[0] = 10;
        array[1] = 12;
        array[2] = 15;
        array[3] = 20;
        array[4] = 25;
        System.out.println(array[3]);
        System.out.println(array.length);
        for (int A = 0; A < array.length; A++) {
            System.out.println(array[A]);

        }

        System.out.println("===========");
        for (int B : array) {
            System.out.println(B);

        }
        System.out.println("===========");




        int[][] array2 = new int[2][3];

        array2[0][1] = 4;
        array2[1][1] = 5;
        System.out.println(array2.length);
        System.out.println(array2[1].length);
        for (int row=0; row<array2.length; row++){


            for (int col=0; col<2; col++){


                System.out.println(array2[row][col]);
            }
        }
    }
}