package com.example.statepattern.service.lifeCycle;

/**
 *
 */
public abstract class WorkStatus {
    private Context context;

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public abstract void work();
}