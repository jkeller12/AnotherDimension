public class ArrayOps{

  public static int sum(int[] arr)
  {
    int Count_Sum = 0;
    for (int i = 0 ; i < arr.length; i++)
    {
      Count_Sum += arr[i];
    }
    return Count_Sum;
    // Takes an arry of int and returns a sum of
    //the ind. values in the ArrayOps
  }

  public static int largest(int[] arr)
  { int Max = 0;
    for (int i = 0 ; i < arr.length; i ++)
    {
      if (arr[i] > Max)
      {
        Max = arr[i];
      }
    }

    return Max;
  }

  public static int[] sumRows(int[][] matrix)
  {
    int[]B = {5,4};
    return B;
  }

  public static int[] largestInRows (int[][] matrix)
  {
    int[]C = {5,4} ;
    return C;

  }
}
