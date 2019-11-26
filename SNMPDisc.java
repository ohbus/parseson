package configure;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class SNMPDisc {
    private String ipAddr;
    private String dateTime;
    private String assetNm;
    private String hwAssetCD;
    private String make;
    private String model;
    private String discMode;
    private String commString;
    private String snmpPort;
    private String snmpVersion;
    private String dataCntrCD;
    private String cpuStartIndex;
    private String cpuEndIndex;
    private String snmpv3AuthPwd;
    private String snmpv3PrivPwd;

    @JsonProperty("ip_addr")
    public String getIPAddr() { return ipAddr; }
    @JsonProperty("ip_addr")
    public void setIPAddr(String value) { this.ipAddr = value; }

    @JsonProperty("date_time")
    public String getDateTime() { return dateTime; }
    @JsonProperty("date_time")
    public void setDateTime(String value) { this.dateTime = value; }

    @JsonProperty("asset_nm")
    public String getAssetNm() { return assetNm; }
    @JsonProperty("asset_nm")
    public void setAssetNm(String value) { this.assetNm = value; }

    @JsonProperty("hw_asset_cd")
    public String getHwAssetCD() { return hwAssetCD; }
    @JsonProperty("hw_asset_cd")
    public void setHwAssetCD(String value) { this.hwAssetCD = value; }

    @JsonProperty("make")
    public String getMake() { return make; }
    @JsonProperty("make")
    public void setMake(String value) { this.make = value; }

    @JsonProperty("model")
    public String getModel() { return model; }
    @JsonProperty("model")
    public void setModel(String value) { this.model = value; }

    @JsonProperty("disc_mode")
    public String getDiscMode() { return discMode; }
    @JsonProperty("disc_mode")
    public void setDiscMode(String value) { this.discMode = value; }

    @JsonProperty("comm_string")
    public String getCommString() { return commString; }
    @JsonProperty("comm_string")
    public void setCommString(String value) { this.commString = value; }

    @JsonProperty("snmp_port")
    public String getSNMPPort() { return snmpPort; }
    @JsonProperty("snmp_port")
    public void setSNMPPort(String value) { this.snmpPort = value; }

    @JsonProperty("snmp_version")
    public String getSNMPVersion() { return snmpVersion; }
    @JsonProperty("snmp_version")
    public void setSNMPVersion(String value) { this.snmpVersion = value; }

    @JsonProperty("data_cntr_cd")
    public String getDataCntrCD() { return dataCntrCD; }
    @JsonProperty("data_cntr_cd")
    public void setDataCntrCD(String value) { this.dataCntrCD = value; }

    @JsonProperty("cpu_start_index")
    public String getCPUStartIndex() { return cpuStartIndex; }
    @JsonProperty("cpu_start_index")
    public void setCPUStartIndex(String value) { this.cpuStartIndex = value; }

    @JsonProperty("cpu_end_index")
    public String getCPUEndIndex() { return cpuEndIndex; }
    @JsonProperty("cpu_end_index")
    public void setCPUEndIndex(String value) { this.cpuEndIndex = value; }

    @JsonProperty("snmpv3_auth_pwd")
    public String getSnmpv3AuthPwd() { return snmpv3AuthPwd; }
    @JsonProperty("snmpv3_auth_pwd")
    public void setSnmpv3AuthPwd(String value) { this.snmpv3AuthPwd = value; }

    @JsonProperty("snmpv3_priv_pwd")
    public String getSnmpv3PrivPwd() { return snmpv3PrivPwd; }
    @JsonProperty("snmpv3_priv_pwd")
    public void setSnmpv3PrivPwd(String value) { this.snmpv3PrivPwd = value; }
}
