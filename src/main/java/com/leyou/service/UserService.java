package com.leyou.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.leyou.mapper.UserMapper;
import com.leyou.pojo.User;

@Service
public class UserService {

	@Autowired
    private UserMapper userMapper;
	
	public User queryById(Long id){
        return this.userMapper.selectByPrimaryKey(id);
    }
	
	@Transactional
    public void deleteById(Long id){
        this.userMapper.deleteByPrimaryKey(id);
    }



}
