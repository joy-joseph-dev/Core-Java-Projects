public class Calculator {
    public static void main(String[]args)
    {  
        String operation ="/";
        int x = 2500;
        int y = 2;
        switch(operation){
            case "+":
                System.out.println(x+y);
            break;
        case "-":
                System.out.println(x-y);
            break;
        case "*":
            System.out.println(x*y);
            break;
        case "/":
            System.out.println(x/y);
        break;
        default :
            System.out.println("invalid operator");
        }
    }
}
