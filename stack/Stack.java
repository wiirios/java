import java.util.Stack;

class HelloWorld {
    public static void main(String[] args) {
        //int[] vetor;
        //int pos = -1;
        
        //vetor = new int[10];
        
        Stack stack = new Stack<>();
        
        System.out.println(stack.empty());
        stack.push("Orange");
        stack.push("Banana");
        stack.push("Grapes");
        System.out.println(stack.empty());
        System.out.println(stack);
        
        while (!stack.empty()) {
            stack.pop();
            System.out.println(stack);
        }
    }
}