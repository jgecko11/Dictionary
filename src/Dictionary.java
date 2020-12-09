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
        size++;
    }

    public T get(E key){
        return valueArrL.get(keyArrL.indexOf(key));
    }

    public T remove(E key){
        T storageValue = valueArrL.get(keyArrL.indexOf(key));
        keyArrL.remove(key);
        valueArrL.remove(keyArrL.indexOf(key));
        size--;
        return storageValue;

    }

    public boolean contains(E key){
        if(valueArrL.get(keyArrL.indexOf(key)) != null){
            return true;
        }
        else return false;
    }
    public int size(){
        return this.size;
    }

}
