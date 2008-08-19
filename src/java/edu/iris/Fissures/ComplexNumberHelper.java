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
// IDL:iris.edu/Fissures/ComplexNumber:1.0
//
final public class ComplexNumberHelper
{
    public static void
    insert(org.omg.CORBA.Any any, ComplexNumber val)
    {
        org.omg.CORBA.portable.OutputStream out = any.create_output_stream();
        write(out, val);
        any.read_value(out.create_input_stream(), type());
    }

    public static ComplexNumber
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
            org.omg.CORBA.StructMember[] members = new org.omg.CORBA.StructMember[2];

            members[0] = new org.omg.CORBA.StructMember();
            members[0].name = "real";
            members[0].type = orb.get_primitive_tc(org.omg.CORBA.TCKind.tk_float);

            members[1] = new org.omg.CORBA.StructMember();
            members[1].name = "imaginary";
            members[1].type = orb.get_primitive_tc(org.omg.CORBA.TCKind.tk_float);

            typeCode_ = orb.create_struct_tc(id(), "ComplexNumber", members);
        }

        return typeCode_;
    }

    public static String
    id()
    {
        return "IDL:iris.edu/Fissures/ComplexNumber:1.0";
    }

    public static ComplexNumber
    read(org.omg.CORBA.portable.InputStream in)
    {
        ComplexNumber _ob_v = new ComplexNumber();
        _ob_v.real = in.read_float();
        _ob_v.imaginary = in.read_float();
        return _ob_v;
    }

    public static void
    write(org.omg.CORBA.portable.OutputStream out, ComplexNumber val)
    {
        out.write_float(val.real);
        out.write_float(val.imaginary);
    }
}
