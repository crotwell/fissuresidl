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

package edu.iris.Fissures.IfService;

//
// IDL:iris.edu/Fissures/IfService/ServiceOption:1.0
//
final public class ServiceOptionHolder implements org.omg.CORBA.portable.Streamable
{
    public ServiceOption value;

    public
    ServiceOptionHolder()
    {
    }

    public
    ServiceOptionHolder(ServiceOption initial)
    {
        value = initial;
    }

    public void
    _read(org.omg.CORBA.portable.InputStream in)
    {
        value = ServiceOptionHelper.read(in);
    }

    public void
    _write(org.omg.CORBA.portable.OutputStream out)
    {
        ServiceOptionHelper.write(out, value);
    }

    public org.omg.CORBA.TypeCode
    _type()
    {
        return ServiceOptionHelper.type();
    }
}
