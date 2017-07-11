package com.cdk.myp2;

import com.cdk.myp.Iabcd;

/**
 * Created by vijayn on 7/6/2017.
 */
public class InheritIabcd implements Iabcd{

    @Override
    public void met1() {
        System.out.println("met1");
    }

    @Override
    public int met2() {
        return 0;
    }


}
