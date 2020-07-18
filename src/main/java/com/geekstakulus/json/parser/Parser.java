/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.geekstakulus.json.parser;

import com.geekstakulus.json.lexer.*;
import com.geekstakulus.json.node.*;
import com.geekstakulus.json.analysis.*;
import java.util.*;

import java.io.*;

public class Parser
{
    public final Analysis ignoredTokens = new AnalysisAdapter();

    private final Lexer lexer;
    private final ListIterator stack = new LinkedList().listIterator();
    private int last_shift;
    private int last_pos;
    private int last_line;
    private Token last_token;
    private final TokenIndex converter = new TokenIndex();
    private final int[] action = new int[2];

    private final static int SHIFT = 0;
    private final static int REDUCE = 1;
    private final static int ACCEPT = 2;
    private final static int ERROR = 3;

    public Parser(Lexer lexer)
    {
        this.lexer = lexer;
    }

    private int goTo(int index)
    {
        int state = state();
        int low = 1;
        int high = gotoTable[index].length - 1;
        int value = gotoTable[index][0][1];

        while(low <= high)
        {
            int middle = (low + high) / 2;

            if(state < gotoTable[index][middle][0])
            {
                high = middle - 1;
            }
            else if(state > gotoTable[index][middle][0])
            {
                low = middle + 1;
            }
            else
            {
                value = gotoTable[index][middle][1];
                break;
            }
        }

        return value;
    }

    private void push(int numstate, ArrayList listNode) throws ParserException, LexerException, IOException
    {
        if(!stack.hasNext())
        {
            stack.add(new State(numstate, listNode));
            return;
        }

        State s = (State) stack.next();
        s.state = numstate;
        s.nodes = listNode;
    }

    private int state()
    {
        State s = (State) stack.previous();
        stack.next();
        return s.state;
    }

    private ArrayList pop()
    {
        return (ArrayList) ((State) stack.previous()).nodes;
    }

    private int index(Switchable token)
    {
        converter.index = -1;
        token.apply(converter);
        return converter.index;
    }

    public Start parse() throws ParserException, LexerException, IOException
    {
        push(0, null);

        List ign = null;
        while(true)
        {
            while(index(lexer.peek()) == -1)
            {
                if(ign == null)
                {
                    ign = new TypedLinkedList(NodeCast.instance);
                }

                ign.add(lexer.next());
            }

            if(ign != null)
            {
                ignoredTokens.setIn(lexer.peek(), ign);
                ign = null;
            }

            last_pos = lexer.peek().getPos();
            last_line = lexer.peek().getLine();
            last_token = lexer.peek();

            int index = index(lexer.peek());
            action[0] = actionTable[state()][0][1];
            action[1] = actionTable[state()][0][2];

            int low = 1;
            int high = actionTable[state()].length - 1;

            while(low <= high)
            {
                int middle = (low + high) / 2;

                if(index < actionTable[state()][middle][0])
                {
                    high = middle - 1;
                }
                else if(index > actionTable[state()][middle][0])
                {
                    low = middle + 1;
                }
                else
                {
                    action[0] = actionTable[state()][middle][1];
                    action[1] = actionTable[state()][middle][2];
                    break;
                }
            }

            switch(action[0])
            {
              case SHIFT:
              {
                ArrayList nodeList = new ArrayList(1);
                nodeList.add(lexer.next());
                push(action[1], nodeList);
                last_shift = action[1];
                break;
              }
              case REDUCE:
              {
                switch(action[1])
                {
                  case 0:
                  {
                    ArrayList nodeList = new0();
                    push(goTo(0), nodeList);
                    break;
                  }
                  case 1:
                  {
                    ArrayList nodeList = new1();
                    push(goTo(1), nodeList);
                    break;
                  }
                  case 2:
                  {
                    ArrayList nodeList = new2();
                    push(goTo(1), nodeList);
                    break;
                  }
                  case 3:
                  {
                    ArrayList nodeList = new3();
                    push(goTo(1), nodeList);
                    break;
                  }
                  case 4:
                  {
                    ArrayList nodeList = new4();
                    push(goTo(1), nodeList);
                    break;
                  }
                  case 5:
                  {
                    ArrayList nodeList = new5();
                    push(goTo(1), nodeList);
                    break;
                  }
                  case 6:
                  {
                    ArrayList nodeList = new6();
                    push(goTo(1), nodeList);
                    break;
                  }
                  case 7:
                  {
                    ArrayList nodeList = new7();
                    push(goTo(1), nodeList);
                    break;
                  }
                  case 8:
                  {
                    ArrayList nodeList = new8();
                    push(goTo(2), nodeList);
                    break;
                  }
                  case 9:
                  {
                    ArrayList nodeList = new9();
                    push(goTo(2), nodeList);
                    break;
                  }
                  case 10:
                  {
                    ArrayList nodeList = new10();
                    push(goTo(3), nodeList);
                    break;
                  }
                  case 11:
                  {
                    ArrayList nodeList = new11();
                    push(goTo(3), nodeList);
                    break;
                  }
                  case 12:
                  {
                    ArrayList nodeList = new12();
                    push(goTo(4), nodeList);
                    break;
                  }
                  case 13:
                  {
                    ArrayList nodeList = new13();
                    push(goTo(4), nodeList);
                    break;
                  }
                  case 14:
                  {
                    ArrayList nodeList = new14();
                    push(goTo(5), nodeList);
                    break;
                  }
                  case 15:
                  {
                    ArrayList nodeList = new15();
                    push(goTo(5), nodeList);
                    break;
                  }
                }
                break;
              }
              case ACCEPT:
              {
                EOF node2 = (EOF) lexer.next();
                PJson node1 = (PJson) ((ArrayList)pop()).get(0);
                Start node = new Start(node1, node2);
                return node;
              }
              case ERROR:
                throw new ParserException(last_token,
                  "[" + last_line + "," + last_pos + "] " +
                  errorMessages[errors[action[1]]]);
            }
        }
    }

    ArrayList new0()
    {
        ArrayList nodeList = new ArrayList(1);
        ArrayList nodeArrayList1 = (ArrayList) pop();
        PValue pvalueNode2 = (PValue)nodeArrayList1.get(0);
        AJson pjsonNode1 = new AJson (
              pvalueNode2
        );
        nodeList.add(pjsonNode1);
        return nodeList;
    }
    ArrayList new1()
    {
        ArrayList nodeList = new ArrayList(1);
        ArrayList nodeArrayList3 = (ArrayList) pop();
        ArrayList nodeArrayList2 = (ArrayList) pop();
        ArrayList nodeArrayList1 = (ArrayList) pop();
        TypedLinkedList listNode3 = new TypedLinkedList();
        TypedLinkedList listNode2 = (TypedLinkedList)nodeArrayList2.get(0);
        if ( listNode2 != null )
        {
            listNode3.addAll(listNode2);
        }
        AObjectValue pvalueNode1 = new AObjectValue (
              listNode3
        );
        nodeList.add(pvalueNode1);
        return nodeList;
    }
    ArrayList new2()
    {
        ArrayList nodeList = new ArrayList(1);
        ArrayList nodeArrayList3 = (ArrayList) pop();
        ArrayList nodeArrayList2 = (ArrayList) pop();
        ArrayList nodeArrayList1 = (ArrayList) pop();
        TypedLinkedList listNode3 = new TypedLinkedList();
        TypedLinkedList listNode2 = (TypedLinkedList)nodeArrayList2.get(0);
        if ( listNode2 != null )
        {
            listNode3.addAll(listNode2);
        }
        AArrayValue pvalueNode1 = new AArrayValue (
              listNode3
        );
        nodeList.add(pvalueNode1);
        return nodeList;
    }
    ArrayList new3()
    {
        ArrayList nodeList = new ArrayList(1);
        ArrayList nodeArrayList1 = (ArrayList) pop();
        TNumber tnumberNode2 = (TNumber)nodeArrayList1.get(0);
        ANumberValue pvalueNode1 = new ANumberValue (
              tnumberNode2
        );
        nodeList.add(pvalueNode1);
        return nodeList;
    }
    ArrayList new4()
    {
        ArrayList nodeList = new ArrayList(1);
        ArrayList nodeArrayList1 = (ArrayList) pop();
        TString tstringNode2 = (TString)nodeArrayList1.get(0);
        AStringValue pvalueNode1 = new AStringValue (
              tstringNode2
        );
        nodeList.add(pvalueNode1);
        return nodeList;
    }
    ArrayList new5()
    {
        ArrayList nodeList = new ArrayList(1);
        ArrayList nodeArrayList1 = (ArrayList) pop();
        ATrueValue pvalueNode1 = new ATrueValue (
        );
        nodeList.add(pvalueNode1);
        return nodeList;
    }
    ArrayList new6()
    {
        ArrayList nodeList = new ArrayList(1);
        ArrayList nodeArrayList1 = (ArrayList) pop();
        AFalseValue pvalueNode1 = new AFalseValue (
        );
        nodeList.add(pvalueNode1);
        return nodeList;
    }
    ArrayList new7()
    {
        ArrayList nodeList = new ArrayList(1);
        ArrayList nodeArrayList1 = (ArrayList) pop();
        ANullValue pvalueNode1 = new ANullValue (
        );
        nodeList.add(pvalueNode1);
        return nodeList;
    }
    ArrayList new8()
    {
        ArrayList nodeList = new ArrayList(1);
        ArrayList nodeArrayList1 = (ArrayList) pop();
        TypedLinkedList listNode2 = new TypedLinkedList();
        PMember pmemberNode1 = (PMember)nodeArrayList1.get(0);
        if ( pmemberNode1 != null )
        {
            listNode2.add(pmemberNode1);
        }
        nodeList.add(listNode2);
        return nodeList;
    }
    ArrayList new9()
    {
        ArrayList nodeList = new ArrayList(1);
        ArrayList nodeArrayList3 = (ArrayList) pop();
        ArrayList nodeArrayList2 = (ArrayList) pop();
        ArrayList nodeArrayList1 = (ArrayList) pop();
        TypedLinkedList listNode3 = new TypedLinkedList();
        TypedLinkedList listNode1 = (TypedLinkedList)nodeArrayList1.get(0);
        PMember pmemberNode2 = (PMember)nodeArrayList3.get(0);
        if ( listNode1 != null )
        {
            listNode3.addAll(listNode1);
        }
        if ( pmemberNode2 != null )
        {
            listNode3.add(pmemberNode2);
        }
        nodeList.add(listNode3);
        return nodeList;
    }
    ArrayList new10()
    {
        ArrayList nodeList = new ArrayList(1);
        ArrayList nodeArrayList3 = (ArrayList) pop();
        ArrayList nodeArrayList2 = (ArrayList) pop();
        ArrayList nodeArrayList1 = (ArrayList) pop();
        TString tstringNode2 = (TString)nodeArrayList1.get(0);
        PValue pvalueNode3 = (PValue)nodeArrayList3.get(0);
        APairMember pmemberNode1 = new APairMember (
              tstringNode2,
              pvalueNode3
        );
        nodeList.add(pmemberNode1);
        return nodeList;
    }
    ArrayList new11()
    {
        ArrayList nodeList = new ArrayList(1);
        AEmptyMember pmemberNode1 = new AEmptyMember (
        );
        nodeList.add(pmemberNode1);
        return nodeList;
    }
    ArrayList new12()
    {
        ArrayList nodeList = new ArrayList(1);
        ArrayList nodeArrayList1 = (ArrayList) pop();
        TypedLinkedList listNode2 = new TypedLinkedList();
        PElement pelementNode1 = (PElement)nodeArrayList1.get(0);
        if ( pelementNode1 != null )
        {
            listNode2.add(pelementNode1);
        }
        nodeList.add(listNode2);
        return nodeList;
    }
    ArrayList new13()
    {
        ArrayList nodeList = new ArrayList(1);
        ArrayList nodeArrayList3 = (ArrayList) pop();
        ArrayList nodeArrayList2 = (ArrayList) pop();
        ArrayList nodeArrayList1 = (ArrayList) pop();
        TypedLinkedList listNode3 = new TypedLinkedList();
        TypedLinkedList listNode1 = (TypedLinkedList)nodeArrayList1.get(0);
        PElement pelementNode2 = (PElement)nodeArrayList3.get(0);
        if ( listNode1 != null )
        {
            listNode3.addAll(listNode1);
        }
        if ( pelementNode2 != null )
        {
            listNode3.add(pelementNode2);
        }
        nodeList.add(listNode3);
        return nodeList;
    }
    ArrayList new14()
    {
        ArrayList nodeList = new ArrayList(1);
        ArrayList nodeArrayList1 = (ArrayList) pop();
        PValue pvalueNode2 = (PValue)nodeArrayList1.get(0);
        AValueElement pelementNode1 = new AValueElement (
              pvalueNode2
        );
        nodeList.add(pelementNode1);
        return nodeList;
    }
    ArrayList new15()
    {
        ArrayList nodeList = new ArrayList(1);
        AEmptyElement pelementNode1 = new AEmptyElement (
        );
        nodeList.add(pelementNode1);
        return nodeList;
    }

    private static int[][][] actionTable; /* = {
      {
        {-1, 3, 0},
        {0, 0, 1},
        {1, 0, 2},
        {3, 0, 3},
        {5, 0, 4},
        {7, 0, 5},
        {8, 0, 6},
        {9, 0, 7},
      },
      {
        {-1, 1, 3},
      },
      {
        {-1, 1, 4},
      },
      {
        {-1, 1, 11},
        {1, 0, 10},
      },
      {
        {-1, 1, 15},
        {0, 0, 1},
        {1, 0, 2},
        {3, 0, 3},
        {5, 0, 4},
        {7, 0, 5},
        {8, 0, 6},
        {9, 0, 7},
      },
      {
        {-1, 1, 5},
      },
      {
        {-1, 1, 6},
      },
      {
        {-1, 1, 7},
      },
      {
        {-1, 3, 8},
        {11, 2, -1},
      },
      {
        {-1, 1, 0},
      },
      {
        {-1, 3, 10},
        {10, 0, 16},
      },
      {
        {-1, 3, 11},
        {2, 0, 17},
        {4, 0, 18},
      },
      {
        {-1, 1, 8},
      },
      {
        {-1, 1, 14},
      },
      {
        {-1, 3, 14},
        {2, 0, 19},
        {6, 0, 20},
      },
      {
        {-1, 1, 12},
      },
      {
        {-1, 3, 16},
        {0, 0, 1},
        {1, 0, 2},
        {3, 0, 3},
        {5, 0, 4},
        {7, 0, 5},
        {8, 0, 6},
        {9, 0, 7},
      },
      {
        {-1, 1, 11},
        {1, 0, 10},
      },
      {
        {-1, 1, 1},
      },
      {
        {-1, 1, 15},
        {0, 0, 1},
        {1, 0, 2},
        {3, 0, 3},
        {5, 0, 4},
        {7, 0, 5},
        {8, 0, 6},
        {9, 0, 7},
      },
      {
        {-1, 1, 2},
      },
      {
        {-1, 1, 10},
      },
      {
        {-1, 1, 9},
      },
      {
        {-1, 1, 13},
      },
    }; */

    private static int[][][] gotoTable; /* = {
      {
        {-1, 8},
      },
      {
        {-1, 13},
        {0, 9},
        {16, 21},
      },
      {
        {-1, 11},
      },
      {
        {-1, 12},
        {17, 22},
      },
      {
        {-1, 14},
      },
      {
        {-1, 15},
        {19, 23},
      },
    };
    */
    private static String[] errorMessages; /* = {
      "expecting: number, string, '{', '[', 'true', 'false', 'null'",
      "expecting: ',', '}', ']', EOF",
      "expecting: string, ',', '}'",
      "expecting: number, string, ',', '{', '[', ']', 'true', 'false', 'null'",
      "expecting: EOF",
      "expecting: ':'",
      "expecting: ',', '}'",
      "expecting: ',', ']'",
    };
    */
    private static int[] errors; /* = {
0, 1, 1, 2, 3, 1, 1, 1, 4, 4, 5, 6, 6, 7, 7, 7, 0, 2, 1, 3, 1, 6, 6, 7, 

    };
    */

    static
    {
        try
        {
            BufferedReader r = new BufferedReader (new InputStreamReader (
                Parser.class.getResourceAsStream("parser.dat")));

            // read actionTable
            int length = Integer.parseInt(r.readLine());
            actionTable = new int[length][][];
            for(int i = 0; i < actionTable.length; i++)
            {
                length = Integer.parseInt(r.readLine());
                actionTable[i] = new int[length][3];
                for(int j = 0; j < actionTable[i].length; j++)
                {
                    for(int k = 0; k < 3; k++)
                    {
                        actionTable[i][j][k] = Integer.parseInt(r.readLine());
                    }
                }
            }

            // read gotoTable
            length = Integer.parseInt(r.readLine());
            gotoTable = new int[length][][];
            for(int i = 0; i < gotoTable.length; i++)
            {
                length = Integer.parseInt(r.readLine());
                gotoTable[i] = new int[length][2];
                for(int j = 0; j < gotoTable[i].length; j++)
                {
                    for(int k = 0; k < 2; k++)
                    {
                        gotoTable[i][j][k] = Integer.parseInt(r.readLine());
                    }
                }
            }

            // read errorMessages
            length = Integer.parseInt(r.readLine());
            errorMessages = new String[length];
            for(int i = 0; i < errorMessages.length; i++)
            {
                errorMessages[i] = unescape(r.readLine());
            }

            // read errors
            length = Integer.parseInt(r.readLine());
            errors = new int[length];
            for(int i = 0; i < errors.length; i++)
            {
                errors[i] = Integer.parseInt(r.readLine());
            }

            r.close();
        }
        catch(Exception e)
        {
            throw new RuntimeException("The file \"parser.dat\" is either missing or corrupted.");
        }
    }

    private static String unescape (String str)
    {
      StringBuffer out = new StringBuffer ();
      for ( int i = 0; i < str.length(); i++ )
        {
          char c = str.charAt(i);

          switch (c)
          {
            case '\\':
              if ( i + 1 < str.length() )
              {
                i++;
                switch (str.charAt(i))
                  {
                    case 'n':
                      out.append ("\n");
                      break;
                    case 'r':
                      out.append ("\r");
                      break;
                    case '"':
                      out.append ("\"");
                      break;
                    case '\\':
                      out.append ("\\");
                      break;
                    case '0':
                      if ( str.substring(i).startsWith ("000") )
                        {
                          out.append ("\000");
                          i += 2;
                        }
                      else
                        {
                          out.append ("\\");
                          out.append (str.charAt(i));
                        }
                      break;
                    case 'u':
                      String hstr = str.substring(i, i + 4);
                      if ( hstr.length() == 4 )
                        {
                          try
                          {
                            out.append ((char)Integer.parseInt(hstr, 16));
                            i += 4;
                          } catch (NumberFormatException ex)
                          {
                            out.append ("\\");
                            out.append (str.charAt(i));
                          }
                        }
                      else
                        {
                          out.append ("\\");
                          out.append (str.charAt(i));
                        }
                      break;
                    default:
                      out.append ("\\");
                      out.append (str.charAt(i));
                      break;
                  }
              }
              else
              {
                out.append (c);
              }

              break;
            default:
              out.append (c);
              break;
          }
        }
      return out.toString();
    }
}
