package com.crud.app;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface MachineRepo extends CrudRepository<Machine, Integer> {
    @Transactional
    int deleteBySerialNumber(String sn);


}
