package org.system.base.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.system.base.service.Service;

public class BaseController<T, S extends Service<T>> {
    @Autowired
    protected S service;
}
