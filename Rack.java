package configure;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Rack {
    private String rackcd;
    private Pdu[] pdu;

    @JsonProperty("rackcd")
    public String getRackcd() { return rackcd; }
    @JsonProperty("rackcd")
    public void setRackcd(String value) { this.rackcd = value; }

    @JsonProperty("pdu")
    public Pdu[] getPdu() { return pdu; }
    @JsonProperty("pdu")
    public void setPdu(Pdu[] value) { this.pdu = value; }
}
