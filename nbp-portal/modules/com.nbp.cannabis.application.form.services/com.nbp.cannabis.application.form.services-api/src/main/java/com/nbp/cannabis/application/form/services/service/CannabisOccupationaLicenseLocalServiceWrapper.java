/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link CannabisOccupationaLicenseLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisOccupationaLicenseLocalService
 * @generated
 */
public class CannabisOccupationaLicenseLocalServiceWrapper
	implements CannabisOccupationaLicenseLocalService,
			   ServiceWrapper<CannabisOccupationaLicenseLocalService> {

	public CannabisOccupationaLicenseLocalServiceWrapper() {
		this(null);
	}

	public CannabisOccupationaLicenseLocalServiceWrapper(
		CannabisOccupationaLicenseLocalService
			cannabisOccupationaLicenseLocalService) {

		_cannabisOccupationaLicenseLocalService =
			cannabisOccupationaLicenseLocalService;
	}

	/**
	 * Adds the cannabis occupationa license to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisOccupationaLicenseLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisOccupationaLicense the cannabis occupationa license
	 * @return the cannabis occupationa license that was added
	 */
	@Override
	public
		com.nbp.cannabis.application.form.services.model.
			CannabisOccupationaLicense addCannabisOccupationaLicense(
				com.nbp.cannabis.application.form.services.model.
					CannabisOccupationaLicense cannabisOccupationaLicense) {

		return _cannabisOccupationaLicenseLocalService.
			addCannabisOccupationaLicense(cannabisOccupationaLicense);
	}

	/**
	 * Creates a new cannabis occupationa license with the primary key. Does not add the cannabis occupationa license to the database.
	 *
	 * @param cannabisOccupationaLicenseId the primary key for the new cannabis occupationa license
	 * @return the new cannabis occupationa license
	 */
	@Override
	public
		com.nbp.cannabis.application.form.services.model.
			CannabisOccupationaLicense createCannabisOccupationaLicense(
				long cannabisOccupationaLicenseId) {

		return _cannabisOccupationaLicenseLocalService.
			createCannabisOccupationaLicense(cannabisOccupationaLicenseId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisOccupationaLicenseLocalService.createPersistedModel(
			primaryKeyObj);
	}

	@Override
	public void deleteCA_OL_BY_Id(long cannabisId) {
		_cannabisOccupationaLicenseLocalService.deleteCA_OL_BY_Id(cannabisId);
	}

	/**
	 * Deletes the cannabis occupationa license from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisOccupationaLicenseLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisOccupationaLicense the cannabis occupationa license
	 * @return the cannabis occupationa license that was removed
	 */
	@Override
	public
		com.nbp.cannabis.application.form.services.model.
			CannabisOccupationaLicense deleteCannabisOccupationaLicense(
				com.nbp.cannabis.application.form.services.model.
					CannabisOccupationaLicense cannabisOccupationaLicense) {

		return _cannabisOccupationaLicenseLocalService.
			deleteCannabisOccupationaLicense(cannabisOccupationaLicense);
	}

	/**
	 * Deletes the cannabis occupationa license with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisOccupationaLicenseLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisOccupationaLicenseId the primary key of the cannabis occupationa license
	 * @return the cannabis occupationa license that was removed
	 * @throws PortalException if a cannabis occupationa license with the primary key could not be found
	 */
	@Override
	public
		com.nbp.cannabis.application.form.services.model.
			CannabisOccupationaLicense deleteCannabisOccupationaLicense(
					long cannabisOccupationaLicenseId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisOccupationaLicenseLocalService.
			deleteCannabisOccupationaLicense(cannabisOccupationaLicenseId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisOccupationaLicenseLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _cannabisOccupationaLicenseLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _cannabisOccupationaLicenseLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _cannabisOccupationaLicenseLocalService.dynamicQuery();
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

		return _cannabisOccupationaLicenseLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.CannabisOccupationaLicenseModelImpl</code>.
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

		return _cannabisOccupationaLicenseLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.CannabisOccupationaLicenseModelImpl</code>.
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

		return _cannabisOccupationaLicenseLocalService.dynamicQuery(
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

		return _cannabisOccupationaLicenseLocalService.dynamicQueryCount(
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

		return _cannabisOccupationaLicenseLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.cannabis.application.form.services.model.
			CannabisOccupationaLicense fetchCannabisOccupationaLicense(
				long cannabisOccupationaLicenseId) {

		return _cannabisOccupationaLicenseLocalService.
			fetchCannabisOccupationaLicense(cannabisOccupationaLicenseId);
	}

	/**
	 * Returns the cannabis occupationa license matching the UUID and group.
	 *
	 * @param uuid the cannabis occupationa license's UUID
	 * @param groupId the primary key of the group
	 * @return the matching cannabis occupationa license, or <code>null</code> if a matching cannabis occupationa license could not be found
	 */
	@Override
	public
		com.nbp.cannabis.application.form.services.model.
			CannabisOccupationaLicense
				fetchCannabisOccupationaLicenseByUuidAndGroupId(
					String uuid, long groupId) {

		return _cannabisOccupationaLicenseLocalService.
			fetchCannabisOccupationaLicenseByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _cannabisOccupationaLicenseLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.cannabis.application.form.services.model.
			CannabisOccupationaLicense> getCA_OL_CAI(
				long cannabisAppicationId) {

		return _cannabisOccupationaLicenseLocalService.getCA_OL_CAI(
			cannabisAppicationId);
	}

	/**
	 * Returns the cannabis occupationa license with the primary key.
	 *
	 * @param cannabisOccupationaLicenseId the primary key of the cannabis occupationa license
	 * @return the cannabis occupationa license
	 * @throws PortalException if a cannabis occupationa license with the primary key could not be found
	 */
	@Override
	public
		com.nbp.cannabis.application.form.services.model.
			CannabisOccupationaLicense getCannabisOccupationaLicense(
					long cannabisOccupationaLicenseId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisOccupationaLicenseLocalService.
			getCannabisOccupationaLicense(cannabisOccupationaLicenseId);
	}

	/**
	 * Returns the cannabis occupationa license matching the UUID and group.
	 *
	 * @param uuid the cannabis occupationa license's UUID
	 * @param groupId the primary key of the group
	 * @return the matching cannabis occupationa license
	 * @throws PortalException if a matching cannabis occupationa license could not be found
	 */
	@Override
	public
		com.nbp.cannabis.application.form.services.model.
			CannabisOccupationaLicense
					getCannabisOccupationaLicenseByUuidAndGroupId(
						String uuid, long groupId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisOccupationaLicenseLocalService.
			getCannabisOccupationaLicenseByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the cannabis occupationa licenses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.CannabisOccupationaLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis occupationa licenses
	 * @param end the upper bound of the range of cannabis occupationa licenses (not inclusive)
	 * @return the range of cannabis occupationa licenses
	 */
	@Override
	public java.util.List
		<com.nbp.cannabis.application.form.services.model.
			CannabisOccupationaLicense> getCannabisOccupationaLicenses(
				int start, int end) {

		return _cannabisOccupationaLicenseLocalService.
			getCannabisOccupationaLicenses(start, end);
	}

	/**
	 * Returns all the cannabis occupationa licenses matching the UUID and company.
	 *
	 * @param uuid the UUID of the cannabis occupationa licenses
	 * @param companyId the primary key of the company
	 * @return the matching cannabis occupationa licenses, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.cannabis.application.form.services.model.
			CannabisOccupationaLicense>
				getCannabisOccupationaLicensesByUuidAndCompanyId(
					String uuid, long companyId) {

		return _cannabisOccupationaLicenseLocalService.
			getCannabisOccupationaLicensesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of cannabis occupationa licenses matching the UUID and company.
	 *
	 * @param uuid the UUID of the cannabis occupationa licenses
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of cannabis occupationa licenses
	 * @param end the upper bound of the range of cannabis occupationa licenses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching cannabis occupationa licenses, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.cannabis.application.form.services.model.
			CannabisOccupationaLicense>
				getCannabisOccupationaLicensesByUuidAndCompanyId(
					String uuid, long companyId, int start, int end,
					com.liferay.portal.kernel.util.OrderByComparator
						<com.nbp.cannabis.application.form.services.model.
							CannabisOccupationaLicense> orderByComparator) {

		return _cannabisOccupationaLicenseLocalService.
			getCannabisOccupationaLicensesByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of cannabis occupationa licenses.
	 *
	 * @return the number of cannabis occupationa licenses
	 */
	@Override
	public int getCannabisOccupationaLicensesCount() {
		return _cannabisOccupationaLicenseLocalService.
			getCannabisOccupationaLicensesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _cannabisOccupationaLicenseLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _cannabisOccupationaLicenseLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _cannabisOccupationaLicenseLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisOccupationaLicenseLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the cannabis occupationa license in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisOccupationaLicenseLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisOccupationaLicense the cannabis occupationa license
	 * @return the cannabis occupationa license that was updated
	 */
	@Override
	public
		com.nbp.cannabis.application.form.services.model.
			CannabisOccupationaLicense updateCannabisOccupationaLicense(
				com.nbp.cannabis.application.form.services.model.
					CannabisOccupationaLicense cannabisOccupationaLicense) {

		return _cannabisOccupationaLicenseLocalService.
			updateCannabisOccupationaLicense(cannabisOccupationaLicense);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _cannabisOccupationaLicenseLocalService.getBasePersistence();
	}

	@Override
	public CannabisOccupationaLicenseLocalService getWrappedService() {
		return _cannabisOccupationaLicenseLocalService;
	}

	@Override
	public void setWrappedService(
		CannabisOccupationaLicenseLocalService
			cannabisOccupationaLicenseLocalService) {

		_cannabisOccupationaLicenseLocalService =
			cannabisOccupationaLicenseLocalService;
	}

	private CannabisOccupationaLicenseLocalService
		_cannabisOccupationaLicenseLocalService;

}