/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link ManufacturingApplicationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ManufacturingApplicationLocalService
 * @generated
 */
public class ManufacturingApplicationLocalServiceWrapper
	implements ManufacturingApplicationLocalService,
			   ServiceWrapper<ManufacturingApplicationLocalService> {

	public ManufacturingApplicationLocalServiceWrapper() {
		this(null);
	}

	public ManufacturingApplicationLocalServiceWrapper(
		ManufacturingApplicationLocalService
			manufacturingApplicationLocalService) {

		_manufacturingApplicationLocalService =
			manufacturingApplicationLocalService;
	}

	/**
	 * Adds the manufacturing application to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManufacturingApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manufacturingApplication the manufacturing application
	 * @return the manufacturing application that was added
	 */
	@Override
	public com.nbp.manufacturing.application.form.service.model.
		ManufacturingApplication addManufacturingApplication(
			com.nbp.manufacturing.application.form.service.model.
				ManufacturingApplication manufacturingApplication) {

		return _manufacturingApplicationLocalService.
			addManufacturingApplication(manufacturingApplication);
	}

	/**
	 * Creates a new manufacturing application with the primary key. Does not add the manufacturing application to the database.
	 *
	 * @param manufacturingApplicationId the primary key for the new manufacturing application
	 * @return the new manufacturing application
	 */
	@Override
	public com.nbp.manufacturing.application.form.service.model.
		ManufacturingApplication createManufacturingApplication(
			long manufacturingApplicationId) {

		return _manufacturingApplicationLocalService.
			createManufacturingApplication(manufacturingApplicationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _manufacturingApplicationLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the manufacturing application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManufacturingApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manufacturingApplicationId the primary key of the manufacturing application
	 * @return the manufacturing application that was removed
	 * @throws PortalException if a manufacturing application with the primary key could not be found
	 */
	@Override
	public com.nbp.manufacturing.application.form.service.model.
		ManufacturingApplication deleteManufacturingApplication(
				long manufacturingApplicationId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _manufacturingApplicationLocalService.
			deleteManufacturingApplication(manufacturingApplicationId);
	}

	/**
	 * Deletes the manufacturing application from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManufacturingApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manufacturingApplication the manufacturing application
	 * @return the manufacturing application that was removed
	 */
	@Override
	public com.nbp.manufacturing.application.form.service.model.
		ManufacturingApplication deleteManufacturingApplication(
			com.nbp.manufacturing.application.form.service.model.
				ManufacturingApplication manufacturingApplication) {

		return _manufacturingApplicationLocalService.
			deleteManufacturingApplication(manufacturingApplication);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _manufacturingApplicationLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _manufacturingApplicationLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _manufacturingApplicationLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _manufacturingApplicationLocalService.dynamicQuery();
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

		return _manufacturingApplicationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.form.service.model.impl.ManufacturingApplicationModelImpl</code>.
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

		return _manufacturingApplicationLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.form.service.model.impl.ManufacturingApplicationModelImpl</code>.
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

		return _manufacturingApplicationLocalService.dynamicQuery(
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

		return _manufacturingApplicationLocalService.dynamicQueryCount(
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

		return _manufacturingApplicationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.manufacturing.application.form.service.model.
		ManufacturingApplication fetchManufacturingApplication(
			long manufacturingApplicationId) {

		return _manufacturingApplicationLocalService.
			fetchManufacturingApplication(manufacturingApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _manufacturingApplicationLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _manufacturingApplicationLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the manufacturing application with the primary key.
	 *
	 * @param manufacturingApplicationId the primary key of the manufacturing application
	 * @return the manufacturing application
	 * @throws PortalException if a manufacturing application with the primary key could not be found
	 */
	@Override
	public com.nbp.manufacturing.application.form.service.model.
		ManufacturingApplication getManufacturingApplication(
				long manufacturingApplicationId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _manufacturingApplicationLocalService.
			getManufacturingApplication(manufacturingApplicationId);
	}

	/**
	 * Returns a range of all the manufacturing applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.form.service.model.impl.ManufacturingApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manufacturing applications
	 * @param end the upper bound of the range of manufacturing applications (not inclusive)
	 * @return the range of manufacturing applications
	 */
	@Override
	public java.util.List
		<com.nbp.manufacturing.application.form.service.model.
			ManufacturingApplication> getManufacturingApplications(
				int start, int end) {

		return _manufacturingApplicationLocalService.
			getManufacturingApplications(start, end);
	}

	/**
	 * Returns the number of manufacturing applications.
	 *
	 * @return the number of manufacturing applications
	 */
	@Override
	public int getManufacturingApplicationsCount() {
		return _manufacturingApplicationLocalService.
			getManufacturingApplicationsCount();
	}

	@Override
	public com.nbp.manufacturing.application.form.service.model.
		ManufacturingApplication getManufacturingByAppNum(
				String applicationNumber)
			throws com.nbp.manufacturing.application.form.service.exception.
				NoSuchManufacturingApplicationException {

		return _manufacturingApplicationLocalService.getManufacturingByAppNum(
			applicationNumber);
	}

	@Override
	public com.nbp.manufacturing.application.form.service.model.
		ManufacturingApplication getManufacturingByCaseId(String caseId)
			throws com.nbp.manufacturing.application.form.service.exception.
				NoSuchManufacturingApplicationException {

		return _manufacturingApplicationLocalService.getManufacturingByCaseId(
			caseId);
	}

	@Override
	public com.nbp.manufacturing.application.form.service.model.
		ManufacturingApplication getManufacturingByRT_AppNo(
				String requestType, String appNumber)
			throws com.nbp.manufacturing.application.form.service.exception.
				NoSuchManufacturingApplicationException {

		return _manufacturingApplicationLocalService.getManufacturingByRT_AppNo(
			requestType, appNumber);
	}

	@Override
	public java.util.List
		<com.nbp.manufacturing.application.form.service.model.
			ManufacturingApplication> getManufacturingByS_U(
				long userID, int status) {

		return _manufacturingApplicationLocalService.getManufacturingByS_U(
			userID, status);
	}

	@Override
	public java.util.List
		<com.nbp.manufacturing.application.form.service.model.
			ManufacturingApplication> getManufacturingByStatus(int status) {

		return _manufacturingApplicationLocalService.getManufacturingByStatus(
			status);
	}

	@Override
	public java.util.List<String> getManuFacturingDistinctStages() {
		return _manufacturingApplicationLocalService.
			getManuFacturingDistinctStages();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _manufacturingApplicationLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _manufacturingApplicationLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the manufacturing application in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManufacturingApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manufacturingApplication the manufacturing application
	 * @return the manufacturing application that was updated
	 */
	@Override
	public com.nbp.manufacturing.application.form.service.model.
		ManufacturingApplication updateManufacturingApplication(
			com.nbp.manufacturing.application.form.service.model.
				ManufacturingApplication manufacturingApplication) {

		return _manufacturingApplicationLocalService.
			updateManufacturingApplication(manufacturingApplication);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _manufacturingApplicationLocalService.getBasePersistence();
	}

	@Override
	public ManufacturingApplicationLocalService getWrappedService() {
		return _manufacturingApplicationLocalService;
	}

	@Override
	public void setWrappedService(
		ManufacturingApplicationLocalService
			manufacturingApplicationLocalService) {

		_manufacturingApplicationLocalService =
			manufacturingApplicationLocalService;
	}

	private ManufacturingApplicationLocalService
		_manufacturingApplicationLocalService;

}