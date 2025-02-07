/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AccInsBodiesOtherReqLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AccInsBodiesOtherReqLocalService
 * @generated
 */
public class AccInsBodiesOtherReqLocalServiceWrapper
	implements AccInsBodiesOtherReqLocalService,
			   ServiceWrapper<AccInsBodiesOtherReqLocalService> {

	public AccInsBodiesOtherReqLocalServiceWrapper() {
		this(null);
	}

	public AccInsBodiesOtherReqLocalServiceWrapper(
		AccInsBodiesOtherReqLocalService accInsBodiesOtherReqLocalService) {

		_accInsBodiesOtherReqLocalService = accInsBodiesOtherReqLocalService;
	}

	/**
	 * Adds the acc ins bodies other req to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccInsBodiesOtherReqLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accInsBodiesOtherReq the acc ins bodies other req
	 * @return the acc ins bodies other req that was added
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccInsBodiesOtherReq
		addAccInsBodiesOtherReq(
			com.nbp.janaac.application.form.service.model.AccInsBodiesOtherReq
				accInsBodiesOtherReq) {

		return _accInsBodiesOtherReqLocalService.addAccInsBodiesOtherReq(
			accInsBodiesOtherReq);
	}

	/**
	 * Creates a new acc ins bodies other req with the primary key. Does not add the acc ins bodies other req to the database.
	 *
	 * @param accInsBodiesOtherReqId the primary key for the new acc ins bodies other req
	 * @return the new acc ins bodies other req
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccInsBodiesOtherReq
		createAccInsBodiesOtherReq(long accInsBodiesOtherReqId) {

		return _accInsBodiesOtherReqLocalService.createAccInsBodiesOtherReq(
			accInsBodiesOtherReqId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accInsBodiesOtherReqLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the acc ins bodies other req from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccInsBodiesOtherReqLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accInsBodiesOtherReq the acc ins bodies other req
	 * @return the acc ins bodies other req that was removed
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccInsBodiesOtherReq
		deleteAccInsBodiesOtherReq(
			com.nbp.janaac.application.form.service.model.AccInsBodiesOtherReq
				accInsBodiesOtherReq) {

		return _accInsBodiesOtherReqLocalService.deleteAccInsBodiesOtherReq(
			accInsBodiesOtherReq);
	}

	/**
	 * Deletes the acc ins bodies other req with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccInsBodiesOtherReqLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accInsBodiesOtherReqId the primary key of the acc ins bodies other req
	 * @return the acc ins bodies other req that was removed
	 * @throws PortalException if a acc ins bodies other req with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccInsBodiesOtherReq
			deleteAccInsBodiesOtherReq(long accInsBodiesOtherReqId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accInsBodiesOtherReqLocalService.deleteAccInsBodiesOtherReq(
			accInsBodiesOtherReqId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accInsBodiesOtherReqLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _accInsBodiesOtherReqLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _accInsBodiesOtherReqLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _accInsBodiesOtherReqLocalService.dynamicQuery();
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

		return _accInsBodiesOtherReqLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccInsBodiesOtherReqModelImpl</code>.
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

		return _accInsBodiesOtherReqLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccInsBodiesOtherReqModelImpl</code>.
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

		return _accInsBodiesOtherReqLocalService.dynamicQuery(
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

		return _accInsBodiesOtherReqLocalService.dynamicQueryCount(
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

		return _accInsBodiesOtherReqLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.janaac.application.form.service.model.AccInsBodiesOtherReq
		fetchAccInsBodiesOtherReq(long accInsBodiesOtherReqId) {

		return _accInsBodiesOtherReqLocalService.fetchAccInsBodiesOtherReq(
			accInsBodiesOtherReqId);
	}

	/**
	 * Returns the acc ins bodies other req matching the UUID and group.
	 *
	 * @param uuid the acc ins bodies other req's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acc ins bodies other req, or <code>null</code> if a matching acc ins bodies other req could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccInsBodiesOtherReq
		fetchAccInsBodiesOtherReqByUuidAndGroupId(String uuid, long groupId) {

		return _accInsBodiesOtherReqLocalService.
			fetchAccInsBodiesOtherReqByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns the acc ins bodies other req with the primary key.
	 *
	 * @param accInsBodiesOtherReqId the primary key of the acc ins bodies other req
	 * @return the acc ins bodies other req
	 * @throws PortalException if a acc ins bodies other req with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccInsBodiesOtherReq
			getAccInsBodiesOtherReq(long accInsBodiesOtherReqId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accInsBodiesOtherReqLocalService.getAccInsBodiesOtherReq(
			accInsBodiesOtherReqId);
	}

	/**
	 * Returns the acc ins bodies other req matching the UUID and group.
	 *
	 * @param uuid the acc ins bodies other req's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acc ins bodies other req
	 * @throws PortalException if a matching acc ins bodies other req could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccInsBodiesOtherReq
			getAccInsBodiesOtherReqByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accInsBodiesOtherReqLocalService.
			getAccInsBodiesOtherReqByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the acc ins bodies other reqs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccInsBodiesOtherReqModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc ins bodies other reqs
	 * @param end the upper bound of the range of acc ins bodies other reqs (not inclusive)
	 * @return the range of acc ins bodies other reqs
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AccInsBodiesOtherReq>
			getAccInsBodiesOtherReqs(int start, int end) {

		return _accInsBodiesOtherReqLocalService.getAccInsBodiesOtherReqs(
			start, end);
	}

	/**
	 * Returns all the acc ins bodies other reqs matching the UUID and company.
	 *
	 * @param uuid the UUID of the acc ins bodies other reqs
	 * @param companyId the primary key of the company
	 * @return the matching acc ins bodies other reqs, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AccInsBodiesOtherReq>
			getAccInsBodiesOtherReqsByUuidAndCompanyId(
				String uuid, long companyId) {

		return _accInsBodiesOtherReqLocalService.
			getAccInsBodiesOtherReqsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of acc ins bodies other reqs matching the UUID and company.
	 *
	 * @param uuid the UUID of the acc ins bodies other reqs
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of acc ins bodies other reqs
	 * @param end the upper bound of the range of acc ins bodies other reqs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching acc ins bodies other reqs, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AccInsBodiesOtherReq>
			getAccInsBodiesOtherReqsByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.nbp.janaac.application.form.service.model.
						AccInsBodiesOtherReq> orderByComparator) {

		return _accInsBodiesOtherReqLocalService.
			getAccInsBodiesOtherReqsByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of acc ins bodies other reqs.
	 *
	 * @return the number of acc ins bodies other reqs
	 */
	@Override
	public int getAccInsBodiesOtherReqsCount() {
		return _accInsBodiesOtherReqLocalService.
			getAccInsBodiesOtherReqsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _accInsBodiesOtherReqLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _accInsBodiesOtherReqLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _accInsBodiesOtherReqLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.janaac.application.form.service.model.AccInsBodiesOtherReq
			getJANAAC_ByApplicationId(long janaacApplicationId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccInsBodiesOtherReqException {

		return _accInsBodiesOtherReqLocalService.getJANAAC_ByApplicationId(
			janaacApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _accInsBodiesOtherReqLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accInsBodiesOtherReqLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the acc ins bodies other req in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccInsBodiesOtherReqLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accInsBodiesOtherReq the acc ins bodies other req
	 * @return the acc ins bodies other req that was updated
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccInsBodiesOtherReq
		updateAccInsBodiesOtherReq(
			com.nbp.janaac.application.form.service.model.AccInsBodiesOtherReq
				accInsBodiesOtherReq) {

		return _accInsBodiesOtherReqLocalService.updateAccInsBodiesOtherReq(
			accInsBodiesOtherReq);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _accInsBodiesOtherReqLocalService.getBasePersistence();
	}

	@Override
	public AccInsBodiesOtherReqLocalService getWrappedService() {
		return _accInsBodiesOtherReqLocalService;
	}

	@Override
	public void setWrappedService(
		AccInsBodiesOtherReqLocalService accInsBodiesOtherReqLocalService) {

		_accInsBodiesOtherReqLocalService = accInsBodiesOtherReqLocalService;
	}

	private AccInsBodiesOtherReqLocalService _accInsBodiesOtherReqLocalService;

}