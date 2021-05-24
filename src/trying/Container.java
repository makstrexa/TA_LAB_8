package trying;

public interface Container<K, V> {

    V getValue(K key);

    void setValue(K key, V value);

    void removeValue(K key);

}
