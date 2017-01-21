package com.company.test;

import com.company.bb.ConcreteStateA;
import com.company.bb.ConcreteStateB;
import com.company.bb.Context;

/**
 * Created by hy on 2016/12/12.
 */
public class Client {
    public static void main(final String[] args)
    {
        // YTODO Auto-generated method stub
        final Context context = new Context();
        context.setState(new ConcreteStateA());
        System.out.println("PUSH:");
        context.push();
        System.out.println("\nPULL:");
        context.pull();
    }

}
