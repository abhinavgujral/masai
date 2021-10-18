import java.util.Scanner;
class Main{
 
  static long time(long[] arr, long mid){
  long sum=0;
    for(int i=0;i<arr.length;i++)
    {
      if(arr[i]%mid>0)
        sum+=(arr[i]/mid)+1;
      else if(arr[i]%mid==0)
        sum+=arr[i]/mid;
      else if(arr[i]<mid)
        sum+=mid;
        
    //  System.out.println(sum);
    }
    return sum;
  }
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int t=sc.nextInt();
    while(t--!=0){
    int n=sc.nextInt();
    long k=sc.nextLong();
    long[] arr= new long[n];
    long sum=0;
    for(int i=0;i<n;i++)
    {
      arr[i]=sc.nextLong();
      sum+=arr[i];
    }
    long low=1,high=sum,mid=0,res=0,count=sum;
    while(low<=high&&count--!=0)
    {
      mid=low+(high-low)/2; //  System.out.println("low"+low+" high"+high+" mid"+mid+" time"+time(arr,mid));
      
      
      if(time(arr,mid)<=k){
        res=mid;
        high=mid-1; 
     }
        
      else if(time(arr,mid)>k)
        low=mid+1;  
      
    }
      System.out.println(res);
    }
   }
  }
        