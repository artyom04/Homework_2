public class Operators {
    public static void main(String[] args) {
        //Arithmetic Operations
        int x = 5, y = -1, z = 0;
        int result = ((x + y) - (++z - ++y)) * x;
        System.out.println("The result is: " + result);

        //Relational Operators
        System.out.println(!(x == 6 || y < 0) && z != 0);

        //Arrays
        int[] myFirstArray = new int[4];
        myFirstArray[0] = 1;
        myFirstArray[1] = 10;
        myFirstArray[2] = 15;
        myFirstArray[3] = 12;
        System.out.println("Second Element: " + myFirstArray[1]);
        System.out.println("Last Element: " + myFirstArray[myFirstArray.length - 1]);

        char[] mySecondArray = {'a', 'x', '$', '^'};
        System.out.println("First Element: " + mySecondArray[0]);

        double[] myThirdArray;
        myThirdArray = new double[]{0.2, 0.8, 25.6, 36.8, 96.5};
        System.out.println("Third Element: " + myThirdArray[2]);

        //If/Else Statement
        int number = 3657;

        if (number % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }

        System.out.println(x > 10 ? "Yes" : "No");

        //Switch Statement
        int k = 3;
        int g = 0;
        switch (k) {
            case 1:
                g++;
                break;
            case 2:
                g--;
                break;
            case 3:
                g += 5;
                break;
            case 4:
                g *= 3;
                break;
            default:
                g -= 5;
        }
        System.out.println("The value of g: " + g);
    }
}