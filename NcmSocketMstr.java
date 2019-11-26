package configure;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class NcmSocketMstr {
    private String socketCD;
    private String dataCntrCD;
    private String refRackCD;
    private String refPduCD;
    private String hwAssetCD;
    private String socketDeviceName;
    private String isSocket;

    @JsonProperty("socket_cd")
    public String getSocketCD() { return socketCD; }
    @JsonProperty("socket_cd")
    public void setSocketCD(String value) { this.socketCD = value; }

    @JsonProperty("data_cntr_cd")
    public String getDataCntrCD() { return dataCntrCD; }
    @JsonProperty("data_cntr_cd")
    public void setDataCntrCD(String value) { this.dataCntrCD = value; }

    @JsonProperty("ref_rack_cd")
    public String getRefRackCD() { return refRackCD; }
    @JsonProperty("ref_rack_cd")
    public void setRefRackCD(String value) { this.refRackCD = value; }

    @JsonProperty("ref_pdu_cd")
    public String getRefPduCD() { return refPduCD; }
    @JsonProperty("ref_pdu_cd")
    public void setRefPduCD(String value) { this.refPduCD = value; }

    @JsonProperty("hw_asset_cd")
    public String getHwAssetCD() { return hwAssetCD; }
    @JsonProperty("hw_asset_cd")
    public void setHwAssetCD(String value) { this.hwAssetCD = value; }

    @JsonProperty("socket_device_name")
    public String getSocketDeviceName() { return socketDeviceName; }
    @JsonProperty("socket_device_name")
    public void setSocketDeviceName(String value) { this.socketDeviceName = value; }

    @JsonProperty("is_socket")
    public String getIsSocket() { return isSocket; }
    @JsonProperty("is_socket")
    public void setIsSocket(String value) { this.isSocket = value; }
}
