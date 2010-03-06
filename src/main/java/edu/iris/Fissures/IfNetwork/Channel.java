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

import edu.iris.Fissures.Orientation;
import edu.iris.Fissures.Sampling;
import edu.iris.Fissures.Time;
import edu.iris.Fissures.TimeRange;

//
// IDL:iris.edu/Fissures/IfNetwork/Channel:1.0
//
/** Represents a seismic recording channel, following the SEED convention.
 **/

public abstract class Channel implements org.omg.CORBA.portable.StreamableValue
{
    //
    // IDL:iris.edu/Fissures/IfNetwork/Channel/id:1.0
    //
    /** Uniquely identifies this channel. Note that channel codes can be 
     *  reused within a site, and hence a time is attached to the channel
     *  to uniquely identify it. */

    protected ChannelId id;

    //
    // IDL:iris.edu/Fissures/IfNetwork/Channel/name:1.0
    //
    /** A name for this channel. The form is not specified, but it should be
     *  usable as a display for a person. If no name is needed, then a zero
     *length string should be used.*/

    private String name;

    //
    // IDL:iris.edu/Fissures/IfNetwork/Channel/an_orientation:1.0
    //
    /** The orientation of the recording instrument for this channel. This
     *should follow the SEED conventions. */

    private edu.iris.Fissures.Orientation an_orientation;

    //
    // IDL:iris.edu/Fissures/IfNetwork/Channel/sampling_info:1.0
    //
    /** The nominal sampling rate for this channel. This is the sampling rate
     *  that the channel is intended to record at, but due to instrument
     *  problems, clock errors and timing errors, the actual sampling rate
     *  at any particular time may differ from this value. */

    private edu.iris.Fissures.Sampling sampling_info;

    //
    // IDL:iris.edu/Fissures/IfNetwork/Channel/effective_time:1.0
    //
    /** The effective time of the channel. The begin should be at or before
     *  the first data is recorded on this channel. Note that it is illegal
     *  have more than one channel within a site with the same code with
     *  overlaping effective times. */

    private edu.iris.Fissures.TimeRange effective_time;

    //
    // IDL:iris.edu/Fissures/IfNetwork/Channel/my_site:1.0
    //
    /** The site that this channel belongs to.*/

    private Site my_site;

    //
    // IDL:iris.edu/Fissures/IfNetwork/Channel/get_id:1.0
    //
    /** Access the private id attribute. */

    public abstract ChannelId
    get_id();

    //
    // IDL:iris.edu/Fissures/IfNetwork/Channel/get_code:1.0
    //
    /** Access the channnel code. This is equivalent to get_id().channel_code
     **/

    public abstract String
    get_code();

    private static String[] _OB_truncatableIds_ =
    {
        ChannelHelper.id()
    };

    public String[]
    _truncatable_ids()
    {
        return _OB_truncatableIds_;
    }

    public void
    _read(org.omg.CORBA.portable.InputStream in)
    {
        id = ChannelIdHelper.read(in);
        setName(in.read_string());
        setOrientation(edu.iris.Fissures.OrientationHelper.read(in));
        setSamplingInfo(edu.iris.Fissures.SamplingHelper.read(in));
        setEffectiveTime(edu.iris.Fissures.TimeRangeHelper.read(in));
        setSite(SiteHelper.read(in));
    }

    public void
    _write(org.omg.CORBA.portable.OutputStream out)
    {
        ChannelIdHelper.write(out, id);
        out.write_string(getName());
        edu.iris.Fissures.OrientationHelper.write(out, getOrientation());
        edu.iris.Fissures.SamplingHelper.write(out, getSamplingInfo());
        edu.iris.Fissures.TimeRangeHelper.write(out, getEffectiveTime());
        SiteHelper.write(out, getSite());
    }

    public org.omg.CORBA.TypeCode
    _type()
    {
        return ChannelHelper.type();
    }
    
    // added manually
    
    public String getName() {return name;}

    public Orientation getOrientation() {return an_orientation;}

    public Sampling getSamplingInfo() {return sampling_info;}

    public TimeRange getEffectiveTime() { return effective_time; }

    public Site getSite() {return my_site; }

    public Station getStation() {
        return getSite().getStation();
    }
    
    public NetworkAttr getNetworkAttr() {
        return getStation().getNetworkAttr();
    }
    
    public static Channel intern(Channel channel) {
        intern(channel.get_id());
        channel.setSite(Site.intern(channel.getSite()));
        NetworkAttr.intern(channel.getEffectiveTime());
        channel.setName(NetworkAttr.intern(channel.getName()));
        return channel;
    }

    private static void intern(ChannelId id) {
        id.channel_code = NetworkAttr.intern(id.channel_code);
        id.network_id = NetworkAttr.intern(id.network_id);
        id.station_code = NetworkAttr.intern(id.station_code);
        id.site_code = NetworkAttr.intern(id.site_code);
        id.begin_time = NetworkAttr.intern(id.begin_time);
    }

    public Time getBeginTime() {
        return get_id().begin_time;
    }
    
    public void setBeginTime(Time beginTime) {
        if (getEffectiveTime() == null) {
            setEffectiveTime(new TimeRange());
        }
        this.getEffectiveTime().start_time = beginTime;
        if (id != null) {
            id.begin_time = beginTime;
        }
    }
    
    public Time getEndTime() {
        return getEffectiveTime().end_time;
    }
    
    public void setEndTime(Time endTime) {
        if (getEffectiveTime() == null) {
            setEffectiveTime(new TimeRange());
            this.getEffectiveTime().start_time = id.begin_time;
        }
        this.getEffectiveTime().end_time = endTime;
    }
    
    public void setSite(Site site) {
        this.my_site = site;
    }
// hibernate
    public ChannelId getId() {
        if (id.network_id == null) {
            // lazy loading by hibernate
            id.network_id = getSite().getStation().getNetworkAttr().getId();
        }
        return id;
    }
    protected void setId(ChannelId id) {
        if (this.id != null) {
            if (id.network_id == null) {
                id.network_id = this.id.network_id;
            }
        }
        this.id = id;
        if (id.begin_time == null && getEffectiveTime() != null) {
            id.begin_time = getEffectiveTime().start_time;
        }
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setOrientation(Orientation orientation) {
        this.an_orientation = orientation;
    }
    public void setSamplingInfo(Sampling sampling_info) {
        this.sampling_info = sampling_info;
    }
    public void setEffectiveTime(TimeRange eff) {
        this.effective_time = eff;
    }
}
