/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link OsiServicesApplicantinfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see OsiServicesApplicantinfoLocalService
 * @generated
 */
public class OsiServicesApplicantinfoLocalServiceWrapper
	implements OsiServicesApplicantinfoLocalService,
			   ServiceWrapper<OsiServicesApplicantinfoLocalService> {

	public OsiServicesApplicantinfoLocalServiceWrapper() {
		this(null);
	}

	public OsiServicesApplicantinfoLocalServiceWrapper(
		OsiServicesApplicantinfoLocalService
			osiServicesApplicantinfoLocalService) {

		_osiServicesApplicantinfoLocalService =
			osiServicesApplicantinfoLocalService;
	}

	/**
	 * Adds the osi services applicantinfo to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesApplicantinfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesApplicantinfo the osi services applicantinfo
	 * @return the osi services applicantinfo that was added
	 */
	@Override
	public
		com.nbp.osi.services.application.form.service.model.
			OsiServicesApplicantinfo addOsiServicesApplicantinfo(
				com.nbp.osi.services.application.form.service.model.
					OsiServicesApplicantinfo osiServicesApplicantinfo) {

		return _osiServicesApplicantinfoLocalService.
			addOsiServicesApplicantinfo(osiServicesApplicantinfo);
	}

	/**
	 * Creates a new osi services applicantinfo with the primary key. Does not add the osi services applicantinfo to the database.
	 *
	 * @param osiServicesApplicanId the primary key for the new osi services applicantinfo
	 * @return the new osi services applicantinfo
	 */
	@Override
	public
		com.nbp.osi.services.application.form.service.model.
			OsiServicesApplicantinfo createOsiServicesApplicantinfo(
				long osiServicesApplicanId) {

		return _osiServicesApplicantinfoLocalService.
			createOsiServicesApplicantinfo(osiServicesApplicanId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesApplicantinfoLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the osi services applicantinfo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesApplicantinfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesApplicanId the primary key of the osi services applicantinfo
	 * @return the osi services applicantinfo that was removed
	 * @throws PortalException if a osi services applicantinfo with the primary key could not be found
	 */
	@Override
	public
		com.nbp.osi.services.application.form.service.model.
			OsiServicesApplicantinfo deleteOsiServicesApplicantinfo(
					long osiServicesApplicanId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesApplicantinfoLocalService.
			deleteOsiServicesApplicantinfo(osiServicesApplicanId);
	}

	/**
	 * Deletes the osi services applicantinfo from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesApplicantinfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesApplicantinfo the osi services applicantinfo
	 * @return the osi services applicantinfo that was removed
	 */
	@Override
	public
		com.nbp.osi.services.application.form.service.model.
			OsiServicesApplicantinfo deleteOsiServicesApplicantinfo(
				com.nbp.osi.services.application.form.service.model.
					OsiServicesApplicantinfo osiServicesApplicantinfo) {

		return _osiServicesApplicantinfoLocalService.
			deleteOsiServicesApplicantinfo(osiServicesApplicantinfo);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesApplicantinfoLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _osiServicesApplicantinfoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _osiServicesApplicantinfoLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _osiServicesApplicantinfoLocalService.dynamicQuery();
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

		return _osiServicesApplicantinfoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.application.form.service.model.impl.OsiServicesApplicantinfoModelImpl</code>.
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

		return _osiServicesApplicantinfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.application.form.service.model.impl.OsiServicesApplicantinfoModelImpl</code>.
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

		return _osiServicesApplicantinfoLocalService.dynamicQuery(
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

		return _osiServicesApplicantinfoLocalService.dynamicQueryCount(
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

		return _osiServicesApplicantinfoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.osi.services.application.form.service.model.
			OsiServicesApplicantinfo fetchOsiServicesApplicantinfo(
				long osiServicesApplicanId) {

		return _osiServicesApplicantinfoLocalService.
			fetchOsiServicesApplicantinfo(osiServicesApplicanId);
	}

	/**
	 * Returns the osi services applicantinfo matching the UUID and group.
	 *
	 * @param uuid the osi services applicantinfo's UUID
	 * @param groupId the primary key of the group
	 * @return the matching osi services applicantinfo, or <code>null</code> if a matching osi services applicantinfo could not be found
	 */
	@Override
	public
		com.nbp.osi.services.application.form.service.model.
			OsiServicesApplicantinfo
				fetchOsiServicesApplicantinfoByUuidAndGroupId(
					String uuid, long groupId) {

		return _osiServicesApplicantinfoLocalService.
			fetchOsiServicesApplicantinfoByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _osiServicesApplicantinfoLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _osiServicesApplicantinfoLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _osiServicesApplicantinfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _osiServicesApplicantinfoLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public
		com.nbp.osi.services.application.form.service.model.
			OsiServicesApplicantinfo getOsiServiceApplicantInfoById(
					long osiServicesApplicationId)
				throws com.nbp.osi.services.application.form.service.exception.
					NoSuchOsiServicesApplicantinfoException {

		return _osiServicesApplicantinfoLocalService.
			getOsiServiceApplicantInfoById(osiServicesApplicationId);
	}

	/**
	 * Returns the osi services applicantinfo with the primary key.
	 *
	 * @param osiServicesApplicanId the primary key of the osi services applicantinfo
	 * @return the osi services applicantinfo
	 * @throws PortalException if a osi services applicantinfo with the primary key could not be found
	 */
	@Override
	public
		com.nbp.osi.services.application.form.service.model.
			OsiServicesApplicantinfo getOsiServicesApplicantinfo(
					long osiServicesApplicanId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesApplicantinfoLocalService.
			getOsiServicesApplicantinfo(osiServicesApplicanId);
	}

	/**
	 * Returns the osi services applicantinfo matching the UUID and group.
	 *
	 * @param uuid the osi services applicantinfo's UUID
	 * @param groupId the primary key of the group
	 * @return the matching osi services applicantinfo
	 * @throws PortalException if a matching osi services applicantinfo could not be found
	 */
	@Override
	public
		com.nbp.osi.services.application.form.service.model.
			OsiServicesApplicantinfo
					getOsiServicesApplicantinfoByUuidAndGroupId(
						String uuid, long groupId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesApplicantinfoLocalService.
			getOsiServicesApplicantinfoByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the osi services applicantinfos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.application.form.service.model.impl.OsiServicesApplicantinfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services applicantinfos
	 * @param end the upper bound of the range of osi services applicantinfos (not inclusive)
	 * @return the range of osi services applicantinfos
	 */
	@Override
	public java.util.List
		<com.nbp.osi.services.application.form.service.model.
			OsiServicesApplicantinfo> getOsiServicesApplicantinfos(
				int start, int end) {

		return _osiServicesApplicantinfoLocalService.
			getOsiServicesApplicantinfos(start, end);
	}

	/**
	 * Returns all the osi services applicantinfos matching the UUID and company.
	 *
	 * @param uuid the UUID of the osi services applicantinfos
	 * @param companyId the primary key of the company
	 * @return the matching osi services applicantinfos, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.osi.services.application.form.service.model.
			OsiServicesApplicantinfo>
				getOsiServicesApplicantinfosByUuidAndCompanyId(
					String uuid, long companyId) {

		return _osiServicesApplicantinfoLocalService.
			getOsiServicesApplicantinfosByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of osi services applicantinfos matching the UUID and company.
	 *
	 * @param uuid the UUID of the osi services applicantinfos
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of osi services applicantinfos
	 * @param end the upper bound of the range of osi services applicantinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching osi services applicantinfos, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.osi.services.application.form.service.model.
			OsiServicesApplicantinfo>
				getOsiServicesApplicantinfosByUuidAndCompanyId(
					String uuid, long companyId, int start, int end,
					com.liferay.portal.kernel.util.OrderByComparator
						<com.nbp.osi.services.application.form.service.model.
							OsiServicesApplicantinfo> orderByComparator) {

		return _osiServicesApplicantinfoLocalService.
			getOsiServicesApplicantinfosByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of osi services applicantinfos.
	 *
	 * @return the number of osi services applicantinfos
	 */
	@Override
	public int getOsiServicesApplicantinfosCount() {
		return _osiServicesApplicantinfoLocalService.
			getOsiServicesApplicantinfosCount();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesApplicantinfoLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the osi services applicantinfo in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesApplicantinfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesApplicantinfo the osi services applicantinfo
	 * @return the osi services applicantinfo that was updated
	 */
	@Override
	public
		com.nbp.osi.services.application.form.service.model.
			OsiServicesApplicantinfo updateOsiServicesApplicantinfo(
				com.nbp.osi.services.application.form.service.model.
					OsiServicesApplicantinfo osiServicesApplicantinfo) {

		return _osiServicesApplicantinfoLocalService.
			updateOsiServicesApplicantinfo(osiServicesApplicantinfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _osiServicesApplicantinfoLocalService.getBasePersistence();
	}

	@Override
	public OsiServicesApplicantinfoLocalService getWrappedService() {
		return _osiServicesApplicantinfoLocalService;
	}

	@Override
	public void setWrappedService(
		OsiServicesApplicantinfoLocalService
			osiServicesApplicantinfoLocalService) {

		_osiServicesApplicantinfoLocalService =
			osiServicesApplicantinfoLocalService;
	}

	private OsiServicesApplicantinfoLocalService
		_osiServicesApplicantinfoLocalService;

}