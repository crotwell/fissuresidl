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

package edu.iris.Fissures.IfTimeSeries;

//
// IDL:iris.edu/Fissures/IfTimeSeries/TimeSeriesAccess:1.0
//
public class _TimeSeriesAccessStub extends org.omg.CORBA.portable.ObjectImpl
                                   implements TimeSeriesAccess
{
    private static final String[] _ob_ids_ =
    {
        "IDL:iris.edu/Fissures/IfTimeSeries/TimeSeriesAccess:1.0",
        "IDL:iris.edu/Fissures/AuditSystemAccess:1.0"
    };

    public String[]
    _ids()
    {
        return _ob_ids_;
    }

    final public static java.lang.Class _ob_opsClass = TimeSeriesAccess.class;

    //
    // IDL:iris.edu/Fissures/IfTimeSeries/TimeSeriesAccess/is_closed:1.0
    //
    public boolean
    is_closed()
    {
        while(true)
        {
            if(!this._is_local())
            {
                org.omg.CORBA.portable.OutputStream out = null;
                org.omg.CORBA.portable.InputStream in = null;
                try
                {
                    out = _request("is_closed", true);
                    in = _invoke(out);
                    boolean _ob_r = in.read_boolean();
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
                org.omg.CORBA.portable.ServantObject _ob_so = _servant_preinvoke("is_closed", _ob_opsClass);
                if(_ob_so == null)
                    continue;
                TimeSeriesAccess _ob_self = (TimeSeriesAccess)_ob_so.servant;
                try
                {
                    return _ob_self.is_closed();
                }
                finally
                {
                    _servant_postinvoke(_ob_so);
                }
            }
        }
    }

    //
    // IDL:iris.edu/Fissures/IfTimeSeries/TimeSeriesAccess/is_long:1.0
    //
    public boolean
    is_long()
    {
        while(true)
        {
            if(!this._is_local())
            {
                org.omg.CORBA.portable.OutputStream out = null;
                org.omg.CORBA.portable.InputStream in = null;
                try
                {
                    out = _request("is_long", true);
                    in = _invoke(out);
                    boolean _ob_r = in.read_boolean();
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
                org.omg.CORBA.portable.ServantObject _ob_so = _servant_preinvoke("is_long", _ob_opsClass);
                if(_ob_so == null)
                    continue;
                TimeSeriesAccess _ob_self = (TimeSeriesAccess)_ob_so.servant;
                try
                {
                    return _ob_self.is_long();
                }
                finally
                {
                    _servant_postinvoke(_ob_so);
                }
            }
        }
    }

    //
    // IDL:iris.edu/Fissures/IfTimeSeries/TimeSeriesAccess/is_float:1.0
    //
    public boolean
    is_float()
    {
        while(true)
        {
            if(!this._is_local())
            {
                org.omg.CORBA.portable.OutputStream out = null;
                org.omg.CORBA.portable.InputStream in = null;
                try
                {
                    out = _request("is_float", true);
                    in = _invoke(out);
                    boolean _ob_r = in.read_boolean();
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
                org.omg.CORBA.portable.ServantObject _ob_so = _servant_preinvoke("is_float", _ob_opsClass);
                if(_ob_so == null)
                    continue;
                TimeSeriesAccess _ob_self = (TimeSeriesAccess)_ob_so.servant;
                try
                {
                    return _ob_self.is_float();
                }
                finally
                {
                    _servant_postinvoke(_ob_so);
                }
            }
        }
    }

    //
    // IDL:iris.edu/Fissures/IfTimeSeries/TimeSeriesAccess/is_double:1.0
    //
    public boolean
    is_double()
    {
        while(true)
        {
            if(!this._is_local())
            {
                org.omg.CORBA.portable.OutputStream out = null;
                org.omg.CORBA.portable.InputStream in = null;
                try
                {
                    out = _request("is_double", true);
                    in = _invoke(out);
                    boolean _ob_r = in.read_boolean();
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
                org.omg.CORBA.portable.ServantObject _ob_so = _servant_preinvoke("is_double", _ob_opsClass);
                if(_ob_so == null)
                    continue;
                TimeSeriesAccess _ob_self = (TimeSeriesAccess)_ob_so.servant;
                try
                {
                    return _ob_self.is_double();
                }
                finally
                {
                    _servant_postinvoke(_ob_so);
                }
            }
        }
    }

    //
    // IDL:iris.edu/Fissures/IfTimeSeries/TimeSeriesAccess/is_short:1.0
    //
    public boolean
    is_short()
    {
        while(true)
        {
            if(!this._is_local())
            {
                org.omg.CORBA.portable.OutputStream out = null;
                org.omg.CORBA.portable.InputStream in = null;
                try
                {
                    out = _request("is_short", true);
                    in = _invoke(out);
                    boolean _ob_r = in.read_boolean();
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
                org.omg.CORBA.portable.ServantObject _ob_so = _servant_preinvoke("is_short", _ob_opsClass);
                if(_ob_so == null)
                    continue;
                TimeSeriesAccess _ob_self = (TimeSeriesAccess)_ob_so.servant;
                try
                {
                    return _ob_self.is_short();
                }
                finally
                {
                    _servant_postinvoke(_ob_so);
                }
            }
        }
    }

    //
    // IDL:iris.edu/Fissures/IfTimeSeries/TimeSeriesAccess/is_encoded:1.0
    //
    public boolean
    is_encoded()
    {
        while(true)
        {
            if(!this._is_local())
            {
                org.omg.CORBA.portable.OutputStream out = null;
                org.omg.CORBA.portable.InputStream in = null;
                try
                {
                    out = _request("is_encoded", true);
                    in = _invoke(out);
                    boolean _ob_r = in.read_boolean();
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
                org.omg.CORBA.portable.ServantObject _ob_so = _servant_preinvoke("is_encoded", _ob_opsClass);
                if(_ob_so == null)
                    continue;
                TimeSeriesAccess _ob_self = (TimeSeriesAccess)_ob_so.servant;
                try
                {
                    return _ob_self.is_encoded();
                }
                finally
                {
                    _servant_postinvoke(_ob_so);
                }
            }
        }
    }

    //
    // IDL:iris.edu/Fissures/IfTimeSeries/TimeSeriesAccess/can_convert_to_long:1.0
    //
    public boolean
    can_convert_to_long()
    {
        while(true)
        {
            if(!this._is_local())
            {
                org.omg.CORBA.portable.OutputStream out = null;
                org.omg.CORBA.portable.InputStream in = null;
                try
                {
                    out = _request("can_convert_to_long", true);
                    in = _invoke(out);
                    boolean _ob_r = in.read_boolean();
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
                org.omg.CORBA.portable.ServantObject _ob_so = _servant_preinvoke("can_convert_to_long", _ob_opsClass);
                if(_ob_so == null)
                    continue;
                TimeSeriesAccess _ob_self = (TimeSeriesAccess)_ob_so.servant;
                try
                {
                    return _ob_self.can_convert_to_long();
                }
                finally
                {
                    _servant_postinvoke(_ob_so);
                }
            }
        }
    }

    //
    // IDL:iris.edu/Fissures/IfTimeSeries/TimeSeriesAccess/can_convert_to_float:1.0
    //
    public boolean
    can_convert_to_float()
    {
        while(true)
        {
            if(!this._is_local())
            {
                org.omg.CORBA.portable.OutputStream out = null;
                org.omg.CORBA.portable.InputStream in = null;
                try
                {
                    out = _request("can_convert_to_float", true);
                    in = _invoke(out);
                    boolean _ob_r = in.read_boolean();
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
                org.omg.CORBA.portable.ServantObject _ob_so = _servant_preinvoke("can_convert_to_float", _ob_opsClass);
                if(_ob_so == null)
                    continue;
                TimeSeriesAccess _ob_self = (TimeSeriesAccess)_ob_so.servant;
                try
                {
                    return _ob_self.can_convert_to_float();
                }
                finally
                {
                    _servant_postinvoke(_ob_so);
                }
            }
        }
    }

    //
    // IDL:iris.edu/Fissures/IfTimeSeries/TimeSeriesAccess/can_convert_to_double:1.0
    //
    public boolean
    can_convert_to_double()
    {
        while(true)
        {
            if(!this._is_local())
            {
                org.omg.CORBA.portable.OutputStream out = null;
                org.omg.CORBA.portable.InputStream in = null;
                try
                {
                    out = _request("can_convert_to_double", true);
                    in = _invoke(out);
                    boolean _ob_r = in.read_boolean();
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
                org.omg.CORBA.portable.ServantObject _ob_so = _servant_preinvoke("can_convert_to_double", _ob_opsClass);
                if(_ob_so == null)
                    continue;
                TimeSeriesAccess _ob_self = (TimeSeriesAccess)_ob_so.servant;
                try
                {
                    return _ob_self.can_convert_to_double();
                }
                finally
                {
                    _servant_postinvoke(_ob_so);
                }
            }
        }
    }

    //
    // IDL:iris.edu/Fissures/IfTimeSeries/TimeSeriesAccess/can_convert_to_short:1.0
    //
    public boolean
    can_convert_to_short()
    {
        while(true)
        {
            if(!this._is_local())
            {
                org.omg.CORBA.portable.OutputStream out = null;
                org.omg.CORBA.portable.InputStream in = null;
                try
                {
                    out = _request("can_convert_to_short", true);
                    in = _invoke(out);
                    boolean _ob_r = in.read_boolean();
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
                org.omg.CORBA.portable.ServantObject _ob_so = _servant_preinvoke("can_convert_to_short", _ob_opsClass);
                if(_ob_so == null)
                    continue;
                TimeSeriesAccess _ob_self = (TimeSeriesAccess)_ob_so.servant;
                try
                {
                    return _ob_self.can_convert_to_short();
                }
                finally
                {
                    _servant_postinvoke(_ob_so);
                }
            }
        }
    }

    //
    // IDL:iris.edu/Fissures/IfTimeSeries/TimeSeriesAccess/get_as_longs:1.0
    //
    public int[]
    get_as_longs()
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
                    out = _request("get_as_longs", true);
                    in = _invoke(out);
                    int[] _ob_r = LongSeqHelper.read(in);
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
                org.omg.CORBA.portable.ServantObject _ob_so = _servant_preinvoke("get_as_longs", _ob_opsClass);
                if(_ob_so == null)
                    continue;
                TimeSeriesAccess _ob_self = (TimeSeriesAccess)_ob_so.servant;
                try
                {
                    return _ob_self.get_as_longs();
                }
                finally
                {
                    _servant_postinvoke(_ob_so);
                }
            }
        }
    }

    //
    // IDL:iris.edu/Fissures/IfTimeSeries/TimeSeriesAccess/get_as_shorts:1.0
    //
    public short[]
    get_as_shorts()
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
                    out = _request("get_as_shorts", true);
                    in = _invoke(out);
                    short[] _ob_r = ShortSeqHelper.read(in);
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
                org.omg.CORBA.portable.ServantObject _ob_so = _servant_preinvoke("get_as_shorts", _ob_opsClass);
                if(_ob_so == null)
                    continue;
                TimeSeriesAccess _ob_self = (TimeSeriesAccess)_ob_so.servant;
                try
                {
                    return _ob_self.get_as_shorts();
                }
                finally
                {
                    _servant_postinvoke(_ob_so);
                }
            }
        }
    }

    //
    // IDL:iris.edu/Fissures/IfTimeSeries/TimeSeriesAccess/get_as_floats:1.0
    //
    public float[]
    get_as_floats()
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
                    out = _request("get_as_floats", true);
                    in = _invoke(out);
                    float[] _ob_r = FloatSeqHelper.read(in);
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
                org.omg.CORBA.portable.ServantObject _ob_so = _servant_preinvoke("get_as_floats", _ob_opsClass);
                if(_ob_so == null)
                    continue;
                TimeSeriesAccess _ob_self = (TimeSeriesAccess)_ob_so.servant;
                try
                {
                    return _ob_self.get_as_floats();
                }
                finally
                {
                    _servant_postinvoke(_ob_so);
                }
            }
        }
    }

    //
    // IDL:iris.edu/Fissures/IfTimeSeries/TimeSeriesAccess/get_as_doubles:1.0
    //
    public double[]
    get_as_doubles()
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
                    out = _request("get_as_doubles", true);
                    in = _invoke(out);
                    double[] _ob_r = DoubleSeqHelper.read(in);
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
                org.omg.CORBA.portable.ServantObject _ob_so = _servant_preinvoke("get_as_doubles", _ob_opsClass);
                if(_ob_so == null)
                    continue;
                TimeSeriesAccess _ob_self = (TimeSeriesAccess)_ob_so.servant;
                try
                {
                    return _ob_self.get_as_doubles();
                }
                finally
                {
                    _servant_postinvoke(_ob_so);
                }
            }
        }
    }

    //
    // IDL:iris.edu/Fissures/IfTimeSeries/TimeSeriesAccess/get_as_encoded:1.0
    //
    public EncodedData[]
    get_as_encoded()
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
                    out = _request("get_as_encoded", true);
                    in = _invoke(out);
                    EncodedData[] _ob_r = EncodedSeqHelper.read(in);
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
                org.omg.CORBA.portable.ServantObject _ob_so = _servant_preinvoke("get_as_encoded", _ob_opsClass);
                if(_ob_so == null)
                    continue;
                TimeSeriesAccess _ob_self = (TimeSeriesAccess)_ob_so.servant;
                try
                {
                    return _ob_self.get_as_encoded();
                }
                finally
                {
                    _servant_postinvoke(_ob_so);
                }
            }
        }
    }

    //
    // IDL:iris.edu/Fissures/AuditSystemAccess/get_audit_trail:1.0
    //
    public edu.iris.Fissures.AuditElement[]
    get_audit_trail()
        throws edu.iris.Fissures.NotImplemented
    {
        while(true)
        {
            if(!this._is_local())
            {
                org.omg.CORBA.portable.OutputStream out = null;
                org.omg.CORBA.portable.InputStream in = null;
                try
                {
                    out = _request("get_audit_trail", true);
                    in = _invoke(out);
                    edu.iris.Fissures.AuditElement[] _ob_r = edu.iris.Fissures.AuditTrailHelper.read(in);
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

                    if(_ob_id.equals(edu.iris.Fissures.NotImplementedHelper.id()))
                        throw edu.iris.Fissures.NotImplementedHelper.read(in);
                    throw new org.omg.CORBA.UNKNOWN("Unexpected User Exception: " + _ob_id);
                }
                finally
                {
                    _releaseReply(in);
                }
            }
            else
            {
                org.omg.CORBA.portable.ServantObject _ob_so = _servant_preinvoke("get_audit_trail", _ob_opsClass);
                if(_ob_so == null)
                    continue;
                TimeSeriesAccess _ob_self = (TimeSeriesAccess)_ob_so.servant;
                try
                {
                    return _ob_self.get_audit_trail();
                }
                finally
                {
                    _servant_postinvoke(_ob_so);
                }
            }
        }
    }
}
