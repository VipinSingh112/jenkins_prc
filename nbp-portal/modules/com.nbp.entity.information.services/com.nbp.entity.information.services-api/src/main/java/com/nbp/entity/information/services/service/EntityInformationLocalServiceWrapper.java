/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.entity.information.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link EntityInformationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see EntityInformationLocalService
 * @generated
 */
public class EntityInformationLocalServiceWrapper
	implements EntityInformationLocalService,
			   ServiceWrapper<EntityInformationLocalService> {

	public EntityInformationLocalServiceWrapper() {
		this(null);
	}

	public EntityInformationLocalServiceWrapper(
		EntityInformationLocalService entityInformationLocalService) {

		_entityInformationLocalService = entityInformationLocalService;
	}

	/**
	 * Adds the entity information to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EntityInformationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param entityInformation the entity information
	 * @return the entity information that was added
	 */
	@Override
	public com.nbp.entity.information.services.model.EntityInformation
		addEntityInformation(
			com.nbp.entity.information.services.model.EntityInformation
				entityInformation) {

		return _entityInformationLocalService.addEntityInformation(
			entityInformation);
	}

	/**
	 * Creates a new entity information with the primary key. Does not add the entity information to the database.
	 *
	 * @param entityInfoId the primary key for the new entity information
	 * @return the new entity information
	 */
	@Override
	public com.nbp.entity.information.services.model.EntityInformation
		createEntityInformation(long entityInfoId) {

		return _entityInformationLocalService.createEntityInformation(
			entityInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _entityInformationLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the entity information from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EntityInformationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param entityInformation the entity information
	 * @return the entity information that was removed
	 */
	@Override
	public com.nbp.entity.information.services.model.EntityInformation
		deleteEntityInformation(
			com.nbp.entity.information.services.model.EntityInformation
				entityInformation) {

		return _entityInformationLocalService.deleteEntityInformation(
			entityInformation);
	}

	/**
	 * Deletes the entity information with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EntityInformationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param entityInfoId the primary key of the entity information
	 * @return the entity information that was removed
	 * @throws PortalException if a entity information with the primary key could not be found
	 */
	@Override
	public com.nbp.entity.information.services.model.EntityInformation
			deleteEntityInformation(long entityInfoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _entityInformationLocalService.deleteEntityInformation(
			entityInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _entityInformationLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _entityInformationLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _entityInformationLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _entityInformationLocalService.dynamicQuery();
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

		return _entityInformationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.entity.information.services.model.impl.EntityInformationModelImpl</code>.
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

		return _entityInformationLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.entity.information.services.model.impl.EntityInformationModelImpl</code>.
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

		return _entityInformationLocalService.dynamicQuery(
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

		return _entityInformationLocalService.dynamicQueryCount(dynamicQuery);
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

		return _entityInformationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.entity.information.services.model.EntityInformation
		fetchEntityInformation(long entityInfoId) {

		return _entityInformationLocalService.fetchEntityInformation(
			entityInfoId);
	}

	/**
	 * Returns the entity information matching the UUID and group.
	 *
	 * @param uuid the entity information's UUID
	 * @param groupId the primary key of the group
	 * @return the matching entity information, or <code>null</code> if a matching entity information could not be found
	 */
	@Override
	public com.nbp.entity.information.services.model.EntityInformation
		fetchEntityInformationByUuidAndGroupId(String uuid, long groupId) {

		return _entityInformationLocalService.
			fetchEntityInformationByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _entityInformationLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the entity information with the primary key.
	 *
	 * @param entityInfoId the primary key of the entity information
	 * @return the entity information
	 * @throws PortalException if a entity information with the primary key could not be found
	 */
	@Override
	public com.nbp.entity.information.services.model.EntityInformation
			getEntityInformation(long entityInfoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _entityInformationLocalService.getEntityInformation(
			entityInfoId);
	}

	@Override
	public com.nbp.entity.information.services.model.EntityInformation
			getEntityInformationByEntityNumber(String entityNumber)
		throws com.nbp.entity.information.services.exception.
			NoSuchEntityInformationException {

		return _entityInformationLocalService.
			getEntityInformationByEntityNumber(entityNumber);
	}

	/**
	 * Returns the entity information matching the UUID and group.
	 *
	 * @param uuid the entity information's UUID
	 * @param groupId the primary key of the group
	 * @return the matching entity information
	 * @throws PortalException if a matching entity information could not be found
	 */
	@Override
	public com.nbp.entity.information.services.model.EntityInformation
			getEntityInformationByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _entityInformationLocalService.
			getEntityInformationByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the entity informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.entity.information.services.model.impl.EntityInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of entity informations
	 * @param end the upper bound of the range of entity informations (not inclusive)
	 * @return the range of entity informations
	 */
	@Override
	public java.util.List
		<com.nbp.entity.information.services.model.EntityInformation>
			getEntityInformations(int start, int end) {

		return _entityInformationLocalService.getEntityInformations(start, end);
	}

	/**
	 * Returns all the entity informations matching the UUID and company.
	 *
	 * @param uuid the UUID of the entity informations
	 * @param companyId the primary key of the company
	 * @return the matching entity informations, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.entity.information.services.model.EntityInformation>
			getEntityInformationsByUuidAndCompanyId(
				String uuid, long companyId) {

		return _entityInformationLocalService.
			getEntityInformationsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of entity informations matching the UUID and company.
	 *
	 * @param uuid the UUID of the entity informations
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of entity informations
	 * @param end the upper bound of the range of entity informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching entity informations, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.entity.information.services.model.EntityInformation>
			getEntityInformationsByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.nbp.entity.information.services.model.
						EntityInformation> orderByComparator) {

		return _entityInformationLocalService.
			getEntityInformationsByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of entity informations.
	 *
	 * @return the number of entity informations
	 */
	@Override
	public int getEntityInformationsCount() {
		return _entityInformationLocalService.getEntityInformationsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _entityInformationLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _entityInformationLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _entityInformationLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _entityInformationLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the entity information in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EntityInformationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param entityInformation the entity information
	 * @return the entity information that was updated
	 */
	@Override
	public com.nbp.entity.information.services.model.EntityInformation
		updateEntityInformation(
			com.nbp.entity.information.services.model.EntityInformation
				entityInformation) {

		return _entityInformationLocalService.updateEntityInformation(
			entityInformation);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _entityInformationLocalService.getBasePersistence();
	}

	@Override
	public EntityInformationLocalService getWrappedService() {
		return _entityInformationLocalService;
	}

	@Override
	public void setWrappedService(
		EntityInformationLocalService entityInformationLocalService) {

		_entityInformationLocalService = entityInformationLocalService;
	}

	private EntityInformationLocalService _entityInformationLocalService;

}