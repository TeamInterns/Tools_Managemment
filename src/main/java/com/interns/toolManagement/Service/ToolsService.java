package com.interns.toolManagement.Service;

import com.interns.toolManagement.Entity.Tools;
import com.interns.toolManagement.Repository.ToolsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ToolsService {
    @Autowired
    private ToolsRepo toolsRepo;

    public Tools saveToolObjects(Tools tools){
        return toolsRepo.save(tools);
    }


}
