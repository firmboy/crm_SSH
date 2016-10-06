package com.itcast.crm.customer.utils;

import java.util.List;

import com.itcast.crm.customer.domain.Customer;

public class PageBean {
	
	private Integer sartIndex;
	private Integer pageNumber;
	private Integer pageSize;
	private Integer totalRecord;
	private Integer totalPage;
	
	private List<Customer> result;
	private Customer customer;
	public PageBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getSartIndex() {
		this.setSartIndex((this.getPageNumber()-1)*this.getPageSize());
		return sartIndex;
	}
	public void setSartIndex(Integer sartIndex) {
		this.sartIndex = sartIndex;
	}
	public Integer getPageNumber() {
		return pageNumber;
	}
	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getTotalRecord() {
		return totalRecord;
	}
	public void setTotalRecord(Integer totalRecord) {
		this.totalRecord = totalRecord;
	}
	public Integer getTotalPage() {
		this.setTotalPage(this.getTotalRecord()%this.getPageSize()==0?this.getTotalRecord()/this.getPageSize():(this.getTotalRecord()/this.getPageSize())+1);
		return totalPage;
	}
	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}
	public List<Customer> getResult() {
		return result;
	}
	public void setResult(List<Customer> result) {
		this.result = result;
	}
	public Customer getObj() {
		return customer;
	}
	public void setObj(Customer obj) {
		this.customer = obj;
	}
	
	
}
