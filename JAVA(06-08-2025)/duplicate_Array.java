public class duplicate_Array {
    public static void main(String[] args) {
        int arr[]={1,2,2,3,4,5,8};
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if (arr[j]==arr[j+1]) {
                    arr[j]=30;
                }
            }
        }
        for (int Arr: arr){
            System.out.print(Arr+"  ");
        }
    }
    
}
