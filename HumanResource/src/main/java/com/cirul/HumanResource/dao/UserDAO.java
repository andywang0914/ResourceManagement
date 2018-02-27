package com.cirul.HumanResource.dao;

import com.cirul.HumanResource.entity.User;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by andywang on 2018/2/26.
 */
@Repository
public interface UserDAO extends PagingAndSortingRepository<User, Long>, JpaSpecificationExecutor<User> {
    User findByName(String userName);

    User getById(Integer id);
}
