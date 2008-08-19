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
// IDL:iris.edu/Fissures/IfEvent/EventDC:1.0
//
public abstract class EventDCPOA
    extends org.omg.PortableServer.Servant
    implements org.omg.CORBA.portable.InvokeHandler,
               EventDCOperations
{
    static final String[] _ob_ids_ =
    {
        "IDL:iris.edu/Fissures/IfEvent/EventDC:1.0",
    };

    public EventDC
    _this()
    {
        return EventDCHelper.narrow(super._this_object());
    }

    public EventDC
    _this(org.omg.CORBA.ORB orb)
    {
        return EventDCHelper.narrow(super._this_object(orb));
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
            "_get_a_channel_finder",
            "_get_a_finder"
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
        case 0: // _get_a_channel_finder
            return _OB_att_get_a_channel_finder(in, handler);

        case 1: // _get_a_finder
            return _OB_att_get_a_finder(in, handler);
        }

        throw new org.omg.CORBA.BAD_OPERATION();
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_att_get_a_channel_finder(org.omg.CORBA.portable.InputStream in,
                                 org.omg.CORBA.portable.ResponseHandler handler)
    {
        EventChannelFinder _ob_r = a_channel_finder();
        org.omg.CORBA.portable.OutputStream out = handler.createReply();
        EventChannelFinderHelper.write(out, _ob_r);
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_att_get_a_finder(org.omg.CORBA.portable.InputStream in,
                         org.omg.CORBA.portable.ResponseHandler handler)
    {
        EventFinder _ob_r = a_finder();
        org.omg.CORBA.portable.OutputStream out = handler.createReply();
        EventFinderHelper.write(out, _ob_r);
        return out;
    }
}
