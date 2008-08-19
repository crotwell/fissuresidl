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
// IDL:iris.edu/Fissures/IfTimeSeries/EncodedData:1.0
//
final public class EncodedDataHelper
{
    public static void
    insert(org.omg.CORBA.Any any, EncodedData val)
    {
        org.omg.CORBA.portable.OutputStream out = any.create_output_stream();
        write(out, val);
        any.read_value(out.create_input_stream(), type());
    }

    public static EncodedData
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
            org.omg.CORBA.StructMember[] members = new org.omg.CORBA.StructMember[4];

            members[0] = new org.omg.CORBA.StructMember();
            members[0].name = "compression";
            members[0].type = orb.get_primitive_tc(org.omg.CORBA.TCKind.tk_short);

            members[1] = new org.omg.CORBA.StructMember();
            members[1].name = "values";
            members[1].type = orb.create_sequence_tc(0, orb.get_primitive_tc(org.omg.CORBA.TCKind.tk_octet));

            members[2] = new org.omg.CORBA.StructMember();
            members[2].name = "num_points";
            members[2].type = orb.get_primitive_tc(org.omg.CORBA.TCKind.tk_long);

            members[3] = new org.omg.CORBA.StructMember();
            members[3].name = "byte_order";
            members[3].type = orb.get_primitive_tc(org.omg.CORBA.TCKind.tk_boolean);

            typeCode_ = orb.create_struct_tc(id(), "EncodedData", members);
        }

        return typeCode_;
    }

    public static String
    id()
    {
        return "IDL:iris.edu/Fissures/IfTimeSeries/EncodedData:1.0";
    }

    public static EncodedData
    read(org.omg.CORBA.portable.InputStream in)
    {
        EncodedData _ob_v = new EncodedData();
        _ob_v.compression = in.read_short();
        int len0 = in.read_ulong();
        _ob_v.values = new byte[len0];
        in.read_octet_array(_ob_v.values, 0, len0);
        _ob_v.num_points = in.read_long();
        _ob_v.byte_order = in.read_boolean();
        return _ob_v;
    }

    public static void
    write(org.omg.CORBA.portable.OutputStream out, EncodedData val)
    {
        out.write_short(val.compression);
        int len0 = val.values.length;
        out.write_ulong(len0);
        out.write_octet_array(val.values, 0, len0);
        out.write_long(val.num_points);
        out.write_boolean(val.byte_order);
    }
}
