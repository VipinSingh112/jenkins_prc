/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ogt.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link OgtApplicationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see OgtApplicationLocalService
 * @generated
 */
public class OgtApplicationLocalServiceWrapper
	implements OgtApplicationLocalService,
			   ServiceWrapper<OgtApplicationLocalService> {

	public OgtApplicationLocalServiceWrapper() {
		this(null);
	}

	public OgtApplicationLocalServiceWrapper(
		OgtApplicationLocalService ogtApplicationLocalService) {

		_ogtApplicationLocalService = ogtApplicationLocalService;
	}

	/**
	 * Adds the ogt application to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OgtApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ogtApplication the ogt application
	 * @return the ogt application that was added
	 */
	@Override
	public com.nbp.ogt.application.form.services.model.OgtApplication
		addOgtApplication(
			com.nbp.ogt.application.form.services.model.OgtApplication
				ogtApplication) {

		return _ogtApplicationLocalService.addOgtApplication(ogtApplication);
	}

	/**
	 * Creates a new ogt application with the primary key. Does not add the ogt application to the database.
	 *
	 * @param ogtApplicationId the primary key for the new ogt application
	 * @return the new ogt application
	 */
	@Override
	public com.nbp.ogt.application.form.services.model.OgtApplication
		createOgtApplication(long ogtApplicationId) {

		return _ogtApplicationLocalService.createOgtApplication(
			ogtApplicationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ogtApplicationLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the ogt application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OgtApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ogtApplicationId the primary key of the ogt application
	 * @return the ogt application that was removed
	 * @throws PortalException if a ogt application with the primary key could not be found
	 */
	@Override
	public com.nbp.ogt.application.form.services.model.OgtApplication
			deleteOgtApplication(long ogtApplicationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ogtApplicationLocalService.deleteOgtApplication(
			ogtApplicationId);
	}

	/**
	 * Deletes the ogt application from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OgtApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ogtApplication the ogt application
	 * @return the ogt application that was removed
	 */
	@Override
	public com.nbp.ogt.application.form.services.model.OgtApplication
		deleteOgtApplication(
			com.nbp.ogt.application.form.services.model.OgtApplication
				ogtApplication) {

		return _ogtApplicationLocalService.deleteOgtApplication(ogtApplication);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ogtApplicationLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _ogtApplicationLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _ogtApplicationLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _ogtApplicationLocalService.dynamicQuery();
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

		return _ogtApplicationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ogt.application.form.services.model.impl.OgtApplicationModelImpl</code>.
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

		return _ogtApplicationLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ogt.application.form.services.model.impl.OgtApplicationModelImpl</code>.
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

		return _ogtApplicationLocalService.dynamicQuery(
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

		return _ogtApplicationLocalService.dynamicQueryCount(dynamicQuery);
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

		return _ogtApplicationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.ogt.application.form.services.model.OgtApplication
		fetchOgtApplication(long ogtApplicationId) {

		return _ogtApplicationLocalService.fetchOgtApplication(
			ogtApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _ogtApplicationLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _ogtApplicationLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the ogt application with the primary key.
	 *
	 * @param ogtApplicationId the primary key of the ogt application
	 * @return the ogt application
	 * @throws PortalException if a ogt application with the primary key could not be found
	 */
	@Override
	public com.nbp.ogt.application.form.services.model.OgtApplication
			getOgtApplication(long ogtApplicationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ogtApplicationLocalService.getOgtApplication(ogtApplicationId);
	}

	/**
	 * Returns a range of all the ogt applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ogt.application.form.services.model.impl.OgtApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt applications
	 * @param end the upper bound of the range of ogt applications (not inclusive)
	 * @return the range of ogt applications
	 */
	@Override
	public java.util.List
		<com.nbp.ogt.application.form.services.model.OgtApplication>
			getOgtApplications(int start, int end) {

		return _ogtApplicationLocalService.getOgtApplications(start, end);
	}

	/**
	 * Returns the number of ogt applications.
	 *
	 * @return the number of ogt applications
	 */
	@Override
	public int getOgtApplicationsCount() {
		return _ogtApplicationLocalService.getOgtApplicationsCount();
	}

	@Override
	public com.nbp.ogt.application.form.services.model.OgtApplication
			getOgtByAppNum(String applicationNumber)
		throws com.nbp.ogt.application.form.services.exception.
			NoSuchOgtApplicationException {

		return _ogtApplicationLocalService.getOgtByAppNum(applicationNumber);
	}

	@Override
	public com.nbp.ogt.application.form.services.model.OgtApplication
			getOgtByCaseId(String caseId)
		throws com.nbp.ogt.application.form.services.exception.
			NoSuchOgtApplicationException {

		return _ogtApplicationLocalService.getOgtByCaseId(caseId);
	}

	@Override
	public com.nbp.ogt.application.form.services.model.OgtApplication
			getOgtByRT_AppNo(
				String typeOfApplicant, String expiredLicenseAppNumber)
		throws com.nbp.ogt.application.form.services.exception.
			NoSuchOgtApplicationException {

		return _ogtApplicationLocalService.getOgtByRT_AppNo(
			typeOfApplicant, expiredLicenseAppNumber);
	}

	@Override
	public java.util.List
		<com.nbp.ogt.application.form.services.model.OgtApplication>
			getOgtByS_U(long userId, int status) {

		return _ogtApplicationLocalService.getOgtByS_U(userId, status);
	}

	@Override
	public java.util.List
		<com.nbp.ogt.application.form.services.model.OgtApplication>
			getOgtByStatus(int status) {

		return _ogtApplicationLocalService.getOgtByStatus(status);
	}

	@Override
	public java.util.List<String> getOgtDistinctCategories() {
		return _ogtApplicationLocalService.getOgtDistinctCategories();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ogtApplicationLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ogtApplicationLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the ogt application in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OgtApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ogtApplication the ogt application
	 * @return the ogt application that was updated
	 */
	@Override
	public com.nbp.ogt.application.form.services.model.OgtApplication
		updateOgtApplication(
			com.nbp.ogt.application.form.services.model.OgtApplication
				ogtApplication) {

		return _ogtApplicationLocalService.updateOgtApplication(ogtApplication);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _ogtApplicationLocalService.getBasePersistence();
	}

	@Override
	public OgtApplicationLocalService getWrappedService() {
		return _ogtApplicationLocalService;
	}

	@Override
	public void setWrappedService(
		OgtApplicationLocalService ogtApplicationLocalService) {

		_ogtApplicationLocalService = ogtApplicationLocalService;
	}

	private OgtApplicationLocalService _ogtApplicationLocalService;

}