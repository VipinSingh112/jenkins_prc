/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.nbp.quary.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MaterialInformationMachinesAndEquipentLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see MaterialInformationMachinesAndEquipentLocalService
 * @generated
 */
public class MaterialInformationMachinesAndEquipentLocalServiceWrapper
	implements MaterialInformationMachinesAndEquipentLocalService,
			   ServiceWrapper
				   <MaterialInformationMachinesAndEquipentLocalService> {

	public MaterialInformationMachinesAndEquipentLocalServiceWrapper() {
		this(null);
	}

	public MaterialInformationMachinesAndEquipentLocalServiceWrapper(
		MaterialInformationMachinesAndEquipentLocalService
			materialInformationMachinesAndEquipentLocalService) {

		_materialInformationMachinesAndEquipentLocalService =
			materialInformationMachinesAndEquipentLocalService;
	}

	/**
	 * Adds the material information machines and equipent to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MaterialInformationMachinesAndEquipentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param materialInformationMachinesAndEquipent the material information machines and equipent
	 * @return the material information machines and equipent that was added
	 */
	@Override
	public com.nbp.quary.application.form.service.model.
		MaterialInformationMachinesAndEquipent
			addMaterialInformationMachinesAndEquipent(
				com.nbp.quary.application.form.service.model.
					MaterialInformationMachinesAndEquipent
						materialInformationMachinesAndEquipent) {

		return _materialInformationMachinesAndEquipentLocalService.
			addMaterialInformationMachinesAndEquipent(
				materialInformationMachinesAndEquipent);
	}

	/**
	 * Creates a new material information machines and equipent with the primary key. Does not add the material information machines and equipent to the database.
	 *
	 * @param miMachineId the primary key for the new material information machines and equipent
	 * @return the new material information machines and equipent
	 */
	@Override
	public com.nbp.quary.application.form.service.model.
		MaterialInformationMachinesAndEquipent
			createMaterialInformationMachinesAndEquipent(long miMachineId) {

		return _materialInformationMachinesAndEquipentLocalService.
			createMaterialInformationMachinesAndEquipent(miMachineId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _materialInformationMachinesAndEquipentLocalService.
			createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the material information machines and equipent with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MaterialInformationMachinesAndEquipentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miMachineId the primary key of the material information machines and equipent
	 * @return the material information machines and equipent that was removed
	 * @throws PortalException if a material information machines and equipent with the primary key could not be found
	 */
	@Override
	public com.nbp.quary.application.form.service.model.
		MaterialInformationMachinesAndEquipent
				deleteMaterialInformationMachinesAndEquipent(long miMachineId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _materialInformationMachinesAndEquipentLocalService.
			deleteMaterialInformationMachinesAndEquipent(miMachineId);
	}

	/**
	 * Deletes the material information machines and equipent from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MaterialInformationMachinesAndEquipentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param materialInformationMachinesAndEquipent the material information machines and equipent
	 * @return the material information machines and equipent that was removed
	 */
	@Override
	public com.nbp.quary.application.form.service.model.
		MaterialInformationMachinesAndEquipent
			deleteMaterialInformationMachinesAndEquipent(
				com.nbp.quary.application.form.service.model.
					MaterialInformationMachinesAndEquipent
						materialInformationMachinesAndEquipent) {

		return _materialInformationMachinesAndEquipentLocalService.
			deleteMaterialInformationMachinesAndEquipent(
				materialInformationMachinesAndEquipent);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _materialInformationMachinesAndEquipentLocalService.
			deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _materialInformationMachinesAndEquipentLocalService.dslQuery(
			dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _materialInformationMachinesAndEquipentLocalService.
			dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _materialInformationMachinesAndEquipentLocalService.
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

		return _materialInformationMachinesAndEquipentLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quary.application.form.service.model.impl.MaterialInformationMachinesAndEquipentModelImpl</code>.
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

		return _materialInformationMachinesAndEquipentLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quary.application.form.service.model.impl.MaterialInformationMachinesAndEquipentModelImpl</code>.
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

		return _materialInformationMachinesAndEquipentLocalService.dynamicQuery(
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

		return _materialInformationMachinesAndEquipentLocalService.
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

		return _materialInformationMachinesAndEquipentLocalService.
			dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.nbp.quary.application.form.service.model.
		MaterialInformationMachinesAndEquipent
			fetchMaterialInformationMachinesAndEquipent(long miMachineId) {

		return _materialInformationMachinesAndEquipentLocalService.
			fetchMaterialInformationMachinesAndEquipent(miMachineId);
	}

	/**
	 * Returns the material information machines and equipent matching the UUID and group.
	 *
	 * @param uuid the material information machines and equipent's UUID
	 * @param groupId the primary key of the group
	 * @return the matching material information machines and equipent, or <code>null</code> if a matching material information machines and equipent could not be found
	 */
	@Override
	public com.nbp.quary.application.form.service.model.
		MaterialInformationMachinesAndEquipent
			fetchMaterialInformationMachinesAndEquipentByUuidAndGroupId(
				String uuid, long groupId) {

		return _materialInformationMachinesAndEquipentLocalService.
			fetchMaterialInformationMachinesAndEquipentByUuidAndGroupId(
				uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _materialInformationMachinesAndEquipentLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _materialInformationMachinesAndEquipentLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _materialInformationMachinesAndEquipentLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the material information machines and equipent with the primary key.
	 *
	 * @param miMachineId the primary key of the material information machines and equipent
	 * @return the material information machines and equipent
	 * @throws PortalException if a material information machines and equipent with the primary key could not be found
	 */
	@Override
	public com.nbp.quary.application.form.service.model.
		MaterialInformationMachinesAndEquipent
				getMaterialInformationMachinesAndEquipent(long miMachineId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _materialInformationMachinesAndEquipentLocalService.
			getMaterialInformationMachinesAndEquipent(miMachineId);
	}

	/**
	 * Returns the material information machines and equipent matching the UUID and group.
	 *
	 * @param uuid the material information machines and equipent's UUID
	 * @param groupId the primary key of the group
	 * @return the matching material information machines and equipent
	 * @throws PortalException if a matching material information machines and equipent could not be found
	 */
	@Override
	public com.nbp.quary.application.form.service.model.
		MaterialInformationMachinesAndEquipent
				getMaterialInformationMachinesAndEquipentByUuidAndGroupId(
					String uuid, long groupId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _materialInformationMachinesAndEquipentLocalService.
			getMaterialInformationMachinesAndEquipentByUuidAndGroupId(
				uuid, groupId);
	}

	/**
	 * Returns a range of all the material information machines and equipents.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quary.application.form.service.model.impl.MaterialInformationMachinesAndEquipentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of material information machines and equipents
	 * @param end the upper bound of the range of material information machines and equipents (not inclusive)
	 * @return the range of material information machines and equipents
	 */
	@Override
	public java.util.List
		<com.nbp.quary.application.form.service.model.
			MaterialInformationMachinesAndEquipent>
				getMaterialInformationMachinesAndEquipents(int start, int end) {

		return _materialInformationMachinesAndEquipentLocalService.
			getMaterialInformationMachinesAndEquipents(start, end);
	}

	/**
	 * Returns all the material information machines and equipents matching the UUID and company.
	 *
	 * @param uuid the UUID of the material information machines and equipents
	 * @param companyId the primary key of the company
	 * @return the matching material information machines and equipents, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.quary.application.form.service.model.
			MaterialInformationMachinesAndEquipent>
				getMaterialInformationMachinesAndEquipentsByUuidAndCompanyId(
					String uuid, long companyId) {

		return _materialInformationMachinesAndEquipentLocalService.
			getMaterialInformationMachinesAndEquipentsByUuidAndCompanyId(
				uuid, companyId);
	}

	/**
	 * Returns a range of material information machines and equipents matching the UUID and company.
	 *
	 * @param uuid the UUID of the material information machines and equipents
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of material information machines and equipents
	 * @param end the upper bound of the range of material information machines and equipents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching material information machines and equipents, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.quary.application.form.service.model.
			MaterialInformationMachinesAndEquipent>
				getMaterialInformationMachinesAndEquipentsByUuidAndCompanyId(
					String uuid, long companyId, int start, int end,
					com.liferay.portal.kernel.util.OrderByComparator
						<com.nbp.quary.application.form.service.model.
							MaterialInformationMachinesAndEquipent>
								orderByComparator) {

		return _materialInformationMachinesAndEquipentLocalService.
			getMaterialInformationMachinesAndEquipentsByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of material information machines and equipents.
	 *
	 * @return the number of material information machines and equipents
	 */
	@Override
	public int getMaterialInformationMachinesAndEquipentsCount() {
		return _materialInformationMachinesAndEquipentLocalService.
			getMaterialInformationMachinesAndEquipentsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _materialInformationMachinesAndEquipentLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _materialInformationMachinesAndEquipentLocalService.
			getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the material information machines and equipent in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MaterialInformationMachinesAndEquipentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param materialInformationMachinesAndEquipent the material information machines and equipent
	 * @return the material information machines and equipent that was updated
	 */
	@Override
	public com.nbp.quary.application.form.service.model.
		MaterialInformationMachinesAndEquipent
			updateMaterialInformationMachinesAndEquipent(
				com.nbp.quary.application.form.service.model.
					MaterialInformationMachinesAndEquipent
						materialInformationMachinesAndEquipent) {

		return _materialInformationMachinesAndEquipentLocalService.
			updateMaterialInformationMachinesAndEquipent(
				materialInformationMachinesAndEquipent);
	}

	@Override
	public MaterialInformationMachinesAndEquipentLocalService
		getWrappedService() {

		return _materialInformationMachinesAndEquipentLocalService;
	}

	@Override
	public void setWrappedService(
		MaterialInformationMachinesAndEquipentLocalService
			materialInformationMachinesAndEquipentLocalService) {

		_materialInformationMachinesAndEquipentLocalService =
			materialInformationMachinesAndEquipentLocalService;
	}

	private MaterialInformationMachinesAndEquipentLocalService
		_materialInformationMachinesAndEquipentLocalService;

}