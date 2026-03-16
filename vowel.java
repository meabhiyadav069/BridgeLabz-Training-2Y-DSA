public class vowel {
    public static void main(String[] args) {
        String s = "education";

        for(int i =0; i<s.length(); i++){
            if("aeiouAEIOU".indexOf(s.charAt(i)) != -1){
                System.out.println("vowel exist");
                return;
            }
        }

        System.out.println("vowel doesnt exist");
    }
}
