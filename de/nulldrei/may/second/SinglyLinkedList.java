package de.nulldrei.may.second;

public class SinglyLinkedList {

    private ListNode start;

    public SinglyLinkedList() {

    }

    public void add(Object toAdd) {
        if(start != null) {
            getLast().setPrev(new ListNode(toAdd, null));
        } else {
            start = new ListNode(toAdd, null);
        }
    }

    public int getSize() {
        int count = 0;
        if(start != null) {
            ListNode current = start;
            count++;
            while(true) {
                if(current.getPrev()!=null) {
                    count++;
                    current = current.getPrev();
                } else {
                    break;
                }
            }
        }
        return count;
    }

    public ListNode findNode(Object toFind) {
        if(start != null) {
            ListNode current = start;
            while(true) {
                if(current.getPrev()!=null) {
                    if(current.getElement() == toFind) {
                        return current;
                    }
                    current = current.getPrev();
                } else {
                    break;
                }
            }
         }
        return null;
    }

    public ListNode findPredecessorNode(Object toFind) {
        if(start != null) {
            ListNode current = start;
            while(true) {
                if(current.getPrev()!=null) {
                    if(current.getElement() == toFind) {
                        return current.getPrev();
                    }
                    current = current.getPrev();
                } else {
                    break;
                }
            }
        }
        return null;
    }

    public boolean remove(Object toRemove) {
        if(start != null) {
            if (start.getElement() == toRemove) {
                return true;
            }
            ListNode current = start;
            ListNode previous = null;
            while(true) {
                if(current.getPrev()!=null) {
                    if(current.getElement() == toRemove) {
                        assert previous != null;
                        previous.setPrev(null);
                        return true;
                    }
                    previous = current;
                    current = current.getPrev();
                } else {
                    break;
                }
            }
        }
        return false;

    }

    public void printAllElements() {
        ListNode current = start;
        while(true) {
            if(current.getPrev()!=null) {
                System.out.println(current.getElement());
                current = current.getPrev();
            } else {
                break;
            }
        }
        System.out.println(current.getElement());
    }

    public Object get(int index) {
        Object toReturn = null;
        if(start != null) {
            ListNode current = start;
            for (int i = -1; i < index; i++) {
                toReturn = current.getElement();
                current = current.getPrev();
            }
        }
        return toReturn;
    }

    public void removeAt(int index) {
        if(start != null) {
            findNode(get(index-1)).setPrev(null);
        }
    }

    public boolean contains(Object object) {
        if(start!=null) {
            ListNode current = start;
            while(true) {
                if(current.getPrev()!=null) {
                    if(current.getElement() == object) {
                        return true;
                    }
                    current = current.getPrev();
                } else {
                    break;
                }
            }
            if(current.getElement() == object) {
                return true;
            }
        }
        return false;
    }

    public ListNode getFirst() {
        return start;
    }

    public ListNode getLast() {
        ListNode current = start;
        while(true) {
            if(current.getPrev()!=null) {
                   current = current.getPrev();
            } else {
                break;
            }
        }
        return current;
    }

    public void clear() {
        if(start!=null) {
          start = null;
        }

    }

}
