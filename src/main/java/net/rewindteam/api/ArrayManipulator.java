package net.rewindteam.api;

import net.rewindteam.historyrewind.HistoryRewind;
import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Array;
import java.util.function.Supplier;

public class ArrayManipulator<T> {

    @SuppressWarnings("unchecked")
    public T[] addElement(T @NotNull [] array, T element) {
        T[] newArray = (T[]) Array.newInstance(element.getClass(), array.length + 1);
        System.arraycopy(array, 0, newArray, 0, array.length);
        newArray[array.length] = element;
        return array;
    }
}