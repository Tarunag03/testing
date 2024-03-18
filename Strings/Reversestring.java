class Reversestring{
    public static StringBuilder reverse(StringBuilder str){
        int a =str.length();
        for(int i=0;i<a/2;i++){
              char first=str.charAt(i);
              char last=str.charAt(a-i-1);
              str.setCharAt(i, last);;
              str.setCharAt(a-i-1, first);;
        } 
        return str;
    }
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("tarun agrawal");
        
        System.out.println(reverse(str));
    }
}