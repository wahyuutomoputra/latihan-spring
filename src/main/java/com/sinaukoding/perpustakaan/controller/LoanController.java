package com.sinaukoding.perpustakaan.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sinaukoding.perpustakaan.common.RestResult;
import com.sinaukoding.perpustakaan.entity.Book;
import com.sinaukoding.perpustakaan.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("loans")
public class LoanController extends BaseController {
    @Autowired
    private LoanService service;
}
