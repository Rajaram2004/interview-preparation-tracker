public class doubly {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        node head = new node(1);
        node tail = head;
        for (int i = 1; i < arr.length; i++) {
            node newNode = new node(arr[i]);
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }

        System.out.println("head-tail traversal");
        printdata(head);
        System.out.println("\ntail-head traversal");
        node curr = tail;
        while (curr != null) {
            System.out.print(curr.val);
            curr = curr.prev;
        }
        int k = 7;
        head = deleteKelement(head, k);
        printdata(head);

    }

    public static void printdata(node head) {
        node temp = head;
        System.out.println();
        while (temp != null) {
            System.out.print(temp.val);
            temp = temp.next;
        }
    }

    public static node deleteKelement(node head, int k) {
        node curr = head;
        int count = 0;
        while (curr != null) {
            count++;
            if (count == k) {
                break;
            }
            curr = curr.next;
        }
        node back = curr.prev;
        node front = curr.next;
        if (back == null && front == null) {
            return null;
        } else if (back == null) {
            node temp = head;
            head = head.next;
            head.prev = null;
            temp.next = null;
        } else if (front == null) {
            node temp = curr.prev;
            temp.next = null;
            curr.prev = null;
        } else {
            back.next = front;
            front.prev = back;
        }
        return head;
    }
}

class node {
    int val;
    node prev;
    node next;

    node(int data) {
        this.val = data;
        this.prev = null;
        this.next = null;
    }
}
