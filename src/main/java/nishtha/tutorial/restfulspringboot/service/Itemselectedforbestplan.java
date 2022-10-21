package nishtha.tutorial.restfulspringboot.service;

import java.util.Arrays;

import nishtha.tutorial.restfulspringboot.domain.Product;

public class Itemselectedforbestplan {


String string = "pr1 10 pr2 25 pr3 30 pr4 45";

Integer sum = Arrays.stream(string.split(" "))
    .filter((s) -> s.matches("\\d+"))
    .mapToInt(Integer::valueOf)
    .sum();

}