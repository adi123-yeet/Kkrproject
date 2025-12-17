package org.example.kkrproject.controller;

import lombok.RequiredArgsConstructor;
import org.example.kkrproject.service.VoorraadService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/fake-scan")
public class FakeScanController {

    private final VoorraadService voorraadService;

    @RequestMapping(value = "/{productcode}", method = {RequestMethod.POST, RequestMethod.GET})
    public String fakeScan(@PathVariable Integer productcode) {
        voorraadService.verlaagVoorraadMetEen(productcode);
        return "Scan gesimuleerd voor product " + productcode;
    }

}
