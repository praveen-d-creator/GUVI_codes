public class Pangram{

 
    public static void main(String[] args) {
       
        char[] a=new char[26];
        char[] b=new char[26];
        int m=0,n=0,count=0;
        for(char i='a';i<='z';i++)
        {
         a[m]=i;
         m++;
        }
         for(char j='A';j<='Z';j++)
        {
         b[n]=j;
         n++;
        }
       Scanner sc=new Scanner(System.in);
       String str=sc.nextLine();
       for(int l=0;l<26;l++){
       for(int j=0;j<str.length();j++)
       {
        if(str.charAt(j)==a[l]||str.charAt(j)==b[l])
        {
          count++;
          a[l]=(char)-1;
           b[l]=(char)-1;
        }
            }}
        if(count==26)
        {
            System.out.println("yes it is a pangram");
        }
        
    }
}