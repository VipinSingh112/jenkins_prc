/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link OsiServicesTrusteeIndividualQualificationinfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see OsiServicesTrusteeIndividualQualificationinfoLocalService
 * @generated
 */
public class OsiServicesTrusteeIndividualQualificationinfoLocalServiceWrapper
	implements OsiServicesTrusteeIndividualQualificationinfoLocalService,
			   ServiceWrapper
				   <OsiServicesTrusteeIndividualQualificationinfoLocalService> {

	public OsiServicesTrusteeIndividualQualificationinfoLocalServiceWrapper() {
		this(null);
	}

	public OsiServicesTrusteeIndividualQualificationinfoLocalServiceWrapper(
		OsiServicesTrusteeIndividualQualificationinfoLocalService
			osiServicesTrusteeIndividualQualificationinfoLocalService) {

		_osiServicesTrusteeIndividualQualificationinfoLocalService =
			osiServicesTrusteeIndividualQualificationinfoLocalService;
	}

	/**
	 * Adds the osi services trustee individual qualificationinfo to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesTrusteeIndividualQualificationinfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesTrusteeIndividualQualificationinfo the osi services trustee individual qualificationinfo
	 * @return the osi services trustee individual qualificationinfo that was added
	 */
	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesTrusteeIndividualQualificationinfo
			addOsiServicesTrusteeIndividualQualificationinfo(
				com.nbp.osi.services.application.form.service.model.
					OsiServicesTrusteeIndividualQualificationinfo
						osiServicesTrusteeIndividualQualificationinfo) {

		return _osiServicesTrusteeIndividualQualificationinfoLocalService.
			addOsiServicesTrusteeIndividualQualificationinfo(
				osiServicesTrusteeIndividualQualificationinfo);
	}

	/**
	 * Creates a new osi services trustee individual qualificationinfo with the primary key. Does not add the osi services trustee individual qualificationinfo to the database.
	 *
	 * @param osQualificationId the primary key for the new osi services trustee individual qualificationinfo
	 * @return the new osi services trustee individual qualificationinfo
	 */
	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesTrusteeIndividualQualificationinfo
			createOsiServicesTrusteeIndividualQualificationinfo(
				long osQualificationId) {

		return _osiServicesTrusteeIndividualQualificationinfoLocalService.
			createOsiServicesTrusteeIndividualQualificationinfo(
				osQualificationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesTrusteeIndividualQualificationinfoLocalService.
			createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the osi services trustee individual qualificationinfo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesTrusteeIndividualQualificationinfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osQualificationId the primary key of the osi services trustee individual qualificationinfo
	 * @return the osi services trustee individual qualificationinfo that was removed
	 * @throws PortalException if a osi services trustee individual qualificationinfo with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesTrusteeIndividualQualificationinfo
				deleteOsiServicesTrusteeIndividualQualificationinfo(
					long osQualificationId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesTrusteeIndividualQualificationinfoLocalService.
			deleteOsiServicesTrusteeIndividualQualificationinfo(
				osQualificationId);
	}

	/**
	 * Deletes the osi services trustee individual qualificationinfo from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesTrusteeIndividualQualificationinfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesTrusteeIndividualQualificationinfo the osi services trustee individual qualificationinfo
	 * @return the osi services trustee individual qualificationinfo that was removed
	 */
	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesTrusteeIndividualQualificationinfo
			deleteOsiServicesTrusteeIndividualQualificationinfo(
				com.nbp.osi.services.application.form.service.model.
					OsiServicesTrusteeIndividualQualificationinfo
						osiServicesTrusteeIndividualQualificationinfo) {

		return _osiServicesTrusteeIndividualQualificationinfoLocalService.
			deleteOsiServicesTrusteeIndividualQualificationinfo(
				osiServicesTrusteeIndividualQualificationinfo);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesTrusteeIndividualQualificationinfoLocalService.
			deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _osiServicesTrusteeIndividualQualificationinfoLocalService.
			dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _osiServicesTrusteeIndividualQualificationinfoLocalService.
			dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _osiServicesTrusteeIndividualQualificationinfoLocalService.
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

		return _osiServicesTrusteeIndividualQualificationinfoLocalService.
			dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.application.form.service.model.impl.OsiServicesTrusteeIndividualQualificationinfoModelImpl</code>.
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

		return _osiServicesTrusteeIndividualQualificationinfoLocalService.
			dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.application.form.service.model.impl.OsiServicesTrusteeIndividualQualificationinfoModelImpl</code>.
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

		return _osiServicesTrusteeIndividualQualificationinfoLocalService.
			dynamicQuery(dynamicQuery, start, end, orderByComparator);
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

		return _osiServicesTrusteeIndividualQualificationinfoLocalService.
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

		return _osiServicesTrusteeIndividualQualificationinfoLocalService.
			dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesTrusteeIndividualQualificationinfo
			fetchOsiServicesTrusteeIndividualQualificationinfo(
				long osQualificationId) {

		return _osiServicesTrusteeIndividualQualificationinfoLocalService.
			fetchOsiServicesTrusteeIndividualQualificationinfo(
				osQualificationId);
	}

	/**
	 * Returns the osi services trustee individual qualificationinfo matching the UUID and group.
	 *
	 * @param uuid the osi services trustee individual qualificationinfo's UUID
	 * @param groupId the primary key of the group
	 * @return the matching osi services trustee individual qualificationinfo, or <code>null</code> if a matching osi services trustee individual qualificationinfo could not be found
	 */
	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesTrusteeIndividualQualificationinfo
			fetchOsiServicesTrusteeIndividualQualificationinfoByUuidAndGroupId(
				String uuid, long groupId) {

		return _osiServicesTrusteeIndividualQualificationinfoLocalService.
			fetchOsiServicesTrusteeIndividualQualificationinfoByUuidAndGroupId(
				uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _osiServicesTrusteeIndividualQualificationinfoLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _osiServicesTrusteeIndividualQualificationinfoLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _osiServicesTrusteeIndividualQualificationinfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _osiServicesTrusteeIndividualQualificationinfoLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * Returns the osi services trustee individual qualificationinfo with the primary key.
	 *
	 * @param osQualificationId the primary key of the osi services trustee individual qualificationinfo
	 * @return the osi services trustee individual qualificationinfo
	 * @throws PortalException if a osi services trustee individual qualificationinfo with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesTrusteeIndividualQualificationinfo
				getOsiServicesTrusteeIndividualQualificationinfo(
					long osQualificationId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesTrusteeIndividualQualificationinfoLocalService.
			getOsiServicesTrusteeIndividualQualificationinfo(osQualificationId);
	}

	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesTrusteeIndividualQualificationinfo
				getOsiServicesTrusteeIndividualQualificationinfoById(
					long applicationId)
			throws com.nbp.osi.services.application.form.service.exception.
				NoSuchOsiServicesTrusteeIndividualQualificationinfoException {

		return _osiServicesTrusteeIndividualQualificationinfoLocalService.
			getOsiServicesTrusteeIndividualQualificationinfoById(applicationId);
	}

	/**
	 * Returns the osi services trustee individual qualificationinfo matching the UUID and group.
	 *
	 * @param uuid the osi services trustee individual qualificationinfo's UUID
	 * @param groupId the primary key of the group
	 * @return the matching osi services trustee individual qualificationinfo
	 * @throws PortalException if a matching osi services trustee individual qualificationinfo could not be found
	 */
	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesTrusteeIndividualQualificationinfo
				getOsiServicesTrusteeIndividualQualificationinfoByUuidAndGroupId(
					String uuid, long groupId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesTrusteeIndividualQualificationinfoLocalService.
			getOsiServicesTrusteeIndividualQualificationinfoByUuidAndGroupId(
				uuid, groupId);
	}

	/**
	 * Returns a range of all the osi services trustee individual qualificationinfos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.application.form.service.model.impl.OsiServicesTrusteeIndividualQualificationinfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services trustee individual qualificationinfos
	 * @param end the upper bound of the range of osi services trustee individual qualificationinfos (not inclusive)
	 * @return the range of osi services trustee individual qualificationinfos
	 */
	@Override
	public java.util.List
		<com.nbp.osi.services.application.form.service.model.
			OsiServicesTrusteeIndividualQualificationinfo>
				getOsiServicesTrusteeIndividualQualificationinfos(
					int start, int end) {

		return _osiServicesTrusteeIndividualQualificationinfoLocalService.
			getOsiServicesTrusteeIndividualQualificationinfos(start, end);
	}

	/**
	 * Returns all the osi services trustee individual qualificationinfos matching the UUID and company.
	 *
	 * @param uuid the UUID of the osi services trustee individual qualificationinfos
	 * @param companyId the primary key of the company
	 * @return the matching osi services trustee individual qualificationinfos, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.osi.services.application.form.service.model.
			OsiServicesTrusteeIndividualQualificationinfo>
				getOsiServicesTrusteeIndividualQualificationinfosByUuidAndCompanyId(
					String uuid, long companyId) {

		return _osiServicesTrusteeIndividualQualificationinfoLocalService.
			getOsiServicesTrusteeIndividualQualificationinfosByUuidAndCompanyId(
				uuid, companyId);
	}

	/**
	 * Returns a range of osi services trustee individual qualificationinfos matching the UUID and company.
	 *
	 * @param uuid the UUID of the osi services trustee individual qualificationinfos
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of osi services trustee individual qualificationinfos
	 * @param end the upper bound of the range of osi services trustee individual qualificationinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching osi services trustee individual qualificationinfos, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.osi.services.application.form.service.model.
			OsiServicesTrusteeIndividualQualificationinfo>
				getOsiServicesTrusteeIndividualQualificationinfosByUuidAndCompanyId(
					String uuid, long companyId, int start, int end,
					com.liferay.portal.kernel.util.OrderByComparator
						<com.nbp.osi.services.application.form.service.model.
							OsiServicesTrusteeIndividualQualificationinfo>
								orderByComparator) {

		return _osiServicesTrusteeIndividualQualificationinfoLocalService.
			getOsiServicesTrusteeIndividualQualificationinfosByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of osi services trustee individual qualificationinfos.
	 *
	 * @return the number of osi services trustee individual qualificationinfos
	 */
	@Override
	public int getOsiServicesTrusteeIndividualQualificationinfosCount() {
		return _osiServicesTrusteeIndividualQualificationinfoLocalService.
			getOsiServicesTrusteeIndividualQualificationinfosCount();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesTrusteeIndividualQualificationinfoLocalService.
			getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the osi services trustee individual qualificationinfo in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesTrusteeIndividualQualificationinfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesTrusteeIndividualQualificationinfo the osi services trustee individual qualificationinfo
	 * @return the osi services trustee individual qualificationinfo that was updated
	 */
	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesTrusteeIndividualQualificationinfo
			updateOsiServicesTrusteeIndividualQualificationinfo(
				com.nbp.osi.services.application.form.service.model.
					OsiServicesTrusteeIndividualQualificationinfo
						osiServicesTrusteeIndividualQualificationinfo) {

		return _osiServicesTrusteeIndividualQualificationinfoLocalService.
			updateOsiServicesTrusteeIndividualQualificationinfo(
				osiServicesTrusteeIndividualQualificationinfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _osiServicesTrusteeIndividualQualificationinfoLocalService.
			getBasePersistence();
	}

	@Override
	public OsiServicesTrusteeIndividualQualificationinfoLocalService
		getWrappedService() {

		return _osiServicesTrusteeIndividualQualificationinfoLocalService;
	}

	@Override
	public void setWrappedService(
		OsiServicesTrusteeIndividualQualificationinfoLocalService
			osiServicesTrusteeIndividualQualificationinfoLocalService) {

		_osiServicesTrusteeIndividualQualificationinfoLocalService =
			osiServicesTrusteeIndividualQualificationinfoLocalService;
	}

	private OsiServicesTrusteeIndividualQualificationinfoLocalService
		_osiServicesTrusteeIndividualQualificationinfoLocalService;

}