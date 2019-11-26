package configure;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class HwRegMstr {
    private String hwAssetCD;
    private String hwType;
    private String createBy;
    private String createOn;
    private String modfBy;
    private String modfOn;
    private String hwAssetNm;
    private String hwModelNo;
    private String hwSerialID;
    private String mfrName;
    private String cmNcmFalg;
    private String activeFlag;
    private String hostNm;

    @JsonProperty("hw_asset_cd")
    public String getHwAssetCD() { return hwAssetCD; }
    @JsonProperty("hw_asset_cd")
    public void setHwAssetCD(String value) { this.hwAssetCD = value; }

    @JsonProperty("hw_type")
    public String getHwType() { return hwType; }
    @JsonProperty("hw_type")
    public void setHwType(String value) { this.hwType = value; }

    @JsonProperty("create_by")
    public String getCreateBy() { return createBy; }
    @JsonProperty("create_by")
    public void setCreateBy(String value) { this.createBy = value; }

    @JsonProperty("create_on")
    public String getCreateOn() { return createOn; }
    @JsonProperty("create_on")
    public void setCreateOn(String value) { this.createOn = value; }

    @JsonProperty("modf_by")
    public String getModfBy() { return modfBy; }
    @JsonProperty("modf_by")
    public void setModfBy(String value) { this.modfBy = value; }

    @JsonProperty("modf_on")
    public String getModfOn() { return modfOn; }
    @JsonProperty("modf_on")
    public void setModfOn(String value) { this.modfOn = value; }

    @JsonProperty("hw_asset_nm")
    public String getHwAssetNm() { return hwAssetNm; }
    @JsonProperty("hw_asset_nm")
    public void setHwAssetNm(String value) { this.hwAssetNm = value; }

    @JsonProperty("hw_model_no")
    public String getHwModelNo() { return hwModelNo; }
    @JsonProperty("hw_model_no")
    public void setHwModelNo(String value) { this.hwModelNo = value; }

    @JsonProperty("hw_serial_id")
    public String getHwSerialID() { return hwSerialID; }
    @JsonProperty("hw_serial_id")
    public void setHwSerialID(String value) { this.hwSerialID = value; }

    @JsonProperty("mfr_name")
    public String getMfrName() { return mfrName; }
    @JsonProperty("mfr_name")
    public void setMfrName(String value) { this.mfrName = value; }

    @JsonProperty("cm_ncm_falg")
    public String getCMNcmFalg() { return cmNcmFalg; }
    @JsonProperty("cm_ncm_falg")
    public void setCMNcmFalg(String value) { this.cmNcmFalg = value; }

    @JsonProperty("active_flag")
    public String getActiveFlag() { return activeFlag; }
    @JsonProperty("active_flag")
    public void setActiveFlag(String value) { this.activeFlag = value; }

    @JsonProperty("host_nm")
    public String getHostNm() { return hostNm; }
    @JsonProperty("host_nm")
    public void setHostNm(String value) { this.hostNm = value; }
}
