/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.stages.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.osi.stages.services.model.OsiApplicationPermit;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the osi application permit service. This utility wraps <code>com.nbp.osi.stages.services.service.persistence.impl.OsiApplicationPermitPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiApplicationPermitPersistence
 * @generated
 */
public class OsiApplicationPermitUtil {

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
	public static void clearCache(OsiApplicationPermit osiApplicationPermit) {
		getPersistence().clearCache(osiApplicationPermit);
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
	public static Map<Serializable, OsiApplicationPermit> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<OsiApplicationPermit> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<OsiApplicationPermit> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<OsiApplicationPermit> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<OsiApplicationPermit> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static OsiApplicationPermit update(
		OsiApplicationPermit osiApplicationPermit) {

		return getPersistence().update(osiApplicationPermit);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static OsiApplicationPermit update(
		OsiApplicationPermit osiApplicationPermit,
		ServiceContext serviceContext) {

		return getPersistence().update(osiApplicationPermit, serviceContext);
	}

	/**
	 * Returns the osi application permit where caseId = &#63; or throws a <code>NoSuchOsiApplicationPermitException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching osi application permit
	 * @throws NoSuchOsiApplicationPermitException if a matching osi application permit could not be found
	 */
	public static OsiApplicationPermit findBygetOsiAppPermitByCaseId(
			String caseId)
		throws com.nbp.osi.stages.services.exception.
			NoSuchOsiApplicationPermitException {

		return getPersistence().findBygetOsiAppPermitByCaseId(caseId);
	}

	/**
	 * Returns the osi application permit where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching osi application permit, or <code>null</code> if a matching osi application permit could not be found
	 */
	public static OsiApplicationPermit fetchBygetOsiAppPermitByCaseId(
		String caseId) {

		return getPersistence().fetchBygetOsiAppPermitByCaseId(caseId);
	}

	/**
	 * Returns the osi application permit where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi application permit, or <code>null</code> if a matching osi application permit could not be found
	 */
	public static OsiApplicationPermit fetchBygetOsiAppPermitByCaseId(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetOsiAppPermitByCaseId(
			caseId, useFinderCache);
	}

	/**
	 * Removes the osi application permit where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the osi application permit that was removed
	 */
	public static OsiApplicationPermit removeBygetOsiAppPermitByCaseId(
			String caseId)
		throws com.nbp.osi.stages.services.exception.
			NoSuchOsiApplicationPermitException {

		return getPersistence().removeBygetOsiAppPermitByCaseId(caseId);
	}

	/**
	 * Returns the number of osi application permits where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching osi application permits
	 */
	public static int countBygetOsiAppPermitByCaseId(String caseId) {
		return getPersistence().countBygetOsiAppPermitByCaseId(caseId);
	}

	/**
	 * Caches the osi application permit in the entity cache if it is enabled.
	 *
	 * @param osiApplicationPermit the osi application permit
	 */
	public static void cacheResult(OsiApplicationPermit osiApplicationPermit) {
		getPersistence().cacheResult(osiApplicationPermit);
	}

	/**
	 * Caches the osi application permits in the entity cache if it is enabled.
	 *
	 * @param osiApplicationPermits the osi application permits
	 */
	public static void cacheResult(
		List<OsiApplicationPermit> osiApplicationPermits) {

		getPersistence().cacheResult(osiApplicationPermits);
	}

	/**
	 * Creates a new osi application permit with the primary key. Does not add the osi application permit to the database.
	 *
	 * @param osiApplicationPermitId the primary key for the new osi application permit
	 * @return the new osi application permit
	 */
	public static OsiApplicationPermit create(long osiApplicationPermitId) {
		return getPersistence().create(osiApplicationPermitId);
	}

	/**
	 * Removes the osi application permit with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiApplicationPermitId the primary key of the osi application permit
	 * @return the osi application permit that was removed
	 * @throws NoSuchOsiApplicationPermitException if a osi application permit with the primary key could not be found
	 */
	public static OsiApplicationPermit remove(long osiApplicationPermitId)
		throws com.nbp.osi.stages.services.exception.
			NoSuchOsiApplicationPermitException {

		return getPersistence().remove(osiApplicationPermitId);
	}

	public static OsiApplicationPermit updateImpl(
		OsiApplicationPermit osiApplicationPermit) {

		return getPersistence().updateImpl(osiApplicationPermit);
	}

	/**
	 * Returns the osi application permit with the primary key or throws a <code>NoSuchOsiApplicationPermitException</code> if it could not be found.
	 *
	 * @param osiApplicationPermitId the primary key of the osi application permit
	 * @return the osi application permit
	 * @throws NoSuchOsiApplicationPermitException if a osi application permit with the primary key could not be found
	 */
	public static OsiApplicationPermit findByPrimaryKey(
			long osiApplicationPermitId)
		throws com.nbp.osi.stages.services.exception.
			NoSuchOsiApplicationPermitException {

		return getPersistence().findByPrimaryKey(osiApplicationPermitId);
	}

	/**
	 * Returns the osi application permit with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiApplicationPermitId the primary key of the osi application permit
	 * @return the osi application permit, or <code>null</code> if a osi application permit with the primary key could not be found
	 */
	public static OsiApplicationPermit fetchByPrimaryKey(
		long osiApplicationPermitId) {

		return getPersistence().fetchByPrimaryKey(osiApplicationPermitId);
	}

	/**
	 * Returns all the osi application permits.
	 *
	 * @return the osi application permits
	 */
	public static List<OsiApplicationPermit> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the osi application permits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationPermitModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi application permits
	 * @param end the upper bound of the range of osi application permits (not inclusive)
	 * @return the range of osi application permits
	 */
	public static List<OsiApplicationPermit> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the osi application permits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationPermitModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi application permits
	 * @param end the upper bound of the range of osi application permits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi application permits
	 */
	public static List<OsiApplicationPermit> findAll(
		int start, int end,
		OrderByComparator<OsiApplicationPermit> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the osi application permits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationPermitModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi application permits
	 * @param end the upper bound of the range of osi application permits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi application permits
	 */
	public static List<OsiApplicationPermit> findAll(
		int start, int end,
		OrderByComparator<OsiApplicationPermit> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the osi application permits from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of osi application permits.
	 *
	 * @return the number of osi application permits
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static OsiApplicationPermitPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		OsiApplicationPermitPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile OsiApplicationPermitPersistence _persistence;

}