package com.max.web;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.max.web.controllers")
public class MyWebConfig {}