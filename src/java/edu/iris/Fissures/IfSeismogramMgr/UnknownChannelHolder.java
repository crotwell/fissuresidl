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
final public class UnknownChannelHolder implements org.omg.CORBA.portable.Streamable
{
    public UnknownChannel value;

    public
    UnknownChannelHolder()
    {
    }

    public
    UnknownChannelHolder(UnknownChannel initial)
    {
        value = initial;
    }

    public void
    _read(org.omg.CORBA.portable.InputStream in)
    {
        value = UnknownChannelHelper.read(in);
    }

    public void
    _write(org.omg.CORBA.portable.OutputStream out)
    {
        UnknownChannelHelper.write(out, value);
    }

    public org.omg.CORBA.TypeCode
    _type()
    {
        return UnknownChannelHelper.type();
    }
}
