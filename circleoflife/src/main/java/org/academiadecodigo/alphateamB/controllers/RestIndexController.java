package org.academiadecodigo.alphateamB.controllers;

import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class RestIndexController {

    @RequestMapping(method = RequestMethod.GET, path = {"/", ""})
    @ResponseBody
    protected ApiVersion showVersion() {

        ApiVersion version = new ApiVersion();
        version.setName("Alpha Pet Tracker API");
        version.setVersion("v0.1");

        return version;

    }

    private static class ApiVersion {

        private String name;
        private String version;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }
    }
}
