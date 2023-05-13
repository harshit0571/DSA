class Solution {
    public String intToRoman(int num) {
        String[] symbol={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[] value={1000,900,500,400,100,90,50,40,10,9,5,4,1};

        int i=0;
        StringBuilder sb=new StringBuilder();
        while(num>0){
            while(num>=value[i]){
                num=num-value[i];
                sb.append(symbol[i]);
            }
            i++;
        }
        return sb.toString();
    }
}


//1994 994
//M 
