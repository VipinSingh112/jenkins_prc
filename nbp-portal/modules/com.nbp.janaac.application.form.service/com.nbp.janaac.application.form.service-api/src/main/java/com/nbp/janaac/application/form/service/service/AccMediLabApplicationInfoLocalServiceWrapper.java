/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AccMediLabApplicationInfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AccMediLabApplicationInfoLocalService
 * @generated
 */
public class AccMediLabApplicationInfoLocalServiceWrapper
	implements AccMediLabApplicationInfoLocalService,
			   ServiceWrapper<AccMediLabApplicationInfoLocalService> {

	public AccMediLabApplicationInfoLocalServiceWrapper() {
		this(null);
	}

	public AccMediLabApplicationInfoLocalServiceWrapper(
		AccMediLabApplicationInfoLocalService
			accMediLabApplicationInfoLocalService) {

		_accMediLabApplicationInfoLocalService =
			accMediLabApplicationInfoLocalService;
	}

	/**
	 * Adds the acc medi lab application info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccMediLabApplicationInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accMediLabApplicationInfo the acc medi lab application info
	 * @return the acc medi lab application info that was added
	 */
	@Override
	public
		com.nbp.janaac.application.form.service.model.AccMediLabApplicationInfo
			addAccMediLabApplicationInfo(
				com.nbp.janaac.application.form.service.model.
					AccMediLabApplicationInfo accMediLabApplicationInfo) {

		return _accMediLabApplicationInfoLocalService.
			addAccMediLabApplicationInfo(accMediLabApplicationInfo);
	}

	/**
	 * Creates a new acc medi lab application info with the primary key. Does not add the acc medi lab application info to the database.
	 *
	 * @param accMediLabApplicationInfoId the primary key for the new acc medi lab application info
	 * @return the new acc medi lab application info
	 */
	@Override
	public
		com.nbp.janaac.application.form.service.model.AccMediLabApplicationInfo
			createAccMediLabApplicationInfo(long accMediLabApplicationInfoId) {

		return _accMediLabApplicationInfoLocalService.
			createAccMediLabApplicationInfo(accMediLabApplicationInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accMediLabApplicationInfoLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the acc medi lab application info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccMediLabApplicationInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accMediLabApplicationInfo the acc medi lab application info
	 * @return the acc medi lab application info that was removed
	 */
	@Override
	public
		com.nbp.janaac.application.form.service.model.AccMediLabApplicationInfo
			deleteAccMediLabApplicationInfo(
				com.nbp.janaac.application.form.service.model.
					AccMediLabApplicationInfo accMediLabApplicationInfo) {

		return _accMediLabApplicationInfoLocalService.
			deleteAccMediLabApplicationInfo(accMediLabApplicationInfo);
	}

	/**
	 * Deletes the acc medi lab application info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccMediLabApplicationInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accMediLabApplicationInfoId the primary key of the acc medi lab application info
	 * @return the acc medi lab application info that was removed
	 * @throws PortalException if a acc medi lab application info with the primary key could not be found
	 */
	@Override
	public
		com.nbp.janaac.application.form.service.model.AccMediLabApplicationInfo
				deleteAccMediLabApplicationInfo(
					long accMediLabApplicationInfoId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _accMediLabApplicationInfoLocalService.
			deleteAccMediLabApplicationInfo(accMediLabApplicationInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accMediLabApplicationInfoLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _accMediLabApplicationInfoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _accMediLabApplicationInfoLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _accMediLabApplicationInfoLocalService.dynamicQuery();
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

		return _accMediLabApplicationInfoLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccMediLabApplicationInfoModelImpl</code>.
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

		return _accMediLabApplicationInfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccMediLabApplicationInfoModelImpl</code>.
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

		return _accMediLabApplicationInfoLocalService.dynamicQuery(
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

		return _accMediLabApplicationInfoLocalService.dynamicQueryCount(
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

		return _accMediLabApplicationInfoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.janaac.application.form.service.model.AccMediLabApplicationInfo
			fetchAccMediLabApplicationInfo(long accMediLabApplicationInfoId) {

		return _accMediLabApplicationInfoLocalService.
			fetchAccMediLabApplicationInfo(accMediLabApplicationInfoId);
	}

	/**
	 * Returns the acc medi lab application info matching the UUID and group.
	 *
	 * @param uuid the acc medi lab application info's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acc medi lab application info, or <code>null</code> if a matching acc medi lab application info could not be found
	 */
	@Override
	public
		com.nbp.janaac.application.form.service.model.AccMediLabApplicationInfo
			fetchAccMediLabApplicationInfoByUuidAndGroupId(
				String uuid, long groupId) {

		return _accMediLabApplicationInfoLocalService.
			fetchAccMediLabApplicationInfoByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns the acc medi lab application info with the primary key.
	 *
	 * @param accMediLabApplicationInfoId the primary key of the acc medi lab application info
	 * @return the acc medi lab application info
	 * @throws PortalException if a acc medi lab application info with the primary key could not be found
	 */
	@Override
	public
		com.nbp.janaac.application.form.service.model.AccMediLabApplicationInfo
				getAccMediLabApplicationInfo(long accMediLabApplicationInfoId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _accMediLabApplicationInfoLocalService.
			getAccMediLabApplicationInfo(accMediLabApplicationInfoId);
	}

	/**
	 * Returns the acc medi lab application info matching the UUID and group.
	 *
	 * @param uuid the acc medi lab application info's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acc medi lab application info
	 * @throws PortalException if a matching acc medi lab application info could not be found
	 */
	@Override
	public
		com.nbp.janaac.application.form.service.model.AccMediLabApplicationInfo
				getAccMediLabApplicationInfoByUuidAndGroupId(
					String uuid, long groupId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _accMediLabApplicationInfoLocalService.
			getAccMediLabApplicationInfoByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the acc medi lab application infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccMediLabApplicationInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc medi lab application infos
	 * @param end the upper bound of the range of acc medi lab application infos (not inclusive)
	 * @return the range of acc medi lab application infos
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.
			AccMediLabApplicationInfo> getAccMediLabApplicationInfos(
				int start, int end) {

		return _accMediLabApplicationInfoLocalService.
			getAccMediLabApplicationInfos(start, end);
	}

	/**
	 * Returns all the acc medi lab application infos matching the UUID and company.
	 *
	 * @param uuid the UUID of the acc medi lab application infos
	 * @param companyId the primary key of the company
	 * @return the matching acc medi lab application infos, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.
			AccMediLabApplicationInfo>
				getAccMediLabApplicationInfosByUuidAndCompanyId(
					String uuid, long companyId) {

		return _accMediLabApplicationInfoLocalService.
			getAccMediLabApplicationInfosByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of acc medi lab application infos matching the UUID and company.
	 *
	 * @param uuid the UUID of the acc medi lab application infos
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of acc medi lab application infos
	 * @param end the upper bound of the range of acc medi lab application infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching acc medi lab application infos, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.
			AccMediLabApplicationInfo>
				getAccMediLabApplicationInfosByUuidAndCompanyId(
					String uuid, long companyId, int start, int end,
					com.liferay.portal.kernel.util.OrderByComparator
						<com.nbp.janaac.application.form.service.model.
							AccMediLabApplicationInfo> orderByComparator) {

		return _accMediLabApplicationInfoLocalService.
			getAccMediLabApplicationInfosByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of acc medi lab application infos.
	 *
	 * @return the number of acc medi lab application infos
	 */
	@Override
	public int getAccMediLabApplicationInfosCount() {
		return _accMediLabApplicationInfoLocalService.
			getAccMediLabApplicationInfosCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _accMediLabApplicationInfoLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public
		com.nbp.janaac.application.form.service.model.AccMediLabApplicationInfo
				getApplicantInfo(long jannacApplicationId)
			throws com.nbp.janaac.application.form.service.exception.
				NoSuchAccMediLabApplicationInfoException {

		return _accMediLabApplicationInfoLocalService.getApplicantInfo(
			jannacApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _accMediLabApplicationInfoLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _accMediLabApplicationInfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _accMediLabApplicationInfoLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accMediLabApplicationInfoLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the acc medi lab application info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccMediLabApplicationInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accMediLabApplicationInfo the acc medi lab application info
	 * @return the acc medi lab application info that was updated
	 */
	@Override
	public
		com.nbp.janaac.application.form.service.model.AccMediLabApplicationInfo
			updateAccMediLabApplicationInfo(
				com.nbp.janaac.application.form.service.model.
					AccMediLabApplicationInfo accMediLabApplicationInfo) {

		return _accMediLabApplicationInfoLocalService.
			updateAccMediLabApplicationInfo(accMediLabApplicationInfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _accMediLabApplicationInfoLocalService.getBasePersistence();
	}

	@Override
	public AccMediLabApplicationInfoLocalService getWrappedService() {
		return _accMediLabApplicationInfoLocalService;
	}

	@Override
	public void setWrappedService(
		AccMediLabApplicationInfoLocalService
			accMediLabApplicationInfoLocalService) {

		_accMediLabApplicationInfoLocalService =
			accMediLabApplicationInfoLocalService;
	}

	private AccMediLabApplicationInfoLocalService
		_accMediLabApplicationInfoLocalService;

}