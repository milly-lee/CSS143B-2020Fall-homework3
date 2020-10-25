package Problem3;

import Problem1.ArrayStack;
import Problem1.LinkedListStack;
import Problem1.Stack;
import Problem2.ListNode;

import java.io.PrintStream;

public class Problem3
{
    public static void printListInReverse(ListNode list, PrintStream print)
    {
        list = list.next; //test case fail without this
        LinkedListStack reverse = new LinkedListStack();
        while( list != null )
        {
            reverse.push(list.val);
            list = list.next;
        }
        while (reverse.size() != 0)
        {
            print.println(reverse.pop());
        }
    }
}
