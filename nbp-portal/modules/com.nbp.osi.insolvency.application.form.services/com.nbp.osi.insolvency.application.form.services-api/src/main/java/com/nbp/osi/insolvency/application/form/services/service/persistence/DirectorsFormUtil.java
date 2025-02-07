/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.osi.insolvency.application.form.services.model.DirectorsForm;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the directors form service. This utility wraps <code>com.nbp.osi.insolvency.application.form.services.service.persistence.impl.DirectorsFormPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DirectorsFormPersistence
 * @generated
 */
public class DirectorsFormUtil {

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
	public static void clearCache(DirectorsForm directorsForm) {
		getPersistence().clearCache(directorsForm);
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
	public static Map<Serializable, DirectorsForm> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<DirectorsForm> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DirectorsForm> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DirectorsForm> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<DirectorsForm> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static DirectorsForm update(DirectorsForm directorsForm) {
		return getPersistence().update(directorsForm);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static DirectorsForm update(
		DirectorsForm directorsForm, ServiceContext serviceContext) {

		return getPersistence().update(directorsForm, serviceContext);
	}

	/**
	 * Returns all the directors forms where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching directors forms
	 */
	public static List<DirectorsForm> findBygetOsiById(long osiInsolvencyId) {
		return getPersistence().findBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Returns a range of all the directors forms where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DirectorsFormModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of directors forms
	 * @param end the upper bound of the range of directors forms (not inclusive)
	 * @return the range of matching directors forms
	 */
	public static List<DirectorsForm> findBygetOsiById(
		long osiInsolvencyId, int start, int end) {

		return getPersistence().findBygetOsiById(osiInsolvencyId, start, end);
	}

	/**
	 * Returns an ordered range of all the directors forms where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DirectorsFormModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of directors forms
	 * @param end the upper bound of the range of directors forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching directors forms
	 */
	public static List<DirectorsForm> findBygetOsiById(
		long osiInsolvencyId, int start, int end,
		OrderByComparator<DirectorsForm> orderByComparator) {

		return getPersistence().findBygetOsiById(
			osiInsolvencyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the directors forms where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DirectorsFormModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of directors forms
	 * @param end the upper bound of the range of directors forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching directors forms
	 */
	public static List<DirectorsForm> findBygetOsiById(
		long osiInsolvencyId, int start, int end,
		OrderByComparator<DirectorsForm> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetOsiById(
			osiInsolvencyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first directors form in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching directors form
	 * @throws NoSuchDirectorsFormException if a matching directors form could not be found
	 */
	public static DirectorsForm findBygetOsiById_First(
			long osiInsolvencyId,
			OrderByComparator<DirectorsForm> orderByComparator)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchDirectorsFormException {

		return getPersistence().findBygetOsiById_First(
			osiInsolvencyId, orderByComparator);
	}

	/**
	 * Returns the first directors form in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching directors form, or <code>null</code> if a matching directors form could not be found
	 */
	public static DirectorsForm fetchBygetOsiById_First(
		long osiInsolvencyId,
		OrderByComparator<DirectorsForm> orderByComparator) {

		return getPersistence().fetchBygetOsiById_First(
			osiInsolvencyId, orderByComparator);
	}

	/**
	 * Returns the last directors form in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching directors form
	 * @throws NoSuchDirectorsFormException if a matching directors form could not be found
	 */
	public static DirectorsForm findBygetOsiById_Last(
			long osiInsolvencyId,
			OrderByComparator<DirectorsForm> orderByComparator)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchDirectorsFormException {

		return getPersistence().findBygetOsiById_Last(
			osiInsolvencyId, orderByComparator);
	}

	/**
	 * Returns the last directors form in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching directors form, or <code>null</code> if a matching directors form could not be found
	 */
	public static DirectorsForm fetchBygetOsiById_Last(
		long osiInsolvencyId,
		OrderByComparator<DirectorsForm> orderByComparator) {

		return getPersistence().fetchBygetOsiById_Last(
			osiInsolvencyId, orderByComparator);
	}

	/**
	 * Returns the directors forms before and after the current directors form in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param directorsFormId the primary key of the current directors form
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next directors form
	 * @throws NoSuchDirectorsFormException if a directors form with the primary key could not be found
	 */
	public static DirectorsForm[] findBygetOsiById_PrevAndNext(
			long directorsFormId, long osiInsolvencyId,
			OrderByComparator<DirectorsForm> orderByComparator)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchDirectorsFormException {

		return getPersistence().findBygetOsiById_PrevAndNext(
			directorsFormId, osiInsolvencyId, orderByComparator);
	}

	/**
	 * Removes all the directors forms where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 */
	public static void removeBygetOsiById(long osiInsolvencyId) {
		getPersistence().removeBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Returns the number of directors forms where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching directors forms
	 */
	public static int countBygetOsiById(long osiInsolvencyId) {
		return getPersistence().countBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Caches the directors form in the entity cache if it is enabled.
	 *
	 * @param directorsForm the directors form
	 */
	public static void cacheResult(DirectorsForm directorsForm) {
		getPersistence().cacheResult(directorsForm);
	}

	/**
	 * Caches the directors forms in the entity cache if it is enabled.
	 *
	 * @param directorsForms the directors forms
	 */
	public static void cacheResult(List<DirectorsForm> directorsForms) {
		getPersistence().cacheResult(directorsForms);
	}

	/**
	 * Creates a new directors form with the primary key. Does not add the directors form to the database.
	 *
	 * @param directorsFormId the primary key for the new directors form
	 * @return the new directors form
	 */
	public static DirectorsForm create(long directorsFormId) {
		return getPersistence().create(directorsFormId);
	}

	/**
	 * Removes the directors form with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param directorsFormId the primary key of the directors form
	 * @return the directors form that was removed
	 * @throws NoSuchDirectorsFormException if a directors form with the primary key could not be found
	 */
	public static DirectorsForm remove(long directorsFormId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchDirectorsFormException {

		return getPersistence().remove(directorsFormId);
	}

	public static DirectorsForm updateImpl(DirectorsForm directorsForm) {
		return getPersistence().updateImpl(directorsForm);
	}

	/**
	 * Returns the directors form with the primary key or throws a <code>NoSuchDirectorsFormException</code> if it could not be found.
	 *
	 * @param directorsFormId the primary key of the directors form
	 * @return the directors form
	 * @throws NoSuchDirectorsFormException if a directors form with the primary key could not be found
	 */
	public static DirectorsForm findByPrimaryKey(long directorsFormId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchDirectorsFormException {

		return getPersistence().findByPrimaryKey(directorsFormId);
	}

	/**
	 * Returns the directors form with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param directorsFormId the primary key of the directors form
	 * @return the directors form, or <code>null</code> if a directors form with the primary key could not be found
	 */
	public static DirectorsForm fetchByPrimaryKey(long directorsFormId) {
		return getPersistence().fetchByPrimaryKey(directorsFormId);
	}

	/**
	 * Returns all the directors forms.
	 *
	 * @return the directors forms
	 */
	public static List<DirectorsForm> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the directors forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DirectorsFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of directors forms
	 * @param end the upper bound of the range of directors forms (not inclusive)
	 * @return the range of directors forms
	 */
	public static List<DirectorsForm> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the directors forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DirectorsFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of directors forms
	 * @param end the upper bound of the range of directors forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of directors forms
	 */
	public static List<DirectorsForm> findAll(
		int start, int end,
		OrderByComparator<DirectorsForm> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the directors forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DirectorsFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of directors forms
	 * @param end the upper bound of the range of directors forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of directors forms
	 */
	public static List<DirectorsForm> findAll(
		int start, int end, OrderByComparator<DirectorsForm> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the directors forms from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of directors forms.
	 *
	 * @return the number of directors forms
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static DirectorsFormPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(DirectorsFormPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile DirectorsFormPersistence _persistence;

}