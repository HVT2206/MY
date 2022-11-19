
import java.util.Scanner;

class first{
    static void reverseArray(int[]A,int N){                
      for(int i=0, k=A.length-1;i<=A.length/2;i++,k--){
          int t=A[i];
          A[i]=A[k];
          A[k]=t;
          
       }
      for(int l=0;l<A.length;l++)
            System.out.print(","+A[l]);
    
}
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        int[] A= new int[N];
        for(int i=0;i<N;i++){
            A[i]=sc.nextInt();
        }
      reverseArray(A,N);
       
    }

}