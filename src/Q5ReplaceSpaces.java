import java.lang.reflect.Array;
/**
 * This question is asking replace the white space with %20 and add /0 at the end of the string
 * And we are aiming for time complexity of O(n)
 * The built in function of string.replace do have the time complexity O(n)
 * If we are built the replace function ourselves, we need to go through the string once and find the final size of
 * the string with the replacements, and then create two pointer, one pointing to the last and the other one pointing to
 * the last of the original string and move forward step by step. The time complexity also O(n), to be precise the time complexity
 * will be O(2n)
 *
 *
 * */
public class Q5ReplaceSpaces {
    String target ="";
    public Q5ReplaceSpaces(String ss){
        this.target = ss;
    }
    public String solve(){
        String ans ="";
        ans = target.replace(" ", "%20");
        ans = ans + "/0";
        return ans;
    }
    public static void main(String[] args) {
        String ss = "We are very Happy";
        Q5ReplaceSpaces q5  = new Q5ReplaceSpaces(ss);
        String ans = q5.solve();
        System.out.println(ans);
    }

}

