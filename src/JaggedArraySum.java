public class JaggedArraySum {

    public static void main(String[] args) {
        int jaggedArray[][]={
                {1,2,3},
                {4,5},
                {7}
        };
        int sum=getSumAtPrimeIndex(jaggedArray);
        System.out.println(sum);

    }
    public static int getSumAtPrimeIndex(int [][]array)
    {
        int sum=0;

        for (int i = 0; i < array.length ; i++) {
            if (isPrime(i))
            {
                for (int j = 0; j <array[i].length ; j++) {
                     sum+=array[i][j];

                }
            }

        }
        return sum;
    }


    public static boolean isPrime(int number)
    {
        if (number<2)
        {
            return false;
        }
        for (int i = 2; i <=Math.sqrt(number) ; i++) {
            if (number%i==0)
            {
                return false;
            }

        }
        return true;
    }

}
