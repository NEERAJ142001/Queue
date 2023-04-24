package love_babbar;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Queue_reverse {

    public Queue<Integer> reverse(Queue<Integer> queue)
    {
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty())
        {
            int element=queue.peek();
            queue.remove();
            stack.push(element);
        }
        while (!stack.isEmpty())
        {
            int element=stack.peek();
            stack.pop();
            queue.add(element);
        }
        return queue;
    }

    public static void main(String[] args) {
        Queue<Integer> x=new LinkedList<>();
        x.add(1);
        x.add(5);
        x.add(10);
        x.add(15);
        x.add(20);
        System.out.println("your queue is = "+ x);
        Queue_reverse p=new Queue_reverse();
        Queue<Integer> answer=p.reverse(x);
        System.out.println("your Reverse queue is = "+answer);
    }
}
