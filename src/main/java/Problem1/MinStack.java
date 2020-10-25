package Problem1;

public class MinStack extends ArrayStack<Integer>
{
    ArrayStack<Integer> smallest;
    public MinStack(int size)
    {
        super(size);
        smallest = new ArrayStack(size);
    }

    @Override
    public boolean push(Integer val)
    {
        if(smallest.size() == 0 ||val <= smallest.peek())
        {
            smallest.push (val);
        }
        return super.push(val);
    }


    @Override
    public Integer pop()
    { //if you pop the smallest number in the list, it will not change
        int val = super.pop();
        if (smallest.peek() == val)
        {
            smallest.pop();
        }
        return val;//use arrayStack's pop
    }

    public Integer getMin()
    {
        return smallest.peek();

    }
}

