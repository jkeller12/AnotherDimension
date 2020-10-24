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
    int[]Sum_Arr = new int[matrix[1].length];
    for (int i = 0 ; i < matrix[1].length; i++)
    {
      int Sum_Value = 0 ;
      for (int j = 0 ; j < matrix.length; j++)
      {
        Sum_Value += matrix[j][i];
      }
      Sum_Arr[i] = Sum_Value;
    }
    return Sum_Arr;
  }



  public static boolean isRowMagic(int[][] matrix)
  {
    int[]Sum_Matrix = sumRows(matrix);
    for (int i = 1 ; i < Sum_Matrix.length; i++)
    {
      if (Sum_Matrix[i-1] != Sum_Matrix[i])
      {
        return false;
      }
    }
    return true;
  }

  public static boolean isColMagic(int[][] matrix)
  {
    int[]Sum_Matrix = sumCols(matrix);
    for (int i = 1; i < Sum_Matrix.length; i++)
    {
      if (Sum_Matrix[i-1] != Sum_Matrix[i])
      {
        return false;
      }
    }
    return true;
  }

  public static boolean isLocationMagic(int[][] matrix, int row, int col)
  {
    // Returns true when the row and columns specific have the same sum
    int[]Col_Matrix = sumCols(matrix);
    int[]Row_Matrix = sumRows(matrix);

    return Col_Matrix[col] == Row_Matrix[row];
    
  }
}
