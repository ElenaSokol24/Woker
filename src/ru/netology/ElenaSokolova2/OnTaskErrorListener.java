package ru.netology.ElenaSokolova2;

@FunctionalInterface
public interface OnTaskErrorListener {
    void onError(String result);
}