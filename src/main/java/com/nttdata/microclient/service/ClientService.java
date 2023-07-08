package com.nttdata.microclient.service;

import com.nttdata.microclient.model.Client;
import com.nttdata.microclient.model.request.ClientRequest;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Maybe;

/**
 * ClientService Intefrace.
 */
public interface ClientService {
  public Maybe<Client> saveClient(ClientRequest client);

  public Maybe<Client> deleteClient(String documentNumber);

  public Maybe<Client> getClient(String documentNumber) throws Exception;

  public Flowable<Client> listClient(String documentNumber) throws Exception;
}
