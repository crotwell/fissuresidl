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

package edu.iris.Fissures.IfEvent;

//
// IDL:iris.edu/Fissures/IfEvent/Pick:1.0
//
final public class PickHelper
{
    public static void
    insert(org.omg.CORBA.Any any, edu.iris.Fissures.IfPickMgr.Pick val)
    {
        org.omg.CORBA.portable.OutputStream out = any.create_output_stream();
        write(out, val);
        any.read_value(out.create_input_stream(), type());
    }

    public static edu.iris.Fissures.IfPickMgr.Pick
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
            typeCode_ = orb.create_alias_tc(id(), "Pick", edu.iris.Fissures.IfPickMgr.PickHelper.type());
        }

        return typeCode_;
    }

    public static String
    id()
    {
        return "IDL:iris.edu/Fissures/IfEvent/Pick:1.0";
    }

    public static edu.iris.Fissures.IfPickMgr.Pick
    read(org.omg.CORBA.portable.InputStream in)
    {
        edu.iris.Fissures.IfPickMgr.Pick _ob_v;
        _ob_v = edu.iris.Fissures.IfPickMgr.PickHelper.read(in);
        return _ob_v;
    }

    public static void
    write(org.omg.CORBA.portable.OutputStream out, edu.iris.Fissures.IfPickMgr.Pick val)
    {
        edu.iris.Fissures.IfPickMgr.PickHelper.write(out, val);
    }
}
