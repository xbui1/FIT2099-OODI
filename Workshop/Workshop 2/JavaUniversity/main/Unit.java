/**
 * Eric Jiang
 * 27849821
 */


package main;

public class Unit {

    public String UnitCode;
    public String UnitName;
    public String UnitDescription;

    public String getUnitCode() {
        return UnitCode;
    }

    public void setUnitCode(String unitCode) {
        UnitCode = unitCode;
    }

    public String getUnitName() {
        return UnitName;
    }

    public void setUnitName(String unitName) {
        UnitName = unitName;
    }

    public String getUnitDescription() {
        return UnitDescription;
    }

    public void setUnitDescription() {
        UnitDescription = getUnitCode() + getUnitName();
    }
}
