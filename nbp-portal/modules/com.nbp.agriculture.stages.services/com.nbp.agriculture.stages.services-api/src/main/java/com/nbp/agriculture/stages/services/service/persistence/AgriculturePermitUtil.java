/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.agriculture.stages.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.agriculture.stages.services.model.AgriculturePermit;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the agriculture permit service. This utility wraps <code>com.nbp.agriculture.stages.services.service.persistence.impl.AgriculturePermitPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AgriculturePermitPersistence
 * @generated
 */
public class AgriculturePermitUtil {

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
	public static void clearCache(AgriculturePermit agriculturePermit) {
		getPersistence().clearCache(agriculturePermit);
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
	public static Map<Serializable, AgriculturePermit> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AgriculturePermit> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AgriculturePermit> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AgriculturePermit> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AgriculturePermit> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AgriculturePermit update(
		AgriculturePermit agriculturePermit) {

		return getPersistence().update(agriculturePermit);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AgriculturePermit update(
		AgriculturePermit agriculturePermit, ServiceContext serviceContext) {

		return getPersistence().update(agriculturePermit, serviceContext);
	}

	/**
	 * Returns the agriculture permit where caseId = &#63; or throws a <code>NoSuchAgriculturePermitException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching agriculture permit
	 * @throws NoSuchAgriculturePermitException if a matching agriculture permit could not be found
	 */
	public static AgriculturePermit findBygetAgriculturePermitBy_CI(
			String caseId)
		throws com.nbp.agriculture.stages.services.exception.
			NoSuchAgriculturePermitException {

		return getPersistence().findBygetAgriculturePermitBy_CI(caseId);
	}

	/**
	 * Returns the agriculture permit where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching agriculture permit, or <code>null</code> if a matching agriculture permit could not be found
	 */
	public static AgriculturePermit fetchBygetAgriculturePermitBy_CI(
		String caseId) {

		return getPersistence().fetchBygetAgriculturePermitBy_CI(caseId);
	}

	/**
	 * Returns the agriculture permit where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching agriculture permit, or <code>null</code> if a matching agriculture permit could not be found
	 */
	public static AgriculturePermit fetchBygetAgriculturePermitBy_CI(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetAgriculturePermitBy_CI(
			caseId, useFinderCache);
	}

	/**
	 * Removes the agriculture permit where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the agriculture permit that was removed
	 */
	public static AgriculturePermit removeBygetAgriculturePermitBy_CI(
			String caseId)
		throws com.nbp.agriculture.stages.services.exception.
			NoSuchAgriculturePermitException {

		return getPersistence().removeBygetAgriculturePermitBy_CI(caseId);
	}

	/**
	 * Returns the number of agriculture permits where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching agriculture permits
	 */
	public static int countBygetAgriculturePermitBy_CI(String caseId) {
		return getPersistence().countBygetAgriculturePermitBy_CI(caseId);
	}

	/**
	 * Returns all the agriculture permits where pirPermtNumber = &#63;.
	 *
	 * @param pirPermtNumber the pir permt number
	 * @return the matching agriculture permits
	 */
	public static List<AgriculturePermit> findBygetAgriculturePermitBy_PN(
		String pirPermtNumber) {

		return getPersistence().findBygetAgriculturePermitBy_PN(pirPermtNumber);
	}

	/**
	 * Returns a range of all the agriculture permits where pirPermtNumber = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgriculturePermitModelImpl</code>.
	 * </p>
	 *
	 * @param pirPermtNumber the pir permt number
	 * @param start the lower bound of the range of agriculture permits
	 * @param end the upper bound of the range of agriculture permits (not inclusive)
	 * @return the range of matching agriculture permits
	 */
	public static List<AgriculturePermit> findBygetAgriculturePermitBy_PN(
		String pirPermtNumber, int start, int end) {

		return getPersistence().findBygetAgriculturePermitBy_PN(
			pirPermtNumber, start, end);
	}

	/**
	 * Returns an ordered range of all the agriculture permits where pirPermtNumber = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgriculturePermitModelImpl</code>.
	 * </p>
	 *
	 * @param pirPermtNumber the pir permt number
	 * @param start the lower bound of the range of agriculture permits
	 * @param end the upper bound of the range of agriculture permits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching agriculture permits
	 */
	public static List<AgriculturePermit> findBygetAgriculturePermitBy_PN(
		String pirPermtNumber, int start, int end,
		OrderByComparator<AgriculturePermit> orderByComparator) {

		return getPersistence().findBygetAgriculturePermitBy_PN(
			pirPermtNumber, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the agriculture permits where pirPermtNumber = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgriculturePermitModelImpl</code>.
	 * </p>
	 *
	 * @param pirPermtNumber the pir permt number
	 * @param start the lower bound of the range of agriculture permits
	 * @param end the upper bound of the range of agriculture permits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching agriculture permits
	 */
	public static List<AgriculturePermit> findBygetAgriculturePermitBy_PN(
		String pirPermtNumber, int start, int end,
		OrderByComparator<AgriculturePermit> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetAgriculturePermitBy_PN(
			pirPermtNumber, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first agriculture permit in the ordered set where pirPermtNumber = &#63;.
	 *
	 * @param pirPermtNumber the pir permt number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture permit
	 * @throws NoSuchAgriculturePermitException if a matching agriculture permit could not be found
	 */
	public static AgriculturePermit findBygetAgriculturePermitBy_PN_First(
			String pirPermtNumber,
			OrderByComparator<AgriculturePermit> orderByComparator)
		throws com.nbp.agriculture.stages.services.exception.
			NoSuchAgriculturePermitException {

		return getPersistence().findBygetAgriculturePermitBy_PN_First(
			pirPermtNumber, orderByComparator);
	}

	/**
	 * Returns the first agriculture permit in the ordered set where pirPermtNumber = &#63;.
	 *
	 * @param pirPermtNumber the pir permt number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture permit, or <code>null</code> if a matching agriculture permit could not be found
	 */
	public static AgriculturePermit fetchBygetAgriculturePermitBy_PN_First(
		String pirPermtNumber,
		OrderByComparator<AgriculturePermit> orderByComparator) {

		return getPersistence().fetchBygetAgriculturePermitBy_PN_First(
			pirPermtNumber, orderByComparator);
	}

	/**
	 * Returns the last agriculture permit in the ordered set where pirPermtNumber = &#63;.
	 *
	 * @param pirPermtNumber the pir permt number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture permit
	 * @throws NoSuchAgriculturePermitException if a matching agriculture permit could not be found
	 */
	public static AgriculturePermit findBygetAgriculturePermitBy_PN_Last(
			String pirPermtNumber,
			OrderByComparator<AgriculturePermit> orderByComparator)
		throws com.nbp.agriculture.stages.services.exception.
			NoSuchAgriculturePermitException {

		return getPersistence().findBygetAgriculturePermitBy_PN_Last(
			pirPermtNumber, orderByComparator);
	}

	/**
	 * Returns the last agriculture permit in the ordered set where pirPermtNumber = &#63;.
	 *
	 * @param pirPermtNumber the pir permt number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture permit, or <code>null</code> if a matching agriculture permit could not be found
	 */
	public static AgriculturePermit fetchBygetAgriculturePermitBy_PN_Last(
		String pirPermtNumber,
		OrderByComparator<AgriculturePermit> orderByComparator) {

		return getPersistence().fetchBygetAgriculturePermitBy_PN_Last(
			pirPermtNumber, orderByComparator);
	}

	/**
	 * Returns the agriculture permits before and after the current agriculture permit in the ordered set where pirPermtNumber = &#63;.
	 *
	 * @param agriculturePermitId the primary key of the current agriculture permit
	 * @param pirPermtNumber the pir permt number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next agriculture permit
	 * @throws NoSuchAgriculturePermitException if a agriculture permit with the primary key could not be found
	 */
	public static AgriculturePermit[]
			findBygetAgriculturePermitBy_PN_PrevAndNext(
				long agriculturePermitId, String pirPermtNumber,
				OrderByComparator<AgriculturePermit> orderByComparator)
		throws com.nbp.agriculture.stages.services.exception.
			NoSuchAgriculturePermitException {

		return getPersistence().findBygetAgriculturePermitBy_PN_PrevAndNext(
			agriculturePermitId, pirPermtNumber, orderByComparator);
	}

	/**
	 * Removes all the agriculture permits where pirPermtNumber = &#63; from the database.
	 *
	 * @param pirPermtNumber the pir permt number
	 */
	public static void removeBygetAgriculturePermitBy_PN(
		String pirPermtNumber) {

		getPersistence().removeBygetAgriculturePermitBy_PN(pirPermtNumber);
	}

	/**
	 * Returns the number of agriculture permits where pirPermtNumber = &#63;.
	 *
	 * @param pirPermtNumber the pir permt number
	 * @return the number of matching agriculture permits
	 */
	public static int countBygetAgriculturePermitBy_PN(String pirPermtNumber) {
		return getPersistence().countBygetAgriculturePermitBy_PN(
			pirPermtNumber);
	}

	/**
	 * Returns the agriculture permit where pirPermtNumber = &#63; or throws a <code>NoSuchAgriculturePermitException</code> if it could not be found.
	 *
	 * @param pirPermtNumber the pir permt number
	 * @return the matching agriculture permit
	 * @throws NoSuchAgriculturePermitException if a matching agriculture permit could not be found
	 */
	public static AgriculturePermit findBygetAgriculturePermitBy_PermitNum(
			String pirPermtNumber)
		throws com.nbp.agriculture.stages.services.exception.
			NoSuchAgriculturePermitException {

		return getPersistence().findBygetAgriculturePermitBy_PermitNum(
			pirPermtNumber);
	}

	/**
	 * Returns the agriculture permit where pirPermtNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param pirPermtNumber the pir permt number
	 * @return the matching agriculture permit, or <code>null</code> if a matching agriculture permit could not be found
	 */
	public static AgriculturePermit fetchBygetAgriculturePermitBy_PermitNum(
		String pirPermtNumber) {

		return getPersistence().fetchBygetAgriculturePermitBy_PermitNum(
			pirPermtNumber);
	}

	/**
	 * Returns the agriculture permit where pirPermtNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param pirPermtNumber the pir permt number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching agriculture permit, or <code>null</code> if a matching agriculture permit could not be found
	 */
	public static AgriculturePermit fetchBygetAgriculturePermitBy_PermitNum(
		String pirPermtNumber, boolean useFinderCache) {

		return getPersistence().fetchBygetAgriculturePermitBy_PermitNum(
			pirPermtNumber, useFinderCache);
	}

	/**
	 * Removes the agriculture permit where pirPermtNumber = &#63; from the database.
	 *
	 * @param pirPermtNumber the pir permt number
	 * @return the agriculture permit that was removed
	 */
	public static AgriculturePermit removeBygetAgriculturePermitBy_PermitNum(
			String pirPermtNumber)
		throws com.nbp.agriculture.stages.services.exception.
			NoSuchAgriculturePermitException {

		return getPersistence().removeBygetAgriculturePermitBy_PermitNum(
			pirPermtNumber);
	}

	/**
	 * Returns the number of agriculture permits where pirPermtNumber = &#63;.
	 *
	 * @param pirPermtNumber the pir permt number
	 * @return the number of matching agriculture permits
	 */
	public static int countBygetAgriculturePermitBy_PermitNum(
		String pirPermtNumber) {

		return getPersistence().countBygetAgriculturePermitBy_PermitNum(
			pirPermtNumber);
	}

	/**
	 * Caches the agriculture permit in the entity cache if it is enabled.
	 *
	 * @param agriculturePermit the agriculture permit
	 */
	public static void cacheResult(AgriculturePermit agriculturePermit) {
		getPersistence().cacheResult(agriculturePermit);
	}

	/**
	 * Caches the agriculture permits in the entity cache if it is enabled.
	 *
	 * @param agriculturePermits the agriculture permits
	 */
	public static void cacheResult(List<AgriculturePermit> agriculturePermits) {
		getPersistence().cacheResult(agriculturePermits);
	}

	/**
	 * Creates a new agriculture permit with the primary key. Does not add the agriculture permit to the database.
	 *
	 * @param agriculturePermitId the primary key for the new agriculture permit
	 * @return the new agriculture permit
	 */
	public static AgriculturePermit create(long agriculturePermitId) {
		return getPersistence().create(agriculturePermitId);
	}

	/**
	 * Removes the agriculture permit with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param agriculturePermitId the primary key of the agriculture permit
	 * @return the agriculture permit that was removed
	 * @throws NoSuchAgriculturePermitException if a agriculture permit with the primary key could not be found
	 */
	public static AgriculturePermit remove(long agriculturePermitId)
		throws com.nbp.agriculture.stages.services.exception.
			NoSuchAgriculturePermitException {

		return getPersistence().remove(agriculturePermitId);
	}

	public static AgriculturePermit updateImpl(
		AgriculturePermit agriculturePermit) {

		return getPersistence().updateImpl(agriculturePermit);
	}

	/**
	 * Returns the agriculture permit with the primary key or throws a <code>NoSuchAgriculturePermitException</code> if it could not be found.
	 *
	 * @param agriculturePermitId the primary key of the agriculture permit
	 * @return the agriculture permit
	 * @throws NoSuchAgriculturePermitException if a agriculture permit with the primary key could not be found
	 */
	public static AgriculturePermit findByPrimaryKey(long agriculturePermitId)
		throws com.nbp.agriculture.stages.services.exception.
			NoSuchAgriculturePermitException {

		return getPersistence().findByPrimaryKey(agriculturePermitId);
	}

	/**
	 * Returns the agriculture permit with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param agriculturePermitId the primary key of the agriculture permit
	 * @return the agriculture permit, or <code>null</code> if a agriculture permit with the primary key could not be found
	 */
	public static AgriculturePermit fetchByPrimaryKey(
		long agriculturePermitId) {

		return getPersistence().fetchByPrimaryKey(agriculturePermitId);
	}

	/**
	 * Returns all the agriculture permits.
	 *
	 * @return the agriculture permits
	 */
	public static List<AgriculturePermit> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the agriculture permits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgriculturePermitModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture permits
	 * @param end the upper bound of the range of agriculture permits (not inclusive)
	 * @return the range of agriculture permits
	 */
	public static List<AgriculturePermit> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the agriculture permits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgriculturePermitModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture permits
	 * @param end the upper bound of the range of agriculture permits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of agriculture permits
	 */
	public static List<AgriculturePermit> findAll(
		int start, int end,
		OrderByComparator<AgriculturePermit> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the agriculture permits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgriculturePermitModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture permits
	 * @param end the upper bound of the range of agriculture permits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of agriculture permits
	 */
	public static List<AgriculturePermit> findAll(
		int start, int end,
		OrderByComparator<AgriculturePermit> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the agriculture permits from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of agriculture permits.
	 *
	 * @return the number of agriculture permits
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AgriculturePermitPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AgriculturePermitPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AgriculturePermitPersistence _persistence;

}