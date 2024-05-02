package de.nulldrei.may.first;

public class DynamicStringArray {

    private String[] baseArray;

    public DynamicStringArray() {
        this.baseArray = new String[10];
    }

    public DynamicStringArray(int size) {this.baseArray = new String[size];}

    public void add(String toAdd) {
        int prevArrayLength = baseArray.length;
        if(getNotNullElements()>=prevArrayLength) {
            String[] adjustedArray = new String[getNotNullElements()*2];
            int index = 0;
            for(String s : baseArray) {
                adjustedArray[index] = baseArray[index];
                index++;
            }
            baseArray = adjustedArray;
        }
        baseArray[getNotNullElements()] = toAdd;
    }

    public int getLength() {
        return baseArray.length;
    }

    public int getNotNullElements() {
        int notNull = 0;
        for (int i=0; i<baseArray.length; i++) {
            if(baseArray[i] != null) {
                notNull++;
            }
        }
        return notNull;
    }

    public String get(int index) {
        return baseArray[index];
    }

    public void removeAt(int index) throws IndexOutOfBoundsException {
        if(index > baseArray.length) {
            throw new IndexOutOfBoundsException();
        } else {
            String[] adjustedArray = baseArray.clone();
            adjustedArray[index] = null;
            for(int i = index; i<adjustedArray.length-1; i++) {
                adjustedArray[i] = baseArray[i+1];
            }
            /*
            IDE suggestion:
            if (adjustedArray.length - 1 - index >= 0)
                System.arraycopy(baseArray, index + 1, adjustedArray, index, adjustedArray.length - 1 - index);
            */
            baseArray = adjustedArray;
        }
    }

    public boolean contains(String toSearch) {
        for(String s : baseArray) {
            if(s != null) {
                if (s.equals(toSearch)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void printAll() {
        for(String s : baseArray) {
            System.out.println(s);
        }
    }
}
