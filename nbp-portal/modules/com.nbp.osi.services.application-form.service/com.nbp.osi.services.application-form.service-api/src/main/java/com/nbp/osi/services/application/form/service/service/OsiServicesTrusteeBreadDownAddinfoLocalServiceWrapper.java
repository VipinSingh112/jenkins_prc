/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link OsiServicesTrusteeBreadDownAddinfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see OsiServicesTrusteeBreadDownAddinfoLocalService
 * @generated
 */
public class OsiServicesTrusteeBreadDownAddinfoLocalServiceWrapper
	implements OsiServicesTrusteeBreadDownAddinfoLocalService,
			   ServiceWrapper<OsiServicesTrusteeBreadDownAddinfoLocalService> {

	public OsiServicesTrusteeBreadDownAddinfoLocalServiceWrapper() {
		this(null);
	}

	public OsiServicesTrusteeBreadDownAddinfoLocalServiceWrapper(
		OsiServicesTrusteeBreadDownAddinfoLocalService
			osiServicesTrusteeBreadDownAddinfoLocalService) {

		_osiServicesTrusteeBreadDownAddinfoLocalService =
			osiServicesTrusteeBreadDownAddinfoLocalService;
	}

	/**
	 * Adds the osi services trustee bread down addinfo to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesTrusteeBreadDownAddinfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesTrusteeBreadDownAddinfo the osi services trustee bread down addinfo
	 * @return the osi services trustee bread down addinfo that was added
	 */
	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesTrusteeBreadDownAddinfo
			addOsiServicesTrusteeBreadDownAddinfo(
				com.nbp.osi.services.application.form.service.model.
					OsiServicesTrusteeBreadDownAddinfo
						osiServicesTrusteeBreadDownAddinfo) {

		return _osiServicesTrusteeBreadDownAddinfoLocalService.
			addOsiServicesTrusteeBreadDownAddinfo(
				osiServicesTrusteeBreadDownAddinfo);
	}

	/**
	 * Creates a new osi services trustee bread down addinfo with the primary key. Does not add the osi services trustee bread down addinfo to the database.
	 *
	 * @param osiTrusId the primary key for the new osi services trustee bread down addinfo
	 * @return the new osi services trustee bread down addinfo
	 */
	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesTrusteeBreadDownAddinfo
			createOsiServicesTrusteeBreadDownAddinfo(long osiTrusId) {

		return _osiServicesTrusteeBreadDownAddinfoLocalService.
			createOsiServicesTrusteeBreadDownAddinfo(osiTrusId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesTrusteeBreadDownAddinfoLocalService.
			createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the osi services trustee bread down addinfo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesTrusteeBreadDownAddinfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiTrusId the primary key of the osi services trustee bread down addinfo
	 * @return the osi services trustee bread down addinfo that was removed
	 * @throws PortalException if a osi services trustee bread down addinfo with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesTrusteeBreadDownAddinfo
				deleteOsiServicesTrusteeBreadDownAddinfo(long osiTrusId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesTrusteeBreadDownAddinfoLocalService.
			deleteOsiServicesTrusteeBreadDownAddinfo(osiTrusId);
	}

	/**
	 * Deletes the osi services trustee bread down addinfo from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesTrusteeBreadDownAddinfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesTrusteeBreadDownAddinfo the osi services trustee bread down addinfo
	 * @return the osi services trustee bread down addinfo that was removed
	 */
	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesTrusteeBreadDownAddinfo
			deleteOsiServicesTrusteeBreadDownAddinfo(
				com.nbp.osi.services.application.form.service.model.
					OsiServicesTrusteeBreadDownAddinfo
						osiServicesTrusteeBreadDownAddinfo) {

		return _osiServicesTrusteeBreadDownAddinfoLocalService.
			deleteOsiServicesTrusteeBreadDownAddinfo(
				osiServicesTrusteeBreadDownAddinfo);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesTrusteeBreadDownAddinfoLocalService.
			deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _osiServicesTrusteeBreadDownAddinfoLocalService.dslQuery(
			dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _osiServicesTrusteeBreadDownAddinfoLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _osiServicesTrusteeBreadDownAddinfoLocalService.dynamicQuery();
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

		return _osiServicesTrusteeBreadDownAddinfoLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.application.form.service.model.impl.OsiServicesTrusteeBreadDownAddinfoModelImpl</code>.
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

		return _osiServicesTrusteeBreadDownAddinfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.application.form.service.model.impl.OsiServicesTrusteeBreadDownAddinfoModelImpl</code>.
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

		return _osiServicesTrusteeBreadDownAddinfoLocalService.dynamicQuery(
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

		return _osiServicesTrusteeBreadDownAddinfoLocalService.
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

		return _osiServicesTrusteeBreadDownAddinfoLocalService.
			dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesTrusteeBreadDownAddinfo
			fetchOsiServicesTrusteeBreadDownAddinfo(long osiTrusId) {

		return _osiServicesTrusteeBreadDownAddinfoLocalService.
			fetchOsiServicesTrusteeBreadDownAddinfo(osiTrusId);
	}

	/**
	 * Returns the osi services trustee bread down addinfo matching the UUID and group.
	 *
	 * @param uuid the osi services trustee bread down addinfo's UUID
	 * @param groupId the primary key of the group
	 * @return the matching osi services trustee bread down addinfo, or <code>null</code> if a matching osi services trustee bread down addinfo could not be found
	 */
	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesTrusteeBreadDownAddinfo
			fetchOsiServicesTrusteeBreadDownAddinfoByUuidAndGroupId(
				String uuid, long groupId) {

		return _osiServicesTrusteeBreadDownAddinfoLocalService.
			fetchOsiServicesTrusteeBreadDownAddinfoByUuidAndGroupId(
				uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _osiServicesTrusteeBreadDownAddinfoLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.osi.services.application.form.service.model.
			OsiServicesTrusteeBreadDownAddinfo> getBreakDownAdd_By_Id(
				long osiId) {

		return _osiServicesTrusteeBreadDownAddinfoLocalService.
			getBreakDownAdd_By_Id(osiId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _osiServicesTrusteeBreadDownAddinfoLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _osiServicesTrusteeBreadDownAddinfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _osiServicesTrusteeBreadDownAddinfoLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * Returns the osi services trustee bread down addinfo with the primary key.
	 *
	 * @param osiTrusId the primary key of the osi services trustee bread down addinfo
	 * @return the osi services trustee bread down addinfo
	 * @throws PortalException if a osi services trustee bread down addinfo with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesTrusteeBreadDownAddinfo
				getOsiServicesTrusteeBreadDownAddinfo(long osiTrusId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesTrusteeBreadDownAddinfoLocalService.
			getOsiServicesTrusteeBreadDownAddinfo(osiTrusId);
	}

	/**
	 * Returns the osi services trustee bread down addinfo matching the UUID and group.
	 *
	 * @param uuid the osi services trustee bread down addinfo's UUID
	 * @param groupId the primary key of the group
	 * @return the matching osi services trustee bread down addinfo
	 * @throws PortalException if a matching osi services trustee bread down addinfo could not be found
	 */
	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesTrusteeBreadDownAddinfo
				getOsiServicesTrusteeBreadDownAddinfoByUuidAndGroupId(
					String uuid, long groupId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesTrusteeBreadDownAddinfoLocalService.
			getOsiServicesTrusteeBreadDownAddinfoByUuidAndGroupId(
				uuid, groupId);
	}

	/**
	 * Returns a range of all the osi services trustee bread down addinfos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.application.form.service.model.impl.OsiServicesTrusteeBreadDownAddinfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services trustee bread down addinfos
	 * @param end the upper bound of the range of osi services trustee bread down addinfos (not inclusive)
	 * @return the range of osi services trustee bread down addinfos
	 */
	@Override
	public java.util.List
		<com.nbp.osi.services.application.form.service.model.
			OsiServicesTrusteeBreadDownAddinfo>
				getOsiServicesTrusteeBreadDownAddinfos(int start, int end) {

		return _osiServicesTrusteeBreadDownAddinfoLocalService.
			getOsiServicesTrusteeBreadDownAddinfos(start, end);
	}

	/**
	 * Returns all the osi services trustee bread down addinfos matching the UUID and company.
	 *
	 * @param uuid the UUID of the osi services trustee bread down addinfos
	 * @param companyId the primary key of the company
	 * @return the matching osi services trustee bread down addinfos, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.osi.services.application.form.service.model.
			OsiServicesTrusteeBreadDownAddinfo>
				getOsiServicesTrusteeBreadDownAddinfosByUuidAndCompanyId(
					String uuid, long companyId) {

		return _osiServicesTrusteeBreadDownAddinfoLocalService.
			getOsiServicesTrusteeBreadDownAddinfosByUuidAndCompanyId(
				uuid, companyId);
	}

	/**
	 * Returns a range of osi services trustee bread down addinfos matching the UUID and company.
	 *
	 * @param uuid the UUID of the osi services trustee bread down addinfos
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of osi services trustee bread down addinfos
	 * @param end the upper bound of the range of osi services trustee bread down addinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching osi services trustee bread down addinfos, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.osi.services.application.form.service.model.
			OsiServicesTrusteeBreadDownAddinfo>
				getOsiServicesTrusteeBreadDownAddinfosByUuidAndCompanyId(
					String uuid, long companyId, int start, int end,
					com.liferay.portal.kernel.util.OrderByComparator
						<com.nbp.osi.services.application.form.service.model.
							OsiServicesTrusteeBreadDownAddinfo>
								orderByComparator) {

		return _osiServicesTrusteeBreadDownAddinfoLocalService.
			getOsiServicesTrusteeBreadDownAddinfosByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of osi services trustee bread down addinfos.
	 *
	 * @return the number of osi services trustee bread down addinfos
	 */
	@Override
	public int getOsiServicesTrusteeBreadDownAddinfosCount() {
		return _osiServicesTrusteeBreadDownAddinfoLocalService.
			getOsiServicesTrusteeBreadDownAddinfosCount();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesTrusteeBreadDownAddinfoLocalService.
			getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the osi services trustee bread down addinfo in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesTrusteeBreadDownAddinfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesTrusteeBreadDownAddinfo the osi services trustee bread down addinfo
	 * @return the osi services trustee bread down addinfo that was updated
	 */
	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesTrusteeBreadDownAddinfo
			updateOsiServicesTrusteeBreadDownAddinfo(
				com.nbp.osi.services.application.form.service.model.
					OsiServicesTrusteeBreadDownAddinfo
						osiServicesTrusteeBreadDownAddinfo) {

		return _osiServicesTrusteeBreadDownAddinfoLocalService.
			updateOsiServicesTrusteeBreadDownAddinfo(
				osiServicesTrusteeBreadDownAddinfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _osiServicesTrusteeBreadDownAddinfoLocalService.
			getBasePersistence();
	}

	@Override
	public OsiServicesTrusteeBreadDownAddinfoLocalService getWrappedService() {
		return _osiServicesTrusteeBreadDownAddinfoLocalService;
	}

	@Override
	public void setWrappedService(
		OsiServicesTrusteeBreadDownAddinfoLocalService
			osiServicesTrusteeBreadDownAddinfoLocalService) {

		_osiServicesTrusteeBreadDownAddinfoLocalService =
			osiServicesTrusteeBreadDownAddinfoLocalService;
	}

	private OsiServicesTrusteeBreadDownAddinfoLocalService
		_osiServicesTrusteeBreadDownAddinfoLocalService;

}