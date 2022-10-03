import java.util.Scanner;

/**
 *
 * @author Chamali
 */
public class SecondSmallest {
public static int getSecondSmallest(int[] a, int total){  
int temp;  
for (int i = 0; i < total; i++)   
        {  
            for (int j = i + 1; j < total; j++)   
            {  
                if (a[i] > a[j])   
                {  
                    temp = a[i];  
                    a[i] = a[j];  
                    a[j] = temp;  
                }  
            }  
        }  
       return a[1];//2nd element because index starts from 0  
}  
public static void main(String args[]){  
 Scanner s = new Scanner(System.in);
          int size = s.nextInt();
           int [] arr = new int[size];
         for (int k = 0; k < size; k++) {
              arr[k] = s.nextInt();
        }
System.out.println(getSecondSmallest(arr,size));  
}
}
