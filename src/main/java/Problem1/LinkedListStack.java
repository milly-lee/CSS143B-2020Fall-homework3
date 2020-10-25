package Problem1;

import java.util.LinkedList;

public class LinkedListStack<T> implements Stack<T>
{
    private LinkedList<T> data;

    public LinkedListStack()
    {
        data = new LinkedList();
    }

    @Override
    public boolean push(T val)
    {
        data.push(val);
        return true;
    }

    @Override
    public T pop()
    {
        T val = data.pop();
        return val;
    }

    @Override
    public T peek()
    {
        T val = data.peek();
        return val;
    }

    @Override
    public int size() {
        return data.size();
    }
}
