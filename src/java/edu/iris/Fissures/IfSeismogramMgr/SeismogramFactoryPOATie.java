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
// IDL:iris.edu/Fissures/IfSeismogramMgr/SeismogramFactory:1.0
//
public class SeismogramFactoryPOATie extends SeismogramFactoryPOA
{
    private SeismogramFactoryOperations _ob_delegate_;
    private org.omg.PortableServer.POA _ob_poa_;

    public
    SeismogramFactoryPOATie(SeismogramFactoryOperations delegate)
    {
        _ob_delegate_ = delegate;
    }

    public
    SeismogramFactoryPOATie(SeismogramFactoryOperations delegate, org.omg.PortableServer.POA poa)
    {
        _ob_delegate_ = delegate;
        _ob_poa_ = poa;
    }

    public SeismogramFactoryOperations
    _delegate()
    {
        return _ob_delegate_;
    }

    public void
    _delegate(SeismogramFactoryOperations delegate)
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
    // IDL:iris.edu/Fissures/IfSeismogramMgr/SeismogramFactory/active_seismogram_count:1.0
    //
    public int
    active_seismogram_count()
    {
        return _ob_delegate_.active_seismogram_count();
    }

    //
    // IDL:iris.edu/Fissures/IfSeismogramMgr/SeismogramFactory/create:1.0
    //
    public Seismogram
    create(edu.iris.Fissures.IfSeismogramDC.SeismogramAttr the_attributes,
           edu.iris.Fissures.AuditInfo[] audit_info)
        throws edu.iris.Fissures.FissuresException
    {
        return _ob_delegate_.create(the_attributes,
                                    audit_info);
    }

    //
    // IDL:iris.edu/Fissures/IfSeismogramMgr/SeismogramFactory/create_from_value:1.0
    //
    public Seismogram
    create_from_value(edu.iris.Fissures.IfSeismogramDC.LocalSeismogram a_seismogram,
                      edu.iris.Fissures.AuditInfo[] audit_info)
        throws edu.iris.Fissures.FissuresException
    {
        return _ob_delegate_.create_from_value(a_seismogram,
                                               audit_info);
    }

    //
    // IDL:iris.edu/Fissures/IfSeismogramMgr/SeismogramFactory/create_from_values:1.0
    //
    public Seismogram[]
    create_from_values(edu.iris.Fissures.IfSeismogramDC.LocalMotionVector a_seismogram,
                       edu.iris.Fissures.AuditInfo[] audit_info)
        throws edu.iris.Fissures.FissuresException
    {
        return _ob_delegate_.create_from_values(a_seismogram,
                                                audit_info);
    }

    //
    // IDL:iris.edu/Fissures/IfSeismogramMgr/SeismogramFactory/create_from_ref:1.0
    //
    public Seismogram
    create_from_ref(Seismogram a_seismogram,
                    edu.iris.Fissures.AuditInfo[] audit_info)
        throws edu.iris.Fissures.FissuresException
    {
        return _ob_delegate_.create_from_ref(a_seismogram,
                                             audit_info);
    }
}
