/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.quary.application.form.service.model.QuarryApplicationMachinesAndEquipment;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for QuarryApplicationMachinesAndEquipment. This utility wraps
 * <code>com.nbp.quary.application.form.service.service.impl.QuarryApplicationMachinesAndEquipmentLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see QuarryApplicationMachinesAndEquipmentLocalService
 * @generated
 */
public class QuarryApplicationMachinesAndEquipmentLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.quary.application.form.service.service.impl.QuarryApplicationMachinesAndEquipmentLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

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
	public static QuarryApplicationMachinesAndEquipment
		addQuarryApplicationMachinesAndEquipment(
			QuarryApplicationMachinesAndEquipment
				quarryApplicationMachinesAndEquipment) {

		return getService().addQuarryApplicationMachinesAndEquipment(
			quarryApplicationMachinesAndEquipment);
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
	 * Creates a new quarry application machines and equipment with the primary key. Does not add the quarry application machines and equipment to the database.
	 *
	 * @param quarryApplicationMachinId the primary key for the new quarry application machines and equipment
	 * @return the new quarry application machines and equipment
	 */
	public static QuarryApplicationMachinesAndEquipment
		createQuarryApplicationMachinesAndEquipment(
			long quarryApplicationMachinId) {

		return getService().createQuarryApplicationMachinesAndEquipment(
			quarryApplicationMachinId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
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
	public static QuarryApplicationMachinesAndEquipment
			deleteQuarryApplicationMachinesAndEquipment(
				long quarryApplicationMachinId)
		throws PortalException {

		return getService().deleteQuarryApplicationMachinesAndEquipment(
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
	public static QuarryApplicationMachinesAndEquipment
		deleteQuarryApplicationMachinesAndEquipment(
			QuarryApplicationMachinesAndEquipment
				quarryApplicationMachinesAndEquipment) {

		return getService().deleteQuarryApplicationMachinesAndEquipment(
			quarryApplicationMachinesAndEquipment);
	}

	public static void deleteQuarryApplicationMachinesAndEquipment_List_By_Id(
		String quarryApplicationId) {

		getService().deleteQuarryApplicationMachinesAndEquipment_List_By_Id(
			quarryApplicationId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quary.application.form.service.model.impl.QuarryApplicationMachinesAndEquipmentModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quary.application.form.service.model.impl.QuarryApplicationMachinesAndEquipmentModelImpl</code>.
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

	public static QuarryApplicationMachinesAndEquipment
		fetchQuarryApplicationMachinesAndEquipment(
			long quarryApplicationMachinId) {

		return getService().fetchQuarryApplicationMachinesAndEquipment(
			quarryApplicationMachinId);
	}

	/**
	 * Returns the quarry application machines and equipment matching the UUID and group.
	 *
	 * @param uuid the quarry application machines and equipment's UUID
	 * @param groupId the primary key of the group
	 * @return the matching quarry application machines and equipment, or <code>null</code> if a matching quarry application machines and equipment could not be found
	 */
	public static QuarryApplicationMachinesAndEquipment
		fetchQuarryApplicationMachinesAndEquipmentByUuidAndGroupId(
			String uuid, long groupId) {

		return getService().
			fetchQuarryApplicationMachinesAndEquipmentByUuidAndGroupId(
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
	 * Returns the quarry application machines and equipment with the primary key.
	 *
	 * @param quarryApplicationMachinId the primary key of the quarry application machines and equipment
	 * @return the quarry application machines and equipment
	 * @throws PortalException if a quarry application machines and equipment with the primary key could not be found
	 */
	public static QuarryApplicationMachinesAndEquipment
			getQuarryApplicationMachinesAndEquipment(
				long quarryApplicationMachinId)
		throws PortalException {

		return getService().getQuarryApplicationMachinesAndEquipment(
			quarryApplicationMachinId);
	}

	public static List<QuarryApplicationMachinesAndEquipment>
		getQuarryApplicationMAchinesAndEquipment_List_By_Id(
			String quarryApplicationId) {

		return getService().getQuarryApplicationMAchinesAndEquipment_List_By_Id(
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
	public static QuarryApplicationMachinesAndEquipment
			getQuarryApplicationMachinesAndEquipmentByUuidAndGroupId(
				String uuid, long groupId)
		throws PortalException {

		return getService().
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
	public static List<QuarryApplicationMachinesAndEquipment>
		getQuarryApplicationMachinesAndEquipments(int start, int end) {

		return getService().getQuarryApplicationMachinesAndEquipments(
			start, end);
	}

	/**
	 * Returns all the quarry application machines and equipments matching the UUID and company.
	 *
	 * @param uuid the UUID of the quarry application machines and equipments
	 * @param companyId the primary key of the company
	 * @return the matching quarry application machines and equipments, or an empty list if no matches were found
	 */
	public static List<QuarryApplicationMachinesAndEquipment>
		getQuarryApplicationMachinesAndEquipmentsByUuidAndCompanyId(
			String uuid, long companyId) {

		return getService().
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
	public static List<QuarryApplicationMachinesAndEquipment>
		getQuarryApplicationMachinesAndEquipmentsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<QuarryApplicationMachinesAndEquipment>
				orderByComparator) {

		return getService().
			getQuarryApplicationMachinesAndEquipmentsByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of quarry application machines and equipments.
	 *
	 * @return the number of quarry application machines and equipments
	 */
	public static int getQuarryApplicationMachinesAndEquipmentsCount() {
		return getService().getQuarryApplicationMachinesAndEquipmentsCount();
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
	public static QuarryApplicationMachinesAndEquipment
		updateQuarryApplicationMachinesAndEquipment(
			QuarryApplicationMachinesAndEquipment
				quarryApplicationMachinesAndEquipment) {

		return getService().updateQuarryApplicationMachinesAndEquipment(
			quarryApplicationMachinesAndEquipment);
	}

	public static QuarryApplicationMachinesAndEquipmentLocalService
		getService() {

		return _serviceSnapshot.get();
	}

	private static final Snapshot
		<QuarryApplicationMachinesAndEquipmentLocalService> _serviceSnapshot =
			new Snapshot<>(
				QuarryApplicationMachinesAndEquipmentLocalServiceUtil.class,
				QuarryApplicationMachinesAndEquipmentLocalService.class);

}