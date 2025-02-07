/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AccCerBodyManageReqLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AccCerBodyManageReqLocalService
 * @generated
 */
public class AccCerBodyManageReqLocalServiceWrapper
	implements AccCerBodyManageReqLocalService,
			   ServiceWrapper<AccCerBodyManageReqLocalService> {

	public AccCerBodyManageReqLocalServiceWrapper() {
		this(null);
	}

	public AccCerBodyManageReqLocalServiceWrapper(
		AccCerBodyManageReqLocalService accCerBodyManageReqLocalService) {

		_accCerBodyManageReqLocalService = accCerBodyManageReqLocalService;
	}

	/**
	 * Adds the acc cer body manage req to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccCerBodyManageReqLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accCerBodyManageReq the acc cer body manage req
	 * @return the acc cer body manage req that was added
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccCerBodyManageReq
		addAccCerBodyManageReq(
			com.nbp.janaac.application.form.service.model.AccCerBodyManageReq
				accCerBodyManageReq) {

		return _accCerBodyManageReqLocalService.addAccCerBodyManageReq(
			accCerBodyManageReq);
	}

	/**
	 * Creates a new acc cer body manage req with the primary key. Does not add the acc cer body manage req to the database.
	 *
	 * @param accCerBodyManageReqId the primary key for the new acc cer body manage req
	 * @return the new acc cer body manage req
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccCerBodyManageReq
		createAccCerBodyManageReq(long accCerBodyManageReqId) {

		return _accCerBodyManageReqLocalService.createAccCerBodyManageReq(
			accCerBodyManageReqId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accCerBodyManageReqLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the acc cer body manage req from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccCerBodyManageReqLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accCerBodyManageReq the acc cer body manage req
	 * @return the acc cer body manage req that was removed
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccCerBodyManageReq
		deleteAccCerBodyManageReq(
			com.nbp.janaac.application.form.service.model.AccCerBodyManageReq
				accCerBodyManageReq) {

		return _accCerBodyManageReqLocalService.deleteAccCerBodyManageReq(
			accCerBodyManageReq);
	}

	/**
	 * Deletes the acc cer body manage req with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccCerBodyManageReqLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accCerBodyManageReqId the primary key of the acc cer body manage req
	 * @return the acc cer body manage req that was removed
	 * @throws PortalException if a acc cer body manage req with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccCerBodyManageReq
			deleteAccCerBodyManageReq(long accCerBodyManageReqId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accCerBodyManageReqLocalService.deleteAccCerBodyManageReq(
			accCerBodyManageReqId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accCerBodyManageReqLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _accCerBodyManageReqLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _accCerBodyManageReqLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _accCerBodyManageReqLocalService.dynamicQuery();
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

		return _accCerBodyManageReqLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccCerBodyManageReqModelImpl</code>.
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

		return _accCerBodyManageReqLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccCerBodyManageReqModelImpl</code>.
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

		return _accCerBodyManageReqLocalService.dynamicQuery(
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

		return _accCerBodyManageReqLocalService.dynamicQueryCount(dynamicQuery);
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

		return _accCerBodyManageReqLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.janaac.application.form.service.model.AccCerBodyManageReq
		fetchAccCerBodyManageReq(long accCerBodyManageReqId) {

		return _accCerBodyManageReqLocalService.fetchAccCerBodyManageReq(
			accCerBodyManageReqId);
	}

	/**
	 * Returns the acc cer body manage req matching the UUID and group.
	 *
	 * @param uuid the acc cer body manage req's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acc cer body manage req, or <code>null</code> if a matching acc cer body manage req could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccCerBodyManageReq
		fetchAccCerBodyManageReqByUuidAndGroupId(String uuid, long groupId) {

		return _accCerBodyManageReqLocalService.
			fetchAccCerBodyManageReqByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns the acc cer body manage req with the primary key.
	 *
	 * @param accCerBodyManageReqId the primary key of the acc cer body manage req
	 * @return the acc cer body manage req
	 * @throws PortalException if a acc cer body manage req with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccCerBodyManageReq
			getAccCerBodyManageReq(long accCerBodyManageReqId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accCerBodyManageReqLocalService.getAccCerBodyManageReq(
			accCerBodyManageReqId);
	}

	/**
	 * Returns the acc cer body manage req matching the UUID and group.
	 *
	 * @param uuid the acc cer body manage req's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acc cer body manage req
	 * @throws PortalException if a matching acc cer body manage req could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccCerBodyManageReq
			getAccCerBodyManageReqByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accCerBodyManageReqLocalService.
			getAccCerBodyManageReqByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the acc cer body manage reqs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccCerBodyManageReqModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc cer body manage reqs
	 * @param end the upper bound of the range of acc cer body manage reqs (not inclusive)
	 * @return the range of acc cer body manage reqs
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AccCerBodyManageReq>
			getAccCerBodyManageReqs(int start, int end) {

		return _accCerBodyManageReqLocalService.getAccCerBodyManageReqs(
			start, end);
	}

	/**
	 * Returns all the acc cer body manage reqs matching the UUID and company.
	 *
	 * @param uuid the UUID of the acc cer body manage reqs
	 * @param companyId the primary key of the company
	 * @return the matching acc cer body manage reqs, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AccCerBodyManageReq>
			getAccCerBodyManageReqsByUuidAndCompanyId(
				String uuid, long companyId) {

		return _accCerBodyManageReqLocalService.
			getAccCerBodyManageReqsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of acc cer body manage reqs matching the UUID and company.
	 *
	 * @param uuid the UUID of the acc cer body manage reqs
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of acc cer body manage reqs
	 * @param end the upper bound of the range of acc cer body manage reqs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching acc cer body manage reqs, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AccCerBodyManageReq>
			getAccCerBodyManageReqsByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.nbp.janaac.application.form.service.model.
						AccCerBodyManageReq> orderByComparator) {

		return _accCerBodyManageReqLocalService.
			getAccCerBodyManageReqsByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of acc cer body manage reqs.
	 *
	 * @return the number of acc cer body manage reqs
	 */
	@Override
	public int getAccCerBodyManageReqsCount() {
		return _accCerBodyManageReqLocalService.getAccCerBodyManageReqsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _accCerBodyManageReqLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _accCerBodyManageReqLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _accCerBodyManageReqLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.janaac.application.form.service.model.AccCerBodyManageReq
			getJANAAC_ByApplicationId(long janaacApplicationId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccCerBodyManageReqException {

		return _accCerBodyManageReqLocalService.getJANAAC_ByApplicationId(
			janaacApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _accCerBodyManageReqLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accCerBodyManageReqLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the acc cer body manage req in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccCerBodyManageReqLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accCerBodyManageReq the acc cer body manage req
	 * @return the acc cer body manage req that was updated
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccCerBodyManageReq
		updateAccCerBodyManageReq(
			com.nbp.janaac.application.form.service.model.AccCerBodyManageReq
				accCerBodyManageReq) {

		return _accCerBodyManageReqLocalService.updateAccCerBodyManageReq(
			accCerBodyManageReq);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _accCerBodyManageReqLocalService.getBasePersistence();
	}

	@Override
	public AccCerBodyManageReqLocalService getWrappedService() {
		return _accCerBodyManageReqLocalService;
	}

	@Override
	public void setWrappedService(
		AccCerBodyManageReqLocalService accCerBodyManageReqLocalService) {

		_accCerBodyManageReqLocalService = accCerBodyManageReqLocalService;
	}

	private AccCerBodyManageReqLocalService _accCerBodyManageReqLocalService;

}