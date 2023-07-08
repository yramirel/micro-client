package com.nttdata.microclient.repository;

import com.nttdata.microclient.model.Client;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Maybe;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.reactive.RxJava3SortingRepository;
import org.springframework.stereotype.Repository;

/**
 * ClientRepository interface.
 */
@Repository
public interface ClientRepository extends RxJava3SortingRepository<Client, String> {
  Maybe<Client> getByDocumentNumber(String documentNumber);

  @Query("{state:1}")
  Flowable<Client> getAllClient();
}
