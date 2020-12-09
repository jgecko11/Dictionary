import java.util.ArrayList;
import java.util.Collection;

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
        valueArrL.remove(storageValue);
        size--;
        return storageValue;

    }

    public boolean contains(E key){
        int i = keyArrL.indexOf(key);
        //System.out.println(i);
        //System.out.println(keyArrL.get(i));
        return i != -1;
    }
    public int size(){
        return this.size;
    }

    public Collection<E> keys(){
        Collection<E> keys = new ArrayList<E>();
        for(int i = 0; i<size; i++){
            keys.add(keyArrL.get(i));
        }
        return keys;
    }

    public Collection<T> values(){
        Collection<T> values = new ArrayList<T>();
        for(int i = 0; i<size; i++){
            values.add(valueArrL.get(i));
        }
        return values;
    }

}
