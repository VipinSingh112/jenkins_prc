/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.stage.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.healthcare.stage.service.model.HealthCareDueDiligence;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the health care due diligence service. This utility wraps <code>com.nbp.healthcare.stage.service.service.persistence.impl.HealthCareDueDiligencePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HealthCareDueDiligencePersistence
 * @generated
 */
public class HealthCareDueDiligenceUtil {

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
		HealthCareDueDiligence healthCareDueDiligence) {

		getPersistence().clearCache(healthCareDueDiligence);
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
	public static Map<Serializable, HealthCareDueDiligence> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<HealthCareDueDiligence> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<HealthCareDueDiligence> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<HealthCareDueDiligence> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<HealthCareDueDiligence> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static HealthCareDueDiligence update(
		HealthCareDueDiligence healthCareDueDiligence) {

		return getPersistence().update(healthCareDueDiligence);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static HealthCareDueDiligence update(
		HealthCareDueDiligence healthCareDueDiligence,
		ServiceContext serviceContext) {

		return getPersistence().update(healthCareDueDiligence, serviceContext);
	}

	/**
	 * Returns the health care due diligence where caseId = &#63; or throws a <code>NoSuchHealthCareDueDiligenceException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching health care due diligence
	 * @throws NoSuchHealthCareDueDiligenceException if a matching health care due diligence could not be found
	 */
	public static HealthCareDueDiligence findBygetHealthCareBY_CI(String caseId)
		throws com.nbp.healthcare.stage.service.exception.
			NoSuchHealthCareDueDiligenceException {

		return getPersistence().findBygetHealthCareBY_CI(caseId);
	}

	/**
	 * Returns the health care due diligence where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching health care due diligence, or <code>null</code> if a matching health care due diligence could not be found
	 */
	public static HealthCareDueDiligence fetchBygetHealthCareBY_CI(
		String caseId) {

		return getPersistence().fetchBygetHealthCareBY_CI(caseId);
	}

	/**
	 * Returns the health care due diligence where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching health care due diligence, or <code>null</code> if a matching health care due diligence could not be found
	 */
	public static HealthCareDueDiligence fetchBygetHealthCareBY_CI(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetHealthCareBY_CI(
			caseId, useFinderCache);
	}

	/**
	 * Removes the health care due diligence where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the health care due diligence that was removed
	 */
	public static HealthCareDueDiligence removeBygetHealthCareBY_CI(
			String caseId)
		throws com.nbp.healthcare.stage.service.exception.
			NoSuchHealthCareDueDiligenceException {

		return getPersistence().removeBygetHealthCareBY_CI(caseId);
	}

	/**
	 * Returns the number of health care due diligences where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching health care due diligences
	 */
	public static int countBygetHealthCareBY_CI(String caseId) {
		return getPersistence().countBygetHealthCareBY_CI(caseId);
	}

	/**
	 * Returns the health care due diligence where caseId = &#63; and nameofAgency = &#63; or throws a <code>NoSuchHealthCareDueDiligenceException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param nameofAgency the nameof agency
	 * @return the matching health care due diligence
	 * @throws NoSuchHealthCareDueDiligenceException if a matching health care due diligence could not be found
	 */
	public static HealthCareDueDiligence findBygetHealthCareBY_CI_AN(
			String caseId, String nameofAgency)
		throws com.nbp.healthcare.stage.service.exception.
			NoSuchHealthCareDueDiligenceException {

		return getPersistence().findBygetHealthCareBY_CI_AN(
			caseId, nameofAgency);
	}

	/**
	 * Returns the health care due diligence where caseId = &#63; and nameofAgency = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param nameofAgency the nameof agency
	 * @return the matching health care due diligence, or <code>null</code> if a matching health care due diligence could not be found
	 */
	public static HealthCareDueDiligence fetchBygetHealthCareBY_CI_AN(
		String caseId, String nameofAgency) {

		return getPersistence().fetchBygetHealthCareBY_CI_AN(
			caseId, nameofAgency);
	}

	/**
	 * Returns the health care due diligence where caseId = &#63; and nameofAgency = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param nameofAgency the nameof agency
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching health care due diligence, or <code>null</code> if a matching health care due diligence could not be found
	 */
	public static HealthCareDueDiligence fetchBygetHealthCareBY_CI_AN(
		String caseId, String nameofAgency, boolean useFinderCache) {

		return getPersistence().fetchBygetHealthCareBY_CI_AN(
			caseId, nameofAgency, useFinderCache);
	}

	/**
	 * Removes the health care due diligence where caseId = &#63; and nameofAgency = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param nameofAgency the nameof agency
	 * @return the health care due diligence that was removed
	 */
	public static HealthCareDueDiligence removeBygetHealthCareBY_CI_AN(
			String caseId, String nameofAgency)
		throws com.nbp.healthcare.stage.service.exception.
			NoSuchHealthCareDueDiligenceException {

		return getPersistence().removeBygetHealthCareBY_CI_AN(
			caseId, nameofAgency);
	}

	/**
	 * Returns the number of health care due diligences where caseId = &#63; and nameofAgency = &#63;.
	 *
	 * @param caseId the case ID
	 * @param nameofAgency the nameof agency
	 * @return the number of matching health care due diligences
	 */
	public static int countBygetHealthCareBY_CI_AN(
		String caseId, String nameofAgency) {

		return getPersistence().countBygetHealthCareBY_CI_AN(
			caseId, nameofAgency);
	}

	/**
	 * Caches the health care due diligence in the entity cache if it is enabled.
	 *
	 * @param healthCareDueDiligence the health care due diligence
	 */
	public static void cacheResult(
		HealthCareDueDiligence healthCareDueDiligence) {

		getPersistence().cacheResult(healthCareDueDiligence);
	}

	/**
	 * Caches the health care due diligences in the entity cache if it is enabled.
	 *
	 * @param healthCareDueDiligences the health care due diligences
	 */
	public static void cacheResult(
		List<HealthCareDueDiligence> healthCareDueDiligences) {

		getPersistence().cacheResult(healthCareDueDiligences);
	}

	/**
	 * Creates a new health care due diligence with the primary key. Does not add the health care due diligence to the database.
	 *
	 * @param healthDDId the primary key for the new health care due diligence
	 * @return the new health care due diligence
	 */
	public static HealthCareDueDiligence create(long healthDDId) {
		return getPersistence().create(healthDDId);
	}

	/**
	 * Removes the health care due diligence with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param healthDDId the primary key of the health care due diligence
	 * @return the health care due diligence that was removed
	 * @throws NoSuchHealthCareDueDiligenceException if a health care due diligence with the primary key could not be found
	 */
	public static HealthCareDueDiligence remove(long healthDDId)
		throws com.nbp.healthcare.stage.service.exception.
			NoSuchHealthCareDueDiligenceException {

		return getPersistence().remove(healthDDId);
	}

	public static HealthCareDueDiligence updateImpl(
		HealthCareDueDiligence healthCareDueDiligence) {

		return getPersistence().updateImpl(healthCareDueDiligence);
	}

	/**
	 * Returns the health care due diligence with the primary key or throws a <code>NoSuchHealthCareDueDiligenceException</code> if it could not be found.
	 *
	 * @param healthDDId the primary key of the health care due diligence
	 * @return the health care due diligence
	 * @throws NoSuchHealthCareDueDiligenceException if a health care due diligence with the primary key could not be found
	 */
	public static HealthCareDueDiligence findByPrimaryKey(long healthDDId)
		throws com.nbp.healthcare.stage.service.exception.
			NoSuchHealthCareDueDiligenceException {

		return getPersistence().findByPrimaryKey(healthDDId);
	}

	/**
	 * Returns the health care due diligence with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param healthDDId the primary key of the health care due diligence
	 * @return the health care due diligence, or <code>null</code> if a health care due diligence with the primary key could not be found
	 */
	public static HealthCareDueDiligence fetchByPrimaryKey(long healthDDId) {
		return getPersistence().fetchByPrimaryKey(healthDDId);
	}

	/**
	 * Returns all the health care due diligences.
	 *
	 * @return the health care due diligences
	 */
	public static List<HealthCareDueDiligence> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the health care due diligences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care due diligences
	 * @param end the upper bound of the range of health care due diligences (not inclusive)
	 * @return the range of health care due diligences
	 */
	public static List<HealthCareDueDiligence> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the health care due diligences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care due diligences
	 * @param end the upper bound of the range of health care due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of health care due diligences
	 */
	public static List<HealthCareDueDiligence> findAll(
		int start, int end,
		OrderByComparator<HealthCareDueDiligence> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the health care due diligences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care due diligences
	 * @param end the upper bound of the range of health care due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of health care due diligences
	 */
	public static List<HealthCareDueDiligence> findAll(
		int start, int end,
		OrderByComparator<HealthCareDueDiligence> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the health care due diligences from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of health care due diligences.
	 *
	 * @return the number of health care due diligences
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static HealthCareDueDiligencePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		HealthCareDueDiligencePersistence persistence) {

		_persistence = persistence;
	}

	private static volatile HealthCareDueDiligencePersistence _persistence;

}