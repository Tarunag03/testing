public class ReverseWord {
public static String reverse(String str){
        int a =str.length();
        String str1="";
        for(int i=a-1;i>=0;i--){
              str1=str1+str.charAt(i);     
        }return str1; 
    }
public static String reverseWord(String str){
    str=str+'#';
    int n=str.length();
    char j=str.charAt(n-1);
    String currentword="";
    String ans="";
 for(int i=1;i<=n;i++) {
    
    if(!(str.charAt(i-1)==' '||i==n)){
        currentword=currentword+str.charAt(i-1);
       }
    else{
        ans=ans+" "+reverse(currentword);
        currentword="";
    }
   
 }  
    
    return reverse(ans);
}
    //tarun is good insaan
    //naasni doog si nurat
    public static void main(String[] args) {
        String str="Hello I am tarun agrawal";
        System.out.println(reverseWord(str));
    }
}
