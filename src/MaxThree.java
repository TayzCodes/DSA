public class MaxThree {


    public static void main(String[] args){
        int[] arr = new int[]{1,34,5,8,2,90};
        // 90, 34, 8
        int[] res = new int[]{-1,-1,-1};
        int first_max =  -1, second_max = -1, third_max =  -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]> first_max ){
                third_max = second_max;
                second_max = first_max;
                first_max = arr[i];
            }
            else if(arr[i]  > second_max ){
                third_max = second_max;
                second_max = arr[i];
            } else if(arr[i]> third_max){
                third_max = arr[i];
            }
        }
        System.out.println("first:"+ first_max + " second: "+second_max + "third: "+third_max);


    }
}
