package Problem1;

public class ArrayStack<T> implements Stack<T>
{
    private T[] data;
    private int size;

    private ArrayStack() {
    }

    public ArrayStack(int capacity)
    {
        size = 0;
        data = (T[])(new Object[capacity]);
    }

    @Override
    public boolean push(T val)
    {
        if( data == null || size == data.length)
        {
            return false;
        }
        data[size] = val;
        size++;
        return true;
    }

    @Override
    public T pop()
    {
        if (data.length == 0 || size == 0)
        {
            return null;
        }
        T val = data[size - 1];
        size--;
        return val;
    }

    @Override
    public T peek()
    {
        if (data.length == 0 || size == 0)
        {
            return null;
        }
        T val = data[size - 1];
        return val;
    }

    @Override
    public int size() {
        return size;
    }
}
