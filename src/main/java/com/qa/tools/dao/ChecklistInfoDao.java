package com.qa.tools.dao;

import com.qa.tools.model.ChecklistInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by chenguangxu on 2016/9/24.
 */
@Repository
public interface ChecklistInfoDao {

    List<ChecklistInfo> selectMindMapInfo(int id);

    int newChecklist(ChecklistInfo checklistInfo);
    int updateChecklist(ChecklistInfo checklistInfo);
}
