package com.kyh.hellojpa;

import javax.persistence.Entity;

/**
 * Created by sskim on 2021/06/27
 * Github : http://github.com/sskim91
 */
@Entity
public class Book extends Item {

    private String author;
    private String isbn;
}
