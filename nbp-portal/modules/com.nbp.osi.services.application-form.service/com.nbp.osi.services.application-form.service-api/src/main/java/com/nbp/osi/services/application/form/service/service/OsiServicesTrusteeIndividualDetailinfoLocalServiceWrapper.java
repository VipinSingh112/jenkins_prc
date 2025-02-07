/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link OsiServicesTrusteeIndividualDetailinfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see OsiServicesTrusteeIndividualDetailinfoLocalService
 * @generated
 */
public class OsiServicesTrusteeIndividualDetailinfoLocalServiceWrapper
	implements OsiServicesTrusteeIndividualDetailinfoLocalService,
			   ServiceWrapper
				   <OsiServicesTrusteeIndividualDetailinfoLocalService> {

	public OsiServicesTrusteeIndividualDetailinfoLocalServiceWrapper() {
		this(null);
	}

	public OsiServicesTrusteeIndividualDetailinfoLocalServiceWrapper(
		OsiServicesTrusteeIndividualDetailinfoLocalService
			osiServicesTrusteeIndividualDetailinfoLocalService) {

		_osiServicesTrusteeIndividualDetailinfoLocalService =
			osiServicesTrusteeIndividualDetailinfoLocalService;
	}

	/**
	 * Adds the osi services trustee individual detailinfo to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesTrusteeIndividualDetailinfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesTrusteeIndividualDetailinfo the osi services trustee individual detailinfo
	 * @return the osi services trustee individual detailinfo that was added
	 */
	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesTrusteeIndividualDetailinfo
			addOsiServicesTrusteeIndividualDetailinfo(
				com.nbp.osi.services.application.form.service.model.
					OsiServicesTrusteeIndividualDetailinfo
						osiServicesTrusteeIndividualDetailinfo) {

		return _osiServicesTrusteeIndividualDetailinfoLocalService.
			addOsiServicesTrusteeIndividualDetailinfo(
				osiServicesTrusteeIndividualDetailinfo);
	}

	/**
	 * Creates a new osi services trustee individual detailinfo with the primary key. Does not add the osi services trustee individual detailinfo to the database.
	 *
	 * @param osTIId the primary key for the new osi services trustee individual detailinfo
	 * @return the new osi services trustee individual detailinfo
	 */
	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesTrusteeIndividualDetailinfo
			createOsiServicesTrusteeIndividualDetailinfo(long osTIId) {

		return _osiServicesTrusteeIndividualDetailinfoLocalService.
			createOsiServicesTrusteeIndividualDetailinfo(osTIId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesTrusteeIndividualDetailinfoLocalService.
			createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the osi services trustee individual detailinfo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesTrusteeIndividualDetailinfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osTIId the primary key of the osi services trustee individual detailinfo
	 * @return the osi services trustee individual detailinfo that was removed
	 * @throws PortalException if a osi services trustee individual detailinfo with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesTrusteeIndividualDetailinfo
				deleteOsiServicesTrusteeIndividualDetailinfo(long osTIId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesTrusteeIndividualDetailinfoLocalService.
			deleteOsiServicesTrusteeIndividualDetailinfo(osTIId);
	}

	/**
	 * Deletes the osi services trustee individual detailinfo from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesTrusteeIndividualDetailinfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesTrusteeIndividualDetailinfo the osi services trustee individual detailinfo
	 * @return the osi services trustee individual detailinfo that was removed
	 */
	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesTrusteeIndividualDetailinfo
			deleteOsiServicesTrusteeIndividualDetailinfo(
				com.nbp.osi.services.application.form.service.model.
					OsiServicesTrusteeIndividualDetailinfo
						osiServicesTrusteeIndividualDetailinfo) {

		return _osiServicesTrusteeIndividualDetailinfoLocalService.
			deleteOsiServicesTrusteeIndividualDetailinfo(
				osiServicesTrusteeIndividualDetailinfo);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesTrusteeIndividualDetailinfoLocalService.
			deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _osiServicesTrusteeIndividualDetailinfoLocalService.dslQuery(
			dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _osiServicesTrusteeIndividualDetailinfoLocalService.
			dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _osiServicesTrusteeIndividualDetailinfoLocalService.
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

		return _osiServicesTrusteeIndividualDetailinfoLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.application.form.service.model.impl.OsiServicesTrusteeIndividualDetailinfoModelImpl</code>.
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

		return _osiServicesTrusteeIndividualDetailinfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.application.form.service.model.impl.OsiServicesTrusteeIndividualDetailinfoModelImpl</code>.
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

		return _osiServicesTrusteeIndividualDetailinfoLocalService.dynamicQuery(
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

		return _osiServicesTrusteeIndividualDetailinfoLocalService.
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

		return _osiServicesTrusteeIndividualDetailinfoLocalService.
			dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesTrusteeIndividualDetailinfo
			fetchOsiServicesTrusteeIndividualDetailinfo(long osTIId) {

		return _osiServicesTrusteeIndividualDetailinfoLocalService.
			fetchOsiServicesTrusteeIndividualDetailinfo(osTIId);
	}

	/**
	 * Returns the osi services trustee individual detailinfo matching the UUID and group.
	 *
	 * @param uuid the osi services trustee individual detailinfo's UUID
	 * @param groupId the primary key of the group
	 * @return the matching osi services trustee individual detailinfo, or <code>null</code> if a matching osi services trustee individual detailinfo could not be found
	 */
	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesTrusteeIndividualDetailinfo
			fetchOsiServicesTrusteeIndividualDetailinfoByUuidAndGroupId(
				String uuid, long groupId) {

		return _osiServicesTrusteeIndividualDetailinfoLocalService.
			fetchOsiServicesTrusteeIndividualDetailinfoByUuidAndGroupId(
				uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _osiServicesTrusteeIndividualDetailinfoLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _osiServicesTrusteeIndividualDetailinfoLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _osiServicesTrusteeIndividualDetailinfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _osiServicesTrusteeIndividualDetailinfoLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * Returns the osi services trustee individual detailinfo with the primary key.
	 *
	 * @param osTIId the primary key of the osi services trustee individual detailinfo
	 * @return the osi services trustee individual detailinfo
	 * @throws PortalException if a osi services trustee individual detailinfo with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesTrusteeIndividualDetailinfo
				getOsiServicesTrusteeIndividualDetailinfo(long osTIId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesTrusteeIndividualDetailinfoLocalService.
			getOsiServicesTrusteeIndividualDetailinfo(osTIId);
	}

	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesTrusteeIndividualDetailinfo
				getOsiServicesTrusteeIndividualDetailinfoById(
					long applicationId)
			throws com.nbp.osi.services.application.form.service.exception.
				NoSuchOsiServicesTrusteeIndividualDetailinfoException {

		return _osiServicesTrusteeIndividualDetailinfoLocalService.
			getOsiServicesTrusteeIndividualDetailinfoById(applicationId);
	}

	/**
	 * Returns the osi services trustee individual detailinfo matching the UUID and group.
	 *
	 * @param uuid the osi services trustee individual detailinfo's UUID
	 * @param groupId the primary key of the group
	 * @return the matching osi services trustee individual detailinfo
	 * @throws PortalException if a matching osi services trustee individual detailinfo could not be found
	 */
	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesTrusteeIndividualDetailinfo
				getOsiServicesTrusteeIndividualDetailinfoByUuidAndGroupId(
					String uuid, long groupId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesTrusteeIndividualDetailinfoLocalService.
			getOsiServicesTrusteeIndividualDetailinfoByUuidAndGroupId(
				uuid, groupId);
	}

	/**
	 * Returns a range of all the osi services trustee individual detailinfos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.application.form.service.model.impl.OsiServicesTrusteeIndividualDetailinfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services trustee individual detailinfos
	 * @param end the upper bound of the range of osi services trustee individual detailinfos (not inclusive)
	 * @return the range of osi services trustee individual detailinfos
	 */
	@Override
	public java.util.List
		<com.nbp.osi.services.application.form.service.model.
			OsiServicesTrusteeIndividualDetailinfo>
				getOsiServicesTrusteeIndividualDetailinfos(int start, int end) {

		return _osiServicesTrusteeIndividualDetailinfoLocalService.
			getOsiServicesTrusteeIndividualDetailinfos(start, end);
	}

	/**
	 * Returns all the osi services trustee individual detailinfos matching the UUID and company.
	 *
	 * @param uuid the UUID of the osi services trustee individual detailinfos
	 * @param companyId the primary key of the company
	 * @return the matching osi services trustee individual detailinfos, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.osi.services.application.form.service.model.
			OsiServicesTrusteeIndividualDetailinfo>
				getOsiServicesTrusteeIndividualDetailinfosByUuidAndCompanyId(
					String uuid, long companyId) {

		return _osiServicesTrusteeIndividualDetailinfoLocalService.
			getOsiServicesTrusteeIndividualDetailinfosByUuidAndCompanyId(
				uuid, companyId);
	}

	/**
	 * Returns a range of osi services trustee individual detailinfos matching the UUID and company.
	 *
	 * @param uuid the UUID of the osi services trustee individual detailinfos
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of osi services trustee individual detailinfos
	 * @param end the upper bound of the range of osi services trustee individual detailinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching osi services trustee individual detailinfos, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.osi.services.application.form.service.model.
			OsiServicesTrusteeIndividualDetailinfo>
				getOsiServicesTrusteeIndividualDetailinfosByUuidAndCompanyId(
					String uuid, long companyId, int start, int end,
					com.liferay.portal.kernel.util.OrderByComparator
						<com.nbp.osi.services.application.form.service.model.
							OsiServicesTrusteeIndividualDetailinfo>
								orderByComparator) {

		return _osiServicesTrusteeIndividualDetailinfoLocalService.
			getOsiServicesTrusteeIndividualDetailinfosByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of osi services trustee individual detailinfos.
	 *
	 * @return the number of osi services trustee individual detailinfos
	 */
	@Override
	public int getOsiServicesTrusteeIndividualDetailinfosCount() {
		return _osiServicesTrusteeIndividualDetailinfoLocalService.
			getOsiServicesTrusteeIndividualDetailinfosCount();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesTrusteeIndividualDetailinfoLocalService.
			getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the osi services trustee individual detailinfo in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesTrusteeIndividualDetailinfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesTrusteeIndividualDetailinfo the osi services trustee individual detailinfo
	 * @return the osi services trustee individual detailinfo that was updated
	 */
	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesTrusteeIndividualDetailinfo
			updateOsiServicesTrusteeIndividualDetailinfo(
				com.nbp.osi.services.application.form.service.model.
					OsiServicesTrusteeIndividualDetailinfo
						osiServicesTrusteeIndividualDetailinfo) {

		return _osiServicesTrusteeIndividualDetailinfoLocalService.
			updateOsiServicesTrusteeIndividualDetailinfo(
				osiServicesTrusteeIndividualDetailinfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _osiServicesTrusteeIndividualDetailinfoLocalService.
			getBasePersistence();
	}

	@Override
	public OsiServicesTrusteeIndividualDetailinfoLocalService
		getWrappedService() {

		return _osiServicesTrusteeIndividualDetailinfoLocalService;
	}

	@Override
	public void setWrappedService(
		OsiServicesTrusteeIndividualDetailinfoLocalService
			osiServicesTrusteeIndividualDetailinfoLocalService) {

		_osiServicesTrusteeIndividualDetailinfoLocalService =
			osiServicesTrusteeIndividualDetailinfoLocalService;
	}

	private OsiServicesTrusteeIndividualDetailinfoLocalService
		_osiServicesTrusteeIndividualDetailinfoLocalService;

}