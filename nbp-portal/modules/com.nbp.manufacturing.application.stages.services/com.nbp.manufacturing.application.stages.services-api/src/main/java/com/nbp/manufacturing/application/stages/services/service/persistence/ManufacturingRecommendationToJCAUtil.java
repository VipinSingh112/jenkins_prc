/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.stages.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.manufacturing.application.stages.services.model.ManufacturingRecommendationToJCA;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the manufacturing recommendation to jca service. This utility wraps <code>com.nbp.manufacturing.application.stages.services.service.persistence.impl.ManufacturingRecommendationToJCAPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ManufacturingRecommendationToJCAPersistence
 * @generated
 */
public class ManufacturingRecommendationToJCAUtil {

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
		ManufacturingRecommendationToJCA manufacturingRecommendationToJCA) {

		getPersistence().clearCache(manufacturingRecommendationToJCA);
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
	public static Map<Serializable, ManufacturingRecommendationToJCA>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<ManufacturingRecommendationToJCA> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ManufacturingRecommendationToJCA> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ManufacturingRecommendationToJCA> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ManufacturingRecommendationToJCA> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ManufacturingRecommendationToJCA update(
		ManufacturingRecommendationToJCA manufacturingRecommendationToJCA) {

		return getPersistence().update(manufacturingRecommendationToJCA);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ManufacturingRecommendationToJCA update(
		ManufacturingRecommendationToJCA manufacturingRecommendationToJCA,
		ServiceContext serviceContext) {

		return getPersistence().update(
			manufacturingRecommendationToJCA, serviceContext);
	}

	/**
	 * Returns the manufacturing recommendation to jca where caseId = &#63; or throws a <code>NoSuchManufacturingRecommendationToJCAException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching manufacturing recommendation to jca
	 * @throws NoSuchManufacturingRecommendationToJCAException if a matching manufacturing recommendation to jca could not be found
	 */
	public static ManufacturingRecommendationToJCA
			findBygetManuFacturingBy_CaseId(String caseId)
		throws com.nbp.manufacturing.application.stages.services.exception.
			NoSuchManufacturingRecommendationToJCAException {

		return getPersistence().findBygetManuFacturingBy_CaseId(caseId);
	}

	/**
	 * Returns the manufacturing recommendation to jca where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching manufacturing recommendation to jca, or <code>null</code> if a matching manufacturing recommendation to jca could not be found
	 */
	public static ManufacturingRecommendationToJCA
		fetchBygetManuFacturingBy_CaseId(String caseId) {

		return getPersistence().fetchBygetManuFacturingBy_CaseId(caseId);
	}

	/**
	 * Returns the manufacturing recommendation to jca where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching manufacturing recommendation to jca, or <code>null</code> if a matching manufacturing recommendation to jca could not be found
	 */
	public static ManufacturingRecommendationToJCA
		fetchBygetManuFacturingBy_CaseId(
			String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetManuFacturingBy_CaseId(
			caseId, useFinderCache);
	}

	/**
	 * Removes the manufacturing recommendation to jca where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the manufacturing recommendation to jca that was removed
	 */
	public static ManufacturingRecommendationToJCA
			removeBygetManuFacturingBy_CaseId(String caseId)
		throws com.nbp.manufacturing.application.stages.services.exception.
			NoSuchManufacturingRecommendationToJCAException {

		return getPersistence().removeBygetManuFacturingBy_CaseId(caseId);
	}

	/**
	 * Returns the number of manufacturing recommendation to jcas where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching manufacturing recommendation to jcas
	 */
	public static int countBygetManuFacturingBy_CaseId(String caseId) {
		return getPersistence().countBygetManuFacturingBy_CaseId(caseId);
	}

	/**
	 * Caches the manufacturing recommendation to jca in the entity cache if it is enabled.
	 *
	 * @param manufacturingRecommendationToJCA the manufacturing recommendation to jca
	 */
	public static void cacheResult(
		ManufacturingRecommendationToJCA manufacturingRecommendationToJCA) {

		getPersistence().cacheResult(manufacturingRecommendationToJCA);
	}

	/**
	 * Caches the manufacturing recommendation to jcas in the entity cache if it is enabled.
	 *
	 * @param manufacturingRecommendationToJCAs the manufacturing recommendation to jcas
	 */
	public static void cacheResult(
		List<ManufacturingRecommendationToJCA>
			manufacturingRecommendationToJCAs) {

		getPersistence().cacheResult(manufacturingRecommendationToJCAs);
	}

	/**
	 * Creates a new manufacturing recommendation to jca with the primary key. Does not add the manufacturing recommendation to jca to the database.
	 *
	 * @param manufacturingJCAId the primary key for the new manufacturing recommendation to jca
	 * @return the new manufacturing recommendation to jca
	 */
	public static ManufacturingRecommendationToJCA create(
		long manufacturingJCAId) {

		return getPersistence().create(manufacturingJCAId);
	}

	/**
	 * Removes the manufacturing recommendation to jca with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param manufacturingJCAId the primary key of the manufacturing recommendation to jca
	 * @return the manufacturing recommendation to jca that was removed
	 * @throws NoSuchManufacturingRecommendationToJCAException if a manufacturing recommendation to jca with the primary key could not be found
	 */
	public static ManufacturingRecommendationToJCA remove(
			long manufacturingJCAId)
		throws com.nbp.manufacturing.application.stages.services.exception.
			NoSuchManufacturingRecommendationToJCAException {

		return getPersistence().remove(manufacturingJCAId);
	}

	public static ManufacturingRecommendationToJCA updateImpl(
		ManufacturingRecommendationToJCA manufacturingRecommendationToJCA) {

		return getPersistence().updateImpl(manufacturingRecommendationToJCA);
	}

	/**
	 * Returns the manufacturing recommendation to jca with the primary key or throws a <code>NoSuchManufacturingRecommendationToJCAException</code> if it could not be found.
	 *
	 * @param manufacturingJCAId the primary key of the manufacturing recommendation to jca
	 * @return the manufacturing recommendation to jca
	 * @throws NoSuchManufacturingRecommendationToJCAException if a manufacturing recommendation to jca with the primary key could not be found
	 */
	public static ManufacturingRecommendationToJCA findByPrimaryKey(
			long manufacturingJCAId)
		throws com.nbp.manufacturing.application.stages.services.exception.
			NoSuchManufacturingRecommendationToJCAException {

		return getPersistence().findByPrimaryKey(manufacturingJCAId);
	}

	/**
	 * Returns the manufacturing recommendation to jca with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param manufacturingJCAId the primary key of the manufacturing recommendation to jca
	 * @return the manufacturing recommendation to jca, or <code>null</code> if a manufacturing recommendation to jca with the primary key could not be found
	 */
	public static ManufacturingRecommendationToJCA fetchByPrimaryKey(
		long manufacturingJCAId) {

		return getPersistence().fetchByPrimaryKey(manufacturingJCAId);
	}

	/**
	 * Returns all the manufacturing recommendation to jcas.
	 *
	 * @return the manufacturing recommendation to jcas
	 */
	public static List<ManufacturingRecommendationToJCA> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the manufacturing recommendation to jcas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManufacturingRecommendationToJCAModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manufacturing recommendation to jcas
	 * @param end the upper bound of the range of manufacturing recommendation to jcas (not inclusive)
	 * @return the range of manufacturing recommendation to jcas
	 */
	public static List<ManufacturingRecommendationToJCA> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the manufacturing recommendation to jcas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManufacturingRecommendationToJCAModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manufacturing recommendation to jcas
	 * @param end the upper bound of the range of manufacturing recommendation to jcas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of manufacturing recommendation to jcas
	 */
	public static List<ManufacturingRecommendationToJCA> findAll(
		int start, int end,
		OrderByComparator<ManufacturingRecommendationToJCA> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the manufacturing recommendation to jcas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManufacturingRecommendationToJCAModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manufacturing recommendation to jcas
	 * @param end the upper bound of the range of manufacturing recommendation to jcas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of manufacturing recommendation to jcas
	 */
	public static List<ManufacturingRecommendationToJCA> findAll(
		int start, int end,
		OrderByComparator<ManufacturingRecommendationToJCA> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the manufacturing recommendation to jcas from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of manufacturing recommendation to jcas.
	 *
	 * @return the number of manufacturing recommendation to jcas
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ManufacturingRecommendationToJCAPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		ManufacturingRecommendationToJCAPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile ManufacturingRecommendationToJCAPersistence
		_persistence;

}