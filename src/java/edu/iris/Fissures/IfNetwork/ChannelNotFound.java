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
// IDL:iris.edu/Fissures/IfNetwork/ChannelNotFound:1.0
//
/***/

final public class ChannelNotFound extends org.omg.CORBA.UserException
{
    public
    ChannelNotFound()
    {
        super(ChannelNotFoundHelper.id());
    }

    public
    ChannelNotFound(ChannelId channel)
    {
        super(ChannelNotFoundHelper.id());
        this.channel = channel;
    }

    public
    ChannelNotFound(String _reason,
                    ChannelId channel)
    {
        super(ChannelNotFoundHelper.id() + " " + _reason);
        this.channel = channel;
    }

    public ChannelId channel;
}
