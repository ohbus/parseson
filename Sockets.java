package configure;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Sockets {
    private Rack[] rack;

    @JsonProperty("Rack")
    public Rack[] getRack() { return rack; }
    @JsonProperty("Rack")
    public void setRack(Rack[] value) { this.rack = value; }
}
