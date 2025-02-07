/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link OsiServicesTrusteeCompanyinfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see OsiServicesTrusteeCompanyinfoLocalService
 * @generated
 */
public class OsiServicesTrusteeCompanyinfoLocalServiceWrapper
	implements OsiServicesTrusteeCompanyinfoLocalService,
			   ServiceWrapper<OsiServicesTrusteeCompanyinfoLocalService> {

	public OsiServicesTrusteeCompanyinfoLocalServiceWrapper() {
		this(null);
	}

	public OsiServicesTrusteeCompanyinfoLocalServiceWrapper(
		OsiServicesTrusteeCompanyinfoLocalService
			osiServicesTrusteeCompanyinfoLocalService) {

		_osiServicesTrusteeCompanyinfoLocalService =
			osiServicesTrusteeCompanyinfoLocalService;
	}

	/**
	 * Adds the osi services trustee companyinfo to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesTrusteeCompanyinfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesTrusteeCompanyinfo the osi services trustee companyinfo
	 * @return the osi services trustee companyinfo that was added
	 */
	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesTrusteeCompanyinfo addOsiServicesTrusteeCompanyinfo(
			com.nbp.osi.services.application.form.service.model.
				OsiServicesTrusteeCompanyinfo osiServicesTrusteeCompanyinfo) {

		return _osiServicesTrusteeCompanyinfoLocalService.
			addOsiServicesTrusteeCompanyinfo(osiServicesTrusteeCompanyinfo);
	}

	/**
	 * Creates a new osi services trustee companyinfo with the primary key. Does not add the osi services trustee companyinfo to the database.
	 *
	 * @param osiTrusId the primary key for the new osi services trustee companyinfo
	 * @return the new osi services trustee companyinfo
	 */
	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesTrusteeCompanyinfo createOsiServicesTrusteeCompanyinfo(
			long osiTrusId) {

		return _osiServicesTrusteeCompanyinfoLocalService.
			createOsiServicesTrusteeCompanyinfo(osiTrusId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesTrusteeCompanyinfoLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the osi services trustee companyinfo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesTrusteeCompanyinfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiTrusId the primary key of the osi services trustee companyinfo
	 * @return the osi services trustee companyinfo that was removed
	 * @throws PortalException if a osi services trustee companyinfo with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesTrusteeCompanyinfo deleteOsiServicesTrusteeCompanyinfo(
				long osiTrusId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesTrusteeCompanyinfoLocalService.
			deleteOsiServicesTrusteeCompanyinfo(osiTrusId);
	}

	/**
	 * Deletes the osi services trustee companyinfo from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesTrusteeCompanyinfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesTrusteeCompanyinfo the osi services trustee companyinfo
	 * @return the osi services trustee companyinfo that was removed
	 */
	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesTrusteeCompanyinfo deleteOsiServicesTrusteeCompanyinfo(
			com.nbp.osi.services.application.form.service.model.
				OsiServicesTrusteeCompanyinfo osiServicesTrusteeCompanyinfo) {

		return _osiServicesTrusteeCompanyinfoLocalService.
			deleteOsiServicesTrusteeCompanyinfo(osiServicesTrusteeCompanyinfo);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesTrusteeCompanyinfoLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _osiServicesTrusteeCompanyinfoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _osiServicesTrusteeCompanyinfoLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _osiServicesTrusteeCompanyinfoLocalService.dynamicQuery();
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

		return _osiServicesTrusteeCompanyinfoLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.application.form.service.model.impl.OsiServicesTrusteeCompanyinfoModelImpl</code>.
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

		return _osiServicesTrusteeCompanyinfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.application.form.service.model.impl.OsiServicesTrusteeCompanyinfoModelImpl</code>.
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

		return _osiServicesTrusteeCompanyinfoLocalService.dynamicQuery(
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

		return _osiServicesTrusteeCompanyinfoLocalService.dynamicQueryCount(
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

		return _osiServicesTrusteeCompanyinfoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesTrusteeCompanyinfo fetchOsiServicesTrusteeCompanyinfo(
			long osiTrusId) {

		return _osiServicesTrusteeCompanyinfoLocalService.
			fetchOsiServicesTrusteeCompanyinfo(osiTrusId);
	}

	/**
	 * Returns the osi services trustee companyinfo matching the UUID and group.
	 *
	 * @param uuid the osi services trustee companyinfo's UUID
	 * @param groupId the primary key of the group
	 * @return the matching osi services trustee companyinfo, or <code>null</code> if a matching osi services trustee companyinfo could not be found
	 */
	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesTrusteeCompanyinfo
			fetchOsiServicesTrusteeCompanyinfoByUuidAndGroupId(
				String uuid, long groupId) {

		return _osiServicesTrusteeCompanyinfoLocalService.
			fetchOsiServicesTrusteeCompanyinfoByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _osiServicesTrusteeCompanyinfoLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _osiServicesTrusteeCompanyinfoLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _osiServicesTrusteeCompanyinfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _osiServicesTrusteeCompanyinfoLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * Returns the osi services trustee companyinfo with the primary key.
	 *
	 * @param osiTrusId the primary key of the osi services trustee companyinfo
	 * @return the osi services trustee companyinfo
	 * @throws PortalException if a osi services trustee companyinfo with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesTrusteeCompanyinfo getOsiServicesTrusteeCompanyinfo(
				long osiTrusId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesTrusteeCompanyinfoLocalService.
			getOsiServicesTrusteeCompanyinfo(osiTrusId);
	}

	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesTrusteeCompanyinfo getOsiServicesTrusteeCompanyinfoById(
				long applicationId)
			throws com.nbp.osi.services.application.form.service.exception.
				NoSuchOsiServicesTrusteeCompanyinfoException {

		return _osiServicesTrusteeCompanyinfoLocalService.
			getOsiServicesTrusteeCompanyinfoById(applicationId);
	}

	/**
	 * Returns the osi services trustee companyinfo matching the UUID and group.
	 *
	 * @param uuid the osi services trustee companyinfo's UUID
	 * @param groupId the primary key of the group
	 * @return the matching osi services trustee companyinfo
	 * @throws PortalException if a matching osi services trustee companyinfo could not be found
	 */
	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesTrusteeCompanyinfo
				getOsiServicesTrusteeCompanyinfoByUuidAndGroupId(
					String uuid, long groupId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesTrusteeCompanyinfoLocalService.
			getOsiServicesTrusteeCompanyinfoByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the osi services trustee companyinfos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.application.form.service.model.impl.OsiServicesTrusteeCompanyinfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services trustee companyinfos
	 * @param end the upper bound of the range of osi services trustee companyinfos (not inclusive)
	 * @return the range of osi services trustee companyinfos
	 */
	@Override
	public java.util.List
		<com.nbp.osi.services.application.form.service.model.
			OsiServicesTrusteeCompanyinfo> getOsiServicesTrusteeCompanyinfos(
				int start, int end) {

		return _osiServicesTrusteeCompanyinfoLocalService.
			getOsiServicesTrusteeCompanyinfos(start, end);
	}

	/**
	 * Returns all the osi services trustee companyinfos matching the UUID and company.
	 *
	 * @param uuid the UUID of the osi services trustee companyinfos
	 * @param companyId the primary key of the company
	 * @return the matching osi services trustee companyinfos, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.osi.services.application.form.service.model.
			OsiServicesTrusteeCompanyinfo>
				getOsiServicesTrusteeCompanyinfosByUuidAndCompanyId(
					String uuid, long companyId) {

		return _osiServicesTrusteeCompanyinfoLocalService.
			getOsiServicesTrusteeCompanyinfosByUuidAndCompanyId(
				uuid, companyId);
	}

	/**
	 * Returns a range of osi services trustee companyinfos matching the UUID and company.
	 *
	 * @param uuid the UUID of the osi services trustee companyinfos
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of osi services trustee companyinfos
	 * @param end the upper bound of the range of osi services trustee companyinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching osi services trustee companyinfos, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.osi.services.application.form.service.model.
			OsiServicesTrusteeCompanyinfo>
				getOsiServicesTrusteeCompanyinfosByUuidAndCompanyId(
					String uuid, long companyId, int start, int end,
					com.liferay.portal.kernel.util.OrderByComparator
						<com.nbp.osi.services.application.form.service.model.
							OsiServicesTrusteeCompanyinfo> orderByComparator) {

		return _osiServicesTrusteeCompanyinfoLocalService.
			getOsiServicesTrusteeCompanyinfosByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of osi services trustee companyinfos.
	 *
	 * @return the number of osi services trustee companyinfos
	 */
	@Override
	public int getOsiServicesTrusteeCompanyinfosCount() {
		return _osiServicesTrusteeCompanyinfoLocalService.
			getOsiServicesTrusteeCompanyinfosCount();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesTrusteeCompanyinfoLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the osi services trustee companyinfo in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesTrusteeCompanyinfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesTrusteeCompanyinfo the osi services trustee companyinfo
	 * @return the osi services trustee companyinfo that was updated
	 */
	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesTrusteeCompanyinfo updateOsiServicesTrusteeCompanyinfo(
			com.nbp.osi.services.application.form.service.model.
				OsiServicesTrusteeCompanyinfo osiServicesTrusteeCompanyinfo) {

		return _osiServicesTrusteeCompanyinfoLocalService.
			updateOsiServicesTrusteeCompanyinfo(osiServicesTrusteeCompanyinfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _osiServicesTrusteeCompanyinfoLocalService.getBasePersistence();
	}

	@Override
	public OsiServicesTrusteeCompanyinfoLocalService getWrappedService() {
		return _osiServicesTrusteeCompanyinfoLocalService;
	}

	@Override
	public void setWrappedService(
		OsiServicesTrusteeCompanyinfoLocalService
			osiServicesTrusteeCompanyinfoLocalService) {

		_osiServicesTrusteeCompanyinfoLocalService =
			osiServicesTrusteeCompanyinfoLocalService;
	}

	private OsiServicesTrusteeCompanyinfoLocalService
		_osiServicesTrusteeCompanyinfoLocalService;

}