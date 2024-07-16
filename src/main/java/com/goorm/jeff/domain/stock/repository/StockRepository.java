package com.goorm.jeff.domain.stock.repository;

import com.goorm.jeff.domain.stock.entity.Company;
import com.goorm.jeff.domain.stock.entity.StocksHistory;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<StocksHistory, Long> {

    List<Optional<StocksHistory>> findStockHistoriesByCompanyAndTradeDateBetween(Company company, LocalDate startDate, LocalDate endDate);

}
