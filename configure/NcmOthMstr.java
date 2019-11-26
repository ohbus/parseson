package configure;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class NcmOthMstr {
    private String ncmOthCD;
    private String hwAssetCD;
    private String dataCntrCD;
    private String createOn;
    private String createBy;
    private String modfOn;
    private String modfBy;
    private String initialPrice;
    private String prcmntDate;
    private String othDeviceNm;
    private String inVolt;
    private String heatDsptd;
    private Object tempLow;
    private Object tempHigh;
    private String humidity;
    private String warrenty;
    private Object deviceHT;
    private Object deviceWth;
    private Object deviceLen;
    private Object deviceWgt;
    private long inAmp;
    private String allocFlg;
    private String refRackCD;
    private String rackSlotNo;
    private Object phase;
    private Object pwrFactor;
    private Object frequency;
    private String deviceType;
    private Object maxPwr;
    private long capacity;
    private Object receptacles;
    private Object capacityUnit;
    private Object noOfBattery;
    private Object location;
    private Object side;
    private Object supportedProtocol;
    private Object refRacks;

    @JsonProperty("NCM_OTH_CD")
    public String getNcmOthCD() { return ncmOthCD; }
    @JsonProperty("NCM_OTH_CD")
    public void setNcmOthCD(String value) { this.ncmOthCD = value; }

    @JsonProperty("HW_ASSET_CD")
    public String getHwAssetCD() { return hwAssetCD; }
    @JsonProperty("HW_ASSET_CD")
    public void setHwAssetCD(String value) { this.hwAssetCD = value; }

    @JsonProperty("DATA_CNTR_CD")
    public String getDataCntrCD() { return dataCntrCD; }
    @JsonProperty("DATA_CNTR_CD")
    public void setDataCntrCD(String value) { this.dataCntrCD = value; }

    @JsonProperty("CREATE_ON")
    public String getCreateOn() { return createOn; }
    @JsonProperty("CREATE_ON")
    public void setCreateOn(String value) { this.createOn = value; }

    @JsonProperty("CREATE_BY")
    public String getCreateBy() { return createBy; }
    @JsonProperty("CREATE_BY")
    public void setCreateBy(String value) { this.createBy = value; }

    @JsonProperty("MODF_ON")
    public String getModfOn() { return modfOn; }
    @JsonProperty("MODF_ON")
    public void setModfOn(String value) { this.modfOn = value; }

    @JsonProperty("MODF_BY")
    public String getModfBy() { return modfBy; }
    @JsonProperty("MODF_BY")
    public void setModfBy(String value) { this.modfBy = value; }

    @JsonProperty("INITIAL_PRICE")
    public String getInitialPrice() { return initialPrice; }
    @JsonProperty("INITIAL_PRICE")
    public void setInitialPrice(String value) { this.initialPrice = value; }

    @JsonProperty("PRCMNT_DATE")
    public String getPrcmntDate() { return prcmntDate; }
    @JsonProperty("PRCMNT_DATE")
    public void setPrcmntDate(String value) { this.prcmntDate = value; }

    @JsonProperty("OTH_DEVICE_NM")
    public String getOthDeviceNm() { return othDeviceNm; }
    @JsonProperty("OTH_DEVICE_NM")
    public void setOthDeviceNm(String value) { this.othDeviceNm = value; }

    @JsonProperty("IN_VOLT")
    public String getInVolt() { return inVolt; }
    @JsonProperty("IN_VOLT")
    public void setInVolt(String value) { this.inVolt = value; }

    @JsonProperty("HEAT_DSPTD")
    public String getHeatDsptd() { return heatDsptd; }
    @JsonProperty("HEAT_DSPTD")
    public void setHeatDsptd(String value) { this.heatDsptd = value; }

    @JsonProperty("TEMP_LOW")
    public Object getTempLow() { return tempLow; }
    @JsonProperty("TEMP_LOW")
    public void setTempLow(Object value) { this.tempLow = value; }

    @JsonProperty("TEMP_HIGH")
    public Object getTempHigh() { return tempHigh; }
    @JsonProperty("TEMP_HIGH")
    public void setTempHigh(Object value) { this.tempHigh = value; }

    @JsonProperty("HUMIDITY")
    public String getHumidity() { return humidity; }
    @JsonProperty("HUMIDITY")
    public void setHumidity(String value) { this.humidity = value; }

    @JsonProperty("WARRENTY")
    public String getWarrenty() { return warrenty; }
    @JsonProperty("WARRENTY")
    public void setWarrenty(String value) { this.warrenty = value; }

    @JsonProperty("DEVICE_HT")
    public Object getDeviceHT() { return deviceHT; }
    @JsonProperty("DEVICE_HT")
    public void setDeviceHT(Object value) { this.deviceHT = value; }

    @JsonProperty("DEVICE_WTH")
    public Object getDeviceWth() { return deviceWth; }
    @JsonProperty("DEVICE_WTH")
    public void setDeviceWth(Object value) { this.deviceWth = value; }

    @JsonProperty("DEVICE_LEN")
    public Object getDeviceLen() { return deviceLen; }
    @JsonProperty("DEVICE_LEN")
    public void setDeviceLen(Object value) { this.deviceLen = value; }

    @JsonProperty("DEVICE_WGT")
    public Object getDeviceWgt() { return deviceWgt; }
    @JsonProperty("DEVICE_WGT")
    public void setDeviceWgt(Object value) { this.deviceWgt = value; }

    @JsonProperty("IN_AMP")
    public long getInAmp() { return inAmp; }
    @JsonProperty("IN_AMP")
    public void setInAmp(long value) { this.inAmp = value; }

    @JsonProperty("ALLOC_FLG")
    public String getAllocFlg() { return allocFlg; }
    @JsonProperty("ALLOC_FLG")
    public void setAllocFlg(String value) { this.allocFlg = value; }

    @JsonProperty("REF_RACK_CD")
    public String getRefRackCD() { return refRackCD; }
    @JsonProperty("REF_RACK_CD")
    public void setRefRackCD(String value) { this.refRackCD = value; }

    @JsonProperty("RACK_SLOT_NO")
    public String getRackSlotNo() { return rackSlotNo; }
    @JsonProperty("RACK_SLOT_NO")
    public void setRackSlotNo(String value) { this.rackSlotNo = value; }

    @JsonProperty("PHASE")
    public Object getPhase() { return phase; }
    @JsonProperty("PHASE")
    public void setPhase(Object value) { this.phase = value; }

    @JsonProperty("PWR_FACTOR")
    public Object getPwrFactor() { return pwrFactor; }
    @JsonProperty("PWR_FACTOR")
    public void setPwrFactor(Object value) { this.pwrFactor = value; }

    @JsonProperty("FREQUENCY")
    public Object getFrequency() { return frequency; }
    @JsonProperty("FREQUENCY")
    public void setFrequency(Object value) { this.frequency = value; }

    @JsonProperty("DEVICE_TYPE")
    public String getDeviceType() { return deviceType; }
    @JsonProperty("DEVICE_TYPE")
    public void setDeviceType(String value) { this.deviceType = value; }

    @JsonProperty("MAX_PWR")
    public Object getMaxPwr() { return maxPwr; }
    @JsonProperty("MAX_PWR")
    public void setMaxPwr(Object value) { this.maxPwr = value; }

    @JsonProperty("CAPACITY")
    public long getCapacity() { return capacity; }
    @JsonProperty("CAPACITY")
    public void setCapacity(long value) { this.capacity = value; }

    @JsonProperty("RECEPTACLES")
    public Object getReceptacles() { return receptacles; }
    @JsonProperty("RECEPTACLES")
    public void setReceptacles(Object value) { this.receptacles = value; }

    @JsonProperty("CAPACITY_UNIT")
    public Object getCapacityUnit() { return capacityUnit; }
    @JsonProperty("CAPACITY_UNIT")
    public void setCapacityUnit(Object value) { this.capacityUnit = value; }

    @JsonProperty("NO_OF_BATTERY")
    public Object getNoOfBattery() { return noOfBattery; }
    @JsonProperty("NO_OF_BATTERY")
    public void setNoOfBattery(Object value) { this.noOfBattery = value; }

    @JsonProperty("LOCATION")
    public Object getLocation() { return location; }
    @JsonProperty("LOCATION")
    public void setLocation(Object value) { this.location = value; }

    @JsonProperty("SIDE")
    public Object getSide() { return side; }
    @JsonProperty("SIDE")
    public void setSide(Object value) { this.side = value; }

    @JsonProperty("SUPPORTED_PROTOCOL")
    public Object getSupportedProtocol() { return supportedProtocol; }
    @JsonProperty("SUPPORTED_PROTOCOL")
    public void setSupportedProtocol(Object value) { this.supportedProtocol = value; }

    @JsonProperty("REF_RACKS")
    public Object getRefRacks() { return refRacks; }
    @JsonProperty("REF_RACKS")
    public void setRefRacks(Object value) { this.refRacks = value; }
}
