package configure;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class NcmOthMstr {
    private String ncmOthCD;
    private String hwAssetCD;
    private String dataCenterCD;
    private String createOn;
    private String createBy;
    private String modfOn;
    private String modfBy;
    private String initialPrice;
    private String othDeviceNm;
    private String inVolt;
    private String allocFlag;
    private String refRackCD;
    private String rackSlotNo;
    private String deviceType;
    private String capacity;

    @JsonProperty("ncm_oth_cd")
    public String getNcmOthCD() { return ncmOthCD; }
    @JsonProperty("ncm_oth_cd")
    public void setNcmOthCD(String value) { this.ncmOthCD = value; }

    @JsonProperty("hw_asset_cd")
    public String getHwAssetCD() { return hwAssetCD; }
    @JsonProperty("hw_asset_cd")
    public void setHwAssetCD(String value) { this.hwAssetCD = value; }

    @JsonProperty("data_center_cd")
    public String getDataCenterCD() { return dataCenterCD; }
    @JsonProperty("data_center_cd")
    public void setDataCenterCD(String value) { this.dataCenterCD = value; }

    @JsonProperty("create_on")
    public String getCreateOn() { return createOn; }
    @JsonProperty("create_on")
    public void setCreateOn(String value) { this.createOn = value; }

    @JsonProperty("create_by")
    public String getCreateBy() { return createBy; }
    @JsonProperty("create_by")
    public void setCreateBy(String value) { this.createBy = value; }

    @JsonProperty("modf_on")
    public String getModfOn() { return modfOn; }
    @JsonProperty("modf_on")
    public void setModfOn(String value) { this.modfOn = value; }

    @JsonProperty("modf_by")
    public String getModfBy() { return modfBy; }
    @JsonProperty("modf_by")
    public void setModfBy(String value) { this.modfBy = value; }

    @JsonProperty("initial_price")
    public String getInitialPrice() { return initialPrice; }
    @JsonProperty("initial_price")
    public void setInitialPrice(String value) { this.initialPrice = value; }

    @JsonProperty("oth_device_nm")
    public String getOthDeviceNm() { return othDeviceNm; }
    @JsonProperty("oth_device_nm")
    public void setOthDeviceNm(String value) { this.othDeviceNm = value; }

    @JsonProperty("in_volt")
    public String getInVolt() { return inVolt; }
    @JsonProperty("in_volt")
    public void setInVolt(String value) { this.inVolt = value; }

    @JsonProperty("alloc_flag")
    public String getAllocFlag() { return allocFlag; }
    @JsonProperty("alloc_flag")
    public void setAllocFlag(String value) { this.allocFlag = value; }

    @JsonProperty("ref_rack_cd")
    public String getRefRackCD() { return refRackCD; }
    @JsonProperty("ref_rack_cd")
    public void setRefRackCD(String value) { this.refRackCD = value; }

    @JsonProperty("rack_slot_no")
    public String getRackSlotNo() { return rackSlotNo; }
    @JsonProperty("rack_slot_no")
    public void setRackSlotNo(String value) { this.rackSlotNo = value; }

    @JsonProperty("device_type")
    public String getDeviceType() { return deviceType; }
    @JsonProperty("device_type")
    public void setDeviceType(String value) { this.deviceType = value; }

    @JsonProperty("capacity")
    public String getCapacity() { return capacity; }
    @JsonProperty("capacity")
    public void setCapacity(String value) { this.capacity = value; }
}
