/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link JADSCCertificateOfServiceLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see JADSCCertificateOfServiceLocalService
 * @generated
 */
public class JADSCCertificateOfServiceLocalServiceWrapper
	implements JADSCCertificateOfServiceLocalService,
			   ServiceWrapper<JADSCCertificateOfServiceLocalService> {

	public JADSCCertificateOfServiceLocalServiceWrapper() {
		this(null);
	}

	public JADSCCertificateOfServiceLocalServiceWrapper(
		JADSCCertificateOfServiceLocalService
			jadscCertificateOfServiceLocalService) {

		_jadscCertificateOfServiceLocalService =
			jadscCertificateOfServiceLocalService;
	}

	/**
	 * Adds the jadsc certificate of service to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JADSCCertificateOfServiceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscCertificateOfService the jadsc certificate of service
	 * @return the jadsc certificate of service that was added
	 */
	@Override
	public
		com.nbp.jadsc.application.form.service.model.JADSCCertificateOfService
			addJADSCCertificateOfService(
				com.nbp.jadsc.application.form.service.model.
					JADSCCertificateOfService jadscCertificateOfService) {

		return _jadscCertificateOfServiceLocalService.
			addJADSCCertificateOfService(jadscCertificateOfService);
	}

	/**
	 * Creates a new jadsc certificate of service with the primary key. Does not add the jadsc certificate of service to the database.
	 *
	 * @param jadscCOSId the primary key for the new jadsc certificate of service
	 * @return the new jadsc certificate of service
	 */
	@Override
	public
		com.nbp.jadsc.application.form.service.model.JADSCCertificateOfService
			createJADSCCertificateOfService(long jadscCOSId) {

		return _jadscCertificateOfServiceLocalService.
			createJADSCCertificateOfService(jadscCOSId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscCertificateOfServiceLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the jadsc certificate of service from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JADSCCertificateOfServiceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscCertificateOfService the jadsc certificate of service
	 * @return the jadsc certificate of service that was removed
	 */
	@Override
	public
		com.nbp.jadsc.application.form.service.model.JADSCCertificateOfService
			deleteJADSCCertificateOfService(
				com.nbp.jadsc.application.form.service.model.
					JADSCCertificateOfService jadscCertificateOfService) {

		return _jadscCertificateOfServiceLocalService.
			deleteJADSCCertificateOfService(jadscCertificateOfService);
	}

	/**
	 * Deletes the jadsc certificate of service with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JADSCCertificateOfServiceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscCOSId the primary key of the jadsc certificate of service
	 * @return the jadsc certificate of service that was removed
	 * @throws PortalException if a jadsc certificate of service with the primary key could not be found
	 */
	@Override
	public
		com.nbp.jadsc.application.form.service.model.JADSCCertificateOfService
				deleteJADSCCertificateOfService(long jadscCOSId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscCertificateOfServiceLocalService.
			deleteJADSCCertificateOfService(jadscCOSId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscCertificateOfServiceLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _jadscCertificateOfServiceLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _jadscCertificateOfServiceLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _jadscCertificateOfServiceLocalService.dynamicQuery();
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

		return _jadscCertificateOfServiceLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.application.form.service.model.impl.JADSCCertificateOfServiceModelImpl</code>.
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

		return _jadscCertificateOfServiceLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.application.form.service.model.impl.JADSCCertificateOfServiceModelImpl</code>.
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

		return _jadscCertificateOfServiceLocalService.dynamicQuery(
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

		return _jadscCertificateOfServiceLocalService.dynamicQueryCount(
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

		return _jadscCertificateOfServiceLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.jadsc.application.form.service.model.JADSCCertificateOfService
			fetchJADSCCertificateOfService(long jadscCOSId) {

		return _jadscCertificateOfServiceLocalService.
			fetchJADSCCertificateOfService(jadscCOSId);
	}

	/**
	 * Returns the jadsc certificate of service matching the UUID and group.
	 *
	 * @param uuid the jadsc certificate of service's UUID
	 * @param groupId the primary key of the group
	 * @return the matching jadsc certificate of service, or <code>null</code> if a matching jadsc certificate of service could not be found
	 */
	@Override
	public
		com.nbp.jadsc.application.form.service.model.JADSCCertificateOfService
			fetchJADSCCertificateOfServiceByUuidAndGroupId(
				String uuid, long groupId) {

		return _jadscCertificateOfServiceLocalService.
			fetchJADSCCertificateOfServiceByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _jadscCertificateOfServiceLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _jadscCertificateOfServiceLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _jadscCertificateOfServiceLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public
		com.nbp.jadsc.application.form.service.model.JADSCCertificateOfService
				getJADSCBy_Id(long jadscApplicationId)
			throws com.nbp.jadsc.application.form.service.exception.
				NoSuchJADSCCertificateOfServiceException {

		return _jadscCertificateOfServiceLocalService.getJADSCBy_Id(
			jadscApplicationId);
	}

	/**
	 * Returns the jadsc certificate of service with the primary key.
	 *
	 * @param jadscCOSId the primary key of the jadsc certificate of service
	 * @return the jadsc certificate of service
	 * @throws PortalException if a jadsc certificate of service with the primary key could not be found
	 */
	@Override
	public
		com.nbp.jadsc.application.form.service.model.JADSCCertificateOfService
				getJADSCCertificateOfService(long jadscCOSId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscCertificateOfServiceLocalService.
			getJADSCCertificateOfService(jadscCOSId);
	}

	/**
	 * Returns the jadsc certificate of service matching the UUID and group.
	 *
	 * @param uuid the jadsc certificate of service's UUID
	 * @param groupId the primary key of the group
	 * @return the matching jadsc certificate of service
	 * @throws PortalException if a matching jadsc certificate of service could not be found
	 */
	@Override
	public
		com.nbp.jadsc.application.form.service.model.JADSCCertificateOfService
				getJADSCCertificateOfServiceByUuidAndGroupId(
					String uuid, long groupId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscCertificateOfServiceLocalService.
			getJADSCCertificateOfServiceByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the jadsc certificate of services.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.application.form.service.model.impl.JADSCCertificateOfServiceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc certificate of services
	 * @param end the upper bound of the range of jadsc certificate of services (not inclusive)
	 * @return the range of jadsc certificate of services
	 */
	@Override
	public java.util.List
		<com.nbp.jadsc.application.form.service.model.JADSCCertificateOfService>
			getJADSCCertificateOfServices(int start, int end) {

		return _jadscCertificateOfServiceLocalService.
			getJADSCCertificateOfServices(start, end);
	}

	/**
	 * Returns all the jadsc certificate of services matching the UUID and company.
	 *
	 * @param uuid the UUID of the jadsc certificate of services
	 * @param companyId the primary key of the company
	 * @return the matching jadsc certificate of services, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.jadsc.application.form.service.model.JADSCCertificateOfService>
			getJADSCCertificateOfServicesByUuidAndCompanyId(
				String uuid, long companyId) {

		return _jadscCertificateOfServiceLocalService.
			getJADSCCertificateOfServicesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of jadsc certificate of services matching the UUID and company.
	 *
	 * @param uuid the UUID of the jadsc certificate of services
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of jadsc certificate of services
	 * @param end the upper bound of the range of jadsc certificate of services (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching jadsc certificate of services, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.jadsc.application.form.service.model.JADSCCertificateOfService>
			getJADSCCertificateOfServicesByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.nbp.jadsc.application.form.service.model.
						JADSCCertificateOfService> orderByComparator) {

		return _jadscCertificateOfServiceLocalService.
			getJADSCCertificateOfServicesByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of jadsc certificate of services.
	 *
	 * @return the number of jadsc certificate of services
	 */
	@Override
	public int getJADSCCertificateOfServicesCount() {
		return _jadscCertificateOfServiceLocalService.
			getJADSCCertificateOfServicesCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _jadscCertificateOfServiceLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscCertificateOfServiceLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the jadsc certificate of service in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JADSCCertificateOfServiceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscCertificateOfService the jadsc certificate of service
	 * @return the jadsc certificate of service that was updated
	 */
	@Override
	public
		com.nbp.jadsc.application.form.service.model.JADSCCertificateOfService
			updateJADSCCertificateOfService(
				com.nbp.jadsc.application.form.service.model.
					JADSCCertificateOfService jadscCertificateOfService) {

		return _jadscCertificateOfServiceLocalService.
			updateJADSCCertificateOfService(jadscCertificateOfService);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _jadscCertificateOfServiceLocalService.getBasePersistence();
	}

	@Override
	public JADSCCertificateOfServiceLocalService getWrappedService() {
		return _jadscCertificateOfServiceLocalService;
	}

	@Override
	public void setWrappedService(
		JADSCCertificateOfServiceLocalService
			jadscCertificateOfServiceLocalService) {

		_jadscCertificateOfServiceLocalService =
			jadscCertificateOfServiceLocalService;
	}

	private JADSCCertificateOfServiceLocalService
		_jadscCertificateOfServiceLocalService;

}