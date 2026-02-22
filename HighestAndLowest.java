public class HighestAndLowest
{
    public static void main(String[] args){
        int[] arr = ArrayUtility.getArrayFromUser();
        int highest = highestArr(arr);
        System.out.println("Your Highest Number Is: " + highest );
        int miniMum = min(arr);
        System.out.println("Your Minimum Number Is: " + miniMum );
        
    }
    public static int highestArr(int[] arr ){
        if(arr.length == 0){
            return 0;
        }
        
        int max = arr[0];
        int i = 1;
        while(i < arr.length){
            if(max < arr[i]){
                max = arr[i];
            }
            i++;
        }
        
        return max;
    }
    public static int min(int[] arr ){
        int min = arr[0];
        int i = 1;
        if(arr.length == 0){
            return 0;
        }
        while(i < arr.length){
            if(i < min){
                min = arr[i];
            }
            i++;
        }
        
        
        return min;
    }
}