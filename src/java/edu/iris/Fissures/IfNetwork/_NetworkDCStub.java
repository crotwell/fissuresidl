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
// IDL:iris.edu/Fissures/IfNetwork/NetworkDC:1.0
//
public class _NetworkDCStub extends org.omg.CORBA.portable.ObjectImpl
                            implements NetworkDC
{
    private static final String[] _ob_ids_ =
    {
        "IDL:iris.edu/Fissures/IfNetwork/NetworkDC:1.0",
    };

    public String[]
    _ids()
    {
        return _ob_ids_;
    }

    final public static java.lang.Class _ob_opsClass = NetworkDCOperations.class;

    //
    // IDL:iris.edu/Fissures/IfNetwork/NetworkDC/a_explorer:1.0
    //
    public NetworkExplorer
    a_explorer()
    {
        while(true)
        {
            if(!this._is_local())
            {
                org.omg.CORBA.portable.OutputStream out = null;
                org.omg.CORBA.portable.InputStream in = null;
                try
                {
                    out = _request("_get_a_explorer", true);
                    in = _invoke(out);
                    NetworkExplorer _ob_r = NetworkExplorerHelper.read(in);
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
                org.omg.CORBA.portable.ServantObject _ob_so = _servant_preinvoke("a_explorer", _ob_opsClass);
                if(_ob_so == null)
                    continue;
                NetworkDCOperations _ob_self = (NetworkDCOperations)_ob_so.servant;
                try
                {
                    return _ob_self.a_explorer();
                }
                finally
                {
                    _servant_postinvoke(_ob_so);
                }
            }
        }
    }

    //
    // IDL:iris.edu/Fissures/IfNetwork/NetworkDC/a_finder:1.0
    //
    public NetworkFinder
    a_finder()
    {
        while(true)
        {
            if(!this._is_local())
            {
                org.omg.CORBA.portable.OutputStream out = null;
                org.omg.CORBA.portable.InputStream in = null;
                try
                {
                    out = _request("_get_a_finder", true);
                    in = _invoke(out);
                    NetworkFinder _ob_r = NetworkFinderHelper.read(in);
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
                org.omg.CORBA.portable.ServantObject _ob_so = _servant_preinvoke("a_finder", _ob_opsClass);
                if(_ob_so == null)
                    continue;
                NetworkDCOperations _ob_self = (NetworkDCOperations)_ob_so.servant;
                try
                {
                    return _ob_self.a_finder();
                }
                finally
                {
                    _servant_postinvoke(_ob_so);
                }
            }
        }
    }
}
