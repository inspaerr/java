package prob1and2and3;

import java.io.Serializable;

public class Program <T extends Comparable, V extends Serializable, K extends Animal>{
    private T t;
    private V v;
    private K k;

    public Program(T t, V v, K k){
        this.t = t;
        this.k = k;
        this.v = v;
    }

    public K getK() {
        return k;
    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    @Override
    public String toString() {
        return "Program{" +
                "t=" + t +
                ", v=" + v +
                ", k=" + k +
                '}';
    }
}
