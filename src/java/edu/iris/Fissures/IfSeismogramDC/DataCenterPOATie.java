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

package edu.iris.Fissures.IfSeismogramDC;

//
// IDL:iris.edu/Fissures/IfSeismogramDC/DataCenter:1.0
//
public class DataCenterPOATie extends DataCenterPOA
{
    private DataCenterOperations _ob_delegate_;
    private org.omg.PortableServer.POA _ob_poa_;

    public
    DataCenterPOATie(DataCenterOperations delegate)
    {
        _ob_delegate_ = delegate;
    }

    public
    DataCenterPOATie(DataCenterOperations delegate, org.omg.PortableServer.POA poa)
    {
        _ob_delegate_ = delegate;
        _ob_poa_ = poa;
    }

    public DataCenterOperations
    _delegate()
    {
        return _ob_delegate_;
    }

    public void
    _delegate(DataCenterOperations delegate)
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
    // IDL:iris.edu/Fissures/IfSeismogramDC/DataCenter/available_data:1.0
    //
    public RequestFilter[]
    available_data(RequestFilter[] a_filterseq)
    {
        return _ob_delegate_.available_data(a_filterseq);
    }

    //
    // IDL:iris.edu/Fissures/IfSeismogramDC/DataCenter/request_seismograms:1.0
    //
    public String
    request_seismograms(RequestFilter[] a_filterseq,
                        DataCenterCallBack a_client,
                        boolean long_lived,
                        edu.iris.Fissures.Time expiration_time)
        throws edu.iris.Fissures.FissuresException
    {
        return _ob_delegate_.request_seismograms(a_filterseq,
                                                 a_client,
                                                 long_lived,
                                                 expiration_time);
    }

    //
    // IDL:iris.edu/Fissures/IfSeismogramDC/DataCenter/retrieve_seismograms:1.0
    //
    public LocalSeismogram[]
    retrieve_seismograms(RequestFilter[] a_filterseq)
        throws edu.iris.Fissures.FissuresException
    {
        return _ob_delegate_.retrieve_seismograms(a_filterseq);
    }

    //
    // IDL:iris.edu/Fissures/IfSeismogramDC/DataCenter/queue_seismograms:1.0
    //
    public String
    queue_seismograms(RequestFilter[] a_filterseq)
        throws edu.iris.Fissures.FissuresException
    {
        return _ob_delegate_.queue_seismograms(a_filterseq);
    }

    //
    // IDL:iris.edu/Fissures/IfSeismogramDC/DataCenter/retrieve_queue:1.0
    //
    public LocalSeismogram[]
    retrieve_queue(String a_request)
        throws edu.iris.Fissures.FissuresException
    {
        return _ob_delegate_.retrieve_queue(a_request);
    }

    //
    // IDL:iris.edu/Fissures/IfSeismogramDC/DataCenter/cancel_request:1.0
    //
    public void
    cancel_request(String a_request)
        throws edu.iris.Fissures.FissuresException
    {
        _ob_delegate_.cancel_request(a_request);
    }

    //
    // IDL:iris.edu/Fissures/IfSeismogramDC/DataCenter/request_status:1.0
    //
    public String
    request_status(String a_request)
        throws edu.iris.Fissures.FissuresException
    {
        return _ob_delegate_.request_status(a_request);
    }
}
