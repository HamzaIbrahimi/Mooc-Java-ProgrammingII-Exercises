public class List<Type> {
    private Type[] values;
    private int firstFreeIndex;

    @SuppressWarnings("unchecked")
    public List() {
        this.values = (Type[]) new Object[10];
        this.firstFreeIndex = 0;
    }

    public void add(Type elem) {
        if (this.values.length == firstFreeIndex) {
            grow();
        }
        this.values[firstFreeIndex] = elem;
        this.firstFreeIndex++;

    }

    public int length() {
        return this.firstFreeIndex;
    }

    private void grow() {
        int newSize = this.values.length + this.values.length / 2;
        @SuppressWarnings("unchecked")
        Type[] newValues = (Type[]) new Object[newSize];
        for (int i = 0; i < this.values.length; i++) {
            newValues[i] = this.values[i];
        }
        this.values = newValues;
    }

    public boolean contains(Type elem) {
        return !(findIndexOf(elem) < 0);
    }

    public void shitToLeft(int fromIndex) {
        for (int i = fromIndex; i < this.firstFreeIndex - 1; i++) {
            values[i] = values[i + 1];
        }
    }

    public int findIndexOf(Type elem) {
        for (int i = 0; i < this.firstFreeIndex; i++) {
            if (this.values[i].equals(elem) || this.values[i] == elem) {
                return i;
            }
        }
        return -1;
    }

    public void remove(Type elem) {
        int index = findIndexOf(elem);
        if (index < 0) {
            return;
        }
        shitToLeft(index);
        firstFreeIndex--;
    }

    public Type value(int index) {
        if (index < 0 || index >= this.firstFreeIndex) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + " outside of [0, " + this.firstFreeIndex + "]");
        }
        return this.values[index];
    }

}