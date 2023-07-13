package com.kob.backend.controller.user.account;

import com.kob.backend.service.impl.user.account.InfoServiceImpl;
import com.kob.backend.service.user.account.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class InfoController {
    @Autowired
    private InfoServiceImpl infoService;

    @GetMapping("/api/user/account/info/")
    public Map<String, String> getinfo() {
        return infoService.getinfo();
    }
}
