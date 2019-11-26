package configure;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class MIBDetailsNonOS {
    private String mibID;
    private String make;
    private String model;
    private String sensorOEM;
    private String deviceUnit;
    private String rvalMode;
    private String oid;
    private String parameterUnit;

    @JsonProperty("mib_id")
    public String getMIBID() { return mibID; }
    @JsonProperty("mib_id")
    public void setMIBID(String value) { this.mibID = value; }

    @JsonProperty("make")
    public String getMake() { return make; }
    @JsonProperty("make")
    public void setMake(String value) { this.make = value; }

    @JsonProperty("model")
    public String getModel() { return model; }
    @JsonProperty("model")
    public void setModel(String value) { this.model = value; }

    @JsonProperty("sensor_oem")
    public String getSensorOEM() { return sensorOEM; }
    @JsonProperty("sensor_oem")
    public void setSensorOEM(String value) { this.sensorOEM = value; }

    @JsonProperty("device_unit")
    public String getDeviceUnit() { return deviceUnit; }
    @JsonProperty("device_unit")
    public void setDeviceUnit(String value) { this.deviceUnit = value; }

    @JsonProperty("rval_mode")
    public String getRvalMode() { return rvalMode; }
    @JsonProperty("rval_mode")
    public void setRvalMode(String value) { this.rvalMode = value; }

    @JsonProperty("oid")
    public String getOID() { return oid; }
    @JsonProperty("oid")
    public void setOID(String value) { this.oid = value; }

    @JsonProperty("parameter_unit")
    public String getParameterUnit() { return parameterUnit; }
    @JsonProperty("parameter_unit")
    public void setParameterUnit(String value) { this.parameterUnit = value; }
}
