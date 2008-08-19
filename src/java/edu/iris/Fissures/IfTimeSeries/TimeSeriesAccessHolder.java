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

package edu.iris.Fissures.IfTimeSeries;

//
// IDL:iris.edu/Fissures/IfTimeSeries/TimeSeriesAccess:1.0
//
final public class TimeSeriesAccessHolder implements org.omg.CORBA.portable.Streamable
{
    public TimeSeriesAccess value;

    public
    TimeSeriesAccessHolder()
    {
    }

    public
    TimeSeriesAccessHolder(TimeSeriesAccess initial)
    {
        value = initial;
    }

    public void
    _read(org.omg.CORBA.portable.InputStream in)
    {
        value = TimeSeriesAccessHelper.read(in);
    }

    public void
    _write(org.omg.CORBA.portable.OutputStream out)
    {
        TimeSeriesAccessHelper.write(out, value);
    }

    public org.omg.CORBA.TypeCode
    _type()
    {
        return TimeSeriesAccessHelper.type();
    }
}
