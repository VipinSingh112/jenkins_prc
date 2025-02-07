/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link GeneralDelarationsLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see GeneralDelarationsLocalService
 * @generated
 */
public class GeneralDelarationsLocalServiceWrapper
	implements GeneralDelarationsLocalService,
			   ServiceWrapper<GeneralDelarationsLocalService> {

	public GeneralDelarationsLocalServiceWrapper() {
		this(null);
	}

	public GeneralDelarationsLocalServiceWrapper(
		GeneralDelarationsLocalService generalDelarationsLocalService) {

		_generalDelarationsLocalService = generalDelarationsLocalService;
	}

	/**
	 * Adds the general delarations to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GeneralDelarationsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param generalDelarations the general delarations
	 * @return the general delarations that was added
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.GeneralDelarations
		addGeneralDelarations(
			com.nbp.cannabis.application.form.services.model.GeneralDelarations
				generalDelarations) {

		return _generalDelarationsLocalService.addGeneralDelarations(
			generalDelarations);
	}

	/**
	 * Creates a new general delarations with the primary key. Does not add the general delarations to the database.
	 *
	 * @param generalDeclarationId the primary key for the new general delarations
	 * @return the new general delarations
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.GeneralDelarations
		createGeneralDelarations(long generalDeclarationId) {

		return _generalDelarationsLocalService.createGeneralDelarations(
			generalDeclarationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _generalDelarationsLocalService.createPersistedModel(
			primaryKeyObj);
	}

	@Override
	public void deleteCA_GD_CAI(long cannabisAppicationId) {
		_generalDelarationsLocalService.deleteCA_GD_CAI(cannabisAppicationId);
	}

	/**
	 * Deletes the general delarations from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GeneralDelarationsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param generalDelarations the general delarations
	 * @return the general delarations that was removed
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.GeneralDelarations
		deleteGeneralDelarations(
			com.nbp.cannabis.application.form.services.model.GeneralDelarations
				generalDelarations) {

		return _generalDelarationsLocalService.deleteGeneralDelarations(
			generalDelarations);
	}

	/**
	 * Deletes the general delarations with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GeneralDelarationsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param generalDeclarationId the primary key of the general delarations
	 * @return the general delarations that was removed
	 * @throws PortalException if a general delarations with the primary key could not be found
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.GeneralDelarations
			deleteGeneralDelarations(long generalDeclarationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _generalDelarationsLocalService.deleteGeneralDelarations(
			generalDeclarationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _generalDelarationsLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _generalDelarationsLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _generalDelarationsLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _generalDelarationsLocalService.dynamicQuery();
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

		return _generalDelarationsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.GeneralDelarationsModelImpl</code>.
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

		return _generalDelarationsLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.GeneralDelarationsModelImpl</code>.
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

		return _generalDelarationsLocalService.dynamicQuery(
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

		return _generalDelarationsLocalService.dynamicQueryCount(dynamicQuery);
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

		return _generalDelarationsLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.cannabis.application.form.services.model.GeneralDelarations
		fetchGeneralDelarations(long generalDeclarationId) {

		return _generalDelarationsLocalService.fetchGeneralDelarations(
			generalDeclarationId);
	}

	/**
	 * Returns the general delarations matching the UUID and group.
	 *
	 * @param uuid the general delarations's UUID
	 * @param groupId the primary key of the group
	 * @return the matching general delarations, or <code>null</code> if a matching general delarations could not be found
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.GeneralDelarations
		fetchGeneralDelarationsByUuidAndGroupId(String uuid, long groupId) {

		return _generalDelarationsLocalService.
			fetchGeneralDelarationsByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _generalDelarationsLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.cannabis.application.form.services.model.GeneralDelarations>
			getCA_GD_CAI(long cannabisAppicationId) {

		return _generalDelarationsLocalService.getCA_GD_CAI(
			cannabisAppicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _generalDelarationsLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	/**
	 * Returns the general delarations with the primary key.
	 *
	 * @param generalDeclarationId the primary key of the general delarations
	 * @return the general delarations
	 * @throws PortalException if a general delarations with the primary key could not be found
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.GeneralDelarations
			getGeneralDelarations(long generalDeclarationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _generalDelarationsLocalService.getGeneralDelarations(
			generalDeclarationId);
	}

	/**
	 * Returns the general delarations matching the UUID and group.
	 *
	 * @param uuid the general delarations's UUID
	 * @param groupId the primary key of the group
	 * @return the matching general delarations
	 * @throws PortalException if a matching general delarations could not be found
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.GeneralDelarations
			getGeneralDelarationsByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _generalDelarationsLocalService.
			getGeneralDelarationsByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the general delarationses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.GeneralDelarationsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of general delarationses
	 * @param end the upper bound of the range of general delarationses (not inclusive)
	 * @return the range of general delarationses
	 */
	@Override
	public java.util.List
		<com.nbp.cannabis.application.form.services.model.GeneralDelarations>
			getGeneralDelarationses(int start, int end) {

		return _generalDelarationsLocalService.getGeneralDelarationses(
			start, end);
	}

	/**
	 * Returns all the general delarationses matching the UUID and company.
	 *
	 * @param uuid the UUID of the general delarationses
	 * @param companyId the primary key of the company
	 * @return the matching general delarationses, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.cannabis.application.form.services.model.GeneralDelarations>
			getGeneralDelarationsesByUuidAndCompanyId(
				String uuid, long companyId) {

		return _generalDelarationsLocalService.
			getGeneralDelarationsesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of general delarationses matching the UUID and company.
	 *
	 * @param uuid the UUID of the general delarationses
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of general delarationses
	 * @param end the upper bound of the range of general delarationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching general delarationses, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.cannabis.application.form.services.model.GeneralDelarations>
			getGeneralDelarationsesByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.nbp.cannabis.application.form.services.model.
						GeneralDelarations> orderByComparator) {

		return _generalDelarationsLocalService.
			getGeneralDelarationsesByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of general delarationses.
	 *
	 * @return the number of general delarationses
	 */
	@Override
	public int getGeneralDelarationsesCount() {
		return _generalDelarationsLocalService.getGeneralDelarationsesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _generalDelarationsLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _generalDelarationsLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _generalDelarationsLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the general delarations in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GeneralDelarationsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param generalDelarations the general delarations
	 * @return the general delarations that was updated
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.GeneralDelarations
		updateGeneralDelarations(
			com.nbp.cannabis.application.form.services.model.GeneralDelarations
				generalDelarations) {

		return _generalDelarationsLocalService.updateGeneralDelarations(
			generalDelarations);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _generalDelarationsLocalService.getBasePersistence();
	}

	@Override
	public GeneralDelarationsLocalService getWrappedService() {
		return _generalDelarationsLocalService;
	}

	@Override
	public void setWrappedService(
		GeneralDelarationsLocalService generalDelarationsLocalService) {

		_generalDelarationsLocalService = generalDelarationsLocalService;
	}

	private GeneralDelarationsLocalService _generalDelarationsLocalService;

}