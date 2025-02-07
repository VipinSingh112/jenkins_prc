/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.jtb.application.form.service.model.AttractionWaterEmployee;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the attraction water employee service. This utility wraps <code>com.nbp.jtb.application.form.service.service.persistence.impl.AttractionWaterEmployeePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AttractionWaterEmployeePersistence
 * @generated
 */
public class AttractionWaterEmployeeUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(
		AttractionWaterEmployee attractionWaterEmployee) {

		getPersistence().clearCache(attractionWaterEmployee);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, AttractionWaterEmployee> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AttractionWaterEmployee> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AttractionWaterEmployee> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AttractionWaterEmployee> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AttractionWaterEmployee> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AttractionWaterEmployee update(
		AttractionWaterEmployee attractionWaterEmployee) {

		return getPersistence().update(attractionWaterEmployee);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AttractionWaterEmployee update(
		AttractionWaterEmployee attractionWaterEmployee,
		ServiceContext serviceContext) {

		return getPersistence().update(attractionWaterEmployee, serviceContext);
	}

	/**
	 * Returns the attraction water employee where jtbApplicationId = &#63; or throws a <code>NoSuchAttractionWaterEmployeeException</code> if it could not be found.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction water employee
	 * @throws NoSuchAttractionWaterEmployeeException if a matching attraction water employee could not be found
	 */
	public static AttractionWaterEmployee findBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAttractionWaterEmployeeException {

		return getPersistence().findBygetJTB_ByApplicationId(jtbApplicationId);
	}

	/**
	 * Returns the attraction water employee where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction water employee, or <code>null</code> if a matching attraction water employee could not be found
	 */
	public static AttractionWaterEmployee fetchBygetJTB_ByApplicationId(
		long jtbApplicationId) {

		return getPersistence().fetchBygetJTB_ByApplicationId(jtbApplicationId);
	}

	/**
	 * Returns the attraction water employee where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching attraction water employee, or <code>null</code> if a matching attraction water employee could not be found
	 */
	public static AttractionWaterEmployee fetchBygetJTB_ByApplicationId(
		long jtbApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetJTB_ByApplicationId(
			jtbApplicationId, useFinderCache);
	}

	/**
	 * Removes the attraction water employee where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the attraction water employee that was removed
	 */
	public static AttractionWaterEmployee removeBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAttractionWaterEmployeeException {

		return getPersistence().removeBygetJTB_ByApplicationId(
			jtbApplicationId);
	}

	/**
	 * Returns the number of attraction water employees where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching attraction water employees
	 */
	public static int countBygetJTB_ByApplicationId(long jtbApplicationId) {
		return getPersistence().countBygetJTB_ByApplicationId(jtbApplicationId);
	}

	/**
	 * Caches the attraction water employee in the entity cache if it is enabled.
	 *
	 * @param attractionWaterEmployee the attraction water employee
	 */
	public static void cacheResult(
		AttractionWaterEmployee attractionWaterEmployee) {

		getPersistence().cacheResult(attractionWaterEmployee);
	}

	/**
	 * Caches the attraction water employees in the entity cache if it is enabled.
	 *
	 * @param attractionWaterEmployees the attraction water employees
	 */
	public static void cacheResult(
		List<AttractionWaterEmployee> attractionWaterEmployees) {

		getPersistence().cacheResult(attractionWaterEmployees);
	}

	/**
	 * Creates a new attraction water employee with the primary key. Does not add the attraction water employee to the database.
	 *
	 * @param attractionWaterEmpLicId the primary key for the new attraction water employee
	 * @return the new attraction water employee
	 */
	public static AttractionWaterEmployee create(long attractionWaterEmpLicId) {
		return getPersistence().create(attractionWaterEmpLicId);
	}

	/**
	 * Removes the attraction water employee with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param attractionWaterEmpLicId the primary key of the attraction water employee
	 * @return the attraction water employee that was removed
	 * @throws NoSuchAttractionWaterEmployeeException if a attraction water employee with the primary key could not be found
	 */
	public static AttractionWaterEmployee remove(long attractionWaterEmpLicId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAttractionWaterEmployeeException {

		return getPersistence().remove(attractionWaterEmpLicId);
	}

	public static AttractionWaterEmployee updateImpl(
		AttractionWaterEmployee attractionWaterEmployee) {

		return getPersistence().updateImpl(attractionWaterEmployee);
	}

	/**
	 * Returns the attraction water employee with the primary key or throws a <code>NoSuchAttractionWaterEmployeeException</code> if it could not be found.
	 *
	 * @param attractionWaterEmpLicId the primary key of the attraction water employee
	 * @return the attraction water employee
	 * @throws NoSuchAttractionWaterEmployeeException if a attraction water employee with the primary key could not be found
	 */
	public static AttractionWaterEmployee findByPrimaryKey(
			long attractionWaterEmpLicId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAttractionWaterEmployeeException {

		return getPersistence().findByPrimaryKey(attractionWaterEmpLicId);
	}

	/**
	 * Returns the attraction water employee with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param attractionWaterEmpLicId the primary key of the attraction water employee
	 * @return the attraction water employee, or <code>null</code> if a attraction water employee with the primary key could not be found
	 */
	public static AttractionWaterEmployee fetchByPrimaryKey(
		long attractionWaterEmpLicId) {

		return getPersistence().fetchByPrimaryKey(attractionWaterEmpLicId);
	}

	/**
	 * Returns all the attraction water employees.
	 *
	 * @return the attraction water employees
	 */
	public static List<AttractionWaterEmployee> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the attraction water employees.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionWaterEmployeeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction water employees
	 * @param end the upper bound of the range of attraction water employees (not inclusive)
	 * @return the range of attraction water employees
	 */
	public static List<AttractionWaterEmployee> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the attraction water employees.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionWaterEmployeeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction water employees
	 * @param end the upper bound of the range of attraction water employees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of attraction water employees
	 */
	public static List<AttractionWaterEmployee> findAll(
		int start, int end,
		OrderByComparator<AttractionWaterEmployee> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the attraction water employees.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionWaterEmployeeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction water employees
	 * @param end the upper bound of the range of attraction water employees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of attraction water employees
	 */
	public static List<AttractionWaterEmployee> findAll(
		int start, int end,
		OrderByComparator<AttractionWaterEmployee> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the attraction water employees from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of attraction water employees.
	 *
	 * @return the number of attraction water employees
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AttractionWaterEmployeePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AttractionWaterEmployeePersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AttractionWaterEmployeePersistence _persistence;

}