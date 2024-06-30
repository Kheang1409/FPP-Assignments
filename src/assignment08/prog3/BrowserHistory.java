package assignment08.prog3;

import java.util.Stack;

public class BrowserHistory {
    private String currentUrl;
    private Stack<String> backward;
    private Stack<String> forward;

    public BrowserHistory(String url) {
        this.currentUrl = url;
        this.backward = new Stack<>();
        this.forward = new Stack<>();
    }

    public void visit(String url) {
        backward.push(this.currentUrl);
        this.currentUrl = url;
        System.out.println("Visited: " + this.currentUrl);
    }

    public void back() {
        if(backward.isEmpty()) {
            System.out.println("Cannot go backward!");
            return ;
        }
        if(!this.currentUrl.equals(backward.peek())){
            forward.push(this.currentUrl);
        }
        this.currentUrl = backward.pop();
        System.out.println("Back to: " + this.currentUrl);
    }

    public void forward() {
        if(forward.isEmpty()) {
            System.out.println("Cannot go forward!");
            return ;
        }
        String pop = forward.pop();
        this.currentUrl = pop;
        System.out.println("Forward to: " + this.currentUrl);
    }
}
