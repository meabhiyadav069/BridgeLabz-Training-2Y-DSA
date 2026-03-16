public class TimeTakenToConvertString {
    public static void main(String[] args) {
        String s = "BANANA";
        int freq[] = new int[26];
        
        int vowel = 0;
        int consonent = 0;
        for(int i =0; i<s.length(); i++){
            freq[s.charAt(i) - 'A']++;
            if("AEIOU".indexOf(s.charAt(i)) != -1){
                vowel++;
            }else{
                consonent++;
            }

        } 

        int max = freq[0];
        char chosen = 'A';

        for(int i = 1; i<26; i++){
            if(max < freq[i]){
                max = freq[i];
                chosen = (char)(i + 'A');
            }
        }

        int check = 0;

        if("AEIOU".indexOf(chosen) != -1){
            check = 1;
        }

        for(int i = 0 ; i < s.length(); i++){
            char x = s.charAt(i);
        }
    }
}
