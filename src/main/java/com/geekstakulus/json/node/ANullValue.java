/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.geekstakulus.json.node;

import java.util.*;
import com.geekstakulus.json.analysis.*;

public final class ANullValue extends PValue
{


    public ANullValue (
    )
    {
    }

    public Object clone()
    {
        return new ANullValue (
        );
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANullValue(this);
    }


    public String toString()
    {
        return ""
        ;
    }

    void removeChild(Node child)
    {
    }

    void replaceChild(Node oldChild, Node newChild)
    {
    }

}
