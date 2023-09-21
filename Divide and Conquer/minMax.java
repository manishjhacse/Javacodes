public interface minMax {
    static class pair {
        int min;
        int max;
    }

    public static pair getMinMax(int arr[], int l, int h) {
        pair minmax = new pair();
        pair Leftminmax = new pair();
        pair Rightminmax = new pair();
        if (l==h) {
            minmax.min = arr[l];
            minmax.max = arr[l];
            return minmax;
        } else if (l == h - 1) {
            if (arr[l] < arr[h]) {
                minmax.min = arr[l];
                minmax.max = arr[h];
            } else {
                minmax.max = arr[l];
                minmax.min = arr[h];
            }
            return minmax;
        } else {

            int mid = l + (h - l) / 2;
            Leftminmax = getMinMax(arr, l, mid);
            Rightminmax = getMinMax(arr, mid + 1, h);
            if (Leftminmax.min < Rightminmax.min) {
                minmax.min = Leftminmax.min;
            } else {
                minmax.min = Rightminmax.min;
            }
            if (Leftminmax.max > Rightminmax.max) {
                minmax.max = Leftminmax.max;
            } else {
                minmax.max = Rightminmax.max;
            }
            return minmax;

        }
    }

    public static void main(String[] args) {
        int arr[] = { 50,-8, 45, 11, 9, 15,231, 75, 89, 97 };
        int n = arr.length;
        pair minmax = new pair();
        minmax = getMinMax(arr, 0, n - 1);
        System.out.println("Minimum value is "+minmax.min);
        System.out.println("Maximum value is "+minmax.max);

    }
}
