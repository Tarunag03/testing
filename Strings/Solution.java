class Solution{
    public static String removeConsecutiveCharacter(String S){
        String str="";
        for(int i=0;i<S.length();i++){
            if(i<S.length()-1 && S.charAt(i)==S.charAt(i+1)){
                continue;
            }
            else{
             str=str+S.charAt(i);
             }
        
    }
    return str;
}

public static void main(String[] args) {
String str="aabb";
String str1=removeConsecutiveCharacter(str);    
System.out.println(str1);
}
}
