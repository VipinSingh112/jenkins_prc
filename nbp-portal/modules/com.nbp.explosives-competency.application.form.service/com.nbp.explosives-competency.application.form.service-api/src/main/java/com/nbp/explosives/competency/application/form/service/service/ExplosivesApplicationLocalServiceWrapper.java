/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link ExplosivesApplicationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ExplosivesApplicationLocalService
 * @generated
 */
public class ExplosivesApplicationLocalServiceWrapper
	implements ExplosivesApplicationLocalService,
			   ServiceWrapper<ExplosivesApplicationLocalService> {

	public ExplosivesApplicationLocalServiceWrapper() {
		this(null);
	}

	public ExplosivesApplicationLocalServiceWrapper(
		ExplosivesApplicationLocalService explosivesApplicationLocalService) {

		_explosivesApplicationLocalService = explosivesApplicationLocalService;
	}

	/**
	 * Adds the explosives application to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ExplosivesApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param explosivesApplication the explosives application
	 * @return the explosives application that was added
	 */
	@Override
	public com.nbp.explosives.competency.application.form.service.model.
		ExplosivesApplication addExplosivesApplication(
			com.nbp.explosives.competency.application.form.service.model.
				ExplosivesApplication explosivesApplication) {

		return _explosivesApplicationLocalService.addExplosivesApplication(
			explosivesApplication);
	}

	/**
	 * Creates a new explosives application with the primary key. Does not add the explosives application to the database.
	 *
	 * @param explosivesApplicationId the primary key for the new explosives application
	 * @return the new explosives application
	 */
	@Override
	public com.nbp.explosives.competency.application.form.service.model.
		ExplosivesApplication createExplosivesApplication(
			long explosivesApplicationId) {

		return _explosivesApplicationLocalService.createExplosivesApplication(
			explosivesApplicationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _explosivesApplicationLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the explosives application from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ExplosivesApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param explosivesApplication the explosives application
	 * @return the explosives application that was removed
	 */
	@Override
	public com.nbp.explosives.competency.application.form.service.model.
		ExplosivesApplication deleteExplosivesApplication(
			com.nbp.explosives.competency.application.form.service.model.
				ExplosivesApplication explosivesApplication) {

		return _explosivesApplicationLocalService.deleteExplosivesApplication(
			explosivesApplication);
	}

	/**
	 * Deletes the explosives application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ExplosivesApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param explosivesApplicationId the primary key of the explosives application
	 * @return the explosives application that was removed
	 * @throws PortalException if a explosives application with the primary key could not be found
	 */
	@Override
	public com.nbp.explosives.competency.application.form.service.model.
		ExplosivesApplication deleteExplosivesApplication(
				long explosivesApplicationId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _explosivesApplicationLocalService.deleteExplosivesApplication(
			explosivesApplicationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _explosivesApplicationLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _explosivesApplicationLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _explosivesApplicationLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _explosivesApplicationLocalService.dynamicQuery();
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

		return _explosivesApplicationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.explosives.competency.application.form.service.model.impl.ExplosivesApplicationModelImpl</code>.
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

		return _explosivesApplicationLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.explosives.competency.application.form.service.model.impl.ExplosivesApplicationModelImpl</code>.
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

		return _explosivesApplicationLocalService.dynamicQuery(
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

		return _explosivesApplicationLocalService.dynamicQueryCount(
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

		return _explosivesApplicationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.explosives.competency.application.form.service.model.
		ExplosivesApplication fetchExplosivesApplication(
			long explosivesApplicationId) {

		return _explosivesApplicationLocalService.fetchExplosivesApplication(
			explosivesApplicationId);
	}

	/**
	 * Returns the explosives application matching the UUID and group.
	 *
	 * @param uuid the explosives application's UUID
	 * @param groupId the primary key of the group
	 * @return the matching explosives application, or <code>null</code> if a matching explosives application could not be found
	 */
	@Override
	public com.nbp.explosives.competency.application.form.service.model.
		ExplosivesApplication fetchExplosivesApplicationByUuidAndGroupId(
			String uuid, long groupId) {

		return _explosivesApplicationLocalService.
			fetchExplosivesApplicationByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _explosivesApplicationLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.explosives.competency.application.form.service.model.
			ExplosivesApplication> getExplosiveAppByStatusUser(
				int status, long userId) {

		return _explosivesApplicationLocalService.getExplosiveAppByStatusUser(
			status, userId);
	}

	@Override
	public com.nbp.explosives.competency.application.form.service.model.
		ExplosivesApplication getExplosiveByAppNo(String applicationNumber)
			throws com.nbp.explosives.competency.application.form.service.
				exception.NoSuchExplosivesApplicationException {

		return _explosivesApplicationLocalService.getExplosiveByAppNo(
			applicationNumber);
	}

	@Override
	public com.nbp.explosives.competency.application.form.service.model.
		ExplosivesApplication getExplosiveByCaseId(String caseId)
			throws com.nbp.explosives.competency.application.form.service.
				exception.NoSuchExplosivesApplicationException {

		return _explosivesApplicationLocalService.getExplosiveByCaseId(caseId);
	}

	@Override
	public com.nbp.explosives.competency.application.form.service.model.
		ExplosivesApplication getExplosiveById(long factoriesApplicationId)
			throws com.nbp.explosives.competency.application.form.service.
				exception.NoSuchExplosivesApplicationException {

		return _explosivesApplicationLocalService.getExplosiveById(
			factoriesApplicationId);
	}

	@Override
	public java.util.List
		<com.nbp.explosives.competency.application.form.service.model.
			ExplosivesApplication> getExplosiveByStatus(int status) {

		return _explosivesApplicationLocalService.getExplosiveByStatus(status);
	}

	@Override
	public java.util.List<String> getExplosiveDistinctCategory() {
		return _explosivesApplicationLocalService.
			getExplosiveDistinctCategory();
	}

	@Override
	public com.nbp.explosives.competency.application.form.service.model.
		ExplosivesApplication getExplosiveRegstByAT_AppNo(
				String typeOfTransaction, String expiredLicenseAppNumber)
			throws com.nbp.explosives.competency.application.form.service.
				exception.NoSuchExplosivesApplicationException {

		return _explosivesApplicationLocalService.getExplosiveRegstByAT_AppNo(
			typeOfTransaction, expiredLicenseAppNumber);
	}

	/**
	 * Returns the explosives application with the primary key.
	 *
	 * @param explosivesApplicationId the primary key of the explosives application
	 * @return the explosives application
	 * @throws PortalException if a explosives application with the primary key could not be found
	 */
	@Override
	public com.nbp.explosives.competency.application.form.service.model.
		ExplosivesApplication getExplosivesApplication(
				long explosivesApplicationId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _explosivesApplicationLocalService.getExplosivesApplication(
			explosivesApplicationId);
	}

	/**
	 * Returns the explosives application matching the UUID and group.
	 *
	 * @param uuid the explosives application's UUID
	 * @param groupId the primary key of the group
	 * @return the matching explosives application
	 * @throws PortalException if a matching explosives application could not be found
	 */
	@Override
	public com.nbp.explosives.competency.application.form.service.model.
		ExplosivesApplication getExplosivesApplicationByUuidAndGroupId(
				String uuid, long groupId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _explosivesApplicationLocalService.
			getExplosivesApplicationByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the explosives applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.explosives.competency.application.form.service.model.impl.ExplosivesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of explosives applications
	 * @param end the upper bound of the range of explosives applications (not inclusive)
	 * @return the range of explosives applications
	 */
	@Override
	public java.util.List
		<com.nbp.explosives.competency.application.form.service.model.
			ExplosivesApplication> getExplosivesApplications(
				int start, int end) {

		return _explosivesApplicationLocalService.getExplosivesApplications(
			start, end);
	}

	/**
	 * Returns all the explosives applications matching the UUID and company.
	 *
	 * @param uuid the UUID of the explosives applications
	 * @param companyId the primary key of the company
	 * @return the matching explosives applications, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.explosives.competency.application.form.service.model.
			ExplosivesApplication> getExplosivesApplicationsByUuidAndCompanyId(
				String uuid, long companyId) {

		return _explosivesApplicationLocalService.
			getExplosivesApplicationsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of explosives applications matching the UUID and company.
	 *
	 * @param uuid the UUID of the explosives applications
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of explosives applications
	 * @param end the upper bound of the range of explosives applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching explosives applications, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.explosives.competency.application.form.service.model.
			ExplosivesApplication> getExplosivesApplicationsByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.nbp.explosives.competency.application.form.service.
						model.ExplosivesApplication> orderByComparator) {

		return _explosivesApplicationLocalService.
			getExplosivesApplicationsByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of explosives applications.
	 *
	 * @return the number of explosives applications
	 */
	@Override
	public int getExplosivesApplicationsCount() {
		return _explosivesApplicationLocalService.
			getExplosivesApplicationsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _explosivesApplicationLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _explosivesApplicationLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _explosivesApplicationLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _explosivesApplicationLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the explosives application in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ExplosivesApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param explosivesApplication the explosives application
	 * @return the explosives application that was updated
	 */
	@Override
	public com.nbp.explosives.competency.application.form.service.model.
		ExplosivesApplication updateExplosivesApplication(
			com.nbp.explosives.competency.application.form.service.model.
				ExplosivesApplication explosivesApplication) {

		return _explosivesApplicationLocalService.updateExplosivesApplication(
			explosivesApplication);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _explosivesApplicationLocalService.getBasePersistence();
	}

	@Override
	public ExplosivesApplicationLocalService getWrappedService() {
		return _explosivesApplicationLocalService;
	}

	@Override
	public void setWrappedService(
		ExplosivesApplicationLocalService explosivesApplicationLocalService) {

		_explosivesApplicationLocalService = explosivesApplicationLocalService;
	}

	private ExplosivesApplicationLocalService
		_explosivesApplicationLocalService;

}