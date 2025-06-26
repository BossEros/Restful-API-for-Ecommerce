package com.codewithdave.store.repositories;

import com.codewithdave.store.entities.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Byte> {
}
