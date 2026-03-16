public class Anagram {
    public static void main(String[] args) {
        String s1 = "silent";
        String s2 = "listen";

        if(s1.length() != s2.length()){
            System.out.println("not an anagram");
            return;
        }

        int freq[] = new int[26] ;
        for(int i = 0; i<s1.length(); i++){
            freq[s1.charAt(i) - 'a']++;
            freq[s2.charAt(i) - 'a']--;
        }

        for(int i =0; i<s1.length(); i++){
            if(freq[i] != 0){
                System.out.println("not an anagram");
                return;
            }
        }

        System.out.println("it ia an anagram");
    }
}
