import java.util.Scanner;

/**
 * INout
 */
public class INout {

    void getdouble(){
        String s="";
        int a=1;int b=10;
        for(int i=0;i<b;i++){
            a+=a;
            s+=a;
        }
        System.out.println(s);

       }
    public static void main(String args[]) {

        try (Scanner scan = new Scanner(System.in)) {
            int i=scan.nextInt();
        double d=scan.nextDouble();
        scan.nextLine();
        String s=scan.nextLine();

            System.out.println("Int: "+i);
            System.out.println("DOuble: "+d);
            
            System.out.printf("i am string  ="+s);
        
        }
        catch(Exception e){
            System.out.printf("occured ="+e);
            
        }
        INout ab=new INout();
        ab.getdouble();
        String s="hello world";
        String b=s.concat("!");
        int num=5;
        b=s.concat(String.valueOf(num));
        System.out.print(b);

    }
}



