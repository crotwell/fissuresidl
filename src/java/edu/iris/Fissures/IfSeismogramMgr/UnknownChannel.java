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

package edu.iris.Fissures.IfSeismogramMgr;

//
// IDL:iris.edu/Fissures/IfSeismogramMgr/UnknownChannel:1.0
//
/***/

final public class UnknownChannel extends org.omg.CORBA.UserException
{
    public
    UnknownChannel()
    {
        super(UnknownChannelHelper.id());
    }

    public
    UnknownChannel(String _reason)
    {
        super(UnknownChannelHelper.id() + " " + _reason);
    }
}
