// given an integer a of size n in one second you can increase the value of one elemeent by 1 find the minimum time and second to make all the elements of the array equal
package WEEK1;
public class question3 {
    public static void main(String args[]){
        int [] arr={2,4,1,3};
        int n=arr.length;
        int greatest=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>greatest){
                greatest=arr[i];
            }
        }
        int time=0;
        for(int i=0;i<n;i++){
            time=time+(greatest-arr[i]);
        }
        System.out.println(time +" seconds");
    }
}
// observation
// to minimize the time ,make all elements equal to the max element in the array 
//step 1 find the max element int he array
//step 2 for every element calculate how much it needs to be increase to reach  the maximum
// step 3 sum of all those differences