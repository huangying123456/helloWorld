package com.company.bb;

/**
 * Created by hy on 2016/12/12.
 */
public interface State {
    public  void handlePush(Context c);

    public  void handlePull(Context c);

    public  String getColor();
}
