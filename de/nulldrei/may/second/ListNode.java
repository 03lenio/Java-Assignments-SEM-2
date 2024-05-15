package de.nulldrei.may.second;

public class ListNode {

    private Object element;
    private ListNode prev;

    public ListNode(Object element, ListNode prev) {
        this.element = element;
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object element) {
        this.element = element;
    }

    public ListNode getPrev() {
        return prev;
    }

    public void setPrev(ListNode prev) {
        this.prev = prev;
    }

}
