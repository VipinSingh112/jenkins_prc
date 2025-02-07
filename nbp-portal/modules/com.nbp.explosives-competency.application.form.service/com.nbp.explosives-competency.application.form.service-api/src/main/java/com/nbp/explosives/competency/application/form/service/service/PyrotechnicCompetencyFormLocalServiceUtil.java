/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.application.form.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.explosives.competency.application.form.service.model.PyrotechnicCompetencyForm;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for PyrotechnicCompetencyForm. This utility wraps
 * <code>com.nbp.explosives.competency.application.form.service.service.impl.PyrotechnicCompetencyFormLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see PyrotechnicCompetencyFormLocalService
 * @generated
 */
public class PyrotechnicCompetencyFormLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.explosives.competency.application.form.service.service.impl.PyrotechnicCompetencyFormLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the pyrotechnic competency form to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PyrotechnicCompetencyFormLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pyrotechnicCompetencyForm the pyrotechnic competency form
	 * @return the pyrotechnic competency form that was added
	 */
	public static PyrotechnicCompetencyForm addPyrotechnicCompetencyForm(
		PyrotechnicCompetencyForm pyrotechnicCompetencyForm) {

		return getService().addPyrotechnicCompetencyForm(
			pyrotechnicCompetencyForm);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new pyrotechnic competency form with the primary key. Does not add the pyrotechnic competency form to the database.
	 *
	 * @param pyrotechnicCompetencyFormId the primary key for the new pyrotechnic competency form
	 * @return the new pyrotechnic competency form
	 */
	public static PyrotechnicCompetencyForm createPyrotechnicCompetencyForm(
		long pyrotechnicCompetencyFormId) {

		return getService().createPyrotechnicCompetencyForm(
			pyrotechnicCompetencyFormId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the pyrotechnic competency form with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PyrotechnicCompetencyFormLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pyrotechnicCompetencyFormId the primary key of the pyrotechnic competency form
	 * @return the pyrotechnic competency form that was removed
	 * @throws PortalException if a pyrotechnic competency form with the primary key could not be found
	 */
	public static PyrotechnicCompetencyForm deletePyrotechnicCompetencyForm(
			long pyrotechnicCompetencyFormId)
		throws PortalException {

		return getService().deletePyrotechnicCompetencyForm(
			pyrotechnicCompetencyFormId);
	}

	/**
	 * Deletes the pyrotechnic competency form from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PyrotechnicCompetencyFormLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pyrotechnicCompetencyForm the pyrotechnic competency form
	 * @return the pyrotechnic competency form that was removed
	 */
	public static PyrotechnicCompetencyForm deletePyrotechnicCompetencyForm(
		PyrotechnicCompetencyForm pyrotechnicCompetencyForm) {

		return getService().deletePyrotechnicCompetencyForm(
			pyrotechnicCompetencyForm);
	}

	public static <T> T dslQuery(DSLQuery dslQuery) {
		return getService().dslQuery(dslQuery);
	}

	public static int dslQueryCount(DSLQuery dslQuery) {
		return getService().dslQueryCount(dslQuery);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.explosives.competency.application.form.service.model.impl.PyrotechnicCompetencyFormModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.explosives.competency.application.form.service.model.impl.PyrotechnicCompetencyFormModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static PyrotechnicCompetencyForm fetchPyrotechnicCompetencyForm(
		long pyrotechnicCompetencyFormId) {

		return getService().fetchPyrotechnicCompetencyForm(
			pyrotechnicCompetencyFormId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static PyrotechnicCompetencyForm getExplosiveById(
			long explosivesApplicationId)
		throws com.nbp.explosives.competency.application.form.service.exception.
			NoSuchPyrotechnicCompetencyFormException {

		return getService().getExplosiveById(explosivesApplicationId);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the pyrotechnic competency form with the primary key.
	 *
	 * @param pyrotechnicCompetencyFormId the primary key of the pyrotechnic competency form
	 * @return the pyrotechnic competency form
	 * @throws PortalException if a pyrotechnic competency form with the primary key could not be found
	 */
	public static PyrotechnicCompetencyForm getPyrotechnicCompetencyForm(
			long pyrotechnicCompetencyFormId)
		throws PortalException {

		return getService().getPyrotechnicCompetencyForm(
			pyrotechnicCompetencyFormId);
	}

	/**
	 * Returns a range of all the pyrotechnic competency forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.explosives.competency.application.form.service.model.impl.PyrotechnicCompetencyFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pyrotechnic competency forms
	 * @param end the upper bound of the range of pyrotechnic competency forms (not inclusive)
	 * @return the range of pyrotechnic competency forms
	 */
	public static List<PyrotechnicCompetencyForm> getPyrotechnicCompetencyForms(
		int start, int end) {

		return getService().getPyrotechnicCompetencyForms(start, end);
	}

	/**
	 * Returns the number of pyrotechnic competency forms.
	 *
	 * @return the number of pyrotechnic competency forms
	 */
	public static int getPyrotechnicCompetencyFormsCount() {
		return getService().getPyrotechnicCompetencyFormsCount();
	}

	/**
	 * Updates the pyrotechnic competency form in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PyrotechnicCompetencyFormLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pyrotechnicCompetencyForm the pyrotechnic competency form
	 * @return the pyrotechnic competency form that was updated
	 */
	public static PyrotechnicCompetencyForm updatePyrotechnicCompetencyForm(
		PyrotechnicCompetencyForm pyrotechnicCompetencyForm) {

		return getService().updatePyrotechnicCompetencyForm(
			pyrotechnicCompetencyForm);
	}

	public static PyrotechnicCompetencyFormLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<PyrotechnicCompetencyFormLocalService>
		_serviceSnapshot = new Snapshot<>(
			PyrotechnicCompetencyFormLocalServiceUtil.class,
			PyrotechnicCompetencyFormLocalService.class);

}