/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link QuarryApplicationMachinesAndEquipmentLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see QuarryApplicationMachinesAndEquipmentLocalService
 * @generated
 */
public class QuarryApplicationMachinesAndEquipmentLocalServiceWrapper
	implements QuarryApplicationMachinesAndEquipmentLocalService,
			   ServiceWrapper
				   <QuarryApplicationMachinesAndEquipmentLocalService> {

	public QuarryApplicationMachinesAndEquipmentLocalServiceWrapper() {
		this(null);
	}

	public QuarryApplicationMachinesAndEquipmentLocalServiceWrapper(
		QuarryApplicationMachinesAndEquipmentLocalService
			quarryApplicationMachinesAndEquipmentLocalService) {

		_quarryApplicationMachinesAndEquipmentLocalService =
			quarryApplicationMachinesAndEquipmentLocalService;
	}

	/**
	 * Adds the quarry application machines and equipment to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryApplicationMachinesAndEquipmentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryApplicationMachinesAndEquipment the quarry application machines and equipment
	 * @return the quarry application machines and equipment that was added
	 */
	@Override
	public com.nbp.quary.application.form.service.model.
		QuarryApplicationMachinesAndEquipment
			addQuarryApplicationMachinesAndEquipment(
				com.nbp.quary.application.form.service.model.
					QuarryApplicationMachinesAndEquipment
						quarryApplicationMachinesAndEquipment) {

		return _quarryApplicationMachinesAndEquipmentLocalService.
			addQuarryApplicationMachinesAndEquipment(
				quarryApplicationMachinesAndEquipment);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _quarryApplicationMachinesAndEquipmentLocalService.
			createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new quarry application machines and equipment with the primary key. Does not add the quarry application machines and equipment to the database.
	 *
	 * @param quarryApplicationMachinId the primary key for the new quarry application machines and equipment
	 * @return the new quarry application machines and equipment
	 */
	@Override
	public com.nbp.quary.application.form.service.model.
		QuarryApplicationMachinesAndEquipment
			createQuarryApplicationMachinesAndEquipment(
				long quarryApplicationMachinId) {

		return _quarryApplicationMachinesAndEquipmentLocalService.
			createQuarryApplicationMachinesAndEquipment(
				quarryApplicationMachinId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _quarryApplicationMachinesAndEquipmentLocalService.
			deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the quarry application machines and equipment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryApplicationMachinesAndEquipmentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryApplicationMachinId the primary key of the quarry application machines and equipment
	 * @return the quarry application machines and equipment that was removed
	 * @throws PortalException if a quarry application machines and equipment with the primary key could not be found
	 */
	@Override
	public com.nbp.quary.application.form.service.model.
		QuarryApplicationMachinesAndEquipment
				deleteQuarryApplicationMachinesAndEquipment(
					long quarryApplicationMachinId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _quarryApplicationMachinesAndEquipmentLocalService.
			deleteQuarryApplicationMachinesAndEquipment(
				quarryApplicationMachinId);
	}

	/**
	 * Deletes the quarry application machines and equipment from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryApplicationMachinesAndEquipmentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryApplicationMachinesAndEquipment the quarry application machines and equipment
	 * @return the quarry application machines and equipment that was removed
	 */
	@Override
	public com.nbp.quary.application.form.service.model.
		QuarryApplicationMachinesAndEquipment
			deleteQuarryApplicationMachinesAndEquipment(
				com.nbp.quary.application.form.service.model.
					QuarryApplicationMachinesAndEquipment
						quarryApplicationMachinesAndEquipment) {

		return _quarryApplicationMachinesAndEquipmentLocalService.
			deleteQuarryApplicationMachinesAndEquipment(
				quarryApplicationMachinesAndEquipment);
	}

	@Override
	public void deleteQuarryApplicationMachinesAndEquipment_List_By_Id(
		String quarryApplicationId) {

		_quarryApplicationMachinesAndEquipmentLocalService.
			deleteQuarryApplicationMachinesAndEquipment_List_By_Id(
				quarryApplicationId);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _quarryApplicationMachinesAndEquipmentLocalService.dslQuery(
			dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _quarryApplicationMachinesAndEquipmentLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _quarryApplicationMachinesAndEquipmentLocalService.
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

		return _quarryApplicationMachinesAndEquipmentLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quary.application.form.service.model.impl.QuarryApplicationMachinesAndEquipmentModelImpl</code>.
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

		return _quarryApplicationMachinesAndEquipmentLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quary.application.form.service.model.impl.QuarryApplicationMachinesAndEquipmentModelImpl</code>.
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

		return _quarryApplicationMachinesAndEquipmentLocalService.dynamicQuery(
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

		return _quarryApplicationMachinesAndEquipmentLocalService.
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

		return _quarryApplicationMachinesAndEquipmentLocalService.
			dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.nbp.quary.application.form.service.model.
		QuarryApplicationMachinesAndEquipment
			fetchQuarryApplicationMachinesAndEquipment(
				long quarryApplicationMachinId) {

		return _quarryApplicationMachinesAndEquipmentLocalService.
			fetchQuarryApplicationMachinesAndEquipment(
				quarryApplicationMachinId);
	}

	/**
	 * Returns the quarry application machines and equipment matching the UUID and group.
	 *
	 * @param uuid the quarry application machines and equipment's UUID
	 * @param groupId the primary key of the group
	 * @return the matching quarry application machines and equipment, or <code>null</code> if a matching quarry application machines and equipment could not be found
	 */
	@Override
	public com.nbp.quary.application.form.service.model.
		QuarryApplicationMachinesAndEquipment
			fetchQuarryApplicationMachinesAndEquipmentByUuidAndGroupId(
				String uuid, long groupId) {

		return _quarryApplicationMachinesAndEquipmentLocalService.
			fetchQuarryApplicationMachinesAndEquipmentByUuidAndGroupId(
				uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _quarryApplicationMachinesAndEquipmentLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _quarryApplicationMachinesAndEquipmentLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _quarryApplicationMachinesAndEquipmentLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _quarryApplicationMachinesAndEquipmentLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _quarryApplicationMachinesAndEquipmentLocalService.
			getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the quarry application machines and equipment with the primary key.
	 *
	 * @param quarryApplicationMachinId the primary key of the quarry application machines and equipment
	 * @return the quarry application machines and equipment
	 * @throws PortalException if a quarry application machines and equipment with the primary key could not be found
	 */
	@Override
	public com.nbp.quary.application.form.service.model.
		QuarryApplicationMachinesAndEquipment
				getQuarryApplicationMachinesAndEquipment(
					long quarryApplicationMachinId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _quarryApplicationMachinesAndEquipmentLocalService.
			getQuarryApplicationMachinesAndEquipment(quarryApplicationMachinId);
	}

	@Override
	public java.util.List
		<com.nbp.quary.application.form.service.model.
			QuarryApplicationMachinesAndEquipment>
				getQuarryApplicationMAchinesAndEquipment_List_By_Id(
					String quarryApplicationId) {

		return _quarryApplicationMachinesAndEquipmentLocalService.
			getQuarryApplicationMAchinesAndEquipment_List_By_Id(
				quarryApplicationId);
	}

	/**
	 * Returns the quarry application machines and equipment matching the UUID and group.
	 *
	 * @param uuid the quarry application machines and equipment's UUID
	 * @param groupId the primary key of the group
	 * @return the matching quarry application machines and equipment
	 * @throws PortalException if a matching quarry application machines and equipment could not be found
	 */
	@Override
	public com.nbp.quary.application.form.service.model.
		QuarryApplicationMachinesAndEquipment
				getQuarryApplicationMachinesAndEquipmentByUuidAndGroupId(
					String uuid, long groupId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _quarryApplicationMachinesAndEquipmentLocalService.
			getQuarryApplicationMachinesAndEquipmentByUuidAndGroupId(
				uuid, groupId);
	}

	/**
	 * Returns a range of all the quarry application machines and equipments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quary.application.form.service.model.impl.QuarryApplicationMachinesAndEquipmentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry application machines and equipments
	 * @param end the upper bound of the range of quarry application machines and equipments (not inclusive)
	 * @return the range of quarry application machines and equipments
	 */
	@Override
	public java.util.List
		<com.nbp.quary.application.form.service.model.
			QuarryApplicationMachinesAndEquipment>
				getQuarryApplicationMachinesAndEquipments(int start, int end) {

		return _quarryApplicationMachinesAndEquipmentLocalService.
			getQuarryApplicationMachinesAndEquipments(start, end);
	}

	/**
	 * Returns all the quarry application machines and equipments matching the UUID and company.
	 *
	 * @param uuid the UUID of the quarry application machines and equipments
	 * @param companyId the primary key of the company
	 * @return the matching quarry application machines and equipments, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.quary.application.form.service.model.
			QuarryApplicationMachinesAndEquipment>
				getQuarryApplicationMachinesAndEquipmentsByUuidAndCompanyId(
					String uuid, long companyId) {

		return _quarryApplicationMachinesAndEquipmentLocalService.
			getQuarryApplicationMachinesAndEquipmentsByUuidAndCompanyId(
				uuid, companyId);
	}

	/**
	 * Returns a range of quarry application machines and equipments matching the UUID and company.
	 *
	 * @param uuid the UUID of the quarry application machines and equipments
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of quarry application machines and equipments
	 * @param end the upper bound of the range of quarry application machines and equipments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching quarry application machines and equipments, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.quary.application.form.service.model.
			QuarryApplicationMachinesAndEquipment>
				getQuarryApplicationMachinesAndEquipmentsByUuidAndCompanyId(
					String uuid, long companyId, int start, int end,
					com.liferay.portal.kernel.util.OrderByComparator
						<com.nbp.quary.application.form.service.model.
							QuarryApplicationMachinesAndEquipment>
								orderByComparator) {

		return _quarryApplicationMachinesAndEquipmentLocalService.
			getQuarryApplicationMachinesAndEquipmentsByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of quarry application machines and equipments.
	 *
	 * @return the number of quarry application machines and equipments
	 */
	@Override
	public int getQuarryApplicationMachinesAndEquipmentsCount() {
		return _quarryApplicationMachinesAndEquipmentLocalService.
			getQuarryApplicationMachinesAndEquipmentsCount();
	}

	/**
	 * Updates the quarry application machines and equipment in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryApplicationMachinesAndEquipmentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryApplicationMachinesAndEquipment the quarry application machines and equipment
	 * @return the quarry application machines and equipment that was updated
	 */
	@Override
	public com.nbp.quary.application.form.service.model.
		QuarryApplicationMachinesAndEquipment
			updateQuarryApplicationMachinesAndEquipment(
				com.nbp.quary.application.form.service.model.
					QuarryApplicationMachinesAndEquipment
						quarryApplicationMachinesAndEquipment) {

		return _quarryApplicationMachinesAndEquipmentLocalService.
			updateQuarryApplicationMachinesAndEquipment(
				quarryApplicationMachinesAndEquipment);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _quarryApplicationMachinesAndEquipmentLocalService.
			getBasePersistence();
	}

	@Override
	public QuarryApplicationMachinesAndEquipmentLocalService
		getWrappedService() {

		return _quarryApplicationMachinesAndEquipmentLocalService;
	}

	@Override
	public void setWrappedService(
		QuarryApplicationMachinesAndEquipmentLocalService
			quarryApplicationMachinesAndEquipmentLocalService) {

		_quarryApplicationMachinesAndEquipmentLocalService =
			quarryApplicationMachinesAndEquipmentLocalService;
	}

	private QuarryApplicationMachinesAndEquipmentLocalService
		_quarryApplicationMachinesAndEquipmentLocalService;

}