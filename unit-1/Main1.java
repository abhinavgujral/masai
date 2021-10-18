import java.util.Scanner;

class Main1
{
  static long ship(long[] arr, long mid){
  long sum=0; long count=1;
    for(int i=0;i<arr.length;i++)
    {
        sum+=arr[i];
     if(sum>mid)
     {   sum=arr[i];
         count++;
    }
}
    return count;
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
    long low=1,high=sum,mid=0,res=0;
    while(low<=high)
    {
      mid=low+(high-low)/2; //  System.out.println("low"+low+" high"+high+" mid"+mid+" time"+time(arr,mid));
      
      
      if(ship(arr,mid)<=k){
        res=mid;
        high=mid-1; 
     }
        
      else if(ship(arr,mid)>k)
        low=mid+1;  
      
    }
      System.out.println(res);
    }
   }
  }
        