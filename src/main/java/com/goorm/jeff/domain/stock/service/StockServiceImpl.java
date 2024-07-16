package com.goorm.jeff.domain.stock.service;


import com.goorm.jeff.domain.stock.dto.request.RequestTradeInfoDto;
import com.goorm.jeff.domain.stock.dto.response.ResponseTradeInfoDto;
import com.goorm.jeff.domain.stock.entity.Company;
import com.goorm.jeff.domain.stock.repository.CompanyRepository;
import com.goorm.jeff.domain.stock.repository.StockRepository;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class StockServiceImpl implements StockService{

    private final StockRepository stockRepository;
    private final CompanyRepository companyRepository;

    @Override
    public List<ResponseTradeInfoDto> getTradeInfo(RequestTradeInfoDto requestTradeInfoDto) {
        Company company = companyRepository.findByCompanyCode(requestTradeInfoDto.getCompanyCode()).orElseThrow();
        List<ResponseTradeInfoDto> result = stockRepository.findStockHistoriesByCompanyAndTradeDateBetween(
                company, requestTradeInfoDto.getStartDate(), requestTradeInfoDto.getEndDate())
            .stream().filter(Optional::isPresent).map(Optional::get).map(stock ->
                 ResponseTradeInfoDto.builder()
                   .companyName(stock.getCompany().getCompanyName())
                   .tradeDate(stock.getTradeDate())
                   .closingPrice(stock.getClosePrice()).build()
            ).toList();

        return result;
    }
}
