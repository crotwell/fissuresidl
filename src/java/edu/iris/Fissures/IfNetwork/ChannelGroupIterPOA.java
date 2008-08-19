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
// IDL:iris.edu/Fissures/IfNetwork/ChannelGroupIter:1.0
//
public abstract class ChannelGroupIterPOA
    extends org.omg.PortableServer.Servant
    implements org.omg.CORBA.portable.InvokeHandler,
               ChannelGroupIterOperations
{
    static final String[] _ob_ids_ =
    {
        "IDL:iris.edu/Fissures/IfNetwork/ChannelGroupIter:1.0",
    };

    public ChannelGroupIter
    _this()
    {
        return ChannelGroupIterHelper.narrow(super._this_object());
    }

    public ChannelGroupIter
    _this(org.omg.CORBA.ORB orb)
    {
        return ChannelGroupIterHelper.narrow(super._this_object(orb));
    }

    public String[]
    _all_interfaces(org.omg.PortableServer.POA poa, byte[] objectId)
    {
        return _ob_ids_;
    }

    public org.omg.CORBA.portable.OutputStream
    _invoke(String opName,
            org.omg.CORBA.portable.InputStream in,
            org.omg.CORBA.portable.ResponseHandler handler)
    {
        final String[] _ob_names =
        {
            "destroy",
            "how_many_remain",
            "next_n"
        };

        int _ob_left = 0;
        int _ob_right = _ob_names.length;
        int _ob_index = -1;

        while(_ob_left < _ob_right)
        {
            int _ob_m = (_ob_left + _ob_right) / 2;
            int _ob_res = _ob_names[_ob_m].compareTo(opName);
            if(_ob_res == 0)
            {
                _ob_index = _ob_m;
                break;
            }
            else if(_ob_res > 0)
                _ob_right = _ob_m;
            else
                _ob_left = _ob_m + 1;
        }

        switch(_ob_index)
        {
        case 0: // destroy
            return _OB_op_destroy(in, handler);

        case 1: // how_many_remain
            return _OB_op_how_many_remain(in, handler);

        case 2: // next_n
            return _OB_op_next_n(in, handler);
        }

        throw new org.omg.CORBA.BAD_OPERATION();
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_destroy(org.omg.CORBA.portable.InputStream in,
                   org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        destroy();
        out = handler.createReply();
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_how_many_remain(org.omg.CORBA.portable.InputStream in,
                           org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        int _ob_r = how_many_remain();
        out = handler.createReply();
        out.write_long(_ob_r);
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_next_n(org.omg.CORBA.portable.InputStream in,
                  org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        int _ob_a0 = in.read_long();
        ChannelGroupSeqHolder _ob_ah1 = new ChannelGroupSeqHolder();
        boolean _ob_r = next_n(_ob_a0, _ob_ah1);
        out = handler.createReply();
        out.write_boolean(_ob_r);
        ChannelGroupSeqHelper.write(out, _ob_ah1.value);
        return out;
    }
}
