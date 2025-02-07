/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.collaboration.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link CollobartionLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CollobartionLocalService
 * @generated
 */
public class CollobartionLocalServiceWrapper
	implements CollobartionLocalService,
			   ServiceWrapper<CollobartionLocalService> {

	public CollobartionLocalServiceWrapper() {
		this(null);
	}

	public CollobartionLocalServiceWrapper(
		CollobartionLocalService collobartionLocalService) {

		_collobartionLocalService = collobartionLocalService;
	}

	/**
	 * Adds the collobartion to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CollobartionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param collobartion the collobartion
	 * @return the collobartion that was added
	 */
	@Override
	public com.nbp.collaboration.services.model.Collobartion addCollobartion(
		com.nbp.collaboration.services.model.Collobartion collobartion) {

		return _collobartionLocalService.addCollobartion(collobartion);
	}

	/**
	 * Creates a new collobartion with the primary key. Does not add the collobartion to the database.
	 *
	 * @param collaborationId the primary key for the new collobartion
	 * @return the new collobartion
	 */
	@Override
	public com.nbp.collaboration.services.model.Collobartion createCollobartion(
		long collaborationId) {

		return _collobartionLocalService.createCollobartion(collaborationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _collobartionLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the collobartion from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CollobartionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param collobartion the collobartion
	 * @return the collobartion that was removed
	 */
	@Override
	public com.nbp.collaboration.services.model.Collobartion deleteCollobartion(
		com.nbp.collaboration.services.model.Collobartion collobartion) {

		return _collobartionLocalService.deleteCollobartion(collobartion);
	}

	/**
	 * Deletes the collobartion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CollobartionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param collaborationId the primary key of the collobartion
	 * @return the collobartion that was removed
	 * @throws PortalException if a collobartion with the primary key could not be found
	 */
	@Override
	public com.nbp.collaboration.services.model.Collobartion deleteCollobartion(
			long collaborationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _collobartionLocalService.deleteCollobartion(collaborationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _collobartionLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _collobartionLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _collobartionLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _collobartionLocalService.dynamicQuery();
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

		return _collobartionLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.collaboration.services.model.impl.CollobartionModelImpl</code>.
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

		return _collobartionLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.collaboration.services.model.impl.CollobartionModelImpl</code>.
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

		return _collobartionLocalService.dynamicQuery(
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

		return _collobartionLocalService.dynamicQueryCount(dynamicQuery);
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

		return _collobartionLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.collaboration.services.model.Collobartion fetchCollobartion(
		long collaborationId) {

		return _collobartionLocalService.fetchCollobartion(collaborationId);
	}

	/**
	 * Returns the collobartion matching the UUID and group.
	 *
	 * @param uuid the collobartion's UUID
	 * @param groupId the primary key of the group
	 * @return the matching collobartion, or <code>null</code> if a matching collobartion could not be found
	 */
	@Override
	public com.nbp.collaboration.services.model.Collobartion
		fetchCollobartionByUuidAndGroupId(String uuid, long groupId) {

		return _collobartionLocalService.fetchCollobartionByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _collobartionLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List<com.nbp.collaboration.services.model.Collobartion>
		getCollaborationStageCaseIdUserTypeArchived(
			String stageName, String caseId, String userType, int archived) {

		return _collobartionLocalService.
			getCollaborationStageCaseIdUserTypeArchived(
				stageName, caseId, userType, archived);
	}

	/**
	 * Returns the collobartion with the primary key.
	 *
	 * @param collaborationId the primary key of the collobartion
	 * @return the collobartion
	 * @throws PortalException if a collobartion with the primary key could not be found
	 */
	@Override
	public com.nbp.collaboration.services.model.Collobartion getCollobartion(
			long collaborationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _collobartionLocalService.getCollobartion(collaborationId);
	}

	@Override
	public java.util.List<com.nbp.collaboration.services.model.Collobartion>
		getCollobartionByCaseId(String caseId) {

		return _collobartionLocalService.getCollobartionByCaseId(caseId);
	}

	/**
	 * Returns the collobartion matching the UUID and group.
	 *
	 * @param uuid the collobartion's UUID
	 * @param groupId the primary key of the group
	 * @return the matching collobartion
	 * @throws PortalException if a matching collobartion could not be found
	 */
	@Override
	public com.nbp.collaboration.services.model.Collobartion
			getCollobartionByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _collobartionLocalService.getCollobartionByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the collobartions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.collaboration.services.model.impl.CollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of collobartions
	 * @param end the upper bound of the range of collobartions (not inclusive)
	 * @return the range of collobartions
	 */
	@Override
	public java.util.List<com.nbp.collaboration.services.model.Collobartion>
		getCollobartions(int start, int end) {

		return _collobartionLocalService.getCollobartions(start, end);
	}

	/**
	 * Returns all the collobartions matching the UUID and company.
	 *
	 * @param uuid the UUID of the collobartions
	 * @param companyId the primary key of the company
	 * @return the matching collobartions, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.nbp.collaboration.services.model.Collobartion>
		getCollobartionsByUuidAndCompanyId(String uuid, long companyId) {

		return _collobartionLocalService.getCollobartionsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of collobartions matching the UUID and company.
	 *
	 * @param uuid the UUID of the collobartions
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of collobartions
	 * @param end the upper bound of the range of collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching collobartions, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.nbp.collaboration.services.model.Collobartion>
		getCollobartionsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.nbp.collaboration.services.model.Collobartion>
					orderByComparator) {

		return _collobartionLocalService.getCollobartionsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of collobartions.
	 *
	 * @return the number of collobartions
	 */
	@Override
	public int getCollobartionsCount() {
		return _collobartionLocalService.getCollobartionsCount();
	}

	@Override
	public java.util.List<com.nbp.collaboration.services.model.Collobartion>
		getCollobartionStageNameCaseId(String stageName, String caseId) {

		return _collobartionLocalService.getCollobartionStageNameCaseId(
			stageName, caseId);
	}

	@Override
	public java.util.List<com.nbp.collaboration.services.model.Collobartion>
		getCollobartionStageNameCaseIdUsertype(
			String stageName, String caseId, String userType) {

		return _collobartionLocalService.getCollobartionStageNameCaseIdUsertype(
			stageName, caseId, userType);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _collobartionLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _collobartionLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _collobartionLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _collobartionLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the collobartion in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CollobartionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param collobartion the collobartion
	 * @return the collobartion that was updated
	 */
	@Override
	public com.nbp.collaboration.services.model.Collobartion updateCollobartion(
		com.nbp.collaboration.services.model.Collobartion collobartion) {

		return _collobartionLocalService.updateCollobartion(collobartion);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _collobartionLocalService.getBasePersistence();
	}

	@Override
	public CollobartionLocalService getWrappedService() {
		return _collobartionLocalService;
	}

	@Override
	public void setWrappedService(
		CollobartionLocalService collobartionLocalService) {

		_collobartionLocalService = collobartionLocalService;
	}

	private CollobartionLocalService _collobartionLocalService;

}