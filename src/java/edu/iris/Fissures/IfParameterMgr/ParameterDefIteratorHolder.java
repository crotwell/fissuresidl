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

package edu.iris.Fissures.IfParameterMgr;

//
// IDL:iris.edu/Fissures/IfParameterMgr/ParameterDefIterator:1.0
//
final public class ParameterDefIteratorHolder implements org.omg.CORBA.portable.Streamable
{
    public ParameterDefIterator value;

    public
    ParameterDefIteratorHolder()
    {
    }

    public
    ParameterDefIteratorHolder(ParameterDefIterator initial)
    {
        value = initial;
    }

    public void
    _read(org.omg.CORBA.portable.InputStream in)
    {
        value = ParameterDefIteratorHelper.read(in);
    }

    public void
    _write(org.omg.CORBA.portable.OutputStream out)
    {
        ParameterDefIteratorHelper.write(out, value);
    }

    public org.omg.CORBA.TypeCode
    _type()
    {
        return ParameterDefIteratorHelper.type();
    }
}
