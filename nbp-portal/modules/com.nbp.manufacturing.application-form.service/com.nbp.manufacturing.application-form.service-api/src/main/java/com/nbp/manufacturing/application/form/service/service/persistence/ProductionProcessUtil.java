/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.manufacturing.application.form.service.model.ProductionProcess;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the production process service. This utility wraps <code>com.nbp.manufacturing.application.form.service.service.persistence.impl.ProductionProcessPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ProductionProcessPersistence
 * @generated
 */
public class ProductionProcessUtil {

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
	public static void clearCache(ProductionProcess productionProcess) {
		getPersistence().clearCache(productionProcess);
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
	public static Map<Serializable, ProductionProcess> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<ProductionProcess> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ProductionProcess> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ProductionProcess> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ProductionProcess> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ProductionProcess update(
		ProductionProcess productionProcess) {

		return getPersistence().update(productionProcess);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ProductionProcess update(
		ProductionProcess productionProcess, ServiceContext serviceContext) {

		return getPersistence().update(productionProcess, serviceContext);
	}

	/**
	 * Returns the production process where manufacturingApplicationId = &#63; or throws a <code>NoSuchProductionProcessException</code> if it could not be found.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching production process
	 * @throws NoSuchProductionProcessException if a matching production process could not be found
	 */
	public static ProductionProcess findBygetManufactureById(
			long manufacturingApplicationId)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchProductionProcessException {

		return getPersistence().findBygetManufactureById(
			manufacturingApplicationId);
	}

	/**
	 * Returns the production process where manufacturingApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching production process, or <code>null</code> if a matching production process could not be found
	 */
	public static ProductionProcess fetchBygetManufactureById(
		long manufacturingApplicationId) {

		return getPersistence().fetchBygetManufactureById(
			manufacturingApplicationId);
	}

	/**
	 * Returns the production process where manufacturingApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching production process, or <code>null</code> if a matching production process could not be found
	 */
	public static ProductionProcess fetchBygetManufactureById(
		long manufacturingApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetManufactureById(
			manufacturingApplicationId, useFinderCache);
	}

	/**
	 * Removes the production process where manufacturingApplicationId = &#63; from the database.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the production process that was removed
	 */
	public static ProductionProcess removeBygetManufactureById(
			long manufacturingApplicationId)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchProductionProcessException {

		return getPersistence().removeBygetManufactureById(
			manufacturingApplicationId);
	}

	/**
	 * Returns the number of production processes where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching production processes
	 */
	public static int countBygetManufactureById(
		long manufacturingApplicationId) {

		return getPersistence().countBygetManufactureById(
			manufacturingApplicationId);
	}

	/**
	 * Returns all the production processes where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching production processes
	 */
	public static List<ProductionProcess> findBygetMA_PDP_MAI(
		long manufacturingApplicationId) {

		return getPersistence().findBygetMA_PDP_MAI(manufacturingApplicationId);
	}

	/**
	 * Returns a range of all the production processes where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductionProcessModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of production processes
	 * @param end the upper bound of the range of production processes (not inclusive)
	 * @return the range of matching production processes
	 */
	public static List<ProductionProcess> findBygetMA_PDP_MAI(
		long manufacturingApplicationId, int start, int end) {

		return getPersistence().findBygetMA_PDP_MAI(
			manufacturingApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the production processes where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductionProcessModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of production processes
	 * @param end the upper bound of the range of production processes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching production processes
	 */
	public static List<ProductionProcess> findBygetMA_PDP_MAI(
		long manufacturingApplicationId, int start, int end,
		OrderByComparator<ProductionProcess> orderByComparator) {

		return getPersistence().findBygetMA_PDP_MAI(
			manufacturingApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the production processes where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductionProcessModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of production processes
	 * @param end the upper bound of the range of production processes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching production processes
	 */
	public static List<ProductionProcess> findBygetMA_PDP_MAI(
		long manufacturingApplicationId, int start, int end,
		OrderByComparator<ProductionProcess> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetMA_PDP_MAI(
			manufacturingApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first production process in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching production process
	 * @throws NoSuchProductionProcessException if a matching production process could not be found
	 */
	public static ProductionProcess findBygetMA_PDP_MAI_First(
			long manufacturingApplicationId,
			OrderByComparator<ProductionProcess> orderByComparator)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchProductionProcessException {

		return getPersistence().findBygetMA_PDP_MAI_First(
			manufacturingApplicationId, orderByComparator);
	}

	/**
	 * Returns the first production process in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching production process, or <code>null</code> if a matching production process could not be found
	 */
	public static ProductionProcess fetchBygetMA_PDP_MAI_First(
		long manufacturingApplicationId,
		OrderByComparator<ProductionProcess> orderByComparator) {

		return getPersistence().fetchBygetMA_PDP_MAI_First(
			manufacturingApplicationId, orderByComparator);
	}

	/**
	 * Returns the last production process in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching production process
	 * @throws NoSuchProductionProcessException if a matching production process could not be found
	 */
	public static ProductionProcess findBygetMA_PDP_MAI_Last(
			long manufacturingApplicationId,
			OrderByComparator<ProductionProcess> orderByComparator)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchProductionProcessException {

		return getPersistence().findBygetMA_PDP_MAI_Last(
			manufacturingApplicationId, orderByComparator);
	}

	/**
	 * Returns the last production process in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching production process, or <code>null</code> if a matching production process could not be found
	 */
	public static ProductionProcess fetchBygetMA_PDP_MAI_Last(
		long manufacturingApplicationId,
		OrderByComparator<ProductionProcess> orderByComparator) {

		return getPersistence().fetchBygetMA_PDP_MAI_Last(
			manufacturingApplicationId, orderByComparator);
	}

	/**
	 * Returns the production processes before and after the current production process in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param productionProcessId the primary key of the current production process
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next production process
	 * @throws NoSuchProductionProcessException if a production process with the primary key could not be found
	 */
	public static ProductionProcess[] findBygetMA_PDP_MAI_PrevAndNext(
			long productionProcessId, long manufacturingApplicationId,
			OrderByComparator<ProductionProcess> orderByComparator)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchProductionProcessException {

		return getPersistence().findBygetMA_PDP_MAI_PrevAndNext(
			productionProcessId, manufacturingApplicationId, orderByComparator);
	}

	/**
	 * Removes all the production processes where manufacturingApplicationId = &#63; from the database.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 */
	public static void removeBygetMA_PDP_MAI(long manufacturingApplicationId) {
		getPersistence().removeBygetMA_PDP_MAI(manufacturingApplicationId);
	}

	/**
	 * Returns the number of production processes where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching production processes
	 */
	public static int countBygetMA_PDP_MAI(long manufacturingApplicationId) {
		return getPersistence().countBygetMA_PDP_MAI(
			manufacturingApplicationId);
	}

	/**
	 * Caches the production process in the entity cache if it is enabled.
	 *
	 * @param productionProcess the production process
	 */
	public static void cacheResult(ProductionProcess productionProcess) {
		getPersistence().cacheResult(productionProcess);
	}

	/**
	 * Caches the production processes in the entity cache if it is enabled.
	 *
	 * @param productionProcesses the production processes
	 */
	public static void cacheResult(
		List<ProductionProcess> productionProcesses) {

		getPersistence().cacheResult(productionProcesses);
	}

	/**
	 * Creates a new production process with the primary key. Does not add the production process to the database.
	 *
	 * @param productionProcessId the primary key for the new production process
	 * @return the new production process
	 */
	public static ProductionProcess create(long productionProcessId) {
		return getPersistence().create(productionProcessId);
	}

	/**
	 * Removes the production process with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param productionProcessId the primary key of the production process
	 * @return the production process that was removed
	 * @throws NoSuchProductionProcessException if a production process with the primary key could not be found
	 */
	public static ProductionProcess remove(long productionProcessId)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchProductionProcessException {

		return getPersistence().remove(productionProcessId);
	}

	public static ProductionProcess updateImpl(
		ProductionProcess productionProcess) {

		return getPersistence().updateImpl(productionProcess);
	}

	/**
	 * Returns the production process with the primary key or throws a <code>NoSuchProductionProcessException</code> if it could not be found.
	 *
	 * @param productionProcessId the primary key of the production process
	 * @return the production process
	 * @throws NoSuchProductionProcessException if a production process with the primary key could not be found
	 */
	public static ProductionProcess findByPrimaryKey(long productionProcessId)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchProductionProcessException {

		return getPersistence().findByPrimaryKey(productionProcessId);
	}

	/**
	 * Returns the production process with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param productionProcessId the primary key of the production process
	 * @return the production process, or <code>null</code> if a production process with the primary key could not be found
	 */
	public static ProductionProcess fetchByPrimaryKey(
		long productionProcessId) {

		return getPersistence().fetchByPrimaryKey(productionProcessId);
	}

	/**
	 * Returns all the production processes.
	 *
	 * @return the production processes
	 */
	public static List<ProductionProcess> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the production processes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductionProcessModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of production processes
	 * @param end the upper bound of the range of production processes (not inclusive)
	 * @return the range of production processes
	 */
	public static List<ProductionProcess> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the production processes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductionProcessModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of production processes
	 * @param end the upper bound of the range of production processes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of production processes
	 */
	public static List<ProductionProcess> findAll(
		int start, int end,
		OrderByComparator<ProductionProcess> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the production processes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductionProcessModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of production processes
	 * @param end the upper bound of the range of production processes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of production processes
	 */
	public static List<ProductionProcess> findAll(
		int start, int end,
		OrderByComparator<ProductionProcess> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the production processes from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of production processes.
	 *
	 * @return the number of production processes
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ProductionProcessPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		ProductionProcessPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile ProductionProcessPersistence _persistence;

}