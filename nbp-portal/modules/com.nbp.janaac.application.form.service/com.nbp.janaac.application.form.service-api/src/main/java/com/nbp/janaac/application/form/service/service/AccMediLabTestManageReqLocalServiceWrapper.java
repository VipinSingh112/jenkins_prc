/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AccMediLabTestManageReqLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AccMediLabTestManageReqLocalService
 * @generated
 */
public class AccMediLabTestManageReqLocalServiceWrapper
	implements AccMediLabTestManageReqLocalService,
			   ServiceWrapper<AccMediLabTestManageReqLocalService> {

	public AccMediLabTestManageReqLocalServiceWrapper() {
		this(null);
	}

	public AccMediLabTestManageReqLocalServiceWrapper(
		AccMediLabTestManageReqLocalService
			accMediLabTestManageReqLocalService) {

		_accMediLabTestManageReqLocalService =
			accMediLabTestManageReqLocalService;
	}

	/**
	 * Adds the acc medi lab test manage req to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccMediLabTestManageReqLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accMediLabTestManageReq the acc medi lab test manage req
	 * @return the acc medi lab test manage req that was added
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccMediLabTestManageReq
		addAccMediLabTestManageReq(
			com.nbp.janaac.application.form.service.model.
				AccMediLabTestManageReq accMediLabTestManageReq) {

		return _accMediLabTestManageReqLocalService.addAccMediLabTestManageReq(
			accMediLabTestManageReq);
	}

	/**
	 * Creates a new acc medi lab test manage req with the primary key. Does not add the acc medi lab test manage req to the database.
	 *
	 * @param accMediLabTestManageReqId the primary key for the new acc medi lab test manage req
	 * @return the new acc medi lab test manage req
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccMediLabTestManageReq
		createAccMediLabTestManageReq(long accMediLabTestManageReqId) {

		return _accMediLabTestManageReqLocalService.
			createAccMediLabTestManageReq(accMediLabTestManageReqId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accMediLabTestManageReqLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the acc medi lab test manage req from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccMediLabTestManageReqLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accMediLabTestManageReq the acc medi lab test manage req
	 * @return the acc medi lab test manage req that was removed
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccMediLabTestManageReq
		deleteAccMediLabTestManageReq(
			com.nbp.janaac.application.form.service.model.
				AccMediLabTestManageReq accMediLabTestManageReq) {

		return _accMediLabTestManageReqLocalService.
			deleteAccMediLabTestManageReq(accMediLabTestManageReq);
	}

	/**
	 * Deletes the acc medi lab test manage req with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccMediLabTestManageReqLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accMediLabTestManageReqId the primary key of the acc medi lab test manage req
	 * @return the acc medi lab test manage req that was removed
	 * @throws PortalException if a acc medi lab test manage req with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccMediLabTestManageReq
			deleteAccMediLabTestManageReq(long accMediLabTestManageReqId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accMediLabTestManageReqLocalService.
			deleteAccMediLabTestManageReq(accMediLabTestManageReqId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accMediLabTestManageReqLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _accMediLabTestManageReqLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _accMediLabTestManageReqLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _accMediLabTestManageReqLocalService.dynamicQuery();
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

		return _accMediLabTestManageReqLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccMediLabTestManageReqModelImpl</code>.
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

		return _accMediLabTestManageReqLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccMediLabTestManageReqModelImpl</code>.
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

		return _accMediLabTestManageReqLocalService.dynamicQuery(
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

		return _accMediLabTestManageReqLocalService.dynamicQueryCount(
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

		return _accMediLabTestManageReqLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.janaac.application.form.service.model.AccMediLabTestManageReq
		fetchAccMediLabTestManageReq(long accMediLabTestManageReqId) {

		return _accMediLabTestManageReqLocalService.
			fetchAccMediLabTestManageReq(accMediLabTestManageReqId);
	}

	/**
	 * Returns the acc medi lab test manage req matching the UUID and group.
	 *
	 * @param uuid the acc medi lab test manage req's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acc medi lab test manage req, or <code>null</code> if a matching acc medi lab test manage req could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccMediLabTestManageReq
		fetchAccMediLabTestManageReqByUuidAndGroupId(
			String uuid, long groupId) {

		return _accMediLabTestManageReqLocalService.
			fetchAccMediLabTestManageReqByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns the acc medi lab test manage req with the primary key.
	 *
	 * @param accMediLabTestManageReqId the primary key of the acc medi lab test manage req
	 * @return the acc medi lab test manage req
	 * @throws PortalException if a acc medi lab test manage req with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccMediLabTestManageReq
			getAccMediLabTestManageReq(long accMediLabTestManageReqId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accMediLabTestManageReqLocalService.getAccMediLabTestManageReq(
			accMediLabTestManageReqId);
	}

	/**
	 * Returns the acc medi lab test manage req matching the UUID and group.
	 *
	 * @param uuid the acc medi lab test manage req's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acc medi lab test manage req
	 * @throws PortalException if a matching acc medi lab test manage req could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccMediLabTestManageReq
			getAccMediLabTestManageReqByUuidAndGroupId(
				String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accMediLabTestManageReqLocalService.
			getAccMediLabTestManageReqByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the acc medi lab test manage reqs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccMediLabTestManageReqModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc medi lab test manage reqs
	 * @param end the upper bound of the range of acc medi lab test manage reqs (not inclusive)
	 * @return the range of acc medi lab test manage reqs
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AccMediLabTestManageReq>
			getAccMediLabTestManageReqs(int start, int end) {

		return _accMediLabTestManageReqLocalService.getAccMediLabTestManageReqs(
			start, end);
	}

	/**
	 * Returns all the acc medi lab test manage reqs matching the UUID and company.
	 *
	 * @param uuid the UUID of the acc medi lab test manage reqs
	 * @param companyId the primary key of the company
	 * @return the matching acc medi lab test manage reqs, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AccMediLabTestManageReq>
			getAccMediLabTestManageReqsByUuidAndCompanyId(
				String uuid, long companyId) {

		return _accMediLabTestManageReqLocalService.
			getAccMediLabTestManageReqsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of acc medi lab test manage reqs matching the UUID and company.
	 *
	 * @param uuid the UUID of the acc medi lab test manage reqs
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of acc medi lab test manage reqs
	 * @param end the upper bound of the range of acc medi lab test manage reqs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching acc medi lab test manage reqs, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AccMediLabTestManageReq>
			getAccMediLabTestManageReqsByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.nbp.janaac.application.form.service.model.
						AccMediLabTestManageReq> orderByComparator) {

		return _accMediLabTestManageReqLocalService.
			getAccMediLabTestManageReqsByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of acc medi lab test manage reqs.
	 *
	 * @return the number of acc medi lab test manage reqs
	 */
	@Override
	public int getAccMediLabTestManageReqsCount() {
		return _accMediLabTestManageReqLocalService.
			getAccMediLabTestManageReqsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _accMediLabTestManageReqLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _accMediLabTestManageReqLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _accMediLabTestManageReqLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.janaac.application.form.service.model.AccMediLabTestManageReq
			getJANAAC_ByApplicationId(long janaacApplicationId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccMediLabTestManageReqException {

		return _accMediLabTestManageReqLocalService.getJANAAC_ByApplicationId(
			janaacApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _accMediLabTestManageReqLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accMediLabTestManageReqLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the acc medi lab test manage req in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccMediLabTestManageReqLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accMediLabTestManageReq the acc medi lab test manage req
	 * @return the acc medi lab test manage req that was updated
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccMediLabTestManageReq
		updateAccMediLabTestManageReq(
			com.nbp.janaac.application.form.service.model.
				AccMediLabTestManageReq accMediLabTestManageReq) {

		return _accMediLabTestManageReqLocalService.
			updateAccMediLabTestManageReq(accMediLabTestManageReq);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _accMediLabTestManageReqLocalService.getBasePersistence();
	}

	@Override
	public AccMediLabTestManageReqLocalService getWrappedService() {
		return _accMediLabTestManageReqLocalService;
	}

	@Override
	public void setWrappedService(
		AccMediLabTestManageReqLocalService
			accMediLabTestManageReqLocalService) {

		_accMediLabTestManageReqLocalService =
			accMediLabTestManageReqLocalService;
	}

	private AccMediLabTestManageReqLocalService
		_accMediLabTestManageReqLocalService;

}