public class repeat {
    public static void main(String[] args) {
        
        String s = "Hello";
        for(int i=0; i<s.length();i++){
            int count = 0;
            for(int j=0; j<s.length();j++){
                if(s[i].equals(s[j]) && i!=j ){
                    count++;
                    break;
                }
            }
            if(count==0){
                print(s[i]);break;
            }

        }
    }
    
}
