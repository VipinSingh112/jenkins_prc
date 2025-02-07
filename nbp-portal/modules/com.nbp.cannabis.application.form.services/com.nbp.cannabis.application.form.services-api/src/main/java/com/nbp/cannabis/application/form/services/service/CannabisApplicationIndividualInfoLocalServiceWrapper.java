/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link CannabisApplicationIndividualInfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisApplicationIndividualInfoLocalService
 * @generated
 */
public class CannabisApplicationIndividualInfoLocalServiceWrapper
	implements CannabisApplicationIndividualInfoLocalService,
			   ServiceWrapper<CannabisApplicationIndividualInfoLocalService> {

	public CannabisApplicationIndividualInfoLocalServiceWrapper() {
		this(null);
	}

	public CannabisApplicationIndividualInfoLocalServiceWrapper(
		CannabisApplicationIndividualInfoLocalService
			cannabisApplicationIndividualInfoLocalService) {

		_cannabisApplicationIndividualInfoLocalService =
			cannabisApplicationIndividualInfoLocalService;
	}

	/**
	 * Adds the cannabis application individual info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationIndividualInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisApplicationIndividualInfo the cannabis application individual info
	 * @return the cannabis application individual info that was added
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisApplicationIndividualInfo addCannabisApplicationIndividualInfo(
			com.nbp.cannabis.application.form.services.model.
				CannabisApplicationIndividualInfo
					cannabisApplicationIndividualInfo) {

		return _cannabisApplicationIndividualInfoLocalService.
			addCannabisApplicationIndividualInfo(
				cannabisApplicationIndividualInfo);
	}

	/**
	 * Creates a new cannabis application individual info with the primary key. Does not add the cannabis application individual info to the database.
	 *
	 * @param individualInformationId the primary key for the new cannabis application individual info
	 * @return the new cannabis application individual info
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisApplicationIndividualInfo
			createCannabisApplicationIndividualInfo(
				long individualInformationId) {

		return _cannabisApplicationIndividualInfoLocalService.
			createCannabisApplicationIndividualInfo(individualInformationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisApplicationIndividualInfoLocalService.
			createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the cannabis application individual info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationIndividualInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisApplicationIndividualInfo the cannabis application individual info
	 * @return the cannabis application individual info that was removed
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisApplicationIndividualInfo
			deleteCannabisApplicationIndividualInfo(
				com.nbp.cannabis.application.form.services.model.
					CannabisApplicationIndividualInfo
						cannabisApplicationIndividualInfo) {

		return _cannabisApplicationIndividualInfoLocalService.
			deleteCannabisApplicationIndividualInfo(
				cannabisApplicationIndividualInfo);
	}

	/**
	 * Deletes the cannabis application individual info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationIndividualInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param individualInformationId the primary key of the cannabis application individual info
	 * @return the cannabis application individual info that was removed
	 * @throws PortalException if a cannabis application individual info with the primary key could not be found
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisApplicationIndividualInfo
				deleteCannabisApplicationIndividualInfo(
					long individualInformationId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisApplicationIndividualInfoLocalService.
			deleteCannabisApplicationIndividualInfo(individualInformationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisApplicationIndividualInfoLocalService.
			deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _cannabisApplicationIndividualInfoLocalService.dslQuery(
			dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _cannabisApplicationIndividualInfoLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _cannabisApplicationIndividualInfoLocalService.dynamicQuery();
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

		return _cannabisApplicationIndividualInfoLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.CannabisApplicationIndividualInfoModelImpl</code>.
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

		return _cannabisApplicationIndividualInfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.CannabisApplicationIndividualInfoModelImpl</code>.
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

		return _cannabisApplicationIndividualInfoLocalService.dynamicQuery(
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

		return _cannabisApplicationIndividualInfoLocalService.dynamicQueryCount(
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

		return _cannabisApplicationIndividualInfoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisApplicationIndividualInfo
			fetchCannabisApplicationIndividualInfo(
				long individualInformationId) {

		return _cannabisApplicationIndividualInfoLocalService.
			fetchCannabisApplicationIndividualInfo(individualInformationId);
	}

	/**
	 * Returns the cannabis application individual info matching the UUID and group.
	 *
	 * @param uuid the cannabis application individual info's UUID
	 * @param groupId the primary key of the group
	 * @return the matching cannabis application individual info, or <code>null</code> if a matching cannabis application individual info could not be found
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisApplicationIndividualInfo
			fetchCannabisApplicationIndividualInfoByUuidAndGroupId(
				String uuid, long groupId) {

		return _cannabisApplicationIndividualInfoLocalService.
			fetchCannabisApplicationIndividualInfoByUuidAndGroupId(
				uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _cannabisApplicationIndividualInfoLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisApplicationIndividualInfo getCA_CI_by_AppId(
			long cannabisApplicationId) {

		return _cannabisApplicationIndividualInfoLocalService.getCA_CI_by_AppId(
			cannabisApplicationId);
	}

	/**
	 * Returns the cannabis application individual info with the primary key.
	 *
	 * @param individualInformationId the primary key of the cannabis application individual info
	 * @return the cannabis application individual info
	 * @throws PortalException if a cannabis application individual info with the primary key could not be found
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisApplicationIndividualInfo getCannabisApplicationIndividualInfo(
				long individualInformationId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisApplicationIndividualInfoLocalService.
			getCannabisApplicationIndividualInfo(individualInformationId);
	}

	/**
	 * Returns the cannabis application individual info matching the UUID and group.
	 *
	 * @param uuid the cannabis application individual info's UUID
	 * @param groupId the primary key of the group
	 * @return the matching cannabis application individual info
	 * @throws PortalException if a matching cannabis application individual info could not be found
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisApplicationIndividualInfo
				getCannabisApplicationIndividualInfoByUuidAndGroupId(
					String uuid, long groupId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisApplicationIndividualInfoLocalService.
			getCannabisApplicationIndividualInfoByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the cannabis application individual infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.CannabisApplicationIndividualInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application individual infos
	 * @param end the upper bound of the range of cannabis application individual infos (not inclusive)
	 * @return the range of cannabis application individual infos
	 */
	@Override
	public java.util.List
		<com.nbp.cannabis.application.form.services.model.
			CannabisApplicationIndividualInfo>
				getCannabisApplicationIndividualInfos(int start, int end) {

		return _cannabisApplicationIndividualInfoLocalService.
			getCannabisApplicationIndividualInfos(start, end);
	}

	/**
	 * Returns all the cannabis application individual infos matching the UUID and company.
	 *
	 * @param uuid the UUID of the cannabis application individual infos
	 * @param companyId the primary key of the company
	 * @return the matching cannabis application individual infos, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.cannabis.application.form.services.model.
			CannabisApplicationIndividualInfo>
				getCannabisApplicationIndividualInfosByUuidAndCompanyId(
					String uuid, long companyId) {

		return _cannabisApplicationIndividualInfoLocalService.
			getCannabisApplicationIndividualInfosByUuidAndCompanyId(
				uuid, companyId);
	}

	/**
	 * Returns a range of cannabis application individual infos matching the UUID and company.
	 *
	 * @param uuid the UUID of the cannabis application individual infos
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of cannabis application individual infos
	 * @param end the upper bound of the range of cannabis application individual infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching cannabis application individual infos, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.cannabis.application.form.services.model.
			CannabisApplicationIndividualInfo>
				getCannabisApplicationIndividualInfosByUuidAndCompanyId(
					String uuid, long companyId, int start, int end,
					com.liferay.portal.kernel.util.OrderByComparator
						<com.nbp.cannabis.application.form.services.model.
							CannabisApplicationIndividualInfo>
								orderByComparator) {

		return _cannabisApplicationIndividualInfoLocalService.
			getCannabisApplicationIndividualInfosByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of cannabis application individual infos.
	 *
	 * @return the number of cannabis application individual infos
	 */
	@Override
	public int getCannabisApplicationIndividualInfosCount() {
		return _cannabisApplicationIndividualInfoLocalService.
			getCannabisApplicationIndividualInfosCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _cannabisApplicationIndividualInfoLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _cannabisApplicationIndividualInfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _cannabisApplicationIndividualInfoLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisApplicationIndividualInfoLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the cannabis application individual info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationIndividualInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisApplicationIndividualInfo the cannabis application individual info
	 * @return the cannabis application individual info that was updated
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisApplicationIndividualInfo
			updateCannabisApplicationIndividualInfo(
				com.nbp.cannabis.application.form.services.model.
					CannabisApplicationIndividualInfo
						cannabisApplicationIndividualInfo) {

		return _cannabisApplicationIndividualInfoLocalService.
			updateCannabisApplicationIndividualInfo(
				cannabisApplicationIndividualInfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _cannabisApplicationIndividualInfoLocalService.
			getBasePersistence();
	}

	@Override
	public CannabisApplicationIndividualInfoLocalService getWrappedService() {
		return _cannabisApplicationIndividualInfoLocalService;
	}

	@Override
	public void setWrappedService(
		CannabisApplicationIndividualInfoLocalService
			cannabisApplicationIndividualInfoLocalService) {

		_cannabisApplicationIndividualInfoLocalService =
			cannabisApplicationIndividualInfoLocalService;
	}

	private CannabisApplicationIndividualInfoLocalService
		_cannabisApplicationIndividualInfoLocalService;

}