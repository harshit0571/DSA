import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int t=inp.nextInt();
        int n=inp.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=inp.nextInt();
        }
        
        
        int left=0;
        int right=n-1;
        int ans=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
                        ans= arr[mid];

            if(arr[mid] == t){
                break;
            }
            else if(arr[mid]<t){
                left=mid+1;
 
            }
            else{
                right=mid-1;
            }
        }
        System.out.println(ans);
    }
}
