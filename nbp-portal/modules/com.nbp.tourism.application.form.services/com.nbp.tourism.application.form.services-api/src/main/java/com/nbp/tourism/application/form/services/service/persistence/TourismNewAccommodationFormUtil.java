/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.tourism.application.form.services.model.TourismNewAccommodationForm;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the tourism new accommodation form service. This utility wraps <code>com.nbp.tourism.application.form.services.service.persistence.impl.TourismNewAccommodationFormPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewAccommodationFormPersistence
 * @generated
 */
public class TourismNewAccommodationFormUtil {

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
		TourismNewAccommodationForm tourismNewAccommodationForm) {

		getPersistence().clearCache(tourismNewAccommodationForm);
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
	public static Map<Serializable, TourismNewAccommodationForm>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<TourismNewAccommodationForm> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TourismNewAccommodationForm> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TourismNewAccommodationForm> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<TourismNewAccommodationForm> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static TourismNewAccommodationForm update(
		TourismNewAccommodationForm tourismNewAccommodationForm) {

		return getPersistence().update(tourismNewAccommodationForm);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static TourismNewAccommodationForm update(
		TourismNewAccommodationForm tourismNewAccommodationForm,
		ServiceContext serviceContext) {

		return getPersistence().update(
			tourismNewAccommodationForm, serviceContext);
	}

	/**
	 * Returns the tourism new accommodation form where tourismApplicationId = &#63; or throws a <code>NoSuchTourismNewAccommodationFormException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism new accommodation form
	 * @throws NoSuchTourismNewAccommodationFormException if a matching tourism new accommodation form could not be found
	 */
	public static TourismNewAccommodationForm findBygetTourismById(
			long tourismApplicationId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismNewAccommodationFormException {

		return getPersistence().findBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the tourism new accommodation form where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism new accommodation form, or <code>null</code> if a matching tourism new accommodation form could not be found
	 */
	public static TourismNewAccommodationForm fetchBygetTourismById(
		long tourismApplicationId) {

		return getPersistence().fetchBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the tourism new accommodation form where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism new accommodation form, or <code>null</code> if a matching tourism new accommodation form could not be found
	 */
	public static TourismNewAccommodationForm fetchBygetTourismById(
		long tourismApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetTourismById(
			tourismApplicationId, useFinderCache);
	}

	/**
	 * Removes the tourism new accommodation form where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism new accommodation form that was removed
	 */
	public static TourismNewAccommodationForm removeBygetTourismById(
			long tourismApplicationId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismNewAccommodationFormException {

		return getPersistence().removeBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the number of tourism new accommodation forms where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism new accommodation forms
	 */
	public static int countBygetTourismById(long tourismApplicationId) {
		return getPersistence().countBygetTourismById(tourismApplicationId);
	}

	/**
	 * Caches the tourism new accommodation form in the entity cache if it is enabled.
	 *
	 * @param tourismNewAccommodationForm the tourism new accommodation form
	 */
	public static void cacheResult(
		TourismNewAccommodationForm tourismNewAccommodationForm) {

		getPersistence().cacheResult(tourismNewAccommodationForm);
	}

	/**
	 * Caches the tourism new accommodation forms in the entity cache if it is enabled.
	 *
	 * @param tourismNewAccommodationForms the tourism new accommodation forms
	 */
	public static void cacheResult(
		List<TourismNewAccommodationForm> tourismNewAccommodationForms) {

		getPersistence().cacheResult(tourismNewAccommodationForms);
	}

	/**
	 * Creates a new tourism new accommodation form with the primary key. Does not add the tourism new accommodation form to the database.
	 *
	 * @param tourismNewAccoFormId the primary key for the new tourism new accommodation form
	 * @return the new tourism new accommodation form
	 */
	public static TourismNewAccommodationForm create(
		long tourismNewAccoFormId) {

		return getPersistence().create(tourismNewAccoFormId);
	}

	/**
	 * Removes the tourism new accommodation form with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismNewAccoFormId the primary key of the tourism new accommodation form
	 * @return the tourism new accommodation form that was removed
	 * @throws NoSuchTourismNewAccommodationFormException if a tourism new accommodation form with the primary key could not be found
	 */
	public static TourismNewAccommodationForm remove(long tourismNewAccoFormId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismNewAccommodationFormException {

		return getPersistence().remove(tourismNewAccoFormId);
	}

	public static TourismNewAccommodationForm updateImpl(
		TourismNewAccommodationForm tourismNewAccommodationForm) {

		return getPersistence().updateImpl(tourismNewAccommodationForm);
	}

	/**
	 * Returns the tourism new accommodation form with the primary key or throws a <code>NoSuchTourismNewAccommodationFormException</code> if it could not be found.
	 *
	 * @param tourismNewAccoFormId the primary key of the tourism new accommodation form
	 * @return the tourism new accommodation form
	 * @throws NoSuchTourismNewAccommodationFormException if a tourism new accommodation form with the primary key could not be found
	 */
	public static TourismNewAccommodationForm findByPrimaryKey(
			long tourismNewAccoFormId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismNewAccommodationFormException {

		return getPersistence().findByPrimaryKey(tourismNewAccoFormId);
	}

	/**
	 * Returns the tourism new accommodation form with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismNewAccoFormId the primary key of the tourism new accommodation form
	 * @return the tourism new accommodation form, or <code>null</code> if a tourism new accommodation form with the primary key could not be found
	 */
	public static TourismNewAccommodationForm fetchByPrimaryKey(
		long tourismNewAccoFormId) {

		return getPersistence().fetchByPrimaryKey(tourismNewAccoFormId);
	}

	/**
	 * Returns all the tourism new accommodation forms.
	 *
	 * @return the tourism new accommodation forms
	 */
	public static List<TourismNewAccommodationForm> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the tourism new accommodation forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAccommodationFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new accommodation forms
	 * @param end the upper bound of the range of tourism new accommodation forms (not inclusive)
	 * @return the range of tourism new accommodation forms
	 */
	public static List<TourismNewAccommodationForm> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the tourism new accommodation forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAccommodationFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new accommodation forms
	 * @param end the upper bound of the range of tourism new accommodation forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism new accommodation forms
	 */
	public static List<TourismNewAccommodationForm> findAll(
		int start, int end,
		OrderByComparator<TourismNewAccommodationForm> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the tourism new accommodation forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAccommodationFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new accommodation forms
	 * @param end the upper bound of the range of tourism new accommodation forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism new accommodation forms
	 */
	public static List<TourismNewAccommodationForm> findAll(
		int start, int end,
		OrderByComparator<TourismNewAccommodationForm> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the tourism new accommodation forms from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of tourism new accommodation forms.
	 *
	 * @return the number of tourism new accommodation forms
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static TourismNewAccommodationFormPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		TourismNewAccommodationFormPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile TourismNewAccommodationFormPersistence _persistence;

}