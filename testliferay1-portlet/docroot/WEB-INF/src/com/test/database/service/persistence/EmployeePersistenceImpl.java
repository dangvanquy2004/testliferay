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

import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.test.database.NoSuchEmployeeException;
import com.test.database.model.Employee;
import com.test.database.model.impl.EmployeeImpl;
import com.test.database.model.impl.EmployeeModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the employee service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author QUY CNTT
 * @see EmployeePersistence
 * @see EmployeeUtil
 * @generated
 */
public class EmployeePersistenceImpl extends BasePersistenceImpl<Employee>
	implements EmployeePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link EmployeeUtil} to access the employee persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = EmployeeImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DEPARTMENT =
		new FinderPath(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeModelImpl.FINDER_CACHE_ENABLED, EmployeeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDepartment",
			new String[] {
				Integer.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEPARTMENT =
		new FinderPath(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeModelImpl.FINDER_CACHE_ENABLED, EmployeeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDepartment",
			new String[] { Integer.class.getName() },
			EmployeeModelImpl.IDDEPARTMENT_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DEPARTMENT = new FinderPath(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDepartment",
			new String[] { Integer.class.getName() });
	public static final FinderPath FINDER_PATH_FETCH_BY_EMPLOYEE = new FinderPath(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeModelImpl.FINDER_CACHE_ENABLED, EmployeeImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByEmployee",
			new String[] { Integer.class.getName() },
			EmployeeModelImpl.ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_EMPLOYEE = new FinderPath(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByEmployee",
			new String[] { Integer.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeModelImpl.FINDER_CACHE_ENABLED, EmployeeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeModelImpl.FINDER_CACHE_ENABLED, EmployeeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the employee in the entity cache if it is enabled.
	 *
	 * @param employee the employee
	 */
	public void cacheResult(Employee employee) {
		EntityCacheUtil.putResult(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeImpl.class, employee.getPrimaryKey(), employee);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_EMPLOYEE,
			new Object[] { Integer.valueOf(employee.getId()) }, employee);

		employee.resetOriginalValues();
	}

	/**
	 * Caches the employees in the entity cache if it is enabled.
	 *
	 * @param employees the employees
	 */
	public void cacheResult(List<Employee> employees) {
		for (Employee employee : employees) {
			if (EntityCacheUtil.getResult(
						EmployeeModelImpl.ENTITY_CACHE_ENABLED,
						EmployeeImpl.class, employee.getPrimaryKey()) == null) {
				cacheResult(employee);
			}
			else {
				employee.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all employees.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(EmployeeImpl.class.getName());
		}

		EntityCacheUtil.clearCache(EmployeeImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the employee.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Employee employee) {
		EntityCacheUtil.removeResult(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeImpl.class, employee.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(employee);
	}

	@Override
	public void clearCache(List<Employee> employees) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Employee employee : employees) {
			EntityCacheUtil.removeResult(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
				EmployeeImpl.class, employee.getPrimaryKey());

			clearUniqueFindersCache(employee);
		}
	}

	protected void clearUniqueFindersCache(Employee employee) {
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_EMPLOYEE,
			new Object[] { Integer.valueOf(employee.getId()) });
	}

	/**
	 * Creates a new employee with the primary key. Does not add the employee to the database.
	 *
	 * @param id the primary key for the new employee
	 * @return the new employee
	 */
	public Employee create(int id) {
		Employee employee = new EmployeeImpl();

		employee.setNew(true);
		employee.setPrimaryKey(id);

		return employee;
	}

	/**
	 * Removes the employee with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the employee
	 * @return the employee that was removed
	 * @throws com.test.database.NoSuchEmployeeException if a employee with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Employee remove(int id)
		throws NoSuchEmployeeException, SystemException {
		return remove(Integer.valueOf(id));
	}

	/**
	 * Removes the employee with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the employee
	 * @return the employee that was removed
	 * @throws com.test.database.NoSuchEmployeeException if a employee with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Employee remove(Serializable primaryKey)
		throws NoSuchEmployeeException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Employee employee = (Employee)session.get(EmployeeImpl.class,
					primaryKey);

			if (employee == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchEmployeeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(employee);
		}
		catch (NoSuchEmployeeException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Employee removeImpl(Employee employee) throws SystemException {
		employee = toUnwrappedModel(employee);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, employee);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(employee);

		return employee;
	}

	@Override
	public Employee updateImpl(com.test.database.model.Employee employee,
		boolean merge) throws SystemException {
		employee = toUnwrappedModel(employee);

		boolean isNew = employee.isNew();

		EmployeeModelImpl employeeModelImpl = (EmployeeModelImpl)employee;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, employee, merge);

			employee.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !EmployeeModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((employeeModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEPARTMENT.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Integer.valueOf(employeeModelImpl.getOriginalIddepartment())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DEPARTMENT,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEPARTMENT,
					args);

				args = new Object[] {
						Integer.valueOf(employeeModelImpl.getIddepartment())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DEPARTMENT,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEPARTMENT,
					args);
			}
		}

		EntityCacheUtil.putResult(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeImpl.class, employee.getPrimaryKey(), employee);

		if (isNew) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_EMPLOYEE,
				new Object[] { Integer.valueOf(employee.getId()) }, employee);
		}
		else {
			if ((employeeModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_EMPLOYEE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Integer.valueOf(employeeModelImpl.getOriginalId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_EMPLOYEE, args);

				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_EMPLOYEE, args);

				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_EMPLOYEE,
					new Object[] { Integer.valueOf(employee.getId()) }, employee);
			}
		}

		return employee;
	}

	protected Employee toUnwrappedModel(Employee employee) {
		if (employee instanceof EmployeeImpl) {
			return employee;
		}

		EmployeeImpl employeeImpl = new EmployeeImpl();

		employeeImpl.setNew(employee.isNew());
		employeeImpl.setPrimaryKey(employee.getPrimaryKey());

		employeeImpl.setId(employee.getId());
		employeeImpl.setName(employee.getName());
		employeeImpl.setAddress(employee.getAddress());
		employeeImpl.setPhone(employee.getPhone());
		employeeImpl.setIddepartment(employee.getIddepartment());

		return employeeImpl;
	}

	/**
	 * Returns the employee with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the employee
	 * @return the employee
	 * @throws com.liferay.portal.NoSuchModelException if a employee with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Employee findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the employee with the primary key or throws a {@link com.test.database.NoSuchEmployeeException} if it could not be found.
	 *
	 * @param id the primary key of the employee
	 * @return the employee
	 * @throws com.test.database.NoSuchEmployeeException if a employee with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Employee findByPrimaryKey(int id)
		throws NoSuchEmployeeException, SystemException {
		Employee employee = fetchByPrimaryKey(id);

		if (employee == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchEmployeeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return employee;
	}

	/**
	 * Returns the employee with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the employee
	 * @return the employee, or <code>null</code> if a employee with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Employee fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the employee with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the employee
	 * @return the employee, or <code>null</code> if a employee with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Employee fetchByPrimaryKey(int id) throws SystemException {
		Employee employee = (Employee)EntityCacheUtil.getResult(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
				EmployeeImpl.class, id);

		if (employee == _nullEmployee) {
			return null;
		}

		if (employee == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				employee = (Employee)session.get(EmployeeImpl.class,
						Integer.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (employee != null) {
					cacheResult(employee);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
						EmployeeImpl.class, id, _nullEmployee);
				}

				closeSession(session);
			}
		}

		return employee;
	}

	/**
	 * Returns all the employees where iddepartment = &#63;.
	 *
	 * @param iddepartment the iddepartment
	 * @return the matching employees
	 * @throws SystemException if a system exception occurred
	 */
	public List<Employee> findByDepartment(int iddepartment)
		throws SystemException {
		return findByDepartment(iddepartment, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	public List<Employee> findByDepartment(int iddepartment, int start, int end)
		throws SystemException {
		return findByDepartment(iddepartment, start, end, null);
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
	public List<Employee> findByDepartment(int iddepartment, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEPARTMENT;
			finderArgs = new Object[] { iddepartment };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DEPARTMENT;
			finderArgs = new Object[] {
					iddepartment,
					
					start, end, orderByComparator
				};
		}

		List<Employee> list = (List<Employee>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Employee employee : list) {
				if ((iddepartment != employee.getIddepartment())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(2);
			}

			query.append(_SQL_SELECT_EMPLOYEE_WHERE);

			query.append(_FINDER_COLUMN_DEPARTMENT_IDDEPARTMENT_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(iddepartment);

				list = (List<Employee>)QueryUtil.list(q, getDialect(), start,
						end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(finderPath, finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(finderPath, finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
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
	public Employee findByDepartment_First(int iddepartment,
		OrderByComparator orderByComparator)
		throws NoSuchEmployeeException, SystemException {
		Employee employee = fetchByDepartment_First(iddepartment,
				orderByComparator);

		if (employee != null) {
			return employee;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("iddepartment=");
		msg.append(iddepartment);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchEmployeeException(msg.toString());
	}

	/**
	 * Returns the first employee in the ordered set where iddepartment = &#63;.
	 *
	 * @param iddepartment the iddepartment
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching employee, or <code>null</code> if a matching employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Employee fetchByDepartment_First(int iddepartment,
		OrderByComparator orderByComparator) throws SystemException {
		List<Employee> list = findByDepartment(iddepartment, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	public Employee findByDepartment_Last(int iddepartment,
		OrderByComparator orderByComparator)
		throws NoSuchEmployeeException, SystemException {
		Employee employee = fetchByDepartment_Last(iddepartment,
				orderByComparator);

		if (employee != null) {
			return employee;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("iddepartment=");
		msg.append(iddepartment);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchEmployeeException(msg.toString());
	}

	/**
	 * Returns the last employee in the ordered set where iddepartment = &#63;.
	 *
	 * @param iddepartment the iddepartment
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching employee, or <code>null</code> if a matching employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Employee fetchByDepartment_Last(int iddepartment,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByDepartment(iddepartment);

		List<Employee> list = findByDepartment(iddepartment, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	public Employee[] findByDepartment_PrevAndNext(int id, int iddepartment,
		OrderByComparator orderByComparator)
		throws NoSuchEmployeeException, SystemException {
		Employee employee = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			Employee[] array = new EmployeeImpl[3];

			array[0] = getByDepartment_PrevAndNext(session, employee,
					iddepartment, orderByComparator, true);

			array[1] = employee;

			array[2] = getByDepartment_PrevAndNext(session, employee,
					iddepartment, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Employee getByDepartment_PrevAndNext(Session session,
		Employee employee, int iddepartment,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_EMPLOYEE_WHERE);

		query.append(_FINDER_COLUMN_DEPARTMENT_IDDEPARTMENT_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(iddepartment);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(employee);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Employee> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns the employee where id = &#63; or throws a {@link com.test.database.NoSuchEmployeeException} if it could not be found.
	 *
	 * @param id the ID
	 * @return the matching employee
	 * @throws com.test.database.NoSuchEmployeeException if a matching employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Employee findByEmployee(int id)
		throws NoSuchEmployeeException, SystemException {
		Employee employee = fetchByEmployee(id);

		if (employee == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("id=");
			msg.append(id);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchEmployeeException(msg.toString());
		}

		return employee;
	}

	/**
	 * Returns the employee where id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param id the ID
	 * @return the matching employee, or <code>null</code> if a matching employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Employee fetchByEmployee(int id) throws SystemException {
		return fetchByEmployee(id, true);
	}

	/**
	 * Returns the employee where id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param id the ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching employee, or <code>null</code> if a matching employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Employee fetchByEmployee(int id, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { id };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_EMPLOYEE,
					finderArgs, this);
		}

		if (result instanceof Employee) {
			Employee employee = (Employee)result;

			if ((id != employee.getId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_SELECT_EMPLOYEE_WHERE);

			query.append(_FINDER_COLUMN_EMPLOYEE_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(id);

				List<Employee> list = q.list();

				result = list;

				Employee employee = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_EMPLOYEE,
						finderArgs, list);
				}
				else {
					employee = list.get(0);

					cacheResult(employee);

					if ((employee.getId() != id)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_EMPLOYEE,
							finderArgs, employee);
					}
				}

				return employee;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_EMPLOYEE,
						finderArgs);
				}

				closeSession(session);
			}
		}
		else {
			if (result instanceof List<?>) {
				return null;
			}
			else {
				return (Employee)result;
			}
		}
	}

	/**
	 * Returns all the employees.
	 *
	 * @return the employees
	 * @throws SystemException if a system exception occurred
	 */
	public List<Employee> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<Employee> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
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
	public List<Employee> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = new Object[] { start, end, orderByComparator };

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<Employee> list = (List<Employee>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_EMPLOYEE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_EMPLOYEE;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<Employee>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<Employee>)QueryUtil.list(q, getDialect(),
							start, end);
				}
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(finderPath, finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(finderPath, finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the employees where iddepartment = &#63; from the database.
	 *
	 * @param iddepartment the iddepartment
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByDepartment(int iddepartment) throws SystemException {
		for (Employee employee : findByDepartment(iddepartment)) {
			remove(employee);
		}
	}

	/**
	 * Removes the employee where id = &#63; from the database.
	 *
	 * @param id the ID
	 * @return the employee that was removed
	 * @throws SystemException if a system exception occurred
	 */
	public Employee removeByEmployee(int id)
		throws NoSuchEmployeeException, SystemException {
		Employee employee = findByEmployee(id);

		return remove(employee);
	}

	/**
	 * Removes all the employees from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (Employee employee : findAll()) {
			remove(employee);
		}
	}

	/**
	 * Returns the number of employees where iddepartment = &#63;.
	 *
	 * @param iddepartment the iddepartment
	 * @return the number of matching employees
	 * @throws SystemException if a system exception occurred
	 */
	public int countByDepartment(int iddepartment) throws SystemException {
		Object[] finderArgs = new Object[] { iddepartment };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_DEPARTMENT,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_EMPLOYEE_WHERE);

			query.append(_FINDER_COLUMN_DEPARTMENT_IDDEPARTMENT_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(iddepartment);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_DEPARTMENT,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of employees where id = &#63;.
	 *
	 * @param id the ID
	 * @return the number of matching employees
	 * @throws SystemException if a system exception occurred
	 */
	public int countByEmployee(int id) throws SystemException {
		Object[] finderArgs = new Object[] { id };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_EMPLOYEE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_EMPLOYEE_WHERE);

			query.append(_FINDER_COLUMN_EMPLOYEE_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(id);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_EMPLOYEE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of employees.
	 *
	 * @return the number of employees
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_EMPLOYEE);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the employee persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.test.database.model.Employee")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Employee>> listenersList = new ArrayList<ModelListener<Employee>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Employee>)InstanceFactory.newInstance(
							listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(EmployeeImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@BeanReference(type = DepartmentPersistence.class)
	protected DepartmentPersistence departmentPersistence;
	@BeanReference(type = EmployeePersistence.class)
	protected EmployeePersistence employeePersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_EMPLOYEE = "SELECT employee FROM Employee employee";
	private static final String _SQL_SELECT_EMPLOYEE_WHERE = "SELECT employee FROM Employee employee WHERE ";
	private static final String _SQL_COUNT_EMPLOYEE = "SELECT COUNT(employee) FROM Employee employee";
	private static final String _SQL_COUNT_EMPLOYEE_WHERE = "SELECT COUNT(employee) FROM Employee employee WHERE ";
	private static final String _FINDER_COLUMN_DEPARTMENT_IDDEPARTMENT_2 = "employee.iddepartment = ?";
	private static final String _FINDER_COLUMN_EMPLOYEE_ID_2 = "employee.id = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "employee.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Employee exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Employee exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(EmployeePersistenceImpl.class);
	private static Employee _nullEmployee = new EmployeeImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Employee> toCacheModel() {
				return _nullEmployeeCacheModel;
			}
		};

	private static CacheModel<Employee> _nullEmployeeCacheModel = new CacheModel<Employee>() {
			public Employee toEntityModel() {
				return _nullEmployee;
			}
		};
}