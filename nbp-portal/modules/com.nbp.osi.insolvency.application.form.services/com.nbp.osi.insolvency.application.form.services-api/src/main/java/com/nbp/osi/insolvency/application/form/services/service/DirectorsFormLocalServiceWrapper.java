/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link DirectorsFormLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see DirectorsFormLocalService
 * @generated
 */
public class DirectorsFormLocalServiceWrapper
	implements DirectorsFormLocalService,
			   ServiceWrapper<DirectorsFormLocalService> {

	public DirectorsFormLocalServiceWrapper() {
		this(null);
	}

	public DirectorsFormLocalServiceWrapper(
		DirectorsFormLocalService directorsFormLocalService) {

		_directorsFormLocalService = directorsFormLocalService;
	}

	/**
	 * Adds the directors form to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DirectorsFormLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param directorsForm the directors form
	 * @return the directors form that was added
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.DirectorsForm
		addDirectorsForm(
			com.nbp.osi.insolvency.application.form.services.model.DirectorsForm
				directorsForm) {

		return _directorsFormLocalService.addDirectorsForm(directorsForm);
	}

	/**
	 * Creates a new directors form with the primary key. Does not add the directors form to the database.
	 *
	 * @param directorsFormId the primary key for the new directors form
	 * @return the new directors form
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.DirectorsForm
		createDirectorsForm(long directorsFormId) {

		return _directorsFormLocalService.createDirectorsForm(directorsFormId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _directorsFormLocalService.createPersistedModel(primaryKeyObj);
	}

	@Override
	public void deleteBY_Id(long applicationId) {
		_directorsFormLocalService.deleteBY_Id(applicationId);
	}

	/**
	 * Deletes the directors form from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DirectorsFormLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param directorsForm the directors form
	 * @return the directors form that was removed
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.DirectorsForm
		deleteDirectorsForm(
			com.nbp.osi.insolvency.application.form.services.model.DirectorsForm
				directorsForm) {

		return _directorsFormLocalService.deleteDirectorsForm(directorsForm);
	}

	/**
	 * Deletes the directors form with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DirectorsFormLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param directorsFormId the primary key of the directors form
	 * @return the directors form that was removed
	 * @throws PortalException if a directors form with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.DirectorsForm
			deleteDirectorsForm(long directorsFormId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _directorsFormLocalService.deleteDirectorsForm(directorsFormId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _directorsFormLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _directorsFormLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _directorsFormLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _directorsFormLocalService.dynamicQuery();
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

		return _directorsFormLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.DirectorsFormModelImpl</code>.
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

		return _directorsFormLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.DirectorsFormModelImpl</code>.
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

		return _directorsFormLocalService.dynamicQuery(
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

		return _directorsFormLocalService.dynamicQueryCount(dynamicQuery);
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

		return _directorsFormLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.osi.insolvency.application.form.services.model.DirectorsForm
		fetchDirectorsForm(long directorsFormId) {

		return _directorsFormLocalService.fetchDirectorsForm(directorsFormId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _directorsFormLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the directors form with the primary key.
	 *
	 * @param directorsFormId the primary key of the directors form
	 * @return the directors form
	 * @throws PortalException if a directors form with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.DirectorsForm
			getDirectorsForm(long directorsFormId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _directorsFormLocalService.getDirectorsForm(directorsFormId);
	}

	/**
	 * Returns a range of all the directors forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.DirectorsFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of directors forms
	 * @param end the upper bound of the range of directors forms (not inclusive)
	 * @return the range of directors forms
	 */
	@Override
	public java.util.List
		<com.nbp.osi.insolvency.application.form.services.model.DirectorsForm>
			getDirectorsForms(int start, int end) {

		return _directorsFormLocalService.getDirectorsForms(start, end);
	}

	/**
	 * Returns the number of directors forms.
	 *
	 * @return the number of directors forms
	 */
	@Override
	public int getDirectorsFormsCount() {
		return _directorsFormLocalService.getDirectorsFormsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _directorsFormLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _directorsFormLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public java.util.List
		<com.nbp.osi.insolvency.application.form.services.model.DirectorsForm>
				getOsiById(long osiInsolvencyId)
			throws com.nbp.osi.insolvency.application.form.services.exception.
				NoSuchDirectorsFormException {

		return _directorsFormLocalService.getOsiById(osiInsolvencyId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _directorsFormLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the directors form in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DirectorsFormLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param directorsForm the directors form
	 * @return the directors form that was updated
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.DirectorsForm
		updateDirectorsForm(
			com.nbp.osi.insolvency.application.form.services.model.DirectorsForm
				directorsForm) {

		return _directorsFormLocalService.updateDirectorsForm(directorsForm);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _directorsFormLocalService.getBasePersistence();
	}

	@Override
	public DirectorsFormLocalService getWrappedService() {
		return _directorsFormLocalService;
	}

	@Override
	public void setWrappedService(
		DirectorsFormLocalService directorsFormLocalService) {

		_directorsFormLocalService = directorsFormLocalService;
	}

	private DirectorsFormLocalService _directorsFormLocalService;

}