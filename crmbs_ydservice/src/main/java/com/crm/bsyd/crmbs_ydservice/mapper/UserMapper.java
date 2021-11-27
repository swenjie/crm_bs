package com.crm.bsyd.crmbs_ydservice.mapper;

import com.crm.bsyd.crmbs_ydservice.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    User Sel(int id);
}
