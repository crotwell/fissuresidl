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
// IDL:iris.edu/Fissures/UnitBase:1.0
//
final public class UnitBaseHolder implements org.omg.CORBA.portable.Streamable
{
    public UnitBase value;

    public
    UnitBaseHolder()
    {
    }

    public
    UnitBaseHolder(UnitBase initial)
    {
        value = initial;
    }

    public void
    _read(org.omg.CORBA.portable.InputStream in)
    {
        value = UnitBaseHelper.read(in);
    }

    public void
    _write(org.omg.CORBA.portable.OutputStream out)
    {
        UnitBaseHelper.write(out, value);
    }

    public org.omg.CORBA.TypeCode
    _type()
    {
        return UnitBaseHelper.type();
    }
}
