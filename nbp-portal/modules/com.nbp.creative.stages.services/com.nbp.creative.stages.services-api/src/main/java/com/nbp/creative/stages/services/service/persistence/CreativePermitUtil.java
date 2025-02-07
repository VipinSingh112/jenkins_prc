/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.stages.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.creative.stages.services.model.CreativePermit;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the creative permit service. This utility wraps <code>com.nbp.creative.stages.services.service.persistence.impl.CreativePermitPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CreativePermitPersistence
 * @generated
 */
public class CreativePermitUtil {

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
	public static void clearCache(CreativePermit creativePermit) {
		getPersistence().clearCache(creativePermit);
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
	public static Map<Serializable, CreativePermit> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<CreativePermit> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CreativePermit> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CreativePermit> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CreativePermit> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CreativePermit update(CreativePermit creativePermit) {
		return getPersistence().update(creativePermit);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CreativePermit update(
		CreativePermit creativePermit, ServiceContext serviceContext) {

		return getPersistence().update(creativePermit, serviceContext);
	}

	/**
	 * Returns the creative permit where caseId = &#63; or throws a <code>NoSuchCreativePermitException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching creative permit
	 * @throws NoSuchCreativePermitException if a matching creative permit could not be found
	 */
	public static CreativePermit findBygetCreativePermitBy_CI(String caseId)
		throws com.nbp.creative.stages.services.exception.
			NoSuchCreativePermitException {

		return getPersistence().findBygetCreativePermitBy_CI(caseId);
	}

	/**
	 * Returns the creative permit where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching creative permit, or <code>null</code> if a matching creative permit could not be found
	 */
	public static CreativePermit fetchBygetCreativePermitBy_CI(String caseId) {
		return getPersistence().fetchBygetCreativePermitBy_CI(caseId);
	}

	/**
	 * Returns the creative permit where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching creative permit, or <code>null</code> if a matching creative permit could not be found
	 */
	public static CreativePermit fetchBygetCreativePermitBy_CI(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetCreativePermitBy_CI(
			caseId, useFinderCache);
	}

	/**
	 * Removes the creative permit where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the creative permit that was removed
	 */
	public static CreativePermit removeBygetCreativePermitBy_CI(String caseId)
		throws com.nbp.creative.stages.services.exception.
			NoSuchCreativePermitException {

		return getPersistence().removeBygetCreativePermitBy_CI(caseId);
	}

	/**
	 * Returns the number of creative permits where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching creative permits
	 */
	public static int countBygetCreativePermitBy_CI(String caseId) {
		return getPersistence().countBygetCreativePermitBy_CI(caseId);
	}

	/**
	 * Caches the creative permit in the entity cache if it is enabled.
	 *
	 * @param creativePermit the creative permit
	 */
	public static void cacheResult(CreativePermit creativePermit) {
		getPersistence().cacheResult(creativePermit);
	}

	/**
	 * Caches the creative permits in the entity cache if it is enabled.
	 *
	 * @param creativePermits the creative permits
	 */
	public static void cacheResult(List<CreativePermit> creativePermits) {
		getPersistence().cacheResult(creativePermits);
	}

	/**
	 * Creates a new creative permit with the primary key. Does not add the creative permit to the database.
	 *
	 * @param creativePermitId the primary key for the new creative permit
	 * @return the new creative permit
	 */
	public static CreativePermit create(long creativePermitId) {
		return getPersistence().create(creativePermitId);
	}

	/**
	 * Removes the creative permit with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param creativePermitId the primary key of the creative permit
	 * @return the creative permit that was removed
	 * @throws NoSuchCreativePermitException if a creative permit with the primary key could not be found
	 */
	public static CreativePermit remove(long creativePermitId)
		throws com.nbp.creative.stages.services.exception.
			NoSuchCreativePermitException {

		return getPersistence().remove(creativePermitId);
	}

	public static CreativePermit updateImpl(CreativePermit creativePermit) {
		return getPersistence().updateImpl(creativePermit);
	}

	/**
	 * Returns the creative permit with the primary key or throws a <code>NoSuchCreativePermitException</code> if it could not be found.
	 *
	 * @param creativePermitId the primary key of the creative permit
	 * @return the creative permit
	 * @throws NoSuchCreativePermitException if a creative permit with the primary key could not be found
	 */
	public static CreativePermit findByPrimaryKey(long creativePermitId)
		throws com.nbp.creative.stages.services.exception.
			NoSuchCreativePermitException {

		return getPersistence().findByPrimaryKey(creativePermitId);
	}

	/**
	 * Returns the creative permit with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param creativePermitId the primary key of the creative permit
	 * @return the creative permit, or <code>null</code> if a creative permit with the primary key could not be found
	 */
	public static CreativePermit fetchByPrimaryKey(long creativePermitId) {
		return getPersistence().fetchByPrimaryKey(creativePermitId);
	}

	/**
	 * Returns all the creative permits.
	 *
	 * @return the creative permits
	 */
	public static List<CreativePermit> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the creative permits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativePermitModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative permits
	 * @param end the upper bound of the range of creative permits (not inclusive)
	 * @return the range of creative permits
	 */
	public static List<CreativePermit> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the creative permits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativePermitModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative permits
	 * @param end the upper bound of the range of creative permits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of creative permits
	 */
	public static List<CreativePermit> findAll(
		int start, int end,
		OrderByComparator<CreativePermit> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the creative permits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativePermitModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative permits
	 * @param end the upper bound of the range of creative permits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of creative permits
	 */
	public static List<CreativePermit> findAll(
		int start, int end, OrderByComparator<CreativePermit> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the creative permits from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of creative permits.
	 *
	 * @return the number of creative permits
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static CreativePermitPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(CreativePermitPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile CreativePermitPersistence _persistence;

}