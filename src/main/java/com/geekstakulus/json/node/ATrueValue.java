/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.geekstakulus.json.node;

import java.util.*;
import com.geekstakulus.json.analysis.*;

public final class ATrueValue extends PValue
{


    public ATrueValue (
    )
    {
    }

    public Object clone()
    {
        return new ATrueValue (
        );
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATrueValue(this);
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
