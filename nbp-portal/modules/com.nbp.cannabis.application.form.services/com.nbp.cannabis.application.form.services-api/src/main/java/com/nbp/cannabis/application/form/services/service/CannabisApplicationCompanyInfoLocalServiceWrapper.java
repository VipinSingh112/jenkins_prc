/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link CannabisApplicationCompanyInfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisApplicationCompanyInfoLocalService
 * @generated
 */
public class CannabisApplicationCompanyInfoLocalServiceWrapper
	implements CannabisApplicationCompanyInfoLocalService,
			   ServiceWrapper<CannabisApplicationCompanyInfoLocalService> {

	public CannabisApplicationCompanyInfoLocalServiceWrapper() {
		this(null);
	}

	public CannabisApplicationCompanyInfoLocalServiceWrapper(
		CannabisApplicationCompanyInfoLocalService
			cannabisApplicationCompanyInfoLocalService) {

		_cannabisApplicationCompanyInfoLocalService =
			cannabisApplicationCompanyInfoLocalService;
	}

	/**
	 * Adds the cannabis application company info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationCompanyInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisApplicationCompanyInfo the cannabis application company info
	 * @return the cannabis application company info that was added
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisApplicationCompanyInfo addCannabisApplicationCompanyInfo(
			com.nbp.cannabis.application.form.services.model.
				CannabisApplicationCompanyInfo cannabisApplicationCompanyInfo) {

		return _cannabisApplicationCompanyInfoLocalService.
			addCannabisApplicationCompanyInfo(cannabisApplicationCompanyInfo);
	}

	/**
	 * Creates a new cannabis application company info with the primary key. Does not add the cannabis application company info to the database.
	 *
	 * @param companyInformationId the primary key for the new cannabis application company info
	 * @return the new cannabis application company info
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisApplicationCompanyInfo createCannabisApplicationCompanyInfo(
			long companyInformationId) {

		return _cannabisApplicationCompanyInfoLocalService.
			createCannabisApplicationCompanyInfo(companyInformationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisApplicationCompanyInfoLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the cannabis application company info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationCompanyInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisApplicationCompanyInfo the cannabis application company info
	 * @return the cannabis application company info that was removed
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisApplicationCompanyInfo deleteCannabisApplicationCompanyInfo(
			com.nbp.cannabis.application.form.services.model.
				CannabisApplicationCompanyInfo cannabisApplicationCompanyInfo) {

		return _cannabisApplicationCompanyInfoLocalService.
			deleteCannabisApplicationCompanyInfo(
				cannabisApplicationCompanyInfo);
	}

	/**
	 * Deletes the cannabis application company info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationCompanyInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param companyInformationId the primary key of the cannabis application company info
	 * @return the cannabis application company info that was removed
	 * @throws PortalException if a cannabis application company info with the primary key could not be found
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisApplicationCompanyInfo deleteCannabisApplicationCompanyInfo(
				long companyInformationId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisApplicationCompanyInfoLocalService.
			deleteCannabisApplicationCompanyInfo(companyInformationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisApplicationCompanyInfoLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _cannabisApplicationCompanyInfoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _cannabisApplicationCompanyInfoLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _cannabisApplicationCompanyInfoLocalService.dynamicQuery();
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

		return _cannabisApplicationCompanyInfoLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.CannabisApplicationCompanyInfoModelImpl</code>.
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

		return _cannabisApplicationCompanyInfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.CannabisApplicationCompanyInfoModelImpl</code>.
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

		return _cannabisApplicationCompanyInfoLocalService.dynamicQuery(
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

		return _cannabisApplicationCompanyInfoLocalService.dynamicQueryCount(
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

		return _cannabisApplicationCompanyInfoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisApplicationCompanyInfo fetchCannabisApplicationCompanyInfo(
			long companyInformationId) {

		return _cannabisApplicationCompanyInfoLocalService.
			fetchCannabisApplicationCompanyInfo(companyInformationId);
	}

	/**
	 * Returns the cannabis application company info matching the UUID and group.
	 *
	 * @param uuid the cannabis application company info's UUID
	 * @param groupId the primary key of the group
	 * @return the matching cannabis application company info, or <code>null</code> if a matching cannabis application company info could not be found
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisApplicationCompanyInfo
			fetchCannabisApplicationCompanyInfoByUuidAndGroupId(
				String uuid, long groupId) {

		return _cannabisApplicationCompanyInfoLocalService.
			fetchCannabisApplicationCompanyInfoByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _cannabisApplicationCompanyInfoLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisApplicationCompanyInfo getCA_CI_by_AppId(
			long cannabisApplicationId) {

		return _cannabisApplicationCompanyInfoLocalService.getCA_CI_by_AppId(
			cannabisApplicationId);
	}

	/**
	 * Returns the cannabis application company info with the primary key.
	 *
	 * @param companyInformationId the primary key of the cannabis application company info
	 * @return the cannabis application company info
	 * @throws PortalException if a cannabis application company info with the primary key could not be found
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisApplicationCompanyInfo getCannabisApplicationCompanyInfo(
				long companyInformationId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisApplicationCompanyInfoLocalService.
			getCannabisApplicationCompanyInfo(companyInformationId);
	}

	/**
	 * Returns the cannabis application company info matching the UUID and group.
	 *
	 * @param uuid the cannabis application company info's UUID
	 * @param groupId the primary key of the group
	 * @return the matching cannabis application company info
	 * @throws PortalException if a matching cannabis application company info could not be found
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisApplicationCompanyInfo
				getCannabisApplicationCompanyInfoByUuidAndGroupId(
					String uuid, long groupId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisApplicationCompanyInfoLocalService.
			getCannabisApplicationCompanyInfoByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the cannabis application company infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.CannabisApplicationCompanyInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application company infos
	 * @param end the upper bound of the range of cannabis application company infos (not inclusive)
	 * @return the range of cannabis application company infos
	 */
	@Override
	public java.util.List
		<com.nbp.cannabis.application.form.services.model.
			CannabisApplicationCompanyInfo> getCannabisApplicationCompanyInfos(
				int start, int end) {

		return _cannabisApplicationCompanyInfoLocalService.
			getCannabisApplicationCompanyInfos(start, end);
	}

	/**
	 * Returns all the cannabis application company infos matching the UUID and company.
	 *
	 * @param uuid the UUID of the cannabis application company infos
	 * @param companyId the primary key of the company
	 * @return the matching cannabis application company infos, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.cannabis.application.form.services.model.
			CannabisApplicationCompanyInfo>
				getCannabisApplicationCompanyInfosByUuidAndCompanyId(
					String uuid, long companyId) {

		return _cannabisApplicationCompanyInfoLocalService.
			getCannabisApplicationCompanyInfosByUuidAndCompanyId(
				uuid, companyId);
	}

	/**
	 * Returns a range of cannabis application company infos matching the UUID and company.
	 *
	 * @param uuid the UUID of the cannabis application company infos
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of cannabis application company infos
	 * @param end the upper bound of the range of cannabis application company infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching cannabis application company infos, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.cannabis.application.form.services.model.
			CannabisApplicationCompanyInfo>
				getCannabisApplicationCompanyInfosByUuidAndCompanyId(
					String uuid, long companyId, int start, int end,
					com.liferay.portal.kernel.util.OrderByComparator
						<com.nbp.cannabis.application.form.services.model.
							CannabisApplicationCompanyInfo> orderByComparator) {

		return _cannabisApplicationCompanyInfoLocalService.
			getCannabisApplicationCompanyInfosByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of cannabis application company infos.
	 *
	 * @return the number of cannabis application company infos
	 */
	@Override
	public int getCannabisApplicationCompanyInfosCount() {
		return _cannabisApplicationCompanyInfoLocalService.
			getCannabisApplicationCompanyInfosCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _cannabisApplicationCompanyInfoLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _cannabisApplicationCompanyInfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _cannabisApplicationCompanyInfoLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisApplicationCompanyInfoLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the cannabis application company info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationCompanyInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisApplicationCompanyInfo the cannabis application company info
	 * @return the cannabis application company info that was updated
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisApplicationCompanyInfo updateCannabisApplicationCompanyInfo(
			com.nbp.cannabis.application.form.services.model.
				CannabisApplicationCompanyInfo cannabisApplicationCompanyInfo) {

		return _cannabisApplicationCompanyInfoLocalService.
			updateCannabisApplicationCompanyInfo(
				cannabisApplicationCompanyInfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _cannabisApplicationCompanyInfoLocalService.getBasePersistence();
	}

	@Override
	public CannabisApplicationCompanyInfoLocalService getWrappedService() {
		return _cannabisApplicationCompanyInfoLocalService;
	}

	@Override
	public void setWrappedService(
		CannabisApplicationCompanyInfoLocalService
			cannabisApplicationCompanyInfoLocalService) {

		_cannabisApplicationCompanyInfoLocalService =
			cannabisApplicationCompanyInfoLocalService;
	}

	private CannabisApplicationCompanyInfoLocalService
		_cannabisApplicationCompanyInfoLocalService;

}