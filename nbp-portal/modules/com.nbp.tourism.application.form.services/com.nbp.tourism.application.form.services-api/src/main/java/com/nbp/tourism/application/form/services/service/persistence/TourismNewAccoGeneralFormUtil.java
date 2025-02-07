/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.tourism.application.form.services.model.TourismNewAccoGeneralForm;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the tourism new acco general form service. This utility wraps <code>com.nbp.tourism.application.form.services.service.persistence.impl.TourismNewAccoGeneralFormPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewAccoGeneralFormPersistence
 * @generated
 */
public class TourismNewAccoGeneralFormUtil {

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
		TourismNewAccoGeneralForm tourismNewAccoGeneralForm) {

		getPersistence().clearCache(tourismNewAccoGeneralForm);
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
	public static Map<Serializable, TourismNewAccoGeneralForm>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<TourismNewAccoGeneralForm> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TourismNewAccoGeneralForm> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TourismNewAccoGeneralForm> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<TourismNewAccoGeneralForm> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static TourismNewAccoGeneralForm update(
		TourismNewAccoGeneralForm tourismNewAccoGeneralForm) {

		return getPersistence().update(tourismNewAccoGeneralForm);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static TourismNewAccoGeneralForm update(
		TourismNewAccoGeneralForm tourismNewAccoGeneralForm,
		ServiceContext serviceContext) {

		return getPersistence().update(
			tourismNewAccoGeneralForm, serviceContext);
	}

	/**
	 * Returns the tourism new acco general form where tourismApplicationId = &#63; or throws a <code>NoSuchTourismNewAccoGeneralFormException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism new acco general form
	 * @throws NoSuchTourismNewAccoGeneralFormException if a matching tourism new acco general form could not be found
	 */
	public static TourismNewAccoGeneralForm findBygetTourismById(
			long tourismApplicationId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismNewAccoGeneralFormException {

		return getPersistence().findBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the tourism new acco general form where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism new acco general form, or <code>null</code> if a matching tourism new acco general form could not be found
	 */
	public static TourismNewAccoGeneralForm fetchBygetTourismById(
		long tourismApplicationId) {

		return getPersistence().fetchBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the tourism new acco general form where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism new acco general form, or <code>null</code> if a matching tourism new acco general form could not be found
	 */
	public static TourismNewAccoGeneralForm fetchBygetTourismById(
		long tourismApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetTourismById(
			tourismApplicationId, useFinderCache);
	}

	/**
	 * Removes the tourism new acco general form where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism new acco general form that was removed
	 */
	public static TourismNewAccoGeneralForm removeBygetTourismById(
			long tourismApplicationId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismNewAccoGeneralFormException {

		return getPersistence().removeBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the number of tourism new acco general forms where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism new acco general forms
	 */
	public static int countBygetTourismById(long tourismApplicationId) {
		return getPersistence().countBygetTourismById(tourismApplicationId);
	}

	/**
	 * Caches the tourism new acco general form in the entity cache if it is enabled.
	 *
	 * @param tourismNewAccoGeneralForm the tourism new acco general form
	 */
	public static void cacheResult(
		TourismNewAccoGeneralForm tourismNewAccoGeneralForm) {

		getPersistence().cacheResult(tourismNewAccoGeneralForm);
	}

	/**
	 * Caches the tourism new acco general forms in the entity cache if it is enabled.
	 *
	 * @param tourismNewAccoGeneralForms the tourism new acco general forms
	 */
	public static void cacheResult(
		List<TourismNewAccoGeneralForm> tourismNewAccoGeneralForms) {

		getPersistence().cacheResult(tourismNewAccoGeneralForms);
	}

	/**
	 * Creates a new tourism new acco general form with the primary key. Does not add the tourism new acco general form to the database.
	 *
	 * @param tourismNewAccoGenFormId the primary key for the new tourism new acco general form
	 * @return the new tourism new acco general form
	 */
	public static TourismNewAccoGeneralForm create(
		long tourismNewAccoGenFormId) {

		return getPersistence().create(tourismNewAccoGenFormId);
	}

	/**
	 * Removes the tourism new acco general form with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismNewAccoGenFormId the primary key of the tourism new acco general form
	 * @return the tourism new acco general form that was removed
	 * @throws NoSuchTourismNewAccoGeneralFormException if a tourism new acco general form with the primary key could not be found
	 */
	public static TourismNewAccoGeneralForm remove(long tourismNewAccoGenFormId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismNewAccoGeneralFormException {

		return getPersistence().remove(tourismNewAccoGenFormId);
	}

	public static TourismNewAccoGeneralForm updateImpl(
		TourismNewAccoGeneralForm tourismNewAccoGeneralForm) {

		return getPersistence().updateImpl(tourismNewAccoGeneralForm);
	}

	/**
	 * Returns the tourism new acco general form with the primary key or throws a <code>NoSuchTourismNewAccoGeneralFormException</code> if it could not be found.
	 *
	 * @param tourismNewAccoGenFormId the primary key of the tourism new acco general form
	 * @return the tourism new acco general form
	 * @throws NoSuchTourismNewAccoGeneralFormException if a tourism new acco general form with the primary key could not be found
	 */
	public static TourismNewAccoGeneralForm findByPrimaryKey(
			long tourismNewAccoGenFormId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismNewAccoGeneralFormException {

		return getPersistence().findByPrimaryKey(tourismNewAccoGenFormId);
	}

	/**
	 * Returns the tourism new acco general form with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismNewAccoGenFormId the primary key of the tourism new acco general form
	 * @return the tourism new acco general form, or <code>null</code> if a tourism new acco general form with the primary key could not be found
	 */
	public static TourismNewAccoGeneralForm fetchByPrimaryKey(
		long tourismNewAccoGenFormId) {

		return getPersistence().fetchByPrimaryKey(tourismNewAccoGenFormId);
	}

	/**
	 * Returns all the tourism new acco general forms.
	 *
	 * @return the tourism new acco general forms
	 */
	public static List<TourismNewAccoGeneralForm> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the tourism new acco general forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAccoGeneralFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new acco general forms
	 * @param end the upper bound of the range of tourism new acco general forms (not inclusive)
	 * @return the range of tourism new acco general forms
	 */
	public static List<TourismNewAccoGeneralForm> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the tourism new acco general forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAccoGeneralFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new acco general forms
	 * @param end the upper bound of the range of tourism new acco general forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism new acco general forms
	 */
	public static List<TourismNewAccoGeneralForm> findAll(
		int start, int end,
		OrderByComparator<TourismNewAccoGeneralForm> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the tourism new acco general forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAccoGeneralFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new acco general forms
	 * @param end the upper bound of the range of tourism new acco general forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism new acco general forms
	 */
	public static List<TourismNewAccoGeneralForm> findAll(
		int start, int end,
		OrderByComparator<TourismNewAccoGeneralForm> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the tourism new acco general forms from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of tourism new acco general forms.
	 *
	 * @return the number of tourism new acco general forms
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static TourismNewAccoGeneralFormPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		TourismNewAccoGeneralFormPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile TourismNewAccoGeneralFormPersistence _persistence;

}