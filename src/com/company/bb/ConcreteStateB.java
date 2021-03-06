package com.company.bb;

/**
 * Created by hy on 2016/12/12.
 */
public class ConcreteStateB implements State{
    @Override
    public void handlePush(final Context context)
    {
        System.out.print(this.getColor());

        final State state = new ConcreteStateC();
        context.setState(state);
        state.handlePush(context);

    }

    @Override
    public void handlePull(final Context context)
    {
        System.out.print(this.getColor());

        final State state = new ConcreteStateA();
        context.setState(state);
        state.handlePull(context);
    }

    @Override
    public String getColor()
    {
        return "YELLOW";
    }
}
