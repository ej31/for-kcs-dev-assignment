package com.goorm.jeff.domain.stock.api;

import com.goorm.jeff.domain.stock.dto.request.RequestTradeInfoDto;
import com.goorm.jeff.domain.stock.service.StockService;
import com.goorm.jeff.global.dto.ResponseDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/stock")
@Slf4j
public class StockController {

    private final StockService stockService;

    @GetMapping("/info")
    public ResponseEntity<ResponseDto> getInfo(@RequestBody RequestTradeInfoDto requestTradeInfoDto){
        System.out.println(requestTradeInfoDto);
        return ResponseEntity.status(HttpStatus.OK).body(ResponseDto.builder().data(stockService.getTradeInfo(requestTradeInfoDto)).build());
    }
}
