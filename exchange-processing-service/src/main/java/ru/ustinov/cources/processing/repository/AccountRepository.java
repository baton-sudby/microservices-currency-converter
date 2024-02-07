package ru.ustinov.cources.processing.repository;

import org.springframework.data.repository.CrudRepository;
import ru.ustinov.cources.processing.model.AccountEntity;

import java.util.List;

public interface AccountRepository extends CrudRepository<AccountEntity, Long> {
    List<AccountEntity> findByUserId(Long userId);
}
