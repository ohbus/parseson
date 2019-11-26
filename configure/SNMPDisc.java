package configure;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class SNMPDisc {
    private String ipAddr;
    private String dateTime;
    private String assetNm;
    private String hwAssetCD;
    private Object osNm;
    private String make;
    private String model;
    private String discMode;
    private String commString;
    private String snmpPort;
    private String snmpVrsn;
    private String dataCntrCD;
    private Object hwType;
    private Object cpuOIDFlag;
    private Object memOIDFlag;
    private long cpuStartIndex;
    private long cpuEndIndex;
    private Object userName;
    private Object password;
    private Object domainName;
    private String snmpv3AuthPwd;
    private String snmpv3AuthProtocol;
    private String snmpv3PrivPwd;
    private String snmpv3Uname;
    private String snmpv3PrivProtocol;

    @JsonProperty("IP_ADDR")
    public String getIPAddr() { return ipAddr; }
    @JsonProperty("IP_ADDR")
    public void setIPAddr(String value) { this.ipAddr = value; }

    @JsonProperty("DATE_TIME")
    public String getDateTime() { return dateTime; }
    @JsonProperty("DATE_TIME")
    public void setDateTime(String value) { this.dateTime = value; }

    @JsonProperty("ASSET_NM")
    public String getAssetNm() { return assetNm; }
    @JsonProperty("ASSET_NM")
    public void setAssetNm(String value) { this.assetNm = value; }

    @JsonProperty("HW_ASSET_CD")
    public String getHwAssetCD() { return hwAssetCD; }
    @JsonProperty("HW_ASSET_CD")
    public void setHwAssetCD(String value) { this.hwAssetCD = value; }

    @JsonProperty("OS_NM")
    public Object getOSNm() { return osNm; }
    @JsonProperty("OS_NM")
    public void setOSNm(Object value) { this.osNm = value; }

    @JsonProperty("MAKE")
    public String getMake() { return make; }
    @JsonProperty("MAKE")
    public void setMake(String value) { this.make = value; }

    @JsonProperty("MODEL")
    public String getModel() { return model; }
    @JsonProperty("MODEL")
    public void setModel(String value) { this.model = value; }

    @JsonProperty("DISC_MODE")
    public String getDiscMode() { return discMode; }
    @JsonProperty("DISC_MODE")
    public void setDiscMode(String value) { this.discMode = value; }

    @JsonProperty("COMM_STRING")
    public String getCommString() { return commString; }
    @JsonProperty("COMM_STRING")
    public void setCommString(String value) { this.commString = value; }

    @JsonProperty("SNMP_PORT")
    public String getSNMPPort() { return snmpPort; }
    @JsonProperty("SNMP_PORT")
    public void setSNMPPort(String value) { this.snmpPort = value; }

    @JsonProperty("SNMP_VRSN")
    public String getSNMPVrsn() { return snmpVrsn; }
    @JsonProperty("SNMP_VRSN")
    public void setSNMPVrsn(String value) { this.snmpVrsn = value; }

    @JsonProperty("DATA_CNTR_CD")
    public String getDataCntrCD() { return dataCntrCD; }
    @JsonProperty("DATA_CNTR_CD")
    public void setDataCntrCD(String value) { this.dataCntrCD = value; }

    @JsonProperty("HW_TYPE")
    public Object getHwType() { return hwType; }
    @JsonProperty("HW_TYPE")
    public void setHwType(Object value) { this.hwType = value; }

    @JsonProperty("CPU_OID_FLAG")
    public Object getCPUOIDFlag() { return cpuOIDFlag; }
    @JsonProperty("CPU_OID_FLAG")
    public void setCPUOIDFlag(Object value) { this.cpuOIDFlag = value; }

    @JsonProperty("MEM_OID_FLAG")
    public Object getMemOIDFlag() { return memOIDFlag; }
    @JsonProperty("MEM_OID_FLAG")
    public void setMemOIDFlag(Object value) { this.memOIDFlag = value; }

    @JsonProperty("CPU_START_INDEX")
    public long getCPUStartIndex() { return cpuStartIndex; }
    @JsonProperty("CPU_START_INDEX")
    public void setCPUStartIndex(long value) { this.cpuStartIndex = value; }

    @JsonProperty("CPU_END_INDEX")
    public long getCPUEndIndex() { return cpuEndIndex; }
    @JsonProperty("CPU_END_INDEX")
    public void setCPUEndIndex(long value) { this.cpuEndIndex = value; }

    @JsonProperty("USER_NAME")
    public Object getUserName() { return userName; }
    @JsonProperty("USER_NAME")
    public void setUserName(Object value) { this.userName = value; }

    @JsonProperty("PASSWORD")
    public Object getPassword() { return password; }
    @JsonProperty("PASSWORD")
    public void setPassword(Object value) { this.password = value; }

    @JsonProperty("DOMAIN_NAME")
    public Object getDomainName() { return domainName; }
    @JsonProperty("DOMAIN_NAME")
    public void setDomainName(Object value) { this.domainName = value; }

    @JsonProperty("SNMPV3_AUTH_PWD")
    public String getSnmpv3AuthPwd() { return snmpv3AuthPwd; }
    @JsonProperty("SNMPV3_AUTH_PWD")
    public void setSnmpv3AuthPwd(String value) { this.snmpv3AuthPwd = value; }

    @JsonProperty("SNMPV3_AUTH_PROTOCOL")
    public String getSnmpv3AuthProtocol() { return snmpv3AuthProtocol; }
    @JsonProperty("SNMPV3_AUTH_PROTOCOL")
    public void setSnmpv3AuthProtocol(String value) { this.snmpv3AuthProtocol = value; }

    @JsonProperty("SNMPV3_PRIV_PWD")
    public String getSnmpv3PrivPwd() { return snmpv3PrivPwd; }
    @JsonProperty("SNMPV3_PRIV_PWD")
    public void setSnmpv3PrivPwd(String value) { this.snmpv3PrivPwd = value; }

    @JsonProperty("SNMPV3_UNAME")
    public String getSnmpv3Uname() { return snmpv3Uname; }
    @JsonProperty("SNMPV3_UNAME")
    public void setSnmpv3Uname(String value) { this.snmpv3Uname = value; }

    @JsonProperty("SNMPV3_PRIV_PROTOCOL")
    public String getSnmpv3PrivProtocol() { return snmpv3PrivProtocol; }
    @JsonProperty("SNMPV3_PRIV_PROTOCOL")
    public void setSnmpv3PrivProtocol(String value) { this.snmpv3PrivProtocol = value; }
}
