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

package edu.iris.Fissures.IfDataSetMgr;

//
// IDL:iris.edu/Fissures/IfDataSetMgr/RemoteDataSet:1.0
//
public abstract class RemoteDataSetPOA
    extends org.omg.PortableServer.Servant
    implements org.omg.CORBA.portable.InvokeHandler,
               RemoteDataSetOperations
{
    static final String[] _ob_ids_ =
    {
        "IDL:iris.edu/Fissures/IfDataSetMgr/RemoteDataSet:1.0",
        "IDL:iris.edu/Fissures/IfDataSetMgr/DataSet:1.0",
        "IDL:iris.edu/Fissures/IfDataSetMgr/DataSetAccess:1.0",
        "IDL:iris.edu/Fissures/AuditSystemAccess:1.0",
        "IDL:iris.edu/Fissures/IfDataSetMgr/RemoteDataSetAccess:1.0",
        "IDL:iris.edu/Fissures/IfDataSetMgr/DataSetComponent:1.0"
    };

    public RemoteDataSet
    _this()
    {
        return RemoteDataSetHelper.narrow(super._this_object());
    }

    public RemoteDataSet
    _this(org.omg.CORBA.ORB orb)
    {
        return RemoteDataSetHelper.narrow(super._this_object(orb));
    }

    public String[]
    _all_interfaces(org.omg.PortableServer.POA poa, byte[] objectId)
    {
        return _ob_ids_;
    }

    public org.omg.CORBA.portable.OutputStream
    _invoke(String opName,
            org.omg.CORBA.portable.InputStream in,
            org.omg.CORBA.portable.ResponseHandler handler)
    {
        final String[] _ob_names =
        {
            "_get_a_factory",
            "_get_a_finder",
            "_get_a_writeable",
            "_get_parm_svc",
            "add_dataset",
            "add_motion_vector",
            "add_seismogram",
            "destroy",
            "get_attributes",
            "get_audit_trail",
            "get_datasets",
            "get_motion_vectors",
            "get_seismograms",
            "localize",
            "remove_node",
            "update_dataset"
        };

        int _ob_left = 0;
        int _ob_right = _ob_names.length;
        int _ob_index = -1;

        while(_ob_left < _ob_right)
        {
            int _ob_m = (_ob_left + _ob_right) / 2;
            int _ob_res = _ob_names[_ob_m].compareTo(opName);
            if(_ob_res == 0)
            {
                _ob_index = _ob_m;
                break;
            }
            else if(_ob_res > 0)
                _ob_right = _ob_m;
            else
                _ob_left = _ob_m + 1;
        }

        switch(_ob_index)
        {
        case 0: // _get_a_factory
            return _OB_att_get_a_factory(in, handler);

        case 1: // _get_a_finder
            return _OB_att_get_a_finder(in, handler);

        case 2: // _get_a_writeable
            return _OB_att_get_a_writeable(in, handler);

        case 3: // _get_parm_svc
            return _OB_att_get_parm_svc(in, handler);

        case 4: // add_dataset
            return _OB_op_add_dataset(in, handler);

        case 5: // add_motion_vector
            return _OB_op_add_motion_vector(in, handler);

        case 6: // add_seismogram
            return _OB_op_add_seismogram(in, handler);

        case 7: // destroy
            return _OB_op_destroy(in, handler);

        case 8: // get_attributes
            return _OB_op_get_attributes(in, handler);

        case 9: // get_audit_trail
            return _OB_op_get_audit_trail(in, handler);

        case 10: // get_datasets
            return _OB_op_get_datasets(in, handler);

        case 11: // get_motion_vectors
            return _OB_op_get_motion_vectors(in, handler);

        case 12: // get_seismograms
            return _OB_op_get_seismograms(in, handler);

        case 13: // localize
            return _OB_op_localize(in, handler);

        case 14: // remove_node
            return _OB_op_remove_node(in, handler);

        case 15: // update_dataset
            return _OB_op_update_dataset(in, handler);
        }

        throw new org.omg.CORBA.BAD_OPERATION();
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_att_get_a_factory(org.omg.CORBA.portable.InputStream in,
                          org.omg.CORBA.portable.ResponseHandler handler)
    {
        DataSetFactory _ob_r = a_factory();
        org.omg.CORBA.portable.OutputStream out = handler.createReply();
        DataSetFactoryHelper.write(out, _ob_r);
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_att_get_a_finder(org.omg.CORBA.portable.InputStream in,
                         org.omg.CORBA.portable.ResponseHandler handler)
    {
        DataSetFinder _ob_r = a_finder();
        org.omg.CORBA.portable.OutputStream out = handler.createReply();
        DataSetFinderHelper.write(out, _ob_r);
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_att_get_a_writeable(org.omg.CORBA.portable.InputStream in,
                            org.omg.CORBA.portable.ResponseHandler handler)
    {
        DataSet _ob_r = a_writeable();
        org.omg.CORBA.portable.OutputStream out = handler.createReply();
        DataSetHelper.write(out, _ob_r);
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_att_get_parm_svc(org.omg.CORBA.portable.InputStream in,
                         org.omg.CORBA.portable.ResponseHandler handler)
    {
        edu.iris.Fissures.IfParameterMgr.ParameterComponent _ob_r = parm_svc();
        org.omg.CORBA.portable.OutputStream out = handler.createReply();
        edu.iris.Fissures.IfParameterMgr.ParameterComponentHelper.write(out, _ob_r);
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_add_dataset(org.omg.CORBA.portable.InputStream in,
                       org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        try
        {
            DataSetAccess _ob_a0 = DataSetAccessHelper.read(in);
            edu.iris.Fissures.AuditInfo[] _ob_a1 = edu.iris.Fissures.AuditInfoOptHelper.read(in);
            add_dataset(_ob_a0, _ob_a1);
            out = handler.createReply();
        }
        catch(NotFound _ob_ex)
        {
            out = handler.createExceptionReply();
            NotFoundHelper.write(out, _ob_ex);
        }
        catch(NotADataSet _ob_ex)
        {
            out = handler.createExceptionReply();
            NotADataSetHelper.write(out, _ob_ex);
        }
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_add_motion_vector(org.omg.CORBA.portable.InputStream in,
                             org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        try
        {
            MotionVectorNode _ob_a0 = MotionVectorNodeHelper.read(in);
            edu.iris.Fissures.AuditInfo[] _ob_a1 = edu.iris.Fissures.AuditInfoOptHelper.read(in);
            String _ob_r = add_motion_vector(_ob_a0, _ob_a1);
            out = handler.createReply();
            NodeIdHelper.write(out, _ob_r);
        }
        catch(edu.iris.Fissures.FissuresException _ob_ex)
        {
            out = handler.createExceptionReply();
            edu.iris.Fissures.FissuresExceptionHelper.write(out, _ob_ex);
        }
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_add_seismogram(org.omg.CORBA.portable.InputStream in,
                          org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        try
        {
            edu.iris.Fissures.IfSeismogramMgr.SeismogramAccess _ob_a0 = edu.iris.Fissures.IfSeismogramMgr.SeismogramAccessHelper.read(in);
            edu.iris.Fissures.AuditInfo[] _ob_a1 = edu.iris.Fissures.AuditInfoOptHelper.read(in);
            String _ob_r = add_seismogram(_ob_a0, _ob_a1);
            out = handler.createReply();
            NodeIdHelper.write(out, _ob_r);
        }
        catch(edu.iris.Fissures.FissuresException _ob_ex)
        {
            out = handler.createExceptionReply();
            edu.iris.Fissures.FissuresExceptionHelper.write(out, _ob_ex);
        }
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_destroy(org.omg.CORBA.portable.InputStream in,
                   org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        destroy();
        out = handler.createReply();
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_get_attributes(org.omg.CORBA.portable.InputStream in,
                          org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        DataSetAttr _ob_r = get_attributes();
        out = handler.createReply();
        DataSetAttrHelper.write(out, _ob_r);
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_get_audit_trail(org.omg.CORBA.portable.InputStream in,
                           org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        try
        {
            edu.iris.Fissures.AuditElement[] _ob_r = get_audit_trail();
            out = handler.createReply();
            edu.iris.Fissures.AuditTrailHelper.write(out, _ob_r);
        }
        catch(edu.iris.Fissures.NotImplemented _ob_ex)
        {
            out = handler.createExceptionReply();
            edu.iris.Fissures.NotImplementedHelper.write(out, _ob_ex);
        }
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_get_datasets(org.omg.CORBA.portable.InputStream in,
                        org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        DataSetAccess[] _ob_r = get_datasets();
        out = handler.createReply();
        DataSetAccessSeqHelper.write(out, _ob_r);
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_get_motion_vectors(org.omg.CORBA.portable.InputStream in,
                              org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        MotionVectorNode[] _ob_r = get_motion_vectors();
        out = handler.createReply();
        MotionVectorNodeSeqHelper.write(out, _ob_r);
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_get_seismograms(org.omg.CORBA.portable.InputStream in,
                           org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        SeismogramNode[] _ob_r = get_seismograms();
        out = handler.createReply();
        SeismogramNodeSeqHelper.write(out, _ob_r);
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_localize(org.omg.CORBA.portable.InputStream in,
                    org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        LocalDataSet _ob_r = localize();
        out = handler.createReply();
        LocalDataSetHelper.write(out, _ob_r);
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_remove_node(org.omg.CORBA.portable.InputStream in,
                       org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        try
        {
            String _ob_a0 = NodeIdHelper.read(in);
            edu.iris.Fissures.AuditInfo[] _ob_a1 = edu.iris.Fissures.AuditInfoOptHelper.read(in);
            remove_node(_ob_a0, _ob_a1);
            out = handler.createReply();
        }
        catch(edu.iris.Fissures.FissuresException _ob_ex)
        {
            out = handler.createExceptionReply();
            edu.iris.Fissures.FissuresExceptionHelper.write(out, _ob_ex);
        }
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_update_dataset(org.omg.CORBA.portable.InputStream in,
                          org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        try
        {
            DataSetAttr _ob_a0 = DataSetAttrHelper.read(in);
            edu.iris.Fissures.AuditInfo[] _ob_a1 = edu.iris.Fissures.AuditInfoOptHelper.read(in);
            update_dataset(_ob_a0, _ob_a1);
            out = handler.createReply();
        }
        catch(edu.iris.Fissures.FissuresException _ob_ex)
        {
            out = handler.createExceptionReply();
            edu.iris.Fissures.FissuresExceptionHelper.write(out, _ob_ex);
        }
        return out;
    }
}
