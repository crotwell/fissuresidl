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
// IDL:iris.edu/Fissures/IfEvent/Origin:1.0
//
/**
 * Contains information contributed to an estimate of the origin
 *of an event.
 **/

public abstract class Origin implements org.omg.CORBA.portable.StreamableValue
{
    //
    // IDL:iris.edu/Fissures/IfEvent/Origin/id:1.0
    //
    /** An id for this origin. The format is unspecified, but it
     *should be unique within a given service. */

    protected String id;

    //
    // IDL:iris.edu/Fissures/IfEvent/Origin/catalog:1.0
    //
    /** The catalog to which this origin belongs, for example
     *FINGER, ISCCD, MHDF */

    protected String catalog;

    //
    // IDL:iris.edu/Fissures/IfEvent/Origin/contributor:1.0
    //
    /** The contributor of this origin, such as NEIC, ISC. */

    protected String contributor;

    //
    // IDL:iris.edu/Fissures/IfEvent/Origin/origin_time:1.0
    //
    /** The estimate of when the event happened. */

    protected edu.iris.Fissures.Time origin_time;

    //
    // IDL:iris.edu/Fissures/IfEvent/Origin/my_location:1.0
    //
    /** The estimate of where the event happened. */

    protected edu.iris.Fissures.Location my_location;

    //
    // IDL:iris.edu/Fissures/IfEvent/Origin/magnitudes:1.0
    //
    /** The magnitude estimates for this event, associated with this
     *origin. */

    protected Magnitude[] magnitudes;

    //
    // IDL:iris.edu/Fissures/IfEvent/Origin/parm_ids:1.0
    //
    /** Parameters assiciated with this Origin. */

    protected edu.iris.Fissures.IfParameterMgr.ParameterRef[] parm_ids;

    //
    // IDL:iris.edu/Fissures/IfEvent/Origin/get_id:1.0
    //
    /** @return the id of this origin. The id is intended to be
     *a read-only immutible attribute of an Origin.*/

    public abstract String
    get_id();

    private static String[] _OB_truncatableIds_ =
    {
        OriginHelper.id()
    };

    public String[]
    _truncatable_ids()
    {
        return _OB_truncatableIds_;
    }

    public void
    _read(org.omg.CORBA.portable.InputStream in)
    {
        id = OriginIdHelper.read(in);
        setCatalog(in.read_string());
        setContributor(in.read_string());
        setOriginTime(edu.iris.Fissures.TimeHelper.read(in));
        setLocation(edu.iris.Fissures.LocationHelper.read(in));
        setMagnitudes(MagnitudeSeqHelper.read(in));
        int len0 = in.read_ulong();
        setParmIds(new edu.iris.Fissures.IfParameterMgr.ParameterRef[len0]);
        for(int i0 = 0 ; i0 < len0 ; i0++)
            getParmIds()[i0] = ParameterRefHelper.read(in);
    }

    public void
    _write(org.omg.CORBA.portable.OutputStream out)
    {
        OriginIdHelper.write(out, id);
        out.write_string(getCatalog());
        out.write_string(getContributor());
        edu.iris.Fissures.TimeHelper.write(out, getOriginTime());
        edu.iris.Fissures.LocationHelper.write(out, getLocation());
        MagnitudeSeqHelper.write(out, getMagnitudes());
        int len0 = getParmIds().length;
        out.write_ulong(len0);
        for(int i0 = 0 ; i0 < len0 ; i0++)
            ParameterRefHelper.write(out, getParmIds()[i0]);
    }

    public org.omg.CORBA.TypeCode
    _type()
    {
        return OriginHelper.type();
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    public String getCatalog() {
        return catalog;
    }

    public void setContributor(String contributor) {
        this.contributor = contributor;
    }

    public String getContributor() {
        return contributor;
    }

    public void setOriginTime(edu.iris.Fissures.Time origin_time) {
        this.origin_time = origin_time;
    }

    public edu.iris.Fissures.Time getOriginTime() {
        return origin_time;
    }

    public void setLocation(edu.iris.Fissures.Location my_location) {
        this.my_location = my_location;
    }

    public edu.iris.Fissures.Location getLocation() {
        return my_location;
    }

    public void setMagnitudes(Magnitude[] magnitudes) {
        this.magnitudes = magnitudes;
    }

    public Magnitude[] getMagnitudes() {
        return magnitudes;
    }

    public void setParmIds(edu.iris.Fissures.IfParameterMgr.ParameterRef[] parm_ids) {
        this.parm_ids = parm_ids;
    }

    public edu.iris.Fissures.IfParameterMgr.ParameterRef[] getParmIds() {
        return parm_ids;
    }
}
