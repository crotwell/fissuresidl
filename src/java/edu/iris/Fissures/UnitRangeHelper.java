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
// IDL:iris.edu/Fissures/UnitRange:1.0
//
final public class UnitRangeHelper
{
    public static void
    insert(org.omg.CORBA.Any any, UnitRange val)
    {
        any.insert_Value(val, type());
    }

    public static UnitRange
    extract(org.omg.CORBA.Any any)
    {
        if(any.type().equivalent(type()))
        {
            java.io.Serializable _ob_v = any.extract_Value();
            if(_ob_v instanceof UnitRange)
                return (UnitRange)_ob_v;
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
            org.omg.CORBA.ValueMember[] members = new org.omg.CORBA.ValueMember[3];

            members[0] = new org.omg.CORBA.ValueMember();
            members[0].name = "the_units";
            members[0].type = UnitHelper.type();
            members[0].access = org.omg.CORBA.PUBLIC_MEMBER.value;

            members[1] = new org.omg.CORBA.ValueMember();
            members[1].name = "min_value";
            members[1].type = orb.get_primitive_tc(org.omg.CORBA.TCKind.tk_double);
            members[1].access = org.omg.CORBA.PUBLIC_MEMBER.value;

            members[2] = new org.omg.CORBA.ValueMember();
            members[2].name = "max_value";
            members[2].type = orb.get_primitive_tc(org.omg.CORBA.TCKind.tk_double);
            members[2].access = org.omg.CORBA.PUBLIC_MEMBER.value;

            typeCode_ = orb.create_value_tc(id(), "UnitRange", org.omg.CORBA.VM_NONE.value, null, members);
        }

        return typeCode_;
    }

    public static String
    id()
    {
        return "IDL:iris.edu/Fissures/UnitRange:1.0";
    }

    public static UnitRange
    read(org.omg.CORBA.portable.InputStream in)
    {
        if(!(in instanceof org.omg.CORBA_2_3.portable.InputStream))
            throw new org.omg.CORBA.BAD_PARAM();
        return (UnitRange)((org.omg.CORBA_2_3.portable.InputStream)in).read_value(id());
    }

    public static void
    write(org.omg.CORBA.portable.OutputStream out, UnitRange val)
    {
        if(!(out instanceof org.omg.CORBA_2_3.portable.OutputStream))
            throw new org.omg.CORBA.BAD_PARAM();
        ((org.omg.CORBA_2_3.portable.OutputStream)out).write_value(val, id());
    }
}
