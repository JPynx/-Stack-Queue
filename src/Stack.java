//Stack
//Author: Ahmed Jabeldo
//Date: 11/17/23
//Collaborators: Luke O'Drobinak, Juan Pablo Sanchez-Espino


public class Stack<T> {
    private int size = 0; //creating all my instance data
    private T data;
    private StackNode<T> topNode; //my top node

    public Stack (){ //empty constructor

    }

    //methods
    public void push (T data) { //push method
        topNode = new StackNode<T> (topNode, data);
        size++;
    }

    public T pop () { //pop method
        if (size == 0) {
            return null;
        }else {
            StackNode<T> oldTopNode = topNode;
            topNode = topNode.getChild();
            size--;
            return oldTopNode.getData(); //returning old top value
        }
    }

    public boolean isEmpty () { //isEmpty method
        return size == 0; //returns true if the size is 0
    }

    public int size () { //size method returns size
        return size;
    }

    public T peek () {
        return topNode.getData();
    }
}
