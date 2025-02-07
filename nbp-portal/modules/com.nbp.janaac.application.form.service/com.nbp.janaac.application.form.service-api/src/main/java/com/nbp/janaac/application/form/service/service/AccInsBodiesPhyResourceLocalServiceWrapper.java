/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AccInsBodiesPhyResourceLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AccInsBodiesPhyResourceLocalService
 * @generated
 */
public class AccInsBodiesPhyResourceLocalServiceWrapper
	implements AccInsBodiesPhyResourceLocalService,
			   ServiceWrapper<AccInsBodiesPhyResourceLocalService> {

	public AccInsBodiesPhyResourceLocalServiceWrapper() {
		this(null);
	}

	public AccInsBodiesPhyResourceLocalServiceWrapper(
		AccInsBodiesPhyResourceLocalService
			accInsBodiesPhyResourceLocalService) {

		_accInsBodiesPhyResourceLocalService =
			accInsBodiesPhyResourceLocalService;
	}

	/**
	 * Adds the acc ins bodies phy resource to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccInsBodiesPhyResourceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accInsBodiesPhyResource the acc ins bodies phy resource
	 * @return the acc ins bodies phy resource that was added
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccInsBodiesPhyResource
		addAccInsBodiesPhyResource(
			com.nbp.janaac.application.form.service.model.
				AccInsBodiesPhyResource accInsBodiesPhyResource) {

		return _accInsBodiesPhyResourceLocalService.addAccInsBodiesPhyResource(
			accInsBodiesPhyResource);
	}

	/**
	 * Creates a new acc ins bodies phy resource with the primary key. Does not add the acc ins bodies phy resource to the database.
	 *
	 * @param accInsBodiesPhyResourceId the primary key for the new acc ins bodies phy resource
	 * @return the new acc ins bodies phy resource
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccInsBodiesPhyResource
		createAccInsBodiesPhyResource(long accInsBodiesPhyResourceId) {

		return _accInsBodiesPhyResourceLocalService.
			createAccInsBodiesPhyResource(accInsBodiesPhyResourceId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accInsBodiesPhyResourceLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the acc ins bodies phy resource from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccInsBodiesPhyResourceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accInsBodiesPhyResource the acc ins bodies phy resource
	 * @return the acc ins bodies phy resource that was removed
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccInsBodiesPhyResource
		deleteAccInsBodiesPhyResource(
			com.nbp.janaac.application.form.service.model.
				AccInsBodiesPhyResource accInsBodiesPhyResource) {

		return _accInsBodiesPhyResourceLocalService.
			deleteAccInsBodiesPhyResource(accInsBodiesPhyResource);
	}

	/**
	 * Deletes the acc ins bodies phy resource with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccInsBodiesPhyResourceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accInsBodiesPhyResourceId the primary key of the acc ins bodies phy resource
	 * @return the acc ins bodies phy resource that was removed
	 * @throws PortalException if a acc ins bodies phy resource with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccInsBodiesPhyResource
			deleteAccInsBodiesPhyResource(long accInsBodiesPhyResourceId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accInsBodiesPhyResourceLocalService.
			deleteAccInsBodiesPhyResource(accInsBodiesPhyResourceId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accInsBodiesPhyResourceLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _accInsBodiesPhyResourceLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _accInsBodiesPhyResourceLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _accInsBodiesPhyResourceLocalService.dynamicQuery();
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

		return _accInsBodiesPhyResourceLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccInsBodiesPhyResourceModelImpl</code>.
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

		return _accInsBodiesPhyResourceLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccInsBodiesPhyResourceModelImpl</code>.
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

		return _accInsBodiesPhyResourceLocalService.dynamicQuery(
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

		return _accInsBodiesPhyResourceLocalService.dynamicQueryCount(
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

		return _accInsBodiesPhyResourceLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.janaac.application.form.service.model.AccInsBodiesPhyResource
		fetchAccInsBodiesPhyResource(long accInsBodiesPhyResourceId) {

		return _accInsBodiesPhyResourceLocalService.
			fetchAccInsBodiesPhyResource(accInsBodiesPhyResourceId);
	}

	/**
	 * Returns the acc ins bodies phy resource matching the UUID and group.
	 *
	 * @param uuid the acc ins bodies phy resource's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acc ins bodies phy resource, or <code>null</code> if a matching acc ins bodies phy resource could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccInsBodiesPhyResource
		fetchAccInsBodiesPhyResourceByUuidAndGroupId(
			String uuid, long groupId) {

		return _accInsBodiesPhyResourceLocalService.
			fetchAccInsBodiesPhyResourceByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns the acc ins bodies phy resource with the primary key.
	 *
	 * @param accInsBodiesPhyResourceId the primary key of the acc ins bodies phy resource
	 * @return the acc ins bodies phy resource
	 * @throws PortalException if a acc ins bodies phy resource with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccInsBodiesPhyResource
			getAccInsBodiesPhyResource(long accInsBodiesPhyResourceId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accInsBodiesPhyResourceLocalService.getAccInsBodiesPhyResource(
			accInsBodiesPhyResourceId);
	}

	/**
	 * Returns the acc ins bodies phy resource matching the UUID and group.
	 *
	 * @param uuid the acc ins bodies phy resource's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acc ins bodies phy resource
	 * @throws PortalException if a matching acc ins bodies phy resource could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccInsBodiesPhyResource
			getAccInsBodiesPhyResourceByUuidAndGroupId(
				String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accInsBodiesPhyResourceLocalService.
			getAccInsBodiesPhyResourceByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the acc ins bodies phy resources.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccInsBodiesPhyResourceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc ins bodies phy resources
	 * @param end the upper bound of the range of acc ins bodies phy resources (not inclusive)
	 * @return the range of acc ins bodies phy resources
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AccInsBodiesPhyResource>
			getAccInsBodiesPhyResources(int start, int end) {

		return _accInsBodiesPhyResourceLocalService.getAccInsBodiesPhyResources(
			start, end);
	}

	/**
	 * Returns all the acc ins bodies phy resources matching the UUID and company.
	 *
	 * @param uuid the UUID of the acc ins bodies phy resources
	 * @param companyId the primary key of the company
	 * @return the matching acc ins bodies phy resources, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AccInsBodiesPhyResource>
			getAccInsBodiesPhyResourcesByUuidAndCompanyId(
				String uuid, long companyId) {

		return _accInsBodiesPhyResourceLocalService.
			getAccInsBodiesPhyResourcesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of acc ins bodies phy resources matching the UUID and company.
	 *
	 * @param uuid the UUID of the acc ins bodies phy resources
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of acc ins bodies phy resources
	 * @param end the upper bound of the range of acc ins bodies phy resources (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching acc ins bodies phy resources, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AccInsBodiesPhyResource>
			getAccInsBodiesPhyResourcesByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.nbp.janaac.application.form.service.model.
						AccInsBodiesPhyResource> orderByComparator) {

		return _accInsBodiesPhyResourceLocalService.
			getAccInsBodiesPhyResourcesByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of acc ins bodies phy resources.
	 *
	 * @return the number of acc ins bodies phy resources
	 */
	@Override
	public int getAccInsBodiesPhyResourcesCount() {
		return _accInsBodiesPhyResourceLocalService.
			getAccInsBodiesPhyResourcesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _accInsBodiesPhyResourceLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _accInsBodiesPhyResourceLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _accInsBodiesPhyResourceLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.janaac.application.form.service.model.AccInsBodiesPhyResource
			getJANAAC_ByApplicationId(long janaacApplicationId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccInsBodiesPhyResourceException {

		return _accInsBodiesPhyResourceLocalService.getJANAAC_ByApplicationId(
			janaacApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _accInsBodiesPhyResourceLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accInsBodiesPhyResourceLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the acc ins bodies phy resource in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccInsBodiesPhyResourceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accInsBodiesPhyResource the acc ins bodies phy resource
	 * @return the acc ins bodies phy resource that was updated
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccInsBodiesPhyResource
		updateAccInsBodiesPhyResource(
			com.nbp.janaac.application.form.service.model.
				AccInsBodiesPhyResource accInsBodiesPhyResource) {

		return _accInsBodiesPhyResourceLocalService.
			updateAccInsBodiesPhyResource(accInsBodiesPhyResource);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _accInsBodiesPhyResourceLocalService.getBasePersistence();
	}

	@Override
	public AccInsBodiesPhyResourceLocalService getWrappedService() {
		return _accInsBodiesPhyResourceLocalService;
	}

	@Override
	public void setWrappedService(
		AccInsBodiesPhyResourceLocalService
			accInsBodiesPhyResourceLocalService) {

		_accInsBodiesPhyResourceLocalService =
			accInsBodiesPhyResourceLocalService;
	}

	private AccInsBodiesPhyResourceLocalService
		_accInsBodiesPhyResourceLocalService;

}