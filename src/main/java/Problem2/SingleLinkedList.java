package Problem2;

// all functions assume using dummy node
public class SingleLinkedList {
    // do not add member variables
    private ListNode head;
    private int size;

    public SingleLinkedList() {
        head = new ListNode();  // dummy node
    }

    // copy constructor
    public SingleLinkedList(SingleLinkedList list) {
        ListNode node = list.head;
        if (node != null) {
            head = new ListNode(node.val);
            node = node.next;
        }
        while (node != null) {
            add(node.val);
            node = node.next;
        }
    }

    public int removeAll(int valueToRemove) {
        int nodesRemoved = 0;

        ListNode node = head.next;
        ListNode prev = head;
        while(node != null) {
            if (node.val == valueToRemove) {
                prev.next = node.next; // remove this node
                nodesRemoved++;
                size--;
            } else {
                prev = node;
            }
            node = node.next;
        }

        return nodesRemoved;
    }

    // reverse the linked list nodes iteratively (no recursion)
    public void reverse() {
        head = head.next;
        ListNode node = head;
        ListNode prev = null;
        while (node != null) {
            ListNode temp = node.next;
            node.next = prev; // point to prev node
            prev = node;
            node = temp;
        }
        head = new ListNode();
        head.next = prev;
    }

    // do not change any function below

    public SingleLinkedList(int[] data) {
        this();
        if (data == null) {
            return;
        }
        ListNode ptr = head;
        for (int datum : data) {
            ptr.next = new ListNode(datum);
            ptr = ptr.next;
            size++;
        }
    }

    // Appends the specified element to the end of this list
    public void add(int val) {
        size++;
        ListNode ptr = head;
        while (ptr.next != null) {
            ptr = ptr.next;
        }
        ptr.next = new ListNode(val);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        ListNode ptr = head.next;
        while (ptr != null) {
            builder.append(ptr.val).append(ptr.next == null ? " -> end " : " -> ");
            ptr = ptr.next;
        }
        return builder.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof SingleLinkedList)) {
            return false;
        }

        SingleLinkedList otherList = (SingleLinkedList) obj;

        if (this.size != otherList.size) {
            return false;
        }
        ListNode n1 = head.next;
        ListNode n2 = otherList.head.next;
        while (n1 != null && n2 != null) {
            if (n1.val != n2.val) {
                return false;
            }
            n1 = n1.next;
            n2 = n2.next;
        }
        return (n1 == null && n2 == null);
    }

    public int getSize() {
        return size;
    }
}
