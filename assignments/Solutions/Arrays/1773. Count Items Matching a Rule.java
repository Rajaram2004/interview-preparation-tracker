class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        
        int n=items.size();
        int count=0;
for(int i=0;i<n;i++){
        switch(ruleKey){
            case "type":
                if((items.get(i).get(0)).equals(ruleValue))
                    count++;
                break;
            case "color":
             if((items.get(i).get(1)).equals(ruleValue))
                    count++;
                break;
            case "name":
             if((items.get(i).get(2)).equals(ruleValue))
                    count++;
                break;
        }
}
    return count;
    }
}