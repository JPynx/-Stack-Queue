public class StackQueue <E> {
    //instance data
    private int size;
    private Stack stack;
    private Stack stack2;

    //constructors


    public StackQueue(){
        size = 0;
        stack = new Stack();
        stack2 = new Stack();
    }

    public void enqueue(E stackData){
        stack.push(stackData);
    }

    public void dequeue (){
        while (!stack.isEmpty()){
            stack2.push(stack);
        }

        if (stack2.isEmpty()){
            System.out.println("The queue is empty");
        }
    }

    public boolean isEmpty () {
        if (stack.isEmpty() == true && stack2.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public int size () {
        return size;
    }

    public E peek () {
        while (stack2.isEmpty() == true) {
            System.out.println("The queue is empty");
        }

        while (stack.isEmpty() == false) {
            stack2.push(stack.pop());
        }

        E data = (E) stack2.peek();

        for (int i = 0; i < stack2.size(); i++) {
            stack.push(stack2.pop());
        }

        return data;
    }
}
