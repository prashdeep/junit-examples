package com.sapient.junit.core;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.sapient.junit.service.EmployeeServiceTest;
import com.sapient.junit.test.model.EmployeeTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({EmployeeServiceTest.class, EmployeeTest.class})
public class BaseTest {

}
