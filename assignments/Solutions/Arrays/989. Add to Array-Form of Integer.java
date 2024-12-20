class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
      int n=num.length;
      List<Integer> list=new ArrayList<>();
      int carry=k,total;
      for(int i=n-1;i>=0;i--){
        total=num[i]+carry;
        list.add(total%10);
        carry=total/10;
      }
      while(carry>0){
        list.add(carry%10);
        carry/=10;
      }
      Collections.reverse(list);


        return list;
    }
}

/*not completed(partially correct)
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int n= num.length;
        int temp,temp1;
        List<Integer> list= new ArrayList<>();
        int kcount=(int)Math.log10(k)+1;
        for(int i=1;i<=kcount;i++){
            temp=k%10;
            num[n-i]+=temp;
            k/=10;
        }

        for(int i=n-1;i>0;i--){
            if(num[i]>9){
                temp=num[i]%10;
                temp1=num[i]/10;
                num[i-1]+=temp1;
                num[i]=temp;
            }

        }

        for(int i=0;i<n;i++)
            System.out.println(num[i]);
        int index=0;
        for(int i=0;i<n;i++){
            if((int)Math.log10(num[i])>=1){
                temp=num[i]%10;
                temp1=num[i]/10;
                list.add(index,temp1);
                index++;
                list.add(index,temp1);
                index++;
            }
            else{
                list.add(index,num[i]);
                index++;
            }
    }

        return list;
    }
}
*/