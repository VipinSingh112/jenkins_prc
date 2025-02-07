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

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.quary.application.form.service.model.MaterialInformationMachinesAndEquipent;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for MaterialInformationMachinesAndEquipent. This utility wraps
 * <code>com.nbp.quary.application.form.service.service.impl.MaterialInformationMachinesAndEquipentLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see MaterialInformationMachinesAndEquipentLocalService
 * @generated
 */
public class MaterialInformationMachinesAndEquipentLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.quary.application.form.service.service.impl.MaterialInformationMachinesAndEquipentLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

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
	public static MaterialInformationMachinesAndEquipent
		addMaterialInformationMachinesAndEquipent(
			MaterialInformationMachinesAndEquipent
				materialInformationMachinesAndEquipent) {

		return getService().addMaterialInformationMachinesAndEquipent(
			materialInformationMachinesAndEquipent);
	}

	/**
	 * Creates a new material information machines and equipent with the primary key. Does not add the material information machines and equipent to the database.
	 *
	 * @param miMachineId the primary key for the new material information machines and equipent
	 * @return the new material information machines and equipent
	 */
	public static MaterialInformationMachinesAndEquipent
		createMaterialInformationMachinesAndEquipent(long miMachineId) {

		return getService().createMaterialInformationMachinesAndEquipent(
			miMachineId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
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
	public static MaterialInformationMachinesAndEquipent
			deleteMaterialInformationMachinesAndEquipent(long miMachineId)
		throws PortalException {

		return getService().deleteMaterialInformationMachinesAndEquipent(
			miMachineId);
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
	public static MaterialInformationMachinesAndEquipent
		deleteMaterialInformationMachinesAndEquipent(
			MaterialInformationMachinesAndEquipent
				materialInformationMachinesAndEquipent) {

		return getService().deleteMaterialInformationMachinesAndEquipent(
			materialInformationMachinesAndEquipent);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static <T> T dslQuery(DSLQuery dslQuery) {
		return getService().dslQuery(dslQuery);
	}

	public static int dslQueryCount(DSLQuery dslQuery) {
		return getService().dslQueryCount(dslQuery);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
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
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static MaterialInformationMachinesAndEquipent
		fetchMaterialInformationMachinesAndEquipent(long miMachineId) {

		return getService().fetchMaterialInformationMachinesAndEquipent(
			miMachineId);
	}

	/**
	 * Returns the material information machines and equipent matching the UUID and group.
	 *
	 * @param uuid the material information machines and equipent's UUID
	 * @param groupId the primary key of the group
	 * @return the matching material information machines and equipent, or <code>null</code> if a matching material information machines and equipent could not be found
	 */
	public static MaterialInformationMachinesAndEquipent
		fetchMaterialInformationMachinesAndEquipentByUuidAndGroupId(
			String uuid, long groupId) {

		return getService().
			fetchMaterialInformationMachinesAndEquipentByUuidAndGroupId(
				uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the material information machines and equipent with the primary key.
	 *
	 * @param miMachineId the primary key of the material information machines and equipent
	 * @return the material information machines and equipent
	 * @throws PortalException if a material information machines and equipent with the primary key could not be found
	 */
	public static MaterialInformationMachinesAndEquipent
			getMaterialInformationMachinesAndEquipent(long miMachineId)
		throws PortalException {

		return getService().getMaterialInformationMachinesAndEquipent(
			miMachineId);
	}

	/**
	 * Returns the material information machines and equipent matching the UUID and group.
	 *
	 * @param uuid the material information machines and equipent's UUID
	 * @param groupId the primary key of the group
	 * @return the matching material information machines and equipent
	 * @throws PortalException if a matching material information machines and equipent could not be found
	 */
	public static MaterialInformationMachinesAndEquipent
			getMaterialInformationMachinesAndEquipentByUuidAndGroupId(
				String uuid, long groupId)
		throws PortalException {

		return getService().
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
	public static List<MaterialInformationMachinesAndEquipent>
		getMaterialInformationMachinesAndEquipents(int start, int end) {

		return getService().getMaterialInformationMachinesAndEquipents(
			start, end);
	}

	/**
	 * Returns all the material information machines and equipents matching the UUID and company.
	 *
	 * @param uuid the UUID of the material information machines and equipents
	 * @param companyId the primary key of the company
	 * @return the matching material information machines and equipents, or an empty list if no matches were found
	 */
	public static List<MaterialInformationMachinesAndEquipent>
		getMaterialInformationMachinesAndEquipentsByUuidAndCompanyId(
			String uuid, long companyId) {

		return getService().
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
	public static List<MaterialInformationMachinesAndEquipent>
		getMaterialInformationMachinesAndEquipentsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<MaterialInformationMachinesAndEquipent>
				orderByComparator) {

		return getService().
			getMaterialInformationMachinesAndEquipentsByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of material information machines and equipents.
	 *
	 * @return the number of material information machines and equipents
	 */
	public static int getMaterialInformationMachinesAndEquipentsCount() {
		return getService().getMaterialInformationMachinesAndEquipentsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
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
	public static MaterialInformationMachinesAndEquipent
		updateMaterialInformationMachinesAndEquipent(
			MaterialInformationMachinesAndEquipent
				materialInformationMachinesAndEquipent) {

		return getService().updateMaterialInformationMachinesAndEquipent(
			materialInformationMachinesAndEquipent);
	}

	public static MaterialInformationMachinesAndEquipentLocalService
		getService() {

		return _service;
	}

	private static volatile MaterialInformationMachinesAndEquipentLocalService
		_service;

}