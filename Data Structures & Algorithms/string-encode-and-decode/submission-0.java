class Solution {

    public String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < strs.size(); i++){
            int size = strs.get(i).length();
            res.append(size + "#" + strs.get(i));
        }
        return res.toString();
    }

    public List<String> decode(String str) {
        List<String> resArray = new ArrayList<>();
        int i = 0;
        while (i < str.length()){
            int delimiterIndex = str.indexOf("#", i);
            String sizeString = str.substring(i, delimiterIndex);
            int size = Integer.parseInt(sizeString);
            int start = delimiterIndex + 1;
            resArray.add(str.substring(start, start + size));
            i = start + size;
        }
        return resArray;

    }
}