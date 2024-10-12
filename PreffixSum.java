
public class PreffixSum {

    public static void PreSum (int arr[]) {
        int n=arr.length;
        int pre[]=new int[n];
        pre[0]=arr[0];
        for(int i=1;i<n;i++){
            pre[i]=pre[i-1]+arr[i];
        }
        int Maxsum=Integer.MIN_VALUE;


        for(int i=0;i<n;i++){
            int sum=0;
            int s=i;
            for(int j=i;j<n;j++){
                int e=j;
                sum= s==0 ?   pre[e] :pre[e] -pre[s-1];
            }
            if(sum>Maxsum){
                Maxsum=sum;
            }
        }

        System.out.println(Maxsum);
    }
    

    public static void main(String[] args) {
        int array[]={1,-2,6,-1,3};
        PreSum(array);
        
    }
}
