// Converter.java

// To use this code, add the following Maven dependency to your project:
//
//     com.fasterxml.jackson.core : jackson-databind : 2.9.0
//
// Import this package:
//
//     import io.quicktype.Converter;
//
// Then you can deserialize a JSON string with
//
//     Welcome data = Converter.fromJsonString(jsonString);

package io.quicktype;

import java.util.*;
import java.io.IOException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.core.JsonProcessingException;

public class Converter {
    // Serialize/deserialize helpers

    public static Welcome fromJsonString(String json) throws IOException {
        return getObjectReader().readValue(json);
    }

    public static String toJsonString(Welcome obj) throws JsonProcessingException {
        return getObjectWriter().writeValueAsString(obj);
    }

    private static ObjectReader reader;
    private static ObjectWriter writer;

    private static void instantiateMapper() {
        ObjectMapper mapper = new ObjectMapper();
        reader = mapper.reader(Welcome.class);
        writer = mapper.writerFor(Welcome.class);
    }

    private static ObjectReader getObjectReader() {
        if (reader == null) instantiateMapper();
        return reader;
    }

    private static ObjectWriter getObjectWriter() {
        if (writer == null) instantiateMapper();
        return writer;
    }
}

// Welcome.java

package io.quicktype;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Welcome {
    private Rack[] rack;

    @JsonProperty("Rack")
    public Rack[] getRack() { return rack; }
    @JsonProperty("Rack")
    public void setRack(Rack[] value) { this.rack = value; }
}

// Rack.java

package io.quicktype;

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

// Pdu.java

package io.quicktype;

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

// Socket.java

package io.quicktype;

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

// HwRegMstr.java

package io.quicktype;

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

// HwTmpReg.java

package io.quicktype;

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

// MIBDetailsNonOS.java

package io.quicktype;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class MIBDetailsNonOS {
    private String mibID;
    private String make;
    private String model;
    private String sensorOEM;
    private String deviceUnit;
    private String rvalMode;
    private String oid;
    private String parameterUnit;

    @JsonProperty("mib_id")
    public String getMIBID() { return mibID; }
    @JsonProperty("mib_id")
    public void setMIBID(String value) { this.mibID = value; }

    @JsonProperty("make")
    public String getMake() { return make; }
    @JsonProperty("make")
    public void setMake(String value) { this.make = value; }

    @JsonProperty("model")
    public String getModel() { return model; }
    @JsonProperty("model")
    public void setModel(String value) { this.model = value; }

    @JsonProperty("sensor_oem")
    public String getSensorOEM() { return sensorOEM; }
    @JsonProperty("sensor_oem")
    public void setSensorOEM(String value) { this.sensorOEM = value; }

    @JsonProperty("device_unit")
    public String getDeviceUnit() { return deviceUnit; }
    @JsonProperty("device_unit")
    public void setDeviceUnit(String value) { this.deviceUnit = value; }

    @JsonProperty("rval_mode")
    public String getRvalMode() { return rvalMode; }
    @JsonProperty("rval_mode")
    public void setRvalMode(String value) { this.rvalMode = value; }

    @JsonProperty("oid")
    public String getOID() { return oid; }
    @JsonProperty("oid")
    public void setOID(String value) { this.oid = value; }

    @JsonProperty("parameter_unit")
    public String getParameterUnit() { return parameterUnit; }
    @JsonProperty("parameter_unit")
    public void setParameterUnit(String value) { this.parameterUnit = value; }
}

// NcmOthMstr.java

package io.quicktype;

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

// NcmSocketMstr.java

package io.quicktype;

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

// SNMPDisc.java

package io.quicktype;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class SNMPDisc {
    private String ipAddr;
    private String dateTime;
    private String assetNm;
    private String hwAssetCD;
    private String make;
    private String model;
    private String discMode;
    private String commString;
    private String snmpPort;
    private String snmpVersion;
    private String dataCntrCD;
    private String cpuStartIndex;
    private String cpuEndIndex;
    private String snmpv3AuthPwd;
    private String snmpv3PrivPwd;

    @JsonProperty("ip_addr")
    public String getIPAddr() { return ipAddr; }
    @JsonProperty("ip_addr")
    public void setIPAddr(String value) { this.ipAddr = value; }

    @JsonProperty("date_time")
    public String getDateTime() { return dateTime; }
    @JsonProperty("date_time")
    public void setDateTime(String value) { this.dateTime = value; }

    @JsonProperty("asset_nm")
    public String getAssetNm() { return assetNm; }
    @JsonProperty("asset_nm")
    public void setAssetNm(String value) { this.assetNm = value; }

    @JsonProperty("hw_asset_cd")
    public String getHwAssetCD() { return hwAssetCD; }
    @JsonProperty("hw_asset_cd")
    public void setHwAssetCD(String value) { this.hwAssetCD = value; }

    @JsonProperty("make")
    public String getMake() { return make; }
    @JsonProperty("make")
    public void setMake(String value) { this.make = value; }

    @JsonProperty("model")
    public String getModel() { return model; }
    @JsonProperty("model")
    public void setModel(String value) { this.model = value; }

    @JsonProperty("disc_mode")
    public String getDiscMode() { return discMode; }
    @JsonProperty("disc_mode")
    public void setDiscMode(String value) { this.discMode = value; }

    @JsonProperty("comm_string")
    public String getCommString() { return commString; }
    @JsonProperty("comm_string")
    public void setCommString(String value) { this.commString = value; }

    @JsonProperty("snmp_port")
    public String getSNMPPort() { return snmpPort; }
    @JsonProperty("snmp_port")
    public void setSNMPPort(String value) { this.snmpPort = value; }

    @JsonProperty("snmp_version")
    public String getSNMPVersion() { return snmpVersion; }
    @JsonProperty("snmp_version")
    public void setSNMPVersion(String value) { this.snmpVersion = value; }

    @JsonProperty("data_cntr_cd")
    public String getDataCntrCD() { return dataCntrCD; }
    @JsonProperty("data_cntr_cd")
    public void setDataCntrCD(String value) { this.dataCntrCD = value; }

    @JsonProperty("cpu_start_index")
    public String getCPUStartIndex() { return cpuStartIndex; }
    @JsonProperty("cpu_start_index")
    public void setCPUStartIndex(String value) { this.cpuStartIndex = value; }

    @JsonProperty("cpu_end_index")
    public String getCPUEndIndex() { return cpuEndIndex; }
    @JsonProperty("cpu_end_index")
    public void setCPUEndIndex(String value) { this.cpuEndIndex = value; }

    @JsonProperty("snmpv3_auth_pwd")
    public String getSnmpv3AuthPwd() { return snmpv3AuthPwd; }
    @JsonProperty("snmpv3_auth_pwd")
    public void setSnmpv3AuthPwd(String value) { this.snmpv3AuthPwd = value; }

    @JsonProperty("snmpv3_priv_pwd")
    public String getSnmpv3PrivPwd() { return snmpv3PrivPwd; }
    @JsonProperty("snmpv3_priv_pwd")
    public void setSnmpv3PrivPwd(String value) { this.snmpv3PrivPwd = value; }
}
