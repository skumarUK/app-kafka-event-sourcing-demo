package demo.api.query.domain;

import demo.api.common.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
interface ItemRepository extends JpaRepository<Item, String> {
}
