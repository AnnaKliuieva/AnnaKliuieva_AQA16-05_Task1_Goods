package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Anna on 10.02.2017.
 */
public class Container {
    private List<Electronics> goods = new ArrayList<Electronics>();

    public boolean addGoods(Electronics good){
        return goods.add(good);
    }

    public int countGoods(){
        return goods.size();
    }

    public Electronics getIndex(int index){
        return goods.get(index);
    }

    public void sortByCost(){
        Collections.sort(goods, Electronics::compareTo);
    }

    public void printContentOf(){
        for(Electronics good : goods)
            System.out.println(good);
    }
}
