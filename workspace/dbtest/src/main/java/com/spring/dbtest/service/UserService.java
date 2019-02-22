package com.spring.dbtest.service;

import java.util.ArrayList;
import java.util.List;

import com.spring.dbtest.pagenation.Criteria;
import com.spring.dbtest.pagenation.PageMaker;
import com.spring.dbtest.vo.UserVo;

public interface UserService {

  public void register(String id, String pwd);

  public List<UserVo> getListView(UserVo userVo);

  public List<UserVo> getSearchView(String search);

  public void userUpdate(String id, String pwd);

  public void userDelete(String id, String pwd);

  public PageMaker getPageMaker(Criteria cri, int i); // 페이징 처리시 필요

  public List<UserVo> getUsers(Criteria cri); // 페이징 처리시 필요

  

}
