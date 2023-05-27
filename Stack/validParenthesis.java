import java.util.*;
public class validParenthesis {
    public static boolean ValidString(String str)
    {
        char arr[]=str.toCharArray();
        Stack<Character> stack1=new Stack<>();
        for(char ele:arr)
        {
            if(ele=='(' || ele=='[' || ele=='{')
            {
                stack1.push(ele);
                continue;
            }
            else if(stack1.empty())
            {
                return false;
            }
            char top=stack1.pop();
            if(top=='('&&ele!=')')
            {
                return false;
            }
            else if(top=='['&&ele!=']')
            {
                return false;
            }
            else if(top=='{'&&ele!='}')
            {
                return false;
            }
        }

        return (stack1.empty()==true);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string of parenthesis");
        String str=sc.nextLine();
        System.out.println("Is the string valid? "+ValidString(str));
        sc.close();
    }
}
