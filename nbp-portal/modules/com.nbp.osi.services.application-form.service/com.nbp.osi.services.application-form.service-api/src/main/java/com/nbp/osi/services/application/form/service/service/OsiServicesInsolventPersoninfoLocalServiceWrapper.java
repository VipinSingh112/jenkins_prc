/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link OsiServicesInsolventPersoninfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see OsiServicesInsolventPersoninfoLocalService
 * @generated
 */
public class OsiServicesInsolventPersoninfoLocalServiceWrapper
	implements OsiServicesInsolventPersoninfoLocalService,
			   ServiceWrapper<OsiServicesInsolventPersoninfoLocalService> {

	public OsiServicesInsolventPersoninfoLocalServiceWrapper() {
		this(null);
	}

	public OsiServicesInsolventPersoninfoLocalServiceWrapper(
		OsiServicesInsolventPersoninfoLocalService
			osiServicesInsolventPersoninfoLocalService) {

		_osiServicesInsolventPersoninfoLocalService =
			osiServicesInsolventPersoninfoLocalService;
	}

	/**
	 * Adds the osi services insolvent personinfo to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesInsolventPersoninfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesInsolventPersoninfo the osi services insolvent personinfo
	 * @return the osi services insolvent personinfo that was added
	 */
	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesInsolventPersoninfo addOsiServicesInsolventPersoninfo(
			com.nbp.osi.services.application.form.service.model.
				OsiServicesInsolventPersoninfo osiServicesInsolventPersoninfo) {

		return _osiServicesInsolventPersoninfoLocalService.
			addOsiServicesInsolventPersoninfo(osiServicesInsolventPersoninfo);
	}

	/**
	 * Creates a new osi services insolvent personinfo with the primary key. Does not add the osi services insolvent personinfo to the database.
	 *
	 * @param osiServicesInsoId the primary key for the new osi services insolvent personinfo
	 * @return the new osi services insolvent personinfo
	 */
	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesInsolventPersoninfo createOsiServicesInsolventPersoninfo(
			long osiServicesInsoId) {

		return _osiServicesInsolventPersoninfoLocalService.
			createOsiServicesInsolventPersoninfo(osiServicesInsoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesInsolventPersoninfoLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the osi services insolvent personinfo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesInsolventPersoninfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesInsoId the primary key of the osi services insolvent personinfo
	 * @return the osi services insolvent personinfo that was removed
	 * @throws PortalException if a osi services insolvent personinfo with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesInsolventPersoninfo deleteOsiServicesInsolventPersoninfo(
				long osiServicesInsoId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesInsolventPersoninfoLocalService.
			deleteOsiServicesInsolventPersoninfo(osiServicesInsoId);
	}

	/**
	 * Deletes the osi services insolvent personinfo from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesInsolventPersoninfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesInsolventPersoninfo the osi services insolvent personinfo
	 * @return the osi services insolvent personinfo that was removed
	 */
	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesInsolventPersoninfo deleteOsiServicesInsolventPersoninfo(
			com.nbp.osi.services.application.form.service.model.
				OsiServicesInsolventPersoninfo osiServicesInsolventPersoninfo) {

		return _osiServicesInsolventPersoninfoLocalService.
			deleteOsiServicesInsolventPersoninfo(
				osiServicesInsolventPersoninfo);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesInsolventPersoninfoLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _osiServicesInsolventPersoninfoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _osiServicesInsolventPersoninfoLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _osiServicesInsolventPersoninfoLocalService.dynamicQuery();
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

		return _osiServicesInsolventPersoninfoLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.application.form.service.model.impl.OsiServicesInsolventPersoninfoModelImpl</code>.
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

		return _osiServicesInsolventPersoninfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.application.form.service.model.impl.OsiServicesInsolventPersoninfoModelImpl</code>.
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

		return _osiServicesInsolventPersoninfoLocalService.dynamicQuery(
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

		return _osiServicesInsolventPersoninfoLocalService.dynamicQueryCount(
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

		return _osiServicesInsolventPersoninfoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesInsolventPersoninfo fetchOsiServicesInsolventPersoninfo(
			long osiServicesInsoId) {

		return _osiServicesInsolventPersoninfoLocalService.
			fetchOsiServicesInsolventPersoninfo(osiServicesInsoId);
	}

	/**
	 * Returns the osi services insolvent personinfo matching the UUID and group.
	 *
	 * @param uuid the osi services insolvent personinfo's UUID
	 * @param groupId the primary key of the group
	 * @return the matching osi services insolvent personinfo, or <code>null</code> if a matching osi services insolvent personinfo could not be found
	 */
	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesInsolventPersoninfo
			fetchOsiServicesInsolventPersoninfoByUuidAndGroupId(
				String uuid, long groupId) {

		return _osiServicesInsolventPersoninfoLocalService.
			fetchOsiServicesInsolventPersoninfoByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _osiServicesInsolventPersoninfoLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _osiServicesInsolventPersoninfoLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _osiServicesInsolventPersoninfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _osiServicesInsolventPersoninfoLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * Returns the osi services insolvent personinfo with the primary key.
	 *
	 * @param osiServicesInsoId the primary key of the osi services insolvent personinfo
	 * @return the osi services insolvent personinfo
	 * @throws PortalException if a osi services insolvent personinfo with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesInsolventPersoninfo getOsiServicesInsolventPersoninfo(
				long osiServicesInsoId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesInsolventPersoninfoLocalService.
			getOsiServicesInsolventPersoninfo(osiServicesInsoId);
	}

	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesInsolventPersoninfo getOsiServicesInsolventPersoninfoById(
				long osiServicesApplicationId)
			throws com.nbp.osi.services.application.form.service.exception.
				NoSuchOsiServicesInsolventPersoninfoException {

		return _osiServicesInsolventPersoninfoLocalService.
			getOsiServicesInsolventPersoninfoById(osiServicesApplicationId);
	}

	/**
	 * Returns the osi services insolvent personinfo matching the UUID and group.
	 *
	 * @param uuid the osi services insolvent personinfo's UUID
	 * @param groupId the primary key of the group
	 * @return the matching osi services insolvent personinfo
	 * @throws PortalException if a matching osi services insolvent personinfo could not be found
	 */
	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesInsolventPersoninfo
				getOsiServicesInsolventPersoninfoByUuidAndGroupId(
					String uuid, long groupId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesInsolventPersoninfoLocalService.
			getOsiServicesInsolventPersoninfoByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the osi services insolvent personinfos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.application.form.service.model.impl.OsiServicesInsolventPersoninfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services insolvent personinfos
	 * @param end the upper bound of the range of osi services insolvent personinfos (not inclusive)
	 * @return the range of osi services insolvent personinfos
	 */
	@Override
	public java.util.List
		<com.nbp.osi.services.application.form.service.model.
			OsiServicesInsolventPersoninfo> getOsiServicesInsolventPersoninfos(
				int start, int end) {

		return _osiServicesInsolventPersoninfoLocalService.
			getOsiServicesInsolventPersoninfos(start, end);
	}

	/**
	 * Returns all the osi services insolvent personinfos matching the UUID and company.
	 *
	 * @param uuid the UUID of the osi services insolvent personinfos
	 * @param companyId the primary key of the company
	 * @return the matching osi services insolvent personinfos, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.osi.services.application.form.service.model.
			OsiServicesInsolventPersoninfo>
				getOsiServicesInsolventPersoninfosByUuidAndCompanyId(
					String uuid, long companyId) {

		return _osiServicesInsolventPersoninfoLocalService.
			getOsiServicesInsolventPersoninfosByUuidAndCompanyId(
				uuid, companyId);
	}

	/**
	 * Returns a range of osi services insolvent personinfos matching the UUID and company.
	 *
	 * @param uuid the UUID of the osi services insolvent personinfos
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of osi services insolvent personinfos
	 * @param end the upper bound of the range of osi services insolvent personinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching osi services insolvent personinfos, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.osi.services.application.form.service.model.
			OsiServicesInsolventPersoninfo>
				getOsiServicesInsolventPersoninfosByUuidAndCompanyId(
					String uuid, long companyId, int start, int end,
					com.liferay.portal.kernel.util.OrderByComparator
						<com.nbp.osi.services.application.form.service.model.
							OsiServicesInsolventPersoninfo> orderByComparator) {

		return _osiServicesInsolventPersoninfoLocalService.
			getOsiServicesInsolventPersoninfosByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of osi services insolvent personinfos.
	 *
	 * @return the number of osi services insolvent personinfos
	 */
	@Override
	public int getOsiServicesInsolventPersoninfosCount() {
		return _osiServicesInsolventPersoninfoLocalService.
			getOsiServicesInsolventPersoninfosCount();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesInsolventPersoninfoLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the osi services insolvent personinfo in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesInsolventPersoninfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesInsolventPersoninfo the osi services insolvent personinfo
	 * @return the osi services insolvent personinfo that was updated
	 */
	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesInsolventPersoninfo updateOsiServicesInsolventPersoninfo(
			com.nbp.osi.services.application.form.service.model.
				OsiServicesInsolventPersoninfo osiServicesInsolventPersoninfo) {

		return _osiServicesInsolventPersoninfoLocalService.
			updateOsiServicesInsolventPersoninfo(
				osiServicesInsolventPersoninfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _osiServicesInsolventPersoninfoLocalService.getBasePersistence();
	}

	@Override
	public OsiServicesInsolventPersoninfoLocalService getWrappedService() {
		return _osiServicesInsolventPersoninfoLocalService;
	}

	@Override
	public void setWrappedService(
		OsiServicesInsolventPersoninfoLocalService
			osiServicesInsolventPersoninfoLocalService) {

		_osiServicesInsolventPersoninfoLocalService =
			osiServicesInsolventPersoninfoLocalService;
	}

	private OsiServicesInsolventPersoninfoLocalService
		_osiServicesInsolventPersoninfoLocalService;

}