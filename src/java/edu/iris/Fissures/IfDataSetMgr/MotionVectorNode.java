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
// IDL:iris.edu/Fissures/IfDataSetMgr/MotionVectorNode:1.0
//
/**
 *  DataSet may contain MotionVectors. A MotionVector is a group of
 *  Seismogram with the same begin time, sample rate and number of
 *  points. It will typically represent a set of seismograms from
 *  given site for 2 to 3 different directions of motion.
 **/

public abstract class MotionVectorNode implements org.omg.CORBA.portable.StreamableValue
{
    //
    // IDL:iris.edu/Fissures/IfDataSetMgr/MotionVectorNode/id:1.0
    //
    /***/

    protected String id;

    //
    // IDL:iris.edu/Fissures/IfDataSetMgr/MotionVectorNode/get_id:1.0
    //
    /***/

    public abstract String
    get_id();

    //
    // IDL:iris.edu/Fissures/IfDataSetMgr/MotionVectorNode/seismograms:1.0
    //
    /***/

    public edu.iris.Fissures.IfSeismogramMgr.SeismogramAccess[] seismograms;

    //
    // IDL:iris.edu/Fissures/IfDataSetMgr/MotionVectorNode/parm_ids:1.0
    //
    /***/

    public edu.iris.Fissures.IfParameterMgr.ParameterRef[] parm_ids;

    private static String[] _OB_truncatableIds_ =
    {
        MotionVectorNodeHelper.id()
    };

    public String[]
    _truncatable_ids()
    {
        return _OB_truncatableIds_;
    }

    public void
    _read(org.omg.CORBA.portable.InputStream in)
    {
        id = NodeIdHelper.read(in);
        int len0 = in.read_ulong();
        seismograms = new edu.iris.Fissures.IfSeismogramMgr.SeismogramAccess[len0];
        for(int i0 = 0 ; i0 < len0 ; i0++)
            seismograms[i0] = edu.iris.Fissures.IfSeismogramMgr.SeismogramAccessHelper.read(in);
        int len1 = in.read_ulong();
        parm_ids = new edu.iris.Fissures.IfParameterMgr.ParameterRef[len1];
        for(int i1 = 0 ; i1 < len1 ; i1++)
            parm_ids[i1] = ParameterRefHelper.read(in);
    }

    public void
    _write(org.omg.CORBA.portable.OutputStream out)
    {
        NodeIdHelper.write(out, id);
        int len0 = seismograms.length;
        if(len0 > 3)
             throw new org.omg.CORBA.MARSHAL();
        out.write_ulong(len0);
        for(int i0 = 0 ; i0 < len0 ; i0++)
            edu.iris.Fissures.IfSeismogramMgr.SeismogramAccessHelper.write(out, seismograms[i0]);
        int len1 = parm_ids.length;
        out.write_ulong(len1);
        for(int i1 = 0 ; i1 < len1 ; i1++)
            ParameterRefHelper.write(out, parm_ids[i1]);
    }

    public org.omg.CORBA.TypeCode
    _type()
    {
        return MotionVectorNodeHelper.type();
    }
}
