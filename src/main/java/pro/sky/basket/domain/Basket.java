package pro.sky.basket.domain;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;
@Component
@SessionScope
public class Basket {
    private final List<Integer> items;

    public Basket(List<Integer> items) {
        this.items = items;
    }

    public List<Integer> getItems() {
        return items;
    }

    public List<Integer> add(List<Integer> id) {
        if (id != null) {
            items.addAll(id);
        }
        return items;
    }

    public List<Integer> getList() {
        return items;
    }
}
