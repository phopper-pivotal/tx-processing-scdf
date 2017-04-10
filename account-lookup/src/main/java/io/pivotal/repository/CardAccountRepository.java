package io.pivotal.repository;

import io.pivotal.domain.CardAccount;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "cardAccount", path = "cardAccount")
public interface CardAccountRepository extends CrudRepository<CardAccount, Long> {

    CardAccount findByAccountNumber(@Param("accountNumber") String accountNumber);

}
