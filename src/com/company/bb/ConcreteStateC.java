package com.company.bb;

/**
 * Created by hy on 2016/12/12.
 */
public class ConcreteStateC implements State {
    @Override
    public void handlePush(final Context context)
    {
        System.out.print(this.getColor());
    }

    @Override
    public void handlePull(final Context context)
    {
        System.out.print(this.getColor());

        final State state = new ConcreteStateB();
        context.setState(state);
        state.handlePull(context);

    }

    @Override
    public String getColor()
    {
        return "GREEN";
    }
}
