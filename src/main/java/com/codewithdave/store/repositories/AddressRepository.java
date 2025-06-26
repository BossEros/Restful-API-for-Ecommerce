package com.codewithdave.store.repositories;

import com.codewithdave.store.entities.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Long> {
}
