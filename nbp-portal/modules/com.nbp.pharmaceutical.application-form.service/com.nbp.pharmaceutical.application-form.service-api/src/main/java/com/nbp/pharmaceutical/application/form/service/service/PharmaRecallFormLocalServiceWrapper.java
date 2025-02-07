/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link PharmaRecallFormLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see PharmaRecallFormLocalService
 * @generated
 */
public class PharmaRecallFormLocalServiceWrapper
	implements PharmaRecallFormLocalService,
			   ServiceWrapper<PharmaRecallFormLocalService> {

	public PharmaRecallFormLocalServiceWrapper() {
		this(null);
	}

	public PharmaRecallFormLocalServiceWrapper(
		PharmaRecallFormLocalService pharmaRecallFormLocalService) {

		_pharmaRecallFormLocalService = pharmaRecallFormLocalService;
	}

	/**
	 * Adds the pharma recall form to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaRecallFormLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaRecallForm the pharma recall form
	 * @return the pharma recall form that was added
	 */
	@Override
	public
		com.nbp.pharmaceutical.application.form.service.model.PharmaRecallForm
			addPharmaRecallForm(
				com.nbp.pharmaceutical.application.form.service.model.
					PharmaRecallForm pharmaRecallForm) {

		return _pharmaRecallFormLocalService.addPharmaRecallForm(
			pharmaRecallForm);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pharmaRecallFormLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new pharma recall form with the primary key. Does not add the pharma recall form to the database.
	 *
	 * @param pharmaRecallFormId the primary key for the new pharma recall form
	 * @return the new pharma recall form
	 */
	@Override
	public
		com.nbp.pharmaceutical.application.form.service.model.PharmaRecallForm
			createPharmaRecallForm(long pharmaRecallFormId) {

		return _pharmaRecallFormLocalService.createPharmaRecallForm(
			pharmaRecallFormId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pharmaRecallFormLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the pharma recall form with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaRecallFormLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaRecallFormId the primary key of the pharma recall form
	 * @return the pharma recall form that was removed
	 * @throws PortalException if a pharma recall form with the primary key could not be found
	 */
	@Override
	public
		com.nbp.pharmaceutical.application.form.service.model.PharmaRecallForm
				deletePharmaRecallForm(long pharmaRecallFormId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _pharmaRecallFormLocalService.deletePharmaRecallForm(
			pharmaRecallFormId);
	}

	/**
	 * Deletes the pharma recall form from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaRecallFormLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaRecallForm the pharma recall form
	 * @return the pharma recall form that was removed
	 */
	@Override
	public
		com.nbp.pharmaceutical.application.form.service.model.PharmaRecallForm
			deletePharmaRecallForm(
				com.nbp.pharmaceutical.application.form.service.model.
					PharmaRecallForm pharmaRecallForm) {

		return _pharmaRecallFormLocalService.deletePharmaRecallForm(
			pharmaRecallForm);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _pharmaRecallFormLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _pharmaRecallFormLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _pharmaRecallFormLocalService.dynamicQuery();
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

		return _pharmaRecallFormLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.pharmaceutical.application.form.service.model.impl.PharmaRecallFormModelImpl</code>.
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

		return _pharmaRecallFormLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.pharmaceutical.application.form.service.model.impl.PharmaRecallFormModelImpl</code>.
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

		return _pharmaRecallFormLocalService.dynamicQuery(
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

		return _pharmaRecallFormLocalService.dynamicQueryCount(dynamicQuery);
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

		return _pharmaRecallFormLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.pharmaceutical.application.form.service.model.PharmaRecallForm
			fetchPharmaRecallForm(long pharmaRecallFormId) {

		return _pharmaRecallFormLocalService.fetchPharmaRecallForm(
			pharmaRecallFormId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _pharmaRecallFormLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _pharmaRecallFormLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _pharmaRecallFormLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pharmaRecallFormLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the pharma recall form with the primary key.
	 *
	 * @param pharmaRecallFormId the primary key of the pharma recall form
	 * @return the pharma recall form
	 * @throws PortalException if a pharma recall form with the primary key could not be found
	 */
	@Override
	public
		com.nbp.pharmaceutical.application.form.service.model.PharmaRecallForm
				getPharmaRecallForm(long pharmaRecallFormId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _pharmaRecallFormLocalService.getPharmaRecallForm(
			pharmaRecallFormId);
	}

	/**
	 * Returns a range of all the pharma recall forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.pharmaceutical.application.form.service.model.impl.PharmaRecallFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma recall forms
	 * @param end the upper bound of the range of pharma recall forms (not inclusive)
	 * @return the range of pharma recall forms
	 */
	@Override
	public java.util.List
		<com.nbp.pharmaceutical.application.form.service.model.PharmaRecallForm>
			getPharmaRecallForms(int start, int end) {

		return _pharmaRecallFormLocalService.getPharmaRecallForms(start, end);
	}

	/**
	 * Returns the number of pharma recall forms.
	 *
	 * @return the number of pharma recall forms
	 */
	@Override
	public int getPharmaRecallFormsCount() {
		return _pharmaRecallFormLocalService.getPharmaRecallFormsCount();
	}

	/**
	 * Updates the pharma recall form in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaRecallFormLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaRecallForm the pharma recall form
	 * @return the pharma recall form that was updated
	 */
	@Override
	public
		com.nbp.pharmaceutical.application.form.service.model.PharmaRecallForm
			updatePharmaRecallForm(
				com.nbp.pharmaceutical.application.form.service.model.
					PharmaRecallForm pharmaRecallForm) {

		return _pharmaRecallFormLocalService.updatePharmaRecallForm(
			pharmaRecallForm);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _pharmaRecallFormLocalService.getBasePersistence();
	}

	@Override
	public PharmaRecallFormLocalService getWrappedService() {
		return _pharmaRecallFormLocalService;
	}

	@Override
	public void setWrappedService(
		PharmaRecallFormLocalService pharmaRecallFormLocalService) {

		_pharmaRecallFormLocalService = pharmaRecallFormLocalService;
	}

	private PharmaRecallFormLocalService _pharmaRecallFormLocalService;

}