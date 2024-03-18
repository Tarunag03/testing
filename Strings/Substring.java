public class Substring {
    public static void subs(StringBuffer str){
           for(int i=0;i<str.length();i++){
            StringBuffer s=new StringBuffer();

            for(int j=i;j<str.length();j++){
            s.append(str.charAt(j));                   //jisse space bache isliye string buffer
                                                      // waise string se bhi ho jayega substring function use krna pdega
                                                      //kyuki j hr baar shuru se print krega na
                                                    
                System.out.println(s);
            }
               
           }
      

    }
    public static void main(String[] args) {
        StringBuffer str=new StringBuffer("abc");
        subs(str);
    }
}
