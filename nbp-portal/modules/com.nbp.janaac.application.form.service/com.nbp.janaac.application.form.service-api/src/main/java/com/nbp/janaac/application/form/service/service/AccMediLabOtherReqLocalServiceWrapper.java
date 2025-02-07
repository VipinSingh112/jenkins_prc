/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AccMediLabOtherReqLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AccMediLabOtherReqLocalService
 * @generated
 */
public class AccMediLabOtherReqLocalServiceWrapper
	implements AccMediLabOtherReqLocalService,
			   ServiceWrapper<AccMediLabOtherReqLocalService> {

	public AccMediLabOtherReqLocalServiceWrapper() {
		this(null);
	}

	public AccMediLabOtherReqLocalServiceWrapper(
		AccMediLabOtherReqLocalService accMediLabOtherReqLocalService) {

		_accMediLabOtherReqLocalService = accMediLabOtherReqLocalService;
	}

	/**
	 * Adds the acc medi lab other req to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccMediLabOtherReqLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accMediLabOtherReq the acc medi lab other req
	 * @return the acc medi lab other req that was added
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccMediLabOtherReq
		addAccMediLabOtherReq(
			com.nbp.janaac.application.form.service.model.AccMediLabOtherReq
				accMediLabOtherReq) {

		return _accMediLabOtherReqLocalService.addAccMediLabOtherReq(
			accMediLabOtherReq);
	}

	/**
	 * Creates a new acc medi lab other req with the primary key. Does not add the acc medi lab other req to the database.
	 *
	 * @param accMediLabOtherReqId the primary key for the new acc medi lab other req
	 * @return the new acc medi lab other req
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccMediLabOtherReq
		createAccMediLabOtherReq(long accMediLabOtherReqId) {

		return _accMediLabOtherReqLocalService.createAccMediLabOtherReq(
			accMediLabOtherReqId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accMediLabOtherReqLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the acc medi lab other req from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccMediLabOtherReqLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accMediLabOtherReq the acc medi lab other req
	 * @return the acc medi lab other req that was removed
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccMediLabOtherReq
		deleteAccMediLabOtherReq(
			com.nbp.janaac.application.form.service.model.AccMediLabOtherReq
				accMediLabOtherReq) {

		return _accMediLabOtherReqLocalService.deleteAccMediLabOtherReq(
			accMediLabOtherReq);
	}

	/**
	 * Deletes the acc medi lab other req with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccMediLabOtherReqLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accMediLabOtherReqId the primary key of the acc medi lab other req
	 * @return the acc medi lab other req that was removed
	 * @throws PortalException if a acc medi lab other req with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccMediLabOtherReq
			deleteAccMediLabOtherReq(long accMediLabOtherReqId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accMediLabOtherReqLocalService.deleteAccMediLabOtherReq(
			accMediLabOtherReqId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accMediLabOtherReqLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _accMediLabOtherReqLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _accMediLabOtherReqLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _accMediLabOtherReqLocalService.dynamicQuery();
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

		return _accMediLabOtherReqLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccMediLabOtherReqModelImpl</code>.
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

		return _accMediLabOtherReqLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccMediLabOtherReqModelImpl</code>.
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

		return _accMediLabOtherReqLocalService.dynamicQuery(
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

		return _accMediLabOtherReqLocalService.dynamicQueryCount(dynamicQuery);
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

		return _accMediLabOtherReqLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.janaac.application.form.service.model.AccMediLabOtherReq
		fetchAccMediLabOtherReq(long accMediLabOtherReqId) {

		return _accMediLabOtherReqLocalService.fetchAccMediLabOtherReq(
			accMediLabOtherReqId);
	}

	/**
	 * Returns the acc medi lab other req matching the UUID and group.
	 *
	 * @param uuid the acc medi lab other req's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acc medi lab other req, or <code>null</code> if a matching acc medi lab other req could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccMediLabOtherReq
		fetchAccMediLabOtherReqByUuidAndGroupId(String uuid, long groupId) {

		return _accMediLabOtherReqLocalService.
			fetchAccMediLabOtherReqByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns the acc medi lab other req with the primary key.
	 *
	 * @param accMediLabOtherReqId the primary key of the acc medi lab other req
	 * @return the acc medi lab other req
	 * @throws PortalException if a acc medi lab other req with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccMediLabOtherReq
			getAccMediLabOtherReq(long accMediLabOtherReqId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accMediLabOtherReqLocalService.getAccMediLabOtherReq(
			accMediLabOtherReqId);
	}

	/**
	 * Returns the acc medi lab other req matching the UUID and group.
	 *
	 * @param uuid the acc medi lab other req's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acc medi lab other req
	 * @throws PortalException if a matching acc medi lab other req could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccMediLabOtherReq
			getAccMediLabOtherReqByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accMediLabOtherReqLocalService.
			getAccMediLabOtherReqByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the acc medi lab other reqs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccMediLabOtherReqModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc medi lab other reqs
	 * @param end the upper bound of the range of acc medi lab other reqs (not inclusive)
	 * @return the range of acc medi lab other reqs
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AccMediLabOtherReq>
			getAccMediLabOtherReqs(int start, int end) {

		return _accMediLabOtherReqLocalService.getAccMediLabOtherReqs(
			start, end);
	}

	/**
	 * Returns all the acc medi lab other reqs matching the UUID and company.
	 *
	 * @param uuid the UUID of the acc medi lab other reqs
	 * @param companyId the primary key of the company
	 * @return the matching acc medi lab other reqs, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AccMediLabOtherReq>
			getAccMediLabOtherReqsByUuidAndCompanyId(
				String uuid, long companyId) {

		return _accMediLabOtherReqLocalService.
			getAccMediLabOtherReqsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of acc medi lab other reqs matching the UUID and company.
	 *
	 * @param uuid the UUID of the acc medi lab other reqs
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of acc medi lab other reqs
	 * @param end the upper bound of the range of acc medi lab other reqs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching acc medi lab other reqs, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AccMediLabOtherReq>
			getAccMediLabOtherReqsByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.nbp.janaac.application.form.service.model.
						AccMediLabOtherReq> orderByComparator) {

		return _accMediLabOtherReqLocalService.
			getAccMediLabOtherReqsByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of acc medi lab other reqs.
	 *
	 * @return the number of acc medi lab other reqs
	 */
	@Override
	public int getAccMediLabOtherReqsCount() {
		return _accMediLabOtherReqLocalService.getAccMediLabOtherReqsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _accMediLabOtherReqLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _accMediLabOtherReqLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _accMediLabOtherReqLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.janaac.application.form.service.model.AccMediLabOtherReq
			getJANAAC_ByApplicationId(long janaacApplicationId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccMediLabOtherReqException {

		return _accMediLabOtherReqLocalService.getJANAAC_ByApplicationId(
			janaacApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _accMediLabOtherReqLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accMediLabOtherReqLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the acc medi lab other req in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccMediLabOtherReqLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accMediLabOtherReq the acc medi lab other req
	 * @return the acc medi lab other req that was updated
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccMediLabOtherReq
		updateAccMediLabOtherReq(
			com.nbp.janaac.application.form.service.model.AccMediLabOtherReq
				accMediLabOtherReq) {

		return _accMediLabOtherReqLocalService.updateAccMediLabOtherReq(
			accMediLabOtherReq);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _accMediLabOtherReqLocalService.getBasePersistence();
	}

	@Override
	public AccMediLabOtherReqLocalService getWrappedService() {
		return _accMediLabOtherReqLocalService;
	}

	@Override
	public void setWrappedService(
		AccMediLabOtherReqLocalService accMediLabOtherReqLocalService) {

		_accMediLabOtherReqLocalService = accMediLabOtherReqLocalService;
	}

	private AccMediLabOtherReqLocalService _accMediLabOtherReqLocalService;

}