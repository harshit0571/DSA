class Solution {
    public String capitalizeTitle(String s) {
        String[] arr=s.split(" ");
        System.out.println(arr[0]);
        for(int i=0;i<arr.length;i++){
            if(arr[i].length()>2){
                StringBuilder sb=new StringBuilder(arr[i]);
                boolean flag=true;
                for(int j=0;j<sb.length();j++){
                    if(flag){
                        if(sb.charAt(j)>='a' && sb.charAt(j)<='z'){
                            sb.setCharAt(j, (char)(sb.charAt(j) -32));
                        }
                        flag=false;
                    }
                    else{
                        if(sb.charAt(j)>='A' && sb.charAt(j)<='Z'){
                            sb.setCharAt(j, (char)(sb.charAt(j) +32));
                        }
                    }
                }
                arr[i]=sb.toString();
            }
            else{
                StringBuilder sb=new StringBuilder(arr[i]);
                arr[i]=arr[i].toLowerCase();
            }
        }
        String ans="";
        for(int i=0;i<arr.length;i++){
            ans=ans+arr[i]+(i==arr.length -1? "":" ");
        }
        return ans;
    }
}
