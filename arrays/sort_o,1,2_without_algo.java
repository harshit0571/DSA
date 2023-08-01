class Solution
{
    public static void sort012(int a[], int n)
    {
        int z=0;
        int o=0;
        int t=0;
          for(int i=0;i<a.length;i++){
              if(a[i]==0){
                  z++;
              }
              else if(a[i]==1){
                  o++;
              }
              else{
                  t++;
              }
          }
        int i=0;
        while(i<n){
            if(z>0){
                a[i]=0;
                z--;
            }
            else if(o>0){
                a[i]=1;
                o--;
            }
            else{
                a[i]=2;
                t--;
            }
            i++;
        }
    }
}
