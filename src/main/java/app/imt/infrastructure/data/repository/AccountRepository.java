package app.imt.infrastructure.data.repository;

import app.imt.infrastructure.data.entity.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<AccountEntity, String> {
}
