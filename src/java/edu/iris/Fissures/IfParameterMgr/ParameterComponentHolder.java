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
// IDL:iris.edu/Fissures/IfParameterMgr/ParameterComponent:1.0
//
final public class ParameterComponentHolder implements org.omg.CORBA.portable.Streamable
{
    public ParameterComponent value;

    public
    ParameterComponentHolder()
    {
    }

    public
    ParameterComponentHolder(ParameterComponent initial)
    {
        value = initial;
    }

    public void
    _read(org.omg.CORBA.portable.InputStream in)
    {
        value = ParameterComponentHelper.read(in);
    }

    public void
    _write(org.omg.CORBA.portable.OutputStream out)
    {
        ParameterComponentHelper.write(out, value);
    }

    public org.omg.CORBA.TypeCode
    _type()
    {
        return ParameterComponentHelper.type();
    }
}
