import java.util.*;
public class slidingWindow {
    public static int[] maxSlidingWindow(int a[],int k)
    {
        int n=a.length;
        int r[]=new int[n-k+1];
        int ri=0;
        Deque<Integer> q=new ArrayDeque<>();
        for(int i=0;i<n;i++)
        {
            while(!q.isEmpty()&&q.peek()<i-k+1)
            {
                q.poll();
            }
            while(!q.isEmpty()&&a[q.peekFirst()]<a[i])
            {
                q.pollLast();
            }
            q.offer(i);
            if(i>=k-1)
            {
                r[ri++]=a[q.peek()];
            }
        }
        return r;

    }
    public static void main(String[] args) {
        int arr[]={2,4,7,10,12,15,25,17};
        int n=8;
        int k=3;
        int res[]=new int[n-k+1];
        res=maxSlidingWindow(arr,k);
        System.out.println("The desired output is:"+Arrays.toString(res));
    }
}
