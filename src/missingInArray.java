class missingInArray {
    int missingNumber(int arr[]) {
        // code here
        int n = arr.length + 1;
        long total_sum = (long) n * (n + 1) / 2;
        long current_sum = 0;
        for(int num : arr){
            current_sum += num;
        }
        return (int) (total_sum - current_sum);
    }
}