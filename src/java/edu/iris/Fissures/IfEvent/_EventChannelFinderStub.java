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
// IDL:iris.edu/Fissures/IfEvent/EventChannelFinder:1.0
//
public class _EventChannelFinderStub extends org.omg.CORBA.portable.ObjectImpl
                                     implements EventChannelFinder
{
    private static final String[] _ob_ids_ =
    {
        "IDL:iris.edu/Fissures/IfEvent/EventChannelFinder:1.0",
    };

    public String[]
    _ids()
    {
        return _ob_ids_;
    }

    final public static java.lang.Class _ob_opsClass = EventChannelFinderOperations.class;

    //
    // IDL:iris.edu/Fissures/IfEvent/EventChannelFinder/list_channels:1.0
    //
    public EventChannelDefinition[]
    list_channels()
    {
        while(true)
        {
            if(!this._is_local())
            {
                org.omg.CORBA.portable.OutputStream out = null;
                org.omg.CORBA.portable.InputStream in = null;
                try
                {
                    out = _request("list_channels", true);
                    in = _invoke(out);
                    EventChannelDefinition[] _ob_r = EventChannelDefinitionSeqHelper.read(in);
                    return _ob_r;
                }
                catch(org.omg.CORBA.portable.RemarshalException _ob_ex)
                {
                    continue;
                }
                catch(org.omg.CORBA.portable.ApplicationException _ob_aex)
                {
                    final String _ob_id = _ob_aex.getId();
                    in = _ob_aex.getInputStream();

                    throw new org.omg.CORBA.UNKNOWN("Unexpected User Exception: " + _ob_id);
                }
                finally
                {
                    _releaseReply(in);
                }
            }
            else
            {
                org.omg.CORBA.portable.ServantObject _ob_so = _servant_preinvoke("list_channels", _ob_opsClass);
                if(_ob_so == null)
                    continue;
                EventChannelFinderOperations _ob_self = (EventChannelFinderOperations)_ob_so.servant;
                try
                {
                    EventChannelDefinition[] _ob_r = _ob_self.list_channels();
                    org.omg.CORBA.portable.OutputStream _ob_out = _orb().create_output_stream();
                    int len0 = _ob_r.length;
                    _ob_out.write_ulong(len0);
                    for(int i0 = 0 ; i0 < len0 ; i0++)
                        EventChannelDefinitionHelper.write(_ob_out, _ob_r[i0]);
                    org.omg.CORBA.portable.InputStream _ob_in = _ob_out.create_input_stream();
                    int len1 = _ob_in.read_ulong();
                    _ob_r = new EventChannelDefinition[len1];
                    for(int i1 = 0 ; i1 < len1 ; i1++)
                        _ob_r[i1] = EventChannelDefinitionHelper.read(_ob_in);
                    return _ob_r;
                }
                finally
                {
                    _servant_postinvoke(_ob_so);
                }
            }
        }
    }

    //
    // IDL:iris.edu/Fissures/IfEvent/EventChannelFinder/retrieve_channel:1.0
    //
    public org.omg.CosEventChannelAdmin.ConsumerAdmin
    retrieve_channel(String _ob_a0)
        throws NotFound
    {
        while(true)
        {
            if(!this._is_local())
            {
                org.omg.CORBA.portable.OutputStream out = null;
                org.omg.CORBA.portable.InputStream in = null;
                try
                {
                    out = _request("retrieve_channel", true);
                    EventChannelNameHelper.write(out, _ob_a0);
                    in = _invoke(out);
                    org.omg.CosEventChannelAdmin.ConsumerAdmin _ob_r = org.omg.CosEventChannelAdmin.ConsumerAdminHelper.read(in);
                    return _ob_r;
                }
                catch(org.omg.CORBA.portable.RemarshalException _ob_ex)
                {
                    continue;
                }
                catch(org.omg.CORBA.portable.ApplicationException _ob_aex)
                {
                    final String _ob_id = _ob_aex.getId();
                    in = _ob_aex.getInputStream();

                    if(_ob_id.equals(NotFoundHelper.id()))
                        throw NotFoundHelper.read(in);
                    throw new org.omg.CORBA.UNKNOWN("Unexpected User Exception: " + _ob_id);
                }
                finally
                {
                    _releaseReply(in);
                }
            }
            else
            {
                org.omg.CORBA.portable.ServantObject _ob_so = _servant_preinvoke("retrieve_channel", _ob_opsClass);
                if(_ob_so == null)
                    continue;
                EventChannelFinderOperations _ob_self = (EventChannelFinderOperations)_ob_so.servant;
                try
                {
                    return _ob_self.retrieve_channel(_ob_a0);
                }
                finally
                {
                    _servant_postinvoke(_ob_so);
                }
            }
        }
    }
}
