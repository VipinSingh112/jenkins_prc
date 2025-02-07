/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AccInsBodiesOrganizationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AccInsBodiesOrganizationLocalService
 * @generated
 */
public class AccInsBodiesOrganizationLocalServiceWrapper
	implements AccInsBodiesOrganizationLocalService,
			   ServiceWrapper<AccInsBodiesOrganizationLocalService> {

	public AccInsBodiesOrganizationLocalServiceWrapper() {
		this(null);
	}

	public AccInsBodiesOrganizationLocalServiceWrapper(
		AccInsBodiesOrganizationLocalService
			accInsBodiesOrganizationLocalService) {

		_accInsBodiesOrganizationLocalService =
			accInsBodiesOrganizationLocalService;
	}

	/**
	 * Adds the acc ins bodies organization to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccInsBodiesOrganizationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accInsBodiesOrganization the acc ins bodies organization
	 * @return the acc ins bodies organization that was added
	 */
	@Override
	public
		com.nbp.janaac.application.form.service.model.AccInsBodiesOrganization
			addAccInsBodiesOrganization(
				com.nbp.janaac.application.form.service.model.
					AccInsBodiesOrganization accInsBodiesOrganization) {

		return _accInsBodiesOrganizationLocalService.
			addAccInsBodiesOrganization(accInsBodiesOrganization);
	}

	/**
	 * Creates a new acc ins bodies organization with the primary key. Does not add the acc ins bodies organization to the database.
	 *
	 * @param accInsBodiesOrganizationId the primary key for the new acc ins bodies organization
	 * @return the new acc ins bodies organization
	 */
	@Override
	public
		com.nbp.janaac.application.form.service.model.AccInsBodiesOrganization
			createAccInsBodiesOrganization(long accInsBodiesOrganizationId) {

		return _accInsBodiesOrganizationLocalService.
			createAccInsBodiesOrganization(accInsBodiesOrganizationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accInsBodiesOrganizationLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the acc ins bodies organization from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccInsBodiesOrganizationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accInsBodiesOrganization the acc ins bodies organization
	 * @return the acc ins bodies organization that was removed
	 */
	@Override
	public
		com.nbp.janaac.application.form.service.model.AccInsBodiesOrganization
			deleteAccInsBodiesOrganization(
				com.nbp.janaac.application.form.service.model.
					AccInsBodiesOrganization accInsBodiesOrganization) {

		return _accInsBodiesOrganizationLocalService.
			deleteAccInsBodiesOrganization(accInsBodiesOrganization);
	}

	/**
	 * Deletes the acc ins bodies organization with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccInsBodiesOrganizationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accInsBodiesOrganizationId the primary key of the acc ins bodies organization
	 * @return the acc ins bodies organization that was removed
	 * @throws PortalException if a acc ins bodies organization with the primary key could not be found
	 */
	@Override
	public
		com.nbp.janaac.application.form.service.model.AccInsBodiesOrganization
				deleteAccInsBodiesOrganization(long accInsBodiesOrganizationId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _accInsBodiesOrganizationLocalService.
			deleteAccInsBodiesOrganization(accInsBodiesOrganizationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accInsBodiesOrganizationLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _accInsBodiesOrganizationLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _accInsBodiesOrganizationLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _accInsBodiesOrganizationLocalService.dynamicQuery();
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

		return _accInsBodiesOrganizationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccInsBodiesOrganizationModelImpl</code>.
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

		return _accInsBodiesOrganizationLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccInsBodiesOrganizationModelImpl</code>.
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

		return _accInsBodiesOrganizationLocalService.dynamicQuery(
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

		return _accInsBodiesOrganizationLocalService.dynamicQueryCount(
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

		return _accInsBodiesOrganizationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.janaac.application.form.service.model.AccInsBodiesOrganization
			fetchAccInsBodiesOrganization(long accInsBodiesOrganizationId) {

		return _accInsBodiesOrganizationLocalService.
			fetchAccInsBodiesOrganization(accInsBodiesOrganizationId);
	}

	/**
	 * Returns the acc ins bodies organization matching the UUID and group.
	 *
	 * @param uuid the acc ins bodies organization's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acc ins bodies organization, or <code>null</code> if a matching acc ins bodies organization could not be found
	 */
	@Override
	public
		com.nbp.janaac.application.form.service.model.AccInsBodiesOrganization
			fetchAccInsBodiesOrganizationByUuidAndGroupId(
				String uuid, long groupId) {

		return _accInsBodiesOrganizationLocalService.
			fetchAccInsBodiesOrganizationByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns the acc ins bodies organization with the primary key.
	 *
	 * @param accInsBodiesOrganizationId the primary key of the acc ins bodies organization
	 * @return the acc ins bodies organization
	 * @throws PortalException if a acc ins bodies organization with the primary key could not be found
	 */
	@Override
	public
		com.nbp.janaac.application.form.service.model.AccInsBodiesOrganization
				getAccInsBodiesOrganization(long accInsBodiesOrganizationId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _accInsBodiesOrganizationLocalService.
			getAccInsBodiesOrganization(accInsBodiesOrganizationId);
	}

	/**
	 * Returns the acc ins bodies organization matching the UUID and group.
	 *
	 * @param uuid the acc ins bodies organization's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acc ins bodies organization
	 * @throws PortalException if a matching acc ins bodies organization could not be found
	 */
	@Override
	public
		com.nbp.janaac.application.form.service.model.AccInsBodiesOrganization
				getAccInsBodiesOrganizationByUuidAndGroupId(
					String uuid, long groupId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _accInsBodiesOrganizationLocalService.
			getAccInsBodiesOrganizationByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the acc ins bodies organizations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccInsBodiesOrganizationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc ins bodies organizations
	 * @param end the upper bound of the range of acc ins bodies organizations (not inclusive)
	 * @return the range of acc ins bodies organizations
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AccInsBodiesOrganization>
			getAccInsBodiesOrganizations(int start, int end) {

		return _accInsBodiesOrganizationLocalService.
			getAccInsBodiesOrganizations(start, end);
	}

	/**
	 * Returns all the acc ins bodies organizations matching the UUID and company.
	 *
	 * @param uuid the UUID of the acc ins bodies organizations
	 * @param companyId the primary key of the company
	 * @return the matching acc ins bodies organizations, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AccInsBodiesOrganization>
			getAccInsBodiesOrganizationsByUuidAndCompanyId(
				String uuid, long companyId) {

		return _accInsBodiesOrganizationLocalService.
			getAccInsBodiesOrganizationsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of acc ins bodies organizations matching the UUID and company.
	 *
	 * @param uuid the UUID of the acc ins bodies organizations
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of acc ins bodies organizations
	 * @param end the upper bound of the range of acc ins bodies organizations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching acc ins bodies organizations, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AccInsBodiesOrganization>
			getAccInsBodiesOrganizationsByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.nbp.janaac.application.form.service.model.
						AccInsBodiesOrganization> orderByComparator) {

		return _accInsBodiesOrganizationLocalService.
			getAccInsBodiesOrganizationsByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of acc ins bodies organizations.
	 *
	 * @return the number of acc ins bodies organizations
	 */
	@Override
	public int getAccInsBodiesOrganizationsCount() {
		return _accInsBodiesOrganizationLocalService.
			getAccInsBodiesOrganizationsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _accInsBodiesOrganizationLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _accInsBodiesOrganizationLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _accInsBodiesOrganizationLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public
		com.nbp.janaac.application.form.service.model.AccInsBodiesOrganization
				getJANAAC_ByApplicationId(long janaacApplicationId)
			throws com.nbp.janaac.application.form.service.exception.
				NoSuchAccInsBodiesOrganizationException {

		return _accInsBodiesOrganizationLocalService.getJANAAC_ByApplicationId(
			janaacApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _accInsBodiesOrganizationLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accInsBodiesOrganizationLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the acc ins bodies organization in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccInsBodiesOrganizationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accInsBodiesOrganization the acc ins bodies organization
	 * @return the acc ins bodies organization that was updated
	 */
	@Override
	public
		com.nbp.janaac.application.form.service.model.AccInsBodiesOrganization
			updateAccInsBodiesOrganization(
				com.nbp.janaac.application.form.service.model.
					AccInsBodiesOrganization accInsBodiesOrganization) {

		return _accInsBodiesOrganizationLocalService.
			updateAccInsBodiesOrganization(accInsBodiesOrganization);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _accInsBodiesOrganizationLocalService.getBasePersistence();
	}

	@Override
	public AccInsBodiesOrganizationLocalService getWrappedService() {
		return _accInsBodiesOrganizationLocalService;
	}

	@Override
	public void setWrappedService(
		AccInsBodiesOrganizationLocalService
			accInsBodiesOrganizationLocalService) {

		_accInsBodiesOrganizationLocalService =
			accInsBodiesOrganizationLocalService;
	}

	private AccInsBodiesOrganizationLocalService
		_accInsBodiesOrganizationLocalService;

}