package com.goorm.jeff.domain.stock.dto.request;

import com.goorm.jeff.domain.stock.constant.CompanyCode;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RequestTradeInfoDto {
    private CompanyCode companyCode;
    private LocalDate startDate;
    private LocalDate endDate;
}
