package com.kob.backend.controller.bot;

import com.kob.backend.pojo.Bot;
import com.kob.backend.service.impl.user.bot.GetListServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class GetListController {
    @Autowired
    private GetListServiceImpl getListService;

    @GetMapping("/user/bot/getlist/")
    public List<Bot> getList() {
        return getListService.getList();
    }
}
