/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.collaboration.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link CannabisCollobartionLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisCollobartionLocalService
 * @generated
 */
public class CannabisCollobartionLocalServiceWrapper
	implements CannabisCollobartionLocalService,
			   ServiceWrapper<CannabisCollobartionLocalService> {

	public CannabisCollobartionLocalServiceWrapper() {
		this(null);
	}

	public CannabisCollobartionLocalServiceWrapper(
		CannabisCollobartionLocalService cannabisCollobartionLocalService) {

		_cannabisCollobartionLocalService = cannabisCollobartionLocalService;
	}

	/**
	 * Adds the cannabis collobartion to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisCollobartionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisCollobartion the cannabis collobartion
	 * @return the cannabis collobartion that was added
	 */
	@Override
	public com.nbp.cannabis.collaboration.services.model.CannabisCollobartion
		addCannabisCollobartion(
			com.nbp.cannabis.collaboration.services.model.CannabisCollobartion
				cannabisCollobartion) {

		return _cannabisCollobartionLocalService.addCannabisCollobartion(
			cannabisCollobartion);
	}

	/**
	 * Creates a new cannabis collobartion with the primary key. Does not add the cannabis collobartion to the database.
	 *
	 * @param cannabisCollaborationId the primary key for the new cannabis collobartion
	 * @return the new cannabis collobartion
	 */
	@Override
	public com.nbp.cannabis.collaboration.services.model.CannabisCollobartion
		createCannabisCollobartion(long cannabisCollaborationId) {

		return _cannabisCollobartionLocalService.createCannabisCollobartion(
			cannabisCollaborationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisCollobartionLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the cannabis collobartion from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisCollobartionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisCollobartion the cannabis collobartion
	 * @return the cannabis collobartion that was removed
	 */
	@Override
	public com.nbp.cannabis.collaboration.services.model.CannabisCollobartion
		deleteCannabisCollobartion(
			com.nbp.cannabis.collaboration.services.model.CannabisCollobartion
				cannabisCollobartion) {

		return _cannabisCollobartionLocalService.deleteCannabisCollobartion(
			cannabisCollobartion);
	}

	/**
	 * Deletes the cannabis collobartion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisCollobartionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisCollaborationId the primary key of the cannabis collobartion
	 * @return the cannabis collobartion that was removed
	 * @throws PortalException if a cannabis collobartion with the primary key could not be found
	 */
	@Override
	public com.nbp.cannabis.collaboration.services.model.CannabisCollobartion
			deleteCannabisCollobartion(long cannabisCollaborationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisCollobartionLocalService.deleteCannabisCollobartion(
			cannabisCollaborationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisCollobartionLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _cannabisCollobartionLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _cannabisCollobartionLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _cannabisCollobartionLocalService.dynamicQuery();
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

		return _cannabisCollobartionLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.collaboration.services.model.impl.CannabisCollobartionModelImpl</code>.
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

		return _cannabisCollobartionLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.collaboration.services.model.impl.CannabisCollobartionModelImpl</code>.
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

		return _cannabisCollobartionLocalService.dynamicQuery(
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

		return _cannabisCollobartionLocalService.dynamicQueryCount(
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

		return _cannabisCollobartionLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.cannabis.collaboration.services.model.CannabisCollobartion
		fetchCannabisCollobartion(long cannabisCollaborationId) {

		return _cannabisCollobartionLocalService.fetchCannabisCollobartion(
			cannabisCollaborationId);
	}

	/**
	 * Returns the cannabis collobartion matching the UUID and group.
	 *
	 * @param uuid the cannabis collobartion's UUID
	 * @param groupId the primary key of the group
	 * @return the matching cannabis collobartion, or <code>null</code> if a matching cannabis collobartion could not be found
	 */
	@Override
	public com.nbp.cannabis.collaboration.services.model.CannabisCollobartion
		fetchCannabisCollobartionByUuidAndGroupId(String uuid, long groupId) {

		return _cannabisCollobartionLocalService.
			fetchCannabisCollobartionByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _cannabisCollobartionLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the cannabis collobartion with the primary key.
	 *
	 * @param cannabisCollaborationId the primary key of the cannabis collobartion
	 * @return the cannabis collobartion
	 * @throws PortalException if a cannabis collobartion with the primary key could not be found
	 */
	@Override
	public com.nbp.cannabis.collaboration.services.model.CannabisCollobartion
			getCannabisCollobartion(long cannabisCollaborationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisCollobartionLocalService.getCannabisCollobartion(
			cannabisCollaborationId);
	}

	/**
	 * Returns the cannabis collobartion matching the UUID and group.
	 *
	 * @param uuid the cannabis collobartion's UUID
	 * @param groupId the primary key of the group
	 * @return the matching cannabis collobartion
	 * @throws PortalException if a matching cannabis collobartion could not be found
	 */
	@Override
	public com.nbp.cannabis.collaboration.services.model.CannabisCollobartion
			getCannabisCollobartionByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisCollobartionLocalService.
			getCannabisCollobartionByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the cannabis collobartions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.collaboration.services.model.impl.CannabisCollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis collobartions
	 * @param end the upper bound of the range of cannabis collobartions (not inclusive)
	 * @return the range of cannabis collobartions
	 */
	@Override
	public java.util.List
		<com.nbp.cannabis.collaboration.services.model.CannabisCollobartion>
			getCannabisCollobartions(int start, int end) {

		return _cannabisCollobartionLocalService.getCannabisCollobartions(
			start, end);
	}

	/**
	 * Returns all the cannabis collobartions matching the UUID and company.
	 *
	 * @param uuid the UUID of the cannabis collobartions
	 * @param companyId the primary key of the company
	 * @return the matching cannabis collobartions, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.cannabis.collaboration.services.model.CannabisCollobartion>
			getCannabisCollobartionsByUuidAndCompanyId(
				String uuid, long companyId) {

		return _cannabisCollobartionLocalService.
			getCannabisCollobartionsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of cannabis collobartions matching the UUID and company.
	 *
	 * @param uuid the UUID of the cannabis collobartions
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of cannabis collobartions
	 * @param end the upper bound of the range of cannabis collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching cannabis collobartions, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.cannabis.collaboration.services.model.CannabisCollobartion>
			getCannabisCollobartionsByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.nbp.cannabis.collaboration.services.model.
						CannabisCollobartion> orderByComparator) {

		return _cannabisCollobartionLocalService.
			getCannabisCollobartionsByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of cannabis collobartions.
	 *
	 * @return the number of cannabis collobartions
	 */
	@Override
	public int getCannabisCollobartionsCount() {
		return _cannabisCollobartionLocalService.
			getCannabisCollobartionsCount();
	}

	@Override
	public java.util.List
		<com.nbp.cannabis.collaboration.services.model.CannabisCollobartion>
			getCollaborationStageCaseIdUserTypeArchived(
				String cannabisStage, String caseId, String userType,
				int archived) {

		return _cannabisCollobartionLocalService.
			getCollaborationStageCaseIdUserTypeArchived(
				cannabisStage, caseId, userType, archived);
	}

	@Override
	public java.util.List
		<com.nbp.cannabis.collaboration.services.model.CannabisCollobartion>
			getCollobartionByCaseId(String caseId) {

		return _cannabisCollobartionLocalService.getCollobartionByCaseId(
			caseId);
	}

	@Override
	public java.util.List
		<com.nbp.cannabis.collaboration.services.model.CannabisCollobartion>
			getCollobartionCannabisStageCaseId(
				String cannabisStage, String caseId) {

		return _cannabisCollobartionLocalService.
			getCollobartionCannabisStageCaseId(cannabisStage, caseId);
	}

	@Override
	public java.util.List
		<com.nbp.cannabis.collaboration.services.model.CannabisCollobartion>
			getCollobartionCannabisStageCaseIdUsertype(
				String cannabisStage, String caseId, String userType) {

		return _cannabisCollobartionLocalService.
			getCollobartionCannabisStageCaseIdUsertype(
				cannabisStage, caseId, userType);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _cannabisCollobartionLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _cannabisCollobartionLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _cannabisCollobartionLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisCollobartionLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the cannabis collobartion in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisCollobartionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisCollobartion the cannabis collobartion
	 * @return the cannabis collobartion that was updated
	 */
	@Override
	public com.nbp.cannabis.collaboration.services.model.CannabisCollobartion
		updateCannabisCollobartion(
			com.nbp.cannabis.collaboration.services.model.CannabisCollobartion
				cannabisCollobartion) {

		return _cannabisCollobartionLocalService.updateCannabisCollobartion(
			cannabisCollobartion);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _cannabisCollobartionLocalService.getBasePersistence();
	}

	@Override
	public CannabisCollobartionLocalService getWrappedService() {
		return _cannabisCollobartionLocalService;
	}

	@Override
	public void setWrappedService(
		CannabisCollobartionLocalService cannabisCollobartionLocalService) {

		_cannabisCollobartionLocalService = cannabisCollobartionLocalService;
	}

	private CannabisCollobartionLocalService _cannabisCollobartionLocalService;

}