public class OrderAgnosticBinarySearch {
    public static void main(String[] args)
    {
//     int[] arr = {2,3,5,7,9,12,13,14,15,18,20};
     int[] arr = {30,28,25,23,22,20,19,17,16,12};
     int ans = binarySearch(arr,19);
        System.out.println(ans);
    }

    static boolean isOrderAgnostic(int[] arr){
//       boolean ans = false;
       if(arr[0]<arr[arr.length-1]){
//           ans = true;
           return true;
       }
       else {
           return false;
       }
    }


  static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
       if(isOrderAgnostic(arr)){
         return searchInAsc(arr,target, start, end);
       }else{
           return searchInDes(arr,target, start, end);
       }
   }


    static int searchInAsc(int[] arr , int target , int start, int end){
           while(end>=start){
               int mid = start + (end-start)/2;

               if(arr[mid]>target){
                   end = mid-1;
               }
               else if(arr[mid]<target) {
                   start = mid +1;
               }
               else{
                   return mid;
               }

           }

           return -1;
       }

     static  int searchInDes(int[] arr , int target , int start, int end){
        while(end>=start){
            int mid = start + (end-start)/2;

            if(arr[mid]>target){
//                end = mid-1;
                start = mid +1;
            }
            else if(arr[mid]<target) {
                  end = mid-1;
//                start = mid +1;
            }
            else{
                return mid;
            }

        }

        return -1;
    }



}
