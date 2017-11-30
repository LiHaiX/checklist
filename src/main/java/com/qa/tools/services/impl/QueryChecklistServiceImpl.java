package com.qa.tools.services.impl;

import com.qa.tools.dao.ChecklistInfoDao;
import com.qa.tools.model.ChecklistInfo;
import com.qa.tools.services.QueryChecklistService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by chenguangxu on 2016/9/26.
 */
@Service
public class QueryChecklistServiceImpl implements QueryChecklistService {

    @Resource
    private ChecklistInfoDao checklistInfoDao;

    @Override
    public List<ChecklistInfo> queryChecklistById(int id) {
        return checklistInfoDao.selectMindMapInfo(id);
    }
}
