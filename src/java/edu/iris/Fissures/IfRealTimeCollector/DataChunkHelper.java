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

package edu.iris.Fissures.IfRealTimeCollector;

//
// IDL:iris.edu/Fissures/IfRealTimeCollector/DataChunk:1.0
//
final public class DataChunkHelper
{
    public static void
    insert(org.omg.CORBA.Any any, DataChunk val)
    {
        org.omg.CORBA.portable.OutputStream out = any.create_output_stream();
        write(out, val);
        any.read_value(out.create_input_stream(), type());
    }

    public static DataChunk
    extract(org.omg.CORBA.Any any)
    {
        if(any.type().equivalent(type()))
            return read(any.create_input_stream());
        else
            throw new org.omg.CORBA.BAD_OPERATION();
    }

    private static org.omg.CORBA.TypeCode typeCode_;

    public static org.omg.CORBA.TypeCode
    type()
    {
        if(typeCode_ == null)
        {
            org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init();
            org.omg.CORBA.StructMember[] members = new org.omg.CORBA.StructMember[5];

            members[0] = new org.omg.CORBA.StructMember();
            members[0].name = "seq_num";
            members[0].type = orb.get_primitive_tc(org.omg.CORBA.TCKind.tk_long);

            members[1] = new org.omg.CORBA.StructMember();
            members[1].name = "channel";
            members[1].type = ChannelIdHelper.type();

            members[2] = new org.omg.CORBA.StructMember();
            members[2].name = "begin_time";
            members[2].type = edu.iris.Fissures.TimeHelper.type();

            members[3] = new org.omg.CORBA.StructMember();
            members[3].name = "data";
            members[3].type = TimeSeriesDataSelHelper.type();

            members[4] = new org.omg.CORBA.StructMember();
            members[4].name = "end_time";
            members[4].type = edu.iris.Fissures.TimeHelper.type();

            typeCode_ = orb.create_struct_tc(id(), "DataChunk", members);
        }

        return typeCode_;
    }

    public static String
    id()
    {
        return "IDL:iris.edu/Fissures/IfRealTimeCollector/DataChunk:1.0";
    }

    public static DataChunk
    read(org.omg.CORBA.portable.InputStream in)
    {
        DataChunk _ob_v = new DataChunk();
        _ob_v.seq_num = in.read_long();
        _ob_v.channel = ChannelIdHelper.read(in);
        _ob_v.begin_time = edu.iris.Fissures.TimeHelper.read(in);
        _ob_v.data = TimeSeriesDataSelHelper.read(in);
        _ob_v.end_time = edu.iris.Fissures.TimeHelper.read(in);
        return _ob_v;
    }

    public static void
    write(org.omg.CORBA.portable.OutputStream out, DataChunk val)
    {
        out.write_long(val.seq_num);
        ChannelIdHelper.write(out, val.channel);
        edu.iris.Fissures.TimeHelper.write(out, val.begin_time);
        TimeSeriesDataSelHelper.write(out, val.data);
        edu.iris.Fissures.TimeHelper.write(out, val.end_time);
    }
}
