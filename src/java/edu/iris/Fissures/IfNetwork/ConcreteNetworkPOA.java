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
// IDL:iris.edu/Fissures/IfNetwork/ConcreteNetwork:1.0
//
public abstract class ConcreteNetworkPOA
    extends org.omg.PortableServer.Servant
    implements org.omg.CORBA.portable.InvokeHandler,
               ConcreteNetworkOperations
{
    static final String[] _ob_ids_ =
    {
        "IDL:iris.edu/Fissures/IfNetwork/ConcreteNetwork:1.0",
        "IDL:iris.edu/Fissures/IfNetwork/Network:1.0",
        "IDL:iris.edu/Fissures/IfNetwork/ConcreteNetworkAccess:1.0",
        "IDL:iris.edu/Fissures/IfNetwork/NetworkAccess:1.0",
        "IDL:iris.edu/Fissures/AuditSystemAccess:1.0"
    };

    public ConcreteNetwork
    _this()
    {
        return ConcreteNetworkHelper.narrow(super._this_object());
    }

    public ConcreteNetwork
    _this(org.omg.CORBA.ORB orb)
    {
        return ConcreteNetworkHelper.narrow(super._this_object(orb));
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
            "add_calibration",
            "add_channel",
            "add_site",
            "add_station",
            "add_time_correction",
            "deactivate",
            "deactivate_channel",
            "deactivate_site",
            "deactivate_station",
            "delete_channel",
            "delete_site",
            "delete_station",
            "get_attributes",
            "get_audit_trail",
            "get_audit_trail_for_channel",
            "get_audit_trail_for_site",
            "get_audit_trail_for_station",
            "locate_channels",
            "retrieve_all_channels",
            "retrieve_calibrations",
            "retrieve_channel",
            "retrieve_channels_by_code",
            "retrieve_for_station",
            "retrieve_grouping",
            "retrieve_groupings",
            "retrieve_instrumentation",
            "retrieve_stations",
            "retrieve_time_corrections",
            "udpate_site",
            "update_channel",
            "update_clock",
            "update_das",
            "update_response",
            "update_sensor",
            "update_station"
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

        case 1: // add_calibration
            return _OB_op_add_calibration(in, handler);

        case 2: // add_channel
            return _OB_op_add_channel(in, handler);

        case 3: // add_site
            return _OB_op_add_site(in, handler);

        case 4: // add_station
            return _OB_op_add_station(in, handler);

        case 5: // add_time_correction
            return _OB_op_add_time_correction(in, handler);

        case 6: // deactivate
            return _OB_op_deactivate(in, handler);

        case 7: // deactivate_channel
            return _OB_op_deactivate_channel(in, handler);

        case 8: // deactivate_site
            return _OB_op_deactivate_site(in, handler);

        case 9: // deactivate_station
            return _OB_op_deactivate_station(in, handler);

        case 10: // delete_channel
            return _OB_op_delete_channel(in, handler);

        case 11: // delete_site
            return _OB_op_delete_site(in, handler);

        case 12: // delete_station
            return _OB_op_delete_station(in, handler);

        case 13: // get_attributes
            return _OB_op_get_attributes(in, handler);

        case 14: // get_audit_trail
            return _OB_op_get_audit_trail(in, handler);

        case 15: // get_audit_trail_for_channel
            return _OB_op_get_audit_trail_for_channel(in, handler);

        case 16: // get_audit_trail_for_site
            return _OB_op_get_audit_trail_for_site(in, handler);

        case 17: // get_audit_trail_for_station
            return _OB_op_get_audit_trail_for_station(in, handler);

        case 18: // locate_channels
            return _OB_op_locate_channels(in, handler);

        case 19: // retrieve_all_channels
            return _OB_op_retrieve_all_channels(in, handler);

        case 20: // retrieve_calibrations
            return _OB_op_retrieve_calibrations(in, handler);

        case 21: // retrieve_channel
            return _OB_op_retrieve_channel(in, handler);

        case 22: // retrieve_channels_by_code
            return _OB_op_retrieve_channels_by_code(in, handler);

        case 23: // retrieve_for_station
            return _OB_op_retrieve_for_station(in, handler);

        case 24: // retrieve_grouping
            return _OB_op_retrieve_grouping(in, handler);

        case 25: // retrieve_groupings
            return _OB_op_retrieve_groupings(in, handler);

        case 26: // retrieve_instrumentation
            return _OB_op_retrieve_instrumentation(in, handler);

        case 27: // retrieve_stations
            return _OB_op_retrieve_stations(in, handler);

        case 28: // retrieve_time_corrections
            return _OB_op_retrieve_time_corrections(in, handler);

        case 29: // udpate_site
            return _OB_op_udpate_site(in, handler);

        case 30: // update_channel
            return _OB_op_update_channel(in, handler);

        case 31: // update_clock
            return _OB_op_update_clock(in, handler);

        case 32: // update_das
            return _OB_op_update_das(in, handler);

        case 33: // update_response
            return _OB_op_update_response(in, handler);

        case 34: // update_sensor
            return _OB_op_update_sensor(in, handler);

        case 35: // update_station
            return _OB_op_update_station(in, handler);
        }

        throw new org.omg.CORBA.BAD_OPERATION();
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_att_get_a_writeable(org.omg.CORBA.portable.InputStream in,
                            org.omg.CORBA.portable.ResponseHandler handler)
    {
        ConcreteNetwork _ob_r = a_writeable();
        org.omg.CORBA.portable.OutputStream out = handler.createReply();
        ConcreteNetworkHelper.write(out, _ob_r);
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_add_calibration(org.omg.CORBA.portable.InputStream in,
                           org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        try
        {
            ChannelId _ob_a0 = ChannelIdHelper.read(in);
            Calibration _ob_a1 = CalibrationHelper.read(in);
            edu.iris.Fissures.Time _ob_a2 = edu.iris.Fissures.TimeHelper.read(in);
            edu.iris.Fissures.AuditInfo[] _ob_a3 = edu.iris.Fissures.AuditInfoOptHelper.read(in);
            add_calibration(_ob_a0, _ob_a1, _ob_a2, _ob_a3);
            out = handler.createReply();
        }
        catch(ChannelNotFound _ob_ex)
        {
            out = handler.createExceptionReply();
            ChannelNotFoundHelper.write(out, _ob_ex);
        }
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_add_channel(org.omg.CORBA.portable.InputStream in,
                       org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        try
        {
            Channel _ob_a0 = ChannelHelper.read(in);
            Response _ob_a1 = ResponseHelper.read(in);
            Calibration[] _ob_a2 = CalibrationSeqHelper.read(in);
            Clock _ob_a3 = ClockHelper.read(in);
            Sensor _ob_a4 = SensorHelper.read(in);
            DataAcqSys _ob_a5 = DataAcqSysHelper.read(in);
            TimeCorrection[] _ob_a6 = TimeCorrectionSeqHelper.read(in);
            edu.iris.Fissures.AuditInfo[] _ob_a7 = edu.iris.Fissures.AuditInfoOptHelper.read(in);
            add_channel(_ob_a0, _ob_a1, _ob_a2, _ob_a3, _ob_a4, _ob_a5, _ob_a6, _ob_a7);
            out = handler.createReply();
        }
        catch(SiteNotFound _ob_ex)
        {
            out = handler.createExceptionReply();
            SiteNotFoundHelper.write(out, _ob_ex);
        }
        catch(DuplicateChannelId _ob_ex)
        {
            out = handler.createExceptionReply();
            DuplicateChannelIdHelper.write(out, _ob_ex);
        }
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_add_site(org.omg.CORBA.portable.InputStream in,
                    org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        try
        {
            Site _ob_a0 = SiteHelper.read(in);
            edu.iris.Fissures.AuditInfo[] _ob_a1 = edu.iris.Fissures.AuditInfoOptHelper.read(in);
            add_site(_ob_a0, _ob_a1);
            out = handler.createReply();
        }
        catch(StationNotFound _ob_ex)
        {
            out = handler.createExceptionReply();
            StationNotFoundHelper.write(out, _ob_ex);
        }
        catch(DuplicateSiteId _ob_ex)
        {
            out = handler.createExceptionReply();
            DuplicateSiteIdHelper.write(out, _ob_ex);
        }
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_add_station(org.omg.CORBA.portable.InputStream in,
                       org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        try
        {
            Station _ob_a0 = StationHelper.read(in);
            edu.iris.Fissures.AuditInfo[] _ob_a1 = edu.iris.Fissures.AuditInfoOptHelper.read(in);
            add_station(_ob_a0, _ob_a1);
            out = handler.createReply();
        }
        catch(DuplicateStationId _ob_ex)
        {
            out = handler.createExceptionReply();
            DuplicateStationIdHelper.write(out, _ob_ex);
        }
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_add_time_correction(org.omg.CORBA.portable.InputStream in,
                               org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        try
        {
            ChannelId _ob_a0 = ChannelIdHelper.read(in);
            TimeCorrection _ob_a1 = TimeCorrectionHelper.read(in);
            edu.iris.Fissures.Time _ob_a2 = edu.iris.Fissures.TimeHelper.read(in);
            edu.iris.Fissures.AuditInfo[] _ob_a3 = edu.iris.Fissures.AuditInfoOptHelper.read(in);
            add_time_correction(_ob_a0, _ob_a1, _ob_a2, _ob_a3);
            out = handler.createReply();
        }
        catch(ChannelNotFound _ob_ex)
        {
            out = handler.createExceptionReply();
            ChannelNotFoundHelper.write(out, _ob_ex);
        }
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_deactivate(org.omg.CORBA.portable.InputStream in,
                      org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        deactivate();
        out = handler.createReply();
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_deactivate_channel(org.omg.CORBA.portable.InputStream in,
                              org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        try
        {
            ChannelId _ob_a0 = ChannelIdHelper.read(in);
            edu.iris.Fissures.AuditInfo[] _ob_a1 = edu.iris.Fissures.AuditInfoOptHelper.read(in);
            deactivate_channel(_ob_a0, _ob_a1);
            out = handler.createReply();
        }
        catch(ChannelNotFound _ob_ex)
        {
            out = handler.createExceptionReply();
            ChannelNotFoundHelper.write(out, _ob_ex);
        }
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_deactivate_site(org.omg.CORBA.portable.InputStream in,
                           org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        try
        {
            SiteId _ob_a0 = SiteIdHelper.read(in);
            edu.iris.Fissures.Time _ob_a1 = edu.iris.Fissures.TimeHelper.read(in);
            edu.iris.Fissures.AuditInfo[] _ob_a2 = edu.iris.Fissures.AuditInfoOptHelper.read(in);
            deactivate_site(_ob_a0, _ob_a1, _ob_a2);
            out = handler.createReply();
        }
        catch(SiteNotFound _ob_ex)
        {
            out = handler.createExceptionReply();
            SiteNotFoundHelper.write(out, _ob_ex);
        }
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_deactivate_station(org.omg.CORBA.portable.InputStream in,
                              org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        try
        {
            StationId _ob_a0 = StationIdHelper.read(in);
            edu.iris.Fissures.Time _ob_a1 = edu.iris.Fissures.TimeHelper.read(in);
            edu.iris.Fissures.AuditInfo[] _ob_a2 = edu.iris.Fissures.AuditInfoOptHelper.read(in);
            deactivate_station(_ob_a0, _ob_a1, _ob_a2);
            out = handler.createReply();
        }
        catch(StationNotFound _ob_ex)
        {
            out = handler.createExceptionReply();
            StationNotFoundHelper.write(out, _ob_ex);
        }
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_delete_channel(org.omg.CORBA.portable.InputStream in,
                          org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        try
        {
            ChannelId _ob_a0 = ChannelIdHelper.read(in);
            edu.iris.Fissures.AuditInfo[] _ob_a1 = edu.iris.Fissures.AuditInfoOptHelper.read(in);
            delete_channel(_ob_a0, _ob_a1);
            out = handler.createReply();
        }
        catch(ChannelNotFound _ob_ex)
        {
            out = handler.createExceptionReply();
            ChannelNotFoundHelper.write(out, _ob_ex);
        }
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_delete_site(org.omg.CORBA.portable.InputStream in,
                       org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        try
        {
            SiteId _ob_a0 = SiteIdHelper.read(in);
            edu.iris.Fissures.AuditInfo[] _ob_a1 = edu.iris.Fissures.AuditInfoOptHelper.read(in);
            delete_site(_ob_a0, _ob_a1);
            out = handler.createReply();
        }
        catch(SiteNotFound _ob_ex)
        {
            out = handler.createExceptionReply();
            SiteNotFoundHelper.write(out, _ob_ex);
        }
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_delete_station(org.omg.CORBA.portable.InputStream in,
                          org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        try
        {
            StationId _ob_a0 = StationIdHelper.read(in);
            edu.iris.Fissures.AuditInfo[] _ob_a1 = edu.iris.Fissures.AuditInfoOptHelper.read(in);
            delete_station(_ob_a0, _ob_a1);
            out = handler.createReply();
        }
        catch(StationNotFound _ob_ex)
        {
            out = handler.createExceptionReply();
            StationNotFoundHelper.write(out, _ob_ex);
        }
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_get_attributes(org.omg.CORBA.portable.InputStream in,
                          org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        NetworkAttr _ob_r = get_attributes();
        out = handler.createReply();
        NetworkAttrHelper.write(out, _ob_r);
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_get_audit_trail(org.omg.CORBA.portable.InputStream in,
                           org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        try
        {
            edu.iris.Fissures.AuditElement[] _ob_r = get_audit_trail();
            out = handler.createReply();
            edu.iris.Fissures.AuditTrailHelper.write(out, _ob_r);
        }
        catch(edu.iris.Fissures.NotImplemented _ob_ex)
        {
            out = handler.createExceptionReply();
            edu.iris.Fissures.NotImplementedHelper.write(out, _ob_ex);
        }
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_get_audit_trail_for_channel(org.omg.CORBA.portable.InputStream in,
                                       org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        try
        {
            ChannelId _ob_a0 = ChannelIdHelper.read(in);
            edu.iris.Fissures.AuditElement[] _ob_r = get_audit_trail_for_channel(_ob_a0);
            out = handler.createReply();
            edu.iris.Fissures.AuditTrailHelper.write(out, _ob_r);
        }
        catch(ChannelNotFound _ob_ex)
        {
            out = handler.createExceptionReply();
            ChannelNotFoundHelper.write(out, _ob_ex);
        }
        catch(edu.iris.Fissures.NotImplemented _ob_ex)
        {
            out = handler.createExceptionReply();
            edu.iris.Fissures.NotImplementedHelper.write(out, _ob_ex);
        }
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_get_audit_trail_for_site(org.omg.CORBA.portable.InputStream in,
                                    org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        try
        {
            SiteId _ob_a0 = SiteIdHelper.read(in);
            edu.iris.Fissures.AuditElement[] _ob_r = get_audit_trail_for_site(_ob_a0);
            out = handler.createReply();
            edu.iris.Fissures.AuditTrailHelper.write(out, _ob_r);
        }
        catch(SiteNotFound _ob_ex)
        {
            out = handler.createExceptionReply();
            SiteNotFoundHelper.write(out, _ob_ex);
        }
        catch(edu.iris.Fissures.NotImplemented _ob_ex)
        {
            out = handler.createExceptionReply();
            edu.iris.Fissures.NotImplementedHelper.write(out, _ob_ex);
        }
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_get_audit_trail_for_station(org.omg.CORBA.portable.InputStream in,
                                       org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        try
        {
            StationId _ob_a0 = StationIdHelper.read(in);
            edu.iris.Fissures.AuditElement[] _ob_r = get_audit_trail_for_station(_ob_a0);
            out = handler.createReply();
            edu.iris.Fissures.AuditTrailHelper.write(out, _ob_r);
        }
        catch(StationNotFound _ob_ex)
        {
            out = handler.createExceptionReply();
            StationNotFoundHelper.write(out, _ob_ex);
        }
        catch(edu.iris.Fissures.NotImplemented _ob_ex)
        {
            out = handler.createExceptionReply();
            edu.iris.Fissures.NotImplementedHelper.write(out, _ob_ex);
        }
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_locate_channels(org.omg.CORBA.portable.InputStream in,
                           org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        edu.iris.Fissures.Area _ob_a0 = edu.iris.Fissures.AreaHelper.read(in);
        SamplingRange _ob_a1 = SamplingRangeHelper.read(in);
        OrientationRange _ob_a2 = OrientationRangeHelper.read(in);
        Channel[] _ob_r = locate_channels(_ob_a0, _ob_a1, _ob_a2);
        out = handler.createReply();
        ChannelSeqHelper.write(out, _ob_r);
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_retrieve_all_channels(org.omg.CORBA.portable.InputStream in,
                                 org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        int _ob_a0 = in.read_long();
        ChannelIdIterHolder _ob_ah1 = new ChannelIdIterHolder();
        ChannelId[] _ob_r = retrieve_all_channels(_ob_a0, _ob_ah1);
        out = handler.createReply();
        ChannelIdSeqHelper.write(out, _ob_r);
        ChannelIdIterHelper.write(out, _ob_ah1.value);
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_retrieve_calibrations(org.omg.CORBA.portable.InputStream in,
                                 org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        try
        {
            ChannelId _ob_a0 = ChannelIdHelper.read(in);
            edu.iris.Fissures.TimeRange _ob_a1 = edu.iris.Fissures.TimeRangeHelper.read(in);
            Calibration[] _ob_r = retrieve_calibrations(_ob_a0, _ob_a1);
            out = handler.createReply();
            CalibrationSeqHelper.write(out, _ob_r);
        }
        catch(ChannelNotFound _ob_ex)
        {
            out = handler.createExceptionReply();
            ChannelNotFoundHelper.write(out, _ob_ex);
        }
        catch(edu.iris.Fissures.NotImplemented _ob_ex)
        {
            out = handler.createExceptionReply();
            edu.iris.Fissures.NotImplementedHelper.write(out, _ob_ex);
        }
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_retrieve_channel(org.omg.CORBA.portable.InputStream in,
                            org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        try
        {
            ChannelId _ob_a0 = ChannelIdHelper.read(in);
            Channel _ob_r = retrieve_channel(_ob_a0);
            out = handler.createReply();
            ChannelHelper.write(out, _ob_r);
        }
        catch(ChannelNotFound _ob_ex)
        {
            out = handler.createExceptionReply();
            ChannelNotFoundHelper.write(out, _ob_ex);
        }
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_retrieve_channels_by_code(org.omg.CORBA.portable.InputStream in,
                                     org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        try
        {
            String _ob_a0 = StationCodeHelper.read(in);
            String _ob_a1 = SiteCodeHelper.read(in);
            String _ob_a2 = ChannelCodeHelper.read(in);
            Channel[] _ob_r = retrieve_channels_by_code(_ob_a0, _ob_a1, _ob_a2);
            out = handler.createReply();
            ChannelSeqHelper.write(out, _ob_r);
        }
        catch(ChannelNotFound _ob_ex)
        {
            out = handler.createExceptionReply();
            ChannelNotFoundHelper.write(out, _ob_ex);
        }
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_retrieve_for_station(org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        StationId _ob_a0 = StationIdHelper.read(in);
        Channel[] _ob_r = retrieve_for_station(_ob_a0);
        out = handler.createReply();
        ChannelSeqHelper.write(out, _ob_r);
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_retrieve_grouping(org.omg.CORBA.portable.InputStream in,
                             org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        try
        {
            ChannelId _ob_a0 = ChannelIdHelper.read(in);
            ChannelId[] _ob_r = retrieve_grouping(_ob_a0);
            out = handler.createReply();
            ChannelGroupHelper.write(out, _ob_r);
        }
        catch(ChannelNotFound _ob_ex)
        {
            out = handler.createExceptionReply();
            ChannelNotFoundHelper.write(out, _ob_ex);
        }
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_retrieve_groupings(org.omg.CORBA.portable.InputStream in,
                              org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        ChannelId[][] _ob_r = retrieve_groupings();
        out = handler.createReply();
        ChannelGroupSeqHelper.write(out, _ob_r);
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_retrieve_instrumentation(org.omg.CORBA.portable.InputStream in,
                                    org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        try
        {
            ChannelId _ob_a0 = ChannelIdHelper.read(in);
            edu.iris.Fissures.Time _ob_a1 = edu.iris.Fissures.TimeHelper.read(in);
            Instrumentation _ob_r = retrieve_instrumentation(_ob_a0, _ob_a1);
            out = handler.createReply();
            InstrumentationHelper.write(out, _ob_r);
        }
        catch(ChannelNotFound _ob_ex)
        {
            out = handler.createExceptionReply();
            ChannelNotFoundHelper.write(out, _ob_ex);
        }
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_retrieve_stations(org.omg.CORBA.portable.InputStream in,
                             org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        Station[] _ob_r = retrieve_stations();
        out = handler.createReply();
        StationSeqHelper.write(out, _ob_r);
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_retrieve_time_corrections(org.omg.CORBA.portable.InputStream in,
                                     org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        try
        {
            ChannelId _ob_a0 = ChannelIdHelper.read(in);
            edu.iris.Fissures.TimeRange _ob_a1 = edu.iris.Fissures.TimeRangeHelper.read(in);
            TimeCorrection[] _ob_r = retrieve_time_corrections(_ob_a0, _ob_a1);
            out = handler.createReply();
            TimeCorrectionSeqHelper.write(out, _ob_r);
        }
        catch(ChannelNotFound _ob_ex)
        {
            out = handler.createExceptionReply();
            ChannelNotFoundHelper.write(out, _ob_ex);
        }
        catch(edu.iris.Fissures.NotImplemented _ob_ex)
        {
            out = handler.createExceptionReply();
            edu.iris.Fissures.NotImplementedHelper.write(out, _ob_ex);
        }
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_udpate_site(org.omg.CORBA.portable.InputStream in,
                       org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        try
        {
            Site _ob_a0 = SiteHelper.read(in);
            edu.iris.Fissures.AuditInfo[] _ob_a1 = edu.iris.Fissures.AuditInfoOptHelper.read(in);
            udpate_site(_ob_a0, _ob_a1);
            out = handler.createReply();
        }
        catch(SiteNotFound _ob_ex)
        {
            out = handler.createExceptionReply();
            SiteNotFoundHelper.write(out, _ob_ex);
        }
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_update_channel(org.omg.CORBA.portable.InputStream in,
                          org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        try
        {
            Channel _ob_a0 = ChannelHelper.read(in);
            edu.iris.Fissures.AuditInfo[] _ob_a1 = edu.iris.Fissures.AuditInfoOptHelper.read(in);
            update_channel(_ob_a0, _ob_a1);
            out = handler.createReply();
        }
        catch(ChannelNotFound _ob_ex)
        {
            out = handler.createExceptionReply();
            ChannelNotFoundHelper.write(out, _ob_ex);
        }
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_update_clock(org.omg.CORBA.portable.InputStream in,
                        org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        try
        {
            ChannelId _ob_a0 = ChannelIdHelper.read(in);
            Clock _ob_a1 = ClockHelper.read(in);
            edu.iris.Fissures.Time _ob_a2 = edu.iris.Fissures.TimeHelper.read(in);
            edu.iris.Fissures.AuditInfo[] _ob_a3 = edu.iris.Fissures.AuditInfoOptHelper.read(in);
            update_clock(_ob_a0, _ob_a1, _ob_a2, _ob_a3);
            out = handler.createReply();
        }
        catch(ChannelNotFound _ob_ex)
        {
            out = handler.createExceptionReply();
            ChannelNotFoundHelper.write(out, _ob_ex);
        }
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_update_das(org.omg.CORBA.portable.InputStream in,
                      org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        try
        {
            ChannelId _ob_a0 = ChannelIdHelper.read(in);
            DataAcqSys _ob_a1 = DataAcqSysHelper.read(in);
            edu.iris.Fissures.Time _ob_a2 = edu.iris.Fissures.TimeHelper.read(in);
            edu.iris.Fissures.AuditInfo[] _ob_a3 = edu.iris.Fissures.AuditInfoOptHelper.read(in);
            update_das(_ob_a0, _ob_a1, _ob_a2, _ob_a3);
            out = handler.createReply();
        }
        catch(ChannelNotFound _ob_ex)
        {
            out = handler.createExceptionReply();
            ChannelNotFoundHelper.write(out, _ob_ex);
        }
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_update_response(org.omg.CORBA.portable.InputStream in,
                           org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        try
        {
            ChannelId _ob_a0 = ChannelIdHelper.read(in);
            Response _ob_a1 = ResponseHelper.read(in);
            edu.iris.Fissures.Time _ob_a2 = edu.iris.Fissures.TimeHelper.read(in);
            edu.iris.Fissures.AuditInfo[] _ob_a3 = edu.iris.Fissures.AuditInfoOptHelper.read(in);
            update_response(_ob_a0, _ob_a1, _ob_a2, _ob_a3);
            out = handler.createReply();
        }
        catch(ChannelNotFound _ob_ex)
        {
            out = handler.createExceptionReply();
            ChannelNotFoundHelper.write(out, _ob_ex);
        }
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_update_sensor(org.omg.CORBA.portable.InputStream in,
                         org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        try
        {
            ChannelId _ob_a0 = ChannelIdHelper.read(in);
            Sensor _ob_a1 = SensorHelper.read(in);
            edu.iris.Fissures.Time _ob_a2 = edu.iris.Fissures.TimeHelper.read(in);
            edu.iris.Fissures.AuditInfo[] _ob_a3 = edu.iris.Fissures.AuditInfoOptHelper.read(in);
            update_sensor(_ob_a0, _ob_a1, _ob_a2, _ob_a3);
            out = handler.createReply();
        }
        catch(ChannelNotFound _ob_ex)
        {
            out = handler.createExceptionReply();
            ChannelNotFoundHelper.write(out, _ob_ex);
        }
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_update_station(org.omg.CORBA.portable.InputStream in,
                          org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        try
        {
            Station _ob_a0 = StationHelper.read(in);
            edu.iris.Fissures.AuditInfo[] _ob_a1 = edu.iris.Fissures.AuditInfoOptHelper.read(in);
            update_station(_ob_a0, _ob_a1);
            out = handler.createReply();
        }
        catch(StationNotFound _ob_ex)
        {
            out = handler.createExceptionReply();
            StationNotFoundHelper.write(out, _ob_ex);
        }
        return out;
    }
}
