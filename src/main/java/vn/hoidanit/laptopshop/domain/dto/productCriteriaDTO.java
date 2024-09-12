package vn.hoidanit.laptopshop.domain.dto;
import java.util.Optional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class productCriteriaDTO {
    private Optional<String> page ;
    private Optional<String> sort ;
    private Optional <List<String>> factory ;
    private Optional <List<String>> target ;
    private Optional <List<String>> price ;
    public Optional<String> getPage() {
        return page;
    }
    public void setPage(Optional<String> page) {
        this.page = page;
    }
    public Optional<String> getSort() {
        return sort;
    }
    public void setSort(Optional<String> sort) {
        this.sort = sort;
    }
    public Optional<List<String>> getFactory() {
        return factory;
    }
    public void setFactory(Optional<List<String>> factory) {
        this.factory = factory;
    }
    public Optional<List<String>> getTarget() {
        return target;
    }
    public void setTarget(Optional<List<String>> target) {
        this.target = target;
    }
    public Optional<List<String>> getPrice() {
        return price;
    }
    public void setPrice(Optional<List<String>> price) {
        this.price = price;
    }
    
    public productCriteriaDTO(Optional<String> page, Optional<String> sort, Optional<List<String>> factory,
            Optional<List<String>> target, Optional<List<String>> price) {
        this.page = page;
        this.sort = sort;
        this.factory = factory;
        this.target = target;
        this.price = price;
    }

    
}