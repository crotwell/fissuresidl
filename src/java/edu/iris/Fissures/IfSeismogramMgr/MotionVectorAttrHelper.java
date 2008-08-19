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
// IDL:iris.edu/Fissures/IfSeismogramMgr/MotionVectorAttr:1.0
//
final public class MotionVectorAttrHelper
{
    public static void
    insert(org.omg.CORBA.Any any, edu.iris.Fissures.IfSeismogramDC.MotionVectorAttr val)
    {
        any.insert_Value(val, type());
    }

    public static edu.iris.Fissures.IfSeismogramDC.MotionVectorAttr
    extract(org.omg.CORBA.Any any)
    {
        if(any.type().equivalent(type()))
        {
            java.io.Serializable _ob_v = any.extract_Value();
            if(_ob_v instanceof edu.iris.Fissures.IfSeismogramDC.MotionVectorAttr)
                return (edu.iris.Fissures.IfSeismogramDC.MotionVectorAttr)_ob_v;
        }

        throw new org.omg.CORBA.BAD_OPERATION();
    }

    private static org.omg.CORBA.TypeCode typeCode_;

    public static org.omg.CORBA.TypeCode
    type()
    {
        if(typeCode_ == null)
        {
            org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init();
            typeCode_ = orb.create_alias_tc(id(), "MotionVectorAttr", edu.iris.Fissures.IfSeismogramDC.MotionVectorAttrHelper.type());
        }

        return typeCode_;
    }

    public static String
    id()
    {
        return "IDL:iris.edu/Fissures/IfSeismogramMgr/MotionVectorAttr:1.0";
    }

    public static edu.iris.Fissures.IfSeismogramDC.MotionVectorAttr
    read(org.omg.CORBA.portable.InputStream in)
    {
        edu.iris.Fissures.IfSeismogramDC.MotionVectorAttr _ob_v;
        _ob_v = edu.iris.Fissures.IfSeismogramDC.MotionVectorAttrHelper.read(in);
        return _ob_v;
    }

    public static void
    write(org.omg.CORBA.portable.OutputStream out, edu.iris.Fissures.IfSeismogramDC.MotionVectorAttr val)
    {
        edu.iris.Fissures.IfSeismogramDC.MotionVectorAttrHelper.write(out, val);
    }
}
