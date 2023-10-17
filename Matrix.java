public class MatrixAdditionExample{ 
  public static void main(String args[]){  
  //creating two matrices    
  int a[][]={{1,2,3},{2,3,4},{3,4,5}};    
  int b[][]={{2,3,4},{3,4,5},{1,2,3}};    

    System.out.println("Addition");
  //creating another matrix to store the sum of two matrices    
  int c[][]=new int[3][3];  //3 rows and 3 columns  
  //adding and printing addition of 2 matrices    
  for(int i=0;i<3;i++){    
    for(int j=0;j<3;j++){    
      c[i][j]=a[i][j]+b[i][j];
      System.out.print(c[i][j]+" ");    
    }    
    System.out.println();//new line    
  }
    System.out.println("Subtraction");
  //creating another matrix to store the subtraction of two matrices    
  int d[][]=new int[3][3];  //3 rows and 3 columns  
  //subtracting and printing subtraction of 2 matrices    
  for(int i=0;i<3;i++){    
    for(int j=0;j<3;j++){    
      d[i][j]=a[i][j]-b[i][j];
      System.out.print(d[i][j]+" ");    
    }    
    System.out.println();//new line    
  }  
    System.out.println("Multiplication");
  //creating another matrix to store the multpication of two matrices    
  int e[][]=new int[3][3];  //3 rows and 3 columns  
  //multiplying and printing multiplication of 2 matrices    
  for(int i=0;i<3;i++){    
    for(int j=0;j<3;j++){    
      e[i][j]=a[i][j]-b[i][j];
      System.out.print(e[i][j]+" ");    
    }    
    System.out.println();//new line    
  } 
    System.out.println("Division");
  //creating another matrix to store the division of two matrices    
  int f[][]=new int[3][3];  //3 rows and 3 columns  
  //dividing and printing division of 2 matrices    
  for(int i=0;i<3;i++){    
    for(int j=0;j<3;j++){    
      f[i][j]=a[i][j]-b[i][j];
      System.out.print(f[i][j]+" ");    
    }    
    System.out.println();//new line    
  } 
}}  
