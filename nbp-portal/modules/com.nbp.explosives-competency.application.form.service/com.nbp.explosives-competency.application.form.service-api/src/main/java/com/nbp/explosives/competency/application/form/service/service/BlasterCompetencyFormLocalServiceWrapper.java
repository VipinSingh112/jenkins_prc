/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link BlasterCompetencyFormLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see BlasterCompetencyFormLocalService
 * @generated
 */
public class BlasterCompetencyFormLocalServiceWrapper
	implements BlasterCompetencyFormLocalService,
			   ServiceWrapper<BlasterCompetencyFormLocalService> {

	public BlasterCompetencyFormLocalServiceWrapper() {
		this(null);
	}

	public BlasterCompetencyFormLocalServiceWrapper(
		BlasterCompetencyFormLocalService blasterCompetencyFormLocalService) {

		_blasterCompetencyFormLocalService = blasterCompetencyFormLocalService;
	}

	/**
	 * Adds the blaster competency form to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BlasterCompetencyFormLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param blasterCompetencyForm the blaster competency form
	 * @return the blaster competency form that was added
	 */
	@Override
	public com.nbp.explosives.competency.application.form.service.model.
		BlasterCompetencyForm addBlasterCompetencyForm(
			com.nbp.explosives.competency.application.form.service.model.
				BlasterCompetencyForm blasterCompetencyForm) {

		return _blasterCompetencyFormLocalService.addBlasterCompetencyForm(
			blasterCompetencyForm);
	}

	/**
	 * Creates a new blaster competency form with the primary key. Does not add the blaster competency form to the database.
	 *
	 * @param blasterCompetencyFormId the primary key for the new blaster competency form
	 * @return the new blaster competency form
	 */
	@Override
	public com.nbp.explosives.competency.application.form.service.model.
		BlasterCompetencyForm createBlasterCompetencyForm(
			long blasterCompetencyFormId) {

		return _blasterCompetencyFormLocalService.createBlasterCompetencyForm(
			blasterCompetencyFormId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _blasterCompetencyFormLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the blaster competency form from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BlasterCompetencyFormLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param blasterCompetencyForm the blaster competency form
	 * @return the blaster competency form that was removed
	 */
	@Override
	public com.nbp.explosives.competency.application.form.service.model.
		BlasterCompetencyForm deleteBlasterCompetencyForm(
			com.nbp.explosives.competency.application.form.service.model.
				BlasterCompetencyForm blasterCompetencyForm) {

		return _blasterCompetencyFormLocalService.deleteBlasterCompetencyForm(
			blasterCompetencyForm);
	}

	/**
	 * Deletes the blaster competency form with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BlasterCompetencyFormLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param blasterCompetencyFormId the primary key of the blaster competency form
	 * @return the blaster competency form that was removed
	 * @throws PortalException if a blaster competency form with the primary key could not be found
	 */
	@Override
	public com.nbp.explosives.competency.application.form.service.model.
		BlasterCompetencyForm deleteBlasterCompetencyForm(
				long blasterCompetencyFormId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _blasterCompetencyFormLocalService.deleteBlasterCompetencyForm(
			blasterCompetencyFormId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _blasterCompetencyFormLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _blasterCompetencyFormLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _blasterCompetencyFormLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _blasterCompetencyFormLocalService.dynamicQuery();
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

		return _blasterCompetencyFormLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.explosives.competency.application.form.service.model.impl.BlasterCompetencyFormModelImpl</code>.
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

		return _blasterCompetencyFormLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.explosives.competency.application.form.service.model.impl.BlasterCompetencyFormModelImpl</code>.
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

		return _blasterCompetencyFormLocalService.dynamicQuery(
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

		return _blasterCompetencyFormLocalService.dynamicQueryCount(
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

		return _blasterCompetencyFormLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.explosives.competency.application.form.service.model.
		BlasterCompetencyForm fetchBlasterCompetencyForm(
			long blasterCompetencyFormId) {

		return _blasterCompetencyFormLocalService.fetchBlasterCompetencyForm(
			blasterCompetencyFormId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _blasterCompetencyFormLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the blaster competency form with the primary key.
	 *
	 * @param blasterCompetencyFormId the primary key of the blaster competency form
	 * @return the blaster competency form
	 * @throws PortalException if a blaster competency form with the primary key could not be found
	 */
	@Override
	public com.nbp.explosives.competency.application.form.service.model.
		BlasterCompetencyForm getBlasterCompetencyForm(
				long blasterCompetencyFormId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _blasterCompetencyFormLocalService.getBlasterCompetencyForm(
			blasterCompetencyFormId);
	}

	/**
	 * Returns a range of all the blaster competency forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.explosives.competency.application.form.service.model.impl.BlasterCompetencyFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of blaster competency forms
	 * @param end the upper bound of the range of blaster competency forms (not inclusive)
	 * @return the range of blaster competency forms
	 */
	@Override
	public java.util.List
		<com.nbp.explosives.competency.application.form.service.model.
			BlasterCompetencyForm> getBlasterCompetencyForms(
				int start, int end) {

		return _blasterCompetencyFormLocalService.getBlasterCompetencyForms(
			start, end);
	}

	/**
	 * Returns the number of blaster competency forms.
	 *
	 * @return the number of blaster competency forms
	 */
	@Override
	public int getBlasterCompetencyFormsCount() {
		return _blasterCompetencyFormLocalService.
			getBlasterCompetencyFormsCount();
	}

	@Override
	public com.nbp.explosives.competency.application.form.service.model.
		BlasterCompetencyForm getExplosiveById(long explosivesApplicationId)
			throws com.nbp.explosives.competency.application.form.service.
				exception.NoSuchBlasterCompetencyFormException {

		return _blasterCompetencyFormLocalService.getExplosiveById(
			explosivesApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _blasterCompetencyFormLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _blasterCompetencyFormLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _blasterCompetencyFormLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the blaster competency form in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BlasterCompetencyFormLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param blasterCompetencyForm the blaster competency form
	 * @return the blaster competency form that was updated
	 */
	@Override
	public com.nbp.explosives.competency.application.form.service.model.
		BlasterCompetencyForm updateBlasterCompetencyForm(
			com.nbp.explosives.competency.application.form.service.model.
				BlasterCompetencyForm blasterCompetencyForm) {

		return _blasterCompetencyFormLocalService.updateBlasterCompetencyForm(
			blasterCompetencyForm);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _blasterCompetencyFormLocalService.getBasePersistence();
	}

	@Override
	public BlasterCompetencyFormLocalService getWrappedService() {
		return _blasterCompetencyFormLocalService;
	}

	@Override
	public void setWrappedService(
		BlasterCompetencyFormLocalService blasterCompetencyFormLocalService) {

		_blasterCompetencyFormLocalService = blasterCompetencyFormLocalService;
	}

	private BlasterCompetencyFormLocalService
		_blasterCompetencyFormLocalService;

}