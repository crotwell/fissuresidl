// **********************************************************************
//
// Generated by the ORBacus IDL to Java Translator
//
// Copyright (c) 2000
// Object Oriented Concepts, Inc.
// Billerica, MA, USA
//
// All Rights Reserved
//
// **********************************************************************

// Version: 4.0.5

package edu.iris.Fissures.IfPickMgr;

//
// IDL:iris.edu/Fissures/IfPickMgr/UnknownPick:1.0
//
/***/

final public class UnknownPick extends org.omg.CORBA.UserException
{
    public
    UnknownPick()
    {
        super(UnknownPickHelper.id());
    }

    public
    UnknownPick(String id)
    {
        super(UnknownPickHelper.id());
        this.id = id;
    }

    public
    UnknownPick(String _reason,
                String id)
    {
        super(UnknownPickHelper.id() + " " + _reason);
        this.id = id;
    }

    public String id;
}
