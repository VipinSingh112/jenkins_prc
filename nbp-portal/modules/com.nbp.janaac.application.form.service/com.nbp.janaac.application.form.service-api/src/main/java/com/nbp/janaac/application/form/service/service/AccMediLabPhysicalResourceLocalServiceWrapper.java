/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AccMediLabPhysicalResourceLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AccMediLabPhysicalResourceLocalService
 * @generated
 */
public class AccMediLabPhysicalResourceLocalServiceWrapper
	implements AccMediLabPhysicalResourceLocalService,
			   ServiceWrapper<AccMediLabPhysicalResourceLocalService> {

	public AccMediLabPhysicalResourceLocalServiceWrapper() {
		this(null);
	}

	public AccMediLabPhysicalResourceLocalServiceWrapper(
		AccMediLabPhysicalResourceLocalService
			accMediLabPhysicalResourceLocalService) {

		_accMediLabPhysicalResourceLocalService =
			accMediLabPhysicalResourceLocalService;
	}

	/**
	 * Adds the acc medi lab physical resource to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccMediLabPhysicalResourceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accMediLabPhysicalResource the acc medi lab physical resource
	 * @return the acc medi lab physical resource that was added
	 */
	@Override
	public
		com.nbp.janaac.application.form.service.model.AccMediLabPhysicalResource
			addAccMediLabPhysicalResource(
				com.nbp.janaac.application.form.service.model.
					AccMediLabPhysicalResource accMediLabPhysicalResource) {

		return _accMediLabPhysicalResourceLocalService.
			addAccMediLabPhysicalResource(accMediLabPhysicalResource);
	}

	/**
	 * Creates a new acc medi lab physical resource with the primary key. Does not add the acc medi lab physical resource to the database.
	 *
	 * @param accMediLabPhysicalResourceId the primary key for the new acc medi lab physical resource
	 * @return the new acc medi lab physical resource
	 */
	@Override
	public
		com.nbp.janaac.application.form.service.model.AccMediLabPhysicalResource
			createAccMediLabPhysicalResource(
				long accMediLabPhysicalResourceId) {

		return _accMediLabPhysicalResourceLocalService.
			createAccMediLabPhysicalResource(accMediLabPhysicalResourceId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accMediLabPhysicalResourceLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the acc medi lab physical resource from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccMediLabPhysicalResourceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accMediLabPhysicalResource the acc medi lab physical resource
	 * @return the acc medi lab physical resource that was removed
	 */
	@Override
	public
		com.nbp.janaac.application.form.service.model.AccMediLabPhysicalResource
			deleteAccMediLabPhysicalResource(
				com.nbp.janaac.application.form.service.model.
					AccMediLabPhysicalResource accMediLabPhysicalResource) {

		return _accMediLabPhysicalResourceLocalService.
			deleteAccMediLabPhysicalResource(accMediLabPhysicalResource);
	}

	/**
	 * Deletes the acc medi lab physical resource with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccMediLabPhysicalResourceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accMediLabPhysicalResourceId the primary key of the acc medi lab physical resource
	 * @return the acc medi lab physical resource that was removed
	 * @throws PortalException if a acc medi lab physical resource with the primary key could not be found
	 */
	@Override
	public
		com.nbp.janaac.application.form.service.model.AccMediLabPhysicalResource
				deleteAccMediLabPhysicalResource(
					long accMediLabPhysicalResourceId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _accMediLabPhysicalResourceLocalService.
			deleteAccMediLabPhysicalResource(accMediLabPhysicalResourceId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accMediLabPhysicalResourceLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _accMediLabPhysicalResourceLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _accMediLabPhysicalResourceLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _accMediLabPhysicalResourceLocalService.dynamicQuery();
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

		return _accMediLabPhysicalResourceLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccMediLabPhysicalResourceModelImpl</code>.
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

		return _accMediLabPhysicalResourceLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccMediLabPhysicalResourceModelImpl</code>.
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

		return _accMediLabPhysicalResourceLocalService.dynamicQuery(
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

		return _accMediLabPhysicalResourceLocalService.dynamicQueryCount(
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

		return _accMediLabPhysicalResourceLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.janaac.application.form.service.model.AccMediLabPhysicalResource
			fetchAccMediLabPhysicalResource(long accMediLabPhysicalResourceId) {

		return _accMediLabPhysicalResourceLocalService.
			fetchAccMediLabPhysicalResource(accMediLabPhysicalResourceId);
	}

	/**
	 * Returns the acc medi lab physical resource matching the UUID and group.
	 *
	 * @param uuid the acc medi lab physical resource's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acc medi lab physical resource, or <code>null</code> if a matching acc medi lab physical resource could not be found
	 */
	@Override
	public
		com.nbp.janaac.application.form.service.model.AccMediLabPhysicalResource
			fetchAccMediLabPhysicalResourceByUuidAndGroupId(
				String uuid, long groupId) {

		return _accMediLabPhysicalResourceLocalService.
			fetchAccMediLabPhysicalResourceByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns the acc medi lab physical resource with the primary key.
	 *
	 * @param accMediLabPhysicalResourceId the primary key of the acc medi lab physical resource
	 * @return the acc medi lab physical resource
	 * @throws PortalException if a acc medi lab physical resource with the primary key could not be found
	 */
	@Override
	public
		com.nbp.janaac.application.form.service.model.AccMediLabPhysicalResource
				getAccMediLabPhysicalResource(long accMediLabPhysicalResourceId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _accMediLabPhysicalResourceLocalService.
			getAccMediLabPhysicalResource(accMediLabPhysicalResourceId);
	}

	/**
	 * Returns the acc medi lab physical resource matching the UUID and group.
	 *
	 * @param uuid the acc medi lab physical resource's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acc medi lab physical resource
	 * @throws PortalException if a matching acc medi lab physical resource could not be found
	 */
	@Override
	public
		com.nbp.janaac.application.form.service.model.AccMediLabPhysicalResource
				getAccMediLabPhysicalResourceByUuidAndGroupId(
					String uuid, long groupId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _accMediLabPhysicalResourceLocalService.
			getAccMediLabPhysicalResourceByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the acc medi lab physical resources.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccMediLabPhysicalResourceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc medi lab physical resources
	 * @param end the upper bound of the range of acc medi lab physical resources (not inclusive)
	 * @return the range of acc medi lab physical resources
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.
			AccMediLabPhysicalResource> getAccMediLabPhysicalResources(
				int start, int end) {

		return _accMediLabPhysicalResourceLocalService.
			getAccMediLabPhysicalResources(start, end);
	}

	/**
	 * Returns all the acc medi lab physical resources matching the UUID and company.
	 *
	 * @param uuid the UUID of the acc medi lab physical resources
	 * @param companyId the primary key of the company
	 * @return the matching acc medi lab physical resources, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.
			AccMediLabPhysicalResource>
				getAccMediLabPhysicalResourcesByUuidAndCompanyId(
					String uuid, long companyId) {

		return _accMediLabPhysicalResourceLocalService.
			getAccMediLabPhysicalResourcesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of acc medi lab physical resources matching the UUID and company.
	 *
	 * @param uuid the UUID of the acc medi lab physical resources
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of acc medi lab physical resources
	 * @param end the upper bound of the range of acc medi lab physical resources (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching acc medi lab physical resources, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.
			AccMediLabPhysicalResource>
				getAccMediLabPhysicalResourcesByUuidAndCompanyId(
					String uuid, long companyId, int start, int end,
					com.liferay.portal.kernel.util.OrderByComparator
						<com.nbp.janaac.application.form.service.model.
							AccMediLabPhysicalResource> orderByComparator) {

		return _accMediLabPhysicalResourceLocalService.
			getAccMediLabPhysicalResourcesByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of acc medi lab physical resources.
	 *
	 * @return the number of acc medi lab physical resources
	 */
	@Override
	public int getAccMediLabPhysicalResourcesCount() {
		return _accMediLabPhysicalResourceLocalService.
			getAccMediLabPhysicalResourcesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _accMediLabPhysicalResourceLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _accMediLabPhysicalResourceLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _accMediLabPhysicalResourceLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public
		com.nbp.janaac.application.form.service.model.AccMediLabPhysicalResource
				getJANAAC_ByApplicationId(long janaacApplicationId)
			throws com.nbp.janaac.application.form.service.exception.
				NoSuchAccMediLabPhysicalResourceException {

		return _accMediLabPhysicalResourceLocalService.
			getJANAAC_ByApplicationId(janaacApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _accMediLabPhysicalResourceLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accMediLabPhysicalResourceLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the acc medi lab physical resource in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccMediLabPhysicalResourceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accMediLabPhysicalResource the acc medi lab physical resource
	 * @return the acc medi lab physical resource that was updated
	 */
	@Override
	public
		com.nbp.janaac.application.form.service.model.AccMediLabPhysicalResource
			updateAccMediLabPhysicalResource(
				com.nbp.janaac.application.form.service.model.
					AccMediLabPhysicalResource accMediLabPhysicalResource) {

		return _accMediLabPhysicalResourceLocalService.
			updateAccMediLabPhysicalResource(accMediLabPhysicalResource);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _accMediLabPhysicalResourceLocalService.getBasePersistence();
	}

	@Override
	public AccMediLabPhysicalResourceLocalService getWrappedService() {
		return _accMediLabPhysicalResourceLocalService;
	}

	@Override
	public void setWrappedService(
		AccMediLabPhysicalResourceLocalService
			accMediLabPhysicalResourceLocalService) {

		_accMediLabPhysicalResourceLocalService =
			accMediLabPhysicalResourceLocalService;
	}

	private AccMediLabPhysicalResourceLocalService
		_accMediLabPhysicalResourceLocalService;

}