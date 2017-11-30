package com.qa.tools.model;

import java.awt.*;
import java.io.Serializable;

/**
 * Created by chenguangxu on 2016/9/24.
 */
public class ChecklistInfo implements Serializable{

    private String projectId;

    private String projectName;

    private String creatorId;

    private String modifierId;

    private int templateId;

    private int version;

    private String tags;

    private  String jsonContent;

    private String comments;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public String getModifierId() {
        return modifierId;
    }

    public void setModifierId(String modifierId) {
        this.modifierId = modifierId;
    }

    public int getTemplateId() {
        return templateId;
    }

    public void setTemplateId(int templateId) {
        this.templateId = templateId;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getJsonContent() {
        return jsonContent;
    }

    public void setJsonContent(String jsonContent) {
        this.jsonContent = jsonContent;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String decscribe) {
        this.comments = comments;
    }
}
