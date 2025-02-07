/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.explosives.competency.application.form.service.model.PyrotechnicCompetencyForm;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the pyrotechnic competency form service. This utility wraps <code>com.nbp.explosives.competency.application.form.service.service.persistence.impl.PyrotechnicCompetencyFormPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PyrotechnicCompetencyFormPersistence
 * @generated
 */
public class PyrotechnicCompetencyFormUtil {

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
		PyrotechnicCompetencyForm pyrotechnicCompetencyForm) {

		getPersistence().clearCache(pyrotechnicCompetencyForm);
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
	public static Map<Serializable, PyrotechnicCompetencyForm>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<PyrotechnicCompetencyForm> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<PyrotechnicCompetencyForm> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<PyrotechnicCompetencyForm> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<PyrotechnicCompetencyForm> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static PyrotechnicCompetencyForm update(
		PyrotechnicCompetencyForm pyrotechnicCompetencyForm) {

		return getPersistence().update(pyrotechnicCompetencyForm);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static PyrotechnicCompetencyForm update(
		PyrotechnicCompetencyForm pyrotechnicCompetencyForm,
		ServiceContext serviceContext) {

		return getPersistence().update(
			pyrotechnicCompetencyForm, serviceContext);
	}

	/**
	 * Returns the pyrotechnic competency form where explosivesApplicationId = &#63; or throws a <code>NoSuchPyrotechnicCompetencyFormException</code> if it could not be found.
	 *
	 * @param explosivesApplicationId the explosives application ID
	 * @return the matching pyrotechnic competency form
	 * @throws NoSuchPyrotechnicCompetencyFormException if a matching pyrotechnic competency form could not be found
	 */
	public static PyrotechnicCompetencyForm findBygetExplosiveById(
			long explosivesApplicationId)
		throws com.nbp.explosives.competency.application.form.service.exception.
			NoSuchPyrotechnicCompetencyFormException {

		return getPersistence().findBygetExplosiveById(explosivesApplicationId);
	}

	/**
	 * Returns the pyrotechnic competency form where explosivesApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param explosivesApplicationId the explosives application ID
	 * @return the matching pyrotechnic competency form, or <code>null</code> if a matching pyrotechnic competency form could not be found
	 */
	public static PyrotechnicCompetencyForm fetchBygetExplosiveById(
		long explosivesApplicationId) {

		return getPersistence().fetchBygetExplosiveById(
			explosivesApplicationId);
	}

	/**
	 * Returns the pyrotechnic competency form where explosivesApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param explosivesApplicationId the explosives application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching pyrotechnic competency form, or <code>null</code> if a matching pyrotechnic competency form could not be found
	 */
	public static PyrotechnicCompetencyForm fetchBygetExplosiveById(
		long explosivesApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetExplosiveById(
			explosivesApplicationId, useFinderCache);
	}

	/**
	 * Removes the pyrotechnic competency form where explosivesApplicationId = &#63; from the database.
	 *
	 * @param explosivesApplicationId the explosives application ID
	 * @return the pyrotechnic competency form that was removed
	 */
	public static PyrotechnicCompetencyForm removeBygetExplosiveById(
			long explosivesApplicationId)
		throws com.nbp.explosives.competency.application.form.service.exception.
			NoSuchPyrotechnicCompetencyFormException {

		return getPersistence().removeBygetExplosiveById(
			explosivesApplicationId);
	}

	/**
	 * Returns the number of pyrotechnic competency forms where explosivesApplicationId = &#63;.
	 *
	 * @param explosivesApplicationId the explosives application ID
	 * @return the number of matching pyrotechnic competency forms
	 */
	public static int countBygetExplosiveById(long explosivesApplicationId) {
		return getPersistence().countBygetExplosiveById(
			explosivesApplicationId);
	}

	/**
	 * Caches the pyrotechnic competency form in the entity cache if it is enabled.
	 *
	 * @param pyrotechnicCompetencyForm the pyrotechnic competency form
	 */
	public static void cacheResult(
		PyrotechnicCompetencyForm pyrotechnicCompetencyForm) {

		getPersistence().cacheResult(pyrotechnicCompetencyForm);
	}

	/**
	 * Caches the pyrotechnic competency forms in the entity cache if it is enabled.
	 *
	 * @param pyrotechnicCompetencyForms the pyrotechnic competency forms
	 */
	public static void cacheResult(
		List<PyrotechnicCompetencyForm> pyrotechnicCompetencyForms) {

		getPersistence().cacheResult(pyrotechnicCompetencyForms);
	}

	/**
	 * Creates a new pyrotechnic competency form with the primary key. Does not add the pyrotechnic competency form to the database.
	 *
	 * @param pyrotechnicCompetencyFormId the primary key for the new pyrotechnic competency form
	 * @return the new pyrotechnic competency form
	 */
	public static PyrotechnicCompetencyForm create(
		long pyrotechnicCompetencyFormId) {

		return getPersistence().create(pyrotechnicCompetencyFormId);
	}

	/**
	 * Removes the pyrotechnic competency form with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param pyrotechnicCompetencyFormId the primary key of the pyrotechnic competency form
	 * @return the pyrotechnic competency form that was removed
	 * @throws NoSuchPyrotechnicCompetencyFormException if a pyrotechnic competency form with the primary key could not be found
	 */
	public static PyrotechnicCompetencyForm remove(
			long pyrotechnicCompetencyFormId)
		throws com.nbp.explosives.competency.application.form.service.exception.
			NoSuchPyrotechnicCompetencyFormException {

		return getPersistence().remove(pyrotechnicCompetencyFormId);
	}

	public static PyrotechnicCompetencyForm updateImpl(
		PyrotechnicCompetencyForm pyrotechnicCompetencyForm) {

		return getPersistence().updateImpl(pyrotechnicCompetencyForm);
	}

	/**
	 * Returns the pyrotechnic competency form with the primary key or throws a <code>NoSuchPyrotechnicCompetencyFormException</code> if it could not be found.
	 *
	 * @param pyrotechnicCompetencyFormId the primary key of the pyrotechnic competency form
	 * @return the pyrotechnic competency form
	 * @throws NoSuchPyrotechnicCompetencyFormException if a pyrotechnic competency form with the primary key could not be found
	 */
	public static PyrotechnicCompetencyForm findByPrimaryKey(
			long pyrotechnicCompetencyFormId)
		throws com.nbp.explosives.competency.application.form.service.exception.
			NoSuchPyrotechnicCompetencyFormException {

		return getPersistence().findByPrimaryKey(pyrotechnicCompetencyFormId);
	}

	/**
	 * Returns the pyrotechnic competency form with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param pyrotechnicCompetencyFormId the primary key of the pyrotechnic competency form
	 * @return the pyrotechnic competency form, or <code>null</code> if a pyrotechnic competency form with the primary key could not be found
	 */
	public static PyrotechnicCompetencyForm fetchByPrimaryKey(
		long pyrotechnicCompetencyFormId) {

		return getPersistence().fetchByPrimaryKey(pyrotechnicCompetencyFormId);
	}

	/**
	 * Returns all the pyrotechnic competency forms.
	 *
	 * @return the pyrotechnic competency forms
	 */
	public static List<PyrotechnicCompetencyForm> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the pyrotechnic competency forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PyrotechnicCompetencyFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pyrotechnic competency forms
	 * @param end the upper bound of the range of pyrotechnic competency forms (not inclusive)
	 * @return the range of pyrotechnic competency forms
	 */
	public static List<PyrotechnicCompetencyForm> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the pyrotechnic competency forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PyrotechnicCompetencyFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pyrotechnic competency forms
	 * @param end the upper bound of the range of pyrotechnic competency forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of pyrotechnic competency forms
	 */
	public static List<PyrotechnicCompetencyForm> findAll(
		int start, int end,
		OrderByComparator<PyrotechnicCompetencyForm> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the pyrotechnic competency forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PyrotechnicCompetencyFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pyrotechnic competency forms
	 * @param end the upper bound of the range of pyrotechnic competency forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of pyrotechnic competency forms
	 */
	public static List<PyrotechnicCompetencyForm> findAll(
		int start, int end,
		OrderByComparator<PyrotechnicCompetencyForm> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the pyrotechnic competency forms from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of pyrotechnic competency forms.
	 *
	 * @return the number of pyrotechnic competency forms
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static PyrotechnicCompetencyFormPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		PyrotechnicCompetencyFormPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile PyrotechnicCompetencyFormPersistence _persistence;

}