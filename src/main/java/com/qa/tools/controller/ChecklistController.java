package com.qa.tools.controller;

import com.alibaba.fastjson.JSONArray;
import com.qa.tools.model.ChecklistInfo;
import com.qa.tools.services.impl.NewChecklistServiceImpl;
import com.qa.tools.services.impl.QueryChecklistServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by chenguang.xu on 2015/10/30.
 */
@RequestMapping(value = "/checklist")
@Controller
public class ChecklistController {

    @Resource
    private QueryChecklistServiceImpl queryChecklistService;
    @Resource
    private NewChecklistServiceImpl newChecklistService;

    @ResponseBody
    @RequestMapping(value = "/order")
    public String bookingDetail(){

        return "ok!";
    }

    @ResponseBody
    @RequestMapping(value = "/selectById")
    public String selectMindMapById(){

        try{
            List<ChecklistInfo> list = queryChecklistService.queryChecklistById(10);
            System.out.println(list.toArray().length);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return "ok";
    }

    /**
     * checklist主页
     * @return
     */
    @RequestMapping(value = "/home")
    public ModelAndView checklistHome(@RequestParam(value = "id",required = false)int id){
        List<ChecklistInfo> list = queryChecklistService.queryChecklistById(id);
        System.out.println(list.get(0).getJsonContent());
        return new ModelAndView("index").addObject("jsonArray",list.get(0).getJsonContent());
    }

    /**
     * checklist索引页
     * @return
     */
    @RequestMapping(value = "/index")
    public ModelAndView indexPage(){

        System.out.println("我进来了！");
        return new ModelAndView("home");
    }

    /**
     * 新建checklist
     * @param mindMap
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/newChecklist")
    public String newChecklist(@RequestParam(value = "mindMap",required = false)String mindMap){
        ChecklistInfo checklistInfo = new ChecklistInfo();
        checklistInfo.setJsonContent(mindMap);
        checklistInfo.setCreatorId("xuchenguang");
        checklistInfo.setProjectId("LianJia");
        checklistInfo.setTemplateId(1);
        checklistInfo.setProjectName("三方财务");
        try{
            System.out.println(mindMap);
            newChecklistService.newChecklist(checklistInfo);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return "ok";
    }

    /**
     * 保存checklist
     * @param mindMap
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/updateChecklist")
    public String updateChecklist(@RequestParam(value = "mindMap",required = false)String mindMap){
        ChecklistInfo checklistInfo = new ChecklistInfo();
        checklistInfo.setJsonContent(mindMap);
        checklistInfo.setCreatorId("xuchenguang");
        checklistInfo.setProjectId("LianJia");
        checklistInfo.setTemplateId(1);
        checklistInfo.setProjectName("三方财务");
        try{
            System.out.println(mindMap);
            newChecklistService.updateChecklist(checklistInfo);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return "ok";
    }

}
