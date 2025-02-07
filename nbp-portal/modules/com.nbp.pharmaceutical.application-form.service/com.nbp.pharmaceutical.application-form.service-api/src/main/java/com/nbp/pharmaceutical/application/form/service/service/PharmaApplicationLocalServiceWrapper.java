/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link PharmaApplicationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see PharmaApplicationLocalService
 * @generated
 */
public class PharmaApplicationLocalServiceWrapper
	implements PharmaApplicationLocalService,
			   ServiceWrapper<PharmaApplicationLocalService> {

	public PharmaApplicationLocalServiceWrapper() {
		this(null);
	}

	public PharmaApplicationLocalServiceWrapper(
		PharmaApplicationLocalService pharmaApplicationLocalService) {

		_pharmaApplicationLocalService = pharmaApplicationLocalService;
	}

	/**
	 * Adds the pharma application to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaApplication the pharma application
	 * @return the pharma application that was added
	 */
	@Override
	public
		com.nbp.pharmaceutical.application.form.service.model.PharmaApplication
			addPharmaApplication(
				com.nbp.pharmaceutical.application.form.service.model.
					PharmaApplication pharmaApplication) {

		return _pharmaApplicationLocalService.addPharmaApplication(
			pharmaApplication);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pharmaApplicationLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new pharma application with the primary key. Does not add the pharma application to the database.
	 *
	 * @param pharmaApplicationId the primary key for the new pharma application
	 * @return the new pharma application
	 */
	@Override
	public
		com.nbp.pharmaceutical.application.form.service.model.PharmaApplication
			createPharmaApplication(long pharmaApplicationId) {

		return _pharmaApplicationLocalService.createPharmaApplication(
			pharmaApplicationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pharmaApplicationLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the pharma application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaApplicationId the primary key of the pharma application
	 * @return the pharma application that was removed
	 * @throws PortalException if a pharma application with the primary key could not be found
	 */
	@Override
	public
		com.nbp.pharmaceutical.application.form.service.model.PharmaApplication
				deletePharmaApplication(long pharmaApplicationId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _pharmaApplicationLocalService.deletePharmaApplication(
			pharmaApplicationId);
	}

	/**
	 * Deletes the pharma application from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaApplication the pharma application
	 * @return the pharma application that was removed
	 */
	@Override
	public
		com.nbp.pharmaceutical.application.form.service.model.PharmaApplication
			deletePharmaApplication(
				com.nbp.pharmaceutical.application.form.service.model.
					PharmaApplication pharmaApplication) {

		return _pharmaApplicationLocalService.deletePharmaApplication(
			pharmaApplication);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _pharmaApplicationLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _pharmaApplicationLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _pharmaApplicationLocalService.dynamicQuery();
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

		return _pharmaApplicationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.pharmaceutical.application.form.service.model.impl.PharmaApplicationModelImpl</code>.
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

		return _pharmaApplicationLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.pharmaceutical.application.form.service.model.impl.PharmaApplicationModelImpl</code>.
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

		return _pharmaApplicationLocalService.dynamicQuery(
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

		return _pharmaApplicationLocalService.dynamicQueryCount(dynamicQuery);
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

		return _pharmaApplicationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.pharmaceutical.application.form.service.model.PharmaApplication
			fetchPharmaApplication(long pharmaApplicationId) {

		return _pharmaApplicationLocalService.fetchPharmaApplication(
			pharmaApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _pharmaApplicationLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _pharmaApplicationLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _pharmaApplicationLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pharmaApplicationLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the pharma application with the primary key.
	 *
	 * @param pharmaApplicationId the primary key of the pharma application
	 * @return the pharma application
	 * @throws PortalException if a pharma application with the primary key could not be found
	 */
	@Override
	public
		com.nbp.pharmaceutical.application.form.service.model.PharmaApplication
				getPharmaApplication(long pharmaApplicationId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _pharmaApplicationLocalService.getPharmaApplication(
			pharmaApplicationId);
	}

	/**
	 * Returns a range of all the pharma applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.pharmaceutical.application.form.service.model.impl.PharmaApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma applications
	 * @param end the upper bound of the range of pharma applications (not inclusive)
	 * @return the range of pharma applications
	 */
	@Override
	public java.util.List
		<com.nbp.pharmaceutical.application.form.service.model.
			PharmaApplication> getPharmaApplications(int start, int end) {

		return _pharmaApplicationLocalService.getPharmaApplications(start, end);
	}

	/**
	 * Returns the number of pharma applications.
	 *
	 * @return the number of pharma applications
	 */
	@Override
	public int getPharmaApplicationsCount() {
		return _pharmaApplicationLocalService.getPharmaApplicationsCount();
	}

	@Override
	public
		com.nbp.pharmaceutical.application.form.service.model.PharmaApplication
				getPharmaByAppNum(String applicationNumber)
			throws com.nbp.pharmaceutical.application.form.service.exception.
				NoSuchPharmaApplicationException {

		return _pharmaApplicationLocalService.getPharmaByAppNum(
			applicationNumber);
	}

	@Override
	public
		com.nbp.pharmaceutical.application.form.service.model.PharmaApplication
				getPharmaByAT_AppNo(String applicationType, String appNumber)
			throws com.nbp.pharmaceutical.application.form.service.exception.
				NoSuchPharmaApplicationException {

		return _pharmaApplicationLocalService.getPharmaByAT_AppNo(
			applicationType, appNumber);
	}

	@Override
	public
		com.nbp.pharmaceutical.application.form.service.model.PharmaApplication
				getPharmaByCaseId(String caseId)
			throws com.nbp.pharmaceutical.application.form.service.exception.
				NoSuchPharmaApplicationException {

		return _pharmaApplicationLocalService.getPharmaByCaseId(caseId);
	}

	@Override
	public java.util.List
		<com.nbp.pharmaceutical.application.form.service.model.
			PharmaApplication> getPharmaByS_U(int status, long userId)
				throws com.nbp.pharmaceutical.application.form.service.
					exception.NoSuchPharmaApplicationException {

		return _pharmaApplicationLocalService.getPharmaByS_U(status, userId);
	}

	@Override
	public java.util.List
		<com.nbp.pharmaceutical.application.form.service.model.
			PharmaApplication> getPharmaByStatus(int status) {

		return _pharmaApplicationLocalService.getPharmaByStatus(status);
	}

	@Override
	public java.util.List<String> getPharmaDistinctStages() {
		return _pharmaApplicationLocalService.getPharmaDistinctStages();
	}

	/**
	 * Updates the pharma application in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaApplication the pharma application
	 * @return the pharma application that was updated
	 */
	@Override
	public
		com.nbp.pharmaceutical.application.form.service.model.PharmaApplication
			updatePharmaApplication(
				com.nbp.pharmaceutical.application.form.service.model.
					PharmaApplication pharmaApplication) {

		return _pharmaApplicationLocalService.updatePharmaApplication(
			pharmaApplication);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _pharmaApplicationLocalService.getBasePersistence();
	}

	@Override
	public PharmaApplicationLocalService getWrappedService() {
		return _pharmaApplicationLocalService;
	}

	@Override
	public void setWrappedService(
		PharmaApplicationLocalService pharmaApplicationLocalService) {

		_pharmaApplicationLocalService = pharmaApplicationLocalService;
	}

	private PharmaApplicationLocalService _pharmaApplicationLocalService;

}