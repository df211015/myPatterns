package com.example.statepattern.service.matterCycle;

/**
 * 物质状态
 */
public abstract class MatterStatus {

    private Context context;

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public abstract Boolean checkNext();

    public abstract void statusProcess();
}
