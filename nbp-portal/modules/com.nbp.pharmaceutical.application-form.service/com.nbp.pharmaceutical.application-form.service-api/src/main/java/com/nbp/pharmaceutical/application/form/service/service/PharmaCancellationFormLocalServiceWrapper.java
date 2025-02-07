/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link PharmaCancellationFormLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see PharmaCancellationFormLocalService
 * @generated
 */
public class PharmaCancellationFormLocalServiceWrapper
	implements PharmaCancellationFormLocalService,
			   ServiceWrapper<PharmaCancellationFormLocalService> {

	public PharmaCancellationFormLocalServiceWrapper() {
		this(null);
	}

	public PharmaCancellationFormLocalServiceWrapper(
		PharmaCancellationFormLocalService pharmaCancellationFormLocalService) {

		_pharmaCancellationFormLocalService =
			pharmaCancellationFormLocalService;
	}

	/**
	 * Adds the pharma cancellation form to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaCancellationFormLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaCancellationForm the pharma cancellation form
	 * @return the pharma cancellation form that was added
	 */
	@Override
	public
		com.nbp.pharmaceutical.application.form.service.model.
			PharmaCancellationForm addPharmaCancellationForm(
				com.nbp.pharmaceutical.application.form.service.model.
					PharmaCancellationForm pharmaCancellationForm) {

		return _pharmaCancellationFormLocalService.addPharmaCancellationForm(
			pharmaCancellationForm);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pharmaCancellationFormLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new pharma cancellation form with the primary key. Does not add the pharma cancellation form to the database.
	 *
	 * @param pharmaCancellationFormId the primary key for the new pharma cancellation form
	 * @return the new pharma cancellation form
	 */
	@Override
	public
		com.nbp.pharmaceutical.application.form.service.model.
			PharmaCancellationForm createPharmaCancellationForm(
				long pharmaCancellationFormId) {

		return _pharmaCancellationFormLocalService.createPharmaCancellationForm(
			pharmaCancellationFormId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pharmaCancellationFormLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the pharma cancellation form with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaCancellationFormLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaCancellationFormId the primary key of the pharma cancellation form
	 * @return the pharma cancellation form that was removed
	 * @throws PortalException if a pharma cancellation form with the primary key could not be found
	 */
	@Override
	public
		com.nbp.pharmaceutical.application.form.service.model.
			PharmaCancellationForm deletePharmaCancellationForm(
					long pharmaCancellationFormId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _pharmaCancellationFormLocalService.deletePharmaCancellationForm(
			pharmaCancellationFormId);
	}

	/**
	 * Deletes the pharma cancellation form from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaCancellationFormLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaCancellationForm the pharma cancellation form
	 * @return the pharma cancellation form that was removed
	 */
	@Override
	public
		com.nbp.pharmaceutical.application.form.service.model.
			PharmaCancellationForm deletePharmaCancellationForm(
				com.nbp.pharmaceutical.application.form.service.model.
					PharmaCancellationForm pharmaCancellationForm) {

		return _pharmaCancellationFormLocalService.deletePharmaCancellationForm(
			pharmaCancellationForm);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _pharmaCancellationFormLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _pharmaCancellationFormLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _pharmaCancellationFormLocalService.dynamicQuery();
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

		return _pharmaCancellationFormLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.pharmaceutical.application.form.service.model.impl.PharmaCancellationFormModelImpl</code>.
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

		return _pharmaCancellationFormLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.pharmaceutical.application.form.service.model.impl.PharmaCancellationFormModelImpl</code>.
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

		return _pharmaCancellationFormLocalService.dynamicQuery(
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

		return _pharmaCancellationFormLocalService.dynamicQueryCount(
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

		return _pharmaCancellationFormLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.pharmaceutical.application.form.service.model.
			PharmaCancellationForm fetchPharmaCancellationForm(
				long pharmaCancellationFormId) {

		return _pharmaCancellationFormLocalService.fetchPharmaCancellationForm(
			pharmaCancellationFormId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _pharmaCancellationFormLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _pharmaCancellationFormLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _pharmaCancellationFormLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pharmaCancellationFormLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Returns the pharma cancellation form with the primary key.
	 *
	 * @param pharmaCancellationFormId the primary key of the pharma cancellation form
	 * @return the pharma cancellation form
	 * @throws PortalException if a pharma cancellation form with the primary key could not be found
	 */
	@Override
	public
		com.nbp.pharmaceutical.application.form.service.model.
			PharmaCancellationForm getPharmaCancellationForm(
					long pharmaCancellationFormId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _pharmaCancellationFormLocalService.getPharmaCancellationForm(
			pharmaCancellationFormId);
	}

	/**
	 * Returns a range of all the pharma cancellation forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.pharmaceutical.application.form.service.model.impl.PharmaCancellationFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma cancellation forms
	 * @param end the upper bound of the range of pharma cancellation forms (not inclusive)
	 * @return the range of pharma cancellation forms
	 */
	@Override
	public java.util.List
		<com.nbp.pharmaceutical.application.form.service.model.
			PharmaCancellationForm> getPharmaCancellationForms(
				int start, int end) {

		return _pharmaCancellationFormLocalService.getPharmaCancellationForms(
			start, end);
	}

	/**
	 * Returns the number of pharma cancellation forms.
	 *
	 * @return the number of pharma cancellation forms
	 */
	@Override
	public int getPharmaCancellationFormsCount() {
		return _pharmaCancellationFormLocalService.
			getPharmaCancellationFormsCount();
	}

	/**
	 * Updates the pharma cancellation form in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaCancellationFormLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaCancellationForm the pharma cancellation form
	 * @return the pharma cancellation form that was updated
	 */
	@Override
	public
		com.nbp.pharmaceutical.application.form.service.model.
			PharmaCancellationForm updatePharmaCancellationForm(
				com.nbp.pharmaceutical.application.form.service.model.
					PharmaCancellationForm pharmaCancellationForm) {

		return _pharmaCancellationFormLocalService.updatePharmaCancellationForm(
			pharmaCancellationForm);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _pharmaCancellationFormLocalService.getBasePersistence();
	}

	@Override
	public PharmaCancellationFormLocalService getWrappedService() {
		return _pharmaCancellationFormLocalService;
	}

	@Override
	public void setWrappedService(
		PharmaCancellationFormLocalService pharmaCancellationFormLocalService) {

		_pharmaCancellationFormLocalService =
			pharmaCancellationFormLocalService;
	}

	private PharmaCancellationFormLocalService
		_pharmaCancellationFormLocalService;

}