import java.util.HashMap;
import java.util.Map;

class LRUCache {
    class ListNode {
        int key, value;
        ListNode prev, next;
        ListNode() {
            key = 0;
            value = 0;
            prev = null;
            next = null;
        }
        ListNode(int key, int value) {
            this.key = key;
            this.value = value;
            prev = null;
            next = null;
        }
    }
    int capacity;
    ListNode head = new ListNode();
    ListNode tail = new ListNode();
    Map < Integer, ListNode > map = new HashMap();
    public LRUCache(int capacity) {

        this.capacity = capacity;
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        if (!(map.containsKey(key))) {
            return -1;
        } else {
            ListNode node = map.get(key);
            delete(node);
            insert(node);
            return node.value;
        }
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            delete(map.get(key));
        }
        if (map.size() == capacity) {
            delete(tail.prev);
        }
        insert(new ListNode(key, value));
    }
    public void insert(ListNode node) {
        map.put(node.key, node);
        node.next = head.next;
        head.next.prev = node;
        node.prev = head;
        head.next = node;

    }
    public void delete(ListNode node) {
        map.remove(node.key);
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */