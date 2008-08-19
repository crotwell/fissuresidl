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

package edu.iris.Fissures;

//
// IDL:iris.edu/Fissures/Time:1.0
//
final public class TimeHolder implements org.omg.CORBA.portable.Streamable
{
    public Time value;

    public
    TimeHolder()
    {
    }

    public
    TimeHolder(Time initial)
    {
        value = initial;
    }

    public void
    _read(org.omg.CORBA.portable.InputStream in)
    {
        value = TimeHelper.read(in);
    }

    public void
    _write(org.omg.CORBA.portable.OutputStream out)
    {
        TimeHelper.write(out, value);
    }

    public org.omg.CORBA.TypeCode
    _type()
    {
        return TimeHelper.type();
    }
}
