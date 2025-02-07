/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link PyrotechnicCompetencyFormLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see PyrotechnicCompetencyFormLocalService
 * @generated
 */
public class PyrotechnicCompetencyFormLocalServiceWrapper
	implements PyrotechnicCompetencyFormLocalService,
			   ServiceWrapper<PyrotechnicCompetencyFormLocalService> {

	public PyrotechnicCompetencyFormLocalServiceWrapper() {
		this(null);
	}

	public PyrotechnicCompetencyFormLocalServiceWrapper(
		PyrotechnicCompetencyFormLocalService
			pyrotechnicCompetencyFormLocalService) {

		_pyrotechnicCompetencyFormLocalService =
			pyrotechnicCompetencyFormLocalService;
	}

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
	@Override
	public com.nbp.explosives.competency.application.form.service.model.
		PyrotechnicCompetencyForm addPyrotechnicCompetencyForm(
			com.nbp.explosives.competency.application.form.service.model.
				PyrotechnicCompetencyForm pyrotechnicCompetencyForm) {

		return _pyrotechnicCompetencyFormLocalService.
			addPyrotechnicCompetencyForm(pyrotechnicCompetencyForm);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pyrotechnicCompetencyFormLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new pyrotechnic competency form with the primary key. Does not add the pyrotechnic competency form to the database.
	 *
	 * @param pyrotechnicCompetencyFormId the primary key for the new pyrotechnic competency form
	 * @return the new pyrotechnic competency form
	 */
	@Override
	public com.nbp.explosives.competency.application.form.service.model.
		PyrotechnicCompetencyForm createPyrotechnicCompetencyForm(
			long pyrotechnicCompetencyFormId) {

		return _pyrotechnicCompetencyFormLocalService.
			createPyrotechnicCompetencyForm(pyrotechnicCompetencyFormId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pyrotechnicCompetencyFormLocalService.deletePersistedModel(
			persistedModel);
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
	@Override
	public com.nbp.explosives.competency.application.form.service.model.
		PyrotechnicCompetencyForm deletePyrotechnicCompetencyForm(
				long pyrotechnicCompetencyFormId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _pyrotechnicCompetencyFormLocalService.
			deletePyrotechnicCompetencyForm(pyrotechnicCompetencyFormId);
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
	@Override
	public com.nbp.explosives.competency.application.form.service.model.
		PyrotechnicCompetencyForm deletePyrotechnicCompetencyForm(
			com.nbp.explosives.competency.application.form.service.model.
				PyrotechnicCompetencyForm pyrotechnicCompetencyForm) {

		return _pyrotechnicCompetencyFormLocalService.
			deletePyrotechnicCompetencyForm(pyrotechnicCompetencyForm);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _pyrotechnicCompetencyFormLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _pyrotechnicCompetencyFormLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _pyrotechnicCompetencyFormLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _pyrotechnicCompetencyFormLocalService.dynamicQuery(
			dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _pyrotechnicCompetencyFormLocalService.dynamicQuery(
			dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _pyrotechnicCompetencyFormLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _pyrotechnicCompetencyFormLocalService.dynamicQueryCount(
			dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _pyrotechnicCompetencyFormLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.explosives.competency.application.form.service.model.
		PyrotechnicCompetencyForm fetchPyrotechnicCompetencyForm(
			long pyrotechnicCompetencyFormId) {

		return _pyrotechnicCompetencyFormLocalService.
			fetchPyrotechnicCompetencyForm(pyrotechnicCompetencyFormId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _pyrotechnicCompetencyFormLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.nbp.explosives.competency.application.form.service.model.
		PyrotechnicCompetencyForm getExplosiveById(long explosivesApplicationId)
			throws com.nbp.explosives.competency.application.form.service.
				exception.NoSuchPyrotechnicCompetencyFormException {

		return _pyrotechnicCompetencyFormLocalService.getExplosiveById(
			explosivesApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _pyrotechnicCompetencyFormLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _pyrotechnicCompetencyFormLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pyrotechnicCompetencyFormLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Returns the pyrotechnic competency form with the primary key.
	 *
	 * @param pyrotechnicCompetencyFormId the primary key of the pyrotechnic competency form
	 * @return the pyrotechnic competency form
	 * @throws PortalException if a pyrotechnic competency form with the primary key could not be found
	 */
	@Override
	public com.nbp.explosives.competency.application.form.service.model.
		PyrotechnicCompetencyForm getPyrotechnicCompetencyForm(
				long pyrotechnicCompetencyFormId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _pyrotechnicCompetencyFormLocalService.
			getPyrotechnicCompetencyForm(pyrotechnicCompetencyFormId);
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
	@Override
	public java.util.List
		<com.nbp.explosives.competency.application.form.service.model.
			PyrotechnicCompetencyForm> getPyrotechnicCompetencyForms(
				int start, int end) {

		return _pyrotechnicCompetencyFormLocalService.
			getPyrotechnicCompetencyForms(start, end);
	}

	/**
	 * Returns the number of pyrotechnic competency forms.
	 *
	 * @return the number of pyrotechnic competency forms
	 */
	@Override
	public int getPyrotechnicCompetencyFormsCount() {
		return _pyrotechnicCompetencyFormLocalService.
			getPyrotechnicCompetencyFormsCount();
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
	@Override
	public com.nbp.explosives.competency.application.form.service.model.
		PyrotechnicCompetencyForm updatePyrotechnicCompetencyForm(
			com.nbp.explosives.competency.application.form.service.model.
				PyrotechnicCompetencyForm pyrotechnicCompetencyForm) {

		return _pyrotechnicCompetencyFormLocalService.
			updatePyrotechnicCompetencyForm(pyrotechnicCompetencyForm);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _pyrotechnicCompetencyFormLocalService.getBasePersistence();
	}

	@Override
	public PyrotechnicCompetencyFormLocalService getWrappedService() {
		return _pyrotechnicCompetencyFormLocalService;
	}

	@Override
	public void setWrappedService(
		PyrotechnicCompetencyFormLocalService
			pyrotechnicCompetencyFormLocalService) {

		_pyrotechnicCompetencyFormLocalService =
			pyrotechnicCompetencyFormLocalService;
	}

	private PyrotechnicCompetencyFormLocalService
		_pyrotechnicCompetencyFormLocalService;

}