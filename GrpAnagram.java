import java.util.*;
public class GrpAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of strings:");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        String[] strings = new String[n];
        
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            strings[i] = sc.nextLine();
        }
        
        Map<String, List<String>> anagramGroups = new HashMap<>();
        
        for (String str : strings) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);
            
            if (!anagramGroups.containsKey(sortedStr)) {
                anagramGroups.put(sortedStr, new ArrayList<>());
            }
            anagramGroups.get(sortedStr).add(str);
        }
        
        System.out.println("Anagram groups:");
        for (List<String> group : anagramGroups.values()) {
            System.out.println(group);
        }
    }
}
