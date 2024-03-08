class Solution {
    public String longestCommonPrefix(String[] strs) {
       if (strs == null || strs.length == 0) return "";

        List<char[]> charArrays = new ArrayList<>();
        for (String str : strs) {
            charArrays.add(str.toCharArray());
        }

        StringBuilder commonPrefix = new StringBuilder();
        char[] firstWordChars = charArrays.get(0);

        for (int i = 0; i < firstWordChars.length; i++) {
            char ch = firstWordChars[i];
            boolean match = true;

            for (int j = 1; j < charArrays.size(); j++) {
                char[] chars = charArrays.get(j);

                if (i >= chars.length || chars[i] != ch) {
                    match = false;
                    break;
                }
            }

            if (match) {
                commonPrefix.append(ch);
                
            }
            else{
                break;
            }

            
        }

        return commonPrefix.toString();
    }
    }
