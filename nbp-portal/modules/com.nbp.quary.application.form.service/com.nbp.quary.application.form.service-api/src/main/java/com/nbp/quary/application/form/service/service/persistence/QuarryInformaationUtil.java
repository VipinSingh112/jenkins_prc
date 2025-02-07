/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.quary.application.form.service.model.QuarryInformaation;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the quarry informaation service. This utility wraps <code>com.nbp.quary.application.form.service.service.persistence.impl.QuarryInformaationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see QuarryInformaationPersistence
 * @generated
 */
public class QuarryInformaationUtil {

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
	public static void clearCache(QuarryInformaation quarryInformaation) {
		getPersistence().clearCache(quarryInformaation);
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
	public static Map<Serializable, QuarryInformaation> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<QuarryInformaation> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<QuarryInformaation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<QuarryInformaation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<QuarryInformaation> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static QuarryInformaation update(
		QuarryInformaation quarryInformaation) {

		return getPersistence().update(quarryInformaation);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static QuarryInformaation update(
		QuarryInformaation quarryInformaation, ServiceContext serviceContext) {

		return getPersistence().update(quarryInformaation, serviceContext);
	}

	/**
	 * Returns the quarry informaation where quarryApplicationId = &#63; or throws a <code>NoSuchQuarryInformaationException</code> if it could not be found.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the matching quarry informaation
	 * @throws NoSuchQuarryInformaationException if a matching quarry informaation could not be found
	 */
	public static QuarryInformaation findBygetQuarry_ById(
			long quarryApplicationId)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryInformaationException {

		return getPersistence().findBygetQuarry_ById(quarryApplicationId);
	}

	/**
	 * Returns the quarry informaation where quarryApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the matching quarry informaation, or <code>null</code> if a matching quarry informaation could not be found
	 */
	public static QuarryInformaation fetchBygetQuarry_ById(
		long quarryApplicationId) {

		return getPersistence().fetchBygetQuarry_ById(quarryApplicationId);
	}

	/**
	 * Returns the quarry informaation where quarryApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching quarry informaation, or <code>null</code> if a matching quarry informaation could not be found
	 */
	public static QuarryInformaation fetchBygetQuarry_ById(
		long quarryApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetQuarry_ById(
			quarryApplicationId, useFinderCache);
	}

	/**
	 * Removes the quarry informaation where quarryApplicationId = &#63; from the database.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the quarry informaation that was removed
	 */
	public static QuarryInformaation removeBygetQuarry_ById(
			long quarryApplicationId)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryInformaationException {

		return getPersistence().removeBygetQuarry_ById(quarryApplicationId);
	}

	/**
	 * Returns the number of quarry informaations where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the number of matching quarry informaations
	 */
	public static int countBygetQuarry_ById(long quarryApplicationId) {
		return getPersistence().countBygetQuarry_ById(quarryApplicationId);
	}

	/**
	 * Caches the quarry informaation in the entity cache if it is enabled.
	 *
	 * @param quarryInformaation the quarry informaation
	 */
	public static void cacheResult(QuarryInformaation quarryInformaation) {
		getPersistence().cacheResult(quarryInformaation);
	}

	/**
	 * Caches the quarry informaations in the entity cache if it is enabled.
	 *
	 * @param quarryInformaations the quarry informaations
	 */
	public static void cacheResult(
		List<QuarryInformaation> quarryInformaations) {

		getPersistence().cacheResult(quarryInformaations);
	}

	/**
	 * Creates a new quarry informaation with the primary key. Does not add the quarry informaation to the database.
	 *
	 * @param auarryInfoId the primary key for the new quarry informaation
	 * @return the new quarry informaation
	 */
	public static QuarryInformaation create(long auarryInfoId) {
		return getPersistence().create(auarryInfoId);
	}

	/**
	 * Removes the quarry informaation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param auarryInfoId the primary key of the quarry informaation
	 * @return the quarry informaation that was removed
	 * @throws NoSuchQuarryInformaationException if a quarry informaation with the primary key could not be found
	 */
	public static QuarryInformaation remove(long auarryInfoId)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryInformaationException {

		return getPersistence().remove(auarryInfoId);
	}

	public static QuarryInformaation updateImpl(
		QuarryInformaation quarryInformaation) {

		return getPersistence().updateImpl(quarryInformaation);
	}

	/**
	 * Returns the quarry informaation with the primary key or throws a <code>NoSuchQuarryInformaationException</code> if it could not be found.
	 *
	 * @param auarryInfoId the primary key of the quarry informaation
	 * @return the quarry informaation
	 * @throws NoSuchQuarryInformaationException if a quarry informaation with the primary key could not be found
	 */
	public static QuarryInformaation findByPrimaryKey(long auarryInfoId)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryInformaationException {

		return getPersistence().findByPrimaryKey(auarryInfoId);
	}

	/**
	 * Returns the quarry informaation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param auarryInfoId the primary key of the quarry informaation
	 * @return the quarry informaation, or <code>null</code> if a quarry informaation with the primary key could not be found
	 */
	public static QuarryInformaation fetchByPrimaryKey(long auarryInfoId) {
		return getPersistence().fetchByPrimaryKey(auarryInfoId);
	}

	/**
	 * Returns all the quarry informaations.
	 *
	 * @return the quarry informaations
	 */
	public static List<QuarryInformaation> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the quarry informaations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryInformaationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry informaations
	 * @param end the upper bound of the range of quarry informaations (not inclusive)
	 * @return the range of quarry informaations
	 */
	public static List<QuarryInformaation> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the quarry informaations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryInformaationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry informaations
	 * @param end the upper bound of the range of quarry informaations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of quarry informaations
	 */
	public static List<QuarryInformaation> findAll(
		int start, int end,
		OrderByComparator<QuarryInformaation> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the quarry informaations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryInformaationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry informaations
	 * @param end the upper bound of the range of quarry informaations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of quarry informaations
	 */
	public static List<QuarryInformaation> findAll(
		int start, int end,
		OrderByComparator<QuarryInformaation> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the quarry informaations from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of quarry informaations.
	 *
	 * @return the number of quarry informaations
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static QuarryInformaationPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		QuarryInformaationPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile QuarryInformaationPersistence _persistence;

}