/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.geekstakulus.json.analysis;

import java.util.*;
import com.geekstakulus.json.node.*;

public class AnalysisAdapter implements Analysis
{
    private Hashtable in;
    private Hashtable out;

    public Object getIn(Node node)
    {
        if(in == null)
        {
            return null;
        }

        return in.get(node);
    }

    public void setIn(Node node, Object in)
    {
        if(this.in == null)
        {
            this.in = new Hashtable(1);
        }

        if(in != null)
        {
            this.in.put(node, in);
        }
        else
        {
            this.in.remove(node);
        }
    }
    public Object getOut(Node node)
    {
        if(out == null)
        {
            return null;
        }

        return out.get(node);
    }

    public void setOut(Node node, Object out)
    {
        if(this.out == null)
        {
            this.out = new Hashtable(1);
        }

        if(out != null)
        {
            this.out.put(node, out);
        }
        else
        {
            this.out.remove(node);
        }
    }
    public void caseStart(Start node)
    {
        defaultCase(node);
    }

    public void caseAJson(AJson node)
    {
        defaultCase(node);
    }
    public void caseAObjectValue(AObjectValue node)
    {
        defaultCase(node);
    }
    public void caseAArrayValue(AArrayValue node)
    {
        defaultCase(node);
    }
    public void caseANumberValue(ANumberValue node)
    {
        defaultCase(node);
    }
    public void caseAStringValue(AStringValue node)
    {
        defaultCase(node);
    }
    public void caseATrueValue(ATrueValue node)
    {
        defaultCase(node);
    }
    public void caseAFalseValue(AFalseValue node)
    {
        defaultCase(node);
    }
    public void caseANullValue(ANullValue node)
    {
        defaultCase(node);
    }
    public void caseAPairMember(APairMember node)
    {
        defaultCase(node);
    }
    public void caseAEmptyMember(AEmptyMember node)
    {
        defaultCase(node);
    }
    public void caseAValueElement(AValueElement node)
    {
        defaultCase(node);
    }
    public void caseAEmptyElement(AEmptyElement node)
    {
        defaultCase(node);
    }

    public void caseTNumber(TNumber node)
    {
        defaultCase(node);
    }
    public void caseTString(TString node)
    {
        defaultCase(node);
    }
    public void caseTComma(TComma node)
    {
        defaultCase(node);
    }
    public void caseTLCurlyBracket(TLCurlyBracket node)
    {
        defaultCase(node);
    }
    public void caseTRCurlyBracket(TRCurlyBracket node)
    {
        defaultCase(node);
    }
    public void caseTLBracket(TLBracket node)
    {
        defaultCase(node);
    }
    public void caseTRBracket(TRBracket node)
    {
        defaultCase(node);
    }
    public void caseTTrue(TTrue node)
    {
        defaultCase(node);
    }
    public void caseTFalse(TFalse node)
    {
        defaultCase(node);
    }
    public void caseTNull(TNull node)
    {
        defaultCase(node);
    }
    public void caseTColon(TColon node)
    {
        defaultCase(node);
    }
    public void caseTWhiteSpace(TWhiteSpace node)
    {
        defaultCase(node);
    }

    public void caseEOF(EOF node)
    {
        defaultCase(node);
    }

    public void defaultCase(Node node)
    {
    }
}
