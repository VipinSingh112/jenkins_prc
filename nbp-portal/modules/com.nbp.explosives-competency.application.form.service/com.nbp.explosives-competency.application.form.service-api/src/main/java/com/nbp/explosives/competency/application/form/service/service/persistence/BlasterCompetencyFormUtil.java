/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.explosives.competency.application.form.service.model.BlasterCompetencyForm;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the blaster competency form service. This utility wraps <code>com.nbp.explosives.competency.application.form.service.service.persistence.impl.BlasterCompetencyFormPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BlasterCompetencyFormPersistence
 * @generated
 */
public class BlasterCompetencyFormUtil {

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
	public static void clearCache(BlasterCompetencyForm blasterCompetencyForm) {
		getPersistence().clearCache(blasterCompetencyForm);
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
	public static Map<Serializable, BlasterCompetencyForm> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<BlasterCompetencyForm> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<BlasterCompetencyForm> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<BlasterCompetencyForm> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<BlasterCompetencyForm> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static BlasterCompetencyForm update(
		BlasterCompetencyForm blasterCompetencyForm) {

		return getPersistence().update(blasterCompetencyForm);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static BlasterCompetencyForm update(
		BlasterCompetencyForm blasterCompetencyForm,
		ServiceContext serviceContext) {

		return getPersistence().update(blasterCompetencyForm, serviceContext);
	}

	/**
	 * Returns the blaster competency form where explosivesApplicationId = &#63; or throws a <code>NoSuchBlasterCompetencyFormException</code> if it could not be found.
	 *
	 * @param explosivesApplicationId the explosives application ID
	 * @return the matching blaster competency form
	 * @throws NoSuchBlasterCompetencyFormException if a matching blaster competency form could not be found
	 */
	public static BlasterCompetencyForm findBygetExplosiveById(
			long explosivesApplicationId)
		throws com.nbp.explosives.competency.application.form.service.exception.
			NoSuchBlasterCompetencyFormException {

		return getPersistence().findBygetExplosiveById(explosivesApplicationId);
	}

	/**
	 * Returns the blaster competency form where explosivesApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param explosivesApplicationId the explosives application ID
	 * @return the matching blaster competency form, or <code>null</code> if a matching blaster competency form could not be found
	 */
	public static BlasterCompetencyForm fetchBygetExplosiveById(
		long explosivesApplicationId) {

		return getPersistence().fetchBygetExplosiveById(
			explosivesApplicationId);
	}

	/**
	 * Returns the blaster competency form where explosivesApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param explosivesApplicationId the explosives application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching blaster competency form, or <code>null</code> if a matching blaster competency form could not be found
	 */
	public static BlasterCompetencyForm fetchBygetExplosiveById(
		long explosivesApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetExplosiveById(
			explosivesApplicationId, useFinderCache);
	}

	/**
	 * Removes the blaster competency form where explosivesApplicationId = &#63; from the database.
	 *
	 * @param explosivesApplicationId the explosives application ID
	 * @return the blaster competency form that was removed
	 */
	public static BlasterCompetencyForm removeBygetExplosiveById(
			long explosivesApplicationId)
		throws com.nbp.explosives.competency.application.form.service.exception.
			NoSuchBlasterCompetencyFormException {

		return getPersistence().removeBygetExplosiveById(
			explosivesApplicationId);
	}

	/**
	 * Returns the number of blaster competency forms where explosivesApplicationId = &#63;.
	 *
	 * @param explosivesApplicationId the explosives application ID
	 * @return the number of matching blaster competency forms
	 */
	public static int countBygetExplosiveById(long explosivesApplicationId) {
		return getPersistence().countBygetExplosiveById(
			explosivesApplicationId);
	}

	/**
	 * Caches the blaster competency form in the entity cache if it is enabled.
	 *
	 * @param blasterCompetencyForm the blaster competency form
	 */
	public static void cacheResult(
		BlasterCompetencyForm blasterCompetencyForm) {

		getPersistence().cacheResult(blasterCompetencyForm);
	}

	/**
	 * Caches the blaster competency forms in the entity cache if it is enabled.
	 *
	 * @param blasterCompetencyForms the blaster competency forms
	 */
	public static void cacheResult(
		List<BlasterCompetencyForm> blasterCompetencyForms) {

		getPersistence().cacheResult(blasterCompetencyForms);
	}

	/**
	 * Creates a new blaster competency form with the primary key. Does not add the blaster competency form to the database.
	 *
	 * @param blasterCompetencyFormId the primary key for the new blaster competency form
	 * @return the new blaster competency form
	 */
	public static BlasterCompetencyForm create(long blasterCompetencyFormId) {
		return getPersistence().create(blasterCompetencyFormId);
	}

	/**
	 * Removes the blaster competency form with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param blasterCompetencyFormId the primary key of the blaster competency form
	 * @return the blaster competency form that was removed
	 * @throws NoSuchBlasterCompetencyFormException if a blaster competency form with the primary key could not be found
	 */
	public static BlasterCompetencyForm remove(long blasterCompetencyFormId)
		throws com.nbp.explosives.competency.application.form.service.exception.
			NoSuchBlasterCompetencyFormException {

		return getPersistence().remove(blasterCompetencyFormId);
	}

	public static BlasterCompetencyForm updateImpl(
		BlasterCompetencyForm blasterCompetencyForm) {

		return getPersistence().updateImpl(blasterCompetencyForm);
	}

	/**
	 * Returns the blaster competency form with the primary key or throws a <code>NoSuchBlasterCompetencyFormException</code> if it could not be found.
	 *
	 * @param blasterCompetencyFormId the primary key of the blaster competency form
	 * @return the blaster competency form
	 * @throws NoSuchBlasterCompetencyFormException if a blaster competency form with the primary key could not be found
	 */
	public static BlasterCompetencyForm findByPrimaryKey(
			long blasterCompetencyFormId)
		throws com.nbp.explosives.competency.application.form.service.exception.
			NoSuchBlasterCompetencyFormException {

		return getPersistence().findByPrimaryKey(blasterCompetencyFormId);
	}

	/**
	 * Returns the blaster competency form with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param blasterCompetencyFormId the primary key of the blaster competency form
	 * @return the blaster competency form, or <code>null</code> if a blaster competency form with the primary key could not be found
	 */
	public static BlasterCompetencyForm fetchByPrimaryKey(
		long blasterCompetencyFormId) {

		return getPersistence().fetchByPrimaryKey(blasterCompetencyFormId);
	}

	/**
	 * Returns all the blaster competency forms.
	 *
	 * @return the blaster competency forms
	 */
	public static List<BlasterCompetencyForm> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the blaster competency forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BlasterCompetencyFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of blaster competency forms
	 * @param end the upper bound of the range of blaster competency forms (not inclusive)
	 * @return the range of blaster competency forms
	 */
	public static List<BlasterCompetencyForm> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the blaster competency forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BlasterCompetencyFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of blaster competency forms
	 * @param end the upper bound of the range of blaster competency forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of blaster competency forms
	 */
	public static List<BlasterCompetencyForm> findAll(
		int start, int end,
		OrderByComparator<BlasterCompetencyForm> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the blaster competency forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BlasterCompetencyFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of blaster competency forms
	 * @param end the upper bound of the range of blaster competency forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of blaster competency forms
	 */
	public static List<BlasterCompetencyForm> findAll(
		int start, int end,
		OrderByComparator<BlasterCompetencyForm> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the blaster competency forms from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of blaster competency forms.
	 *
	 * @return the number of blaster competency forms
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static BlasterCompetencyFormPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		BlasterCompetencyFormPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile BlasterCompetencyFormPersistence _persistence;

}