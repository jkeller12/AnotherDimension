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
    int[]Largest_Array = new int[matrix.length];
    int Large_Element = 0;

    for (int i = 0 ; i < matrix.length; i++)
    {
      for (int j = 0; j < matrix[i].length; j++)
      {
        if (j == 0)
        {
          Large_Element = 0;
        }
        if (Large_Element < matrix[i][j])
        {
          Large_Element = matrix[i][j];
        }

      }
      Largest_Array[i] = Large_Element;

    }
    return Largest_Array;

  }

  public static int sum(int[][] arr)
  { int[]Sum_Arr = new int[arr.length];
    for (int i = 0 ; i < arr.length; i++)
    {
      int Sum_Value = 0 ;
      for (int j = 0 ; j < arr[i].length; j++)
      {
        Sum_Value += arr[i][j];
      }
      Sum_Arr[i] = Sum_Value;
    }
    int Value = 0;
    for (int i = 0; i < Sum_Arr.length; i++)
    {
      Value += Sum_Arr[i];
    }
    return Value;
  }


  // Part 5

  public static int[] sumCols(int[][] matrix)
  {
    int[]Sum_Arr = new int[matrix.length];
    for (int i = 0 ; i < matrix.length; i++)
    {
      int Sum_Value = 0 ;
      for (int j = 0 ; j < matrix[i].length; j++)
      {
        Sum_Value += matrix[i][j];
      }
      Sum_Arr[i] = Sum_Value;
    }
    return Sum_Arr;
  }
}
