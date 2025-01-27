public class linkList {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        node head = new node(arr[0], null);

        node mover = head;

        for (int i = 1; i < arr.length; i++) {
            node temp = new node(arr[i], null);
            mover.next = temp;
            mover = temp;
        }
        System.out.println("\noriginal linked List ");
        printElement(head);

        // System.out.println("\nDeleting head ");
        // head=deleteElement(head,1);
        System.out.println("\nAdding ");
        head = addElementInIndex(head, 10, 6);
        printElement(head);

    }

    public static node deleteElement(node head, int k) {
        if (head == null)
            return head;
        if (k == 1)
            return head.next;
        node temp = head;
        node prev = null;
        int count = 0;
        while (temp != null) {
            count++;
            if (count == k) {
                prev.next = prev.next.next;
                temp.next = null;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    public static void printElement(node head) {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static node addElementInIndex(node head, int value, int index) {
        if (head == null) {
            head.data = value;
            return head;
        }
        if (index == 1) {
            node newnode = new node(value, head);
            head = newnode;
            return head;
        }
        node prev = null;
        node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            if (count == index) {
                node newnode = new node(value, null);
                prev.next = newnode;
                newnode.next = temp;
                return head;
            }
            prev = temp;
            temp = temp.next;
        }

        return head;
    }
}

class node {
    int data;
    node next;

    node(int data1, node nex1) {
        this.data = data1;
        this.next = nex1;
    }
}