/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.pharmaceutical.application.form.service.model.PharmaCancellationForm;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the pharma cancellation form service. This utility wraps <code>com.nbp.pharmaceutical.application.form.service.service.persistence.impl.PharmaCancellationFormPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PharmaCancellationFormPersistence
 * @generated
 */
public class PharmaCancellationFormUtil {

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
		PharmaCancellationForm pharmaCancellationForm) {

		getPersistence().clearCache(pharmaCancellationForm);
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
	public static Map<Serializable, PharmaCancellationForm> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<PharmaCancellationForm> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<PharmaCancellationForm> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<PharmaCancellationForm> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<PharmaCancellationForm> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static PharmaCancellationForm update(
		PharmaCancellationForm pharmaCancellationForm) {

		return getPersistence().update(pharmaCancellationForm);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static PharmaCancellationForm update(
		PharmaCancellationForm pharmaCancellationForm,
		ServiceContext serviceContext) {

		return getPersistence().update(pharmaCancellationForm, serviceContext);
	}

	/**
	 * Returns the pharma cancellation form where pharmaApplicationId = &#63; or throws a <code>NoSuchPharmaCancellationFormException</code> if it could not be found.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the matching pharma cancellation form
	 * @throws NoSuchPharmaCancellationFormException if a matching pharma cancellation form could not be found
	 */
	public static PharmaCancellationForm findBygetCancelById(
			long pharmaApplicationId)
		throws com.nbp.pharmaceutical.application.form.service.exception.
			NoSuchPharmaCancellationFormException {

		return getPersistence().findBygetCancelById(pharmaApplicationId);
	}

	/**
	 * Returns the pharma cancellation form where pharmaApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the matching pharma cancellation form, or <code>null</code> if a matching pharma cancellation form could not be found
	 */
	public static PharmaCancellationForm fetchBygetCancelById(
		long pharmaApplicationId) {

		return getPersistence().fetchBygetCancelById(pharmaApplicationId);
	}

	/**
	 * Returns the pharma cancellation form where pharmaApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching pharma cancellation form, or <code>null</code> if a matching pharma cancellation form could not be found
	 */
	public static PharmaCancellationForm fetchBygetCancelById(
		long pharmaApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetCancelById(
			pharmaApplicationId, useFinderCache);
	}

	/**
	 * Removes the pharma cancellation form where pharmaApplicationId = &#63; from the database.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the pharma cancellation form that was removed
	 */
	public static PharmaCancellationForm removeBygetCancelById(
			long pharmaApplicationId)
		throws com.nbp.pharmaceutical.application.form.service.exception.
			NoSuchPharmaCancellationFormException {

		return getPersistence().removeBygetCancelById(pharmaApplicationId);
	}

	/**
	 * Returns the number of pharma cancellation forms where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the number of matching pharma cancellation forms
	 */
	public static int countBygetCancelById(long pharmaApplicationId) {
		return getPersistence().countBygetCancelById(pharmaApplicationId);
	}

	/**
	 * Caches the pharma cancellation form in the entity cache if it is enabled.
	 *
	 * @param pharmaCancellationForm the pharma cancellation form
	 */
	public static void cacheResult(
		PharmaCancellationForm pharmaCancellationForm) {

		getPersistence().cacheResult(pharmaCancellationForm);
	}

	/**
	 * Caches the pharma cancellation forms in the entity cache if it is enabled.
	 *
	 * @param pharmaCancellationForms the pharma cancellation forms
	 */
	public static void cacheResult(
		List<PharmaCancellationForm> pharmaCancellationForms) {

		getPersistence().cacheResult(pharmaCancellationForms);
	}

	/**
	 * Creates a new pharma cancellation form with the primary key. Does not add the pharma cancellation form to the database.
	 *
	 * @param pharmaCancellationFormId the primary key for the new pharma cancellation form
	 * @return the new pharma cancellation form
	 */
	public static PharmaCancellationForm create(long pharmaCancellationFormId) {
		return getPersistence().create(pharmaCancellationFormId);
	}

	/**
	 * Removes the pharma cancellation form with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param pharmaCancellationFormId the primary key of the pharma cancellation form
	 * @return the pharma cancellation form that was removed
	 * @throws NoSuchPharmaCancellationFormException if a pharma cancellation form with the primary key could not be found
	 */
	public static PharmaCancellationForm remove(long pharmaCancellationFormId)
		throws com.nbp.pharmaceutical.application.form.service.exception.
			NoSuchPharmaCancellationFormException {

		return getPersistence().remove(pharmaCancellationFormId);
	}

	public static PharmaCancellationForm updateImpl(
		PharmaCancellationForm pharmaCancellationForm) {

		return getPersistence().updateImpl(pharmaCancellationForm);
	}

	/**
	 * Returns the pharma cancellation form with the primary key or throws a <code>NoSuchPharmaCancellationFormException</code> if it could not be found.
	 *
	 * @param pharmaCancellationFormId the primary key of the pharma cancellation form
	 * @return the pharma cancellation form
	 * @throws NoSuchPharmaCancellationFormException if a pharma cancellation form with the primary key could not be found
	 */
	public static PharmaCancellationForm findByPrimaryKey(
			long pharmaCancellationFormId)
		throws com.nbp.pharmaceutical.application.form.service.exception.
			NoSuchPharmaCancellationFormException {

		return getPersistence().findByPrimaryKey(pharmaCancellationFormId);
	}

	/**
	 * Returns the pharma cancellation form with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param pharmaCancellationFormId the primary key of the pharma cancellation form
	 * @return the pharma cancellation form, or <code>null</code> if a pharma cancellation form with the primary key could not be found
	 */
	public static PharmaCancellationForm fetchByPrimaryKey(
		long pharmaCancellationFormId) {

		return getPersistence().fetchByPrimaryKey(pharmaCancellationFormId);
	}

	/**
	 * Returns all the pharma cancellation forms.
	 *
	 * @return the pharma cancellation forms
	 */
	public static List<PharmaCancellationForm> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the pharma cancellation forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaCancellationFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma cancellation forms
	 * @param end the upper bound of the range of pharma cancellation forms (not inclusive)
	 * @return the range of pharma cancellation forms
	 */
	public static List<PharmaCancellationForm> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the pharma cancellation forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaCancellationFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma cancellation forms
	 * @param end the upper bound of the range of pharma cancellation forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of pharma cancellation forms
	 */
	public static List<PharmaCancellationForm> findAll(
		int start, int end,
		OrderByComparator<PharmaCancellationForm> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the pharma cancellation forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaCancellationFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma cancellation forms
	 * @param end the upper bound of the range of pharma cancellation forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of pharma cancellation forms
	 */
	public static List<PharmaCancellationForm> findAll(
		int start, int end,
		OrderByComparator<PharmaCancellationForm> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the pharma cancellation forms from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of pharma cancellation forms.
	 *
	 * @return the number of pharma cancellation forms
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static PharmaCancellationFormPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		PharmaCancellationFormPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile PharmaCancellationFormPersistence _persistence;

}