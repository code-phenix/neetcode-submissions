class DynamicArray {

    int arr[];
    int lastIndex=0;
    public DynamicArray(int capacity) {
        arr=new int[capacity];
    }

    public int get(int i) {
        return arr[i];
    }

    public void set(int i, int n) {
        arr[i]=n;
    }

    public void pushback(int n) {
        if(lastIndex==arr.length){
            resize();
        }
       arr[lastIndex]=n;
        lastIndex++;
    }

    public int popback() {
        if(lastIndex>0){
            lastIndex--;
        }
        return arr[lastIndex];
    }

    private void resize() {
        int temp[]=new int[(arr.length*2)];
        for(int iterI=0;iterI<arr.length;iterI++){
            temp[iterI]=arr[iterI];
        }
        this.arr=temp;

    }

    public int getSize() {
        return lastIndex;
    }

    public int getCapacity() {
        return this.arr.length;
    }
}
