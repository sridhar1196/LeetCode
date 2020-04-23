import java.util.HashMap;

public class MiddleOfTheLinkedList {
    public ListNode middleNode(ListNode head) {
        HashMap<Integer, ListNode> mapping = new HashMap<>();
        int length = 0;
        while(head != null){
            length++;
            mapping.put(length, head);
            head = head.next;
        }
        return mapping.get(length/2 + 1);
    }
}