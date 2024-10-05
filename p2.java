class p2{
    public static void main(String[] args) {
        int arr[]={10,4,2,8};
        int min=0,max=0;
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-1;j++){
            if(arr[i]>arr[j]){
                 max=arr[i];
                 arr[i]=arr[j];
                 arr[j]=max;
                }  
            if(arr[i]<arr[j]){
                    min=arr[i];
                    arr[i]=arr[j];
                    arr[j]=min;     
                } 
            } 
            System.out.println("min element :"+min);
            System.out.println("max element :"+max);
            break; 
            }
        }
    }

