/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.sez.status.application.form.service.model.sezSubmissionChecklist;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the sez submission checklist service. This utility wraps <code>com.nbp.sez.status.application.form.service.service.persistence.impl.sezSubmissionChecklistPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see sezSubmissionChecklistPersistence
 * @generated
 */
public class sezSubmissionChecklistUtil {

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
		sezSubmissionChecklist sezSubmissionChecklist) {

		getPersistence().clearCache(sezSubmissionChecklist);
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
	public static Map<Serializable, sezSubmissionChecklist> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<sezSubmissionChecklist> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<sezSubmissionChecklist> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<sezSubmissionChecklist> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<sezSubmissionChecklist> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static sezSubmissionChecklist update(
		sezSubmissionChecklist sezSubmissionChecklist) {

		return getPersistence().update(sezSubmissionChecklist);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static sezSubmissionChecklist update(
		sezSubmissionChecklist sezSubmissionChecklist,
		ServiceContext serviceContext) {

		return getPersistence().update(sezSubmissionChecklist, serviceContext);
	}

	/**
	 * Returns the sez submission checklist where sezStatusApplicationId = &#63; or throws a <code>NoSuchsezSubmissionChecklistException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez submission checklist
	 * @throws NoSuchsezSubmissionChecklistException if a matching sez submission checklist could not be found
	 */
	public static sezSubmissionChecklist findBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchsezSubmissionChecklistException {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez submission checklist where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez submission checklist, or <code>null</code> if a matching sez submission checklist could not be found
	 */
	public static sezSubmissionChecklist fetchBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		return getPersistence().fetchBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez submission checklist where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez submission checklist, or <code>null</code> if a matching sez submission checklist could not be found
	 */
	public static sezSubmissionChecklist fetchBygetSezStatusByAppId(
		long sezStatusApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetSezStatusByAppId(
			sezStatusApplicationId, useFinderCache);
	}

	/**
	 * Removes the sez submission checklist where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez submission checklist that was removed
	 */
	public static sezSubmissionChecklist removeBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchsezSubmissionChecklistException {

		return getPersistence().removeBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the number of sez submission checklists where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez submission checklists
	 */
	public static int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		return getPersistence().countBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Caches the sez submission checklist in the entity cache if it is enabled.
	 *
	 * @param sezSubmissionChecklist the sez submission checklist
	 */
	public static void cacheResult(
		sezSubmissionChecklist sezSubmissionChecklist) {

		getPersistence().cacheResult(sezSubmissionChecklist);
	}

	/**
	 * Caches the sez submission checklists in the entity cache if it is enabled.
	 *
	 * @param sezSubmissionChecklists the sez submission checklists
	 */
	public static void cacheResult(
		List<sezSubmissionChecklist> sezSubmissionChecklists) {

		getPersistence().cacheResult(sezSubmissionChecklists);
	}

	/**
	 * Creates a new sez submission checklist with the primary key. Does not add the sez submission checklist to the database.
	 *
	 * @param sezSubmissionChecklistId the primary key for the new sez submission checklist
	 * @return the new sez submission checklist
	 */
	public static sezSubmissionChecklist create(long sezSubmissionChecklistId) {
		return getPersistence().create(sezSubmissionChecklistId);
	}

	/**
	 * Removes the sez submission checklist with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezSubmissionChecklistId the primary key of the sez submission checklist
	 * @return the sez submission checklist that was removed
	 * @throws NoSuchsezSubmissionChecklistException if a sez submission checklist with the primary key could not be found
	 */
	public static sezSubmissionChecklist remove(long sezSubmissionChecklistId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchsezSubmissionChecklistException {

		return getPersistence().remove(sezSubmissionChecklistId);
	}

	public static sezSubmissionChecklist updateImpl(
		sezSubmissionChecklist sezSubmissionChecklist) {

		return getPersistence().updateImpl(sezSubmissionChecklist);
	}

	/**
	 * Returns the sez submission checklist with the primary key or throws a <code>NoSuchsezSubmissionChecklistException</code> if it could not be found.
	 *
	 * @param sezSubmissionChecklistId the primary key of the sez submission checklist
	 * @return the sez submission checklist
	 * @throws NoSuchsezSubmissionChecklistException if a sez submission checklist with the primary key could not be found
	 */
	public static sezSubmissionChecklist findByPrimaryKey(
			long sezSubmissionChecklistId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchsezSubmissionChecklistException {

		return getPersistence().findByPrimaryKey(sezSubmissionChecklistId);
	}

	/**
	 * Returns the sez submission checklist with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezSubmissionChecklistId the primary key of the sez submission checklist
	 * @return the sez submission checklist, or <code>null</code> if a sez submission checklist with the primary key could not be found
	 */
	public static sezSubmissionChecklist fetchByPrimaryKey(
		long sezSubmissionChecklistId) {

		return getPersistence().fetchByPrimaryKey(sezSubmissionChecklistId);
	}

	/**
	 * Returns all the sez submission checklists.
	 *
	 * @return the sez submission checklists
	 */
	public static List<sezSubmissionChecklist> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the sez submission checklists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>sezSubmissionChecklistModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez submission checklists
	 * @param end the upper bound of the range of sez submission checklists (not inclusive)
	 * @return the range of sez submission checklists
	 */
	public static List<sezSubmissionChecklist> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the sez submission checklists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>sezSubmissionChecklistModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez submission checklists
	 * @param end the upper bound of the range of sez submission checklists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez submission checklists
	 */
	public static List<sezSubmissionChecklist> findAll(
		int start, int end,
		OrderByComparator<sezSubmissionChecklist> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez submission checklists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>sezSubmissionChecklistModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez submission checklists
	 * @param end the upper bound of the range of sez submission checklists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez submission checklists
	 */
	public static List<sezSubmissionChecklist> findAll(
		int start, int end,
		OrderByComparator<sezSubmissionChecklist> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the sez submission checklists from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of sez submission checklists.
	 *
	 * @return the number of sez submission checklists
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static sezSubmissionChecklistPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		sezSubmissionChecklistPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile sezSubmissionChecklistPersistence _persistence;

}