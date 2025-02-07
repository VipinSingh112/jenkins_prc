/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link JADSCInformationRequestLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see JADSCInformationRequestLocalService
 * @generated
 */
public class JADSCInformationRequestLocalServiceWrapper
	implements JADSCInformationRequestLocalService,
			   ServiceWrapper<JADSCInformationRequestLocalService> {

	public JADSCInformationRequestLocalServiceWrapper() {
		this(null);
	}

	public JADSCInformationRequestLocalServiceWrapper(
		JADSCInformationRequestLocalService
			jadscInformationRequestLocalService) {

		_jadscInformationRequestLocalService =
			jadscInformationRequestLocalService;
	}

	/**
	 * Adds the jadsc information request to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JADSCInformationRequestLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscInformationRequest the jadsc information request
	 * @return the jadsc information request that was added
	 */
	@Override
	public com.nbp.jadsc.application.form.service.model.JADSCInformationRequest
		addJADSCInformationRequest(
			com.nbp.jadsc.application.form.service.model.JADSCInformationRequest
				jadscInformationRequest) {

		return _jadscInformationRequestLocalService.addJADSCInformationRequest(
			jadscInformationRequest);
	}

	/**
	 * Creates a new jadsc information request with the primary key. Does not add the jadsc information request to the database.
	 *
	 * @param jadscInfoRequestId the primary key for the new jadsc information request
	 * @return the new jadsc information request
	 */
	@Override
	public com.nbp.jadsc.application.form.service.model.JADSCInformationRequest
		createJADSCInformationRequest(long jadscInfoRequestId) {

		return _jadscInformationRequestLocalService.
			createJADSCInformationRequest(jadscInfoRequestId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscInformationRequestLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the jadsc information request from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JADSCInformationRequestLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscInformationRequest the jadsc information request
	 * @return the jadsc information request that was removed
	 */
	@Override
	public com.nbp.jadsc.application.form.service.model.JADSCInformationRequest
		deleteJADSCInformationRequest(
			com.nbp.jadsc.application.form.service.model.JADSCInformationRequest
				jadscInformationRequest) {

		return _jadscInformationRequestLocalService.
			deleteJADSCInformationRequest(jadscInformationRequest);
	}

	/**
	 * Deletes the jadsc information request with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JADSCInformationRequestLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscInfoRequestId the primary key of the jadsc information request
	 * @return the jadsc information request that was removed
	 * @throws PortalException if a jadsc information request with the primary key could not be found
	 */
	@Override
	public com.nbp.jadsc.application.form.service.model.JADSCInformationRequest
			deleteJADSCInformationRequest(long jadscInfoRequestId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscInformationRequestLocalService.
			deleteJADSCInformationRequest(jadscInfoRequestId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscInformationRequestLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _jadscInformationRequestLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _jadscInformationRequestLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _jadscInformationRequestLocalService.dynamicQuery();
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

		return _jadscInformationRequestLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.application.form.service.model.impl.JADSCInformationRequestModelImpl</code>.
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

		return _jadscInformationRequestLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.application.form.service.model.impl.JADSCInformationRequestModelImpl</code>.
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

		return _jadscInformationRequestLocalService.dynamicQuery(
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

		return _jadscInformationRequestLocalService.dynamicQueryCount(
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

		return _jadscInformationRequestLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.jadsc.application.form.service.model.JADSCInformationRequest
		fetchJADSCInformationRequest(long jadscInfoRequestId) {

		return _jadscInformationRequestLocalService.
			fetchJADSCInformationRequest(jadscInfoRequestId);
	}

	/**
	 * Returns the jadsc information request matching the UUID and group.
	 *
	 * @param uuid the jadsc information request's UUID
	 * @param groupId the primary key of the group
	 * @return the matching jadsc information request, or <code>null</code> if a matching jadsc information request could not be found
	 */
	@Override
	public com.nbp.jadsc.application.form.service.model.JADSCInformationRequest
		fetchJADSCInformationRequestByUuidAndGroupId(
			String uuid, long groupId) {

		return _jadscInformationRequestLocalService.
			fetchJADSCInformationRequestByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _jadscInformationRequestLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _jadscInformationRequestLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _jadscInformationRequestLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.jadsc.application.form.service.model.JADSCInformationRequest
			getJADSCBy_Id(long jadscApplicationId)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCInformationRequestException {

		return _jadscInformationRequestLocalService.getJADSCBy_Id(
			jadscApplicationId);
	}

	/**
	 * Returns the jadsc information request with the primary key.
	 *
	 * @param jadscInfoRequestId the primary key of the jadsc information request
	 * @return the jadsc information request
	 * @throws PortalException if a jadsc information request with the primary key could not be found
	 */
	@Override
	public com.nbp.jadsc.application.form.service.model.JADSCInformationRequest
			getJADSCInformationRequest(long jadscInfoRequestId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscInformationRequestLocalService.getJADSCInformationRequest(
			jadscInfoRequestId);
	}

	/**
	 * Returns the jadsc information request matching the UUID and group.
	 *
	 * @param uuid the jadsc information request's UUID
	 * @param groupId the primary key of the group
	 * @return the matching jadsc information request
	 * @throws PortalException if a matching jadsc information request could not be found
	 */
	@Override
	public com.nbp.jadsc.application.form.service.model.JADSCInformationRequest
			getJADSCInformationRequestByUuidAndGroupId(
				String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscInformationRequestLocalService.
			getJADSCInformationRequestByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the jadsc information requests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.application.form.service.model.impl.JADSCInformationRequestModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc information requests
	 * @param end the upper bound of the range of jadsc information requests (not inclusive)
	 * @return the range of jadsc information requests
	 */
	@Override
	public java.util.List
		<com.nbp.jadsc.application.form.service.model.JADSCInformationRequest>
			getJADSCInformationRequests(int start, int end) {

		return _jadscInformationRequestLocalService.getJADSCInformationRequests(
			start, end);
	}

	/**
	 * Returns all the jadsc information requests matching the UUID and company.
	 *
	 * @param uuid the UUID of the jadsc information requests
	 * @param companyId the primary key of the company
	 * @return the matching jadsc information requests, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.jadsc.application.form.service.model.JADSCInformationRequest>
			getJADSCInformationRequestsByUuidAndCompanyId(
				String uuid, long companyId) {

		return _jadscInformationRequestLocalService.
			getJADSCInformationRequestsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of jadsc information requests matching the UUID and company.
	 *
	 * @param uuid the UUID of the jadsc information requests
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of jadsc information requests
	 * @param end the upper bound of the range of jadsc information requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching jadsc information requests, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.jadsc.application.form.service.model.JADSCInformationRequest>
			getJADSCInformationRequestsByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.nbp.jadsc.application.form.service.model.
						JADSCInformationRequest> orderByComparator) {

		return _jadscInformationRequestLocalService.
			getJADSCInformationRequestsByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of jadsc information requests.
	 *
	 * @return the number of jadsc information requests
	 */
	@Override
	public int getJADSCInformationRequestsCount() {
		return _jadscInformationRequestLocalService.
			getJADSCInformationRequestsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _jadscInformationRequestLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscInformationRequestLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the jadsc information request in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JADSCInformationRequestLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscInformationRequest the jadsc information request
	 * @return the jadsc information request that was updated
	 */
	@Override
	public com.nbp.jadsc.application.form.service.model.JADSCInformationRequest
		updateJADSCInformationRequest(
			com.nbp.jadsc.application.form.service.model.JADSCInformationRequest
				jadscInformationRequest) {

		return _jadscInformationRequestLocalService.
			updateJADSCInformationRequest(jadscInformationRequest);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _jadscInformationRequestLocalService.getBasePersistence();
	}

	@Override
	public JADSCInformationRequestLocalService getWrappedService() {
		return _jadscInformationRequestLocalService;
	}

	@Override
	public void setWrappedService(
		JADSCInformationRequestLocalService
			jadscInformationRequestLocalService) {

		_jadscInformationRequestLocalService =
			jadscInformationRequestLocalService;
	}

	private JADSCInformationRequestLocalService
		_jadscInformationRequestLocalService;

}