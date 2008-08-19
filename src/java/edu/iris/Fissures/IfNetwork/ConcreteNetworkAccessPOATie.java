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
// IDL:iris.edu/Fissures/IfNetwork/ConcreteNetworkAccess:1.0
//
public class ConcreteNetworkAccessPOATie extends ConcreteNetworkAccessPOA
{
    private ConcreteNetworkAccessOperations _ob_delegate_;
    private org.omg.PortableServer.POA _ob_poa_;

    public
    ConcreteNetworkAccessPOATie(ConcreteNetworkAccessOperations delegate)
    {
        _ob_delegate_ = delegate;
    }

    public
    ConcreteNetworkAccessPOATie(ConcreteNetworkAccessOperations delegate, org.omg.PortableServer.POA poa)
    {
        _ob_delegate_ = delegate;
        _ob_poa_ = poa;
    }

    public ConcreteNetworkAccessOperations
    _delegate()
    {
        return _ob_delegate_;
    }

    public void
    _delegate(ConcreteNetworkAccessOperations delegate)
    {
        _ob_delegate_ = delegate;
    }

    public org.omg.PortableServer.POA
    _default_POA()
    {
        if(_ob_poa_ != null)
            return _ob_poa_;
        else
            return super._default_POA();
    }

    //
    // IDL:iris.edu/Fissures/IfNetwork/ConcreteNetworkAccess/a_writeable:1.0
    //
    public ConcreteNetwork
    a_writeable()
    {
        return _ob_delegate_.a_writeable();
    }

    //
    // IDL:iris.edu/Fissures/IfNetwork/ConcreteNetworkAccess/get_audit_trail_for_station:1.0
    //
    public edu.iris.Fissures.AuditElement[]
    get_audit_trail_for_station(StationId id)
        throws StationNotFound,
               edu.iris.Fissures.NotImplemented
    {
        return _ob_delegate_.get_audit_trail_for_station(id);
    }

    //
    // IDL:iris.edu/Fissures/IfNetwork/ConcreteNetworkAccess/get_audit_trail_for_site:1.0
    //
    public edu.iris.Fissures.AuditElement[]
    get_audit_trail_for_site(SiteId id)
        throws SiteNotFound,
               edu.iris.Fissures.NotImplemented
    {
        return _ob_delegate_.get_audit_trail_for_site(id);
    }

    //
    // IDL:iris.edu/Fissures/IfNetwork/NetworkAccess/get_attributes:1.0
    //
    public NetworkAttr
    get_attributes()
    {
        return _ob_delegate_.get_attributes();
    }

    //
    // IDL:iris.edu/Fissures/IfNetwork/NetworkAccess/retrieve_stations:1.0
    //
    public Station[]
    retrieve_stations()
    {
        return _ob_delegate_.retrieve_stations();
    }

    //
    // IDL:iris.edu/Fissures/IfNetwork/NetworkAccess/retrieve_for_station:1.0
    //
    public Channel[]
    retrieve_for_station(StationId id)
    {
        return _ob_delegate_.retrieve_for_station(id);
    }

    //
    // IDL:iris.edu/Fissures/IfNetwork/NetworkAccess/retrieve_grouping:1.0
    //
    public ChannelId[]
    retrieve_grouping(ChannelId id)
        throws ChannelNotFound
    {
        return _ob_delegate_.retrieve_grouping(id);
    }

    //
    // IDL:iris.edu/Fissures/IfNetwork/NetworkAccess/retrieve_groupings:1.0
    //
    public ChannelId[][]
    retrieve_groupings()
    {
        return _ob_delegate_.retrieve_groupings();
    }

    //
    // IDL:iris.edu/Fissures/IfNetwork/NetworkAccess/retrieve_channel:1.0
    //
    public Channel
    retrieve_channel(ChannelId id)
        throws ChannelNotFound
    {
        return _ob_delegate_.retrieve_channel(id);
    }

    //
    // IDL:iris.edu/Fissures/IfNetwork/NetworkAccess/retrieve_channels_by_code:1.0
    //
    public Channel[]
    retrieve_channels_by_code(String station_code,
                              String site_code,
                              String channel_code)
        throws ChannelNotFound
    {
        return _ob_delegate_.retrieve_channels_by_code(station_code,
                                                       site_code,
                                                       channel_code);
    }

    //
    // IDL:iris.edu/Fissures/IfNetwork/NetworkAccess/locate_channels:1.0
    //
    public Channel[]
    locate_channels(edu.iris.Fissures.Area the_area,
                    SamplingRange sampling,
                    OrientationRange orientation)
    {
        return _ob_delegate_.locate_channels(the_area,
                                             sampling,
                                             orientation);
    }

    //
    // IDL:iris.edu/Fissures/IfNetwork/NetworkAccess/retrieve_instrumentation:1.0
    //
    public Instrumentation
    retrieve_instrumentation(ChannelId id,
                             edu.iris.Fissures.Time the_time)
        throws ChannelNotFound
    {
        return _ob_delegate_.retrieve_instrumentation(id,
                                                      the_time);
    }

    //
    // IDL:iris.edu/Fissures/IfNetwork/NetworkAccess/retrieve_calibrations:1.0
    //
    public Calibration[]
    retrieve_calibrations(ChannelId id,
                          edu.iris.Fissures.TimeRange the_time)
        throws ChannelNotFound,
               edu.iris.Fissures.NotImplemented
    {
        return _ob_delegate_.retrieve_calibrations(id,
                                                   the_time);
    }

    //
    // IDL:iris.edu/Fissures/IfNetwork/NetworkAccess/retrieve_time_corrections:1.0
    //
    public TimeCorrection[]
    retrieve_time_corrections(ChannelId id,
                              edu.iris.Fissures.TimeRange time_range)
        throws ChannelNotFound,
               edu.iris.Fissures.NotImplemented
    {
        return _ob_delegate_.retrieve_time_corrections(id,
                                                       time_range);
    }

    //
    // IDL:iris.edu/Fissures/IfNetwork/NetworkAccess/retrieve_all_channels:1.0
    //
    public ChannelId[]
    retrieve_all_channels(int seq_max,
                          ChannelIdIterHolder iter)
    {
        return _ob_delegate_.retrieve_all_channels(seq_max,
                                                   iter);
    }

    //
    // IDL:iris.edu/Fissures/IfNetwork/NetworkAccess/get_audit_trail_for_channel:1.0
    //
    public edu.iris.Fissures.AuditElement[]
    get_audit_trail_for_channel(ChannelId id)
        throws ChannelNotFound,
               edu.iris.Fissures.NotImplemented
    {
        return _ob_delegate_.get_audit_trail_for_channel(id);
    }

    //
    // IDL:iris.edu/Fissures/AuditSystemAccess/get_audit_trail:1.0
    //
    public edu.iris.Fissures.AuditElement[]
    get_audit_trail()
        throws edu.iris.Fissures.NotImplemented
    {
        return _ob_delegate_.get_audit_trail();
    }
}
