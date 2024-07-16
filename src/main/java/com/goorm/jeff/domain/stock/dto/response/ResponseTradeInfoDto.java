package com.goorm.jeff.domain.stock.dto.response;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponseTradeInfoDto {
    private String companyName;
    private LocalDate tradeDate;
    private Long closingPrice;

}
