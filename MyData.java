public class MyData<T> {
    private T data;

    public MyData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
    
    public void setData(T data) {
        
        MyData<String> myDataString = new MyData<String>("eko");
        MyData<Integer> myDataInteger = new MyData<>(100);
        var myDataBoolean = new MyData<Boolean>(true);

        System.out.println(myDataString.getData());
        System.out.println(myDataInteger.getData());
        System.out.println(myDataBoolean.getData());
    
    }


}
