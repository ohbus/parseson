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
    private String hwMdlNo;
    private String hwSerialID;
    private String mfrNm;
    private String cmNcmFlg;
    private String hwSubType;
    private String activeFlg;
    private String hostNm;
    private Object coloCustCD;

    @JsonProperty("HW_ASSET_CD")
    public String getHwAssetCD() { return hwAssetCD; }
    @JsonProperty("HW_ASSET_CD")
    public void setHwAssetCD(String value) { this.hwAssetCD = value; }

    @JsonProperty("HW_TYPE")
    public String getHwType() { return hwType; }
    @JsonProperty("HW_TYPE")
    public void setHwType(String value) { this.hwType = value; }

    @JsonProperty("CREATE_BY")
    public String getCreateBy() { return createBy; }
    @JsonProperty("CREATE_BY")
    public void setCreateBy(String value) { this.createBy = value; }

    @JsonProperty("CREATE_ON")
    public String getCreateOn() { return createOn; }
    @JsonProperty("CREATE_ON")
    public void setCreateOn(String value) { this.createOn = value; }

    @JsonProperty("MODF_BY")
    public String getModfBy() { return modfBy; }
    @JsonProperty("MODF_BY")
    public void setModfBy(String value) { this.modfBy = value; }

    @JsonProperty("MODF_ON")
    public String getModfOn() { return modfOn; }
    @JsonProperty("MODF_ON")
    public void setModfOn(String value) { this.modfOn = value; }

    @JsonProperty("HW_ASSET_NM")
    public String getHwAssetNm() { return hwAssetNm; }
    @JsonProperty("HW_ASSET_NM")
    public void setHwAssetNm(String value) { this.hwAssetNm = value; }

    @JsonProperty("HW_MDL_NO")
    public String getHwMdlNo() { return hwMdlNo; }
    @JsonProperty("HW_MDL_NO")
    public void setHwMdlNo(String value) { this.hwMdlNo = value; }

    @JsonProperty("HW_SERIAL_ID")
    public String getHwSerialID() { return hwSerialID; }
    @JsonProperty("HW_SERIAL_ID")
    public void setHwSerialID(String value) { this.hwSerialID = value; }

    @JsonProperty("MFR_NM")
    public String getMfrNm() { return mfrNm; }
    @JsonProperty("MFR_NM")
    public void setMfrNm(String value) { this.mfrNm = value; }

    @JsonProperty("CM_NCM_FLG")
    public String getCMNcmFlg() { return cmNcmFlg; }
    @JsonProperty("CM_NCM_FLG")
    public void setCMNcmFlg(String value) { this.cmNcmFlg = value; }

    @JsonProperty("HW_SUB_TYPE")
    public String getHwSubType() { return hwSubType; }
    @JsonProperty("HW_SUB_TYPE")
    public void setHwSubType(String value) { this.hwSubType = value; }

    @JsonProperty("ACTIVE_FLG")
    public String getActiveFlg() { return activeFlg; }
    @JsonProperty("ACTIVE_FLG")
    public void setActiveFlg(String value) { this.activeFlg = value; }

    @JsonProperty("HOST_NM")
    public String getHostNm() { return hostNm; }
    @JsonProperty("HOST_NM")
    public void setHostNm(String value) { this.hostNm = value; }

    @JsonProperty("COLO_CUST_CD")
    public Object getColoCustCD() { return coloCustCD; }
    @JsonProperty("COLO_CUST_CD")
    public void setColoCustCD(Object value) { this.coloCustCD = value; }
}
