    static boolean isAnagram(String a, String b) {
        // Complete the function
        if(a.length()!=b.length())
            return false;
        String A = a.toLowerCase();
        String B = b.toLowerCase();
        int flag = 0;
        for(int i=0;i<A.length();i++){
            int count1=0;
            int count2=0;
            for(int j=0;j<A.length();j++){
                if(A.charAt(i)==A.charAt(j)){
                    count1++;
                }
                if(A.charAt(i)==B.charAt(j)){
                    count2++;
                }
            }
            if(count1!=count2){
                flag=1;
                break;
            }
        }
        if(flag==0)
            return true;
        else
            return false;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
