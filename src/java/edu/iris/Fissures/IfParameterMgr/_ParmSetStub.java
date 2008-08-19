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

package edu.iris.Fissures.IfParameterMgr;

//
// IDL:iris.edu/Fissures/IfParameterMgr/ParmSet:1.0
//
public class _ParmSetStub extends org.omg.CORBA.portable.ObjectImpl
                          implements ParmSet
{
    private static final String[] _ob_ids_ =
    {
        "IDL:iris.edu/Fissures/IfParameterMgr/ParmSet:1.0",
        "IDL:iris.edu/Fissures/IfParameterMgr/ParmSetAccess:1.0",
        "IDL:iris.edu/Fissures/IfParameterMgr/ParameterComponent:1.0"
    };

    public String[]
    _ids()
    {
        return _ob_ids_;
    }

    final public static java.lang.Class _ob_opsClass = ParmSetOperations.class;

    //
    // IDL:iris.edu/Fissures/IfParameterMgr/ParmSetAccess/a_writable:1.0
    //
    public ParmSet
    a_writable()
    {
        while(true)
        {
            if(!this._is_local())
            {
                org.omg.CORBA.portable.OutputStream out = null;
                org.omg.CORBA.portable.InputStream in = null;
                try
                {
                    out = _request("_get_a_writable", true);
                    in = _invoke(out);
                    ParmSet _ob_r = ParmSetHelper.read(in);
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
                org.omg.CORBA.portable.ServantObject _ob_so = _servant_preinvoke("a_writable", _ob_opsClass);
                if(_ob_so == null)
                    continue;
                ParmSetOperations _ob_self = (ParmSetOperations)_ob_so.servant;
                try
                {
                    return _ob_self.a_writable();
                }
                finally
                {
                    _servant_postinvoke(_ob_so);
                }
            }
        }
    }

    //
    // IDL:iris.edu/Fissures/IfParameterMgr/ParameterComponent/a_parmset_finder:1.0
    //
    public ParmSetFinder
    a_parmset_finder()
    {
        while(true)
        {
            if(!this._is_local())
            {
                org.omg.CORBA.portable.OutputStream out = null;
                org.omg.CORBA.portable.InputStream in = null;
                try
                {
                    out = _request("_get_a_parmset_finder", true);
                    in = _invoke(out);
                    ParmSetFinder _ob_r = ParmSetFinderHelper.read(in);
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
                org.omg.CORBA.portable.ServantObject _ob_so = _servant_preinvoke("a_parmset_finder", _ob_opsClass);
                if(_ob_so == null)
                    continue;
                ParmSetOperations _ob_self = (ParmSetOperations)_ob_so.servant;
                try
                {
                    return _ob_self.a_parmset_finder();
                }
                finally
                {
                    _servant_postinvoke(_ob_so);
                }
            }
        }
    }

    //
    // IDL:iris.edu/Fissures/IfParameterMgr/ParameterComponent/a_parm__mgr:1.0
    //
    public ParameterMgrAccess
    a_parm__mgr()
    {
        while(true)
        {
            if(!this._is_local())
            {
                org.omg.CORBA.portable.OutputStream out = null;
                org.omg.CORBA.portable.InputStream in = null;
                try
                {
                    out = _request("_get_a_parm__mgr", true);
                    in = _invoke(out);
                    ParameterMgrAccess _ob_r = ParameterMgrAccessHelper.read(in);
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
                org.omg.CORBA.portable.ServantObject _ob_so = _servant_preinvoke("a_parm__mgr", _ob_opsClass);
                if(_ob_so == null)
                    continue;
                ParmSetOperations _ob_self = (ParmSetOperations)_ob_so.servant;
                try
                {
                    return _ob_self.a_parm__mgr();
                }
                finally
                {
                    _servant_postinvoke(_ob_so);
                }
            }
        }
    }

    //
    // IDL:iris.edu/Fissures/IfParameterMgr/ParmSet/update_name:1.0
    //
    public void
    update_name(String _ob_a0)
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
                    out = _request("update_name", true);
                    out.write_string(_ob_a0);
                    in = _invoke(out);
                    return;
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
                org.omg.CORBA.portable.ServantObject _ob_so = _servant_preinvoke("update_name", _ob_opsClass);
                if(_ob_so == null)
                    continue;
                ParmSetOperations _ob_self = (ParmSetOperations)_ob_so.servant;
                try
                {
                    _ob_self.update_name(_ob_a0);
                    return;
                }
                finally
                {
                    _servant_postinvoke(_ob_so);
                }
            }
        }
    }

    //
    // IDL:iris.edu/Fissures/IfParameterMgr/ParmSet/update_description:1.0
    //
    public void
    update_description(String _ob_a0)
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
                    out = _request("update_description", true);
                    out.write_string(_ob_a0);
                    in = _invoke(out);
                    return;
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
                org.omg.CORBA.portable.ServantObject _ob_so = _servant_preinvoke("update_description", _ob_opsClass);
                if(_ob_so == null)
                    continue;
                ParmSetOperations _ob_self = (ParmSetOperations)_ob_so.servant;
                try
                {
                    _ob_self.update_description(_ob_a0);
                    return;
                }
                finally
                {
                    _servant_postinvoke(_ob_so);
                }
            }
        }
    }

    //
    // IDL:iris.edu/Fissures/IfParameterMgr/ParmSet/add_new_parm_def:1.0
    //
    public void
    add_new_parm_def(ParmDef _ob_a0)
    {
        while(true)
        {
            if(!this._is_local())
            {
                org.omg.CORBA.portable.OutputStream out = null;
                org.omg.CORBA.portable.InputStream in = null;
                try
                {
                    out = _request("add_new_parm_def", true);
                    ParmDefHelper.write(out, _ob_a0);
                    in = _invoke(out);
                    return;
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
                org.omg.CORBA.portable.ServantObject _ob_so = _servant_preinvoke("add_new_parm_def", _ob_opsClass);
                if(_ob_so == null)
                    continue;
                ParmSetOperations _ob_self = (ParmSetOperations)_ob_so.servant;
                try
                {
                    _ob_self.add_new_parm_def(_ob_a0);
                    return;
                }
                finally
                {
                    _servant_postinvoke(_ob_so);
                }
            }
        }
    }

    //
    // IDL:iris.edu/Fissures/IfParameterMgr/ParmSet/add_existing_parm_def:1.0
    //
    public void
    add_existing_parm_def(String _ob_a0)
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
                    out = _request("add_existing_parm_def", true);
                    ParameterNameHelper.write(out, _ob_a0);
                    in = _invoke(out);
                    return;
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
                org.omg.CORBA.portable.ServantObject _ob_so = _servant_preinvoke("add_existing_parm_def", _ob_opsClass);
                if(_ob_so == null)
                    continue;
                ParmSetOperations _ob_self = (ParmSetOperations)_ob_so.servant;
                try
                {
                    _ob_self.add_existing_parm_def(_ob_a0);
                    return;
                }
                finally
                {
                    _servant_postinvoke(_ob_so);
                }
            }
        }
    }

    //
    // IDL:iris.edu/Fissures/IfParameterMgr/ParmSet/delete_parm_def:1.0
    //
    public void
    delete_parm_def(String _ob_a0)
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
                    out = _request("delete_parm_def", true);
                    ParameterNameHelper.write(out, _ob_a0);
                    in = _invoke(out);
                    return;
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
                org.omg.CORBA.portable.ServantObject _ob_so = _servant_preinvoke("delete_parm_def", _ob_opsClass);
                if(_ob_so == null)
                    continue;
                ParmSetOperations _ob_self = (ParmSetOperations)_ob_so.servant;
                try
                {
                    _ob_self.delete_parm_def(_ob_a0);
                    return;
                }
                finally
                {
                    _servant_postinvoke(_ob_so);
                }
            }
        }
    }

    //
    // IDL:iris.edu/Fissures/IfParameterMgr/ParmSetAccess/get_attributes:1.0
    //
    public ParmSetAttr
    get_attributes()
    {
        while(true)
        {
            if(!this._is_local())
            {
                org.omg.CORBA.portable.OutputStream out = null;
                org.omg.CORBA.portable.InputStream in = null;
                try
                {
                    out = _request("get_attributes", true);
                    in = _invoke(out);
                    ParmSetAttr _ob_r = ParmSetAttrHelper.read(in);
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
                org.omg.CORBA.portable.ServantObject _ob_so = _servant_preinvoke("get_attributes", _ob_opsClass);
                if(_ob_so == null)
                    continue;
                ParmSetOperations _ob_self = (ParmSetOperations)_ob_so.servant;
                try
                {
                    return _ob_self.get_attributes();
                }
                finally
                {
                    _servant_postinvoke(_ob_so);
                }
            }
        }
    }

    //
    // IDL:iris.edu/Fissures/IfParameterMgr/ParmSetAccess/get_all_parm_defs:1.0
    //
    public ParmDef[]
    get_all_parm_defs()
    {
        while(true)
        {
            if(!this._is_local())
            {
                org.omg.CORBA.portable.OutputStream out = null;
                org.omg.CORBA.portable.InputStream in = null;
                try
                {
                    out = _request("get_all_parm_defs", true);
                    in = _invoke(out);
                    ParmDef[] _ob_r = ParmDefSeqHelper.read(in);
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
                org.omg.CORBA.portable.ServantObject _ob_so = _servant_preinvoke("get_all_parm_defs", _ob_opsClass);
                if(_ob_so == null)
                    continue;
                ParmSetOperations _ob_self = (ParmSetOperations)_ob_so.servant;
                try
                {
                    return _ob_self.get_all_parm_defs();
                }
                finally
                {
                    _servant_postinvoke(_ob_so);
                }
            }
        }
    }

    //
    // IDL:iris.edu/Fissures/IfParameterMgr/ParmSetAccess/get_parm_def:1.0
    //
    public ParmDef
    get_parm_def(String _ob_a0)
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
                    out = _request("get_parm_def", true);
                    ParameterNameHelper.write(out, _ob_a0);
                    in = _invoke(out);
                    ParmDef _ob_r = ParmDefHelper.read(in);
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
                org.omg.CORBA.portable.ServantObject _ob_so = _servant_preinvoke("get_parm_def", _ob_opsClass);
                if(_ob_so == null)
                    continue;
                ParmSetOperations _ob_self = (ParmSetOperations)_ob_so.servant;
                try
                {
                    return _ob_self.get_parm_def(_ob_a0);
                }
                finally
                {
                    _servant_postinvoke(_ob_so);
                }
            }
        }
    }

    //
    // IDL:iris.edu/Fissures/IfParameterMgr/ParmSetAccess/get_parm_defs:1.0
    //
    public ParmDef[]
    get_parm_defs(String[] _ob_a0)
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
                    out = _request("get_parm_defs", true);
                    ParameterNameSeqHelper.write(out, _ob_a0);
                    in = _invoke(out);
                    ParmDef[] _ob_r = ParmDefSeqHelper.read(in);
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
                org.omg.CORBA.portable.ServantObject _ob_so = _servant_preinvoke("get_parm_defs", _ob_opsClass);
                if(_ob_so == null)
                    continue;
                ParmSetOperations _ob_self = (ParmSetOperations)_ob_so.servant;
                try
                {
                    return _ob_self.get_parm_defs(_ob_a0);
                }
                finally
                {
                    _servant_postinvoke(_ob_so);
                }
            }
        }
    }
}
