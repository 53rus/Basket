package pro.sky.basket.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.basket.domain.Basket;

import java.util.Collections;
import java.util.List;
@Service
@SessionScope
public class BasketServiceImpl implements BasketService {
    private Basket basket;

    @Override
    public List<Integer> add(List<Integer> id) {
        return basket.add(id);
    }

    @Override
    public List<Integer> get() {
        return basket.getList();
    }
}
