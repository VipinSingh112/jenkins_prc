/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.pharmaceutical.application.form.service.model.PharmaRecallForm;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the pharma recall form service. This utility wraps <code>com.nbp.pharmaceutical.application.form.service.service.persistence.impl.PharmaRecallFormPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PharmaRecallFormPersistence
 * @generated
 */
public class PharmaRecallFormUtil {

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
	public static void clearCache(PharmaRecallForm pharmaRecallForm) {
		getPersistence().clearCache(pharmaRecallForm);
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
	public static Map<Serializable, PharmaRecallForm> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<PharmaRecallForm> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<PharmaRecallForm> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<PharmaRecallForm> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<PharmaRecallForm> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static PharmaRecallForm update(PharmaRecallForm pharmaRecallForm) {
		return getPersistence().update(pharmaRecallForm);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static PharmaRecallForm update(
		PharmaRecallForm pharmaRecallForm, ServiceContext serviceContext) {

		return getPersistence().update(pharmaRecallForm, serviceContext);
	}

	/**
	 * Returns the pharma recall form where pharmaApplicationId = &#63; or throws a <code>NoSuchPharmaRecallFormException</code> if it could not be found.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the matching pharma recall form
	 * @throws NoSuchPharmaRecallFormException if a matching pharma recall form could not be found
	 */
	public static PharmaRecallForm findBygetCancelById(long pharmaApplicationId)
		throws com.nbp.pharmaceutical.application.form.service.exception.
			NoSuchPharmaRecallFormException {

		return getPersistence().findBygetCancelById(pharmaApplicationId);
	}

	/**
	 * Returns the pharma recall form where pharmaApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the matching pharma recall form, or <code>null</code> if a matching pharma recall form could not be found
	 */
	public static PharmaRecallForm fetchBygetCancelById(
		long pharmaApplicationId) {

		return getPersistence().fetchBygetCancelById(pharmaApplicationId);
	}

	/**
	 * Returns the pharma recall form where pharmaApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching pharma recall form, or <code>null</code> if a matching pharma recall form could not be found
	 */
	public static PharmaRecallForm fetchBygetCancelById(
		long pharmaApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetCancelById(
			pharmaApplicationId, useFinderCache);
	}

	/**
	 * Removes the pharma recall form where pharmaApplicationId = &#63; from the database.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the pharma recall form that was removed
	 */
	public static PharmaRecallForm removeBygetCancelById(
			long pharmaApplicationId)
		throws com.nbp.pharmaceutical.application.form.service.exception.
			NoSuchPharmaRecallFormException {

		return getPersistence().removeBygetCancelById(pharmaApplicationId);
	}

	/**
	 * Returns the number of pharma recall forms where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the number of matching pharma recall forms
	 */
	public static int countBygetCancelById(long pharmaApplicationId) {
		return getPersistence().countBygetCancelById(pharmaApplicationId);
	}

	/**
	 * Caches the pharma recall form in the entity cache if it is enabled.
	 *
	 * @param pharmaRecallForm the pharma recall form
	 */
	public static void cacheResult(PharmaRecallForm pharmaRecallForm) {
		getPersistence().cacheResult(pharmaRecallForm);
	}

	/**
	 * Caches the pharma recall forms in the entity cache if it is enabled.
	 *
	 * @param pharmaRecallForms the pharma recall forms
	 */
	public static void cacheResult(List<PharmaRecallForm> pharmaRecallForms) {
		getPersistence().cacheResult(pharmaRecallForms);
	}

	/**
	 * Creates a new pharma recall form with the primary key. Does not add the pharma recall form to the database.
	 *
	 * @param pharmaRecallFormId the primary key for the new pharma recall form
	 * @return the new pharma recall form
	 */
	public static PharmaRecallForm create(long pharmaRecallFormId) {
		return getPersistence().create(pharmaRecallFormId);
	}

	/**
	 * Removes the pharma recall form with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param pharmaRecallFormId the primary key of the pharma recall form
	 * @return the pharma recall form that was removed
	 * @throws NoSuchPharmaRecallFormException if a pharma recall form with the primary key could not be found
	 */
	public static PharmaRecallForm remove(long pharmaRecallFormId)
		throws com.nbp.pharmaceutical.application.form.service.exception.
			NoSuchPharmaRecallFormException {

		return getPersistence().remove(pharmaRecallFormId);
	}

	public static PharmaRecallForm updateImpl(
		PharmaRecallForm pharmaRecallForm) {

		return getPersistence().updateImpl(pharmaRecallForm);
	}

	/**
	 * Returns the pharma recall form with the primary key or throws a <code>NoSuchPharmaRecallFormException</code> if it could not be found.
	 *
	 * @param pharmaRecallFormId the primary key of the pharma recall form
	 * @return the pharma recall form
	 * @throws NoSuchPharmaRecallFormException if a pharma recall form with the primary key could not be found
	 */
	public static PharmaRecallForm findByPrimaryKey(long pharmaRecallFormId)
		throws com.nbp.pharmaceutical.application.form.service.exception.
			NoSuchPharmaRecallFormException {

		return getPersistence().findByPrimaryKey(pharmaRecallFormId);
	}

	/**
	 * Returns the pharma recall form with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param pharmaRecallFormId the primary key of the pharma recall form
	 * @return the pharma recall form, or <code>null</code> if a pharma recall form with the primary key could not be found
	 */
	public static PharmaRecallForm fetchByPrimaryKey(long pharmaRecallFormId) {
		return getPersistence().fetchByPrimaryKey(pharmaRecallFormId);
	}

	/**
	 * Returns all the pharma recall forms.
	 *
	 * @return the pharma recall forms
	 */
	public static List<PharmaRecallForm> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the pharma recall forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaRecallFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma recall forms
	 * @param end the upper bound of the range of pharma recall forms (not inclusive)
	 * @return the range of pharma recall forms
	 */
	public static List<PharmaRecallForm> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the pharma recall forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaRecallFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma recall forms
	 * @param end the upper bound of the range of pharma recall forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of pharma recall forms
	 */
	public static List<PharmaRecallForm> findAll(
		int start, int end,
		OrderByComparator<PharmaRecallForm> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the pharma recall forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaRecallFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma recall forms
	 * @param end the upper bound of the range of pharma recall forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of pharma recall forms
	 */
	public static List<PharmaRecallForm> findAll(
		int start, int end,
		OrderByComparator<PharmaRecallForm> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the pharma recall forms from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of pharma recall forms.
	 *
	 * @return the number of pharma recall forms
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static PharmaRecallFormPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(PharmaRecallFormPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile PharmaRecallFormPersistence _persistence;

}