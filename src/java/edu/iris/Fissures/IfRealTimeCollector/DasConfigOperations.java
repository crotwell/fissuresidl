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
// IDL:iris.edu/Fissures/IfRealTimeCollector/DasConfig:1.0
//
/**
 * This is the configuration interface for data acquisistion devices
 * This provides a standard interface for remote management of
 * das devices.
 **/

public interface DasConfigOperations
{
    //
    // IDL:iris.edu/Fissures/IfRealTimeCollector/DasConfig/set_collector_by_ref:1.0
    //
    /**
     * Sets the collectors that this data acquisition device is to
     * send data to. The das developer may allow more than one
     * collector. If the maximum allowed is exceeded by the call the
     * CollectorMaxExceeded is called
     **/

    void
    set_collector_by_ref(RealTimeCollector[] collectors)
        throws CollectorMaxExceeded;

    //
    // IDL:iris.edu/Fissures/IfRealTimeCollector/DasConfig/set_collector_by_string:1.0
    //
    /***/

    void
    set_collector_by_string(String[] collectors)
        throws CollectorMaxExceeded;

    //
    // IDL:iris.edu/Fissures/IfRealTimeCollector/DasConfig/add_collector_by_ref:1.0
    //
    /***/

    void
    add_collector_by_ref(RealTimeCollector[] collectors)
        throws CollectorMaxExceeded;

    //
    // IDL:iris.edu/Fissures/IfRealTimeCollector/DasConfig/add_collector_by_string:1.0
    //
    /***/

    void
    add_collector_by_string(String[] collectors)
        throws CollectorMaxExceeded;

    //
    // IDL:iris.edu/Fissures/IfRealTimeCollector/DasConfig/set_soh_by_ref:1.0
    //
    /***/

    void
    set_soh_by_ref(DasSoh das_id)
        throws edu.iris.Fissures.NotImplemented;

    //
    // IDL:iris.edu/Fissures/IfRealTimeCollector/DasConfig/set_soh_by_string:1.0
    //
    /***/

    void
    set_soh_by_string(String[] das_ref)
        throws edu.iris.Fissures.NotImplemented;
}
