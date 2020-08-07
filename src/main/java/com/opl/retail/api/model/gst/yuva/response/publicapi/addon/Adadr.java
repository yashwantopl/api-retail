
package com.opl.retail.api.model.gst.yuva.response.publicapi.addon;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(Include.NON_NULL)

public class Adadr  implements Serializable{
	
	private static final long serialVersionUID = 1L;

    @JsonProperty("addr")
    private Addr addr;
    @JsonProperty("ntr")
    private List<String> ntr = new ArrayList<String>();

    @JsonProperty("addr")
    public Addr getAddr() {
        return addr;
    }

    @JsonProperty("addr")
    public void setAddr(Addr addr) {
        this.addr = addr;
    }

    @JsonProperty("ntr")
    public List<String> getNtr() {
        return ntr;
    }

    @JsonProperty("ntr")
    public void setNtr(List<String> ntr) {
        this.ntr = ntr;
    }

}
