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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.test.database.model.Employee;

import java.util.List;

/**
 * The persistence utility for the employee service. This utility wraps {@link EmployeePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author QUY CNTT
 * @see EmployeePersistence
 * @see EmployeePersistenceImpl
 * @generated
 */
public class EmployeeUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(Employee employee) {
		getPersistence().clearCache(employee);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Employee> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Employee> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Employee> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static Employee update(Employee employee, boolean merge)
		throws SystemException {
		return getPersistence().update(employee, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static Employee update(Employee employee, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(employee, merge, serviceContext);
	}

	/**
	* Caches the employee in the entity cache if it is enabled.
	*
	* @param employee the employee
	*/
	public static void cacheResult(com.test.database.model.Employee employee) {
		getPersistence().cacheResult(employee);
	}

	/**
	* Caches the employees in the entity cache if it is enabled.
	*
	* @param employees the employees
	*/
	public static void cacheResult(
		java.util.List<com.test.database.model.Employee> employees) {
		getPersistence().cacheResult(employees);
	}

	/**
	* Creates a new employee with the primary key. Does not add the employee to the database.
	*
	* @param id the primary key for the new employee
	* @return the new employee
	*/
	public static com.test.database.model.Employee create(int id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the employee with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the employee
	* @return the employee that was removed
	* @throws com.test.database.NoSuchEmployeeException if a employee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.database.model.Employee remove(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.database.NoSuchEmployeeException {
		return getPersistence().remove(id);
	}

	public static com.test.database.model.Employee updateImpl(
		com.test.database.model.Employee employee, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(employee, merge);
	}

	/**
	* Returns the employee with the primary key or throws a {@link com.test.database.NoSuchEmployeeException} if it could not be found.
	*
	* @param id the primary key of the employee
	* @return the employee
	* @throws com.test.database.NoSuchEmployeeException if a employee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.database.model.Employee findByPrimaryKey(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.database.NoSuchEmployeeException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the employee with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the employee
	* @return the employee, or <code>null</code> if a employee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.database.model.Employee fetchByPrimaryKey(int id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the employees where iddepartment = &#63;.
	*
	* @param iddepartment the iddepartment
	* @return the matching employees
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.test.database.model.Employee> findByDepartment(
		int iddepartment)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByDepartment(iddepartment);
	}

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
	public static java.util.List<com.test.database.model.Employee> findByDepartment(
		int iddepartment, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByDepartment(iddepartment, start, end);
	}

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
	public static java.util.List<com.test.database.model.Employee> findByDepartment(
		int iddepartment, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDepartment(iddepartment, start, end, orderByComparator);
	}

	/**
	* Returns the first employee in the ordered set where iddepartment = &#63;.
	*
	* @param iddepartment the iddepartment
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee
	* @throws com.test.database.NoSuchEmployeeException if a matching employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.database.model.Employee findByDepartment_First(
		int iddepartment,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.database.NoSuchEmployeeException {
		return getPersistence()
				   .findByDepartment_First(iddepartment, orderByComparator);
	}

	/**
	* Returns the first employee in the ordered set where iddepartment = &#63;.
	*
	* @param iddepartment the iddepartment
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee, or <code>null</code> if a matching employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.database.model.Employee fetchByDepartment_First(
		int iddepartment,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDepartment_First(iddepartment, orderByComparator);
	}

	/**
	* Returns the last employee in the ordered set where iddepartment = &#63;.
	*
	* @param iddepartment the iddepartment
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee
	* @throws com.test.database.NoSuchEmployeeException if a matching employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.database.model.Employee findByDepartment_Last(
		int iddepartment,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.database.NoSuchEmployeeException {
		return getPersistence()
				   .findByDepartment_Last(iddepartment, orderByComparator);
	}

	/**
	* Returns the last employee in the ordered set where iddepartment = &#63;.
	*
	* @param iddepartment the iddepartment
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee, or <code>null</code> if a matching employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.database.model.Employee fetchByDepartment_Last(
		int iddepartment,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDepartment_Last(iddepartment, orderByComparator);
	}

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
	public static com.test.database.model.Employee[] findByDepartment_PrevAndNext(
		int id, int iddepartment,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.database.NoSuchEmployeeException {
		return getPersistence()
				   .findByDepartment_PrevAndNext(id, iddepartment,
			orderByComparator);
	}

	/**
	* Returns the employee where id = &#63; or throws a {@link com.test.database.NoSuchEmployeeException} if it could not be found.
	*
	* @param id the ID
	* @return the matching employee
	* @throws com.test.database.NoSuchEmployeeException if a matching employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.database.model.Employee findByEmployee(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.database.NoSuchEmployeeException {
		return getPersistence().findByEmployee(id);
	}

	/**
	* Returns the employee where id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param id the ID
	* @return the matching employee, or <code>null</code> if a matching employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.database.model.Employee fetchByEmployee(int id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByEmployee(id);
	}

	/**
	* Returns the employee where id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param id the ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching employee, or <code>null</code> if a matching employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.database.model.Employee fetchByEmployee(int id,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByEmployee(id, retrieveFromCache);
	}

	/**
	* Returns all the employees.
	*
	* @return the employees
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.test.database.model.Employee> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<com.test.database.model.Employee> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.test.database.model.Employee> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the employees where iddepartment = &#63; from the database.
	*
	* @param iddepartment the iddepartment
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByDepartment(int iddepartment)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByDepartment(iddepartment);
	}

	/**
	* Removes the employee where id = &#63; from the database.
	*
	* @param id the ID
	* @return the employee that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.database.model.Employee removeByEmployee(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.database.NoSuchEmployeeException {
		return getPersistence().removeByEmployee(id);
	}

	/**
	* Removes all the employees from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of employees where iddepartment = &#63;.
	*
	* @param iddepartment the iddepartment
	* @return the number of matching employees
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDepartment(int iddepartment)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByDepartment(iddepartment);
	}

	/**
	* Returns the number of employees where id = &#63;.
	*
	* @param id the ID
	* @return the number of matching employees
	* @throws SystemException if a system exception occurred
	*/
	public static int countByEmployee(int id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByEmployee(id);
	}

	/**
	* Returns the number of employees.
	*
	* @return the number of employees
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static EmployeePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (EmployeePersistence)PortletBeanLocatorUtil.locate(com.test.database.service.ClpSerializer.getServletContextName(),
					EmployeePersistence.class.getName());

			ReferenceRegistry.registerReference(EmployeeUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(EmployeePersistence persistence) {
	}

	private static EmployeePersistence _persistence;
}