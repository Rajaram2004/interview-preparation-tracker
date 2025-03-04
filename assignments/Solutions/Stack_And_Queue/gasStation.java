class Solution {
    
    public int startStation(int[] gas, int[] cost) {
        // code here
      int tank=0,curr=0;
      int start=0;
       for(int i=0;i<gas.length;i++){
           tank+=gas[i]-cost[i];
           curr+=gas[i]-cost[i];
           if(curr<0){
               start=i+1;
               curr=0;
           }
       }
       if(tank>=0) return start;
       return -1;
    }
    
}