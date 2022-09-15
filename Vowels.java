// Java program to remove vowels from a String
import java.util.Arrays;
import java.util.List;

class Vowels
{
    static String remVowel(String str)
    {
        return str.replaceAll("[aeiouAEIOU]", "");
    }

    // Driver Code
    public static void main(String[] args)
    {
        String str = "Anvitha";
        System.out.println(remVowel(str));
    }
}

