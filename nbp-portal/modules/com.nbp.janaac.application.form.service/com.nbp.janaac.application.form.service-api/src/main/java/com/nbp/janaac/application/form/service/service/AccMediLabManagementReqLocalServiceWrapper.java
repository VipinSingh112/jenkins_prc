/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AccMediLabManagementReqLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AccMediLabManagementReqLocalService
 * @generated
 */
public class AccMediLabManagementReqLocalServiceWrapper
	implements AccMediLabManagementReqLocalService,
			   ServiceWrapper<AccMediLabManagementReqLocalService> {

	public AccMediLabManagementReqLocalServiceWrapper() {
		this(null);
	}

	public AccMediLabManagementReqLocalServiceWrapper(
		AccMediLabManagementReqLocalService
			accMediLabManagementReqLocalService) {

		_accMediLabManagementReqLocalService =
			accMediLabManagementReqLocalService;
	}

	/**
	 * Adds the acc medi lab management req to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccMediLabManagementReqLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accMediLabManagementReq the acc medi lab management req
	 * @return the acc medi lab management req that was added
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccMediLabManagementReq
		addAccMediLabManagementReq(
			com.nbp.janaac.application.form.service.model.
				AccMediLabManagementReq accMediLabManagementReq) {

		return _accMediLabManagementReqLocalService.addAccMediLabManagementReq(
			accMediLabManagementReq);
	}

	/**
	 * Creates a new acc medi lab management req with the primary key. Does not add the acc medi lab management req to the database.
	 *
	 * @param accMediLabManagementReqId the primary key for the new acc medi lab management req
	 * @return the new acc medi lab management req
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccMediLabManagementReq
		createAccMediLabManagementReq(long accMediLabManagementReqId) {

		return _accMediLabManagementReqLocalService.
			createAccMediLabManagementReq(accMediLabManagementReqId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accMediLabManagementReqLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the acc medi lab management req from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccMediLabManagementReqLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accMediLabManagementReq the acc medi lab management req
	 * @return the acc medi lab management req that was removed
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccMediLabManagementReq
		deleteAccMediLabManagementReq(
			com.nbp.janaac.application.form.service.model.
				AccMediLabManagementReq accMediLabManagementReq) {

		return _accMediLabManagementReqLocalService.
			deleteAccMediLabManagementReq(accMediLabManagementReq);
	}

	/**
	 * Deletes the acc medi lab management req with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccMediLabManagementReqLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accMediLabManagementReqId the primary key of the acc medi lab management req
	 * @return the acc medi lab management req that was removed
	 * @throws PortalException if a acc medi lab management req with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccMediLabManagementReq
			deleteAccMediLabManagementReq(long accMediLabManagementReqId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accMediLabManagementReqLocalService.
			deleteAccMediLabManagementReq(accMediLabManagementReqId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accMediLabManagementReqLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _accMediLabManagementReqLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _accMediLabManagementReqLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _accMediLabManagementReqLocalService.dynamicQuery();
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

		return _accMediLabManagementReqLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccMediLabManagementReqModelImpl</code>.
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

		return _accMediLabManagementReqLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccMediLabManagementReqModelImpl</code>.
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

		return _accMediLabManagementReqLocalService.dynamicQuery(
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

		return _accMediLabManagementReqLocalService.dynamicQueryCount(
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

		return _accMediLabManagementReqLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.janaac.application.form.service.model.AccMediLabManagementReq
		fetchAccMediLabManagementReq(long accMediLabManagementReqId) {

		return _accMediLabManagementReqLocalService.
			fetchAccMediLabManagementReq(accMediLabManagementReqId);
	}

	/**
	 * Returns the acc medi lab management req matching the UUID and group.
	 *
	 * @param uuid the acc medi lab management req's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acc medi lab management req, or <code>null</code> if a matching acc medi lab management req could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccMediLabManagementReq
		fetchAccMediLabManagementReqByUuidAndGroupId(
			String uuid, long groupId) {

		return _accMediLabManagementReqLocalService.
			fetchAccMediLabManagementReqByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns the acc medi lab management req with the primary key.
	 *
	 * @param accMediLabManagementReqId the primary key of the acc medi lab management req
	 * @return the acc medi lab management req
	 * @throws PortalException if a acc medi lab management req with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccMediLabManagementReq
			getAccMediLabManagementReq(long accMediLabManagementReqId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accMediLabManagementReqLocalService.getAccMediLabManagementReq(
			accMediLabManagementReqId);
	}

	/**
	 * Returns the acc medi lab management req matching the UUID and group.
	 *
	 * @param uuid the acc medi lab management req's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acc medi lab management req
	 * @throws PortalException if a matching acc medi lab management req could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccMediLabManagementReq
			getAccMediLabManagementReqByUuidAndGroupId(
				String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accMediLabManagementReqLocalService.
			getAccMediLabManagementReqByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the acc medi lab management reqs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccMediLabManagementReqModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc medi lab management reqs
	 * @param end the upper bound of the range of acc medi lab management reqs (not inclusive)
	 * @return the range of acc medi lab management reqs
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AccMediLabManagementReq>
			getAccMediLabManagementReqs(int start, int end) {

		return _accMediLabManagementReqLocalService.getAccMediLabManagementReqs(
			start, end);
	}

	/**
	 * Returns all the acc medi lab management reqs matching the UUID and company.
	 *
	 * @param uuid the UUID of the acc medi lab management reqs
	 * @param companyId the primary key of the company
	 * @return the matching acc medi lab management reqs, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AccMediLabManagementReq>
			getAccMediLabManagementReqsByUuidAndCompanyId(
				String uuid, long companyId) {

		return _accMediLabManagementReqLocalService.
			getAccMediLabManagementReqsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of acc medi lab management reqs matching the UUID and company.
	 *
	 * @param uuid the UUID of the acc medi lab management reqs
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of acc medi lab management reqs
	 * @param end the upper bound of the range of acc medi lab management reqs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching acc medi lab management reqs, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AccMediLabManagementReq>
			getAccMediLabManagementReqsByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.nbp.janaac.application.form.service.model.
						AccMediLabManagementReq> orderByComparator) {

		return _accMediLabManagementReqLocalService.
			getAccMediLabManagementReqsByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of acc medi lab management reqs.
	 *
	 * @return the number of acc medi lab management reqs
	 */
	@Override
	public int getAccMediLabManagementReqsCount() {
		return _accMediLabManagementReqLocalService.
			getAccMediLabManagementReqsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _accMediLabManagementReqLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _accMediLabManagementReqLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _accMediLabManagementReqLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.janaac.application.form.service.model.AccMediLabManagementReq
			getJANAAC_ByApplicationId(long janaacApplicationId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccMediLabManagementReqException {

		return _accMediLabManagementReqLocalService.getJANAAC_ByApplicationId(
			janaacApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _accMediLabManagementReqLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accMediLabManagementReqLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the acc medi lab management req in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccMediLabManagementReqLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accMediLabManagementReq the acc medi lab management req
	 * @return the acc medi lab management req that was updated
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccMediLabManagementReq
		updateAccMediLabManagementReq(
			com.nbp.janaac.application.form.service.model.
				AccMediLabManagementReq accMediLabManagementReq) {

		return _accMediLabManagementReqLocalService.
			updateAccMediLabManagementReq(accMediLabManagementReq);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _accMediLabManagementReqLocalService.getBasePersistence();
	}

	@Override
	public AccMediLabManagementReqLocalService getWrappedService() {
		return _accMediLabManagementReqLocalService;
	}

	@Override
	public void setWrappedService(
		AccMediLabManagementReqLocalService
			accMediLabManagementReqLocalService) {

		_accMediLabManagementReqLocalService =
			accMediLabManagementReqLocalService;
	}

	private AccMediLabManagementReqLocalService
		_accMediLabManagementReqLocalService;

}