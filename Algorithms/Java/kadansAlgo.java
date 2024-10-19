public class kadansAlgo {

    public static int kadansAlgorithm(int arr[])
    {
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        int fl = 0;

        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i]>-1)
            {
                fl = 1;
                break;
            }
            ms = Math.max(ms, arr[i]); 
        }

        if(fl == 1)
        {

        for(int i = 0; i<arr.length; i++)
        {
            cs = cs + arr[i];
            if(cs < 0)
            {
                cs = 0;
            }

            ms = Math.max(ms, cs);
        }
    }

        return ms;
    }
    public static void main(String arg[])
    {
        int arr[] = {-1, 2, 5, -6, 8, -7, 9, 3};

        System.out.println("Maximim Sum is: " + kadansAlgorithm(arr));
    }
}
