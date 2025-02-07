/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link JADSCOathRequestLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see JADSCOathRequestLocalService
 * @generated
 */
public class JADSCOathRequestLocalServiceWrapper
	implements JADSCOathRequestLocalService,
			   ServiceWrapper<JADSCOathRequestLocalService> {

	public JADSCOathRequestLocalServiceWrapper() {
		this(null);
	}

	public JADSCOathRequestLocalServiceWrapper(
		JADSCOathRequestLocalService jadscOathRequestLocalService) {

		_jadscOathRequestLocalService = jadscOathRequestLocalService;
	}

	/**
	 * Adds the jadsc oath request to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JADSCOathRequestLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscOathRequest the jadsc oath request
	 * @return the jadsc oath request that was added
	 */
	@Override
	public com.nbp.jadsc.application.form.service.model.JADSCOathRequest
		addJADSCOathRequest(
			com.nbp.jadsc.application.form.service.model.JADSCOathRequest
				jadscOathRequest) {

		return _jadscOathRequestLocalService.addJADSCOathRequest(
			jadscOathRequest);
	}

	/**
	 * Creates a new jadsc oath request with the primary key. Does not add the jadsc oath request to the database.
	 *
	 * @param jadscOathRequestId the primary key for the new jadsc oath request
	 * @return the new jadsc oath request
	 */
	@Override
	public com.nbp.jadsc.application.form.service.model.JADSCOathRequest
		createJADSCOathRequest(long jadscOathRequestId) {

		return _jadscOathRequestLocalService.createJADSCOathRequest(
			jadscOathRequestId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscOathRequestLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the jadsc oath request from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JADSCOathRequestLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscOathRequest the jadsc oath request
	 * @return the jadsc oath request that was removed
	 */
	@Override
	public com.nbp.jadsc.application.form.service.model.JADSCOathRequest
		deleteJADSCOathRequest(
			com.nbp.jadsc.application.form.service.model.JADSCOathRequest
				jadscOathRequest) {

		return _jadscOathRequestLocalService.deleteJADSCOathRequest(
			jadscOathRequest);
	}

	/**
	 * Deletes the jadsc oath request with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JADSCOathRequestLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscOathRequestId the primary key of the jadsc oath request
	 * @return the jadsc oath request that was removed
	 * @throws PortalException if a jadsc oath request with the primary key could not be found
	 */
	@Override
	public com.nbp.jadsc.application.form.service.model.JADSCOathRequest
			deleteJADSCOathRequest(long jadscOathRequestId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscOathRequestLocalService.deleteJADSCOathRequest(
			jadscOathRequestId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscOathRequestLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _jadscOathRequestLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _jadscOathRequestLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _jadscOathRequestLocalService.dynamicQuery();
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

		return _jadscOathRequestLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.application.form.service.model.impl.JADSCOathRequestModelImpl</code>.
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

		return _jadscOathRequestLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.application.form.service.model.impl.JADSCOathRequestModelImpl</code>.
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

		return _jadscOathRequestLocalService.dynamicQuery(
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

		return _jadscOathRequestLocalService.dynamicQueryCount(dynamicQuery);
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

		return _jadscOathRequestLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.jadsc.application.form.service.model.JADSCOathRequest
		fetchJADSCOathRequest(long jadscOathRequestId) {

		return _jadscOathRequestLocalService.fetchJADSCOathRequest(
			jadscOathRequestId);
	}

	/**
	 * Returns the jadsc oath request matching the UUID and group.
	 *
	 * @param uuid the jadsc oath request's UUID
	 * @param groupId the primary key of the group
	 * @return the matching jadsc oath request, or <code>null</code> if a matching jadsc oath request could not be found
	 */
	@Override
	public com.nbp.jadsc.application.form.service.model.JADSCOathRequest
		fetchJADSCOathRequestByUuidAndGroupId(String uuid, long groupId) {

		return _jadscOathRequestLocalService.
			fetchJADSCOathRequestByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _jadscOathRequestLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _jadscOathRequestLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _jadscOathRequestLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.jadsc.application.form.service.model.JADSCOathRequest
			getJADSCBy_Id(long jadscApplicationId)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCOathRequestException {

		return _jadscOathRequestLocalService.getJADSCBy_Id(jadscApplicationId);
	}

	/**
	 * Returns the jadsc oath request with the primary key.
	 *
	 * @param jadscOathRequestId the primary key of the jadsc oath request
	 * @return the jadsc oath request
	 * @throws PortalException if a jadsc oath request with the primary key could not be found
	 */
	@Override
	public com.nbp.jadsc.application.form.service.model.JADSCOathRequest
			getJADSCOathRequest(long jadscOathRequestId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscOathRequestLocalService.getJADSCOathRequest(
			jadscOathRequestId);
	}

	/**
	 * Returns the jadsc oath request matching the UUID and group.
	 *
	 * @param uuid the jadsc oath request's UUID
	 * @param groupId the primary key of the group
	 * @return the matching jadsc oath request
	 * @throws PortalException if a matching jadsc oath request could not be found
	 */
	@Override
	public com.nbp.jadsc.application.form.service.model.JADSCOathRequest
			getJADSCOathRequestByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscOathRequestLocalService.
			getJADSCOathRequestByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the jadsc oath requests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.application.form.service.model.impl.JADSCOathRequestModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc oath requests
	 * @param end the upper bound of the range of jadsc oath requests (not inclusive)
	 * @return the range of jadsc oath requests
	 */
	@Override
	public java.util.List
		<com.nbp.jadsc.application.form.service.model.JADSCOathRequest>
			getJADSCOathRequests(int start, int end) {

		return _jadscOathRequestLocalService.getJADSCOathRequests(start, end);
	}

	/**
	 * Returns all the jadsc oath requests matching the UUID and company.
	 *
	 * @param uuid the UUID of the jadsc oath requests
	 * @param companyId the primary key of the company
	 * @return the matching jadsc oath requests, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.jadsc.application.form.service.model.JADSCOathRequest>
			getJADSCOathRequestsByUuidAndCompanyId(
				String uuid, long companyId) {

		return _jadscOathRequestLocalService.
			getJADSCOathRequestsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of jadsc oath requests matching the UUID and company.
	 *
	 * @param uuid the UUID of the jadsc oath requests
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of jadsc oath requests
	 * @param end the upper bound of the range of jadsc oath requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching jadsc oath requests, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.jadsc.application.form.service.model.JADSCOathRequest>
			getJADSCOathRequestsByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.nbp.jadsc.application.form.service.model.
						JADSCOathRequest> orderByComparator) {

		return _jadscOathRequestLocalService.
			getJADSCOathRequestsByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of jadsc oath requests.
	 *
	 * @return the number of jadsc oath requests
	 */
	@Override
	public int getJADSCOathRequestsCount() {
		return _jadscOathRequestLocalService.getJADSCOathRequestsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _jadscOathRequestLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscOathRequestLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the jadsc oath request in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JADSCOathRequestLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscOathRequest the jadsc oath request
	 * @return the jadsc oath request that was updated
	 */
	@Override
	public com.nbp.jadsc.application.form.service.model.JADSCOathRequest
		updateJADSCOathRequest(
			com.nbp.jadsc.application.form.service.model.JADSCOathRequest
				jadscOathRequest) {

		return _jadscOathRequestLocalService.updateJADSCOathRequest(
			jadscOathRequest);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _jadscOathRequestLocalService.getBasePersistence();
	}

	@Override
	public JADSCOathRequestLocalService getWrappedService() {
		return _jadscOathRequestLocalService;
	}

	@Override
	public void setWrappedService(
		JADSCOathRequestLocalService jadscOathRequestLocalService) {

		_jadscOathRequestLocalService = jadscOathRequestLocalService;
	}

	private JADSCOathRequestLocalService _jadscOathRequestLocalService;

}