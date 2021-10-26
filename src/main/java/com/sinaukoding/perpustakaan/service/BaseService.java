package com.sinaukoding.perpustakaan.service;

import com.sinaukoding.perpustakaan.dao.BaseDAO;
import com.sinaukoding.perpustakaan.entity.BaseEntity;
import com.sinaukoding.perpustakaan.entity.Book;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

public abstract class BaseService<T extends BaseEntity<T>> {

    protected  abstract BaseDAO<T> getDao();

    @Transactional(readOnly = true)
    public T findOne(T param){
        return getDao().findOne(param);
    }

    @Transactional(readOnly = true)
    public Collection<T> find(Book param, int offset, int limit){
        return getDao().find((T) param, offset,limit);
    }

    @Transactional(readOnly = true)
    public Long count(Book param){
        return getDao().count((T) param);
    }

    @Transactional
    public T save(Book entity){
        return getDao().save((T) entity);
    }

    @Transactional
    public T update(T entity){
        if (entity.getId() != null){
            return getDao().update(entity);
        }

        return null;
    }

    @Transactional
    public boolean delete(Long id){
        return getDao().delete(getDao().findReference(id)) != null;
    }
}
