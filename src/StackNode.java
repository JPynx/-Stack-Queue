//Stack
//Author: Ahmed Jabeldo
//Date: 11/17/23
//Collaborators: Luke O'Drobinak, Juan Pablo Sanchez-Espino

public class StackNode<T> {
    //variables
    private T data; //creating instance data and a child node
    private StackNode<T> child;

    //constructors
    public StackNode() { //empty constructor

    }

    public StackNode(T data) { //constructor with data
        this.data = data;
    }

    public StackNode(StackNode<T> child, T data) { //constructor with child node and data
        this.child = child;
        this.data = data;
    }

    //Methods and accessors
    public T getData() { //data accessor method
        return this.data;
    }

    public void setData(T data) { //mutator for the data
        this.data = data;
    }

    public StackNode<T> getChild () { //child accessor method
        return this.child;
    }

    public void setChild (StackNode<T> child) { //child mutator method
        this.child = child;
    }

    //other methods
    public String toString () {
        String datasout = " " + data;
        String childsout = " " + child;
        return "Data: " + datasout + " Child: " + childsout;
    }
}
