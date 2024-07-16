package com.goorm.jeff.domain.stock.service;

import com.goorm.jeff.domain.stock.dto.request.RequestTradeInfoDto;
import com.goorm.jeff.domain.stock.dto.response.ResponseTradeInfoDto;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface StockService {
    List<ResponseTradeInfoDto> getTradeInfo(RequestTradeInfoDto requestTradeInfoDto);
}
