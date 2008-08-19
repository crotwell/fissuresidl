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

package edu.iris.Fissures;

//
// IDL:iris.edu/Fissures/UnitBase:1.0
//
/** With  two exceptions, the Fissures units use SI base units.
 *These are METER, GRAM, SECOND, AMPERE, KELVIN, MOLE, CANDELA,
 *and COUNT. The two differences with SI are that gram is used
 *instead of kilogram, largely to make automatic name generation
 *easier, and the addition of count as a convenience. Also, COMPOSITE
 *has been added to signify that this is a composite unit as this field
 *cannot be null.
 **/

final public class UnitBase implements org.omg.CORBA.portable.IDLEntity
{
    private static UnitBase [] values_ = new UnitBase[9];
    private int value_;

    public final static int _METER = 0;
    public final static UnitBase METER = new UnitBase(_METER);
    public final static int _GRAM = 1;
    public final static UnitBase GRAM = new UnitBase(_GRAM);
    public final static int _SECOND = 2;
    public final static UnitBase SECOND = new UnitBase(_SECOND);
    public final static int _AMPERE = 3;
    public final static UnitBase AMPERE = new UnitBase(_AMPERE);
    public final static int _KELVIN = 4;
    public final static UnitBase KELVIN = new UnitBase(_KELVIN);
    public final static int _MOLE = 5;
    public final static UnitBase MOLE = new UnitBase(_MOLE);
    public final static int _CANDELA = 6;
    public final static UnitBase CANDELA = new UnitBase(_CANDELA);
    public final static int _COUNT = 7;
    public final static UnitBase COUNT = new UnitBase(_COUNT);
    public final static int _COMPOSITE = 8;
    public final static UnitBase COMPOSITE = new UnitBase(_COMPOSITE);

    protected
    UnitBase(int value)
    {
        values_[value] = this;
        value_ = value;
    }

    public int
    value()
    {
        return value_;
    }

    public static UnitBase
    from_int(int value)
    {
        return values_[value];
    }
}
