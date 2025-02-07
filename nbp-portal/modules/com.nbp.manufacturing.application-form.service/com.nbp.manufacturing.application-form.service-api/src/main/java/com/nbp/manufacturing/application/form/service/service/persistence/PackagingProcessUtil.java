/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.manufacturing.application.form.service.model.PackagingProcess;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the packaging process service. This utility wraps <code>com.nbp.manufacturing.application.form.service.service.persistence.impl.PackagingProcessPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PackagingProcessPersistence
 * @generated
 */
public class PackagingProcessUtil {

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
	public static void clearCache(PackagingProcess packagingProcess) {
		getPersistence().clearCache(packagingProcess);
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
	public static Map<Serializable, PackagingProcess> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<PackagingProcess> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<PackagingProcess> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<PackagingProcess> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<PackagingProcess> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static PackagingProcess update(PackagingProcess packagingProcess) {
		return getPersistence().update(packagingProcess);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static PackagingProcess update(
		PackagingProcess packagingProcess, ServiceContext serviceContext) {

		return getPersistence().update(packagingProcess, serviceContext);
	}

	/**
	 * Returns the packaging process where manufacturingApplicationId = &#63; or throws a <code>NoSuchPackagingProcessException</code> if it could not be found.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching packaging process
	 * @throws NoSuchPackagingProcessException if a matching packaging process could not be found
	 */
	public static PackagingProcess findBygetManufactureById(
			long manufacturingApplicationId)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchPackagingProcessException {

		return getPersistence().findBygetManufactureById(
			manufacturingApplicationId);
	}

	/**
	 * Returns the packaging process where manufacturingApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching packaging process, or <code>null</code> if a matching packaging process could not be found
	 */
	public static PackagingProcess fetchBygetManufactureById(
		long manufacturingApplicationId) {

		return getPersistence().fetchBygetManufactureById(
			manufacturingApplicationId);
	}

	/**
	 * Returns the packaging process where manufacturingApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching packaging process, or <code>null</code> if a matching packaging process could not be found
	 */
	public static PackagingProcess fetchBygetManufactureById(
		long manufacturingApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetManufactureById(
			manufacturingApplicationId, useFinderCache);
	}

	/**
	 * Removes the packaging process where manufacturingApplicationId = &#63; from the database.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the packaging process that was removed
	 */
	public static PackagingProcess removeBygetManufactureById(
			long manufacturingApplicationId)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchPackagingProcessException {

		return getPersistence().removeBygetManufactureById(
			manufacturingApplicationId);
	}

	/**
	 * Returns the number of packaging processes where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching packaging processes
	 */
	public static int countBygetManufactureById(
		long manufacturingApplicationId) {

		return getPersistence().countBygetManufactureById(
			manufacturingApplicationId);
	}

	/**
	 * Returns all the packaging processes where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching packaging processes
	 */
	public static List<PackagingProcess> findBygetMA_PP_MAI(
		long manufacturingApplicationId) {

		return getPersistence().findBygetMA_PP_MAI(manufacturingApplicationId);
	}

	/**
	 * Returns a range of all the packaging processes where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PackagingProcessModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of packaging processes
	 * @param end the upper bound of the range of packaging processes (not inclusive)
	 * @return the range of matching packaging processes
	 */
	public static List<PackagingProcess> findBygetMA_PP_MAI(
		long manufacturingApplicationId, int start, int end) {

		return getPersistence().findBygetMA_PP_MAI(
			manufacturingApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the packaging processes where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PackagingProcessModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of packaging processes
	 * @param end the upper bound of the range of packaging processes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching packaging processes
	 */
	public static List<PackagingProcess> findBygetMA_PP_MAI(
		long manufacturingApplicationId, int start, int end,
		OrderByComparator<PackagingProcess> orderByComparator) {

		return getPersistence().findBygetMA_PP_MAI(
			manufacturingApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the packaging processes where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PackagingProcessModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of packaging processes
	 * @param end the upper bound of the range of packaging processes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching packaging processes
	 */
	public static List<PackagingProcess> findBygetMA_PP_MAI(
		long manufacturingApplicationId, int start, int end,
		OrderByComparator<PackagingProcess> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetMA_PP_MAI(
			manufacturingApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first packaging process in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching packaging process
	 * @throws NoSuchPackagingProcessException if a matching packaging process could not be found
	 */
	public static PackagingProcess findBygetMA_PP_MAI_First(
			long manufacturingApplicationId,
			OrderByComparator<PackagingProcess> orderByComparator)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchPackagingProcessException {

		return getPersistence().findBygetMA_PP_MAI_First(
			manufacturingApplicationId, orderByComparator);
	}

	/**
	 * Returns the first packaging process in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching packaging process, or <code>null</code> if a matching packaging process could not be found
	 */
	public static PackagingProcess fetchBygetMA_PP_MAI_First(
		long manufacturingApplicationId,
		OrderByComparator<PackagingProcess> orderByComparator) {

		return getPersistence().fetchBygetMA_PP_MAI_First(
			manufacturingApplicationId, orderByComparator);
	}

	/**
	 * Returns the last packaging process in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching packaging process
	 * @throws NoSuchPackagingProcessException if a matching packaging process could not be found
	 */
	public static PackagingProcess findBygetMA_PP_MAI_Last(
			long manufacturingApplicationId,
			OrderByComparator<PackagingProcess> orderByComparator)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchPackagingProcessException {

		return getPersistence().findBygetMA_PP_MAI_Last(
			manufacturingApplicationId, orderByComparator);
	}

	/**
	 * Returns the last packaging process in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching packaging process, or <code>null</code> if a matching packaging process could not be found
	 */
	public static PackagingProcess fetchBygetMA_PP_MAI_Last(
		long manufacturingApplicationId,
		OrderByComparator<PackagingProcess> orderByComparator) {

		return getPersistence().fetchBygetMA_PP_MAI_Last(
			manufacturingApplicationId, orderByComparator);
	}

	/**
	 * Returns the packaging processes before and after the current packaging process in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param packagingProcessId the primary key of the current packaging process
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next packaging process
	 * @throws NoSuchPackagingProcessException if a packaging process with the primary key could not be found
	 */
	public static PackagingProcess[] findBygetMA_PP_MAI_PrevAndNext(
			long packagingProcessId, long manufacturingApplicationId,
			OrderByComparator<PackagingProcess> orderByComparator)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchPackagingProcessException {

		return getPersistence().findBygetMA_PP_MAI_PrevAndNext(
			packagingProcessId, manufacturingApplicationId, orderByComparator);
	}

	/**
	 * Removes all the packaging processes where manufacturingApplicationId = &#63; from the database.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 */
	public static void removeBygetMA_PP_MAI(long manufacturingApplicationId) {
		getPersistence().removeBygetMA_PP_MAI(manufacturingApplicationId);
	}

	/**
	 * Returns the number of packaging processes where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching packaging processes
	 */
	public static int countBygetMA_PP_MAI(long manufacturingApplicationId) {
		return getPersistence().countBygetMA_PP_MAI(manufacturingApplicationId);
	}

	/**
	 * Caches the packaging process in the entity cache if it is enabled.
	 *
	 * @param packagingProcess the packaging process
	 */
	public static void cacheResult(PackagingProcess packagingProcess) {
		getPersistence().cacheResult(packagingProcess);
	}

	/**
	 * Caches the packaging processes in the entity cache if it is enabled.
	 *
	 * @param packagingProcesses the packaging processes
	 */
	public static void cacheResult(List<PackagingProcess> packagingProcesses) {
		getPersistence().cacheResult(packagingProcesses);
	}

	/**
	 * Creates a new packaging process with the primary key. Does not add the packaging process to the database.
	 *
	 * @param packagingProcessId the primary key for the new packaging process
	 * @return the new packaging process
	 */
	public static PackagingProcess create(long packagingProcessId) {
		return getPersistence().create(packagingProcessId);
	}

	/**
	 * Removes the packaging process with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param packagingProcessId the primary key of the packaging process
	 * @return the packaging process that was removed
	 * @throws NoSuchPackagingProcessException if a packaging process with the primary key could not be found
	 */
	public static PackagingProcess remove(long packagingProcessId)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchPackagingProcessException {

		return getPersistence().remove(packagingProcessId);
	}

	public static PackagingProcess updateImpl(
		PackagingProcess packagingProcess) {

		return getPersistence().updateImpl(packagingProcess);
	}

	/**
	 * Returns the packaging process with the primary key or throws a <code>NoSuchPackagingProcessException</code> if it could not be found.
	 *
	 * @param packagingProcessId the primary key of the packaging process
	 * @return the packaging process
	 * @throws NoSuchPackagingProcessException if a packaging process with the primary key could not be found
	 */
	public static PackagingProcess findByPrimaryKey(long packagingProcessId)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchPackagingProcessException {

		return getPersistence().findByPrimaryKey(packagingProcessId);
	}

	/**
	 * Returns the packaging process with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param packagingProcessId the primary key of the packaging process
	 * @return the packaging process, or <code>null</code> if a packaging process with the primary key could not be found
	 */
	public static PackagingProcess fetchByPrimaryKey(long packagingProcessId) {
		return getPersistence().fetchByPrimaryKey(packagingProcessId);
	}

	/**
	 * Returns all the packaging processes.
	 *
	 * @return the packaging processes
	 */
	public static List<PackagingProcess> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the packaging processes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PackagingProcessModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of packaging processes
	 * @param end the upper bound of the range of packaging processes (not inclusive)
	 * @return the range of packaging processes
	 */
	public static List<PackagingProcess> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the packaging processes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PackagingProcessModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of packaging processes
	 * @param end the upper bound of the range of packaging processes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of packaging processes
	 */
	public static List<PackagingProcess> findAll(
		int start, int end,
		OrderByComparator<PackagingProcess> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the packaging processes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PackagingProcessModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of packaging processes
	 * @param end the upper bound of the range of packaging processes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of packaging processes
	 */
	public static List<PackagingProcess> findAll(
		int start, int end,
		OrderByComparator<PackagingProcess> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the packaging processes from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of packaging processes.
	 *
	 * @return the number of packaging processes
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static PackagingProcessPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(PackagingProcessPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile PackagingProcessPersistence _persistence;

}