package configure;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Pdu {
    private String hwAssetCD;
    private Socket[] sockets;

    @JsonProperty("hw_asset_cd")
    public String getHwAssetCD() { return hwAssetCD; }
    @JsonProperty("hw_asset_cd")
    public void setHwAssetCD(String value) { this.hwAssetCD = value; }

    @JsonProperty("sockets")
    public Socket[] getSockets() { return sockets; }
    @JsonProperty("sockets")
    public void setSockets(Socket[] value) { this.sockets = value; }
}
