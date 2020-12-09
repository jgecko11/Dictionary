import java.util.ArrayList;

public class Dictionary<T,E> {

    private ArrayList<E> keyArrL = new ArrayList<E>();
    private ArrayList<T> valueArrL = new ArrayList<T>();
    private int size = 0;

    public Dictionary(){
    }

    public void put(E key, T value){
        keyArrL.add(key);
        valueArrL.add(value);
    }

    public T get(E key){
        return valueArrL.get(keyArrL.indexOf(key));
    }


}
