class Solution {
    public int numberOfSteps(int num) {
        
        if(num==0) return 0;
        int count=step(0,num);
        return count;
    }
    public int step(int count,int num){
        if(num==0){
            return count;
        }
        if(num%2==0){
            num=num/2;
        }
        else{
            num=num-1;
        }
        return step(count+1,num);
    }
}


// ternary operation

// public int step(int num){
//     if (num==0) return 0;
//     return 1 + ((num%2==0) ? step(num/2) : step(num-1));
// }