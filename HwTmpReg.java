package configure;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class HwTmpReg {
    private String hwType;
    private String hwSubType;
    private String hostNm;
    private String hwAssetTag;
    private String hwModelNo;
    private String hwSerialID;
    private String mfrName;
    private String cmNcmName;
    private String createDateTime;
    private String ipAddr;

    @JsonProperty("hw_type")
    public String getHwType() { return hwType; }
    @JsonProperty("hw_type")
    public void setHwType(String value) { this.hwType = value; }

    @JsonProperty("hw_sub_type")
    public String getHwSubType() { return hwSubType; }
    @JsonProperty("hw_sub_type")
    public void setHwSubType(String value) { this.hwSubType = value; }

    @JsonProperty("host_nm")
    public String getHostNm() { return hostNm; }
    @JsonProperty("host_nm")
    public void setHostNm(String value) { this.hostNm = value; }

    @JsonProperty("hw_asset_tag")
    public String getHwAssetTag() { return hwAssetTag; }
    @JsonProperty("hw_asset_tag")
    public void setHwAssetTag(String value) { this.hwAssetTag = value; }

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

    @JsonProperty("cm_ncm_name")
    public String getCMNcmName() { return cmNcmName; }
    @JsonProperty("cm_ncm_name")
    public void setCMNcmName(String value) { this.cmNcmName = value; }

    @JsonProperty("create_date_time")
    public String getCreateDateTime() { return createDateTime; }
    @JsonProperty("create_date_time")
    public void setCreateDateTime(String value) { this.createDateTime = value; }

    @JsonProperty("ip_addr")
    public String getIPAddr() { return ipAddr; }
    @JsonProperty("ip_addr")
    public void setIPAddr(String value) { this.ipAddr = value; }
}
