class Solution {
    public String addBinary(String a, String b) {
       StringBuilder s = new StringBuilder();
       int num1 = a.length()-1;
       int num2 = b.length()-1;
       int carry = 0;
       while(num1>=0||num2>=0)
       { int sum= carry;
         if(num1>=0){
            sum+=a.charAt(num1)-'0';
            num1--;
         }
         if(num2>=0){
            sum+=b.charAt(num2)-'0';
            num2--;
         }
         s.append(sum%2);
         carry=sum/2;
         }
         
         if(carry!=0){
            s.append(carry);
         }
         return s.reverse().toString();


       
    }
}