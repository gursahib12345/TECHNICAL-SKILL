
// // given an array count number of element having atleat one element greater thean itself
package WEEK1;
public class question1 {
    public static void main(String args[]){
        int [] arr={-3,2,6,8,4,8,5};
        int count =0;
        int n=arr.length;
        int highest=arr[0];
        for(int i =0;i<arr.length;i++){
            if(arr[i]>highest){
                highest=arr[i];
            }
        }
        for (int i=0;i<arr.length;i++){
            if(arr[i]!=highest){
                count=count+1;
            }
        }
        System.out.println(count);

    }    
}

// observation: for every max element there wont be any greater than itself
//Procedure
// // step 1:iterate and find the max element from the array
// // step 2: iterate and get the numbers of elements that are not equal to max
// Step 3: increment the count

