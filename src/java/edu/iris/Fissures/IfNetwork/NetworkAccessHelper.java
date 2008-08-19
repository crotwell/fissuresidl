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

package edu.iris.Fissures.IfNetwork;

//
// IDL:iris.edu/Fissures/IfNetwork/NetworkAccess:1.0
//
final public class NetworkAccessHelper
{
    public static void
    insert(org.omg.CORBA.Any any, NetworkAccess val)
    {
        if(val instanceof org.omg.CORBA.Object)
            any.insert_Object((org.omg.CORBA.Object)val, type());
        else
            any.insert_Value((java.io.Serializable)val, type());
    }

    public static NetworkAccess
    extract(org.omg.CORBA.Any any)
    {
        if(any.type().equivalent(type()))
        {
            try
            {
                return narrow(any.extract_Object());
            }
            catch(org.omg.CORBA.BAD_OPERATION ex)
            {
                java.io.Serializable _ob_v = any.extract_Value();
                if(_ob_v instanceof NetworkAccess)
                    return (NetworkAccess)_ob_v;
            }
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
            typeCode_ = orb.create_abstract_interface_tc(id(), "NetworkAccess");
        }

        return typeCode_;
    }

    public static String
    id()
    {
        return "IDL:iris.edu/Fissures/IfNetwork/NetworkAccess:1.0";
    }

    public static NetworkAccess
    read(org.omg.CORBA.portable.InputStream in)
    {
        if(!(in instanceof org.omg.CORBA_2_3.portable.InputStream))
            throw new org.omg.CORBA.BAD_PARAM();
        java.lang.Object _ob_v = ((org.omg.CORBA_2_3.portable.InputStream)in).read_abstract_interface();
        return narrow(_ob_v);
    }

    public static void
    write(org.omg.CORBA.portable.OutputStream out, NetworkAccess val)
    {
        if(!(out instanceof org.omg.CORBA_2_3.portable.OutputStream))
            throw new org.omg.CORBA.BAD_PARAM();
        ((org.omg.CORBA_2_3.portable.OutputStream)out).write_abstract_interface(val);
    }

    public static NetworkAccess
    narrow(java.lang.Object val)
    {
        if(val != null)
        {
            try
            {
                return (NetworkAccess)val;
            }
            catch(ClassCastException ex)
            {
            }

            if(val instanceof org.omg.CORBA.Object)
            {
                org.omg.CORBA.Object _ob_o = (org.omg.CORBA.Object)val;
                if(_ob_o._is_a(id()))
                {
                    org.omg.CORBA.portable.ObjectImpl _ob_impl;
                    _NetworkAccessStub _ob_stub = new _NetworkAccessStub();
                    _ob_impl = (org.omg.CORBA.portable.ObjectImpl)_ob_o;
                    _ob_stub._set_delegate(_ob_impl._get_delegate());
                    return _ob_stub;
                }
            }

            throw new org.omg.CORBA.BAD_PARAM();
        }

        return null;
    }
}
