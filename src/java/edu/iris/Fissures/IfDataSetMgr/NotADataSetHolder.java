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

package edu.iris.Fissures.IfDataSetMgr;

//
// IDL:iris.edu/Fissures/IfDataSetMgr/NotADataSet:1.0
//
final public class NotADataSetHolder implements org.omg.CORBA.portable.Streamable
{
    public NotADataSet value;

    public
    NotADataSetHolder()
    {
    }

    public
    NotADataSetHolder(NotADataSet initial)
    {
        value = initial;
    }

    public void
    _read(org.omg.CORBA.portable.InputStream in)
    {
        value = NotADataSetHelper.read(in);
    }

    public void
    _write(org.omg.CORBA.portable.OutputStream out)
    {
        NotADataSetHelper.write(out, value);
    }

    public org.omg.CORBA.TypeCode
    _type()
    {
        return NotADataSetHelper.type();
    }
}
