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
// IDL:iris.edu/Fissures/TimeRange:1.0
//
final public class TimeRangeHolder implements org.omg.CORBA.portable.Streamable
{
    public TimeRange value;

    public
    TimeRangeHolder()
    {
    }

    public
    TimeRangeHolder(TimeRange initial)
    {
        value = initial;
    }

    public void
    _read(org.omg.CORBA.portable.InputStream in)
    {
        value = TimeRangeHelper.read(in);
    }

    public void
    _write(org.omg.CORBA.portable.OutputStream out)
    {
        TimeRangeHelper.write(out, value);
    }

    public org.omg.CORBA.TypeCode
    _type()
    {
        return TimeRangeHelper.type();
    }
}
