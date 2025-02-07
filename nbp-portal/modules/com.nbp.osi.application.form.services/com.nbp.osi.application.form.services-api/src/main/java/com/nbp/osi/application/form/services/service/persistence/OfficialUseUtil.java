/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.osi.application.form.services.model.OfficialUse;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the official use service. This utility wraps <code>com.nbp.osi.application.form.services.service.persistence.impl.OfficialUsePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OfficialUsePersistence
 * @generated
 */
public class OfficialUseUtil {

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
	public static void clearCache(OfficialUse officialUse) {
		getPersistence().clearCache(officialUse);
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
	public static Map<Serializable, OfficialUse> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<OfficialUse> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<OfficialUse> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<OfficialUse> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<OfficialUse> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static OfficialUse update(OfficialUse officialUse) {
		return getPersistence().update(officialUse);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static OfficialUse update(
		OfficialUse officialUse, ServiceContext serviceContext) {

		return getPersistence().update(officialUse, serviceContext);
	}

	/**
	 * Returns the official use where osiApplicationId = &#63; or throws a <code>NoSuchOfficialUseException</code> if it could not be found.
	 *
	 * @param osiApplicationId the osi application ID
	 * @return the matching official use
	 * @throws NoSuchOfficialUseException if a matching official use could not be found
	 */
	public static OfficialUse findBygetOsiById(long osiApplicationId)
		throws com.nbp.osi.application.form.services.exception.
			NoSuchOfficialUseException {

		return getPersistence().findBygetOsiById(osiApplicationId);
	}

	/**
	 * Returns the official use where osiApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiApplicationId the osi application ID
	 * @return the matching official use, or <code>null</code> if a matching official use could not be found
	 */
	public static OfficialUse fetchBygetOsiById(long osiApplicationId) {
		return getPersistence().fetchBygetOsiById(osiApplicationId);
	}

	/**
	 * Returns the official use where osiApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiApplicationId the osi application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching official use, or <code>null</code> if a matching official use could not be found
	 */
	public static OfficialUse fetchBygetOsiById(
		long osiApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetOsiById(
			osiApplicationId, useFinderCache);
	}

	/**
	 * Removes the official use where osiApplicationId = &#63; from the database.
	 *
	 * @param osiApplicationId the osi application ID
	 * @return the official use that was removed
	 */
	public static OfficialUse removeBygetOsiById(long osiApplicationId)
		throws com.nbp.osi.application.form.services.exception.
			NoSuchOfficialUseException {

		return getPersistence().removeBygetOsiById(osiApplicationId);
	}

	/**
	 * Returns the number of official uses where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @return the number of matching official uses
	 */
	public static int countBygetOsiById(long osiApplicationId) {
		return getPersistence().countBygetOsiById(osiApplicationId);
	}

	/**
	 * Caches the official use in the entity cache if it is enabled.
	 *
	 * @param officialUse the official use
	 */
	public static void cacheResult(OfficialUse officialUse) {
		getPersistence().cacheResult(officialUse);
	}

	/**
	 * Caches the official uses in the entity cache if it is enabled.
	 *
	 * @param officialUses the official uses
	 */
	public static void cacheResult(List<OfficialUse> officialUses) {
		getPersistence().cacheResult(officialUses);
	}

	/**
	 * Creates a new official use with the primary key. Does not add the official use to the database.
	 *
	 * @param officialUseId the primary key for the new official use
	 * @return the new official use
	 */
	public static OfficialUse create(long officialUseId) {
		return getPersistence().create(officialUseId);
	}

	/**
	 * Removes the official use with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param officialUseId the primary key of the official use
	 * @return the official use that was removed
	 * @throws NoSuchOfficialUseException if a official use with the primary key could not be found
	 */
	public static OfficialUse remove(long officialUseId)
		throws com.nbp.osi.application.form.services.exception.
			NoSuchOfficialUseException {

		return getPersistence().remove(officialUseId);
	}

	public static OfficialUse updateImpl(OfficialUse officialUse) {
		return getPersistence().updateImpl(officialUse);
	}

	/**
	 * Returns the official use with the primary key or throws a <code>NoSuchOfficialUseException</code> if it could not be found.
	 *
	 * @param officialUseId the primary key of the official use
	 * @return the official use
	 * @throws NoSuchOfficialUseException if a official use with the primary key could not be found
	 */
	public static OfficialUse findByPrimaryKey(long officialUseId)
		throws com.nbp.osi.application.form.services.exception.
			NoSuchOfficialUseException {

		return getPersistence().findByPrimaryKey(officialUseId);
	}

	/**
	 * Returns the official use with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param officialUseId the primary key of the official use
	 * @return the official use, or <code>null</code> if a official use with the primary key could not be found
	 */
	public static OfficialUse fetchByPrimaryKey(long officialUseId) {
		return getPersistence().fetchByPrimaryKey(officialUseId);
	}

	/**
	 * Returns all the official uses.
	 *
	 * @return the official uses
	 */
	public static List<OfficialUse> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the official uses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OfficialUseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of official uses
	 * @param end the upper bound of the range of official uses (not inclusive)
	 * @return the range of official uses
	 */
	public static List<OfficialUse> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the official uses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OfficialUseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of official uses
	 * @param end the upper bound of the range of official uses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of official uses
	 */
	public static List<OfficialUse> findAll(
		int start, int end, OrderByComparator<OfficialUse> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the official uses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OfficialUseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of official uses
	 * @param end the upper bound of the range of official uses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of official uses
	 */
	public static List<OfficialUse> findAll(
		int start, int end, OrderByComparator<OfficialUse> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the official uses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of official uses.
	 *
	 * @return the number of official uses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static OfficialUsePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(OfficialUsePersistence persistence) {
		_persistence = persistence;
	}

	private static volatile OfficialUsePersistence _persistence;

}