public class maxHistogramArea {
    public static void main(String[] args) {
        int arr[]={2,1,5,6,2,3 };
        int n=arr.length;
        int prev_smaller[]=new int[n],next_smaller[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int flag=0;
            for(int j=i-1;j>=0;j--)
            {
                if(arr[i]>arr[j])
                {
                    prev_smaller[i]=j;
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                prev_smaller[i]=-1;
            }
        }
        for(int i=0;i<n;i++)
        {
            int flag=0;
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]>arr[j])
                {
                    next_smaller[i]=j;
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                 next_smaller[i]=n;
            }
        }
        int max=arr[0];
        for(int i=0;i<n;i++)
        {
            int width=next_smaller[i]-prev_smaller[i]-1;
            int area=arr[i]*width;
            if(area>max)
            {
                max=area;
            }
        }
        System.out.println("max area of histogram is "+max);


    }
}
