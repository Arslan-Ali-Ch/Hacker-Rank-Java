import java.util.ArrayList;
import java.util.Scanner;

public class Queryproblem {

    public static void main(String[] args) {
        
        
        ArrayList<Integer> arr2=new ArrayList<>(); 


        Scanner in = new Scanner(System.in);
        
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
    ArrayList<Integer> arr=new ArrayList<>(); 
    int mul=1;
        int s=0;
            
            for(int j=1;j<=n;j++){
                if(j==1){
                    
                s=s+(a+(b*mul));
                }
                else{
                    s=s+(b*mul);
                    
                }
                mul+=mul;
                arr.add(s);
                

           }
         
        for (int j = 0; j < arr.size(); j++) {
            System.out.print(arr.get(j)+" ");
        
        }
        System.out.print("\n");
          
        }
               
        
        in.close();
    }
}
