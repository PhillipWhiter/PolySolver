public class Math {
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static int[] pascal(int row)
    {
        int[] Pascal = new int[row];
        for(int i = 0; i < Pascal.length - 1; i++)
        {
            Pascal[i] = factorial(row) / (factorial(row - i) * factorial(i));
        }
        return Pascal;
    }
}
