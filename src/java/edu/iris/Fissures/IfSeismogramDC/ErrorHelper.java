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

package edu.iris.Fissures.IfSeismogramDC;

//
// IDL:iris.edu/Fissures/IfSeismogramDC/Error:1.0
//
final public class ErrorHelper
{
    public static void
    insert(org.omg.CORBA.Any any, edu.iris.Fissures.Error val)
    {
        org.omg.CORBA.portable.OutputStream out = any.create_output_stream();
        write(out, val);
        any.read_value(out.create_input_stream(), type());
    }

    public static edu.iris.Fissures.Error
    extract(org.omg.CORBA.Any any)
    {
        if(any.type().equivalent(type()))
            return read(any.create_input_stream());
        else
            throw new org.omg.CORBA.BAD_OPERATION();
    }

    private static org.omg.CORBA.TypeCode typeCode_;

    public static org.omg.CORBA.TypeCode
    type()
    {
        if(typeCode_ == null)
        {
            org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init();
            typeCode_ = orb.create_alias_tc(id(), "Error", edu.iris.Fissures.ErrorHelper.type());
        }

        return typeCode_;
    }

    public static String
    id()
    {
        return "IDL:iris.edu/Fissures/IfSeismogramDC/Error:1.0";
    }

    public static edu.iris.Fissures.Error
    read(org.omg.CORBA.portable.InputStream in)
    {
        edu.iris.Fissures.Error _ob_v;
        _ob_v = edu.iris.Fissures.ErrorHelper.read(in);
        return _ob_v;
    }

    public static void
    write(org.omg.CORBA.portable.OutputStream out, edu.iris.Fissures.Error val)
    {
        edu.iris.Fissures.ErrorHelper.write(out, val);
    }
}
