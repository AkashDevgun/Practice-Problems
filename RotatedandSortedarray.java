import java.util.*;
import java.lang.*;
import java.io.*;
 
class Minimum
{
    public static boolean searchElement(int A[], int data)
    {
        int left = 0;
        int right = A.length - 1;
        while (left <= right) {
            int mid = left + (right-left)/2;
            System.out.println(A[left]);
            System.out.println(A[mid]);
            System.out.println(A[right]);
            System.out.println("Next");

            if (A[mid] == data || A[left] == data || A[right] == data) {
                return true;
            }
            if (A[left] < A[mid]) {
                if (A[left] <=data && data < A[mid])
                right = mid-1;
                else
                left = mid +1; 
            }
            else if (A[left] < A[mid]) {
                if (A[mid] < data && data <= A[right]) {
                    left = mid +1 ;
                }
                else
                    right = mid -1;
                
            }
            else {
                left ++;
            }
            
        }
        return false;

    }
 
    public static void main (String[] args)
    {
        int arr1[] =  {5, 6, 7, 8, 9, 10, 11, 0, 1, 2, 3, 4};
        int n1 = arr1.length;
        System.out.println(searchElement(arr1, 11));
 
        int arr2[] =  {6, 7, 8, 9, 10, 0, 1,2, 3, 4, 5};
        int n2 = arr2.length;
        System.out.println(searchElement(arr2, 10));
    }
}
