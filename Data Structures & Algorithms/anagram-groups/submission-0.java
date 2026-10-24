class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        if(strs.length == 1) {
            List<List<String>> res = new ArrayList();
            List<String> resp = new ArrayList();
            resp.add(strs[0]);
            res.add(resp);
            return res;
        }

        Map<List<Integer>, List<String>> map = new HashMap();

        for(int i = 0; i < strs.length; i++) {
            List<Integer> strmap = new ArrayList(Collections.nCopies(26, 0));
            String str = strs[i];
            for(int j = 0; j < str.length(); j++) {
                strmap.set(str.charAt(j) - 'a', strmap.get(str.charAt(j) - 'a') + 1);
            }
            List<String> groupedStr = map.getOrDefault(strmap, new ArrayList<String>());
            groupedStr.add(str);
            map.put(strmap, groupedStr);
        }
        List<List<String>> res = new ArrayList(map.values());
        return res;

    }
}
