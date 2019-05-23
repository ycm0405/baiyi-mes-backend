package com.easestrategy.mes.service.impl;


import com.easestrategy.mes.dao.FactoryMapper;
import com.easestrategy.mes.entity.Factory;
import com.easestrategy.mes.service.OrgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service(value = "orgService")
public class OrgServerImpl implements OrgService {
    @Autowired
    FactoryMapper factoryMapper;
    public boolean addFoctory(Factory factory){
        return true;
    }
}
