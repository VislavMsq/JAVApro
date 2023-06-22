import java.util.Stack;

public class LOOP {
    public static void main(String[] args) {
        /**
         * while()
         * if()
         * for-each()
         * fori()
         */
        Stack<String> stack = new Stack<>();
        stack.push("E");
        stack.push("Q");
        stack.push("W");
        stack.push("R");
        stack.push("S");

        while(!stack.empty()){
            System.out.println(stack.pop());
        }
        for (String str : stack){
            System.out.println(str);
        }

        Stack<Integer> stack1 = new Stack<>();

        stack1.push(2);
        stack1.push(22);
        stack1.push(32);
        stack1.push(12);
        stack1.push(50);

        System.out.println(stack1.get(2));

        Object[] objects = stack1.toArray();
        for (int i = 0; i < objects.length; i++) {

        }

    }
}
