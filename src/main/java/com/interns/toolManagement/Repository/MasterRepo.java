package com.interns.toolManagement.Repository;

import com.interns.toolManagement.Entity.Master;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MasterRepo extends JpaRepository<Master, Long> {
//    @Query("select m.toolId,m.toolName,m.quantity from Master m")
//    public List<Object[]> getAllToolsUsingJPQL();

}
