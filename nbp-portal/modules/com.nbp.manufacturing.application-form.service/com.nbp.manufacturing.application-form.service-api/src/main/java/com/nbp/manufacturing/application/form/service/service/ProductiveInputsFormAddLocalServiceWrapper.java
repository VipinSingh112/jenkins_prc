/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link ProductiveInputsFormAddLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ProductiveInputsFormAddLocalService
 * @generated
 */
public class ProductiveInputsFormAddLocalServiceWrapper
	implements ProductiveInputsFormAddLocalService,
			   ServiceWrapper<ProductiveInputsFormAddLocalService> {

	public ProductiveInputsFormAddLocalServiceWrapper() {
		this(null);
	}

	public ProductiveInputsFormAddLocalServiceWrapper(
		ProductiveInputsFormAddLocalService
			productiveInputsFormAddLocalService) {

		_productiveInputsFormAddLocalService =
			productiveInputsFormAddLocalService;
	}

	/**
	 * Adds the productive inputs form add to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ProductiveInputsFormAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param productiveInputsFormAdd the productive inputs form add
	 * @return the productive inputs form add that was added
	 */
	@Override
	public
		com.nbp.manufacturing.application.form.service.model.
			ProductiveInputsFormAdd addProductiveInputsFormAdd(
				com.nbp.manufacturing.application.form.service.model.
					ProductiveInputsFormAdd productiveInputsFormAdd) {

		return _productiveInputsFormAddLocalService.addProductiveInputsFormAdd(
			productiveInputsFormAdd);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _productiveInputsFormAddLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new productive inputs form add with the primary key. Does not add the productive inputs form add to the database.
	 *
	 * @param productiveInputsFormAddId the primary key for the new productive inputs form add
	 * @return the new productive inputs form add
	 */
	@Override
	public
		com.nbp.manufacturing.application.form.service.model.
			ProductiveInputsFormAdd createProductiveInputsFormAdd(
				long productiveInputsFormAddId) {

		return _productiveInputsFormAddLocalService.
			createProductiveInputsFormAdd(productiveInputsFormAddId);
	}

	@Override
	public void deleteMultipleFormsBy_Id(long applicationId) {
		_productiveInputsFormAddLocalService.deleteMultipleFormsBy_Id(
			applicationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _productiveInputsFormAddLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the productive inputs form add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ProductiveInputsFormAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param productiveInputsFormAddId the primary key of the productive inputs form add
	 * @return the productive inputs form add that was removed
	 * @throws PortalException if a productive inputs form add with the primary key could not be found
	 */
	@Override
	public
		com.nbp.manufacturing.application.form.service.model.
			ProductiveInputsFormAdd deleteProductiveInputsFormAdd(
					long productiveInputsFormAddId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _productiveInputsFormAddLocalService.
			deleteProductiveInputsFormAdd(productiveInputsFormAddId);
	}

	/**
	 * Deletes the productive inputs form add from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ProductiveInputsFormAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param productiveInputsFormAdd the productive inputs form add
	 * @return the productive inputs form add that was removed
	 */
	@Override
	public
		com.nbp.manufacturing.application.form.service.model.
			ProductiveInputsFormAdd deleteProductiveInputsFormAdd(
				com.nbp.manufacturing.application.form.service.model.
					ProductiveInputsFormAdd productiveInputsFormAdd) {

		return _productiveInputsFormAddLocalService.
			deleteProductiveInputsFormAdd(productiveInputsFormAdd);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _productiveInputsFormAddLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _productiveInputsFormAddLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _productiveInputsFormAddLocalService.dynamicQuery();
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

		return _productiveInputsFormAddLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.form.service.model.impl.ProductiveInputsFormAddModelImpl</code>.
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

		return _productiveInputsFormAddLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.form.service.model.impl.ProductiveInputsFormAddModelImpl</code>.
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

		return _productiveInputsFormAddLocalService.dynamicQuery(
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

		return _productiveInputsFormAddLocalService.dynamicQueryCount(
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

		return _productiveInputsFormAddLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.manufacturing.application.form.service.model.
			ProductiveInputsFormAdd fetchProductiveInputsFormAdd(
				long productiveInputsFormAddId) {

		return _productiveInputsFormAddLocalService.
			fetchProductiveInputsFormAdd(productiveInputsFormAddId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _productiveInputsFormAddLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _productiveInputsFormAddLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.manufacturing.application.form.service.model.
			ProductiveInputsFormAdd> getMA_PIF(
				long manufacturingApplicationId) {

		return _productiveInputsFormAddLocalService.getMA_PIF(
			manufacturingApplicationId);
	}

	@Override
	public java.util.List
		<com.nbp.manufacturing.application.form.service.model.
			ProductiveInputsFormAdd> getMA_PII(long productiveInputsFormId) {

		return _productiveInputsFormAddLocalService.getMA_PII(
			productiveInputsFormId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _productiveInputsFormAddLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _productiveInputsFormAddLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Returns the productive inputs form add with the primary key.
	 *
	 * @param productiveInputsFormAddId the primary key of the productive inputs form add
	 * @return the productive inputs form add
	 * @throws PortalException if a productive inputs form add with the primary key could not be found
	 */
	@Override
	public
		com.nbp.manufacturing.application.form.service.model.
			ProductiveInputsFormAdd getProductiveInputsFormAdd(
					long productiveInputsFormAddId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _productiveInputsFormAddLocalService.getProductiveInputsFormAdd(
			productiveInputsFormAddId);
	}

	/**
	 * Returns a range of all the productive inputs form adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.form.service.model.impl.ProductiveInputsFormAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of productive inputs form adds
	 * @param end the upper bound of the range of productive inputs form adds (not inclusive)
	 * @return the range of productive inputs form adds
	 */
	@Override
	public java.util.List
		<com.nbp.manufacturing.application.form.service.model.
			ProductiveInputsFormAdd> getProductiveInputsFormAdds(
				int start, int end) {

		return _productiveInputsFormAddLocalService.getProductiveInputsFormAdds(
			start, end);
	}

	/**
	 * Returns the number of productive inputs form adds.
	 *
	 * @return the number of productive inputs form adds
	 */
	@Override
	public int getProductiveInputsFormAddsCount() {
		return _productiveInputsFormAddLocalService.
			getProductiveInputsFormAddsCount();
	}

	/**
	 * Updates the productive inputs form add in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ProductiveInputsFormAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param productiveInputsFormAdd the productive inputs form add
	 * @return the productive inputs form add that was updated
	 */
	@Override
	public
		com.nbp.manufacturing.application.form.service.model.
			ProductiveInputsFormAdd updateProductiveInputsFormAdd(
				com.nbp.manufacturing.application.form.service.model.
					ProductiveInputsFormAdd productiveInputsFormAdd) {

		return _productiveInputsFormAddLocalService.
			updateProductiveInputsFormAdd(productiveInputsFormAdd);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _productiveInputsFormAddLocalService.getBasePersistence();
	}

	@Override
	public ProductiveInputsFormAddLocalService getWrappedService() {
		return _productiveInputsFormAddLocalService;
	}

	@Override
	public void setWrappedService(
		ProductiveInputsFormAddLocalService
			productiveInputsFormAddLocalService) {

		_productiveInputsFormAddLocalService =
			productiveInputsFormAddLocalService;
	}

	private ProductiveInputsFormAddLocalService
		_productiveInputsFormAddLocalService;

}