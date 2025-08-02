    package linkedList;

    public class RemoveElements {
        public static void main(String[] args) {

        }
        public ListNode removeElements(ListNode head, int val) {
            ListNode dummy = new ListNode(0); // dummy node before head
            dummy.next = head;
            ListNode current = dummy;

            while (current.next != null) {
                if (current.next.val == val) {
                    current.next = current.next.next; // skip the node
                } else {
                    current = current.next; // move forward
                }
            }

            return dummy.next;
        }
    }
