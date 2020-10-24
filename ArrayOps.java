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
    int[]Sum_Array = new int[matrix.length];
    int Row_Sum = 0;

    for (int i = 0 ; i < matrix.length; i++)
    {
      for (int j = 0; j < matrix[i].length; j++)
      {
        if (j == 0)
        {
          Row_Sum = 0;
        }
        Row_Sum += matrix[i][j];

      }
      Sum_Array[i] = Row_Sum;

    }
    return Sum_Array;
  }

  public static int[] largestInRows (int[][] matrix)
  {
    int[]C = {5,4} ;
    return C;

  }
}
