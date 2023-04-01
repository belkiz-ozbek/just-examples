package stackgerceklestirmesi;

/**
 *
 * @author belkizozbek
 */
public class StackGerceklestirmesi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Stack stack = new Stack();
        
        stack.pop();
        stack.push("0");
        stack.push("1");
        stack.pop();
        stack.push("2");
        stack.push("3");
        stack.push("4");
        stack.push("5");
        stack.push("6");
        System.out.println(stack.bosmu);
        System.out.println(stack.doldumu);
        System.out.println(stack.size());
        stack.showElements();
        System.out.println("*******");
        stack.clear();
        stack.showElements();
    }

}
