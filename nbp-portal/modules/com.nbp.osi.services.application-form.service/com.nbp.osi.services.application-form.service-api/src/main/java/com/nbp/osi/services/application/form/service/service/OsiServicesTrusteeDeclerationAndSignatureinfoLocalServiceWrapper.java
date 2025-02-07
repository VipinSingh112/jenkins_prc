/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link OsiServicesTrusteeDeclerationAndSignatureinfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see OsiServicesTrusteeDeclerationAndSignatureinfoLocalService
 * @generated
 */
public class OsiServicesTrusteeDeclerationAndSignatureinfoLocalServiceWrapper
	implements OsiServicesTrusteeDeclerationAndSignatureinfoLocalService,
			   ServiceWrapper
				   <OsiServicesTrusteeDeclerationAndSignatureinfoLocalService> {

	public OsiServicesTrusteeDeclerationAndSignatureinfoLocalServiceWrapper() {
		this(null);
	}

	public OsiServicesTrusteeDeclerationAndSignatureinfoLocalServiceWrapper(
		OsiServicesTrusteeDeclerationAndSignatureinfoLocalService
			osiServicesTrusteeDeclerationAndSignatureinfoLocalService) {

		_osiServicesTrusteeDeclerationAndSignatureinfoLocalService =
			osiServicesTrusteeDeclerationAndSignatureinfoLocalService;
	}

	/**
	 * Adds the osi services trustee decleration and signatureinfo to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesTrusteeDeclerationAndSignatureinfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesTrusteeDeclerationAndSignatureinfo the osi services trustee decleration and signatureinfo
	 * @return the osi services trustee decleration and signatureinfo that was added
	 */
	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesTrusteeDeclerationAndSignatureinfo
			addOsiServicesTrusteeDeclerationAndSignatureinfo(
				com.nbp.osi.services.application.form.service.model.
					OsiServicesTrusteeDeclerationAndSignatureinfo
						osiServicesTrusteeDeclerationAndSignatureinfo) {

		return _osiServicesTrusteeDeclerationAndSignatureinfoLocalService.
			addOsiServicesTrusteeDeclerationAndSignatureinfo(
				osiServicesTrusteeDeclerationAndSignatureinfo);
	}

	/**
	 * Creates a new osi services trustee decleration and signatureinfo with the primary key. Does not add the osi services trustee decleration and signatureinfo to the database.
	 *
	 * @param osiDeclerationId the primary key for the new osi services trustee decleration and signatureinfo
	 * @return the new osi services trustee decleration and signatureinfo
	 */
	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesTrusteeDeclerationAndSignatureinfo
			createOsiServicesTrusteeDeclerationAndSignatureinfo(
				long osiDeclerationId) {

		return _osiServicesTrusteeDeclerationAndSignatureinfoLocalService.
			createOsiServicesTrusteeDeclerationAndSignatureinfo(
				osiDeclerationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesTrusteeDeclerationAndSignatureinfoLocalService.
			createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the osi services trustee decleration and signatureinfo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesTrusteeDeclerationAndSignatureinfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiDeclerationId the primary key of the osi services trustee decleration and signatureinfo
	 * @return the osi services trustee decleration and signatureinfo that was removed
	 * @throws PortalException if a osi services trustee decleration and signatureinfo with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesTrusteeDeclerationAndSignatureinfo
				deleteOsiServicesTrusteeDeclerationAndSignatureinfo(
					long osiDeclerationId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesTrusteeDeclerationAndSignatureinfoLocalService.
			deleteOsiServicesTrusteeDeclerationAndSignatureinfo(
				osiDeclerationId);
	}

	/**
	 * Deletes the osi services trustee decleration and signatureinfo from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesTrusteeDeclerationAndSignatureinfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesTrusteeDeclerationAndSignatureinfo the osi services trustee decleration and signatureinfo
	 * @return the osi services trustee decleration and signatureinfo that was removed
	 */
	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesTrusteeDeclerationAndSignatureinfo
			deleteOsiServicesTrusteeDeclerationAndSignatureinfo(
				com.nbp.osi.services.application.form.service.model.
					OsiServicesTrusteeDeclerationAndSignatureinfo
						osiServicesTrusteeDeclerationAndSignatureinfo) {

		return _osiServicesTrusteeDeclerationAndSignatureinfoLocalService.
			deleteOsiServicesTrusteeDeclerationAndSignatureinfo(
				osiServicesTrusteeDeclerationAndSignatureinfo);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesTrusteeDeclerationAndSignatureinfoLocalService.
			deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _osiServicesTrusteeDeclerationAndSignatureinfoLocalService.
			dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _osiServicesTrusteeDeclerationAndSignatureinfoLocalService.
			dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _osiServicesTrusteeDeclerationAndSignatureinfoLocalService.
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

		return _osiServicesTrusteeDeclerationAndSignatureinfoLocalService.
			dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.application.form.service.model.impl.OsiServicesTrusteeDeclerationAndSignatureinfoModelImpl</code>.
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

		return _osiServicesTrusteeDeclerationAndSignatureinfoLocalService.
			dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.application.form.service.model.impl.OsiServicesTrusteeDeclerationAndSignatureinfoModelImpl</code>.
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

		return _osiServicesTrusteeDeclerationAndSignatureinfoLocalService.
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

		return _osiServicesTrusteeDeclerationAndSignatureinfoLocalService.
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

		return _osiServicesTrusteeDeclerationAndSignatureinfoLocalService.
			dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesTrusteeDeclerationAndSignatureinfo
			fetchOsiServicesTrusteeDeclerationAndSignatureinfo(
				long osiDeclerationId) {

		return _osiServicesTrusteeDeclerationAndSignatureinfoLocalService.
			fetchOsiServicesTrusteeDeclerationAndSignatureinfo(
				osiDeclerationId);
	}

	/**
	 * Returns the osi services trustee decleration and signatureinfo matching the UUID and group.
	 *
	 * @param uuid the osi services trustee decleration and signatureinfo's UUID
	 * @param groupId the primary key of the group
	 * @return the matching osi services trustee decleration and signatureinfo, or <code>null</code> if a matching osi services trustee decleration and signatureinfo could not be found
	 */
	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesTrusteeDeclerationAndSignatureinfo
			fetchOsiServicesTrusteeDeclerationAndSignatureinfoByUuidAndGroupId(
				String uuid, long groupId) {

		return _osiServicesTrusteeDeclerationAndSignatureinfoLocalService.
			fetchOsiServicesTrusteeDeclerationAndSignatureinfoByUuidAndGroupId(
				uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _osiServicesTrusteeDeclerationAndSignatureinfoLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _osiServicesTrusteeDeclerationAndSignatureinfoLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _osiServicesTrusteeDeclerationAndSignatureinfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _osiServicesTrusteeDeclerationAndSignatureinfoLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * Returns the osi services trustee decleration and signatureinfo with the primary key.
	 *
	 * @param osiDeclerationId the primary key of the osi services trustee decleration and signatureinfo
	 * @return the osi services trustee decleration and signatureinfo
	 * @throws PortalException if a osi services trustee decleration and signatureinfo with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesTrusteeDeclerationAndSignatureinfo
				getOsiServicesTrusteeDeclerationAndSignatureinfo(
					long osiDeclerationId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesTrusteeDeclerationAndSignatureinfoLocalService.
			getOsiServicesTrusteeDeclerationAndSignatureinfo(osiDeclerationId);
	}

	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesTrusteeDeclerationAndSignatureinfo
				getOsiServicesTrusteeDeclerationAndSignatureinfoById(
					long applicationId)
			throws com.nbp.osi.services.application.form.service.exception.
				NoSuchOsiServicesTrusteeDeclerationAndSignatureinfoException {

		return _osiServicesTrusteeDeclerationAndSignatureinfoLocalService.
			getOsiServicesTrusteeDeclerationAndSignatureinfoById(applicationId);
	}

	/**
	 * Returns the osi services trustee decleration and signatureinfo matching the UUID and group.
	 *
	 * @param uuid the osi services trustee decleration and signatureinfo's UUID
	 * @param groupId the primary key of the group
	 * @return the matching osi services trustee decleration and signatureinfo
	 * @throws PortalException if a matching osi services trustee decleration and signatureinfo could not be found
	 */
	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesTrusteeDeclerationAndSignatureinfo
				getOsiServicesTrusteeDeclerationAndSignatureinfoByUuidAndGroupId(
					String uuid, long groupId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesTrusteeDeclerationAndSignatureinfoLocalService.
			getOsiServicesTrusteeDeclerationAndSignatureinfoByUuidAndGroupId(
				uuid, groupId);
	}

	/**
	 * Returns a range of all the osi services trustee decleration and signatureinfos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.application.form.service.model.impl.OsiServicesTrusteeDeclerationAndSignatureinfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services trustee decleration and signatureinfos
	 * @param end the upper bound of the range of osi services trustee decleration and signatureinfos (not inclusive)
	 * @return the range of osi services trustee decleration and signatureinfos
	 */
	@Override
	public java.util.List
		<com.nbp.osi.services.application.form.service.model.
			OsiServicesTrusteeDeclerationAndSignatureinfo>
				getOsiServicesTrusteeDeclerationAndSignatureinfos(
					int start, int end) {

		return _osiServicesTrusteeDeclerationAndSignatureinfoLocalService.
			getOsiServicesTrusteeDeclerationAndSignatureinfos(start, end);
	}

	/**
	 * Returns all the osi services trustee decleration and signatureinfos matching the UUID and company.
	 *
	 * @param uuid the UUID of the osi services trustee decleration and signatureinfos
	 * @param companyId the primary key of the company
	 * @return the matching osi services trustee decleration and signatureinfos, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.osi.services.application.form.service.model.
			OsiServicesTrusteeDeclerationAndSignatureinfo>
				getOsiServicesTrusteeDeclerationAndSignatureinfosByUuidAndCompanyId(
					String uuid, long companyId) {

		return _osiServicesTrusteeDeclerationAndSignatureinfoLocalService.
			getOsiServicesTrusteeDeclerationAndSignatureinfosByUuidAndCompanyId(
				uuid, companyId);
	}

	/**
	 * Returns a range of osi services trustee decleration and signatureinfos matching the UUID and company.
	 *
	 * @param uuid the UUID of the osi services trustee decleration and signatureinfos
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of osi services trustee decleration and signatureinfos
	 * @param end the upper bound of the range of osi services trustee decleration and signatureinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching osi services trustee decleration and signatureinfos, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.osi.services.application.form.service.model.
			OsiServicesTrusteeDeclerationAndSignatureinfo>
				getOsiServicesTrusteeDeclerationAndSignatureinfosByUuidAndCompanyId(
					String uuid, long companyId, int start, int end,
					com.liferay.portal.kernel.util.OrderByComparator
						<com.nbp.osi.services.application.form.service.model.
							OsiServicesTrusteeDeclerationAndSignatureinfo>
								orderByComparator) {

		return _osiServicesTrusteeDeclerationAndSignatureinfoLocalService.
			getOsiServicesTrusteeDeclerationAndSignatureinfosByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of osi services trustee decleration and signatureinfos.
	 *
	 * @return the number of osi services trustee decleration and signatureinfos
	 */
	@Override
	public int getOsiServicesTrusteeDeclerationAndSignatureinfosCount() {
		return _osiServicesTrusteeDeclerationAndSignatureinfoLocalService.
			getOsiServicesTrusteeDeclerationAndSignatureinfosCount();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesTrusteeDeclerationAndSignatureinfoLocalService.
			getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the osi services trustee decleration and signatureinfo in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesTrusteeDeclerationAndSignatureinfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesTrusteeDeclerationAndSignatureinfo the osi services trustee decleration and signatureinfo
	 * @return the osi services trustee decleration and signatureinfo that was updated
	 */
	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesTrusteeDeclerationAndSignatureinfo
			updateOsiServicesTrusteeDeclerationAndSignatureinfo(
				com.nbp.osi.services.application.form.service.model.
					OsiServicesTrusteeDeclerationAndSignatureinfo
						osiServicesTrusteeDeclerationAndSignatureinfo) {

		return _osiServicesTrusteeDeclerationAndSignatureinfoLocalService.
			updateOsiServicesTrusteeDeclerationAndSignatureinfo(
				osiServicesTrusteeDeclerationAndSignatureinfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _osiServicesTrusteeDeclerationAndSignatureinfoLocalService.
			getBasePersistence();
	}

	@Override
	public OsiServicesTrusteeDeclerationAndSignatureinfoLocalService
		getWrappedService() {

		return _osiServicesTrusteeDeclerationAndSignatureinfoLocalService;
	}

	@Override
	public void setWrappedService(
		OsiServicesTrusteeDeclerationAndSignatureinfoLocalService
			osiServicesTrusteeDeclerationAndSignatureinfoLocalService) {

		_osiServicesTrusteeDeclerationAndSignatureinfoLocalService =
			osiServicesTrusteeDeclerationAndSignatureinfoLocalService;
	}

	private OsiServicesTrusteeDeclerationAndSignatureinfoLocalService
		_osiServicesTrusteeDeclerationAndSignatureinfoLocalService;

}