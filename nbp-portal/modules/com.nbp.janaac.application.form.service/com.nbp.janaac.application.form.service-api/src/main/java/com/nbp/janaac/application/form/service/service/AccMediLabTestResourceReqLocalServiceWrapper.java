/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AccMediLabTestResourceReqLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AccMediLabTestResourceReqLocalService
 * @generated
 */
public class AccMediLabTestResourceReqLocalServiceWrapper
	implements AccMediLabTestResourceReqLocalService,
			   ServiceWrapper<AccMediLabTestResourceReqLocalService> {

	public AccMediLabTestResourceReqLocalServiceWrapper() {
		this(null);
	}

	public AccMediLabTestResourceReqLocalServiceWrapper(
		AccMediLabTestResourceReqLocalService
			accMediLabTestResourceReqLocalService) {

		_accMediLabTestResourceReqLocalService =
			accMediLabTestResourceReqLocalService;
	}

	/**
	 * Adds the acc medi lab test resource req to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccMediLabTestResourceReqLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accMediLabTestResourceReq the acc medi lab test resource req
	 * @return the acc medi lab test resource req that was added
	 */
	@Override
	public
		com.nbp.janaac.application.form.service.model.AccMediLabTestResourceReq
			addAccMediLabTestResourceReq(
				com.nbp.janaac.application.form.service.model.
					AccMediLabTestResourceReq accMediLabTestResourceReq) {

		return _accMediLabTestResourceReqLocalService.
			addAccMediLabTestResourceReq(accMediLabTestResourceReq);
	}

	/**
	 * Creates a new acc medi lab test resource req with the primary key. Does not add the acc medi lab test resource req to the database.
	 *
	 * @param accMediLabTestResourceReqId the primary key for the new acc medi lab test resource req
	 * @return the new acc medi lab test resource req
	 */
	@Override
	public
		com.nbp.janaac.application.form.service.model.AccMediLabTestResourceReq
			createAccMediLabTestResourceReq(long accMediLabTestResourceReqId) {

		return _accMediLabTestResourceReqLocalService.
			createAccMediLabTestResourceReq(accMediLabTestResourceReqId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accMediLabTestResourceReqLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the acc medi lab test resource req from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccMediLabTestResourceReqLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accMediLabTestResourceReq the acc medi lab test resource req
	 * @return the acc medi lab test resource req that was removed
	 */
	@Override
	public
		com.nbp.janaac.application.form.service.model.AccMediLabTestResourceReq
			deleteAccMediLabTestResourceReq(
				com.nbp.janaac.application.form.service.model.
					AccMediLabTestResourceReq accMediLabTestResourceReq) {

		return _accMediLabTestResourceReqLocalService.
			deleteAccMediLabTestResourceReq(accMediLabTestResourceReq);
	}

	/**
	 * Deletes the acc medi lab test resource req with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccMediLabTestResourceReqLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accMediLabTestResourceReqId the primary key of the acc medi lab test resource req
	 * @return the acc medi lab test resource req that was removed
	 * @throws PortalException if a acc medi lab test resource req with the primary key could not be found
	 */
	@Override
	public
		com.nbp.janaac.application.form.service.model.AccMediLabTestResourceReq
				deleteAccMediLabTestResourceReq(
					long accMediLabTestResourceReqId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _accMediLabTestResourceReqLocalService.
			deleteAccMediLabTestResourceReq(accMediLabTestResourceReqId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accMediLabTestResourceReqLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _accMediLabTestResourceReqLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _accMediLabTestResourceReqLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _accMediLabTestResourceReqLocalService.dynamicQuery();
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

		return _accMediLabTestResourceReqLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccMediLabTestResourceReqModelImpl</code>.
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

		return _accMediLabTestResourceReqLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccMediLabTestResourceReqModelImpl</code>.
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

		return _accMediLabTestResourceReqLocalService.dynamicQuery(
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

		return _accMediLabTestResourceReqLocalService.dynamicQueryCount(
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

		return _accMediLabTestResourceReqLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.janaac.application.form.service.model.AccMediLabTestResourceReq
			fetchAccMediLabTestResourceReq(long accMediLabTestResourceReqId) {

		return _accMediLabTestResourceReqLocalService.
			fetchAccMediLabTestResourceReq(accMediLabTestResourceReqId);
	}

	/**
	 * Returns the acc medi lab test resource req matching the UUID and group.
	 *
	 * @param uuid the acc medi lab test resource req's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acc medi lab test resource req, or <code>null</code> if a matching acc medi lab test resource req could not be found
	 */
	@Override
	public
		com.nbp.janaac.application.form.service.model.AccMediLabTestResourceReq
			fetchAccMediLabTestResourceReqByUuidAndGroupId(
				String uuid, long groupId) {

		return _accMediLabTestResourceReqLocalService.
			fetchAccMediLabTestResourceReqByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns the acc medi lab test resource req with the primary key.
	 *
	 * @param accMediLabTestResourceReqId the primary key of the acc medi lab test resource req
	 * @return the acc medi lab test resource req
	 * @throws PortalException if a acc medi lab test resource req with the primary key could not be found
	 */
	@Override
	public
		com.nbp.janaac.application.form.service.model.AccMediLabTestResourceReq
				getAccMediLabTestResourceReq(long accMediLabTestResourceReqId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _accMediLabTestResourceReqLocalService.
			getAccMediLabTestResourceReq(accMediLabTestResourceReqId);
	}

	/**
	 * Returns the acc medi lab test resource req matching the UUID and group.
	 *
	 * @param uuid the acc medi lab test resource req's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acc medi lab test resource req
	 * @throws PortalException if a matching acc medi lab test resource req could not be found
	 */
	@Override
	public
		com.nbp.janaac.application.form.service.model.AccMediLabTestResourceReq
				getAccMediLabTestResourceReqByUuidAndGroupId(
					String uuid, long groupId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _accMediLabTestResourceReqLocalService.
			getAccMediLabTestResourceReqByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the acc medi lab test resource reqs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccMediLabTestResourceReqModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc medi lab test resource reqs
	 * @param end the upper bound of the range of acc medi lab test resource reqs (not inclusive)
	 * @return the range of acc medi lab test resource reqs
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.
			AccMediLabTestResourceReq> getAccMediLabTestResourceReqs(
				int start, int end) {

		return _accMediLabTestResourceReqLocalService.
			getAccMediLabTestResourceReqs(start, end);
	}

	/**
	 * Returns all the acc medi lab test resource reqs matching the UUID and company.
	 *
	 * @param uuid the UUID of the acc medi lab test resource reqs
	 * @param companyId the primary key of the company
	 * @return the matching acc medi lab test resource reqs, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.
			AccMediLabTestResourceReq>
				getAccMediLabTestResourceReqsByUuidAndCompanyId(
					String uuid, long companyId) {

		return _accMediLabTestResourceReqLocalService.
			getAccMediLabTestResourceReqsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of acc medi lab test resource reqs matching the UUID and company.
	 *
	 * @param uuid the UUID of the acc medi lab test resource reqs
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of acc medi lab test resource reqs
	 * @param end the upper bound of the range of acc medi lab test resource reqs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching acc medi lab test resource reqs, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.
			AccMediLabTestResourceReq>
				getAccMediLabTestResourceReqsByUuidAndCompanyId(
					String uuid, long companyId, int start, int end,
					com.liferay.portal.kernel.util.OrderByComparator
						<com.nbp.janaac.application.form.service.model.
							AccMediLabTestResourceReq> orderByComparator) {

		return _accMediLabTestResourceReqLocalService.
			getAccMediLabTestResourceReqsByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of acc medi lab test resource reqs.
	 *
	 * @return the number of acc medi lab test resource reqs
	 */
	@Override
	public int getAccMediLabTestResourceReqsCount() {
		return _accMediLabTestResourceReqLocalService.
			getAccMediLabTestResourceReqsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _accMediLabTestResourceReqLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _accMediLabTestResourceReqLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _accMediLabTestResourceReqLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public
		com.nbp.janaac.application.form.service.model.AccMediLabTestResourceReq
				getJANAAC_ByApplicationId(long janaacApplicationId)
			throws com.nbp.janaac.application.form.service.exception.
				NoSuchAccMediLabTestResourceReqException {

		return _accMediLabTestResourceReqLocalService.getJANAAC_ByApplicationId(
			janaacApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _accMediLabTestResourceReqLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accMediLabTestResourceReqLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the acc medi lab test resource req in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccMediLabTestResourceReqLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accMediLabTestResourceReq the acc medi lab test resource req
	 * @return the acc medi lab test resource req that was updated
	 */
	@Override
	public
		com.nbp.janaac.application.form.service.model.AccMediLabTestResourceReq
			updateAccMediLabTestResourceReq(
				com.nbp.janaac.application.form.service.model.
					AccMediLabTestResourceReq accMediLabTestResourceReq) {

		return _accMediLabTestResourceReqLocalService.
			updateAccMediLabTestResourceReq(accMediLabTestResourceReq);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _accMediLabTestResourceReqLocalService.getBasePersistence();
	}

	@Override
	public AccMediLabTestResourceReqLocalService getWrappedService() {
		return _accMediLabTestResourceReqLocalService;
	}

	@Override
	public void setWrappedService(
		AccMediLabTestResourceReqLocalService
			accMediLabTestResourceReqLocalService) {

		_accMediLabTestResourceReqLocalService =
			accMediLabTestResourceReqLocalService;
	}

	private AccMediLabTestResourceReqLocalService
		_accMediLabTestResourceReqLocalService;

}