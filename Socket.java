package configure;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Socket {
    private NcmSocketMstr ncmSocketMstr;
    private MIBDetailsNonOS mibDetailsNonOS;
    private HwTmpReg hwTmpReg;
    private HwRegMstr hwRegMstr;
    private NcmOthMstr ncmOthMstr;
    private SNMPDisc snmpDisc;

    @JsonProperty("ncm_socket mstr")
    public NcmSocketMstr getNcmSocketMstr() { return ncmSocketMstr; }
    @JsonProperty("ncm_socket mstr")
    public void setNcmSocketMstr(NcmSocketMstr value) { this.ncmSocketMstr = value; }

    @JsonProperty("mib_details_non_os")
    public MIBDetailsNonOS getMIBDetailsNonOS() { return mibDetailsNonOS; }
    @JsonProperty("mib_details_non_os")
    public void setMIBDetailsNonOS(MIBDetailsNonOS value) { this.mibDetailsNonOS = value; }

    @JsonProperty("hw_tmp_reg")
    public HwTmpReg getHwTmpReg() { return hwTmpReg; }
    @JsonProperty("hw_tmp_reg")
    public void setHwTmpReg(HwTmpReg value) { this.hwTmpReg = value; }

    @JsonProperty("hw_reg_mstr")
    public HwRegMstr getHwRegMstr() { return hwRegMstr; }
    @JsonProperty("hw_reg_mstr")
    public void setHwRegMstr(HwRegMstr value) { this.hwRegMstr = value; }

    @JsonProperty("ncm_oth_mstr")
    public NcmOthMstr getNcmOthMstr() { return ncmOthMstr; }
    @JsonProperty("ncm_oth_mstr")
    public void setNcmOthMstr(NcmOthMstr value) { this.ncmOthMstr = value; }

    @JsonProperty("snmp_disc")
    public SNMPDisc getSNMPDisc() { return snmpDisc; }
    @JsonProperty("snmp_disc")
    public void setSNMPDisc(SNMPDisc value) { this.snmpDisc = value; }
}
