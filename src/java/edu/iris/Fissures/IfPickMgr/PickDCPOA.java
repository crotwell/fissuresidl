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

package edu.iris.Fissures.IfPickMgr;

//
// IDL:iris.edu/Fissures/IfPickMgr/PickDC:1.0
//
public abstract class PickDCPOA
    extends org.omg.PortableServer.Servant
    implements org.omg.CORBA.portable.InvokeHandler,
               PickDCOperations
{
    static final String[] _ob_ids_ =
    {
        "IDL:iris.edu/Fissures/IfPickMgr/PickDC:1.0",
    };

    public PickDC
    _this()
    {
        return PickDCHelper.narrow(super._this_object());
    }

    public PickDC
    _this(org.omg.CORBA.ORB orb)
    {
        return PickDCHelper.narrow(super._this_object(orb));
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
            "_get_a_writeable",
            "get_pickgroups_for_dataset",
            "retrieve_pick_group",
            "retrieve_pick_group_by_name",
            "retrieve_picks_for_seismogram",
            "retrieve_picks_for_site"
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
        case 0: // _get_a_writeable
            return _OB_att_get_a_writeable(in, handler);

        case 1: // get_pickgroups_for_dataset
            return _OB_op_get_pickgroups_for_dataset(in, handler);

        case 2: // retrieve_pick_group
            return _OB_op_retrieve_pick_group(in, handler);

        case 3: // retrieve_pick_group_by_name
            return _OB_op_retrieve_pick_group_by_name(in, handler);

        case 4: // retrieve_picks_for_seismogram
            return _OB_op_retrieve_picks_for_seismogram(in, handler);

        case 5: // retrieve_picks_for_site
            return _OB_op_retrieve_picks_for_site(in, handler);
        }

        throw new org.omg.CORBA.BAD_OPERATION();
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_att_get_a_writeable(org.omg.CORBA.portable.InputStream in,
                            org.omg.CORBA.portable.ResponseHandler handler)
    {
        PickMgr _ob_r = a_writeable();
        org.omg.CORBA.portable.OutputStream out = handler.createReply();
        PickMgrHelper.write(out, _ob_r);
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_get_pickgroups_for_dataset(org.omg.CORBA.portable.InputStream in,
                                      org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        try
        {
            String _ob_a0 = NodeIdHelper.read(in);
            PickGroup[] _ob_r = get_pickgroups_for_dataset(_ob_a0);
            out = handler.createReply();
            PickGroupSeqHelper.write(out, _ob_r);
        }
        catch(edu.iris.Fissures.FissuresException _ob_ex)
        {
            out = handler.createExceptionReply();
            edu.iris.Fissures.FissuresExceptionHelper.write(out, _ob_ex);
        }
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_retrieve_pick_group(org.omg.CORBA.portable.InputStream in,
                               org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        try
        {
            String _ob_a0 = PickGroupIdHelper.read(in);
            PickGroup[] _ob_r = retrieve_pick_group(_ob_a0);
            out = handler.createReply();
            PickGroupSeqHelper.write(out, _ob_r);
        }
        catch(edu.iris.Fissures.FissuresException _ob_ex)
        {
            out = handler.createExceptionReply();
            edu.iris.Fissures.FissuresExceptionHelper.write(out, _ob_ex);
        }
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_retrieve_pick_group_by_name(org.omg.CORBA.portable.InputStream in,
                                       org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        try
        {
            String _ob_a0 = PickGroupNameHelper.read(in);
            PickGroup[] _ob_r = retrieve_pick_group_by_name(_ob_a0);
            out = handler.createReply();
            PickGroupSeqHelper.write(out, _ob_r);
        }
        catch(edu.iris.Fissures.FissuresException _ob_ex)
        {
            out = handler.createExceptionReply();
            edu.iris.Fissures.FissuresExceptionHelper.write(out, _ob_ex);
        }
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_retrieve_picks_for_seismogram(org.omg.CORBA.portable.InputStream in,
                                         org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        try
        {
            String _ob_a0 = SeismogramIdHelper.read(in);
            Pick[] _ob_r = retrieve_picks_for_seismogram(_ob_a0);
            out = handler.createReply();
            PickSeqHelper.write(out, _ob_r);
        }
        catch(edu.iris.Fissures.FissuresException _ob_ex)
        {
            out = handler.createExceptionReply();
            edu.iris.Fissures.FissuresExceptionHelper.write(out, _ob_ex);
        }
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_retrieve_picks_for_site(org.omg.CORBA.portable.InputStream in,
                                   org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        try
        {
            edu.iris.Fissures.IfNetwork.SiteId _ob_a0 = SiteIdHelper.read(in);
            edu.iris.Fissures.TimeRange _ob_a1 = edu.iris.Fissures.TimeRangeHelper.read(in);
            Pick[] _ob_r = retrieve_picks_for_site(_ob_a0, _ob_a1);
            out = handler.createReply();
            PickSeqHelper.write(out, _ob_r);
        }
        catch(edu.iris.Fissures.FissuresException _ob_ex)
        {
            out = handler.createExceptionReply();
            edu.iris.Fissures.FissuresExceptionHelper.write(out, _ob_ex);
        }
        return out;
    }
}
