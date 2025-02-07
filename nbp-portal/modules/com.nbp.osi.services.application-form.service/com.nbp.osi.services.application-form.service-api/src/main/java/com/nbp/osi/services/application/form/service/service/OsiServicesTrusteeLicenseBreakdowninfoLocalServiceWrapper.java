/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link OsiServicesTrusteeLicenseBreakdowninfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see OsiServicesTrusteeLicenseBreakdowninfoLocalService
 * @generated
 */
public class OsiServicesTrusteeLicenseBreakdowninfoLocalServiceWrapper
	implements OsiServicesTrusteeLicenseBreakdowninfoLocalService,
			   ServiceWrapper
				   <OsiServicesTrusteeLicenseBreakdowninfoLocalService> {

	public OsiServicesTrusteeLicenseBreakdowninfoLocalServiceWrapper() {
		this(null);
	}

	public OsiServicesTrusteeLicenseBreakdowninfoLocalServiceWrapper(
		OsiServicesTrusteeLicenseBreakdowninfoLocalService
			osiServicesTrusteeLicenseBreakdowninfoLocalService) {

		_osiServicesTrusteeLicenseBreakdowninfoLocalService =
			osiServicesTrusteeLicenseBreakdowninfoLocalService;
	}

	/**
	 * Adds the osi services trustee license breakdowninfo to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesTrusteeLicenseBreakdowninfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesTrusteeLicenseBreakdowninfo the osi services trustee license breakdowninfo
	 * @return the osi services trustee license breakdowninfo that was added
	 */
	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesTrusteeLicenseBreakdowninfo
			addOsiServicesTrusteeLicenseBreakdowninfo(
				com.nbp.osi.services.application.form.service.model.
					OsiServicesTrusteeLicenseBreakdowninfo
						osiServicesTrusteeLicenseBreakdowninfo) {

		return _osiServicesTrusteeLicenseBreakdowninfoLocalService.
			addOsiServicesTrusteeLicenseBreakdowninfo(
				osiServicesTrusteeLicenseBreakdowninfo);
	}

	/**
	 * Creates a new osi services trustee license breakdowninfo with the primary key. Does not add the osi services trustee license breakdowninfo to the database.
	 *
	 * @param osiLicBreakId the primary key for the new osi services trustee license breakdowninfo
	 * @return the new osi services trustee license breakdowninfo
	 */
	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesTrusteeLicenseBreakdowninfo
			createOsiServicesTrusteeLicenseBreakdowninfo(long osiLicBreakId) {

		return _osiServicesTrusteeLicenseBreakdowninfoLocalService.
			createOsiServicesTrusteeLicenseBreakdowninfo(osiLicBreakId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesTrusteeLicenseBreakdowninfoLocalService.
			createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the osi services trustee license breakdowninfo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesTrusteeLicenseBreakdowninfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiLicBreakId the primary key of the osi services trustee license breakdowninfo
	 * @return the osi services trustee license breakdowninfo that was removed
	 * @throws PortalException if a osi services trustee license breakdowninfo with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesTrusteeLicenseBreakdowninfo
				deleteOsiServicesTrusteeLicenseBreakdowninfo(long osiLicBreakId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesTrusteeLicenseBreakdowninfoLocalService.
			deleteOsiServicesTrusteeLicenseBreakdowninfo(osiLicBreakId);
	}

	/**
	 * Deletes the osi services trustee license breakdowninfo from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesTrusteeLicenseBreakdowninfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesTrusteeLicenseBreakdowninfo the osi services trustee license breakdowninfo
	 * @return the osi services trustee license breakdowninfo that was removed
	 */
	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesTrusteeLicenseBreakdowninfo
			deleteOsiServicesTrusteeLicenseBreakdowninfo(
				com.nbp.osi.services.application.form.service.model.
					OsiServicesTrusteeLicenseBreakdowninfo
						osiServicesTrusteeLicenseBreakdowninfo) {

		return _osiServicesTrusteeLicenseBreakdowninfoLocalService.
			deleteOsiServicesTrusteeLicenseBreakdowninfo(
				osiServicesTrusteeLicenseBreakdowninfo);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesTrusteeLicenseBreakdowninfoLocalService.
			deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _osiServicesTrusteeLicenseBreakdowninfoLocalService.dslQuery(
			dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _osiServicesTrusteeLicenseBreakdowninfoLocalService.
			dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _osiServicesTrusteeLicenseBreakdowninfoLocalService.
			dynamicQuery();
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

		return _osiServicesTrusteeLicenseBreakdowninfoLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.application.form.service.model.impl.OsiServicesTrusteeLicenseBreakdowninfoModelImpl</code>.
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

		return _osiServicesTrusteeLicenseBreakdowninfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.application.form.service.model.impl.OsiServicesTrusteeLicenseBreakdowninfoModelImpl</code>.
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

		return _osiServicesTrusteeLicenseBreakdowninfoLocalService.dynamicQuery(
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

		return _osiServicesTrusteeLicenseBreakdowninfoLocalService.
			dynamicQueryCount(dynamicQuery);
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

		return _osiServicesTrusteeLicenseBreakdowninfoLocalService.
			dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesTrusteeLicenseBreakdowninfo
			fetchOsiServicesTrusteeLicenseBreakdowninfo(long osiLicBreakId) {

		return _osiServicesTrusteeLicenseBreakdowninfoLocalService.
			fetchOsiServicesTrusteeLicenseBreakdowninfo(osiLicBreakId);
	}

	/**
	 * Returns the osi services trustee license breakdowninfo matching the UUID and group.
	 *
	 * @param uuid the osi services trustee license breakdowninfo's UUID
	 * @param groupId the primary key of the group
	 * @return the matching osi services trustee license breakdowninfo, or <code>null</code> if a matching osi services trustee license breakdowninfo could not be found
	 */
	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesTrusteeLicenseBreakdowninfo
			fetchOsiServicesTrusteeLicenseBreakdowninfoByUuidAndGroupId(
				String uuid, long groupId) {

		return _osiServicesTrusteeLicenseBreakdowninfoLocalService.
			fetchOsiServicesTrusteeLicenseBreakdowninfoByUuidAndGroupId(
				uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _osiServicesTrusteeLicenseBreakdowninfoLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _osiServicesTrusteeLicenseBreakdowninfoLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _osiServicesTrusteeLicenseBreakdowninfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _osiServicesTrusteeLicenseBreakdowninfoLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * Returns the osi services trustee license breakdowninfo with the primary key.
	 *
	 * @param osiLicBreakId the primary key of the osi services trustee license breakdowninfo
	 * @return the osi services trustee license breakdowninfo
	 * @throws PortalException if a osi services trustee license breakdowninfo with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesTrusteeLicenseBreakdowninfo
				getOsiServicesTrusteeLicenseBreakdowninfo(long osiLicBreakId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesTrusteeLicenseBreakdowninfoLocalService.
			getOsiServicesTrusteeLicenseBreakdowninfo(osiLicBreakId);
	}

	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesTrusteeLicenseBreakdowninfo
				getOsiServicesTrusteeLicenseBreakdowninfoById(
					long applicationId)
			throws com.nbp.osi.services.application.form.service.exception.
				NoSuchOsiServicesTrusteeLicenseBreakdowninfoException {

		return _osiServicesTrusteeLicenseBreakdowninfoLocalService.
			getOsiServicesTrusteeLicenseBreakdowninfoById(applicationId);
	}

	/**
	 * Returns the osi services trustee license breakdowninfo matching the UUID and group.
	 *
	 * @param uuid the osi services trustee license breakdowninfo's UUID
	 * @param groupId the primary key of the group
	 * @return the matching osi services trustee license breakdowninfo
	 * @throws PortalException if a matching osi services trustee license breakdowninfo could not be found
	 */
	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesTrusteeLicenseBreakdowninfo
				getOsiServicesTrusteeLicenseBreakdowninfoByUuidAndGroupId(
					String uuid, long groupId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesTrusteeLicenseBreakdowninfoLocalService.
			getOsiServicesTrusteeLicenseBreakdowninfoByUuidAndGroupId(
				uuid, groupId);
	}

	/**
	 * Returns a range of all the osi services trustee license breakdowninfos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.application.form.service.model.impl.OsiServicesTrusteeLicenseBreakdowninfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services trustee license breakdowninfos
	 * @param end the upper bound of the range of osi services trustee license breakdowninfos (not inclusive)
	 * @return the range of osi services trustee license breakdowninfos
	 */
	@Override
	public java.util.List
		<com.nbp.osi.services.application.form.service.model.
			OsiServicesTrusteeLicenseBreakdowninfo>
				getOsiServicesTrusteeLicenseBreakdowninfos(int start, int end) {

		return _osiServicesTrusteeLicenseBreakdowninfoLocalService.
			getOsiServicesTrusteeLicenseBreakdowninfos(start, end);
	}

	/**
	 * Returns all the osi services trustee license breakdowninfos matching the UUID and company.
	 *
	 * @param uuid the UUID of the osi services trustee license breakdowninfos
	 * @param companyId the primary key of the company
	 * @return the matching osi services trustee license breakdowninfos, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.osi.services.application.form.service.model.
			OsiServicesTrusteeLicenseBreakdowninfo>
				getOsiServicesTrusteeLicenseBreakdowninfosByUuidAndCompanyId(
					String uuid, long companyId) {

		return _osiServicesTrusteeLicenseBreakdowninfoLocalService.
			getOsiServicesTrusteeLicenseBreakdowninfosByUuidAndCompanyId(
				uuid, companyId);
	}

	/**
	 * Returns a range of osi services trustee license breakdowninfos matching the UUID and company.
	 *
	 * @param uuid the UUID of the osi services trustee license breakdowninfos
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of osi services trustee license breakdowninfos
	 * @param end the upper bound of the range of osi services trustee license breakdowninfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching osi services trustee license breakdowninfos, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.osi.services.application.form.service.model.
			OsiServicesTrusteeLicenseBreakdowninfo>
				getOsiServicesTrusteeLicenseBreakdowninfosByUuidAndCompanyId(
					String uuid, long companyId, int start, int end,
					com.liferay.portal.kernel.util.OrderByComparator
						<com.nbp.osi.services.application.form.service.model.
							OsiServicesTrusteeLicenseBreakdowninfo>
								orderByComparator) {

		return _osiServicesTrusteeLicenseBreakdowninfoLocalService.
			getOsiServicesTrusteeLicenseBreakdowninfosByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of osi services trustee license breakdowninfos.
	 *
	 * @return the number of osi services trustee license breakdowninfos
	 */
	@Override
	public int getOsiServicesTrusteeLicenseBreakdowninfosCount() {
		return _osiServicesTrusteeLicenseBreakdowninfoLocalService.
			getOsiServicesTrusteeLicenseBreakdowninfosCount();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesTrusteeLicenseBreakdowninfoLocalService.
			getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the osi services trustee license breakdowninfo in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesTrusteeLicenseBreakdowninfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesTrusteeLicenseBreakdowninfo the osi services trustee license breakdowninfo
	 * @return the osi services trustee license breakdowninfo that was updated
	 */
	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesTrusteeLicenseBreakdowninfo
			updateOsiServicesTrusteeLicenseBreakdowninfo(
				com.nbp.osi.services.application.form.service.model.
					OsiServicesTrusteeLicenseBreakdowninfo
						osiServicesTrusteeLicenseBreakdowninfo) {

		return _osiServicesTrusteeLicenseBreakdowninfoLocalService.
			updateOsiServicesTrusteeLicenseBreakdowninfo(
				osiServicesTrusteeLicenseBreakdowninfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _osiServicesTrusteeLicenseBreakdowninfoLocalService.
			getBasePersistence();
	}

	@Override
	public OsiServicesTrusteeLicenseBreakdowninfoLocalService
		getWrappedService() {

		return _osiServicesTrusteeLicenseBreakdowninfoLocalService;
	}

	@Override
	public void setWrappedService(
		OsiServicesTrusteeLicenseBreakdowninfoLocalService
			osiServicesTrusteeLicenseBreakdowninfoLocalService) {

		_osiServicesTrusteeLicenseBreakdowninfoLocalService =
			osiServicesTrusteeLicenseBreakdowninfoLocalService;
	}

	private OsiServicesTrusteeLicenseBreakdowninfoLocalService
		_osiServicesTrusteeLicenseBreakdowninfoLocalService;

}