package nishtha.tutorial.restfulspringboot.service;


import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

import nishtha.tutorial.restfulspringboot.domain.Product;
import nishtha.tutorial.restfulspringboot.repository.ProductRepository;
import nishtha.tutorial.restfulspringboot.service.ProductService;

public class PlanItemcheckoutImpl extends ProductServiceImpl
{
@Override
public Iterable<ProductServiceImpl> getAllProducts() {
    return this.getAllProducts();
}


}

