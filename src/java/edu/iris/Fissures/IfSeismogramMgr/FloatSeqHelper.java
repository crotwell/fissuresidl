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
// IDL:iris.edu/Fissures/IfSeismogramMgr/FloatSeq:1.0
//
final public class FloatSeqHelper
{
    public static void
    insert(org.omg.CORBA.Any any, float[] val)
    {
        org.omg.CORBA.portable.OutputStream out = any.create_output_stream();
        write(out, val);
        any.read_value(out.create_input_stream(), type());
    }

    public static float[]
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
            typeCode_ = orb.create_alias_tc(id(), "FloatSeq", edu.iris.Fissures.IfTimeSeries.FloatSeqHelper.type());
        }

        return typeCode_;
    }

    public static String
    id()
    {
        return "IDL:iris.edu/Fissures/IfSeismogramMgr/FloatSeq:1.0";
    }

    public static float[]
    read(org.omg.CORBA.portable.InputStream in)
    {
        float[] _ob_v;
        _ob_v = edu.iris.Fissures.IfTimeSeries.FloatSeqHelper.read(in);
        return _ob_v;
    }

    public static void
    write(org.omg.CORBA.portable.OutputStream out, float[] val)
    {
        edu.iris.Fissures.IfTimeSeries.FloatSeqHelper.write(out, val);
    }
}
