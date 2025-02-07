/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link OsiServicesAssignmentDetailinfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see OsiServicesAssignmentDetailinfoLocalService
 * @generated
 */
public class OsiServicesAssignmentDetailinfoLocalServiceWrapper
	implements OsiServicesAssignmentDetailinfoLocalService,
			   ServiceWrapper<OsiServicesAssignmentDetailinfoLocalService> {

	public OsiServicesAssignmentDetailinfoLocalServiceWrapper() {
		this(null);
	}

	public OsiServicesAssignmentDetailinfoLocalServiceWrapper(
		OsiServicesAssignmentDetailinfoLocalService
			osiServicesAssignmentDetailinfoLocalService) {

		_osiServicesAssignmentDetailinfoLocalService =
			osiServicesAssignmentDetailinfoLocalService;
	}

	/**
	 * Adds the osi services assignment detailinfo to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesAssignmentDetailinfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesAssignmentDetailinfo the osi services assignment detailinfo
	 * @return the osi services assignment detailinfo that was added
	 */
	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesAssignmentDetailinfo addOsiServicesAssignmentDetailinfo(
			com.nbp.osi.services.application.form.service.model.
				OsiServicesAssignmentDetailinfo
					osiServicesAssignmentDetailinfo) {

		return _osiServicesAssignmentDetailinfoLocalService.
			addOsiServicesAssignmentDetailinfo(osiServicesAssignmentDetailinfo);
	}

	/**
	 * Creates a new osi services assignment detailinfo with the primary key. Does not add the osi services assignment detailinfo to the database.
	 *
	 * @param osiADId the primary key for the new osi services assignment detailinfo
	 * @return the new osi services assignment detailinfo
	 */
	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesAssignmentDetailinfo createOsiServicesAssignmentDetailinfo(
			long osiADId) {

		return _osiServicesAssignmentDetailinfoLocalService.
			createOsiServicesAssignmentDetailinfo(osiADId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesAssignmentDetailinfoLocalService.
			createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the osi services assignment detailinfo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesAssignmentDetailinfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiADId the primary key of the osi services assignment detailinfo
	 * @return the osi services assignment detailinfo that was removed
	 * @throws PortalException if a osi services assignment detailinfo with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesAssignmentDetailinfo deleteOsiServicesAssignmentDetailinfo(
				long osiADId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesAssignmentDetailinfoLocalService.
			deleteOsiServicesAssignmentDetailinfo(osiADId);
	}

	/**
	 * Deletes the osi services assignment detailinfo from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesAssignmentDetailinfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesAssignmentDetailinfo the osi services assignment detailinfo
	 * @return the osi services assignment detailinfo that was removed
	 */
	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesAssignmentDetailinfo deleteOsiServicesAssignmentDetailinfo(
			com.nbp.osi.services.application.form.service.model.
				OsiServicesAssignmentDetailinfo
					osiServicesAssignmentDetailinfo) {

		return _osiServicesAssignmentDetailinfoLocalService.
			deleteOsiServicesAssignmentDetailinfo(
				osiServicesAssignmentDetailinfo);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesAssignmentDetailinfoLocalService.
			deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _osiServicesAssignmentDetailinfoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _osiServicesAssignmentDetailinfoLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _osiServicesAssignmentDetailinfoLocalService.dynamicQuery();
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

		return _osiServicesAssignmentDetailinfoLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.application.form.service.model.impl.OsiServicesAssignmentDetailinfoModelImpl</code>.
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

		return _osiServicesAssignmentDetailinfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.application.form.service.model.impl.OsiServicesAssignmentDetailinfoModelImpl</code>.
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

		return _osiServicesAssignmentDetailinfoLocalService.dynamicQuery(
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

		return _osiServicesAssignmentDetailinfoLocalService.dynamicQueryCount(
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

		return _osiServicesAssignmentDetailinfoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesAssignmentDetailinfo fetchOsiServicesAssignmentDetailinfo(
			long osiADId) {

		return _osiServicesAssignmentDetailinfoLocalService.
			fetchOsiServicesAssignmentDetailinfo(osiADId);
	}

	/**
	 * Returns the osi services assignment detailinfo matching the UUID and group.
	 *
	 * @param uuid the osi services assignment detailinfo's UUID
	 * @param groupId the primary key of the group
	 * @return the matching osi services assignment detailinfo, or <code>null</code> if a matching osi services assignment detailinfo could not be found
	 */
	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesAssignmentDetailinfo
			fetchOsiServicesAssignmentDetailinfoByUuidAndGroupId(
				String uuid, long groupId) {

		return _osiServicesAssignmentDetailinfoLocalService.
			fetchOsiServicesAssignmentDetailinfoByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _osiServicesAssignmentDetailinfoLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _osiServicesAssignmentDetailinfoLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _osiServicesAssignmentDetailinfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _osiServicesAssignmentDetailinfoLocalService.
			getOSGiServiceIdentifier();
	}

	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesAssignmentDetailinfo getOsiServiceAssignmentInfoById(
				long osiServicesApplicationId)
			throws com.nbp.osi.services.application.form.service.exception.
				NoSuchOsiServicesAssignmentDetailinfoException {

		return _osiServicesAssignmentDetailinfoLocalService.
			getOsiServiceAssignmentInfoById(osiServicesApplicationId);
	}

	/**
	 * Returns the osi services assignment detailinfo with the primary key.
	 *
	 * @param osiADId the primary key of the osi services assignment detailinfo
	 * @return the osi services assignment detailinfo
	 * @throws PortalException if a osi services assignment detailinfo with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesAssignmentDetailinfo getOsiServicesAssignmentDetailinfo(
				long osiADId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesAssignmentDetailinfoLocalService.
			getOsiServicesAssignmentDetailinfo(osiADId);
	}

	/**
	 * Returns the osi services assignment detailinfo matching the UUID and group.
	 *
	 * @param uuid the osi services assignment detailinfo's UUID
	 * @param groupId the primary key of the group
	 * @return the matching osi services assignment detailinfo
	 * @throws PortalException if a matching osi services assignment detailinfo could not be found
	 */
	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesAssignmentDetailinfo
				getOsiServicesAssignmentDetailinfoByUuidAndGroupId(
					String uuid, long groupId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesAssignmentDetailinfoLocalService.
			getOsiServicesAssignmentDetailinfoByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the osi services assignment detailinfos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.application.form.service.model.impl.OsiServicesAssignmentDetailinfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services assignment detailinfos
	 * @param end the upper bound of the range of osi services assignment detailinfos (not inclusive)
	 * @return the range of osi services assignment detailinfos
	 */
	@Override
	public java.util.List
		<com.nbp.osi.services.application.form.service.model.
			OsiServicesAssignmentDetailinfo>
				getOsiServicesAssignmentDetailinfos(int start, int end) {

		return _osiServicesAssignmentDetailinfoLocalService.
			getOsiServicesAssignmentDetailinfos(start, end);
	}

	/**
	 * Returns all the osi services assignment detailinfos matching the UUID and company.
	 *
	 * @param uuid the UUID of the osi services assignment detailinfos
	 * @param companyId the primary key of the company
	 * @return the matching osi services assignment detailinfos, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.osi.services.application.form.service.model.
			OsiServicesAssignmentDetailinfo>
				getOsiServicesAssignmentDetailinfosByUuidAndCompanyId(
					String uuid, long companyId) {

		return _osiServicesAssignmentDetailinfoLocalService.
			getOsiServicesAssignmentDetailinfosByUuidAndCompanyId(
				uuid, companyId);
	}

	/**
	 * Returns a range of osi services assignment detailinfos matching the UUID and company.
	 *
	 * @param uuid the UUID of the osi services assignment detailinfos
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of osi services assignment detailinfos
	 * @param end the upper bound of the range of osi services assignment detailinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching osi services assignment detailinfos, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.osi.services.application.form.service.model.
			OsiServicesAssignmentDetailinfo>
				getOsiServicesAssignmentDetailinfosByUuidAndCompanyId(
					String uuid, long companyId, int start, int end,
					com.liferay.portal.kernel.util.OrderByComparator
						<com.nbp.osi.services.application.form.service.model.
							OsiServicesAssignmentDetailinfo>
								orderByComparator) {

		return _osiServicesAssignmentDetailinfoLocalService.
			getOsiServicesAssignmentDetailinfosByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of osi services assignment detailinfos.
	 *
	 * @return the number of osi services assignment detailinfos
	 */
	@Override
	public int getOsiServicesAssignmentDetailinfosCount() {
		return _osiServicesAssignmentDetailinfoLocalService.
			getOsiServicesAssignmentDetailinfosCount();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesAssignmentDetailinfoLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the osi services assignment detailinfo in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesAssignmentDetailinfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesAssignmentDetailinfo the osi services assignment detailinfo
	 * @return the osi services assignment detailinfo that was updated
	 */
	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesAssignmentDetailinfo updateOsiServicesAssignmentDetailinfo(
			com.nbp.osi.services.application.form.service.model.
				OsiServicesAssignmentDetailinfo
					osiServicesAssignmentDetailinfo) {

		return _osiServicesAssignmentDetailinfoLocalService.
			updateOsiServicesAssignmentDetailinfo(
				osiServicesAssignmentDetailinfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _osiServicesAssignmentDetailinfoLocalService.
			getBasePersistence();
	}

	@Override
	public OsiServicesAssignmentDetailinfoLocalService getWrappedService() {
		return _osiServicesAssignmentDetailinfoLocalService;
	}

	@Override
	public void setWrappedService(
		OsiServicesAssignmentDetailinfoLocalService
			osiServicesAssignmentDetailinfoLocalService) {

		_osiServicesAssignmentDetailinfoLocalService =
			osiServicesAssignmentDetailinfoLocalService;
	}

	private OsiServicesAssignmentDetailinfoLocalService
		_osiServicesAssignmentDetailinfoLocalService;

}