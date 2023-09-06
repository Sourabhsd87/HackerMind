public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        boolean flag = true;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)==' ')
            {}
            else{
                flag=false;
            }
        }
        if(flag==true)
            System.out.println("0");
            
        if(!flag){
        String a = s.trim();
        // if(s.isEmpty())
        //     System.out.println("0");
        String [] b = a.split("[\\s\\p{Punct}]+");
        System.out.println(b.length);
        for (String string : b) {
            System.out.println(string);
        }
        }
        scan.close();
    }
}
