package javacoding;
import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {

    // Method to check if two strings are isomorphic
    public boolean isIsomorphic(String s, String t) {
        if (s == null || t == null)
            return false;

        // If strings have different lengths, they cannot be isomorphic
        if (s.length() != t.length())
            return false;

        // Empty strings are considered isomorphic
        if (s.length() == 0 && t.length() == 0)
            return true;

        // Map to store character mappings from s to t
        HashMap<Character, Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            // Get the key in the map with the value c2
            Character c = getKey(map, c2);

            // If there is already a mapping to a different character, return false
            if (c != null && c != c1) {
                return false;
            } 
            // If c1 is already mapped to a different character, return false
            else if (map.containsKey(c1)) {
                if (c2 != map.get(c1))
                    return false;
            } 
            // Add a new mapping from c1 to c2
            else {
                map.put(c1, c2);
            }
        }

        return true;
    }

    // Helper method to get the key for a given value in the map
    public Character getKey(HashMap<Character, Character> map, Character target) {
        for (Map.Entry<Character, Character> entry : map.entrySet()) {
            if (entry.getValue().equals(target)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public static void main(String[] args) {
        IsomorphicStrings iso = new IsomorphicStrings();
        
        // Test cases
        String s1 = "egg";
        String t1 = "add";
        
        String s2 = "foo";
        String t2 = "bar";
        
        System.out.println("Are '" + s1 + "' and '" + t1 + "' isomorphic? " + iso.isIsomorphic(s1, t1)); // true
        System.out.println("Are '" + s2 + "' and '" + t2 + "' isomorphic? " + iso.isIsomorphic(s2, t2)); // false
    }
}
