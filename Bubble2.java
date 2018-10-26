public class Bubble2
        {
    public static void main(String args[]) 
    {
      

System.out.println("Gisela Calva - Project 3");
    
    int [] A = new int [(int)(Math.random() * (20 - 12 + 1) + 12)];
    
    //Counts number of data used
    System.out.print("Number of random numbers: ");
    System.out.println("");
    
   // for (int i = 0; i < A.length; i++)
  //  {
  //    if (A[i] = 
  //  }
    
    //Get Sample Data
    System.out.println("");
    System.out.print("Sample Data: ");
    System.out.println("");
    
    for (int i = 0; i < A.length; i++)
    {
      A[i] = (int)(Math.random() * (90 - 10 + 1) + 10);
      System.out.print(A[i] + " ");
    }
    
    //Get Minimum
    System.out.println("");
    System.out.print("Minimum = ");
    
    for (int i = 0; i < A.length; i++)
    {
      int minIndex = i;
      int min = A[0];
    
      for (int j = i + 1; j < A.length; j++)
        if (min > A[j])
      {
        min = A[j];
        minIndex = j;
      }
      
      if (minIndex != i)
      {
        A[minIndex] = A[0];
        A[0] = min;
      }
            
      System.out.print(min + ", ");
      break;
    }
    
    //Get Maximum
    System.out.print("Maximum = ");
    
    for (int i = 0; i < A.length; i++)
    {
      int maxIndex = i;
      int max = A[0];
    
      for (int j = i + 1; j < A.length; j++)
        if (max < A[j])
      {
        max = A[j];
        maxIndex = j;
      }
      
      if (maxIndex != i)
      {
        A[maxIndex] = A[0];
        A[0] = max;
      }    
      
      System.out.print(max);
      break;
    }
    
    System.out.println("Gisela Calva - End of Project");
    }
}