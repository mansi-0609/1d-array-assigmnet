class p3{
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        for(int i=0;i<arr.length;i++){
            for(int j=arr.length-i-1;j>=0;j--){
                System.out.print(arr[j]+" ");
            }break;
        }System.out.println();
    }
}