import java.util.Scanner;

public class Test {
    
    static void main(String[] args){

        
        Scanner sc=new Scanner(System.in);
        System.out.println("Is Strawberry a Fruit??");
        System.out.println("Enter answer: ");

        String s=sc.next();

        if(s.equals("true")){
            System.out.println("Yes,It, is a correct Answer...");
        }
        else{
            System.out.println("No,It is Wrong answer.....");
        }
        sc.close();
    }
}
