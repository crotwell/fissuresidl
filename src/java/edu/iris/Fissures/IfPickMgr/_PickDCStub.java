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
public class _PickDCStub extends org.omg.CORBA.portable.ObjectImpl
                         implements PickDC
{
    private static final String[] _ob_ids_ =
    {
        "IDL:iris.edu/Fissures/IfPickMgr/PickDC:1.0",
    };

    public String[]
    _ids()
    {
        return _ob_ids_;
    }

    final public static java.lang.Class _ob_opsClass = PickDCOperations.class;

    //
    // IDL:iris.edu/Fissures/IfPickMgr/PickDC/a_writeable:1.0
    //
    public PickMgr
    a_writeable()
    {
        while(true)
        {
            if(!this._is_local())
            {
                org.omg.CORBA.portable.OutputStream out = null;
                org.omg.CORBA.portable.InputStream in = null;
                try
                {
                    out = _request("_get_a_writeable", true);
                    in = _invoke(out);
                    PickMgr _ob_r = PickMgrHelper.read(in);
                    return _ob_r;
                }
                catch(org.omg.CORBA.portable.RemarshalException _ob_ex)
                {
                    continue;
                }
                catch(org.omg.CORBA.portable.ApplicationException _ob_aex)
                {
                    final String _ob_id = _ob_aex.getId();
                    throw new org.omg.CORBA.UNKNOWN("Unexpected User Exception: " + _ob_id);
                }
                finally
                {
                    _releaseReply(in);
                }
            }
            else
            {
                org.omg.CORBA.portable.ServantObject _ob_so = _servant_preinvoke("a_writeable", _ob_opsClass);
                if(_ob_so == null)
                    continue;
                PickDCOperations _ob_self = (PickDCOperations)_ob_so.servant;
                try
                {
                    return _ob_self.a_writeable();
                }
                finally
                {
                    _servant_postinvoke(_ob_so);
                }
            }
        }
    }

    //
    // IDL:iris.edu/Fissures/IfPickMgr/PickDC/retrieve_picks_for_seismogram:1.0
    //
    public Pick[]
    retrieve_picks_for_seismogram(String _ob_a0)
        throws edu.iris.Fissures.FissuresException
    {
        while(true)
        {
            if(!this._is_local())
            {
                org.omg.CORBA.portable.OutputStream out = null;
                org.omg.CORBA.portable.InputStream in = null;
                try
                {
                    out = _request("retrieve_picks_for_seismogram", true);
                    SeismogramIdHelper.write(out, _ob_a0);
                    in = _invoke(out);
                    Pick[] _ob_r = PickSeqHelper.read(in);
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

                    if(_ob_id.equals(edu.iris.Fissures.FissuresExceptionHelper.id()))
                        throw edu.iris.Fissures.FissuresExceptionHelper.read(in);
                    throw new org.omg.CORBA.UNKNOWN("Unexpected User Exception: " + _ob_id);
                }
                finally
                {
                    _releaseReply(in);
                }
            }
            else
            {
                org.omg.CORBA.portable.ServantObject _ob_so = _servant_preinvoke("retrieve_picks_for_seismogram", _ob_opsClass);
                if(_ob_so == null)
                    continue;
                PickDCOperations _ob_self = (PickDCOperations)_ob_so.servant;
                try
                {
                    Pick[] _ob_r = _ob_self.retrieve_picks_for_seismogram(_ob_a0);
                    org.omg.CORBA.portable.OutputStream _ob_out = _orb().create_output_stream();
                    int len0 = _ob_r.length;
                    _ob_out.write_ulong(len0);
                    for(int i0 = 0 ; i0 < len0 ; i0++)
                        PickHelper.write(_ob_out, _ob_r[i0]);
                    org.omg.CORBA.portable.InputStream _ob_in = _ob_out.create_input_stream();
                    int len1 = _ob_in.read_ulong();
                    _ob_r = new Pick[len1];
                    for(int i1 = 0 ; i1 < len1 ; i1++)
                        _ob_r[i1] = PickHelper.read(_ob_in);
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
    // IDL:iris.edu/Fissures/IfPickMgr/PickDC/retrieve_picks_for_site:1.0
    //
    public Pick[]
    retrieve_picks_for_site(edu.iris.Fissures.IfNetwork.SiteId _ob_a0,
                            edu.iris.Fissures.TimeRange _ob_a1)
        throws edu.iris.Fissures.FissuresException
    {
        while(true)
        {
            if(!this._is_local())
            {
                org.omg.CORBA.portable.OutputStream out = null;
                org.omg.CORBA.portable.InputStream in = null;
                try
                {
                    out = _request("retrieve_picks_for_site", true);
                    SiteIdHelper.write(out, _ob_a0);
                    edu.iris.Fissures.TimeRangeHelper.write(out, _ob_a1);
                    in = _invoke(out);
                    Pick[] _ob_r = PickSeqHelper.read(in);
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

                    if(_ob_id.equals(edu.iris.Fissures.FissuresExceptionHelper.id()))
                        throw edu.iris.Fissures.FissuresExceptionHelper.read(in);
                    throw new org.omg.CORBA.UNKNOWN("Unexpected User Exception: " + _ob_id);
                }
                finally
                {
                    _releaseReply(in);
                }
            }
            else
            {
                org.omg.CORBA.portable.ServantObject _ob_so = _servant_preinvoke("retrieve_picks_for_site", _ob_opsClass);
                if(_ob_so == null)
                    continue;
                PickDCOperations _ob_self = (PickDCOperations)_ob_so.servant;
                try
                {
                    Pick[] _ob_r = _ob_self.retrieve_picks_for_site(_ob_a0, _ob_a1);
                    org.omg.CORBA.portable.OutputStream _ob_out = _orb().create_output_stream();
                    int len0 = _ob_r.length;
                    _ob_out.write_ulong(len0);
                    for(int i0 = 0 ; i0 < len0 ; i0++)
                        PickHelper.write(_ob_out, _ob_r[i0]);
                    org.omg.CORBA.portable.InputStream _ob_in = _ob_out.create_input_stream();
                    int len1 = _ob_in.read_ulong();
                    _ob_r = new Pick[len1];
                    for(int i1 = 0 ; i1 < len1 ; i1++)
                        _ob_r[i1] = PickHelper.read(_ob_in);
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
    // IDL:iris.edu/Fissures/IfPickMgr/PickDC/retrieve_pick_group:1.0
    //
    public PickGroup[]
    retrieve_pick_group(String _ob_a0)
        throws edu.iris.Fissures.FissuresException
    {
        while(true)
        {
            if(!this._is_local())
            {
                org.omg.CORBA.portable.OutputStream out = null;
                org.omg.CORBA.portable.InputStream in = null;
                try
                {
                    out = _request("retrieve_pick_group", true);
                    PickGroupIdHelper.write(out, _ob_a0);
                    in = _invoke(out);
                    PickGroup[] _ob_r = PickGroupSeqHelper.read(in);
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

                    if(_ob_id.equals(edu.iris.Fissures.FissuresExceptionHelper.id()))
                        throw edu.iris.Fissures.FissuresExceptionHelper.read(in);
                    throw new org.omg.CORBA.UNKNOWN("Unexpected User Exception: " + _ob_id);
                }
                finally
                {
                    _releaseReply(in);
                }
            }
            else
            {
                org.omg.CORBA.portable.ServantObject _ob_so = _servant_preinvoke("retrieve_pick_group", _ob_opsClass);
                if(_ob_so == null)
                    continue;
                PickDCOperations _ob_self = (PickDCOperations)_ob_so.servant;
                try
                {
                    PickGroup[] _ob_r = _ob_self.retrieve_pick_group(_ob_a0);
                    org.omg.CORBA.portable.OutputStream _ob_out = _orb().create_output_stream();
                    int len0 = _ob_r.length;
                    _ob_out.write_ulong(len0);
                    for(int i0 = 0 ; i0 < len0 ; i0++)
                        PickGroupHelper.write(_ob_out, _ob_r[i0]);
                    org.omg.CORBA.portable.InputStream _ob_in = _ob_out.create_input_stream();
                    int len1 = _ob_in.read_ulong();
                    _ob_r = new PickGroup[len1];
                    for(int i1 = 0 ; i1 < len1 ; i1++)
                        _ob_r[i1] = PickGroupHelper.read(_ob_in);
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
    // IDL:iris.edu/Fissures/IfPickMgr/PickDC/retrieve_pick_group_by_name:1.0
    //
    public PickGroup[]
    retrieve_pick_group_by_name(String _ob_a0)
        throws edu.iris.Fissures.FissuresException
    {
        while(true)
        {
            if(!this._is_local())
            {
                org.omg.CORBA.portable.OutputStream out = null;
                org.omg.CORBA.portable.InputStream in = null;
                try
                {
                    out = _request("retrieve_pick_group_by_name", true);
                    PickGroupNameHelper.write(out, _ob_a0);
                    in = _invoke(out);
                    PickGroup[] _ob_r = PickGroupSeqHelper.read(in);
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

                    if(_ob_id.equals(edu.iris.Fissures.FissuresExceptionHelper.id()))
                        throw edu.iris.Fissures.FissuresExceptionHelper.read(in);
                    throw new org.omg.CORBA.UNKNOWN("Unexpected User Exception: " + _ob_id);
                }
                finally
                {
                    _releaseReply(in);
                }
            }
            else
            {
                org.omg.CORBA.portable.ServantObject _ob_so = _servant_preinvoke("retrieve_pick_group_by_name", _ob_opsClass);
                if(_ob_so == null)
                    continue;
                PickDCOperations _ob_self = (PickDCOperations)_ob_so.servant;
                try
                {
                    PickGroup[] _ob_r = _ob_self.retrieve_pick_group_by_name(_ob_a0);
                    org.omg.CORBA.portable.OutputStream _ob_out = _orb().create_output_stream();
                    int len0 = _ob_r.length;
                    _ob_out.write_ulong(len0);
                    for(int i0 = 0 ; i0 < len0 ; i0++)
                        PickGroupHelper.write(_ob_out, _ob_r[i0]);
                    org.omg.CORBA.portable.InputStream _ob_in = _ob_out.create_input_stream();
                    int len1 = _ob_in.read_ulong();
                    _ob_r = new PickGroup[len1];
                    for(int i1 = 0 ; i1 < len1 ; i1++)
                        _ob_r[i1] = PickGroupHelper.read(_ob_in);
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
    // IDL:iris.edu/Fissures/IfPickMgr/PickDC/get_pickgroups_for_dataset:1.0
    //
    public PickGroup[]
    get_pickgroups_for_dataset(String _ob_a0)
        throws edu.iris.Fissures.FissuresException
    {
        while(true)
        {
            if(!this._is_local())
            {
                org.omg.CORBA.portable.OutputStream out = null;
                org.omg.CORBA.portable.InputStream in = null;
                try
                {
                    out = _request("get_pickgroups_for_dataset", true);
                    NodeIdHelper.write(out, _ob_a0);
                    in = _invoke(out);
                    PickGroup[] _ob_r = PickGroupSeqHelper.read(in);
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

                    if(_ob_id.equals(edu.iris.Fissures.FissuresExceptionHelper.id()))
                        throw edu.iris.Fissures.FissuresExceptionHelper.read(in);
                    throw new org.omg.CORBA.UNKNOWN("Unexpected User Exception: " + _ob_id);
                }
                finally
                {
                    _releaseReply(in);
                }
            }
            else
            {
                org.omg.CORBA.portable.ServantObject _ob_so = _servant_preinvoke("get_pickgroups_for_dataset", _ob_opsClass);
                if(_ob_so == null)
                    continue;
                PickDCOperations _ob_self = (PickDCOperations)_ob_so.servant;
                try
                {
                    PickGroup[] _ob_r = _ob_self.get_pickgroups_for_dataset(_ob_a0);
                    org.omg.CORBA.portable.OutputStream _ob_out = _orb().create_output_stream();
                    int len0 = _ob_r.length;
                    _ob_out.write_ulong(len0);
                    for(int i0 = 0 ; i0 < len0 ; i0++)
                        PickGroupHelper.write(_ob_out, _ob_r[i0]);
                    org.omg.CORBA.portable.InputStream _ob_in = _ob_out.create_input_stream();
                    int len1 = _ob_in.read_ulong();
                    _ob_r = new PickGroup[len1];
                    for(int i1 = 0 ; i1 < len1 ; i1++)
                        _ob_r[i1] = PickGroupHelper.read(_ob_in);
                    return _ob_r;
                }
                finally
                {
                    _servant_postinvoke(_ob_so);
                }
            }
        }
    }
}
