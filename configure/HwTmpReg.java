package configure;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class HwTmpReg {
    private Object hwType;
    private Object hwSubType;
    private String hostNm;
    private Object hwAssetTag;
    private Object hwMdlNo;
    private Object hwSerialID;
    private Object mfrNm;
    private Object cmNcmFlag;
    private String osNmVer;
    private Object procsrSpec;
    private Object ramMemSpec;
    private Object hddSize;
    private Object serverHT;
    private Object serverWth;
    private Object serverLen;
    private Object serverWgt;
    private Object initialPrice;
    private Object prcmntDate;
    private Object inVolt;
    private Object heatDsptd;
    private Object tempLow;
    private Object tempHigh;
    private Object salvVal;
    private Object vrtlServer;
    private Object inAmp;
    private Object noProcsr;
    private Object maxPwr;
    private Object idlePwr;
    private Object virtualizable;
    private Object humidity;
    private Object capacity;
    private Object noCore;
    private String createDateTime;
    private Object deviceValue;
    private Object deviceType;
    private String ipAddr;
    private Object warranty;

    @JsonProperty("HW_TYPE")
    public Object getHwType() { return hwType; }
    @JsonProperty("HW_TYPE")
    public void setHwType(Object value) { this.hwType = value; }

    @JsonProperty("HW_SUB_TYPE")
    public Object getHwSubType() { return hwSubType; }
    @JsonProperty("HW_SUB_TYPE")
    public void setHwSubType(Object value) { this.hwSubType = value; }

    @JsonProperty("HOST_NM")
    public String getHostNm() { return hostNm; }
    @JsonProperty("HOST_NM")
    public void setHostNm(String value) { this.hostNm = value; }

    @JsonProperty("HW_ASSET_TAG")
    public Object getHwAssetTag() { return hwAssetTag; }
    @JsonProperty("HW_ASSET_TAG")
    public void setHwAssetTag(Object value) { this.hwAssetTag = value; }

    @JsonProperty("HW_MDL_NO")
    public Object getHwMdlNo() { return hwMdlNo; }
    @JsonProperty("HW_MDL_NO")
    public void setHwMdlNo(Object value) { this.hwMdlNo = value; }

    @JsonProperty("HW_SERIAL_ID")
    public Object getHwSerialID() { return hwSerialID; }
    @JsonProperty("HW_SERIAL_ID")
    public void setHwSerialID(Object value) { this.hwSerialID = value; }

    @JsonProperty("MFR_NM")
    public Object getMfrNm() { return mfrNm; }
    @JsonProperty("MFR_NM")
    public void setMfrNm(Object value) { this.mfrNm = value; }

    @JsonProperty("CM_NCM_FLAG")
    public Object getCMNcmFlag() { return cmNcmFlag; }
    @JsonProperty("CM_NCM_FLAG")
    public void setCMNcmFlag(Object value) { this.cmNcmFlag = value; }

    @JsonProperty("OS_NM_VER")
    public String getOSNmVer() { return osNmVer; }
    @JsonProperty("OS_NM_VER")
    public void setOSNmVer(String value) { this.osNmVer = value; }

    @JsonProperty("PROCSR_SPEC")
    public Object getProcsrSpec() { return procsrSpec; }
    @JsonProperty("PROCSR_SPEC")
    public void setProcsrSpec(Object value) { this.procsrSpec = value; }

    @JsonProperty("RAM_MEM_SPEC")
    public Object getRAMMemSpec() { return ramMemSpec; }
    @JsonProperty("RAM_MEM_SPEC")
    public void setRAMMemSpec(Object value) { this.ramMemSpec = value; }

    @JsonProperty("HDD_SIZE")
    public Object getHDDSize() { return hddSize; }
    @JsonProperty("HDD_SIZE")
    public void setHDDSize(Object value) { this.hddSize = value; }

    @JsonProperty("SERVER_HT")
    public Object getServerHT() { return serverHT; }
    @JsonProperty("SERVER_HT")
    public void setServerHT(Object value) { this.serverHT = value; }

    @JsonProperty("SERVER_WTH")
    public Object getServerWth() { return serverWth; }
    @JsonProperty("SERVER_WTH")
    public void setServerWth(Object value) { this.serverWth = value; }

    @JsonProperty("SERVER_LEN")
    public Object getServerLen() { return serverLen; }
    @JsonProperty("SERVER_LEN")
    public void setServerLen(Object value) { this.serverLen = value; }

    @JsonProperty("SERVER_WGT")
    public Object getServerWgt() { return serverWgt; }
    @JsonProperty("SERVER_WGT")
    public void setServerWgt(Object value) { this.serverWgt = value; }

    @JsonProperty("INITIAL_PRICE")
    public Object getInitialPrice() { return initialPrice; }
    @JsonProperty("INITIAL_PRICE")
    public void setInitialPrice(Object value) { this.initialPrice = value; }

    @JsonProperty("PRCMNT_DATE")
    public Object getPrcmntDate() { return prcmntDate; }
    @JsonProperty("PRCMNT_DATE")
    public void setPrcmntDate(Object value) { this.prcmntDate = value; }

    @JsonProperty("IN_VOLT")
    public Object getInVolt() { return inVolt; }
    @JsonProperty("IN_VOLT")
    public void setInVolt(Object value) { this.inVolt = value; }

    @JsonProperty("HEAT_DSPTD")
    public Object getHeatDsptd() { return heatDsptd; }
    @JsonProperty("HEAT_DSPTD")
    public void setHeatDsptd(Object value) { this.heatDsptd = value; }

    @JsonProperty("TEMP_LOW")
    public Object getTempLow() { return tempLow; }
    @JsonProperty("TEMP_LOW")
    public void setTempLow(Object value) { this.tempLow = value; }

    @JsonProperty("TEMP_HIGH")
    public Object getTempHigh() { return tempHigh; }
    @JsonProperty("TEMP_HIGH")
    public void setTempHigh(Object value) { this.tempHigh = value; }

    @JsonProperty("SALV_VAL")
    public Object getSalvVal() { return salvVal; }
    @JsonProperty("SALV_VAL")
    public void setSalvVal(Object value) { this.salvVal = value; }

    @JsonProperty("VRTL_SERVER")
    public Object getVrtlServer() { return vrtlServer; }
    @JsonProperty("VRTL_SERVER")
    public void setVrtlServer(Object value) { this.vrtlServer = value; }

    @JsonProperty("IN_AMP")
    public Object getInAmp() { return inAmp; }
    @JsonProperty("IN_AMP")
    public void setInAmp(Object value) { this.inAmp = value; }

    @JsonProperty("NO_PROCSR")
    public Object getNoProcsr() { return noProcsr; }
    @JsonProperty("NO_PROCSR")
    public void setNoProcsr(Object value) { this.noProcsr = value; }

    @JsonProperty("MAX_PWR")
    public Object getMaxPwr() { return maxPwr; }
    @JsonProperty("MAX_PWR")
    public void setMaxPwr(Object value) { this.maxPwr = value; }

    @JsonProperty("IDLE_PWR")
    public Object getIdlePwr() { return idlePwr; }
    @JsonProperty("IDLE_PWR")
    public void setIdlePwr(Object value) { this.idlePwr = value; }

    @JsonProperty("VIRTUALIZABLE")
    public Object getVirtualizable() { return virtualizable; }
    @JsonProperty("VIRTUALIZABLE")
    public void setVirtualizable(Object value) { this.virtualizable = value; }

    @JsonProperty("HUMIDITY")
    public Object getHumidity() { return humidity; }
    @JsonProperty("HUMIDITY")
    public void setHumidity(Object value) { this.humidity = value; }

    @JsonProperty("CAPACITY")
    public Object getCapacity() { return capacity; }
    @JsonProperty("CAPACITY")
    public void setCapacity(Object value) { this.capacity = value; }

    @JsonProperty("NO_CORE")
    public Object getNoCore() { return noCore; }
    @JsonProperty("NO_CORE")
    public void setNoCore(Object value) { this.noCore = value; }

    @JsonProperty("CREATE_DATE_TIME")
    public String getCreateDateTime() { return createDateTime; }
    @JsonProperty("CREATE_DATE_TIME")
    public void setCreateDateTime(String value) { this.createDateTime = value; }

    @JsonProperty("DEVICE_VALUE")
    public Object getDeviceValue() { return deviceValue; }
    @JsonProperty("DEVICE_VALUE")
    public void setDeviceValue(Object value) { this.deviceValue = value; }

    @JsonProperty("DEVICE_TYPE")
    public Object getDeviceType() { return deviceType; }
    @JsonProperty("DEVICE_TYPE")
    public void setDeviceType(Object value) { this.deviceType = value; }

    @JsonProperty("IP_ADDR")
    public String getIPAddr() { return ipAddr; }
    @JsonProperty("IP_ADDR")
    public void setIPAddr(String value) { this.ipAddr = value; }

    @JsonProperty("WARRANTY")
    public Object getWarranty() { return warranty; }
    @JsonProperty("WARRANTY")
    public void setWarranty(Object value) { this.warranty = value; }
}
