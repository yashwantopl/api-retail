package com.opl.retail.api.model.bodmas;

import java.io.Serializable;
import java.util.List;

public class FolderMasterRequest implements Serializable {

    private Long id;

    private String folderName;

    private Long orgId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFolderName() {
        return folderName;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

}
