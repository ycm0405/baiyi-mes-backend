package com.easestrategy.mes.controller;

import com.easestrategy.mes.entity.Factory;
import com.easestrategy.mes.entity.Workshop;
import com.easestrategy.mes.model.OrgModel;
import com.easestrategy.mes.service.OrgService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrgController {


    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    OrgService orgService;

    @RequestMapping(value = "/base/org-structure/{type}/", method = RequestMethod.PUT)

    public boolean addOrg(@RequestBody OrgModel orgModel, @PathVariable String type){
        if(type=="factory"){

            Factory factory = new Factory();
            factory.setAddr("");
            this.addFactory(null);
        }
        if(type == "workshop"){

        }

        return true;
    }

    private boolean addFactory(Factory factory){
        return true;
    }
    private boolean addWorkshop(Workshop workshop){
        return true;
    }


}
