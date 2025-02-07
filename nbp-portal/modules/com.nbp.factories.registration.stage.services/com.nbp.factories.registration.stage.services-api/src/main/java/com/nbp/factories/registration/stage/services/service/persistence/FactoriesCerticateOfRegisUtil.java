/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.stage.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.factories.registration.stage.services.model.FactoriesCerticateOfRegis;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the factories certicate of regis service. This utility wraps <code>com.nbp.factories.registration.stage.services.service.persistence.impl.FactoriesCerticateOfRegisPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FactoriesCerticateOfRegisPersistence
 * @generated
 */
public class FactoriesCerticateOfRegisUtil {

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
		FactoriesCerticateOfRegis factoriesCerticateOfRegis) {

		getPersistence().clearCache(factoriesCerticateOfRegis);
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
	public static Map<Serializable, FactoriesCerticateOfRegis>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<FactoriesCerticateOfRegis> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<FactoriesCerticateOfRegis> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<FactoriesCerticateOfRegis> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<FactoriesCerticateOfRegis> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static FactoriesCerticateOfRegis update(
		FactoriesCerticateOfRegis factoriesCerticateOfRegis) {

		return getPersistence().update(factoriesCerticateOfRegis);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static FactoriesCerticateOfRegis update(
		FactoriesCerticateOfRegis factoriesCerticateOfRegis,
		ServiceContext serviceContext) {

		return getPersistence().update(
			factoriesCerticateOfRegis, serviceContext);
	}

	/**
	 * Returns the factories certicate of regis where caseId = &#63; or throws a <code>NoSuchFactoriesCerticateOfRegisException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching factories certicate of regis
	 * @throws NoSuchFactoriesCerticateOfRegisException if a matching factories certicate of regis could not be found
	 */
	public static FactoriesCerticateOfRegis findBygetFactoryCertifiResgiBy_CI(
			String caseId)
		throws com.nbp.factories.registration.stage.services.exception.
			NoSuchFactoriesCerticateOfRegisException {

		return getPersistence().findBygetFactoryCertifiResgiBy_CI(caseId);
	}

	/**
	 * Returns the factories certicate of regis where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching factories certicate of regis, or <code>null</code> if a matching factories certicate of regis could not be found
	 */
	public static FactoriesCerticateOfRegis fetchBygetFactoryCertifiResgiBy_CI(
		String caseId) {

		return getPersistence().fetchBygetFactoryCertifiResgiBy_CI(caseId);
	}

	/**
	 * Returns the factories certicate of regis where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching factories certicate of regis, or <code>null</code> if a matching factories certicate of regis could not be found
	 */
	public static FactoriesCerticateOfRegis fetchBygetFactoryCertifiResgiBy_CI(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetFactoryCertifiResgiBy_CI(
			caseId, useFinderCache);
	}

	/**
	 * Removes the factories certicate of regis where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the factories certicate of regis that was removed
	 */
	public static FactoriesCerticateOfRegis removeBygetFactoryCertifiResgiBy_CI(
			String caseId)
		throws com.nbp.factories.registration.stage.services.exception.
			NoSuchFactoriesCerticateOfRegisException {

		return getPersistence().removeBygetFactoryCertifiResgiBy_CI(caseId);
	}

	/**
	 * Returns the number of factories certicate of regises where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching factories certicate of regises
	 */
	public static int countBygetFactoryCertifiResgiBy_CI(String caseId) {
		return getPersistence().countBygetFactoryCertifiResgiBy_CI(caseId);
	}

	/**
	 * Returns all the factories certicate of regises where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching factories certicate of regises
	 */
	public static List<FactoriesCerticateOfRegis>
		findBygetFactoryCertifiResgisBy_CI(String caseId) {

		return getPersistence().findBygetFactoryCertifiResgisBy_CI(caseId);
	}

	/**
	 * Returns a range of all the factories certicate of regises where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesCerticateOfRegisModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of factories certicate of regises
	 * @param end the upper bound of the range of factories certicate of regises (not inclusive)
	 * @return the range of matching factories certicate of regises
	 */
	public static List<FactoriesCerticateOfRegis>
		findBygetFactoryCertifiResgisBy_CI(String caseId, int start, int end) {

		return getPersistence().findBygetFactoryCertifiResgisBy_CI(
			caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the factories certicate of regises where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesCerticateOfRegisModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of factories certicate of regises
	 * @param end the upper bound of the range of factories certicate of regises (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching factories certicate of regises
	 */
	public static List<FactoriesCerticateOfRegis>
		findBygetFactoryCertifiResgisBy_CI(
			String caseId, int start, int end,
			OrderByComparator<FactoriesCerticateOfRegis> orderByComparator) {

		return getPersistence().findBygetFactoryCertifiResgisBy_CI(
			caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the factories certicate of regises where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesCerticateOfRegisModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of factories certicate of regises
	 * @param end the upper bound of the range of factories certicate of regises (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching factories certicate of regises
	 */
	public static List<FactoriesCerticateOfRegis>
		findBygetFactoryCertifiResgisBy_CI(
			String caseId, int start, int end,
			OrderByComparator<FactoriesCerticateOfRegis> orderByComparator,
			boolean useFinderCache) {

		return getPersistence().findBygetFactoryCertifiResgisBy_CI(
			caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first factories certicate of regis in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories certicate of regis
	 * @throws NoSuchFactoriesCerticateOfRegisException if a matching factories certicate of regis could not be found
	 */
	public static FactoriesCerticateOfRegis
			findBygetFactoryCertifiResgisBy_CI_First(
				String caseId,
				OrderByComparator<FactoriesCerticateOfRegis> orderByComparator)
		throws com.nbp.factories.registration.stage.services.exception.
			NoSuchFactoriesCerticateOfRegisException {

		return getPersistence().findBygetFactoryCertifiResgisBy_CI_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the first factories certicate of regis in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories certicate of regis, or <code>null</code> if a matching factories certicate of regis could not be found
	 */
	public static FactoriesCerticateOfRegis
		fetchBygetFactoryCertifiResgisBy_CI_First(
			String caseId,
			OrderByComparator<FactoriesCerticateOfRegis> orderByComparator) {

		return getPersistence().fetchBygetFactoryCertifiResgisBy_CI_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last factories certicate of regis in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories certicate of regis
	 * @throws NoSuchFactoriesCerticateOfRegisException if a matching factories certicate of regis could not be found
	 */
	public static FactoriesCerticateOfRegis
			findBygetFactoryCertifiResgisBy_CI_Last(
				String caseId,
				OrderByComparator<FactoriesCerticateOfRegis> orderByComparator)
		throws com.nbp.factories.registration.stage.services.exception.
			NoSuchFactoriesCerticateOfRegisException {

		return getPersistence().findBygetFactoryCertifiResgisBy_CI_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last factories certicate of regis in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories certicate of regis, or <code>null</code> if a matching factories certicate of regis could not be found
	 */
	public static FactoriesCerticateOfRegis
		fetchBygetFactoryCertifiResgisBy_CI_Last(
			String caseId,
			OrderByComparator<FactoriesCerticateOfRegis> orderByComparator) {

		return getPersistence().fetchBygetFactoryCertifiResgisBy_CI_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the factories certicate of regises before and after the current factories certicate of regis in the ordered set where caseId = &#63;.
	 *
	 * @param factoriesCerticateOfRegisId the primary key of the current factories certicate of regis
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next factories certicate of regis
	 * @throws NoSuchFactoriesCerticateOfRegisException if a factories certicate of regis with the primary key could not be found
	 */
	public static FactoriesCerticateOfRegis[]
			findBygetFactoryCertifiResgisBy_CI_PrevAndNext(
				long factoriesCerticateOfRegisId, String caseId,
				OrderByComparator<FactoriesCerticateOfRegis> orderByComparator)
		throws com.nbp.factories.registration.stage.services.exception.
			NoSuchFactoriesCerticateOfRegisException {

		return getPersistence().findBygetFactoryCertifiResgisBy_CI_PrevAndNext(
			factoriesCerticateOfRegisId, caseId, orderByComparator);
	}

	/**
	 * Removes all the factories certicate of regises where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public static void removeBygetFactoryCertifiResgisBy_CI(String caseId) {
		getPersistence().removeBygetFactoryCertifiResgisBy_CI(caseId);
	}

	/**
	 * Returns the number of factories certicate of regises where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching factories certicate of regises
	 */
	public static int countBygetFactoryCertifiResgisBy_CI(String caseId) {
		return getPersistence().countBygetFactoryCertifiResgisBy_CI(caseId);
	}

	/**
	 * Caches the factories certicate of regis in the entity cache if it is enabled.
	 *
	 * @param factoriesCerticateOfRegis the factories certicate of regis
	 */
	public static void cacheResult(
		FactoriesCerticateOfRegis factoriesCerticateOfRegis) {

		getPersistence().cacheResult(factoriesCerticateOfRegis);
	}

	/**
	 * Caches the factories certicate of regises in the entity cache if it is enabled.
	 *
	 * @param factoriesCerticateOfRegises the factories certicate of regises
	 */
	public static void cacheResult(
		List<FactoriesCerticateOfRegis> factoriesCerticateOfRegises) {

		getPersistence().cacheResult(factoriesCerticateOfRegises);
	}

	/**
	 * Creates a new factories certicate of regis with the primary key. Does not add the factories certicate of regis to the database.
	 *
	 * @param factoriesCerticateOfRegisId the primary key for the new factories certicate of regis
	 * @return the new factories certicate of regis
	 */
	public static FactoriesCerticateOfRegis create(
		long factoriesCerticateOfRegisId) {

		return getPersistence().create(factoriesCerticateOfRegisId);
	}

	/**
	 * Removes the factories certicate of regis with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param factoriesCerticateOfRegisId the primary key of the factories certicate of regis
	 * @return the factories certicate of regis that was removed
	 * @throws NoSuchFactoriesCerticateOfRegisException if a factories certicate of regis with the primary key could not be found
	 */
	public static FactoriesCerticateOfRegis remove(
			long factoriesCerticateOfRegisId)
		throws com.nbp.factories.registration.stage.services.exception.
			NoSuchFactoriesCerticateOfRegisException {

		return getPersistence().remove(factoriesCerticateOfRegisId);
	}

	public static FactoriesCerticateOfRegis updateImpl(
		FactoriesCerticateOfRegis factoriesCerticateOfRegis) {

		return getPersistence().updateImpl(factoriesCerticateOfRegis);
	}

	/**
	 * Returns the factories certicate of regis with the primary key or throws a <code>NoSuchFactoriesCerticateOfRegisException</code> if it could not be found.
	 *
	 * @param factoriesCerticateOfRegisId the primary key of the factories certicate of regis
	 * @return the factories certicate of regis
	 * @throws NoSuchFactoriesCerticateOfRegisException if a factories certicate of regis with the primary key could not be found
	 */
	public static FactoriesCerticateOfRegis findByPrimaryKey(
			long factoriesCerticateOfRegisId)
		throws com.nbp.factories.registration.stage.services.exception.
			NoSuchFactoriesCerticateOfRegisException {

		return getPersistence().findByPrimaryKey(factoriesCerticateOfRegisId);
	}

	/**
	 * Returns the factories certicate of regis with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param factoriesCerticateOfRegisId the primary key of the factories certicate of regis
	 * @return the factories certicate of regis, or <code>null</code> if a factories certicate of regis with the primary key could not be found
	 */
	public static FactoriesCerticateOfRegis fetchByPrimaryKey(
		long factoriesCerticateOfRegisId) {

		return getPersistence().fetchByPrimaryKey(factoriesCerticateOfRegisId);
	}

	/**
	 * Returns all the factories certicate of regises.
	 *
	 * @return the factories certicate of regises
	 */
	public static List<FactoriesCerticateOfRegis> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the factories certicate of regises.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesCerticateOfRegisModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories certicate of regises
	 * @param end the upper bound of the range of factories certicate of regises (not inclusive)
	 * @return the range of factories certicate of regises
	 */
	public static List<FactoriesCerticateOfRegis> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the factories certicate of regises.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesCerticateOfRegisModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories certicate of regises
	 * @param end the upper bound of the range of factories certicate of regises (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of factories certicate of regises
	 */
	public static List<FactoriesCerticateOfRegis> findAll(
		int start, int end,
		OrderByComparator<FactoriesCerticateOfRegis> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the factories certicate of regises.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesCerticateOfRegisModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories certicate of regises
	 * @param end the upper bound of the range of factories certicate of regises (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of factories certicate of regises
	 */
	public static List<FactoriesCerticateOfRegis> findAll(
		int start, int end,
		OrderByComparator<FactoriesCerticateOfRegis> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the factories certicate of regises from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of factories certicate of regises.
	 *
	 * @return the number of factories certicate of regises
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static FactoriesCerticateOfRegisPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		FactoriesCerticateOfRegisPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile FactoriesCerticateOfRegisPersistence _persistence;

}