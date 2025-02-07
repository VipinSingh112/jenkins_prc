/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link ProductiveInputsFormLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ProductiveInputsFormLocalService
 * @generated
 */
public class ProductiveInputsFormLocalServiceWrapper
	implements ProductiveInputsFormLocalService,
			   ServiceWrapper<ProductiveInputsFormLocalService> {

	public ProductiveInputsFormLocalServiceWrapper() {
		this(null);
	}

	public ProductiveInputsFormLocalServiceWrapper(
		ProductiveInputsFormLocalService productiveInputsFormLocalService) {

		_productiveInputsFormLocalService = productiveInputsFormLocalService;
	}

	/**
	 * Adds the productive inputs form to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ProductiveInputsFormLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param productiveInputsForm the productive inputs form
	 * @return the productive inputs form that was added
	 */
	@Override
	public
		com.nbp.manufacturing.application.form.service.model.
			ProductiveInputsForm addProductiveInputsForm(
				com.nbp.manufacturing.application.form.service.model.
					ProductiveInputsForm productiveInputsForm) {

		return _productiveInputsFormLocalService.addProductiveInputsForm(
			productiveInputsForm);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _productiveInputsFormLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new productive inputs form with the primary key. Does not add the productive inputs form to the database.
	 *
	 * @param productiveInputsFormId the primary key for the new productive inputs form
	 * @return the new productive inputs form
	 */
	@Override
	public
		com.nbp.manufacturing.application.form.service.model.
			ProductiveInputsForm createProductiveInputsForm(
				long productiveInputsFormId) {

		return _productiveInputsFormLocalService.createProductiveInputsForm(
			productiveInputsFormId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _productiveInputsFormLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the productive inputs form with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ProductiveInputsFormLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param productiveInputsFormId the primary key of the productive inputs form
	 * @return the productive inputs form that was removed
	 * @throws PortalException if a productive inputs form with the primary key could not be found
	 */
	@Override
	public
		com.nbp.manufacturing.application.form.service.model.
			ProductiveInputsForm deleteProductiveInputsForm(
					long productiveInputsFormId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _productiveInputsFormLocalService.deleteProductiveInputsForm(
			productiveInputsFormId);
	}

	/**
	 * Deletes the productive inputs form from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ProductiveInputsFormLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param productiveInputsForm the productive inputs form
	 * @return the productive inputs form that was removed
	 */
	@Override
	public
		com.nbp.manufacturing.application.form.service.model.
			ProductiveInputsForm deleteProductiveInputsForm(
				com.nbp.manufacturing.application.form.service.model.
					ProductiveInputsForm productiveInputsForm) {

		return _productiveInputsFormLocalService.deleteProductiveInputsForm(
			productiveInputsForm);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _productiveInputsFormLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _productiveInputsFormLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _productiveInputsFormLocalService.dynamicQuery();
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

		return _productiveInputsFormLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.form.service.model.impl.ProductiveInputsFormModelImpl</code>.
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

		return _productiveInputsFormLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.form.service.model.impl.ProductiveInputsFormModelImpl</code>.
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

		return _productiveInputsFormLocalService.dynamicQuery(
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

		return _productiveInputsFormLocalService.dynamicQueryCount(
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

		return _productiveInputsFormLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.manufacturing.application.form.service.model.
			ProductiveInputsForm fetchProductiveInputsForm(
				long productiveInputsFormId) {

		return _productiveInputsFormLocalService.fetchProductiveInputsForm(
			productiveInputsFormId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _productiveInputsFormLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _productiveInputsFormLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.manufacturing.application.form.service.model.
			ProductiveInputsForm> getMA_PI_MAI(long applicationId) {

		return _productiveInputsFormLocalService.getMA_PI_MAI(applicationId);
	}

	@Override
	public
		com.nbp.manufacturing.application.form.service.model.
			ProductiveInputsForm getManuByAppId(long applicationId) {

		return _productiveInputsFormLocalService.getManuByAppId(applicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _productiveInputsFormLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _productiveInputsFormLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Returns the productive inputs form with the primary key.
	 *
	 * @param productiveInputsFormId the primary key of the productive inputs form
	 * @return the productive inputs form
	 * @throws PortalException if a productive inputs form with the primary key could not be found
	 */
	@Override
	public
		com.nbp.manufacturing.application.form.service.model.
			ProductiveInputsForm getProductiveInputsForm(
					long productiveInputsFormId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _productiveInputsFormLocalService.getProductiveInputsForm(
			productiveInputsFormId);
	}

	/**
	 * Returns a range of all the productive inputs forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.form.service.model.impl.ProductiveInputsFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of productive inputs forms
	 * @param end the upper bound of the range of productive inputs forms (not inclusive)
	 * @return the range of productive inputs forms
	 */
	@Override
	public java.util.List
		<com.nbp.manufacturing.application.form.service.model.
			ProductiveInputsForm> getProductiveInputsForms(int start, int end) {

		return _productiveInputsFormLocalService.getProductiveInputsForms(
			start, end);
	}

	/**
	 * Returns the number of productive inputs forms.
	 *
	 * @return the number of productive inputs forms
	 */
	@Override
	public int getProductiveInputsFormsCount() {
		return _productiveInputsFormLocalService.
			getProductiveInputsFormsCount();
	}

	/**
	 * Updates the productive inputs form in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ProductiveInputsFormLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param productiveInputsForm the productive inputs form
	 * @return the productive inputs form that was updated
	 */
	@Override
	public
		com.nbp.manufacturing.application.form.service.model.
			ProductiveInputsForm updateProductiveInputsForm(
				com.nbp.manufacturing.application.form.service.model.
					ProductiveInputsForm productiveInputsForm) {

		return _productiveInputsFormLocalService.updateProductiveInputsForm(
			productiveInputsForm);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _productiveInputsFormLocalService.getBasePersistence();
	}

	@Override
	public ProductiveInputsFormLocalService getWrappedService() {
		return _productiveInputsFormLocalService;
	}

	@Override
	public void setWrappedService(
		ProductiveInputsFormLocalService productiveInputsFormLocalService) {

		_productiveInputsFormLocalService = productiveInputsFormLocalService;
	}

	private ProductiveInputsFormLocalService _productiveInputsFormLocalService;

}