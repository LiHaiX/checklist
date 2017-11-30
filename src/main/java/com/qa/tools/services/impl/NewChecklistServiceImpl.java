package com.qa.tools.services.impl;

import com.qa.tools.dao.ChecklistInfoDao;
import com.qa.tools.model.ChecklistInfo;
import com.qa.tools.services.NewChecklistService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by chenguangxu on 2016/9/26.
 */
@Service
public class NewChecklistServiceImpl implements NewChecklistService {

    @Resource
    private ChecklistInfoDao checklistInfoDao;

    @Override
    public int newChecklist(ChecklistInfo checklistInfo) {
        return checklistInfoDao.newChecklist(checklistInfo);
    }

    @Override
    public int updateChecklist(ChecklistInfo checklistInfo) {
        return checklistInfoDao.updateChecklist(checklistInfo);
    }

}
