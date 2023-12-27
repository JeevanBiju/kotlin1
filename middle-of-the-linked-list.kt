class Solution {
    // use two pointers, fast one that is 2x fast as slow, which will reach end when slow reaches mid
    fun middleNode(head: ListNode?): ListNode? {
        if(head == null) return null
        var slow = head; var fast = head
        while(fast != null && fast?.next != null){
            slow = slow?.next
            fast = fast?.next?.next
        }
        return slow
    }
}
