/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.hsra.application.service.model.RadiationSafetyLowRisk;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the radiation safety low risk service. This utility wraps <code>com.nbp.hsra.application.service.service.persistence.impl.RadiationSafetyLowRiskPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RadiationSafetyLowRiskPersistence
 * @generated
 */
public class RadiationSafetyLowRiskUtil {

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
		RadiationSafetyLowRisk radiationSafetyLowRisk) {

		getPersistence().clearCache(radiationSafetyLowRisk);
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
	public static Map<Serializable, RadiationSafetyLowRisk> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<RadiationSafetyLowRisk> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<RadiationSafetyLowRisk> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<RadiationSafetyLowRisk> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<RadiationSafetyLowRisk> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static RadiationSafetyLowRisk update(
		RadiationSafetyLowRisk radiationSafetyLowRisk) {

		return getPersistence().update(radiationSafetyLowRisk);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static RadiationSafetyLowRisk update(
		RadiationSafetyLowRisk radiationSafetyLowRisk,
		ServiceContext serviceContext) {

		return getPersistence().update(radiationSafetyLowRisk, serviceContext);
	}

	/**
	 * Returns the radiation safety low risk where hsraApplicationId = &#63; or throws a <code>NoSuchRadiationSafetyLowRiskException</code> if it could not be found.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching radiation safety low risk
	 * @throws NoSuchRadiationSafetyLowRiskException if a matching radiation safety low risk could not be found
	 */
	public static RadiationSafetyLowRisk findBygetHsraById(
			long hsraApplicationId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchRadiationSafetyLowRiskException {

		return getPersistence().findBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns the radiation safety low risk where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching radiation safety low risk, or <code>null</code> if a matching radiation safety low risk could not be found
	 */
	public static RadiationSafetyLowRisk fetchBygetHsraById(
		long hsraApplicationId) {

		return getPersistence().fetchBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns the radiation safety low risk where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching radiation safety low risk, or <code>null</code> if a matching radiation safety low risk could not be found
	 */
	public static RadiationSafetyLowRisk fetchBygetHsraById(
		long hsraApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetHsraById(
			hsraApplicationId, useFinderCache);
	}

	/**
	 * Removes the radiation safety low risk where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the radiation safety low risk that was removed
	 */
	public static RadiationSafetyLowRisk removeBygetHsraById(
			long hsraApplicationId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchRadiationSafetyLowRiskException {

		return getPersistence().removeBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns the number of radiation safety low risks where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching radiation safety low risks
	 */
	public static int countBygetHsraById(long hsraApplicationId) {
		return getPersistence().countBygetHsraById(hsraApplicationId);
	}

	/**
	 * Caches the radiation safety low risk in the entity cache if it is enabled.
	 *
	 * @param radiationSafetyLowRisk the radiation safety low risk
	 */
	public static void cacheResult(
		RadiationSafetyLowRisk radiationSafetyLowRisk) {

		getPersistence().cacheResult(radiationSafetyLowRisk);
	}

	/**
	 * Caches the radiation safety low risks in the entity cache if it is enabled.
	 *
	 * @param radiationSafetyLowRisks the radiation safety low risks
	 */
	public static void cacheResult(
		List<RadiationSafetyLowRisk> radiationSafetyLowRisks) {

		getPersistence().cacheResult(radiationSafetyLowRisks);
	}

	/**
	 * Creates a new radiation safety low risk with the primary key. Does not add the radiation safety low risk to the database.
	 *
	 * @param radiationSafetyLowRiskId the primary key for the new radiation safety low risk
	 * @return the new radiation safety low risk
	 */
	public static RadiationSafetyLowRisk create(long radiationSafetyLowRiskId) {
		return getPersistence().create(radiationSafetyLowRiskId);
	}

	/**
	 * Removes the radiation safety low risk with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param radiationSafetyLowRiskId the primary key of the radiation safety low risk
	 * @return the radiation safety low risk that was removed
	 * @throws NoSuchRadiationSafetyLowRiskException if a radiation safety low risk with the primary key could not be found
	 */
	public static RadiationSafetyLowRisk remove(long radiationSafetyLowRiskId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchRadiationSafetyLowRiskException {

		return getPersistence().remove(radiationSafetyLowRiskId);
	}

	public static RadiationSafetyLowRisk updateImpl(
		RadiationSafetyLowRisk radiationSafetyLowRisk) {

		return getPersistence().updateImpl(radiationSafetyLowRisk);
	}

	/**
	 * Returns the radiation safety low risk with the primary key or throws a <code>NoSuchRadiationSafetyLowRiskException</code> if it could not be found.
	 *
	 * @param radiationSafetyLowRiskId the primary key of the radiation safety low risk
	 * @return the radiation safety low risk
	 * @throws NoSuchRadiationSafetyLowRiskException if a radiation safety low risk with the primary key could not be found
	 */
	public static RadiationSafetyLowRisk findByPrimaryKey(
			long radiationSafetyLowRiskId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchRadiationSafetyLowRiskException {

		return getPersistence().findByPrimaryKey(radiationSafetyLowRiskId);
	}

	/**
	 * Returns the radiation safety low risk with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param radiationSafetyLowRiskId the primary key of the radiation safety low risk
	 * @return the radiation safety low risk, or <code>null</code> if a radiation safety low risk with the primary key could not be found
	 */
	public static RadiationSafetyLowRisk fetchByPrimaryKey(
		long radiationSafetyLowRiskId) {

		return getPersistence().fetchByPrimaryKey(radiationSafetyLowRiskId);
	}

	/**
	 * Returns all the radiation safety low risks.
	 *
	 * @return the radiation safety low risks
	 */
	public static List<RadiationSafetyLowRisk> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the radiation safety low risks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadiationSafetyLowRiskModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of radiation safety low risks
	 * @param end the upper bound of the range of radiation safety low risks (not inclusive)
	 * @return the range of radiation safety low risks
	 */
	public static List<RadiationSafetyLowRisk> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the radiation safety low risks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadiationSafetyLowRiskModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of radiation safety low risks
	 * @param end the upper bound of the range of radiation safety low risks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of radiation safety low risks
	 */
	public static List<RadiationSafetyLowRisk> findAll(
		int start, int end,
		OrderByComparator<RadiationSafetyLowRisk> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the radiation safety low risks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadiationSafetyLowRiskModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of radiation safety low risks
	 * @param end the upper bound of the range of radiation safety low risks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of radiation safety low risks
	 */
	public static List<RadiationSafetyLowRisk> findAll(
		int start, int end,
		OrderByComparator<RadiationSafetyLowRisk> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the radiation safety low risks from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of radiation safety low risks.
	 *
	 * @return the number of radiation safety low risks
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static RadiationSafetyLowRiskPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		RadiationSafetyLowRiskPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile RadiationSafetyLowRiskPersistence _persistence;

}