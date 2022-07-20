//LINK: https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/

class Solution {
    public double average(int[] salary) {
        int min=findMin(salary);
        int max=findMax(salary);
        double sum=0;
        for(int i:salary){
            if(i==salary[min] || i==salary[max])
                continue;
            else
                sum+=i;
        }
        return sum/(salary.length-2);
    }
    public static int findMin(int[] arr){
        int min=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[min])
                min=i;
        }
        return min;
    }
    
        public static int findMax(int[] arr){
        int max=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[max])
                max=i;
        }
        return max;
    }
}
