package com.qa.tools.services;

import com.qa.tools.model.ChecklistInfo;

/**
 * Created by chenguangxu on 2016/9/26.
 */
public interface NewChecklistService {
    int newChecklist(ChecklistInfo checklistInfo);
    int updateChecklist(ChecklistInfo checklistInfo);
}
