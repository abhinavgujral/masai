import java.util.Scanner;
class Main{
    public static void main(String[] agrs){
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while(t--!=0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int arr[]=new int[n];
            int count_max=0;
            int ans=0;
            boolean flag=false;
            for(int i=0;i<n;i++){
                  
                arr[i]=sc.nextInt();
                int count=0;
                int num=arr[i];
                while(num>0){
                    if(num%10==k){
                    count++;
                    flag=true;
                        
                    }
                    num=num/10;
                }
                
              if(count>=count_max)
            {
                if(count>count_max||ans<arr[i])
                ans=arr[i];
            }
             count_max=count;
            
            }
            
            if(flag)
       System.out.println(ans);
       else
       System.out.println("-1");
        }
    }
}