/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link CannabisConsentByPropertyOwnerLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisConsentByPropertyOwnerLocalService
 * @generated
 */
public class CannabisConsentByPropertyOwnerLocalServiceWrapper
	implements CannabisConsentByPropertyOwnerLocalService,
			   ServiceWrapper<CannabisConsentByPropertyOwnerLocalService> {

	public CannabisConsentByPropertyOwnerLocalServiceWrapper() {
		this(null);
	}

	public CannabisConsentByPropertyOwnerLocalServiceWrapper(
		CannabisConsentByPropertyOwnerLocalService
			cannabisConsentByPropertyOwnerLocalService) {

		_cannabisConsentByPropertyOwnerLocalService =
			cannabisConsentByPropertyOwnerLocalService;
	}

	/**
	 * Adds the cannabis consent by property owner to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisConsentByPropertyOwnerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisConsentByPropertyOwner the cannabis consent by property owner
	 * @return the cannabis consent by property owner that was added
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisConsentByPropertyOwner addCannabisConsentByPropertyOwner(
			com.nbp.cannabis.application.form.services.model.
				CannabisConsentByPropertyOwner cannabisConsentByPropertyOwner) {

		return _cannabisConsentByPropertyOwnerLocalService.
			addCannabisConsentByPropertyOwner(cannabisConsentByPropertyOwner);
	}

	/**
	 * Creates a new cannabis consent by property owner with the primary key. Does not add the cannabis consent by property owner to the database.
	 *
	 * @param cannabisCPOId the primary key for the new cannabis consent by property owner
	 * @return the new cannabis consent by property owner
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisConsentByPropertyOwner createCannabisConsentByPropertyOwner(
			long cannabisCPOId) {

		return _cannabisConsentByPropertyOwnerLocalService.
			createCannabisConsentByPropertyOwner(cannabisCPOId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisConsentByPropertyOwnerLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the cannabis consent by property owner from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisConsentByPropertyOwnerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisConsentByPropertyOwner the cannabis consent by property owner
	 * @return the cannabis consent by property owner that was removed
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisConsentByPropertyOwner deleteCannabisConsentByPropertyOwner(
			com.nbp.cannabis.application.form.services.model.
				CannabisConsentByPropertyOwner cannabisConsentByPropertyOwner) {

		return _cannabisConsentByPropertyOwnerLocalService.
			deleteCannabisConsentByPropertyOwner(
				cannabisConsentByPropertyOwner);
	}

	/**
	 * Deletes the cannabis consent by property owner with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisConsentByPropertyOwnerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisCPOId the primary key of the cannabis consent by property owner
	 * @return the cannabis consent by property owner that was removed
	 * @throws PortalException if a cannabis consent by property owner with the primary key could not be found
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisConsentByPropertyOwner deleteCannabisConsentByPropertyOwner(
				long cannabisCPOId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisConsentByPropertyOwnerLocalService.
			deleteCannabisConsentByPropertyOwner(cannabisCPOId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisConsentByPropertyOwnerLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _cannabisConsentByPropertyOwnerLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _cannabisConsentByPropertyOwnerLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _cannabisConsentByPropertyOwnerLocalService.dynamicQuery();
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

		return _cannabisConsentByPropertyOwnerLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.CannabisConsentByPropertyOwnerModelImpl</code>.
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

		return _cannabisConsentByPropertyOwnerLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.CannabisConsentByPropertyOwnerModelImpl</code>.
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

		return _cannabisConsentByPropertyOwnerLocalService.dynamicQuery(
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

		return _cannabisConsentByPropertyOwnerLocalService.dynamicQueryCount(
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

		return _cannabisConsentByPropertyOwnerLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisConsentByPropertyOwner fetchCannabisConsentByPropertyOwner(
			long cannabisCPOId) {

		return _cannabisConsentByPropertyOwnerLocalService.
			fetchCannabisConsentByPropertyOwner(cannabisCPOId);
	}

	/**
	 * Returns the cannabis consent by property owner matching the UUID and group.
	 *
	 * @param uuid the cannabis consent by property owner's UUID
	 * @param groupId the primary key of the group
	 * @return the matching cannabis consent by property owner, or <code>null</code> if a matching cannabis consent by property owner could not be found
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisConsentByPropertyOwner
			fetchCannabisConsentByPropertyOwnerByUuidAndGroupId(
				String uuid, long groupId) {

		return _cannabisConsentByPropertyOwnerLocalService.
			fetchCannabisConsentByPropertyOwnerByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _cannabisConsentByPropertyOwnerLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisConsentByPropertyOwner getCA_CPO_CAI(
			long cannabisAppicationId) {

		return _cannabisConsentByPropertyOwnerLocalService.getCA_CPO_CAI(
			cannabisAppicationId);
	}

	/**
	 * Returns the cannabis consent by property owner with the primary key.
	 *
	 * @param cannabisCPOId the primary key of the cannabis consent by property owner
	 * @return the cannabis consent by property owner
	 * @throws PortalException if a cannabis consent by property owner with the primary key could not be found
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisConsentByPropertyOwner getCannabisConsentByPropertyOwner(
				long cannabisCPOId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisConsentByPropertyOwnerLocalService.
			getCannabisConsentByPropertyOwner(cannabisCPOId);
	}

	/**
	 * Returns the cannabis consent by property owner matching the UUID and group.
	 *
	 * @param uuid the cannabis consent by property owner's UUID
	 * @param groupId the primary key of the group
	 * @return the matching cannabis consent by property owner
	 * @throws PortalException if a matching cannabis consent by property owner could not be found
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisConsentByPropertyOwner
				getCannabisConsentByPropertyOwnerByUuidAndGroupId(
					String uuid, long groupId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisConsentByPropertyOwnerLocalService.
			getCannabisConsentByPropertyOwnerByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the cannabis consent by property owners.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.CannabisConsentByPropertyOwnerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis consent by property owners
	 * @param end the upper bound of the range of cannabis consent by property owners (not inclusive)
	 * @return the range of cannabis consent by property owners
	 */
	@Override
	public java.util.List
		<com.nbp.cannabis.application.form.services.model.
			CannabisConsentByPropertyOwner> getCannabisConsentByPropertyOwners(
				int start, int end) {

		return _cannabisConsentByPropertyOwnerLocalService.
			getCannabisConsentByPropertyOwners(start, end);
	}

	/**
	 * Returns all the cannabis consent by property owners matching the UUID and company.
	 *
	 * @param uuid the UUID of the cannabis consent by property owners
	 * @param companyId the primary key of the company
	 * @return the matching cannabis consent by property owners, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.cannabis.application.form.services.model.
			CannabisConsentByPropertyOwner>
				getCannabisConsentByPropertyOwnersByUuidAndCompanyId(
					String uuid, long companyId) {

		return _cannabisConsentByPropertyOwnerLocalService.
			getCannabisConsentByPropertyOwnersByUuidAndCompanyId(
				uuid, companyId);
	}

	/**
	 * Returns a range of cannabis consent by property owners matching the UUID and company.
	 *
	 * @param uuid the UUID of the cannabis consent by property owners
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of cannabis consent by property owners
	 * @param end the upper bound of the range of cannabis consent by property owners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching cannabis consent by property owners, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.cannabis.application.form.services.model.
			CannabisConsentByPropertyOwner>
				getCannabisConsentByPropertyOwnersByUuidAndCompanyId(
					String uuid, long companyId, int start, int end,
					com.liferay.portal.kernel.util.OrderByComparator
						<com.nbp.cannabis.application.form.services.model.
							CannabisConsentByPropertyOwner> orderByComparator) {

		return _cannabisConsentByPropertyOwnerLocalService.
			getCannabisConsentByPropertyOwnersByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of cannabis consent by property owners.
	 *
	 * @return the number of cannabis consent by property owners
	 */
	@Override
	public int getCannabisConsentByPropertyOwnersCount() {
		return _cannabisConsentByPropertyOwnerLocalService.
			getCannabisConsentByPropertyOwnersCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _cannabisConsentByPropertyOwnerLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _cannabisConsentByPropertyOwnerLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _cannabisConsentByPropertyOwnerLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisConsentByPropertyOwnerLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the cannabis consent by property owner in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisConsentByPropertyOwnerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisConsentByPropertyOwner the cannabis consent by property owner
	 * @return the cannabis consent by property owner that was updated
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisConsentByPropertyOwner updateCannabisConsentByPropertyOwner(
			com.nbp.cannabis.application.form.services.model.
				CannabisConsentByPropertyOwner cannabisConsentByPropertyOwner) {

		return _cannabisConsentByPropertyOwnerLocalService.
			updateCannabisConsentByPropertyOwner(
				cannabisConsentByPropertyOwner);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _cannabisConsentByPropertyOwnerLocalService.getBasePersistence();
	}

	@Override
	public CannabisConsentByPropertyOwnerLocalService getWrappedService() {
		return _cannabisConsentByPropertyOwnerLocalService;
	}

	@Override
	public void setWrappedService(
		CannabisConsentByPropertyOwnerLocalService
			cannabisConsentByPropertyOwnerLocalService) {

		_cannabisConsentByPropertyOwnerLocalService =
			cannabisConsentByPropertyOwnerLocalService;
	}

	private CannabisConsentByPropertyOwnerLocalService
		_cannabisConsentByPropertyOwnerLocalService;

}