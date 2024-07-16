package com.goorm.jeff.domain.stock.repository;

import com.goorm.jeff.domain.stock.constant.CompanyCode;
import com.goorm.jeff.domain.stock.entity.Company;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, String> {

    Optional<Company> findByCompanyCode(CompanyCode companyCode);
}
