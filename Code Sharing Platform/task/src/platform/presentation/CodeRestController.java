package platform.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import platform.business.CodeDto;
import platform.business.Codes;
import platform.business.CodesService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class CodeRestController {

    @Autowired
    CodesService codesService;


    @GetMapping("/api/code/{id}")
    public CodeDto findCode(@PathVariable String id) {
        return codesService.findCode(id);
//        return Map.of("code", codes1.getCode(), "date", codes1.getDate());
    }


    @GetMapping("/api/code/latest")
    public List<CodeDto> findLast() {
        return codesService.findLast();
    }


    @PostMapping("/api/code/new")
    public Map<String, String> postCode(@RequestBody Codes codes1) {
        System.out.println(codes1);
        return codesService.postCode(codes1);
    }


}
