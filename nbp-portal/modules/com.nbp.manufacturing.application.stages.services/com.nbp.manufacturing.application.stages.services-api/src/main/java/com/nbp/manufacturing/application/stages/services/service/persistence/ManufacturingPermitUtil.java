/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.stages.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.manufacturing.application.stages.services.model.ManufacturingPermit;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the manufacturing permit service. This utility wraps <code>com.nbp.manufacturing.application.stages.services.service.persistence.impl.ManufacturingPermitPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ManufacturingPermitPersistence
 * @generated
 */
public class ManufacturingPermitUtil {

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
	public static void clearCache(ManufacturingPermit manufacturingPermit) {
		getPersistence().clearCache(manufacturingPermit);
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
	public static Map<Serializable, ManufacturingPermit> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<ManufacturingPermit> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ManufacturingPermit> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ManufacturingPermit> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ManufacturingPermit> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ManufacturingPermit update(
		ManufacturingPermit manufacturingPermit) {

		return getPersistence().update(manufacturingPermit);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ManufacturingPermit update(
		ManufacturingPermit manufacturingPermit,
		ServiceContext serviceContext) {

		return getPersistence().update(manufacturingPermit, serviceContext);
	}

	/**
	 * Returns the manufacturing permit where caseId = &#63; or throws a <code>NoSuchManufacturingPermitException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching manufacturing permit
	 * @throws NoSuchManufacturingPermitException if a matching manufacturing permit could not be found
	 */
	public static ManufacturingPermit findBygetManufacturingPermitBY_CI(
			String caseId)
		throws com.nbp.manufacturing.application.stages.services.exception.
			NoSuchManufacturingPermitException {

		return getPersistence().findBygetManufacturingPermitBY_CI(caseId);
	}

	/**
	 * Returns the manufacturing permit where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching manufacturing permit, or <code>null</code> if a matching manufacturing permit could not be found
	 */
	public static ManufacturingPermit fetchBygetManufacturingPermitBY_CI(
		String caseId) {

		return getPersistence().fetchBygetManufacturingPermitBY_CI(caseId);
	}

	/**
	 * Returns the manufacturing permit where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching manufacturing permit, or <code>null</code> if a matching manufacturing permit could not be found
	 */
	public static ManufacturingPermit fetchBygetManufacturingPermitBY_CI(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetManufacturingPermitBY_CI(
			caseId, useFinderCache);
	}

	/**
	 * Removes the manufacturing permit where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the manufacturing permit that was removed
	 */
	public static ManufacturingPermit removeBygetManufacturingPermitBY_CI(
			String caseId)
		throws com.nbp.manufacturing.application.stages.services.exception.
			NoSuchManufacturingPermitException {

		return getPersistence().removeBygetManufacturingPermitBY_CI(caseId);
	}

	/**
	 * Returns the number of manufacturing permits where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching manufacturing permits
	 */
	public static int countBygetManufacturingPermitBY_CI(String caseId) {
		return getPersistence().countBygetManufacturingPermitBY_CI(caseId);
	}

	/**
	 * Returns the manufacturing permit where PIRPermtNumber = &#63; or throws a <code>NoSuchManufacturingPermitException</code> if it could not be found.
	 *
	 * @param PIRPermtNumber the pir permt number
	 * @return the matching manufacturing permit
	 * @throws NoSuchManufacturingPermitException if a matching manufacturing permit could not be found
	 */
	public static ManufacturingPermit
			findBygetManufacturingPermitBY_PermitNumber(String PIRPermtNumber)
		throws com.nbp.manufacturing.application.stages.services.exception.
			NoSuchManufacturingPermitException {

		return getPersistence().findBygetManufacturingPermitBY_PermitNumber(
			PIRPermtNumber);
	}

	/**
	 * Returns the manufacturing permit where PIRPermtNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param PIRPermtNumber the pir permt number
	 * @return the matching manufacturing permit, or <code>null</code> if a matching manufacturing permit could not be found
	 */
	public static ManufacturingPermit
		fetchBygetManufacturingPermitBY_PermitNumber(String PIRPermtNumber) {

		return getPersistence().fetchBygetManufacturingPermitBY_PermitNumber(
			PIRPermtNumber);
	}

	/**
	 * Returns the manufacturing permit where PIRPermtNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param PIRPermtNumber the pir permt number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching manufacturing permit, or <code>null</code> if a matching manufacturing permit could not be found
	 */
	public static ManufacturingPermit
		fetchBygetManufacturingPermitBY_PermitNumber(
			String PIRPermtNumber, boolean useFinderCache) {

		return getPersistence().fetchBygetManufacturingPermitBY_PermitNumber(
			PIRPermtNumber, useFinderCache);
	}

	/**
	 * Removes the manufacturing permit where PIRPermtNumber = &#63; from the database.
	 *
	 * @param PIRPermtNumber the pir permt number
	 * @return the manufacturing permit that was removed
	 */
	public static ManufacturingPermit
			removeBygetManufacturingPermitBY_PermitNumber(String PIRPermtNumber)
		throws com.nbp.manufacturing.application.stages.services.exception.
			NoSuchManufacturingPermitException {

		return getPersistence().removeBygetManufacturingPermitBY_PermitNumber(
			PIRPermtNumber);
	}

	/**
	 * Returns the number of manufacturing permits where PIRPermtNumber = &#63;.
	 *
	 * @param PIRPermtNumber the pir permt number
	 * @return the number of matching manufacturing permits
	 */
	public static int countBygetManufacturingPermitBY_PermitNumber(
		String PIRPermtNumber) {

		return getPersistence().countBygetManufacturingPermitBY_PermitNumber(
			PIRPermtNumber);
	}

	/**
	 * Caches the manufacturing permit in the entity cache if it is enabled.
	 *
	 * @param manufacturingPermit the manufacturing permit
	 */
	public static void cacheResult(ManufacturingPermit manufacturingPermit) {
		getPersistence().cacheResult(manufacturingPermit);
	}

	/**
	 * Caches the manufacturing permits in the entity cache if it is enabled.
	 *
	 * @param manufacturingPermits the manufacturing permits
	 */
	public static void cacheResult(
		List<ManufacturingPermit> manufacturingPermits) {

		getPersistence().cacheResult(manufacturingPermits);
	}

	/**
	 * Creates a new manufacturing permit with the primary key. Does not add the manufacturing permit to the database.
	 *
	 * @param manufacturingPermitId the primary key for the new manufacturing permit
	 * @return the new manufacturing permit
	 */
	public static ManufacturingPermit create(long manufacturingPermitId) {
		return getPersistence().create(manufacturingPermitId);
	}

	/**
	 * Removes the manufacturing permit with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param manufacturingPermitId the primary key of the manufacturing permit
	 * @return the manufacturing permit that was removed
	 * @throws NoSuchManufacturingPermitException if a manufacturing permit with the primary key could not be found
	 */
	public static ManufacturingPermit remove(long manufacturingPermitId)
		throws com.nbp.manufacturing.application.stages.services.exception.
			NoSuchManufacturingPermitException {

		return getPersistence().remove(manufacturingPermitId);
	}

	public static ManufacturingPermit updateImpl(
		ManufacturingPermit manufacturingPermit) {

		return getPersistence().updateImpl(manufacturingPermit);
	}

	/**
	 * Returns the manufacturing permit with the primary key or throws a <code>NoSuchManufacturingPermitException</code> if it could not be found.
	 *
	 * @param manufacturingPermitId the primary key of the manufacturing permit
	 * @return the manufacturing permit
	 * @throws NoSuchManufacturingPermitException if a manufacturing permit with the primary key could not be found
	 */
	public static ManufacturingPermit findByPrimaryKey(
			long manufacturingPermitId)
		throws com.nbp.manufacturing.application.stages.services.exception.
			NoSuchManufacturingPermitException {

		return getPersistence().findByPrimaryKey(manufacturingPermitId);
	}

	/**
	 * Returns the manufacturing permit with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param manufacturingPermitId the primary key of the manufacturing permit
	 * @return the manufacturing permit, or <code>null</code> if a manufacturing permit with the primary key could not be found
	 */
	public static ManufacturingPermit fetchByPrimaryKey(
		long manufacturingPermitId) {

		return getPersistence().fetchByPrimaryKey(manufacturingPermitId);
	}

	/**
	 * Returns all the manufacturing permits.
	 *
	 * @return the manufacturing permits
	 */
	public static List<ManufacturingPermit> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the manufacturing permits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManufacturingPermitModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manufacturing permits
	 * @param end the upper bound of the range of manufacturing permits (not inclusive)
	 * @return the range of manufacturing permits
	 */
	public static List<ManufacturingPermit> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the manufacturing permits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManufacturingPermitModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manufacturing permits
	 * @param end the upper bound of the range of manufacturing permits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of manufacturing permits
	 */
	public static List<ManufacturingPermit> findAll(
		int start, int end,
		OrderByComparator<ManufacturingPermit> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the manufacturing permits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManufacturingPermitModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manufacturing permits
	 * @param end the upper bound of the range of manufacturing permits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of manufacturing permits
	 */
	public static List<ManufacturingPermit> findAll(
		int start, int end,
		OrderByComparator<ManufacturingPermit> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the manufacturing permits from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of manufacturing permits.
	 *
	 * @return the number of manufacturing permits
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ManufacturingPermitPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		ManufacturingPermitPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile ManufacturingPermitPersistence _persistence;

}