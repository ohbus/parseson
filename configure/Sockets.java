package configure;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Sockets {
    private Socket[] sockets;

    @JsonProperty("Sockets")
    public Socket[] getSockets() { return sockets; }
    @JsonProperty("Sockets")
    public void setSockets(Socket[] value) { this.sockets = value; }
}
