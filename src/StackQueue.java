public class StackQueue<E> {
    //instance data
    private int size;
    private Stack stack;
    private Stack stack2;

    //constucotrs

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
}
