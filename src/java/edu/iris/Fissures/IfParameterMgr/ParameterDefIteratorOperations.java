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
// IDL:iris.edu/Fissures/IfParameterMgr/ParameterDefIterator:1.0
//
/***/

public interface ParameterDefIteratorOperations extends edu.iris.Fissures.FissuresIterator
{
    //
    // IDL:iris.edu/Fissures/IfParameterMgr/ParameterDefIterator/next_one:1.0
    //
    /***/

    boolean
    next_one(ParmDefHolder parmeter);

    //
    // IDL:iris.edu/Fissures/IfParameterMgr/ParameterDefIterator/next_n:1.0
    //
    /***/

    boolean
    next_n(int how_many,
           ParmDefSeqHolder parm_defs);
}
