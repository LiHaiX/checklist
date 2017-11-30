package com.qa.tools.services;

import com.qa.tools.model.ChecklistInfo;

import java.util.List;

/**
 * Created by chenguangxu on 2016/9/26.
 */

public interface QueryChecklistService {
    List<ChecklistInfo> queryChecklistById(int id);

}
