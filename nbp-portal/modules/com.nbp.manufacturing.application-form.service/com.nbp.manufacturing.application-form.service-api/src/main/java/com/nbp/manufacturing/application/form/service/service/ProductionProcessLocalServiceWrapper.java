/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link ProductionProcessLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ProductionProcessLocalService
 * @generated
 */
public class ProductionProcessLocalServiceWrapper
	implements ProductionProcessLocalService,
			   ServiceWrapper<ProductionProcessLocalService> {

	public ProductionProcessLocalServiceWrapper() {
		this(null);
	}

	public ProductionProcessLocalServiceWrapper(
		ProductionProcessLocalService productionProcessLocalService) {

		_productionProcessLocalService = productionProcessLocalService;
	}

	/**
	 * Adds the production process to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ProductionProcessLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param productionProcess the production process
	 * @return the production process that was added
	 */
	@Override
	public
		com.nbp.manufacturing.application.form.service.model.ProductionProcess
			addProductionProcess(
				com.nbp.manufacturing.application.form.service.model.
					ProductionProcess productionProcess) {

		return _productionProcessLocalService.addProductionProcess(
			productionProcess);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _productionProcessLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new production process with the primary key. Does not add the production process to the database.
	 *
	 * @param productionProcessId the primary key for the new production process
	 * @return the new production process
	 */
	@Override
	public
		com.nbp.manufacturing.application.form.service.model.ProductionProcess
			createProductionProcess(long productionProcessId) {

		return _productionProcessLocalService.createProductionProcess(
			productionProcessId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _productionProcessLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the production process with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ProductionProcessLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param productionProcessId the primary key of the production process
	 * @return the production process that was removed
	 * @throws PortalException if a production process with the primary key could not be found
	 */
	@Override
	public
		com.nbp.manufacturing.application.form.service.model.ProductionProcess
				deleteProductionProcess(long productionProcessId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _productionProcessLocalService.deleteProductionProcess(
			productionProcessId);
	}

	/**
	 * Deletes the production process from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ProductionProcessLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param productionProcess the production process
	 * @return the production process that was removed
	 */
	@Override
	public
		com.nbp.manufacturing.application.form.service.model.ProductionProcess
			deleteProductionProcess(
				com.nbp.manufacturing.application.form.service.model.
					ProductionProcess productionProcess) {

		return _productionProcessLocalService.deleteProductionProcess(
			productionProcess);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _productionProcessLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _productionProcessLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _productionProcessLocalService.dynamicQuery();
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

		return _productionProcessLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.form.service.model.impl.ProductionProcessModelImpl</code>.
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

		return _productionProcessLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.form.service.model.impl.ProductionProcessModelImpl</code>.
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

		return _productionProcessLocalService.dynamicQuery(
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

		return _productionProcessLocalService.dynamicQueryCount(dynamicQuery);
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

		return _productionProcessLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.manufacturing.application.form.service.model.ProductionProcess
			fetchProductionProcess(long productionProcessId) {

		return _productionProcessLocalService.fetchProductionProcess(
			productionProcessId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _productionProcessLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _productionProcessLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.manufacturing.application.form.service.model.ProductionProcess>
			getMA_PDP_MAI(long applicationId) {

		return _productionProcessLocalService.getMA_PDP_MAI(applicationId);
	}

	@Override
	public
		com.nbp.manufacturing.application.form.service.model.ProductionProcess
				getManuByAppId(long applicationId)
			throws com.nbp.manufacturing.application.form.service.exception.
				NoSuchProductionProcessException {

		return _productionProcessLocalService.getManuByAppId(applicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _productionProcessLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _productionProcessLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the production process with the primary key.
	 *
	 * @param productionProcessId the primary key of the production process
	 * @return the production process
	 * @throws PortalException if a production process with the primary key could not be found
	 */
	@Override
	public
		com.nbp.manufacturing.application.form.service.model.ProductionProcess
				getProductionProcess(long productionProcessId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _productionProcessLocalService.getProductionProcess(
			productionProcessId);
	}

	/**
	 * Returns a range of all the production processes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.form.service.model.impl.ProductionProcessModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of production processes
	 * @param end the upper bound of the range of production processes (not inclusive)
	 * @return the range of production processes
	 */
	@Override
	public java.util.List
		<com.nbp.manufacturing.application.form.service.model.ProductionProcess>
			getProductionProcesses(int start, int end) {

		return _productionProcessLocalService.getProductionProcesses(
			start, end);
	}

	/**
	 * Returns the number of production processes.
	 *
	 * @return the number of production processes
	 */
	@Override
	public int getProductionProcessesCount() {
		return _productionProcessLocalService.getProductionProcessesCount();
	}

	/**
	 * Updates the production process in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ProductionProcessLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param productionProcess the production process
	 * @return the production process that was updated
	 */
	@Override
	public
		com.nbp.manufacturing.application.form.service.model.ProductionProcess
			updateProductionProcess(
				com.nbp.manufacturing.application.form.service.model.
					ProductionProcess productionProcess) {

		return _productionProcessLocalService.updateProductionProcess(
			productionProcess);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _productionProcessLocalService.getBasePersistence();
	}

	@Override
	public ProductionProcessLocalService getWrappedService() {
		return _productionProcessLocalService;
	}

	@Override
	public void setWrappedService(
		ProductionProcessLocalService productionProcessLocalService) {

		_productionProcessLocalService = productionProcessLocalService;
	}

	private ProductionProcessLocalService _productionProcessLocalService;

}