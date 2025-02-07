/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AccMediLabOrganizationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AccMediLabOrganizationLocalService
 * @generated
 */
public class AccMediLabOrganizationLocalServiceWrapper
	implements AccMediLabOrganizationLocalService,
			   ServiceWrapper<AccMediLabOrganizationLocalService> {

	public AccMediLabOrganizationLocalServiceWrapper() {
		this(null);
	}

	public AccMediLabOrganizationLocalServiceWrapper(
		AccMediLabOrganizationLocalService accMediLabOrganizationLocalService) {

		_accMediLabOrganizationLocalService =
			accMediLabOrganizationLocalService;
	}

	/**
	 * Adds the acc medi lab organization to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccMediLabOrganizationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accMediLabOrganization the acc medi lab organization
	 * @return the acc medi lab organization that was added
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccMediLabOrganization
		addAccMediLabOrganization(
			com.nbp.janaac.application.form.service.model.AccMediLabOrganization
				accMediLabOrganization) {

		return _accMediLabOrganizationLocalService.addAccMediLabOrganization(
			accMediLabOrganization);
	}

	/**
	 * Creates a new acc medi lab organization with the primary key. Does not add the acc medi lab organization to the database.
	 *
	 * @param accMediLabOrganizationId the primary key for the new acc medi lab organization
	 * @return the new acc medi lab organization
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccMediLabOrganization
		createAccMediLabOrganization(long accMediLabOrganizationId) {

		return _accMediLabOrganizationLocalService.createAccMediLabOrganization(
			accMediLabOrganizationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accMediLabOrganizationLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the acc medi lab organization from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccMediLabOrganizationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accMediLabOrganization the acc medi lab organization
	 * @return the acc medi lab organization that was removed
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccMediLabOrganization
		deleteAccMediLabOrganization(
			com.nbp.janaac.application.form.service.model.AccMediLabOrganization
				accMediLabOrganization) {

		return _accMediLabOrganizationLocalService.deleteAccMediLabOrganization(
			accMediLabOrganization);
	}

	/**
	 * Deletes the acc medi lab organization with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccMediLabOrganizationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accMediLabOrganizationId the primary key of the acc medi lab organization
	 * @return the acc medi lab organization that was removed
	 * @throws PortalException if a acc medi lab organization with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccMediLabOrganization
			deleteAccMediLabOrganization(long accMediLabOrganizationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accMediLabOrganizationLocalService.deleteAccMediLabOrganization(
			accMediLabOrganizationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accMediLabOrganizationLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _accMediLabOrganizationLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _accMediLabOrganizationLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _accMediLabOrganizationLocalService.dynamicQuery();
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

		return _accMediLabOrganizationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccMediLabOrganizationModelImpl</code>.
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

		return _accMediLabOrganizationLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccMediLabOrganizationModelImpl</code>.
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

		return _accMediLabOrganizationLocalService.dynamicQuery(
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

		return _accMediLabOrganizationLocalService.dynamicQueryCount(
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

		return _accMediLabOrganizationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.janaac.application.form.service.model.AccMediLabOrganization
		fetchAccMediLabOrganization(long accMediLabOrganizationId) {

		return _accMediLabOrganizationLocalService.fetchAccMediLabOrganization(
			accMediLabOrganizationId);
	}

	/**
	 * Returns the acc medi lab organization matching the UUID and group.
	 *
	 * @param uuid the acc medi lab organization's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acc medi lab organization, or <code>null</code> if a matching acc medi lab organization could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccMediLabOrganization
		fetchAccMediLabOrganizationByUuidAndGroupId(String uuid, long groupId) {

		return _accMediLabOrganizationLocalService.
			fetchAccMediLabOrganizationByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns the acc medi lab organization with the primary key.
	 *
	 * @param accMediLabOrganizationId the primary key of the acc medi lab organization
	 * @return the acc medi lab organization
	 * @throws PortalException if a acc medi lab organization with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccMediLabOrganization
			getAccMediLabOrganization(long accMediLabOrganizationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accMediLabOrganizationLocalService.getAccMediLabOrganization(
			accMediLabOrganizationId);
	}

	/**
	 * Returns the acc medi lab organization matching the UUID and group.
	 *
	 * @param uuid the acc medi lab organization's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acc medi lab organization
	 * @throws PortalException if a matching acc medi lab organization could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccMediLabOrganization
			getAccMediLabOrganizationByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accMediLabOrganizationLocalService.
			getAccMediLabOrganizationByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the acc medi lab organizations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccMediLabOrganizationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc medi lab organizations
	 * @param end the upper bound of the range of acc medi lab organizations (not inclusive)
	 * @return the range of acc medi lab organizations
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AccMediLabOrganization>
			getAccMediLabOrganizations(int start, int end) {

		return _accMediLabOrganizationLocalService.getAccMediLabOrganizations(
			start, end);
	}

	/**
	 * Returns all the acc medi lab organizations matching the UUID and company.
	 *
	 * @param uuid the UUID of the acc medi lab organizations
	 * @param companyId the primary key of the company
	 * @return the matching acc medi lab organizations, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AccMediLabOrganization>
			getAccMediLabOrganizationsByUuidAndCompanyId(
				String uuid, long companyId) {

		return _accMediLabOrganizationLocalService.
			getAccMediLabOrganizationsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of acc medi lab organizations matching the UUID and company.
	 *
	 * @param uuid the UUID of the acc medi lab organizations
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of acc medi lab organizations
	 * @param end the upper bound of the range of acc medi lab organizations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching acc medi lab organizations, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AccMediLabOrganization>
			getAccMediLabOrganizationsByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.nbp.janaac.application.form.service.model.
						AccMediLabOrganization> orderByComparator) {

		return _accMediLabOrganizationLocalService.
			getAccMediLabOrganizationsByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of acc medi lab organizations.
	 *
	 * @return the number of acc medi lab organizations
	 */
	@Override
	public int getAccMediLabOrganizationsCount() {
		return _accMediLabOrganizationLocalService.
			getAccMediLabOrganizationsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _accMediLabOrganizationLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _accMediLabOrganizationLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _accMediLabOrganizationLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.janaac.application.form.service.model.AccMediLabOrganization
			getJANAAC_ByApplicationId(long janaacApplicationId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccMediLabOrganizationException {

		return _accMediLabOrganizationLocalService.getJANAAC_ByApplicationId(
			janaacApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _accMediLabOrganizationLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accMediLabOrganizationLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the acc medi lab organization in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccMediLabOrganizationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accMediLabOrganization the acc medi lab organization
	 * @return the acc medi lab organization that was updated
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccMediLabOrganization
		updateAccMediLabOrganization(
			com.nbp.janaac.application.form.service.model.AccMediLabOrganization
				accMediLabOrganization) {

		return _accMediLabOrganizationLocalService.updateAccMediLabOrganization(
			accMediLabOrganization);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _accMediLabOrganizationLocalService.getBasePersistence();
	}

	@Override
	public AccMediLabOrganizationLocalService getWrappedService() {
		return _accMediLabOrganizationLocalService;
	}

	@Override
	public void setWrappedService(
		AccMediLabOrganizationLocalService accMediLabOrganizationLocalService) {

		_accMediLabOrganizationLocalService =
			accMediLabOrganizationLocalService;
	}

	private AccMediLabOrganizationLocalService
		_accMediLabOrganizationLocalService;

}