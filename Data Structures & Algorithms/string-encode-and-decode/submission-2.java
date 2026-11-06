class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s: strs){

            sb.append(s.length()).append("#").append(s);

        }

        return sb.toString();
    }

    public List<String> decode(String str) {

        List<String> results = new ArrayList<>();
        int i = 0;
        while(i < str.length()){
            int j = i;
            while(str.charAt(j) != '#'){
                j++;
            }

            int length = Integer.parseInt(str.substring(i,j));
            int start = j + 1;
            results.add(str.substring(start, start + length));
            i = start + length;

        }

        return results;

        
    }

    public boolean isAlphanumeric(char c){
        return (c >= '0' && c <= '9') || (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }
}
