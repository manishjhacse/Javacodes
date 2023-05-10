import java.util.*;

public class printAllSeq {
    public static void print_sequence(int arr[],int index, ArrayList<Integer> tempArr)
    {
        //base case
        if(index==arr.length)
        {
            //print subsequence but don't print empty sequence
            if(tempArr.size()>0)
            {
                System.out.println(tempArr);
            }
            return;
        }

        //recursive call
        //include
        print_sequence(arr, index+1, tempArr);
        //add the value in temp array
        tempArr.add(arr[index]);
        //do not include
        print_sequence(arr, index+1, tempArr);
        //remove the last value
        tempArr.remove(tempArr.size()-1);

    }
    public static void main(String[] args) {
        int arr[]={1,2,3};
        System.out.println("for the array: "+Arrays.toString(arr));
        System.out.println("subsequences:");
        ArrayList<Integer> tempArr=new ArrayList<>();
        print_sequence(arr, 0, tempArr);
    }
}
