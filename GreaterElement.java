import java.util.ArrayList;
public class GreaterElement {
    public static void main(String[] args) {
        int []arr={3,15,31,6,44,69,23,41,22};
        int num=0;
        int index=0;
        for (int i=0;i<arr.length;i++){
            if (num<arr[i]){
                num=arr[i];
                if (arr[i]==num){
                    index=i;
                }
            }
        }
        System.out.println("The Greatest No In this Array is: "+num);
        System.out.println("The Index of this Number is: "+index);
    }
}
