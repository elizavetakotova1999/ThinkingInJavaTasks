package com.examples.util;
import java.util.concurrent.*;

public class TaskItem<R,C extends Callable<R>> {
    public final Future<R> future;
    public final C task;

    public TaskItem(Future<R> future, C task) {
        this.future = future;
        this.task = task;
    }
}