package com.company.bb;


/**
 * Created by hy on 2016/12/12.
 */
public class Context {
    private State state = null;

    public State getState()
    {
        return state;
    }

    public void setState(final State state)
    {
        this.state = state;
    }

    public void push()
    {
        state.handlePush(this);
    }

    public void pull()
    {
        state.handlePull(this);
    }
}
