package adapter;

import java.util.ArrayList;

public class ArrayListAdapter implements List {

    private ArrayList<Object> data;

    public ArrayListAdapter() {
        data = new ArrayList<>();
    }

    @Override
    public int count() {
        return data.size();
    }

    @Override
    public Object get(int index) {
        return data.get(index);
    }

    @Override
    public Object first() {
        if (data.isEmpty()) {
            return null;
        }
        return data.get(0);
    }

    @Override
    public Object last() {
        if (data.isEmpty()) {
            return null;
        }
        return data.get(data.size() - 1);
    }

    @Override
    public boolean include(Object obj) {
        return data.contains(obj);
    }

    @Override
    public void append(Object obj) {
        data.add(obj);
    }

    @Override
    public void prepend(Object obj) {
        data.add(0, obj);
    }

    @Override
    public void delete(Object obj) {
        data.remove(obj);
    }

    @Override
    public void deleteLast() {
        if (!data.isEmpty()) {
            data.remove(data.size() - 1);
        }
    }

    @Override
    public void deleteFirst() {
        if (!data.isEmpty()) {
            data.remove(0);
        }
    }

    @Override
    public void deleteAll() {
        data.clear();
    }
}
