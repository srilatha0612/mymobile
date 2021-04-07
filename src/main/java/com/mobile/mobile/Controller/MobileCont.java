package com.mobile.mobile.Controller;

import com.mobile.mobile.Repositry.MobileRepos;
import com.mobile.mobile.model.Mobile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class MobileCont
{
    @Autowired
    public MobileRepos repos;
@PostMapping
public void createmobilerecord(@RequestBody Mobile mobile)
{
    repos.save(mobile);
}
@GetMapping
public List<Mobile> allgetDetails()
{
    List<Mobile> all = repos.findAll();
    return all;
}
}


