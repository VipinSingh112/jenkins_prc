/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.creative.application.form.service.model.CreativeIndividualEconomicEffect;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the creative individual economic effect service. This utility wraps <code>com.nbp.creative.application.form.service.service.persistence.impl.CreativeIndividualEconomicEffectPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CreativeIndividualEconomicEffectPersistence
 * @generated
 */
public class CreativeIndividualEconomicEffectUtil {

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
		CreativeIndividualEconomicEffect creativeIndividualEconomicEffect) {

		getPersistence().clearCache(creativeIndividualEconomicEffect);
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
	public static Map<Serializable, CreativeIndividualEconomicEffect>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<CreativeIndividualEconomicEffect> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CreativeIndividualEconomicEffect> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CreativeIndividualEconomicEffect> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CreativeIndividualEconomicEffect> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CreativeIndividualEconomicEffect update(
		CreativeIndividualEconomicEffect creativeIndividualEconomicEffect) {

		return getPersistence().update(creativeIndividualEconomicEffect);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CreativeIndividualEconomicEffect update(
		CreativeIndividualEconomicEffect creativeIndividualEconomicEffect,
		ServiceContext serviceContext) {

		return getPersistence().update(
			creativeIndividualEconomicEffect, serviceContext);
	}

	/**
	 * Returns the creative individual economic effect where CreativeApplicationId = &#63; or throws a <code>NoSuchCreativeIndividualEconomicEffectException</code> if it could not be found.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the matching creative individual economic effect
	 * @throws NoSuchCreativeIndividualEconomicEffectException if a matching creative individual economic effect could not be found
	 */
	public static CreativeIndividualEconomicEffect findBygetCreativeById(
			long CreativeApplicationId)
		throws com.nbp.creative.application.form.service.exception.
			NoSuchCreativeIndividualEconomicEffectException {

		return getPersistence().findBygetCreativeById(CreativeApplicationId);
	}

	/**
	 * Returns the creative individual economic effect where CreativeApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the matching creative individual economic effect, or <code>null</code> if a matching creative individual economic effect could not be found
	 */
	public static CreativeIndividualEconomicEffect fetchBygetCreativeById(
		long CreativeApplicationId) {

		return getPersistence().fetchBygetCreativeById(CreativeApplicationId);
	}

	/**
	 * Returns the creative individual economic effect where CreativeApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching creative individual economic effect, or <code>null</code> if a matching creative individual economic effect could not be found
	 */
	public static CreativeIndividualEconomicEffect fetchBygetCreativeById(
		long CreativeApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetCreativeById(
			CreativeApplicationId, useFinderCache);
	}

	/**
	 * Removes the creative individual economic effect where CreativeApplicationId = &#63; from the database.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the creative individual economic effect that was removed
	 */
	public static CreativeIndividualEconomicEffect removeBygetCreativeById(
			long CreativeApplicationId)
		throws com.nbp.creative.application.form.service.exception.
			NoSuchCreativeIndividualEconomicEffectException {

		return getPersistence().removeBygetCreativeById(CreativeApplicationId);
	}

	/**
	 * Returns the number of creative individual economic effects where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the number of matching creative individual economic effects
	 */
	public static int countBygetCreativeById(long CreativeApplicationId) {
		return getPersistence().countBygetCreativeById(CreativeApplicationId);
	}

	/**
	 * Caches the creative individual economic effect in the entity cache if it is enabled.
	 *
	 * @param creativeIndividualEconomicEffect the creative individual economic effect
	 */
	public static void cacheResult(
		CreativeIndividualEconomicEffect creativeIndividualEconomicEffect) {

		getPersistence().cacheResult(creativeIndividualEconomicEffect);
	}

	/**
	 * Caches the creative individual economic effects in the entity cache if it is enabled.
	 *
	 * @param creativeIndividualEconomicEffects the creative individual economic effects
	 */
	public static void cacheResult(
		List<CreativeIndividualEconomicEffect>
			creativeIndividualEconomicEffects) {

		getPersistence().cacheResult(creativeIndividualEconomicEffects);
	}

	/**
	 * Creates a new creative individual economic effect with the primary key. Does not add the creative individual economic effect to the database.
	 *
	 * @param creativeIndiEcoEffectId the primary key for the new creative individual economic effect
	 * @return the new creative individual economic effect
	 */
	public static CreativeIndividualEconomicEffect create(
		long creativeIndiEcoEffectId) {

		return getPersistence().create(creativeIndiEcoEffectId);
	}

	/**
	 * Removes the creative individual economic effect with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param creativeIndiEcoEffectId the primary key of the creative individual economic effect
	 * @return the creative individual economic effect that was removed
	 * @throws NoSuchCreativeIndividualEconomicEffectException if a creative individual economic effect with the primary key could not be found
	 */
	public static CreativeIndividualEconomicEffect remove(
			long creativeIndiEcoEffectId)
		throws com.nbp.creative.application.form.service.exception.
			NoSuchCreativeIndividualEconomicEffectException {

		return getPersistence().remove(creativeIndiEcoEffectId);
	}

	public static CreativeIndividualEconomicEffect updateImpl(
		CreativeIndividualEconomicEffect creativeIndividualEconomicEffect) {

		return getPersistence().updateImpl(creativeIndividualEconomicEffect);
	}

	/**
	 * Returns the creative individual economic effect with the primary key or throws a <code>NoSuchCreativeIndividualEconomicEffectException</code> if it could not be found.
	 *
	 * @param creativeIndiEcoEffectId the primary key of the creative individual economic effect
	 * @return the creative individual economic effect
	 * @throws NoSuchCreativeIndividualEconomicEffectException if a creative individual economic effect with the primary key could not be found
	 */
	public static CreativeIndividualEconomicEffect findByPrimaryKey(
			long creativeIndiEcoEffectId)
		throws com.nbp.creative.application.form.service.exception.
			NoSuchCreativeIndividualEconomicEffectException {

		return getPersistence().findByPrimaryKey(creativeIndiEcoEffectId);
	}

	/**
	 * Returns the creative individual economic effect with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param creativeIndiEcoEffectId the primary key of the creative individual economic effect
	 * @return the creative individual economic effect, or <code>null</code> if a creative individual economic effect with the primary key could not be found
	 */
	public static CreativeIndividualEconomicEffect fetchByPrimaryKey(
		long creativeIndiEcoEffectId) {

		return getPersistence().fetchByPrimaryKey(creativeIndiEcoEffectId);
	}

	/**
	 * Returns all the creative individual economic effects.
	 *
	 * @return the creative individual economic effects
	 */
	public static List<CreativeIndividualEconomicEffect> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the creative individual economic effects.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeIndividualEconomicEffectModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative individual economic effects
	 * @param end the upper bound of the range of creative individual economic effects (not inclusive)
	 * @return the range of creative individual economic effects
	 */
	public static List<CreativeIndividualEconomicEffect> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the creative individual economic effects.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeIndividualEconomicEffectModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative individual economic effects
	 * @param end the upper bound of the range of creative individual economic effects (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of creative individual economic effects
	 */
	public static List<CreativeIndividualEconomicEffect> findAll(
		int start, int end,
		OrderByComparator<CreativeIndividualEconomicEffect> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the creative individual economic effects.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeIndividualEconomicEffectModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative individual economic effects
	 * @param end the upper bound of the range of creative individual economic effects (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of creative individual economic effects
	 */
	public static List<CreativeIndividualEconomicEffect> findAll(
		int start, int end,
		OrderByComparator<CreativeIndividualEconomicEffect> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the creative individual economic effects from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of creative individual economic effects.
	 *
	 * @return the number of creative individual economic effects
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static CreativeIndividualEconomicEffectPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		CreativeIndividualEconomicEffectPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile CreativeIndividualEconomicEffectPersistence
		_persistence;

}