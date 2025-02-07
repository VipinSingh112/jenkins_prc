/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AccCerBodyInfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AccCerBodyInfoLocalService
 * @generated
 */
public class AccCerBodyInfoLocalServiceWrapper
	implements AccCerBodyInfoLocalService,
			   ServiceWrapper<AccCerBodyInfoLocalService> {

	public AccCerBodyInfoLocalServiceWrapper() {
		this(null);
	}

	public AccCerBodyInfoLocalServiceWrapper(
		AccCerBodyInfoLocalService accCerBodyInfoLocalService) {

		_accCerBodyInfoLocalService = accCerBodyInfoLocalService;
	}

	/**
	 * Adds the acc cer body info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccCerBodyInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accCerBodyInfo the acc cer body info
	 * @return the acc cer body info that was added
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccCerBodyInfo
		addAccCerBodyInfo(
			com.nbp.janaac.application.form.service.model.AccCerBodyInfo
				accCerBodyInfo) {

		return _accCerBodyInfoLocalService.addAccCerBodyInfo(accCerBodyInfo);
	}

	/**
	 * Creates a new acc cer body info with the primary key. Does not add the acc cer body info to the database.
	 *
	 * @param accCerBodyInfoId the primary key for the new acc cer body info
	 * @return the new acc cer body info
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccCerBodyInfo
		createAccCerBodyInfo(long accCerBodyInfoId) {

		return _accCerBodyInfoLocalService.createAccCerBodyInfo(
			accCerBodyInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accCerBodyInfoLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the acc cer body info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccCerBodyInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accCerBodyInfo the acc cer body info
	 * @return the acc cer body info that was removed
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccCerBodyInfo
		deleteAccCerBodyInfo(
			com.nbp.janaac.application.form.service.model.AccCerBodyInfo
				accCerBodyInfo) {

		return _accCerBodyInfoLocalService.deleteAccCerBodyInfo(accCerBodyInfo);
	}

	/**
	 * Deletes the acc cer body info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccCerBodyInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accCerBodyInfoId the primary key of the acc cer body info
	 * @return the acc cer body info that was removed
	 * @throws PortalException if a acc cer body info with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccCerBodyInfo
			deleteAccCerBodyInfo(long accCerBodyInfoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accCerBodyInfoLocalService.deleteAccCerBodyInfo(
			accCerBodyInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accCerBodyInfoLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _accCerBodyInfoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _accCerBodyInfoLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _accCerBodyInfoLocalService.dynamicQuery();
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

		return _accCerBodyInfoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccCerBodyInfoModelImpl</code>.
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

		return _accCerBodyInfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccCerBodyInfoModelImpl</code>.
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

		return _accCerBodyInfoLocalService.dynamicQuery(
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

		return _accCerBodyInfoLocalService.dynamicQueryCount(dynamicQuery);
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

		return _accCerBodyInfoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.janaac.application.form.service.model.AccCerBodyInfo
		fetchAccCerBodyInfo(long accCerBodyInfoId) {

		return _accCerBodyInfoLocalService.fetchAccCerBodyInfo(
			accCerBodyInfoId);
	}

	/**
	 * Returns the acc cer body info matching the UUID and group.
	 *
	 * @param uuid the acc cer body info's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acc cer body info, or <code>null</code> if a matching acc cer body info could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccCerBodyInfo
		fetchAccCerBodyInfoByUuidAndGroupId(String uuid, long groupId) {

		return _accCerBodyInfoLocalService.fetchAccCerBodyInfoByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns the acc cer body info with the primary key.
	 *
	 * @param accCerBodyInfoId the primary key of the acc cer body info
	 * @return the acc cer body info
	 * @throws PortalException if a acc cer body info with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccCerBodyInfo
			getAccCerBodyInfo(long accCerBodyInfoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accCerBodyInfoLocalService.getAccCerBodyInfo(accCerBodyInfoId);
	}

	/**
	 * Returns the acc cer body info matching the UUID and group.
	 *
	 * @param uuid the acc cer body info's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acc cer body info
	 * @throws PortalException if a matching acc cer body info could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccCerBodyInfo
			getAccCerBodyInfoByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accCerBodyInfoLocalService.getAccCerBodyInfoByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the acc cer body infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccCerBodyInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc cer body infos
	 * @param end the upper bound of the range of acc cer body infos (not inclusive)
	 * @return the range of acc cer body infos
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AccCerBodyInfo>
			getAccCerBodyInfos(int start, int end) {

		return _accCerBodyInfoLocalService.getAccCerBodyInfos(start, end);
	}

	/**
	 * Returns all the acc cer body infos matching the UUID and company.
	 *
	 * @param uuid the UUID of the acc cer body infos
	 * @param companyId the primary key of the company
	 * @return the matching acc cer body infos, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AccCerBodyInfo>
			getAccCerBodyInfosByUuidAndCompanyId(String uuid, long companyId) {

		return _accCerBodyInfoLocalService.getAccCerBodyInfosByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of acc cer body infos matching the UUID and company.
	 *
	 * @param uuid the UUID of the acc cer body infos
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of acc cer body infos
	 * @param end the upper bound of the range of acc cer body infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching acc cer body infos, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AccCerBodyInfo>
			getAccCerBodyInfosByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.nbp.janaac.application.form.service.model.
						AccCerBodyInfo> orderByComparator) {

		return _accCerBodyInfoLocalService.getAccCerBodyInfosByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of acc cer body infos.
	 *
	 * @return the number of acc cer body infos
	 */
	@Override
	public int getAccCerBodyInfosCount() {
		return _accCerBodyInfoLocalService.getAccCerBodyInfosCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _accCerBodyInfoLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _accCerBodyInfoLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _accCerBodyInfoLocalService.getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.janaac.application.form.service.model.AccCerBodyInfo
			getJANAAC_ByApplicationId(long janaacApplicationId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccCerBodyInfoException {

		return _accCerBodyInfoLocalService.getJANAAC_ByApplicationId(
			janaacApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _accCerBodyInfoLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accCerBodyInfoLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the acc cer body info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccCerBodyInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accCerBodyInfo the acc cer body info
	 * @return the acc cer body info that was updated
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccCerBodyInfo
		updateAccCerBodyInfo(
			com.nbp.janaac.application.form.service.model.AccCerBodyInfo
				accCerBodyInfo) {

		return _accCerBodyInfoLocalService.updateAccCerBodyInfo(accCerBodyInfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _accCerBodyInfoLocalService.getBasePersistence();
	}

	@Override
	public AccCerBodyInfoLocalService getWrappedService() {
		return _accCerBodyInfoLocalService;
	}

	@Override
	public void setWrappedService(
		AccCerBodyInfoLocalService accCerBodyInfoLocalService) {

		_accCerBodyInfoLocalService = accCerBodyInfoLocalService;
	}

	private AccCerBodyInfoLocalService _accCerBodyInfoLocalService;

}