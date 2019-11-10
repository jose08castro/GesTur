package com.example.gestur.logic.forms;

import com.example.gestur.logic.chapters.Chapter;

import java.util.ArrayList;

public interface IForm<T> {
    void update();
    T getChapters();
}
