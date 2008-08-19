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
// IDL:iris.edu/Fissures/IfSeismogramMgr/ChannelMirrorAdmin:1.0
//
public abstract class ChannelMirrorAdminPOA
    extends org.omg.PortableServer.Servant
    implements org.omg.CORBA.portable.InvokeHandler,
               ChannelMirrorAdminOperations
{
    static final String[] _ob_ids_ =
    {
        "IDL:iris.edu/Fissures/IfSeismogramMgr/ChannelMirrorAdmin:1.0",
    };

    public ChannelMirrorAdmin
    _this()
    {
        return ChannelMirrorAdminHelper.narrow(super._this_object());
    }

    public ChannelMirrorAdmin
    _this(org.omg.CORBA.ORB orb)
    {
        return ChannelMirrorAdminHelper.narrow(super._this_object(orb));
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
            "active_seismogram_mirrors",
            "get_factory_mirrors",
            "get_mirrored_seismograms",
            "is_mirroring",
            "resume_mirroring",
            "stop_mirroring",
            "stop_mirrors"
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
        case 0: // active_seismogram_mirrors
            return _OB_op_active_seismogram_mirrors(in, handler);

        case 1: // get_factory_mirrors
            return _OB_op_get_factory_mirrors(in, handler);

        case 2: // get_mirrored_seismograms
            return _OB_op_get_mirrored_seismograms(in, handler);

        case 3: // is_mirroring
            return _OB_op_is_mirroring(in, handler);

        case 4: // resume_mirroring
            return _OB_op_resume_mirroring(in, handler);

        case 5: // stop_mirroring
            return _OB_op_stop_mirroring(in, handler);

        case 6: // stop_mirrors
            return _OB_op_stop_mirrors(in, handler);
        }

        throw new org.omg.CORBA.BAD_OPERATION();
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_active_seismogram_mirrors(org.omg.CORBA.portable.InputStream in,
                                     org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        int _ob_r = active_seismogram_mirrors();
        out = handler.createReply();
        out.write_long(_ob_r);
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_get_factory_mirrors(org.omg.CORBA.portable.InputStream in,
                               org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        SeismogramFactory[] _ob_r = get_factory_mirrors();
        out = handler.createReply();
        SeismogramFactorySeqHelper.write(out, _ob_r);
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_get_mirrored_seismograms(org.omg.CORBA.portable.InputStream in,
                                    org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        Seismogram[] _ob_r = get_mirrored_seismograms();
        out = handler.createReply();
        SeismogramSeqHelper.write(out, _ob_r);
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_is_mirroring(org.omg.CORBA.portable.InputStream in,
                        org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        boolean _ob_r = is_mirroring();
        out = handler.createReply();
        out.write_boolean(_ob_r);
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_resume_mirroring(org.omg.CORBA.portable.InputStream in,
                            org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        resume_mirroring();
        out = handler.createReply();
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_stop_mirroring(org.omg.CORBA.portable.InputStream in,
                          org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        stop_mirroring();
        out = handler.createReply();
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_stop_mirrors(org.omg.CORBA.portable.InputStream in,
                        org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        SeismogramFactory[] _ob_a0 = SeismogramFactorySeqHelper.read(in);
        stop_mirrors(_ob_a0);
        out = handler.createReply();
        return out;
    }
}
