/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AccThirdPartyAppliInfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AccThirdPartyAppliInfoLocalService
 * @generated
 */
public class AccThirdPartyAppliInfoLocalServiceWrapper
	implements AccThirdPartyAppliInfoLocalService,
			   ServiceWrapper<AccThirdPartyAppliInfoLocalService> {

	public AccThirdPartyAppliInfoLocalServiceWrapper() {
		this(null);
	}

	public AccThirdPartyAppliInfoLocalServiceWrapper(
		AccThirdPartyAppliInfoLocalService accThirdPartyAppliInfoLocalService) {

		_accThirdPartyAppliInfoLocalService =
			accThirdPartyAppliInfoLocalService;
	}

	/**
	 * Adds the acc third party appli info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccThirdPartyAppliInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accThirdPartyAppliInfo the acc third party appli info
	 * @return the acc third party appli info that was added
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccThirdPartyAppliInfo
		addAccThirdPartyAppliInfo(
			com.nbp.janaac.application.form.service.model.AccThirdPartyAppliInfo
				accThirdPartyAppliInfo) {

		return _accThirdPartyAppliInfoLocalService.addAccThirdPartyAppliInfo(
			accThirdPartyAppliInfo);
	}

	/**
	 * Creates a new acc third party appli info with the primary key. Does not add the acc third party appli info to the database.
	 *
	 * @param accThirdPartyAppliInfoId the primary key for the new acc third party appli info
	 * @return the new acc third party appli info
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccThirdPartyAppliInfo
		createAccThirdPartyAppliInfo(long accThirdPartyAppliInfoId) {

		return _accThirdPartyAppliInfoLocalService.createAccThirdPartyAppliInfo(
			accThirdPartyAppliInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accThirdPartyAppliInfoLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the acc third party appli info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccThirdPartyAppliInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accThirdPartyAppliInfo the acc third party appli info
	 * @return the acc third party appli info that was removed
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccThirdPartyAppliInfo
		deleteAccThirdPartyAppliInfo(
			com.nbp.janaac.application.form.service.model.AccThirdPartyAppliInfo
				accThirdPartyAppliInfo) {

		return _accThirdPartyAppliInfoLocalService.deleteAccThirdPartyAppliInfo(
			accThirdPartyAppliInfo);
	}

	/**
	 * Deletes the acc third party appli info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccThirdPartyAppliInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accThirdPartyAppliInfoId the primary key of the acc third party appli info
	 * @return the acc third party appli info that was removed
	 * @throws PortalException if a acc third party appli info with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccThirdPartyAppliInfo
			deleteAccThirdPartyAppliInfo(long accThirdPartyAppliInfoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accThirdPartyAppliInfoLocalService.deleteAccThirdPartyAppliInfo(
			accThirdPartyAppliInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accThirdPartyAppliInfoLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _accThirdPartyAppliInfoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _accThirdPartyAppliInfoLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _accThirdPartyAppliInfoLocalService.dynamicQuery();
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

		return _accThirdPartyAppliInfoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccThirdPartyAppliInfoModelImpl</code>.
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

		return _accThirdPartyAppliInfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccThirdPartyAppliInfoModelImpl</code>.
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

		return _accThirdPartyAppliInfoLocalService.dynamicQuery(
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

		return _accThirdPartyAppliInfoLocalService.dynamicQueryCount(
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

		return _accThirdPartyAppliInfoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.janaac.application.form.service.model.AccThirdPartyAppliInfo
		fetchAccThirdPartyAppliInfo(long accThirdPartyAppliInfoId) {

		return _accThirdPartyAppliInfoLocalService.fetchAccThirdPartyAppliInfo(
			accThirdPartyAppliInfoId);
	}

	/**
	 * Returns the acc third party appli info matching the UUID and group.
	 *
	 * @param uuid the acc third party appli info's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acc third party appli info, or <code>null</code> if a matching acc third party appli info could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccThirdPartyAppliInfo
		fetchAccThirdPartyAppliInfoByUuidAndGroupId(String uuid, long groupId) {

		return _accThirdPartyAppliInfoLocalService.
			fetchAccThirdPartyAppliInfoByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns the acc third party appli info with the primary key.
	 *
	 * @param accThirdPartyAppliInfoId the primary key of the acc third party appli info
	 * @return the acc third party appli info
	 * @throws PortalException if a acc third party appli info with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccThirdPartyAppliInfo
			getAccThirdPartyAppliInfo(long accThirdPartyAppliInfoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accThirdPartyAppliInfoLocalService.getAccThirdPartyAppliInfo(
			accThirdPartyAppliInfoId);
	}

	/**
	 * Returns the acc third party appli info matching the UUID and group.
	 *
	 * @param uuid the acc third party appli info's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acc third party appli info
	 * @throws PortalException if a matching acc third party appli info could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccThirdPartyAppliInfo
			getAccThirdPartyAppliInfoByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accThirdPartyAppliInfoLocalService.
			getAccThirdPartyAppliInfoByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the acc third party appli infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccThirdPartyAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc third party appli infos
	 * @param end the upper bound of the range of acc third party appli infos (not inclusive)
	 * @return the range of acc third party appli infos
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AccThirdPartyAppliInfo>
			getAccThirdPartyAppliInfos(int start, int end) {

		return _accThirdPartyAppliInfoLocalService.getAccThirdPartyAppliInfos(
			start, end);
	}

	/**
	 * Returns all the acc third party appli infos matching the UUID and company.
	 *
	 * @param uuid the UUID of the acc third party appli infos
	 * @param companyId the primary key of the company
	 * @return the matching acc third party appli infos, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AccThirdPartyAppliInfo>
			getAccThirdPartyAppliInfosByUuidAndCompanyId(
				String uuid, long companyId) {

		return _accThirdPartyAppliInfoLocalService.
			getAccThirdPartyAppliInfosByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of acc third party appli infos matching the UUID and company.
	 *
	 * @param uuid the UUID of the acc third party appli infos
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of acc third party appli infos
	 * @param end the upper bound of the range of acc third party appli infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching acc third party appli infos, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AccThirdPartyAppliInfo>
			getAccThirdPartyAppliInfosByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.nbp.janaac.application.form.service.model.
						AccThirdPartyAppliInfo> orderByComparator) {

		return _accThirdPartyAppliInfoLocalService.
			getAccThirdPartyAppliInfosByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of acc third party appli infos.
	 *
	 * @return the number of acc third party appli infos
	 */
	@Override
	public int getAccThirdPartyAppliInfosCount() {
		return _accThirdPartyAppliInfoLocalService.
			getAccThirdPartyAppliInfosCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _accThirdPartyAppliInfoLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _accThirdPartyAppliInfoLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _accThirdPartyAppliInfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.janaac.application.form.service.model.AccThirdPartyAppliInfo
			getJANAAC_ByApplicationId(long janaacApplicationId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccThirdPartyAppliInfoException {

		return _accThirdPartyAppliInfoLocalService.getJANAAC_ByApplicationId(
			janaacApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _accThirdPartyAppliInfoLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accThirdPartyAppliInfoLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the acc third party appli info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccThirdPartyAppliInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accThirdPartyAppliInfo the acc third party appli info
	 * @return the acc third party appli info that was updated
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccThirdPartyAppliInfo
		updateAccThirdPartyAppliInfo(
			com.nbp.janaac.application.form.service.model.AccThirdPartyAppliInfo
				accThirdPartyAppliInfo) {

		return _accThirdPartyAppliInfoLocalService.updateAccThirdPartyAppliInfo(
			accThirdPartyAppliInfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _accThirdPartyAppliInfoLocalService.getBasePersistence();
	}

	@Override
	public AccThirdPartyAppliInfoLocalService getWrappedService() {
		return _accThirdPartyAppliInfoLocalService;
	}

	@Override
	public void setWrappedService(
		AccThirdPartyAppliInfoLocalService accThirdPartyAppliInfoLocalService) {

		_accThirdPartyAppliInfoLocalService =
			accThirdPartyAppliInfoLocalService;
	}

	private AccThirdPartyAppliInfoLocalService
		_accThirdPartyAppliInfoLocalService;

}