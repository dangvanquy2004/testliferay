/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.test.database.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.test.database.model.Employee;

/**
 * The persistence interface for the employee service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author QUY CNTT
 * @see EmployeePersistenceImpl
 * @see EmployeeUtil
 * @generated
 */
public interface EmployeePersistence extends BasePersistence<Employee> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link EmployeeUtil} to access the employee persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the employee in the entity cache if it is enabled.
	*
	* @param employee the employee
	*/
	public void cacheResult(com.test.database.model.Employee employee);

	/**
	* Caches the employees in the entity cache if it is enabled.
	*
	* @param employees the employees
	*/
	public void cacheResult(
		java.util.List<com.test.database.model.Employee> employees);

	/**
	* Creates a new employee with the primary key. Does not add the employee to the database.
	*
	* @param id the primary key for the new employee
	* @return the new employee
	*/
	public com.test.database.model.Employee create(int id);

	/**
	* Removes the employee with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the employee
	* @return the employee that was removed
	* @throws com.test.database.NoSuchEmployeeException if a employee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.test.database.model.Employee remove(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.database.NoSuchEmployeeException;

	public com.test.database.model.Employee updateImpl(
		com.test.database.model.Employee employee, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the employee with the primary key or throws a {@link com.test.database.NoSuchEmployeeException} if it could not be found.
	*
	* @param id the primary key of the employee
	* @return the employee
	* @throws com.test.database.NoSuchEmployeeException if a employee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.test.database.model.Employee findByPrimaryKey(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.database.NoSuchEmployeeException;

	/**
	* Returns the employee with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the employee
	* @return the employee, or <code>null</code> if a employee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.test.database.model.Employee fetchByPrimaryKey(int id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the employees where iddepartment = &#63;.
	*
	* @param iddepartment the iddepartment
	* @return the matching employees
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.test.database.model.Employee> findByDepartment(
		int iddepartment)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the employees where iddepartment = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param iddepartment the iddepartment
	* @param start the lower bound of the range of employees
	* @param end the upper bound of the range of employees (not inclusive)
	* @return the range of matching employees
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.test.database.model.Employee> findByDepartment(
		int iddepartment, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the employees where iddepartment = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param iddepartment the iddepartment
	* @param start the lower bound of the range of employees
	* @param end the upper bound of the range of employees (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching employees
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.test.database.model.Employee> findByDepartment(
		int iddepartment, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first employee in the ordered set where iddepartment = &#63;.
	*
	* @param iddepartment the iddepartment
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee
	* @throws com.test.database.NoSuchEmployeeException if a matching employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.test.database.model.Employee findByDepartment_First(
		int iddepartment,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.database.NoSuchEmployeeException;

	/**
	* Returns the first employee in the ordered set where iddepartment = &#63;.
	*
	* @param iddepartment the iddepartment
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee, or <code>null</code> if a matching employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.test.database.model.Employee fetchByDepartment_First(
		int iddepartment,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last employee in the ordered set where iddepartment = &#63;.
	*
	* @param iddepartment the iddepartment
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee
	* @throws com.test.database.NoSuchEmployeeException if a matching employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.test.database.model.Employee findByDepartment_Last(
		int iddepartment,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.database.NoSuchEmployeeException;

	/**
	* Returns the last employee in the ordered set where iddepartment = &#63;.
	*
	* @param iddepartment the iddepartment
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee, or <code>null</code> if a matching employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.test.database.model.Employee fetchByDepartment_Last(
		int iddepartment,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the employees before and after the current employee in the ordered set where iddepartment = &#63;.
	*
	* @param id the primary key of the current employee
	* @param iddepartment the iddepartment
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next employee
	* @throws com.test.database.NoSuchEmployeeException if a employee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.test.database.model.Employee[] findByDepartment_PrevAndNext(
		int id, int iddepartment,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.database.NoSuchEmployeeException;

	/**
	* Returns the employee where id = &#63; or throws a {@link com.test.database.NoSuchEmployeeException} if it could not be found.
	*
	* @param id the ID
	* @return the matching employee
	* @throws com.test.database.NoSuchEmployeeException if a matching employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.test.database.model.Employee findByEmployee(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.database.NoSuchEmployeeException;

	/**
	* Returns the employee where id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param id the ID
	* @return the matching employee, or <code>null</code> if a matching employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.test.database.model.Employee fetchByEmployee(int id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the employee where id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param id the ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching employee, or <code>null</code> if a matching employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.test.database.model.Employee fetchByEmployee(int id,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the employees.
	*
	* @return the employees
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.test.database.model.Employee> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the employees.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of employees
	* @param end the upper bound of the range of employees (not inclusive)
	* @return the range of employees
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.test.database.model.Employee> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the employees.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of employees
	* @param end the upper bound of the range of employees (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of employees
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.test.database.model.Employee> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the employees where iddepartment = &#63; from the database.
	*
	* @param iddepartment the iddepartment
	* @throws SystemException if a system exception occurred
	*/
	public void removeByDepartment(int iddepartment)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the employee where id = &#63; from the database.
	*
	* @param id the ID
	* @return the employee that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.test.database.model.Employee removeByEmployee(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.database.NoSuchEmployeeException;

	/**
	* Removes all the employees from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of employees where iddepartment = &#63;.
	*
	* @param iddepartment the iddepartment
	* @return the number of matching employees
	* @throws SystemException if a system exception occurred
	*/
	public int countByDepartment(int iddepartment)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of employees where id = &#63;.
	*
	* @param id the ID
	* @return the number of matching employees
	* @throws SystemException if a system exception occurred
	*/
	public int countByEmployee(int id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of employees.
	*
	* @return the number of employees
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}