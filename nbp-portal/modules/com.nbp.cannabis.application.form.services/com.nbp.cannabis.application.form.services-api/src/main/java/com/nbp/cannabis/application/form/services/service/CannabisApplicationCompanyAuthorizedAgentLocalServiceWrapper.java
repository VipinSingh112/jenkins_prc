/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link CannabisApplicationCompanyAuthorizedAgentLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisApplicationCompanyAuthorizedAgentLocalService
 * @generated
 */
public class CannabisApplicationCompanyAuthorizedAgentLocalServiceWrapper
	implements CannabisApplicationCompanyAuthorizedAgentLocalService,
			   ServiceWrapper
				   <CannabisApplicationCompanyAuthorizedAgentLocalService> {

	public CannabisApplicationCompanyAuthorizedAgentLocalServiceWrapper() {
		this(null);
	}

	public CannabisApplicationCompanyAuthorizedAgentLocalServiceWrapper(
		CannabisApplicationCompanyAuthorizedAgentLocalService
			cannabisApplicationCompanyAuthorizedAgentLocalService) {

		_cannabisApplicationCompanyAuthorizedAgentLocalService =
			cannabisApplicationCompanyAuthorizedAgentLocalService;
	}

	/**
	 * Adds the cannabis application company authorized agent to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationCompanyAuthorizedAgentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisApplicationCompanyAuthorizedAgent the cannabis application company authorized agent
	 * @return the cannabis application company authorized agent that was added
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisApplicationCompanyAuthorizedAgent
			addCannabisApplicationCompanyAuthorizedAgent(
				com.nbp.cannabis.application.form.services.model.
					CannabisApplicationCompanyAuthorizedAgent
						cannabisApplicationCompanyAuthorizedAgent) {

		return _cannabisApplicationCompanyAuthorizedAgentLocalService.
			addCannabisApplicationCompanyAuthorizedAgent(
				cannabisApplicationCompanyAuthorizedAgent);
	}

	/**
	 * Creates a new cannabis application company authorized agent with the primary key. Does not add the cannabis application company authorized agent to the database.
	 *
	 * @param cannabisCOAId the primary key for the new cannabis application company authorized agent
	 * @return the new cannabis application company authorized agent
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisApplicationCompanyAuthorizedAgent
			createCannabisApplicationCompanyAuthorizedAgent(
				long cannabisCOAId) {

		return _cannabisApplicationCompanyAuthorizedAgentLocalService.
			createCannabisApplicationCompanyAuthorizedAgent(cannabisCOAId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisApplicationCompanyAuthorizedAgentLocalService.
			createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the cannabis application company authorized agent from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationCompanyAuthorizedAgentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisApplicationCompanyAuthorizedAgent the cannabis application company authorized agent
	 * @return the cannabis application company authorized agent that was removed
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisApplicationCompanyAuthorizedAgent
			deleteCannabisApplicationCompanyAuthorizedAgent(
				com.nbp.cannabis.application.form.services.model.
					CannabisApplicationCompanyAuthorizedAgent
						cannabisApplicationCompanyAuthorizedAgent) {

		return _cannabisApplicationCompanyAuthorizedAgentLocalService.
			deleteCannabisApplicationCompanyAuthorizedAgent(
				cannabisApplicationCompanyAuthorizedAgent);
	}

	/**
	 * Deletes the cannabis application company authorized agent with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationCompanyAuthorizedAgentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisCOAId the primary key of the cannabis application company authorized agent
	 * @return the cannabis application company authorized agent that was removed
	 * @throws PortalException if a cannabis application company authorized agent with the primary key could not be found
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisApplicationCompanyAuthorizedAgent
				deleteCannabisApplicationCompanyAuthorizedAgent(
					long cannabisCOAId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisApplicationCompanyAuthorizedAgentLocalService.
			deleteCannabisApplicationCompanyAuthorizedAgent(cannabisCOAId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisApplicationCompanyAuthorizedAgentLocalService.
			deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _cannabisApplicationCompanyAuthorizedAgentLocalService.dslQuery(
			dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _cannabisApplicationCompanyAuthorizedAgentLocalService.
			dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _cannabisApplicationCompanyAuthorizedAgentLocalService.
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

		return _cannabisApplicationCompanyAuthorizedAgentLocalService.
			dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.CannabisApplicationCompanyAuthorizedAgentModelImpl</code>.
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

		return _cannabisApplicationCompanyAuthorizedAgentLocalService.
			dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.CannabisApplicationCompanyAuthorizedAgentModelImpl</code>.
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

		return _cannabisApplicationCompanyAuthorizedAgentLocalService.
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

		return _cannabisApplicationCompanyAuthorizedAgentLocalService.
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

		return _cannabisApplicationCompanyAuthorizedAgentLocalService.
			dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisApplicationCompanyAuthorizedAgent
			fetchCannabisApplicationCompanyAuthorizedAgent(long cannabisCOAId) {

		return _cannabisApplicationCompanyAuthorizedAgentLocalService.
			fetchCannabisApplicationCompanyAuthorizedAgent(cannabisCOAId);
	}

	/**
	 * Returns the cannabis application company authorized agent matching the UUID and group.
	 *
	 * @param uuid the cannabis application company authorized agent's UUID
	 * @param groupId the primary key of the group
	 * @return the matching cannabis application company authorized agent, or <code>null</code> if a matching cannabis application company authorized agent could not be found
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisApplicationCompanyAuthorizedAgent
			fetchCannabisApplicationCompanyAuthorizedAgentByUuidAndGroupId(
				String uuid, long groupId) {

		return _cannabisApplicationCompanyAuthorizedAgentLocalService.
			fetchCannabisApplicationCompanyAuthorizedAgentByUuidAndGroupId(
				uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _cannabisApplicationCompanyAuthorizedAgentLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisApplicationCompanyAuthorizedAgent getCAA_by_CAI(
			long cannabisAppicationId) {

		return _cannabisApplicationCompanyAuthorizedAgentLocalService.
			getCAA_by_CAI(cannabisAppicationId);
	}

	/**
	 * Returns the cannabis application company authorized agent with the primary key.
	 *
	 * @param cannabisCOAId the primary key of the cannabis application company authorized agent
	 * @return the cannabis application company authorized agent
	 * @throws PortalException if a cannabis application company authorized agent with the primary key could not be found
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisApplicationCompanyAuthorizedAgent
				getCannabisApplicationCompanyAuthorizedAgent(long cannabisCOAId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisApplicationCompanyAuthorizedAgentLocalService.
			getCannabisApplicationCompanyAuthorizedAgent(cannabisCOAId);
	}

	/**
	 * Returns the cannabis application company authorized agent matching the UUID and group.
	 *
	 * @param uuid the cannabis application company authorized agent's UUID
	 * @param groupId the primary key of the group
	 * @return the matching cannabis application company authorized agent
	 * @throws PortalException if a matching cannabis application company authorized agent could not be found
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisApplicationCompanyAuthorizedAgent
				getCannabisApplicationCompanyAuthorizedAgentByUuidAndGroupId(
					String uuid, long groupId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisApplicationCompanyAuthorizedAgentLocalService.
			getCannabisApplicationCompanyAuthorizedAgentByUuidAndGroupId(
				uuid, groupId);
	}

	/**
	 * Returns a range of all the cannabis application company authorized agents.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.CannabisApplicationCompanyAuthorizedAgentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application company authorized agents
	 * @param end the upper bound of the range of cannabis application company authorized agents (not inclusive)
	 * @return the range of cannabis application company authorized agents
	 */
	@Override
	public java.util.List
		<com.nbp.cannabis.application.form.services.model.
			CannabisApplicationCompanyAuthorizedAgent>
				getCannabisApplicationCompanyAuthorizedAgents(
					int start, int end) {

		return _cannabisApplicationCompanyAuthorizedAgentLocalService.
			getCannabisApplicationCompanyAuthorizedAgents(start, end);
	}

	/**
	 * Returns all the cannabis application company authorized agents matching the UUID and company.
	 *
	 * @param uuid the UUID of the cannabis application company authorized agents
	 * @param companyId the primary key of the company
	 * @return the matching cannabis application company authorized agents, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.cannabis.application.form.services.model.
			CannabisApplicationCompanyAuthorizedAgent>
				getCannabisApplicationCompanyAuthorizedAgentsByUuidAndCompanyId(
					String uuid, long companyId) {

		return _cannabisApplicationCompanyAuthorizedAgentLocalService.
			getCannabisApplicationCompanyAuthorizedAgentsByUuidAndCompanyId(
				uuid, companyId);
	}

	/**
	 * Returns a range of cannabis application company authorized agents matching the UUID and company.
	 *
	 * @param uuid the UUID of the cannabis application company authorized agents
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of cannabis application company authorized agents
	 * @param end the upper bound of the range of cannabis application company authorized agents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching cannabis application company authorized agents, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.cannabis.application.form.services.model.
			CannabisApplicationCompanyAuthorizedAgent>
				getCannabisApplicationCompanyAuthorizedAgentsByUuidAndCompanyId(
					String uuid, long companyId, int start, int end,
					com.liferay.portal.kernel.util.OrderByComparator
						<com.nbp.cannabis.application.form.services.model.
							CannabisApplicationCompanyAuthorizedAgent>
								orderByComparator) {

		return _cannabisApplicationCompanyAuthorizedAgentLocalService.
			getCannabisApplicationCompanyAuthorizedAgentsByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of cannabis application company authorized agents.
	 *
	 * @return the number of cannabis application company authorized agents
	 */
	@Override
	public int getCannabisApplicationCompanyAuthorizedAgentsCount() {
		return _cannabisApplicationCompanyAuthorizedAgentLocalService.
			getCannabisApplicationCompanyAuthorizedAgentsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _cannabisApplicationCompanyAuthorizedAgentLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _cannabisApplicationCompanyAuthorizedAgentLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _cannabisApplicationCompanyAuthorizedAgentLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisApplicationCompanyAuthorizedAgentLocalService.
			getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the cannabis application company authorized agent in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationCompanyAuthorizedAgentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisApplicationCompanyAuthorizedAgent the cannabis application company authorized agent
	 * @return the cannabis application company authorized agent that was updated
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisApplicationCompanyAuthorizedAgent
			updateCannabisApplicationCompanyAuthorizedAgent(
				com.nbp.cannabis.application.form.services.model.
					CannabisApplicationCompanyAuthorizedAgent
						cannabisApplicationCompanyAuthorizedAgent) {

		return _cannabisApplicationCompanyAuthorizedAgentLocalService.
			updateCannabisApplicationCompanyAuthorizedAgent(
				cannabisApplicationCompanyAuthorizedAgent);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _cannabisApplicationCompanyAuthorizedAgentLocalService.
			getBasePersistence();
	}

	@Override
	public CannabisApplicationCompanyAuthorizedAgentLocalService
		getWrappedService() {

		return _cannabisApplicationCompanyAuthorizedAgentLocalService;
	}

	@Override
	public void setWrappedService(
		CannabisApplicationCompanyAuthorizedAgentLocalService
			cannabisApplicationCompanyAuthorizedAgentLocalService) {

		_cannabisApplicationCompanyAuthorizedAgentLocalService =
			cannabisApplicationCompanyAuthorizedAgentLocalService;
	}

	private CannabisApplicationCompanyAuthorizedAgentLocalService
		_cannabisApplicationCompanyAuthorizedAgentLocalService;

}