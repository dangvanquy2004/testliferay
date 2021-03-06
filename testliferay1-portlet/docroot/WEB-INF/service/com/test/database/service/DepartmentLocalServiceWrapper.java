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

package com.test.database.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link DepartmentLocalService}.
 * </p>
 *
 * @author    QUY CNTT
 * @see       DepartmentLocalService
 * @generated
 */
public class DepartmentLocalServiceWrapper implements DepartmentLocalService,
	ServiceWrapper<DepartmentLocalService> {
	public DepartmentLocalServiceWrapper(
		DepartmentLocalService departmentLocalService) {
		_departmentLocalService = departmentLocalService;
	}

	/**
	* Adds the department to the database. Also notifies the appropriate model listeners.
	*
	* @param department the department
	* @return the department that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.test.database.model.Department addDepartment(
		com.test.database.model.Department department)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _departmentLocalService.addDepartment(department);
	}

	/**
	* Creates a new department with the primary key. Does not add the department to the database.
	*
	* @param iddepartment the primary key for the new department
	* @return the new department
	*/
	public com.test.database.model.Department createDepartment(int iddepartment) {
		return _departmentLocalService.createDepartment(iddepartment);
	}

	/**
	* Deletes the department with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param iddepartment the primary key of the department
	* @return the department that was removed
	* @throws PortalException if a department with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.test.database.model.Department deleteDepartment(int iddepartment)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _departmentLocalService.deleteDepartment(iddepartment);
	}

	/**
	* Deletes the department from the database. Also notifies the appropriate model listeners.
	*
	* @param department the department
	* @return the department that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.test.database.model.Department deleteDepartment(
		com.test.database.model.Department department)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _departmentLocalService.deleteDepartment(department);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _departmentLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _departmentLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _departmentLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _departmentLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _departmentLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.test.database.model.Department fetchDepartment(int iddepartment)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _departmentLocalService.fetchDepartment(iddepartment);
	}

	/**
	* Returns the department with the primary key.
	*
	* @param iddepartment the primary key of the department
	* @return the department
	* @throws PortalException if a department with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.test.database.model.Department getDepartment(int iddepartment)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _departmentLocalService.getDepartment(iddepartment);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _departmentLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the departments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of departments
	* @param end the upper bound of the range of departments (not inclusive)
	* @return the range of departments
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.test.database.model.Department> getDepartments(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _departmentLocalService.getDepartments(start, end);
	}

	/**
	* Returns the number of departments.
	*
	* @return the number of departments
	* @throws SystemException if a system exception occurred
	*/
	public int getDepartmentsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _departmentLocalService.getDepartmentsCount();
	}

	/**
	* Updates the department in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param department the department
	* @return the department that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.test.database.model.Department updateDepartment(
		com.test.database.model.Department department)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _departmentLocalService.updateDepartment(department);
	}

	/**
	* Updates the department in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param department the department
	* @param merge whether to merge the department with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the department that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.test.database.model.Department updateDepartment(
		com.test.database.model.Department department, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _departmentLocalService.updateDepartment(department, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _departmentLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_departmentLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _departmentLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public DepartmentLocalService getWrappedDepartmentLocalService() {
		return _departmentLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedDepartmentLocalService(
		DepartmentLocalService departmentLocalService) {
		_departmentLocalService = departmentLocalService;
	}

	public DepartmentLocalService getWrappedService() {
		return _departmentLocalService;
	}

	public void setWrappedService(DepartmentLocalService departmentLocalService) {
		_departmentLocalService = departmentLocalService;
	}

	private DepartmentLocalService _departmentLocalService;
}