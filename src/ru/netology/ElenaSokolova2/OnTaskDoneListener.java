package ru.netology.ElenaSokolova2;

@FunctionalInterface
public interface OnTaskDoneListener {
    void onDone(String result);
}
