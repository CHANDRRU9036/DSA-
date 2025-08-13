package stakesandqueues.questions;
import java.util.Stack;

public class QueueUsingStack {
  private Stack<Integer> first;
  private Stack<Integer> second;

  public QueueUsingStack() {
    first = new Stack<>();
    second = new Stack<>();
  }

  public void add(int item) {
    first.push(item);
  }

  public int remove() throws Exception {
    if (isEmpty()) {
      throw new Exception("Queue is empty");
    }

    while (!first.isEmpty()) {
      second.push(first.pop());
    }
    int removed = second.pop();
    while (!second.isEmpty()) {
      first.push(second.pop());
    }
    return removed;
  }

  public int peek() throws Exception {
    if (isEmpty()) {
      throw new Exception("Queue is empty");
    }

    while (!first.isEmpty()) {
      second.push(first.pop());
    }

    int peeked = second.peek();

    while (!second.isEmpty()) {
      first.push(second.pop());
    }
    return peeked;
  }

  public boolean isEmpty() {
    return first.isEmpty();
  }


  public static void main(String[] args) {
    try {
      QueueUsingStack queue = new QueueUsingStack();
      queue.add(10);
      queue.add(20);
      queue.add(30);

      System.out.println("Removed: " + queue.remove()); 
      System.out.println("Peek: " + queue.peek());      
      System.out.println("Removed: " + queue.remove()); 
      System.out.println("Is Empty? " + queue.isEmpty()); 
      System.out.println("Removed: " + queue.remove()); 
      System.out.println("Is Empty? " + queue.isEmpty()); 

    } catch (Exception e) {
 
        System.out.println("Error: " + e.getMessage());
}
}
}

