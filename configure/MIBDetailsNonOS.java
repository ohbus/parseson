package configure;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class MIBDetailsNonOS {
    private long mibID;
    private String make;
    private String model;
    private Object sensorOEM;
    private long deviceUnit;
    private String rvalMode;
    private String oid;
    private String parameterUnit;

    @JsonProperty("MIB_ID")
    public long getMIBID() { return mibID; }
    @JsonProperty("MIB_ID")
    public void setMIBID(long value) { this.mibID = value; }

    @JsonProperty("MAKE")
    public String getMake() { return make; }
    @JsonProperty("MAKE")
    public void setMake(String value) { this.make = value; }

    @JsonProperty("MODEL")
    public String getModel() { return model; }
    @JsonProperty("MODEL")
    public void setModel(String value) { this.model = value; }

    @JsonProperty("SENSOR_OEM")
    public Object getSensorOEM() { return sensorOEM; }
    @JsonProperty("SENSOR_OEM")
    public void setSensorOEM(Object value) { this.sensorOEM = value; }

    @JsonProperty("DEVICE_UNIT")
    public long getDeviceUnit() { return deviceUnit; }
    @JsonProperty("DEVICE_UNIT")
    public void setDeviceUnit(long value) { this.deviceUnit = value; }

    @JsonProperty("RVAL_MODE")
    public String getRvalMode() { return rvalMode; }
    @JsonProperty("RVAL_MODE")
    public void setRvalMode(String value) { this.rvalMode = value; }

    @JsonProperty("OID")
    public String getOID() { return oid; }
    @JsonProperty("OID")
    public void setOID(String value) { this.oid = value; }

    @JsonProperty("PARAMETER_UNIT")
    public String getParameterUnit() { return parameterUnit; }
    @JsonProperty("PARAMETER_UNIT")
    public void setParameterUnit(String value) { this.parameterUnit = value; }
}
