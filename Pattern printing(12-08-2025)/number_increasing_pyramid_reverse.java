public class number_increasing_pyramid_reverse {
    public static void main(String[] args) {
    for(int i=1;i<=4;i++){
        for(int j=1;j<=4;j++){
            if (j<=5-i) {
                System.out.print(j);
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
} 
}
