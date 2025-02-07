/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.stage.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.healthcare.stage.service.model.HealthCarePermit;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the health care permit service. This utility wraps <code>com.nbp.healthcare.stage.service.service.persistence.impl.HealthCarePermitPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HealthCarePermitPersistence
 * @generated
 */
public class HealthCarePermitUtil {

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
	public static void clearCache(HealthCarePermit healthCarePermit) {
		getPersistence().clearCache(healthCarePermit);
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
	public static Map<Serializable, HealthCarePermit> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<HealthCarePermit> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<HealthCarePermit> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<HealthCarePermit> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<HealthCarePermit> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static HealthCarePermit update(HealthCarePermit healthCarePermit) {
		return getPersistence().update(healthCarePermit);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static HealthCarePermit update(
		HealthCarePermit healthCarePermit, ServiceContext serviceContext) {

		return getPersistence().update(healthCarePermit, serviceContext);
	}

	/**
	 * Returns the health care permit where caseId = &#63; or throws a <code>NoSuchHealthCarePermitException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching health care permit
	 * @throws NoSuchHealthCarePermitException if a matching health care permit could not be found
	 */
	public static HealthCarePermit findBygetHealthCareBY_CI(String caseId)
		throws com.nbp.healthcare.stage.service.exception.
			NoSuchHealthCarePermitException {

		return getPersistence().findBygetHealthCareBY_CI(caseId);
	}

	/**
	 * Returns the health care permit where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching health care permit, or <code>null</code> if a matching health care permit could not be found
	 */
	public static HealthCarePermit fetchBygetHealthCareBY_CI(String caseId) {
		return getPersistence().fetchBygetHealthCareBY_CI(caseId);
	}

	/**
	 * Returns the health care permit where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching health care permit, or <code>null</code> if a matching health care permit could not be found
	 */
	public static HealthCarePermit fetchBygetHealthCareBY_CI(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetHealthCareBY_CI(
			caseId, useFinderCache);
	}

	/**
	 * Removes the health care permit where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the health care permit that was removed
	 */
	public static HealthCarePermit removeBygetHealthCareBY_CI(String caseId)
		throws com.nbp.healthcare.stage.service.exception.
			NoSuchHealthCarePermitException {

		return getPersistence().removeBygetHealthCareBY_CI(caseId);
	}

	/**
	 * Returns the number of health care permits where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching health care permits
	 */
	public static int countBygetHealthCareBY_CI(String caseId) {
		return getPersistence().countBygetHealthCareBY_CI(caseId);
	}

	/**
	 * Caches the health care permit in the entity cache if it is enabled.
	 *
	 * @param healthCarePermit the health care permit
	 */
	public static void cacheResult(HealthCarePermit healthCarePermit) {
		getPersistence().cacheResult(healthCarePermit);
	}

	/**
	 * Caches the health care permits in the entity cache if it is enabled.
	 *
	 * @param healthCarePermits the health care permits
	 */
	public static void cacheResult(List<HealthCarePermit> healthCarePermits) {
		getPersistence().cacheResult(healthCarePermits);
	}

	/**
	 * Creates a new health care permit with the primary key. Does not add the health care permit to the database.
	 *
	 * @param healthPermitId the primary key for the new health care permit
	 * @return the new health care permit
	 */
	public static HealthCarePermit create(long healthPermitId) {
		return getPersistence().create(healthPermitId);
	}

	/**
	 * Removes the health care permit with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param healthPermitId the primary key of the health care permit
	 * @return the health care permit that was removed
	 * @throws NoSuchHealthCarePermitException if a health care permit with the primary key could not be found
	 */
	public static HealthCarePermit remove(long healthPermitId)
		throws com.nbp.healthcare.stage.service.exception.
			NoSuchHealthCarePermitException {

		return getPersistence().remove(healthPermitId);
	}

	public static HealthCarePermit updateImpl(
		HealthCarePermit healthCarePermit) {

		return getPersistence().updateImpl(healthCarePermit);
	}

	/**
	 * Returns the health care permit with the primary key or throws a <code>NoSuchHealthCarePermitException</code> if it could not be found.
	 *
	 * @param healthPermitId the primary key of the health care permit
	 * @return the health care permit
	 * @throws NoSuchHealthCarePermitException if a health care permit with the primary key could not be found
	 */
	public static HealthCarePermit findByPrimaryKey(long healthPermitId)
		throws com.nbp.healthcare.stage.service.exception.
			NoSuchHealthCarePermitException {

		return getPersistence().findByPrimaryKey(healthPermitId);
	}

	/**
	 * Returns the health care permit with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param healthPermitId the primary key of the health care permit
	 * @return the health care permit, or <code>null</code> if a health care permit with the primary key could not be found
	 */
	public static HealthCarePermit fetchByPrimaryKey(long healthPermitId) {
		return getPersistence().fetchByPrimaryKey(healthPermitId);
	}

	/**
	 * Returns all the health care permits.
	 *
	 * @return the health care permits
	 */
	public static List<HealthCarePermit> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the health care permits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCarePermitModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care permits
	 * @param end the upper bound of the range of health care permits (not inclusive)
	 * @return the range of health care permits
	 */
	public static List<HealthCarePermit> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the health care permits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCarePermitModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care permits
	 * @param end the upper bound of the range of health care permits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of health care permits
	 */
	public static List<HealthCarePermit> findAll(
		int start, int end,
		OrderByComparator<HealthCarePermit> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the health care permits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCarePermitModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care permits
	 * @param end the upper bound of the range of health care permits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of health care permits
	 */
	public static List<HealthCarePermit> findAll(
		int start, int end,
		OrderByComparator<HealthCarePermit> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the health care permits from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of health care permits.
	 *
	 * @return the number of health care permits
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static HealthCarePermitPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(HealthCarePermitPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile HealthCarePermitPersistence _persistence;

}