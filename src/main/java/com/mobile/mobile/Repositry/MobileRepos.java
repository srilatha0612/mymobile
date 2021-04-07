package com.mobile.mobile.Repositry;

import com.mobile.mobile.model.Mobile;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MobileRepos extends MongoRepository<Mobile,String>
{

}
