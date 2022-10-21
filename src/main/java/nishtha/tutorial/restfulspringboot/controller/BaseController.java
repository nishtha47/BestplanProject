package nishtha.tutorial.restfulspringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import nishtha.tutorial.restfulspringboot.property.ApiUrlProperties;
import nishtha.tutorial.restfulspringboot.util.UrlUtil;

@RestController
public class BaseController {
    @Autowired
    private ApiUrlProperties apiUrlProperties;

    protected String getApiUrl() {
        String apiUrl = apiUrlProperties.getApiUrl();
        if (apiUrl == null || apiUrl.isEmpty()) {
            apiUrl = UrlUtil.getBaseEnvLinkURL();
        }
        return apiUrl;
    }
}
