class Solution {
    public int lengthOfLongestSubstring(String s) {

        int l = 0;
        int r = 0;
        int count = 0;

        List<Character> list = new ArrayList<>();

        while(r < s.length()) {
            if(!list.contains(s.charAt(r))) {
                list.add(s.charAt(r));
                count = Math.max(count, r-l+1);
                r++;
            } else {
                list.remove(Character.valueOf(s.charAt(l)));
                l++;
            }
        }

        return count;
        
    }
}
