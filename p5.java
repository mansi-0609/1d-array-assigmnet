import java.util.Scanner;
class p5{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={10,20,30,40,50};
        System.out.println("enter number ");
        int k=sc.nextInt();
        System.out.println(k+" smallest element : "+arr[k-1]);
        int s=arr.length-k;
        System.out.println(k+"largest element : "+arr[s]);

    }
}